package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.api.sdk.exceptions.VKLocalIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLConnection;
import java.util.regex.Pattern;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.m;
import ru.ok.android.commons.http.Http;

/* compiled from: FileFullRequestBody.kt */
/* loaded from: classes15.dex */
public final class v8r extends okhttp3.t {
    public final Context c;
    public final Uri d;
    public final String e;

    public v8r(Context context, Uri uri) {
        String lastPathSegment;
        this.c = context;
        this.d = uri;
        String scheme = uri.getScheme();
        if (scheme != null && !drm0.N(scheme) && (lastPathSegment = uri.getLastPathSegment()) != null && !drm0.N(lastPathSegment)) {
            uri.getScheme();
            this.e = uri.getLastPathSegment();
        } else {
            throw new IllegalArgumentException("Illegal fileUri value: '" + uri + "'");
        }
    }

    @Override // okhttp3.t
    public final long contentLength() throws IOException {
        Uri uri = this.d;
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                AssetFileDescriptor openAssetFileDescriptor = this.c.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    try {
                        openAssetFileDescriptor.close();
                    } catch (Exception unused) {
                    }
                    return length;
                }
                throw new FileNotFoundException("Cannot open uri: " + uri);
            } catch (FileNotFoundException e) {
                throw new VKLocalIOException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Override // okhttp3.t
    public final okhttp3.m contentType() {
        String str;
        okhttp3.m mVar = null;
        try {
            str = URLConnection.guessContentTypeFromName(this.e);
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            try {
                Cursor query = this.c.getContentResolver().query(this.d, new String[]{"mime_type"}, null, null, null);
                if (query != null) {
                    try {
                        str = query.isNull(0) ? null : query.getString(0);
                        s3q0 s3q0Var = s3q0.a;
                        query.close();
                    } catch (Throwable th) {
                        String str2 = str;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                ro.e(query, th);
                                throw th2;
                            } catch (Throwable unused2) {
                                str = str2;
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        if (str != null) {
            Pattern pattern = okhttp3.m.e;
            try {
                mVar = m.a.a(str);
            } catch (IllegalArgumentException unused4) {
            }
            if (mVar != null) {
                return mVar;
            }
        }
        Pattern pattern2 = okhttp3.m.e;
        return m.a.a(Http.ContentType.APPLICATION_OCTET_STREAM);
    }

    @Override // okhttp3.t
    public final boolean isDuplex() {
        return true;
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) throws IOException {
        ContentResolver contentResolver = this.c.getContentResolver();
        Uri uri = this.d;
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            throw new FileNotFoundException(i6n0.a(uri, "Cannot open uri: "));
        }
        try {
            try {
                i3x d = mq9.d(openAssetFileDescriptor.createInputStream());
                while (d.read(an8Var.C(), PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                    try {
                        try {
                            an8Var.o1();
                        } catch (StreamResetException unused) {
                        }
                    } catch (IOException e) {
                        if (!(e instanceof VKLocalIOException)) {
                            throw new VKLocalIOException(e);
                        }
                        throw e;
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                openAssetFileDescriptor.close();
            } catch (IOException e2) {
                if (!(e2 instanceof VKLocalIOException)) {
                    throw new VKLocalIOException(e2);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(openAssetFileDescriptor, th);
                throw th2;
            }
        }
    }
}
