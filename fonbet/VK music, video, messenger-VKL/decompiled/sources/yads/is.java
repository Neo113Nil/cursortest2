package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import xsna.go9;

/* loaded from: classes10.dex */
public final class is implements ks {
    public static final String[] e = {"id", "key", "metadata"};
    public final w30 a;
    public final SparseArray b = new SparseArray();
    public String c;
    public String d;

    public is(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // yads.ks
    public final boolean a() {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        String str = this.c;
        str.getClass();
        return ue3.a(readableDatabase, 1, str) != -1;
    }

    @Override // yads.ks
    public final void b() {
        w30 w30Var = this.a;
        String str = this.c;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = w30Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = ue3.a;
                try {
                    if (mc3.a(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e2) {
                    throw new v30(e2);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e3) {
            throw new v30(e3);
        }
    }

    @Override // yads.ks
    public final void a(long j) {
        String hexString = Long.toHexString(j);
        this.c = hexString;
        this.d = go9.b("ExoPlayerCacheIndex", hexString);
    }

    @Override // yads.ks
    public final void a(HashMap hashMap, SparseArray sparseArray) {
        if (this.b.size() == 0) {
            try {
                SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                String str = this.c;
                str.getClass();
                if (ue3.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        String str2 = this.c;
                        str2.getClass();
                        ue3.a(writableDatabase, 1, str2, 1);
                        String str3 = this.d;
                        str3.getClass();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str3));
                        writableDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = this.a.getReadableDatabase();
                String str4 = this.d;
                str4.getClass();
                Cursor query = readableDatabase2.query(str4, e, null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        int i = query.getInt(0);
                        String string = query.getString(1);
                        string.getClass();
                        hashMap.put(string, new hs(i, string, ls.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                        sparseArray.put(i, string);
                    } finally {
                    }
                }
                query.close();
                return;
            } catch (SQLiteException e2) {
                hashMap.clear();
                sparseArray.clear();
                throw new v30(e2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // yads.ks
    public final void b(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                String str = this.c;
                str.getClass();
                ue3.a(writableDatabase, 1, str, 1);
                String str2 = this.d;
                str2.getClass();
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                for (hs hsVar : hashMap.values()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    jc0 jc0Var = hsVar.e;
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    Set<Map.Entry> entrySet = jc0Var.b.entrySet();
                    dataOutputStream.writeInt(entrySet.size());
                    for (Map.Entry entry : entrySet) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        byte[] bArr = (byte[]) entry.getValue();
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", Integer.valueOf(hsVar.a));
                    contentValues.put("key", hsVar.b);
                    contentValues.put("metadata", byteArray);
                    String str3 = this.d;
                    str3.getClass();
                    writableDatabase.replaceOrThrow(str3, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                this.b.clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new v30(e2);
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z) {
        if (z) {
            this.b.delete(hsVar.a);
        } else {
            this.b.put(hsVar.a, null);
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.b.put(hsVar.a, hsVar);
    }

    @Override // yads.ks
    public final void a(HashMap hashMap) {
        if (this.b.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.b.size(); i++) {
                try {
                    hs hsVar = (hs) this.b.valueAt(i);
                    if (hsVar == null) {
                        int keyAt = this.b.keyAt(i);
                        String str = this.d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        jc0 jc0Var = hsVar.e;
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry> entrySet = jc0Var.b.entrySet();
                        dataOutputStream.writeInt(entrySet.size());
                        for (Map.Entry entry : entrySet) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            byte[] bArr = (byte[]) entry.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(hsVar.a));
                        contentValues.put("key", hsVar.b);
                        contentValues.put("metadata", byteArray);
                        String str2 = this.d;
                        str2.getClass();
                        writableDatabase.replaceOrThrow(str2, null, contentValues);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.b.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e2) {
            throw new v30(e2);
        }
    }
}
