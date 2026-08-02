package xsna;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes12.dex */
public final class ft10 {
    public final i.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ft10(i.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        fxc0.p(!z5 || z3);
        fxc0.p(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        fxc0.p(z6);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final ft10 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new ft10(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final ft10 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new ft10(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ft10.class == obj.getClass()) {
            ft10 ft10Var = (ft10) obj;
            if (this.b == ft10Var.b && this.c == ft10Var.c && this.d == ft10Var.d && this.e == ft10Var.e && this.f == ft10Var.f && this.g == ft10Var.g && this.h == ft10Var.h && this.i == ft10Var.i && this.j == ft10Var.j && Objects.equals(this.a, ft10Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
