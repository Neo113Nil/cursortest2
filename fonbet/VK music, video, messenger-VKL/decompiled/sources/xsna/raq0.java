package xsna;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.log.L;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.m;

/* compiled from: UploadEntity.java */
/* loaded from: classes6.dex */
public final class raq0 extends okhttp3.t {
    public final String c;
    public final byte[] d;
    public final psu e;
    public final String f;
    public final String g;

    public raq0(String str, String str2, String str3, psu psuVar) {
        this.d = null;
        String str4 = "VK-FILE-UPLOAD-BOUNDARY-" + UUID.randomUUID().toString();
        this.f = str4;
        String a = zr.a("\r\n--", str4, "\r\nContent-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\nContent-Type: %s\r\n\r\n");
        this.g = zr.a("\r\n--", str4, "--\r\n");
        try {
            this.c = str;
            this.e = psuVar;
            if (str.startsWith(DomExceptionUtils.SEPARATOR)) {
                this.c = new Uri.Builder().scheme(X3.i.b).path(str).build().toString();
            }
            this.d = String.format(Locale.US, a, str3, str2, URLConnection.guessContentTypeFromName(this.c)).getBytes(C.UTF8_NAME);
            if (vx2.d.u()) {
                L.e("vk", "Will upload " + this.c);
            }
        } catch (Exception e) {
            L.C("vk", e);
        }
    }

    public final long a() {
        try {
            AssetFileDescriptor openAssetFileDescriptor = e43.a.getContentResolver().openAssetFileDescriptor(Uri.parse(this.c), "r");
            if (openAssetFileDescriptor == null) {
                return 0L;
            }
            long length = openAssetFileDescriptor.getLength();
            hr80.r(openAssetFileDescriptor);
            return length;
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // okhttp3.t
    public final long contentLength() {
        return a() + this.d.length + this.g.getBytes().length;
    }

    @Override // okhttp3.t
    public final okhttp3.m contentType() {
        String str = "multipart/form-data; boundary=" + this.f;
        Pattern pattern = okhttp3.m.e;
        try {
            return m.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) throws IOException {
        AssetFileDescriptor assetFileDescriptor;
        psu psuVar;
        int read;
        OutputStream b4 = an8Var.b4();
        FileInputStream fileInputStream = null;
        try {
            try {
                assetFileDescriptor = e43.a.getContentResolver().openAssetFileDescriptor(Uri.parse(this.c), "r");
                try {
                    int ceil = (int) Math.ceil(assetFileDescriptor.getLength() / 1024.0d);
                    byte[] bArr = new byte[1024];
                    b4.write(this.d);
                    fileInputStream = assetFileDescriptor.createInputStream();
                    long j = 0;
                    int i = 0;
                    while (true) {
                        int available = fileInputStream.available();
                        psuVar = this.e;
                        if (available <= 0 || (read = fileInputStream.read(bArr)) == -1) {
                            break;
                        }
                        b4.write(bArr, 0, read);
                        b4.flush();
                        if (System.currentTimeMillis() - j >= 150) {
                            psuVar.a.c0(i, ceil, false);
                            j = System.currentTimeMillis();
                        }
                        i++;
                    }
                    psuVar.a.c0(10, 10, true);
                    b4.write(this.g.getBytes());
                } catch (IOException e) {
                    e = e;
                    L.E(e, new Object[0]);
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                    L.E(e, new Object[0]);
                    hr80.r(fileInputStream);
                    hr80.r(assetFileDescriptor);
                }
            } catch (Throwable th) {
                th = th;
                hr80.r(null);
                hr80.r(null);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
            assetFileDescriptor = null;
        } catch (Throwable th2) {
            th = th2;
            hr80.r(null);
            hr80.r(null);
            throw th;
        }
        hr80.r(fileInputStream);
        hr80.r(assetFileDescriptor);
    }
}
