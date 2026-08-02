package ru.mail.libverify.w;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.FileLog;
import xsna.bqy;
import xsna.drm0;
import xsna.epx;

/* loaded from: classes9.dex */
public final class i {
    private final String a;
    private final bqy<b> b;
    private boolean c;

    public i(String str, bqy bqyVar) {
        this.a = str;
        this.b = bqyVar;
    }

    public final Bitmap a(w wVar) {
        if (this.c) {
            return null;
        }
        this.c = true;
        if (drm0.N(this.a)) {
            this.c = false;
            throw new IllegalArgumentException("Content url empty");
        }
        try {
            InputStream d = new ru.mail.libverify.requests.d(wVar, this.b, this.a, "SmsCodeNotification").b().d();
            if (d == null) {
                throw new Throwable("Failed to read response.");
            }
            this.c = false;
            return a(d);
        } catch (Throwable th) {
            th.printStackTrace();
            FileLog.e("ImageDownloadTask", th, "Failed execute request for %s", this.a);
            this.c = false;
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (i.class.equals(obj != null ? obj.getClass() : null)) {
            return epx.f(this.a, ((i) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    private final Bitmap a(InputStream inputStream) throws IOException {
        FileLog.v("ImageDownloadTask", "Decode from stream: %s for url: %s", inputStream, this.a);
        if (inputStream.available() == 0) {
            if (inputStream.markSupported()) {
                inputStream.reset();
            } else if (inputStream instanceof FileInputStream) {
                inputStream.close();
                inputStream = this.b.get().a(this.a);
            }
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Can't decode an image from url: " + this.a);
    }
}
