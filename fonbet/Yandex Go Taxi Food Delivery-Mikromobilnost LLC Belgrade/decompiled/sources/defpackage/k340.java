package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class k340 {
    public final p440 a;
    public final List b;
    public final boolean c;
    public final Throwable d;
    public final float e;
    public final yt30 f;
    public final ku30 g;

    public k340(p440 p440Var, List list, boolean z, Throwable th, float f, yt30 yt30Var, ku30 ku30Var) {
        this.a = p440Var;
        this.b = list;
        this.c = z;
        this.d = th;
        this.e = f;
        this.f = yt30Var;
        this.g = ku30Var;
    }

    public static k340 a(k340 k340Var, p440 p440Var, List list, boolean z, Throwable th, float f, yt30 yt30Var, ku30 ku30Var, int i) {
        if ((i & 1) != 0) {
            p440Var = k340Var.a;
        }
        p440 p440Var2 = p440Var;
        if ((i & 2) != 0) {
            list = k340Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = k340Var.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            th = k340Var.d;
        }
        Throwable th2 = th;
        if ((i & 16) != 0) {
            f = k340Var.e;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            yt30Var = k340Var.f;
        }
        yt30 yt30Var2 = yt30Var;
        if ((i & 64) != 0) {
            ku30Var = k340Var.g;
        }
        k340Var.getClass();
        return new k340(p440Var2, list2, z2, th2, f2, yt30Var2, ku30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k340)) {
            return false;
        }
        k340 k340Var = (k340) obj;
        return jl40.l(this.a, k340Var.a) && jl40.l(this.b, k340Var.b) && this.c == k340Var.c && jl40.l(this.d, k340Var.d) && Float.compare(this.e, k340Var.e) == 0 && jl40.l(this.f, k340Var.f) && jl40.l(this.g, k340Var.g);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Throwable th = this.d;
        int c = g8e.c(this.e, (e + (th == null ? 0 : th.hashCode())) * 31, 31);
        yt30 yt30Var = this.f;
        int hashCode = (c + (yt30Var == null ? 0 : yt30Var.a.hashCode())) * 31;
        ku30 ku30Var = this.g;
        return hashCode + (ku30Var != null ? ku30Var.hashCode() : 0);
    }

    public final String toString() {
        return "MtStopRouteUiState(headerState=" + this.a + ", stopsItems=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ", azimuth=" + this.e + ", purchaseFooter=" + this.f + ", purchaseOptions=" + this.g + Extension.C_BRAKE;
    }

    public /* synthetic */ k340(int i) {
        this(o440.a, EmptyList.a, true, null, 0.0f, null, null);
    }

    public k340() {
        this(0);
    }
}
