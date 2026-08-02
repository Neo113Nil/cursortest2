package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.fluttercandies.photo_manager.core.utils.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final class hpf implements b {
    public static final hpf b = new hpf();
    public static final String[] c = {"longitude", "latitude"};
    public static final ReentrantLock d = new ReentrantLock();

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final d93 A(Context context, String str) {
        b.a.getClass();
        Cursor u = super.u(context.getContentResolver(), super.g(), (String[]) a.I(a.n0(a.n0(a.m0(v2v.c, v2v.b), c), v2v.d)).toArray(new String[0]), "_id = ?", new String[]{str}, null);
        try {
            Cursor cursor = u;
            d93 d2 = cursor.moveToNext() ? nub1.d(context, 12, cursor, true) : null;
            u.close();
            return d2;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final androidx.exifinterface.media.a B(Context context, String str) {
        d93 A = A(context, str);
        if (A == null) {
            return null;
        }
        String str2 = A.b;
        if (new File(str2).exists()) {
            return new androidx.exifinterface.media.a(str2);
        }
        return null;
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final d93 D(Context context, String str, String str2) {
        Pair H = H(context, str);
        if (H == null) {
            E("Cannot get gallery id of ".concat(str));
            throw null;
        }
        String str3 = (String) H.getFirst();
        gpf G = G(context, str2);
        if (G == null) {
            E("Cannot get target gallery info");
            throw null;
        }
        if (str2.equals(str3)) {
            E("No move required, because the target gallery is the same as the current one.");
            throw null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor u = super.u(contentResolver, super.g(), new String[]{"_data"}, "_id = ?", new String[]{str}, null);
        if (!u.moveToNext()) {
            E("Cannot find " + str + " path");
            throw null;
        }
        String string = u.getString(0);
        u.close();
        String p = g8e.p(G.a, "/", new File(string).getName());
        new File(string).renameTo(new File(p));
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", p);
        contentValues.put("bucket_id", str2);
        contentValues.put("bucket_display_name", G.c);
        if (contentResolver.update(super.g(), contentValues, "_id = ?", new String[]{str}) > 0) {
            d93 A = A(context, str);
            if (A != null) {
                return A;
            }
            super.l(str);
            throw null;
        }
        E("Cannot update " + str + " relativePath");
        throw null;
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final void E(String str) {
        throw new RuntimeException(str);
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final ArrayList F(Context context, String str, int i, int i2, int i3, b5r b5rVar) {
        boolean z = str.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            arrayList2.add(str);
        }
        String b2 = b5rVar != null ? b5rVar.b(i3, arrayList2, true) : " AND ".concat(ela1.f(i3));
        Cursor u = super.u(context.getContentResolver(), super.g(), s(), g8e.p(z ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", b2), (String[]) arrayList2.toArray(new String[0]), super.d(i, i2 - i, b5rVar));
        try {
            Cursor cursor = u;
            while (cursor.moveToNext()) {
                d93 d2 = nub1.d(context, 10, cursor, false);
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            u.close();
            return arrayList;
        } finally {
        }
    }

    public final gpf G(Context context, String str) {
        String absolutePath;
        Cursor u = super.u(context.getContentResolver(), super.g(), new String[]{"bucket_id", "bucket_display_name", "_data"}, "bucket_id = ?", new String[]{str}, null);
        try {
            Cursor cursor = u;
            if (!cursor.moveToNext()) {
                u.close();
                return null;
            }
            int columnIndex = cursor.getColumnIndex("_data");
            String string = columnIndex == -1 ? null : cursor.getString(columnIndex);
            if (string == null) {
                u.close();
                return null;
            }
            int columnIndex2 = cursor.getColumnIndex("bucket_display_name");
            String string2 = columnIndex2 == -1 ? null : cursor.getString(columnIndex2);
            if (string2 == null) {
                u.close();
                return null;
            }
            File parentFile = new File(string).getParentFile();
            if (parentFile != null && (absolutePath = parentFile.getAbsolutePath()) != null) {
                gpf gpfVar = new gpf(absolutePath, str, string2);
                u.close();
                return gpfVar;
            }
            u.close();
            return null;
        } finally {
        }
    }

    public final Pair H(Context context, String str) {
        Cursor u = super.u(context.getContentResolver(), super.g(), new String[]{"bucket_id", "_data"}, "_id = ?", new String[]{str}, null);
        try {
            Cursor cursor = u;
            if (!cursor.moveToNext()) {
                u.close();
                return null;
            }
            Pair pair = new Pair(cursor.getString(0), new File(cursor.getString(1)).getParent());
            u.close();
            return pair;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final boolean a(Context context) {
        hpf hpfVar = b;
        ReentrantLock reentrantLock = d;
        if (reentrantLock.isLocked()) {
            return false;
        }
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            Cursor u = super.u(contentResolver, super.g(), new String[]{ClidProvider._ID, "_data"}, null, null, null);
            try {
                Cursor cursor = u;
                while (cursor.moveToNext()) {
                    String c2 = nub1.c(cursor, ClidProvider._ID);
                    String c3 = nub1.c(cursor, "_data");
                    if (!new File(c3).exists()) {
                        arrayList.add(c2);
                        Log.i("PhotoManagerPlugin", "The " + c3 + " was not exists. ");
                    }
                }
                Log.i("PhotoManagerPlugin", "will be delete ids = " + arrayList);
                u.close();
                String X = a.X(arrayList, ",", null, null, new a5f(20), 30);
                int delete = contentResolver.delete(super.g(), "_id in ( " + X + " )", (String[]) arrayList.toArray(new String[0]));
                StringBuilder sb = new StringBuilder();
                sb.append("Delete rows: ");
                sb.append(delete);
                Log.i("PhotoManagerPlugin", sb.toString());
                reentrantLock.unlock();
                return true;
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final ArrayList b(Context context, String str, int i, int i2, int i3, b5r b5rVar) {
        boolean z = str.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            arrayList2.add(str);
        }
        String b2 = b5rVar != null ? b5rVar.b(i3, arrayList2, true) : " AND ".concat(ela1.f(i3));
        Cursor u = super.u(context.getContentResolver(), super.g(), s(), g8e.p(z ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", b2), (String[]) arrayList2.toArray(new String[0]), super.d(i * i2, i2, b5rVar));
        try {
            Cursor cursor = u;
            while (cursor.moveToNext()) {
                d93 d2 = nub1.d(context, 10, cursor, false);
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            u.close();
            return arrayList;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final d93 f(Context context, String str, String str2) {
        Uri uri;
        Pair H = H(context, str);
        if (H == null) {
            E("Cannot get gallery id of ".concat(str));
            throw null;
        }
        if (str2.equals((String) H.getFirst())) {
            E("No copy required, because the target gallery is the same as the current one.");
            throw null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        d93 A = A(context, str);
        if (A == null) {
            E("Failed to find the asset ".concat(str));
            throw null;
        }
        ArrayList c2 = scc.c("_display_name", "title", "date_added", "date_modified", "duration", "longitude", "latitude", "width", "height");
        int i = A.g;
        int i2 = i != 1 ? i != 2 ? i != 3 ? 0 : 2 : 3 : 1;
        if (i2 != 2) {
            c2.add(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        }
        int i3 = i2;
        Cursor u = super.u(contentResolver, super.g(), (String[]) f73.t(c2.toArray(new String[0]), new String[]{"_data"}), "_id = ?", new String[]{str}, null);
        if (!u.moveToNext()) {
            super.l(str);
            throw null;
        }
        if (i3 == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i3 == 2) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else if (i3 != 3) {
            b.a.getClass();
            uri = MediaStore.Files.getContentUri("external");
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        gpf G = G(context, str2);
        if (G == null) {
            E("Cannot find gallery info");
            throw null;
        }
        String p = g8e.p(G.a, "/", A.h);
        ContentValues contentValues = new ContentValues();
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            contentValues.put(str3, nub1.c(u, str3));
        }
        contentValues.put("media_type", Integer.valueOf(i3));
        contentValues.put("_data", p);
        Uri insert = contentResolver.insert(uri, contentValues);
        if (insert == null) {
            E("Cannot insert new asset.");
            throw null;
        }
        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
        if (openOutputStream == null) {
            E("Cannot open output stream for " + insert + Extension.DOT_CHAR);
            throw null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(A.b));
        try {
            try {
                rzo.l(fileInputStream, openOutputStream);
                openOutputStream.close();
                fileInputStream.close();
                u.close();
                String lastPathSegment = insert.getLastPathSegment();
                if (lastPathSegment != null) {
                    d93 A2 = A(context, lastPathSegment);
                    if (A2 != null) {
                        return A2;
                    }
                    super.l(str);
                    throw null;
                }
                E("Cannot open output stream for " + insert + Extension.DOT_CHAR);
                throw null;
            } finally {
            }
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final void h(Context context) {
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final void l(Object obj) {
        super.l(obj);
        throw null;
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final ArrayList m(Context context, int i, b5r b5rVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String concat = "bucket_id IS NOT NULL ".concat(b5rVar != null ? b5rVar.b(i, arrayList2, true) : " AND ".concat(ela1.f(i))).concat(") GROUP BY (bucket_id");
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = super.g();
        b.a.getClass();
        Cursor u = super.u(contentResolver, g, (String[]) f73.t(v2v.e, new String[]{"count(1)"}), concat, (String[]) arrayList2.toArray(new String[0]), null);
        try {
            Cursor cursor = u;
            while (cursor.moveToNext()) {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                h93 h93Var = new h93(string, false, string2, cursor.getInt(2), 0, 48);
                if (b5rVar != null && b5rVar.a()) {
                    super.c(context, h93Var);
                }
                arrayList.add(h93Var);
            }
            u.close();
            return arrayList;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final String n(Context context, String str) {
        if (str.equals("isAll")) {
            return null;
        }
        Cursor u = super.u(context.getContentResolver(), super.g(), new String[]{"_data"}, "bucket_id = ?", new String[]{str}, null);
        try {
            Cursor cursor = u;
            if (!cursor.moveToNext()) {
                u.close();
                return null;
            }
            int columnIndex = cursor.getColumnIndex("_data");
            String string = columnIndex == -1 ? null : cursor.getString(columnIndex);
            String parent = string != null ? new File(string).getParent() : null;
            u.close();
            return parent;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final h93 q(int i, b5r b5rVar, Context context, String str) {
        String str2;
        h93 h93Var;
        ArrayList arrayList = new ArrayList();
        String b2 = b5rVar != null ? b5rVar.b(i, arrayList, true) : " AND ".concat(ela1.f(i));
        if (str.equals("")) {
            str2 = "";
        } else {
            arrayList.add(str);
            str2 = "AND bucket_id = ?";
        }
        String o = unr0.o("bucket_id IS NOT NULL ".concat(b2), " ", str2, ") GROUP BY (bucket_id");
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = super.g();
        b.a.getClass();
        Cursor u = super.u(contentResolver, g, (String[]) f73.t(v2v.e, new String[]{"count(1)"}), o, (String[]) arrayList.toArray(new String[0]), null);
        try {
            Cursor cursor = u;
            if (cursor.moveToNext()) {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                h93Var = new h93(string, false, string2 == null ? "" : string2, cursor.getInt(2), 0, 48);
            } else {
                h93Var = null;
            }
            u.close();
            return h93Var;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final String r(int i, long j, Context context) {
        return t(false, i, j).toString();
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final String[] s() {
        b.a.getClass();
        return (String[]) a.I(a.n0(a.n0(a.m0(v2v.c, v2v.b), v2v.d), c)).toArray(new String[0]);
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final Uri t(boolean z, int i, long j) {
        return super.t(false, i, j);
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final ArrayList x(Context context, int i, b5r b5rVar) {
        ArrayList arrayList = new ArrayList();
        b.a.getClass();
        String[] strArr = (String[]) f73.t(v2v.e, new String[]{"count(1)"});
        ArrayList arrayList2 = new ArrayList();
        Cursor u = super.u(context.getContentResolver(), super.g(), strArr, "bucket_id IS NOT NULL ".concat(b5rVar != null ? b5rVar.b(i, arrayList2, true) : " AND ".concat(ela1.f(i))), (String[]) arrayList2.toArray(new String[0]), null);
        try {
            Cursor cursor = u;
            if (cursor.moveToNext()) {
                arrayList.add(new h93("isAll", true, "Recent", cursor.getInt(j73.H(strArr, "count(1)")), i, 32));
            }
            u.close();
            return arrayList;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final byte[] y(Context context, d93 d93Var, boolean z) {
        return g3r.c(new File(d93Var.b));
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final String z(Context context, String str, boolean z) {
        d93 A = A(context, str);
        if (A != null) {
            return A.b;
        }
        super.l(str);
        throw null;
    }
}
