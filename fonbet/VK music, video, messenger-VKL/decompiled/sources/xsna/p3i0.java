package xsna;

import androidx.annotation.Nullable;
import com.ironsource.X3;

/* compiled from: SeekPoint.java */
/* loaded from: classes12.dex */
public final class p3i0 {
    public static final p3i0 c = new p3i0(0, 0);
    public final long a;
    public final long b;

    public p3i0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p3i0.class == obj.getClass()) {
            p3i0 p3i0Var = (p3i0) obj;
            if (this.a == p3i0Var.a && this.b == p3i0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return efz.b(this.b, X3.j.e, sb);
    }
}
