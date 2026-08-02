package defpackage;

import android.os.SystemClock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class h790 {
    public final long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;

    public h790(int i) {
        this.a = SystemClock.elapsedRealtime();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h790)) {
            return false;
        }
        h790 h790Var = (h790) obj;
        return this.a == h790Var.a && jl40.l(this.b, h790Var.b) && jl40.l(this.c, h790Var.c) && jl40.l(this.d, h790Var.d) && jl40.l(this.e, h790Var.e) && jl40.l(this.f, h790Var.f) && jl40.l(this.g, h790Var.g);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.g;
        return hashCode6 + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        return "PageMoments(pageLoadStarted=" + this.a + ", pageLoadFinished=" + this.b + ", pageLoadCompletelyFinished=" + this.c + ", authSucceeded=" + this.d + ", pageReadyForChat=" + this.e + ", loaderHidden=" + this.f + ", preloaded=" + this.g + Extension.C_BRAKE;
    }

    public h790() {
        this(0);
    }
}
