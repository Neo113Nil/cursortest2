package xsna;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: UriUtil.java */
/* loaded from: classes12.dex */
public final class meq0 {
    public static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static String a(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String str2 = null;
        if (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(b(uri))) {
            if (X3.i.b.equals(b(uri))) {
                return uri.getPath();
            }
            return null;
        }
        boolean z = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            documentId.getClass();
            Uri uri3 = z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            uri3.getClass();
            str = "_id=?";
            uri2 = uri3;
            strArr = new String[]{documentId.split(StringUtils.PROCESS_POSTFIX_DELIMITER)[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor query = contentResolver.query(uri2, new String[]{"_data"}, str, strArr, null);
        if (query != null) {
            try {
                if (query.moveToFirst() && (columnIndexOrThrow = query.getColumnIndexOrThrow("_data")) != -1) {
                    str2 = query.getString(columnIndexOrThrow);
                }
            } finally {
                query.close();
            }
        }
        if (query != null) {
        }
        return str2;
    }

    public static String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri c(int i) {
        return er.a("res").path(String.valueOf(i)).build();
    }

    public static boolean d(Uri uri) {
        return "res".equals(b(uri));
    }

    public static boolean e(Uri uri) {
        String b = b(uri);
        return HttpRequest.DEFAULT_SCHEME.equals(b) || "http".equals(b);
    }

    public static boolean f(Uri uri) {
        return "android.resource".equals(b(uri));
    }
}
