package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fi20;

/* compiled from: MotionPhotoMetadata.java */
@Deprecated
/* loaded from: classes12.dex */
public class hb30 implements fi20.a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public hb30(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            hb30 hb30Var = (hb30) obj;
            if (this.a == hb30Var.a && this.b == hb30Var.b && this.c == hb30Var.c && this.d == hb30Var.d && this.e == hb30Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return e600.b(this.e) + ((e600.b(this.d) + ((e600.b(this.c) + ((e600.b(this.b) + ((e600.b(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
