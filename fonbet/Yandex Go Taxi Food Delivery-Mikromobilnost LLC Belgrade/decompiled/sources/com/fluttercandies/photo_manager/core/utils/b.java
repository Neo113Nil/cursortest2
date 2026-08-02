package com.fluttercandies.photo_manager.core.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import defpackage.b5r;
import defpackage.cvu0;
import defpackage.d93;
import defpackage.ela1;
import defpackage.evu0;
import defpackage.h93;
import defpackage.j73;
import defpackage.jiu;
import defpackage.no31;
import defpackage.nub1;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.po31;
import defpackage.qv10;
import defpackage.rzo;
import defpackage.tls;
import defpackage.v2v;
import defpackage.w511;
import defpackage.wfz;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public interface b {
    public static final v2v a = v2v.a;

    static void v(Uri uri, String[] strArr, String str, String[] strArr2, String str2, tls tlsVar, Cursor cursor) {
        String str3;
        if (wfz.c) {
            StringBuilder sb = new StringBuilder();
            sb.append("uri: " + uri);
            sb.append('\n');
            sb.append("projection: " + (strArr != null ? j73.L(strArr, Extension.FIX_SPACE, null, null, 62) : null));
            sb.append('\n');
            sb.append("selection: " + str);
            sb.append('\n');
            sb.append("selectionArgs: " + (strArr2 != null ? j73.L(strArr2, Extension.FIX_SPACE, null, null, 62) : null));
            sb.append('\n');
            sb.append("sortOrder: " + str2);
            sb.append('\n');
            if (str != null) {
                String v = cvu0.v(str, "?", "%s", false);
                Object[] objArr = strArr2;
                if (strArr2 == null) {
                    objArr = new Object[0];
                }
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(v, Arrays.copyOf(copyOf, copyOf.length));
            } else {
                str3 = null;
            }
            sb.append("sql: " + str3);
            sb.append('\n');
            sb.append("cursor count: " + (cursor != null ? Integer.valueOf(cursor.getCount()) : null));
            sb.append('\n');
            tlsVar.invoke(sb.toString());
        }
    }

    d93 A(Context context, String str);

    androidx.exifinterface.media.a B(Context context, String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v11, types: [T, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.io.FileInputStream] */
    default d93 C(Context context, String str, String str2, String str3, String str4, Integer num, Double d, Double d2, Long l) {
        po31 po31Var;
        int n;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        File file2 = new File(str);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new FileInputStream(file2);
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str2);
        if (guessContentTypeFromName == null && (guessContentTypeFromName = URLConnection.guessContentTypeFromName(str)) == null) {
            T t = ref$ObjectRef.element;
            guessContentTypeFromName = URLConnection.guessContentTypeFromStream((InputStream) t);
            ref$ObjectRef.element = new FileInputStream(file2);
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "video/*";
            }
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(str);
        mediaPlayer.setOnErrorListener(new no31());
        try {
            mediaPlayer.prepare();
            mediaPlayer.getVideoHeight();
            po31Var = new po31(Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight()), Integer.valueOf(mediaPlayer.getDuration()));
            mediaPlayer.stop();
            mediaPlayer.release();
        } catch (Throwable unused) {
            mediaPlayer.release();
            po31Var = new po31(null, null, null);
        }
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a((InputStream) ref$ObjectRef.element);
        v2v v2vVar = a;
        if (num != null) {
            n = num.intValue();
        } else {
            v2vVar.getClass();
            n = aVar.n();
        }
        Integer valueOf = Integer.valueOf(n);
        v2vVar.getClass();
        Pair pair = new Pair(valueOf, (d == null || d2 == null) ? null : new double[]{d.doubleValue(), d2.doubleValue()});
        int intValue = ((Number) pair.getFirst()).intValue();
        double[] dArr = (double[]) pair.getSecond();
        ref$ObjectRef.element = new FileInputStream(file2);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_type", (Integer) 3);
        contentValues.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3);
        contentValues.put("title", str2);
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", guessContentTypeFromName);
        contentValues.put("date_added", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        contentValues.put("duration", po31Var.c);
        contentValues.put("width", po31Var.a);
        contentValues.put("height", po31Var.b);
        contentValues.put("datetaken", Long.valueOf(l != null ? l.longValue() : currentTimeMillis * 1000));
        contentValues.put("orientation", Integer.valueOf(intValue));
        if (!evu0.J(str4)) {
            contentValues.put("relative_path", str4);
        }
        if (dArr != null) {
            if (dArr.length == 0) {
                w511.i("Array is empty.");
                return null;
            }
            contentValues.put("latitude", Double.valueOf(dArr[0]));
            contentValues.put("longitude", Double.valueOf(j73.M(dArr)));
        }
        return o(context, (InputStream) ref$ObjectRef.element, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    d93 D(Context context, String str, String str2);

    void E(String str);

    ArrayList F(Context context, String str, int i, int i2, int i3, b5r b5rVar);

    boolean a(Context context);

    ArrayList b(Context context, String str, int i, int i2, int i3, b5r b5rVar);

    default void c(Context context, h93 h93Var) {
        Long l;
        String str = h93Var.a;
        String[] strArr = {"date_modified"};
        Cursor u = str.equals("isAll") ? u(context.getContentResolver(), g(), strArr, null, null, "date_modified desc") : u(context.getContentResolver(), g(), strArr, "bucket_id = ?", new String[]{str}, "date_modified desc");
        try {
            Cursor cursor = u;
            if (cursor.moveToNext()) {
                l = Long.valueOf(nub1.b(cursor, "date_modified"));
                u.close();
            } else {
                u.close();
                l = null;
            }
            if (l != null) {
                h93Var.f = Long.valueOf(l.longValue());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(u, th);
                throw th2;
            }
        }
    }

    default String d(int i, int i2, b5r b5rVar) {
        String c;
        StringBuilder sb = new StringBuilder();
        if (b5rVar != null && (c = b5rVar.c()) != null) {
            sb.append(c);
            sb.append(" ");
        }
        sb.append("LIMIT " + i2 + " OFFSET " + i);
        return sb.toString();
    }

    default List e(Context context, List list) {
        List list2 = list;
        int i = 0;
        if (list2.size() > 500) {
            ArrayList arrayList = new ArrayList();
            int size = list2.size();
            int i2 = size / 500;
            if (size % 500 != 0) {
                i2++;
            }
            while (i < i2) {
                arrayList.addAll(e(context, list.subList(i * 500, i == i2 + (-1) ? list2.size() : ((i + 1) * 500) - 1)));
                i++;
            }
            return arrayList;
        }
        Cursor u = u(context.getContentResolver(), g(), new String[]{ClidProvider._ID, "media_type", "_data"}, oyr.p("_id in (", kotlin.collections.a.X(list, ",", null, null, new jiu(9), 30), Extension.C_BRAKE), (String[]) list2.toArray(new String[0]), null);
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        Cursor cursor = u;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                hashMap.put(nub1.c(cursor2, ClidProvider._ID), nub1.c(cursor2, "_data"));
            }
            cursor.close();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) hashMap.get((String) it.next());
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            return arrayList2;
        } finally {
        }
    }

    d93 f(Context context, String str, String str2);

    default Uri g() {
        a.getClass();
        return MediaStore.Files.getContentUri("external");
    }

    void h(Context context);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.io.FileInputStream] */
    default d93 i(Context context, String str, String str2, String str3, String str4, Integer num, Double d, Double d2, Long l) {
        int n;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        File file2 = new File(str);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new FileInputStream(file2);
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str2);
        if (guessContentTypeFromName == null && (guessContentTypeFromName = URLConnection.guessContentTypeFromName(str)) == null) {
            T t = ref$ObjectRef.element;
            guessContentTypeFromName = URLConnection.guessContentTypeFromStream((InputStream) t);
            ref$ObjectRef.element = new FileInputStream(file2);
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "image/*";
            }
        }
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a((InputStream) ref$ObjectRef.element);
        Pair pair = new Pair(Integer.valueOf(aVar.d(0, "ImageWidth")), Integer.valueOf(aVar.d(0, "ImageLength")));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        v2v v2vVar = a;
        if (num != null) {
            n = num.intValue();
        } else {
            v2vVar.getClass();
            n = aVar.n();
        }
        Integer valueOf = Integer.valueOf(n);
        v2vVar.getClass();
        Pair pair2 = new Pair(valueOf, (d == null || d2 == null) ? null : new double[]{d.doubleValue(), d2.doubleValue()});
        int intValue3 = ((Number) pair2.getFirst()).intValue();
        double[] dArr = (double[]) pair2.getSecond();
        ref$ObjectRef.element = new FileInputStream(file2);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_type", (Integer) 1);
        contentValues.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3);
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", guessContentTypeFromName);
        contentValues.put("title", str2);
        contentValues.put("date_added", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        contentValues.put("width", Integer.valueOf(intValue));
        contentValues.put("height", Integer.valueOf(intValue2));
        contentValues.put("datetaken", Long.valueOf(l != null ? l.longValue() : currentTimeMillis * 1000));
        contentValues.put("orientation", Integer.valueOf(intValue3));
        if (!evu0.J(str4)) {
            contentValues.put("relative_path", str4);
        }
        if (dArr != null) {
            if (dArr.length == 0) {
                w511.i("Array is empty.");
                return null;
            }
            contentValues.put("latitude", Double.valueOf(dArr[0]));
            contentValues.put("longitude", Double.valueOf(j73.M(dArr)));
        }
        return o(context, (InputStream) ref$ObjectRef.element, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    default void j(Context context, String str) {
        if (!wfz.c) {
            return;
        }
        String N = evu0.N(LicenseUtility.SEPARATOR, 40, "");
        wfz.l("log error row " + str + " start " + N);
        Cursor u = u(context.getContentResolver(), g(), null, "_id = ?", new String[]{str}, null);
        try {
            Cursor cursor = u;
            String[] columnNames = cursor.getColumnNames();
            if (cursor.moveToNext()) {
                int length = columnNames.length;
                for (int i = 0; i < length; i++) {
                    wfz.l(columnNames[i] + " : " + cursor.getString(i));
                }
            }
            u.close();
            wfz.l("log error row " + str + " end " + N);
        } finally {
        }
    }

    default int k(int i, b5r b5rVar, Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList = new ArrayList();
        StringBuilder t = qv10.t(b5rVar != null ? b5rVar.b(i, arrayList, false) : ela1.f(i));
        if (!str.equals("isAll")) {
            if (evu0.k0(t).length() > 0) {
                t.append(" AND ");
            }
            t.append("bucket_id = ?");
            arrayList.add(str);
        }
        Cursor u = u(contentResolver, g(), new String[]{ClidProvider._ID}, t.toString(), (String[]) arrayList.toArray(new String[0]), b5rVar != null ? b5rVar.c() : null);
        try {
            int count = u.getCount();
            u.close();
            return count;
        } finally {
        }
    }

    default void l(Object obj) {
        E("Failed to find asset " + obj);
        throw null;
    }

    ArrayList m(Context context, int i, b5r b5rVar);

    String n(Context context, String str);

    default d93 o(Context context, InputStream inputStream, Uri uri, ContentValues contentValues) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(uri, contentValues);
        if (insert == null) {
            E("Cannot insert new asset.");
            throw null;
        }
        long parseId = ContentUris.parseId(insert);
        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
        try {
            if (openOutputStream == null) {
                E("Cannot open the output stream for " + insert + Extension.DOT_CHAR);
                throw null;
            }
            try {
                rzo.l(inputStream, openOutputStream);
                inputStream.close();
                openOutputStream.close();
                contentResolver.notifyChange(insert, null);
                d93 A = A(context, String.valueOf(parseId));
                if (A != null) {
                    return A;
                }
                l(Long.valueOf(parseId));
                throw null;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.io.ByteArrayInputStream] */
    default d93 p(Context context, byte[] bArr, String str, String str2, String str3, String str4, Integer num, Double d, Double d2, Long l) {
        int n;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new ByteArrayInputStream(bArr);
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName == null) {
            T t = ref$ObjectRef.element;
            guessContentTypeFromName = URLConnection.guessContentTypeFromStream((InputStream) t);
            ref$ObjectRef.element = new ByteArrayInputStream(bArr);
            if (guessContentTypeFromName == null) {
                guessContentTypeFromName = "image/*";
            }
        }
        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a((InputStream) ref$ObjectRef.element);
        Pair pair = new Pair(Integer.valueOf(aVar.d(0, "ImageWidth")), Integer.valueOf(aVar.d(0, "ImageLength")));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        v2v v2vVar = a;
        if (num != null) {
            n = num.intValue();
        } else {
            v2vVar.getClass();
            n = aVar.n();
        }
        Integer valueOf = Integer.valueOf(n);
        v2vVar.getClass();
        Pair pair2 = new Pair(valueOf, (d == null || d2 == null) ? null : new double[]{d.doubleValue(), d2.doubleValue()});
        int intValue3 = ((Number) pair2.getFirst()).intValue();
        double[] dArr = (double[]) pair2.getSecond();
        ref$ObjectRef.element = new ByteArrayInputStream(bArr);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_type", (Integer) 1);
        contentValues.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3);
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", guessContentTypeFromName);
        contentValues.put("title", str2);
        contentValues.put("date_added", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        contentValues.put("width", Integer.valueOf(intValue));
        contentValues.put("height", Integer.valueOf(intValue2));
        contentValues.put("datetaken", Long.valueOf(l != null ? l.longValue() : currentTimeMillis * 1000));
        contentValues.put("orientation", Integer.valueOf(intValue3));
        if (!evu0.J(str4)) {
            contentValues.put("relative_path", str4);
        }
        if (dArr != null) {
            if (dArr.length == 0) {
                w511.i("Array is empty.");
                return null;
            }
            contentValues.put("latitude", Double.valueOf(dArr[0]));
            contentValues.put("longitude", Double.valueOf(j73.M(dArr)));
        }
        return o(context, (InputStream) ref$ObjectRef.element, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    h93 q(int i, b5r b5rVar, Context context, String str);

    String r(int i, long j, Context context);

    String[] s();

    default Uri t(boolean z, int i, long j) {
        Uri withAppendedId;
        if (i == 1) {
            withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j);
        } else if (i == 2) {
            withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j);
        } else {
            if (i != 3) {
                E("Unexpected asset type " + i);
                throw null;
            }
            withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
        }
        return z ? MediaStore.setRequireOriginal(withAppendedId) : withAppendedId;
    }

    default Cursor u(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        wfz wfzVar = wfz.b;
        try {
            Cursor query = contentResolver.query(uri, strArr, str, strArr2, str2);
            v(uri, strArr, str, strArr2, str2, new IDBUtils$logQuery$1(1, wfzVar, wfz.class, "info", "info(Ljava/lang/Object;)V", 0), query);
            if (query != null) {
                return query;
            }
            E("Failed to obtain the cursor.");
            throw null;
        } catch (Exception e) {
            v(uri, strArr, str, strArr2, str2, new IDBUtils$logQuery$2(1, wfzVar, wfz.class, "error", "error(Ljava/lang/Object;)V", 0), null);
            wfz.f(e, "happen query error");
            throw e;
        }
    }

    default List w(Context context) {
        Cursor u = u(context.getContentResolver(), g(), null, null, null, null);
        try {
            List d0 = j73.d0(u.getColumnNames());
            u.close();
            return d0;
        } finally {
        }
    }

    ArrayList x(Context context, int i, b5r b5rVar);

    byte[] y(Context context, d93 d93Var, boolean z);

    String z(Context context, String str, boolean z);
}
