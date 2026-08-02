package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.vk.api.sdk.exceptions.VKLocalIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;
import okhttp3.m;
import ru.ok.android.commons.http.Http;

/* compiled from: FilePartRequestBody.kt */
/* loaded from: classes15.dex */
public final class p9r extends okhttp3.t {
    public final Context c;
    public final Uri d;
    public final String e;
    public final long f;
    public final long g;

    public p9r(long j, long j2, Context context, Uri uri, String str) {
        this.c = context;
        this.d = uri;
        this.e = str;
        this.f = j;
        this.g = j2;
    }

    @Override // okhttp3.t
    public final long contentLength() {
        return (this.g - this.f) + 1;
    }

    @Override // okhttp3.t
    public final okhttp3.m contentType() {
        String str = this.e;
        if (str == null) {
            str = Http.ContentType.APPLICATION_OCTET_STREAM;
        }
        Pattern pattern = okhttp3.m.e;
        try {
            return m.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeTo(an8 an8Var) {
        long j = this.f;
        Uri uri = this.d;
        OutputStream b4 = an8Var.b4();
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                AssetFileDescriptor openAssetFileDescriptor = this.c.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor == null) {
                    throw new FileNotFoundException("Cannot open uri: " + uri);
                }
                try {
                    FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
                    if (createInputStream.skip(j) != j) {
                        throw new IOException("Skip-bytes for files did not skip as much bytes as required. I hate that Java's InputStream interface.");
                    }
                    long j2 = (this.g - j) + 1;
                    byte[] bArr = new byte[16384];
                    long j3 = 0;
                    while (createInputStream.available() > 0) {
                        try {
                            int read = createInputStream.read(bArr);
                            if (read != -1) {
                                if (read + j3 > j2) {
                                    long j4 = j2 - j3;
                                    if (j4 > 2147483647L) {
                                        throw new IllegalStateException("Seems like buffer size is greater than int");
                                    }
                                    read = (int) j4;
                                }
                                b4.write(bArr, 0, read);
                                b4.flush();
                                j3 += read;
                                if (j3 >= j2) {
                                    break;
                                }
                            }
                        } catch (IOException e) {
                            throw new VKLocalIOException(e);
                        }
                    }
                    try {
                        openAssetFileDescriptor.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (IOException e2) {
                    throw new VKLocalIOException(e2);
                }
            } catch (FileNotFoundException e3) {
                throw new VKLocalIOException(e3);
            }
        } catch (Throwable th) {
            if (0 != 0) {
            }
            throw th;
        }
        if (0 != 0) {
            try {
                assetFileDescriptor.close();
            } catch (Exception unused2) {
            }
        }
        throw th;
    }
}
