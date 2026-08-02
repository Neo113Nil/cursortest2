package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;

/* loaded from: classes15.dex */
public final class bd7 {
    public final Bitmap a;
    public final Uri b;
    public final byte[] c;
    public final BitmapSource d;

    public bd7(Bitmap bitmap, byte[] bArr, Uri uri, BitmapSource bitmapSource) {
        this.a = bitmap;
        this.b = uri;
        this.c = bArr;
        this.d = bitmapSource;
    }

    public final Bitmap a() {
        return this.a;
    }

    public final byte[] b() {
        return this.c;
    }

    public final Uri c() {
        return this.b;
    }

    public final BitmapSource d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bd7.class == obj.getClass()) {
            bd7 bd7Var = (bd7) obj;
            if (!this.a.equals(bd7Var.a) || this.d != bd7Var.d) {
                return false;
            }
            Uri uri = bd7Var.b;
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
