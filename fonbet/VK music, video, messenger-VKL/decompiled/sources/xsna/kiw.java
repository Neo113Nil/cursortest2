package xsna;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kiw extends qhz0 {
    public static volatile a f = new a(31457280);
    public volatile boolean e;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a extends LruCache {
        @Override // android.util.LruCache
        public final int sizeOf(Object obj, Object obj2) {
            return ((Bitmap) obj2).getAllocationByteCount();
        }
    }

    @NonNull
    public static kiw b(int i, int i2, @NonNull String str) {
        kiw kiwVar = new kiw(str);
        kiwVar.b = i;
        kiwVar.c = i2;
        return kiwVar;
    }

    @Nullable
    public final Bitmap a() {
        return this.e ? (Bitmap) f.get(this.a) : (Bitmap) this.d;
    }

    public final void c() {
        if (true == this.e) {
            return;
        }
        this.e = true;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap != null) {
            this.d = null;
            f.put(this.a, bitmap);
        }
    }

    @Override // xsna.qhz0
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kiw.class == obj.getClass() && super.equals(obj) && this.e == ((kiw) obj).e;
    }

    @Override // xsna.qhz0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.e));
    }

    @NonNull
    public final String toString() {
        return "ImageData{url='" + this.a + "', width=" + this.b + ", height=" + this.c + ", bitmap=" + a() + '}';
    }
}
