package xsna;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.files.a;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;

/* compiled from: BasePathResolver.java */
/* loaded from: classes17.dex */
public class ej6 implements dag0 {
    @NonNull
    public static String d(@NonNull Uri uri, @NonNull String str, @Nullable String str2, @Nullable String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = e43.a.getContentResolver().query(uri, new String[]{str}, str2, strArr, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    a.c.a(cursor);
                    return "unknown";
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
                return string != null ? string : "unknown";
            } catch (Exception e) {
                L.B("vk", e.getMessage(), e);
                a.c.a(cursor);
                return "unknown";
            }
        } finally {
            a.c.a(cursor);
        }
    }

    @Override // xsna.dag0
    public final long a(@NonNull Uri uri) {
        if (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(uri.getScheme())) {
            if (X3.i.b.equalsIgnoreCase(uri.getScheme())) {
                return new File(uri.getPath()).length();
            }
            return -1L;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = e43.a.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    a.c.a(cursor);
                    return -1L;
                }
                long j = cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
                a.c.a(cursor);
                return j;
            } catch (Exception e) {
                L.B("vk", e.getMessage(), e);
                a.c.a(cursor);
                return -1L;
            }
        } catch (Throwable th) {
            a.c.a(cursor);
            throw th;
        }
    }

    @Override // xsna.dag0
    @NonNull
    public final String b(@NonNull Uri uri) {
        Uri uri2;
        String scheme = uri.getScheme();
        if (X3.i.b.equalsIgnoreCase(scheme)) {
            return uri.getLastPathSegment();
        }
        if (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(scheme)) {
            return "unknown";
        }
        if (!DocumentsContract.isDocumentUri(e43.a, uri)) {
            return d(uri, "_display_name", null, null);
        }
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            return "primary".equalsIgnoreCase(split[0]) ? split[1] : "unknown";
        }
        if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            try {
                return d(ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri))), "_display_name", null, null);
            } catch (NumberFormatException unused) {
                return "unknown";
            }
        }
        if (!"com.android.providers.media.documents".equals(uri.getAuthority())) {
            return "unknown";
        }
        String[] split2 = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        String str = split2[0];
        if ("image".equals(str)) {
            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if ("video".equals(str)) {
            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (!"audio".equals(str)) {
                return "unknown";
            }
            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        return d(uri2, "_display_name", "_id=?", new String[]{split2[1]});
    }
}
