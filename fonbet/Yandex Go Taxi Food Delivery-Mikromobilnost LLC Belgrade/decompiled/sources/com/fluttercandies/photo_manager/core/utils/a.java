package com.fluttercandies.photo_manager.core.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import defpackage.b5r;
import defpackage.cvu0;
import defpackage.d93;
import defpackage.ela1;
import defpackage.f22;
import defpackage.f73;
import defpackage.g8e;
import defpackage.h93;
import defpackage.j73;
import defpackage.jbp0;
import defpackage.nub1;
import defpackage.rzo;
import defpackage.scc;
import defpackage.v2v;
import defpackage.wfz;
import defpackage.x4e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final class a implements b {
    public static final a b = new a();
    public static final jbp0 c = new jbp0();
    public static final boolean d;
    public static final boolean e;
    public static final ReentrantLock f;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        d = i == 29 && !Environment.isExternalStorageLegacy();
        if (i == 29 && Environment.isExternalStorageLegacy()) {
            z = true;
        }
        e = z;
        f = new ReentrantLock();
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final d93 A(Context context, String str) {
        Cursor u = super.u(context.getContentResolver(), super.g(), s(), "_id = ?", new String[]{str}, null);
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
        try {
            d93 A = A(context, str);
            if (A != null) {
                InputStream openInputStream = context.getContentResolver().openInputStream(MediaStore.setRequireOriginal(super.t(false, A.g, A.a)));
                if (openInputStream != null) {
                    return new androidx.exifinterface.media.a(openInputStream);
                }
            }
            return null;
        } catch (Exception e2) {
            wfz.h(e2);
            return null;
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final d93 D(Context context, String str, String str2) {
        Pair G = G(context, str);
        if (G == null) {
            E("Cannot get gallery id of ".concat(str));
            throw null;
        }
        if (str2.equals((String) G.getFirst())) {
            E("No move required, because the target gallery is the same as the current one.");
            throw null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String n = n(context, str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", n);
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
        a aVar;
        String c2;
        d93 d2;
        boolean z = str.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            arrayList2.add(str);
        }
        String p = g8e.p(z ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", b5rVar != null ? b5rVar.b(i3, arrayList2, true) : " AND ".concat(ela1.f(i3)));
        int i4 = i2 - i;
        boolean z2 = e;
        if (z2) {
            aVar = this;
            c2 = super.d(i, i4, b5rVar);
        } else {
            aVar = this;
            c2 = b5rVar != null ? b5rVar.c() : null;
        }
        Cursor u = super.u(context.getContentResolver(), super.g(), aVar.s(), p, (String[]) arrayList2.toArray(new String[0]), c2);
        try {
            Cursor cursor = u;
            if (!z2) {
                cursor.moveToPosition(i - 1);
            }
            for (int i5 = 0; i5 < i4; i5++) {
                if (cursor.moveToNext() && (d2 = nub1.d(context, 10, cursor, false)) != null) {
                    arrayList.add(d2);
                }
            }
            u.close();
            return arrayList;
        } finally {
        }
    }

    public final Pair G(Context context, String str) {
        Cursor u = super.u(context.getContentResolver(), super.g(), new String[]{"bucket_id", "relative_path"}, "_id = ?", new String[]{str}, null);
        Cursor cursor = u;
        try {
            Cursor cursor2 = cursor;
            if (!u.moveToNext()) {
                cursor.close();
                return null;
            }
            Pair pair = new Pair(u.getString(0), new File(u.getString(1)).getParent());
            cursor.close();
            return pair;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final boolean a(Context context) {
        String str;
        String str2;
        int i;
        String str3 = "_data";
        String str4 = "media_type";
        a aVar = b;
        ReentrantLock reentrantLock = f;
        if (reentrantLock.isLocked()) {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is running.");
            return false;
        }
        reentrantLock.lock();
        try {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is starting.");
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            Uri g = super.g();
            String[] strArr = {ClidProvider._ID, "media_type", "_data"};
            boolean z = true;
            Integer[] numArr = {2, 3, 1};
            ArrayList arrayList2 = new ArrayList(3);
            int i2 = 0;
            for (int i3 = 3; i2 < i3; i3 = 3) {
                arrayList2.add(String.valueOf(numArr[i2].intValue()));
                i2++;
            }
            Cursor u = super.u(contentResolver, g, strArr, "media_type in ( ?,?,? )", (String[]) arrayList2.toArray(new String[0]), null);
            try {
                Cursor cursor = u;
                int i4 = 0;
                while (cursor.moveToNext()) {
                    String c2 = nub1.c(cursor, ClidProvider._ID);
                    int a = nub1.a(cursor, str4);
                    int columnIndex = cursor.getColumnIndex(str3);
                    String string = columnIndex == -1 ? null : cursor.getString(columnIndex);
                    if (a == z) {
                        str = str3;
                        str2 = str4;
                        i = 1;
                    } else if (a != 2) {
                        str = str3;
                        str2 = str4;
                        i = a != 3 ? 0 : 2;
                    } else {
                        str = str3;
                        str2 = str4;
                        i = 3;
                    }
                    try {
                        InputStream openInputStream = contentResolver.openInputStream(super.t(false, i, Long.parseLong(c2)));
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                    } catch (Exception unused) {
                        arrayList.add(c2);
                        Log.i("PhotoManagerPlugin", "The " + c2 + Extension.FIX_SPACE + string + " media was not exists. ");
                    }
                    i4++;
                    if (i4 % 300 == 0) {
                        Log.i("PhotoManagerPlugin", "Current checked count == " + i4);
                    }
                    z = true;
                    str3 = str;
                    str4 = str2;
                }
                boolean z2 = z;
                Log.i("PhotoManagerPlugin", "The removeAllExistsAssets was stopped, will be delete ids = " + arrayList);
                u.close();
                String X = kotlin.collections.a.X(arrayList, ",", null, null, new f22(12), 30);
                int delete = contentResolver.delete(super.g(), "_id in ( " + X + " )", (String[]) arrayList.toArray(new String[0]));
                StringBuilder sb = new StringBuilder();
                sb.append("Delete rows: ");
                sb.append(delete);
                Log.i("PhotoManagerPlugin", sb.toString());
                reentrantLock.unlock();
                return z2;
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final ArrayList b(Context context, String str, int i, int i2, int i3, b5r b5rVar) {
        a aVar;
        String c2;
        d93 d2;
        boolean z = str.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            arrayList2.add(str);
        }
        String p = g8e.p(z ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", b5rVar != null ? b5rVar.b(i3, arrayList2, true) : " AND ".concat(ela1.f(i3)));
        int i4 = i * i2;
        boolean z2 = e;
        if (z2) {
            aVar = this;
            c2 = super.d(i4, i2, b5rVar);
        } else {
            aVar = this;
            c2 = b5rVar != null ? b5rVar.c() : null;
        }
        Cursor u = super.u(context.getContentResolver(), super.g(), aVar.s(), p, (String[]) arrayList2.toArray(new String[0]), c2);
        try {
            Cursor cursor = u;
            if (!z2) {
                cursor.moveToPosition(i4 - 1);
            }
            for (int i5 = 0; i5 < i2; i5++) {
                if (cursor.moveToNext() && (d2 = nub1.d(context, 10, cursor, false)) != null) {
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
        Pair G = G(context, str);
        if (G == null) {
            E("Cannot get gallery id of ".concat(str));
            throw null;
        }
        if (str2.equals((String) G.getFirst())) {
            E("No copy required, because the target gallery is the same as the current one.");
            throw null;
        }
        d93 A = A(context, str);
        if (A == null) {
            super.l(str);
            throw null;
        }
        int i = A.g;
        ArrayList c2 = scc.c("_display_name", "title", "date_added", "date_modified", "datetaken", "duration", "width", "height", "orientation");
        int i2 = i != 1 ? i != 2 ? i != 3 ? 0 : 2 : 3 : 1;
        if (i2 == 3) {
            c2.add(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        }
        ContentResolver contentResolver = context.getContentResolver();
        int i3 = i2;
        Cursor u = super.u(contentResolver, super.g(), (String[]) f73.t(c2.toArray(new String[0]), new String[]{"relative_path"}), "_id = ?", new String[]{str}, null);
        if (!u.moveToNext()) {
            E("Cannot find asset.");
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
        String n = n(context, str2);
        ContentValues contentValues = new ContentValues();
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            contentValues.put(str3, nub1.c(u, str3));
        }
        contentValues.put("media_type", Integer.valueOf(i3));
        contentValues.put("relative_path", n);
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
        Uri t = super.t(true, i, A.a);
        InputStream openInputStream = contentResolver.openInputStream(t);
        try {
            if (openInputStream == null) {
                E("Cannot open input stream for " + t);
                throw null;
            }
            try {
                rzo.l(openInputStream, openOutputStream);
                openOutputStream.close();
                openInputStream.close();
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
        File[] listFiles;
        c.getClass();
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || (listFiles = cacheDir.listFiles()) == null) {
            return;
        }
        Iterator it = ((ArrayList) j73.A(listFiles)).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (cvu0.x(file.getName(), "pm_", false)) {
                file.delete();
            }
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final void l(Object obj) {
        super.l(obj);
        throw null;
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final ArrayList m(Context context, int i, b5r b5rVar) {
        int i2;
        String concat;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (b5rVar != null) {
            i2 = i;
            concat = b5rVar.b(i2, arrayList2, true);
        } else {
            i2 = i;
            concat = " AND ".concat(ela1.f(i2));
        }
        String concat2 = "bucket_id IS NOT NULL ".concat(concat);
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = super.g();
        b.a.getClass();
        Cursor u = super.u(contentResolver, g, v2v.e, concat2, (String[]) arrayList2.toArray(new String[0]), b5rVar != null ? b5rVar.c() : null);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Cursor cursor = u;
        try {
            Cursor cursor2 = cursor;
            wfz.m(cursor2);
            while (cursor2.moveToNext()) {
                String c2 = nub1.c(cursor2, "bucket_id");
                if (hashMap.containsKey(c2)) {
                    hashMap2.put(c2, Integer.valueOf(((Number) hashMap2.get(c2)).intValue() + 1));
                } else {
                    hashMap.put(c2, nub1.c(cursor2, "bucket_display_name"));
                    hashMap2.put(c2, 1);
                }
            }
            cursor.close();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                h93 h93Var = new h93(str, false, (String) entry.getValue(), ((Number) hashMap2.get(str)).intValue(), i2, 32);
                if (b5rVar != null && b5rVar.a()) {
                    super.c(context, h93Var);
                }
                arrayList.add(h93Var);
                i2 = i;
            }
            return arrayList;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final String n(Context context, String str) {
        if (str.equals("isAll")) {
            return null;
        }
        Cursor u = super.u(context.getContentResolver(), super.g(), new String[]{"bucket_id", "relative_path"}, "bucket_id = ?", new String[]{str}, null);
        Cursor cursor = u;
        try {
            Cursor cursor2 = cursor;
            if (!u.moveToNext()) {
                cursor.close();
                return null;
            }
            String string = u.getString(1);
            cursor.close();
            return string;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final h93 q(int i, b5r b5rVar, Context context, String str) {
        String str2;
        String str3 = "";
        boolean equals = str.equals(str3);
        ArrayList arrayList = new ArrayList();
        String b2 = b5rVar != null ? b5rVar.b(i, arrayList, true) : " AND ".concat(ela1.f(i));
        if (equals) {
            str2 = str3;
        } else {
            arrayList.add(str);
            str2 = "AND bucket_id = ?";
        }
        String p = g8e.p("bucket_id IS NOT NULL ".concat(b2), " ", str2);
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = super.g();
        b.a.getClass();
        Cursor u = super.u(contentResolver, g, v2v.e, p, (String[]) arrayList.toArray(new String[0]), null);
        try {
            Cursor cursor = u;
            if (!cursor.moveToNext()) {
                u.close();
                return null;
            }
            String string = cursor.getString(1);
            if (string != null) {
                str3 = string;
            }
            int count = cursor.getCount();
            u.close();
            return new h93(str, equals, str3, count, i, 32);
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
        return (String[]) kotlin.collections.a.I(kotlin.collections.a.n0(kotlin.collections.a.n0(kotlin.collections.a.m0(v2v.c, v2v.b), v2v.d), new String[]{"relative_path"})).toArray(new String[0]);
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final ArrayList x(Context context, int i, b5r b5rVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String concat = "bucket_id IS NOT NULL ".concat(b5rVar != null ? b5rVar.b(i, arrayList2, true) : " AND ".concat(ela1.f(i)));
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = super.g();
        b.a.getClass();
        Cursor u = super.u(contentResolver, g, v2v.e, concat, (String[]) arrayList2.toArray(new String[0]), b5rVar != null ? b5rVar.c() : null);
        try {
            arrayList.add(new h93("isAll", true, "Recent", u.getCount(), i, 32));
            u.close();
            return arrayList;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final byte[] y(Context context, d93 d93Var, boolean z) {
        long j = d93Var.a;
        InputStream openInputStream = context.getContentResolver().openInputStream(super.t(z, d93Var.g, j));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (openInputStream != null) {
                try {
                    byteArrayOutputStream.write(rzo.R(openInputStream));
                    openInputStream.close();
                } finally {
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            wfz.l("The asset " + j + " origin byte length : " + byteArray.length);
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    @Override // com.fluttercandies.photo_manager.core.utils.b
    public final String z(Context context, String str, boolean z) {
        d93 A = A(context, str);
        if (A == null) {
            super.l(str);
            throw null;
        }
        if (!d) {
            return A.b;
        }
        c.getClass();
        long j = A.a;
        String str2 = z ? "_o" : "";
        String str3 = A.h;
        StringBuilder k = x4e.k("pm_", j, str2, "_");
        k.append(str3);
        File file = new File(context.getCacheDir(), k.toString());
        if (!file.exists()) {
            ContentResolver contentResolver = context.getContentResolver();
            int i = A.g;
            a aVar = b;
            Uri t = super.t(z, i, j);
            if (t.equals(Uri.EMPTY)) {
                super.l(Long.valueOf(j));
                throw null;
            }
            try {
                wfz.l("Caching " + j + " [origin: " + z + "] into " + file.getAbsolutePath());
                InputStream openInputStream = contentResolver.openInputStream(t);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    if (openInputStream != null) {
                        try {
                            rzo.l(openInputStream, fileOutputStream);
                            openInputStream.close();
                        } finally {
                        }
                    }
                    fileOutputStream.close();
                } finally {
                }
            } catch (Exception e2) {
                wfz.f(e2, "Caching " + j + " [origin: " + z + "] error");
                throw e2;
            }
        }
        return file.getAbsolutePath();
    }
}
