package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.images.ImageManager$From;

/* loaded from: classes15.dex */
public final class ad7 {
    public final Bitmap a;
    public final Uri b;
    public final byte[] c;
    public final ImageManager$From d;

    public ad7(Bitmap bitmap, byte[] bArr, Uri uri, ImageManager$From imageManager$From) {
        this.a = bitmap;
        this.b = uri;
        this.c = bArr;
        this.d = imageManager$From;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ad7.class == obj.getClass()) {
            ad7 ad7Var = (ad7) obj;
            if (!this.a.equals(ad7Var.a) || this.d != ad7Var.d) {
                return false;
            }
            Uri uri = ad7Var.b;
            Uri uri2 = this.b;
            if (uri2 != null) {
                return uri2.equals(uri);
            }
            if (uri == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.b;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }
}
