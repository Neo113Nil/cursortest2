package xsna;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.text.Regex;

/* compiled from: UriUtils.kt */
/* loaded from: classes17.dex */
public final class oeq0 {
    /* JADX WARN: Finally extract failed */
    public static final String a(Context context, Uri uri, String str) {
        File file;
        Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name", "_size"}, null, null, null);
        if (query != null) {
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    return null;
                }
                String string = query.getString(query.getColumnIndex("_display_name"));
                if (str.equals("")) {
                    file = new File(context.getFilesDir() + '/' + string);
                } else {
                    File file2 = new File(context.getFilesDir() + '/' + str);
                    if (!file2.exists()) {
                        file2.mkdir();
                    }
                    file = new File(context.getFilesDir() + '/' + str + '/' + string);
                }
                query.close();
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            openInputStream.close();
                            fileOutputStream.close();
                            return file.getPath();
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(query, th);
                    throw th2;
                }
            }
        }
        return null;
    }

    public static final String b(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        L.e(String.format("Converted %s to %s", Arrays.copyOf(new Object[]{uri, string}, 2)));
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String c(Context context, Uri uri) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        File file = new File(context.getCacheDir(), query.getString(columnIndex));
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Math.min(openInputStream.available(), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    openInputStream.close();
                    fileOutputStream.close();
                    query.close();
                    return file.getPath();
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            query.close();
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005b, code lost:
    
        if (xsna.bd3.d(r14) != false) goto L13;
     */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String d(Context context, Uri uri) {
        Throwable th;
        Uri uri2;
        Uri uri3;
        String str;
        Cursor cursor = null;
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] strArr = (String[]) drm0.c0(DocumentsContract.getDocumentId(uri), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6).toArray(new String[0]);
            String str2 = strArr[0];
            String str3 = DomExceptionUtils.SEPARATOR + strArr[1];
            if ("primary".equalsIgnoreCase(str2)) {
                str = Environment.getExternalStorageDirectory() + str3;
            }
            str = System.getenv("SECONDARY_STORAGE") + str3;
            if (!bd3.d(str)) {
                str = System.getenv("EXTERNAL_STORAGE") + str3;
                new File(str).exists();
            }
            if (str != "") {
                return str;
            }
        } else {
            if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                try {
                    uri2 = uri;
                    Cursor query = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String str4 = Environment.getExternalStorageDirectory() + "/Download/" + query.getString(0);
                                if (!TextUtils.isEmpty(str4)) {
                                    query.close();
                                    return str4;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    String documentId = DocumentsContract.getDocumentId(uri2);
                    if (!TextUtils.isEmpty(documentId)) {
                        if (brm0.B(documentId, "raw:", false)) {
                            return new Regex("raw:").i(documentId, "");
                        }
                        try {
                            return b(context, ContentUris.withAppendedId(Uri.parse(new String[]{"content://downloads/public_downloads", "content://downloads/my_downloads"}[0]), Long.valueOf(documentId).longValue()), null, null);
                        } catch (NumberFormatException unused) {
                            return new Regex("^raw:").i(new Regex("^/document/raw:").i(uri2.getPath(), ""), "");
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                uri2 = uri;
            }
            if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                String[] strArr2 = (String[]) drm0.c0(DocumentsContract.getDocumentId(uri2), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6).toArray(new String[0]);
                String str5 = strArr2[0];
                int hashCode = str5.hashCode();
                if (hashCode != 93166550) {
                    if (hashCode != 100313435) {
                        if (hashCode == 112202875 && str5.equals("video")) {
                            uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            return b(context, uri3, "_id=?", new String[]{strArr2[1]});
                        }
                    } else if (str5.equals("image")) {
                        uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        return b(context, uri3, "_id=?", new String[]{strArr2[1]});
                    }
                } else if (str5.equals("audio")) {
                    uri3 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    return b(context, uri3, "_id=?", new String[]{strArr2[1]});
                }
            } else {
                if ("com.google.android.apps.docs.storage".equals(uri2.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri2.getAuthority())) {
                    return c(context, uri2);
                }
                if ("com.whatsapp.provider.media".equals(uri2.getAuthority())) {
                    return a(context, uri2, "whats_app");
                }
                if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(uri2.getScheme())) {
                    return "com.google.android.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : ("com.google.android.apps.docs.storage".equals(uri2.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri2.getAuthority())) ? c(context, uri2) : Build.VERSION.SDK_INT >= 29 ? a(context, uri2, "user_files") : b(context, uri2, null, null);
                }
                if (X3.i.b.equalsIgnoreCase(uri2.getScheme())) {
                    return uri2.getPath();
                }
            }
        }
        return null;
    }

    public static final boolean e(Uri uri) {
        return epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
    }

    public static final Uri f(Uri uri, Uri uri2) {
        boolean z;
        if (!uri.equals(uri2)) {
            boolean z2 = false;
            if (!Preference.j().getBoolean("__dbg_use_content_scheme", false)) {
                String path = uri2.getPath();
                if (path != null) {
                    File file = new File(path);
                    try {
                        z = file.exists();
                    } catch (SecurityException unused) {
                        z = false;
                    }
                    if (z && file.canRead()) {
                        z2 = true;
                    }
                }
                if (z2) {
                    uri = uri2;
                }
            }
        }
        L.e(i6n0.a(uri, "Content: chosen uri is "));
        return uri;
    }
}
