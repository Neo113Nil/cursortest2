package xsna;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: KitKatPathResolver.java */
/* loaded from: classes17.dex */
public final class xiy extends ej6 {
    @Override // xsna.dag0
    @NonNull
    public final String c(@NonNull Uri uri) {
        Uri uri2;
        if (!DocumentsContract.isDocumentUri(e43.a, uri)) {
            String K = com.vk.core.files.a.K(uri);
            return (K == null && HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(uri.getScheme())) ? ej6.d(uri, "_data", null, null) : K != null ? K : "unknown";
        }
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (!"primary".equalsIgnoreCase(split[0])) {
                return "unknown";
            }
            return Environment.getExternalStorageDirectory() + DomExceptionUtils.SEPARATOR + split[1];
        }
        if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            return ej6.d(ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri))), "_data", null, null);
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
        return ej6.d(uri2, "_data", "_id=?", new String[]{split2[1]});
    }
}
