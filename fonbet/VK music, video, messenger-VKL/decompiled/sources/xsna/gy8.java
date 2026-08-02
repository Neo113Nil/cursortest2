package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.database.DatabaseIOException;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import xsna.q04;

/* compiled from: CachedContentIndex.java */
/* loaded from: classes.dex */
public final class gy8 {
    public final HashMap<String, fy8> a;
    public final SparseArray<String> b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public final c e;

    @Nullable
    public c f;

    /* compiled from: CachedContentIndex.java */
    public static final class a implements c {
        public static final String[] e = {"id", "key", "metadata"};
        public final swk a;
        public final SparseArray<fy8> b = new SparseArray<>();
        public String c;
        public String d;

        public a(swk swkVar) {
            this.a = swkVar;
        }

        public static void i(swk swkVar, String str) throws DatabaseIOException {
            try {
                String str2 = "ExoPlayerCacheIndex" + str;
                SQLiteDatabase writableDatabase = swkVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    bor0.b(writableDatabase, 1, str);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // xsna.gy8.c
        public final void a(HashMap<String, fy8> hashMap, SparseArray<String> sparseArray) throws IOException {
            swk swkVar = this.a;
            fxc0.z(this.b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = swkVar.getReadableDatabase();
                String str = this.c;
                str.getClass();
                if (bor0.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = swkVar.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        j(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = swkVar.getReadableDatabase();
                String str2 = this.d;
                str2.getClass();
                Cursor query = readableDatabase2.query(str2, e, null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        int i = query.getInt(0);
                        String string = query.getString(1);
                        string.getClass();
                        hashMap.put(string, new fy8(i, string, gy8.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                        sparseArray.put(i, string);
                    } finally {
                    }
                }
                query.close();
            } catch (SQLiteException e2) {
                hashMap.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e2);
            }
        }

        @Override // xsna.gy8.c
        public final void b(long j) {
            String hexString = Long.toHexString(j);
            this.c = hexString;
            this.d = go9.b("ExoPlayerCacheIndex", hexString);
        }

        @Override // xsna.gy8.c
        public final void c(HashMap<String, fy8> hashMap) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    Iterator<fy8> it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        h(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // xsna.gy8.c
        public final void d(fy8 fy8Var, boolean z) {
            int i = fy8Var.a;
            SparseArray<fy8> sparseArray = this.b;
            if (z) {
                sparseArray.delete(i);
            } else {
                sparseArray.put(i, null);
            }
        }

        @Override // xsna.gy8.c
        public final void delete() throws DatabaseIOException {
            String str = this.c;
            str.getClass();
            i(this.a, str);
        }

        @Override // xsna.gy8.c
        public final boolean e() throws DatabaseIOException {
            try {
                SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                String str = this.c;
                str.getClass();
                return bor0.a(readableDatabase, 1, str) != -1;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // xsna.gy8.c
        public final void f(HashMap<String, fy8> hashMap) throws IOException {
            SparseArray<fy8> sparseArray = this.b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        fy8 valueAt = sparseArray.valueAt(i);
                        if (valueAt == null) {
                            int keyAt = sparseArray.keyAt(i);
                            String str = this.d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                        } else {
                            h(writableDatabase, valueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // xsna.gy8.c
        public final void g(fy8 fy8Var) {
            this.b.put(fy8Var.a, fy8Var);
        }

        public final void h(SQLiteDatabase sQLiteDatabase, fy8 fy8Var) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gy8.b(fy8Var.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(fy8Var.a));
            contentValues.put("key", fy8Var.b);
            contentValues.put("metadata", byteArray);
            String str = this.d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void j(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            String str = this.c;
            str.getClass();
            bor0.c(sQLiteDatabase, 1, str, 1);
            String str2 = this.d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    /* compiled from: CachedContentIndex.java */
    public interface c {
        void a(HashMap<String, fy8> hashMap, SparseArray<String> sparseArray) throws IOException;

        void b(long j);

        void c(HashMap<String, fy8> hashMap) throws IOException;

        void d(fy8 fy8Var, boolean z);

        void delete() throws IOException;

        boolean e() throws IOException;

        void f(HashMap<String, fy8> hashMap) throws IOException;

        void g(fy8 fy8Var);
    }

    public gy8(@Nullable swk swkVar, @Nullable File file, boolean z) {
        fxc0.z((swkVar == null && file == null) ? false : true);
        this.a = new HashMap<>();
        this.b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        a aVar = swkVar != null ? new a(swkVar) : null;
        b bVar = file != null ? new b(new File(file, CachedContentIndex.FILE_NAME)) : null;
        if (aVar != null && (bVar == null || !z)) {
            this.e = aVar;
            this.f = bVar;
        } else {
            String str = y2r0.a;
            this.e = bVar;
            this.f = aVar;
        }
    }

    public static adl a(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException(lhg.a(readInt2, "Invalid value size: "));
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = y2r0.b;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, 10485760);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new adl(hashMap);
    }

    public static void b(adl adlVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> d = adlVar.d();
        dataOutputStream.writeInt(d.size());
        for (Map.Entry<String, byte[]> entry : d) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Nullable
    public final fy8 c(String str) {
        return this.a.get(str);
    }

    public final fy8 d(String str) {
        HashMap<String, fy8> hashMap = this.a;
        fy8 fy8Var = hashMap.get(str);
        if (fy8Var != null) {
            return fy8Var;
        }
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        fy8 fy8Var2 = new fy8(keyAt, str);
        hashMap.put(str, fy8Var2);
        sparseArray.put(keyAt, str);
        this.d.put(keyAt, true);
        this.e.g(fy8Var2);
        return fy8Var2;
    }

    public final void e(long j) throws IOException {
        c cVar;
        c cVar2 = this.e;
        cVar2.b(j);
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.b(j);
        }
        boolean e = cVar2.e();
        SparseArray<String> sparseArray = this.b;
        HashMap<String, fy8> hashMap = this.a;
        if (e || (cVar = this.f) == null || !cVar.e()) {
            cVar2.a(hashMap, sparseArray);
        } else {
            this.f.a(hashMap, sparseArray);
            cVar2.c(hashMap);
        }
        c cVar4 = this.f;
        if (cVar4 != null) {
            cVar4.delete();
            this.f = null;
        }
    }

    public final void f(String str) {
        HashMap<String, fy8> hashMap = this.a;
        fy8 fy8Var = hashMap.get(str);
        if (fy8Var != null && fy8Var.g() && fy8Var.i()) {
            hashMap.remove(str);
            int i = fy8Var.a;
            SparseBooleanArray sparseBooleanArray = this.d;
            boolean z = sparseBooleanArray.get(i);
            this.e.d(fy8Var, z);
            SparseArray<String> sparseArray = this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public final void g() throws IOException {
        this.e.f(this.a);
        SparseBooleanArray sparseBooleanArray = this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.d.clear();
    }

    /* compiled from: CachedContentIndex.java */
    public static class b implements c {

        @Nullable
        public final Cipher a = null;

        @Nullable
        public final SecretKeySpec b = null;
        public final q04 c;
        public boolean d;

        @Nullable
        public pfg0 e;

        public b(File file) {
            this.c = new q04(file);
        }

        public static int h(fy8 fy8Var, int i) {
            int hashCode = fy8Var.b.hashCode() + (fy8Var.a * 31);
            if (i < 2) {
                long b = cij.b(fy8Var.d());
                return (hashCode * 31) + ((int) (b ^ (b >>> 32)));
            }
            return fy8Var.d().hashCode() + (hashCode * 31);
        }

        public static fy8 i(int i, DataInputStream dataInputStream) throws IOException {
            adl a;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                dij dijVar = new dij();
                dij.d(dijVar, readLong);
                a = adl.c.c(dijVar);
            } else {
                a = gy8.a(dataInputStream);
            }
            return new fy8(readInt, readUTF, a);
        }

        @Override // xsna.gy8.c
        public final void a(HashMap<String, fy8> hashMap, SparseArray<String> sparseArray) {
            fxc0.z(!this.d);
            q04 q04Var = this.c;
            File file = q04Var.a;
            File file2 = q04Var.a;
            File file3 = q04Var.b;
            if (file.exists() || file3.exists()) {
                DataInputStream dataInputStream = null;
                try {
                    if (file3.exists()) {
                        file2.delete();
                        file3.renameTo(file2);
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int readInt = dataInputStream2.readInt();
                        if (readInt >= 0 && readInt <= 2) {
                            if ((dataInputStream2.readInt() & 1) != 0) {
                                Cipher cipher = this.a;
                                if (cipher != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        SecretKeySpec secretKeySpec = this.b;
                                        String str = y2r0.a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    } catch (InvalidAlgorithmParameterException e) {
                                        e = e;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e2) {
                                        e = e2;
                                        throw new IllegalStateException(e);
                                    }
                                }
                            }
                            int readInt2 = dataInputStream2.readInt();
                            int i = 0;
                            for (int i2 = 0; i2 < readInt2; i2++) {
                                fy8 i3 = i(readInt, dataInputStream2);
                                String str2 = i3.b;
                                hashMap.put(str2, i3);
                                sparseArray.put(i3.a, str2);
                                i += h(i3, readInt);
                            }
                            int readInt3 = dataInputStream2.readInt();
                            boolean z = dataInputStream2.read() == -1;
                            if (readInt3 == i && z) {
                                y2r0.h(dataInputStream2);
                                return;
                            }
                        }
                        y2r0.h(dataInputStream2);
                    } catch (IOException unused) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            y2r0.h(dataInputStream);
                        }
                        hashMap.clear();
                        sparseArray.clear();
                        file2.delete();
                        file3.delete();
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            y2r0.h(dataInputStream);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                hashMap.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            }
        }

        @Override // xsna.gy8.c
        public final void c(HashMap<String, fy8> hashMap) throws IOException {
            DataOutputStream dataOutputStream;
            q04 q04Var = this.c;
            DataOutputStream dataOutputStream2 = null;
            try {
                q04.a a = q04Var.a();
                pfg0 pfg0Var = this.e;
                if (pfg0Var == null) {
                    this.e = new pfg0(a);
                } else {
                    pfg0Var.b(a);
                }
                dataOutputStream = new DataOutputStream(this.e);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(hashMap.size());
                int i = 0;
                for (fy8 fy8Var : hashMap.values()) {
                    dataOutputStream.writeInt(fy8Var.a);
                    dataOutputStream.writeUTF(fy8Var.b);
                    gy8.b(fy8Var.d(), dataOutputStream);
                    i += h(fy8Var, 2);
                }
                dataOutputStream.writeInt(i);
                dataOutputStream.close();
                q04Var.b.delete();
                String str = y2r0.a;
                this.d = false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                y2r0.h(dataOutputStream2);
                throw th;
            }
        }

        @Override // xsna.gy8.c
        public final void d(fy8 fy8Var, boolean z) {
            this.d = true;
        }

        @Override // xsna.gy8.c
        public final void delete() {
            q04 q04Var = this.c;
            q04Var.a.delete();
            q04Var.b.delete();
        }

        @Override // xsna.gy8.c
        public final boolean e() {
            q04 q04Var = this.c;
            return q04Var.a.exists() || q04Var.b.exists();
        }

        @Override // xsna.gy8.c
        public final void f(HashMap<String, fy8> hashMap) throws IOException {
            if (this.d) {
                c(hashMap);
            }
        }

        @Override // xsna.gy8.c
        public final void g(fy8 fy8Var) {
            this.d = true;
        }

        @Override // xsna.gy8.c
        public final void b(long j) {
        }
    }
}
