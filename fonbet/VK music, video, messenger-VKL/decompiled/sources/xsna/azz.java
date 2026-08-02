package xsna;

import com.vk.reefton.dto.ReefLocationSource;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class azz extends wof0 {
    public final ReefLocationSource a;
    public final Double b;
    public final Double c;
    public final Long d;
    public final Float e;
    public final Float f;
    public final boolean g;
    public final Float h;

    public azz(ReefLocationSource reefLocationSource, Double d, Double d2, Long l, Float f, Float f2, boolean z, Float f3) {
        this.a = reefLocationSource;
        this.b = d;
        this.c = d2;
        this.d = l;
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azz)) {
            return false;
        }
        azz azzVar = (azz) obj;
        return this.a == azzVar.a && epx.f(this.b, azzVar.b) && epx.f(this.c, azzVar.c) && epx.f(this.d, azzVar.d) && epx.f(this.e, azzVar.e) && epx.f(this.f, azzVar.f) && this.g == azzVar.g && epx.f(this.h, azzVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.e;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f;
        int b = qoy.b((hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31, 31, this.g);
        Float f3 = this.h;
        return b + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        return "LocationState(type=" + this.a + ", lat=" + this.b + ", lon=" + this.c + ", elapsedTime=" + this.d + ", accuracy=" + this.e + ", speed=" + this.f + ", hasAltitude=" + this.g + ", altitude=" + this.h + ")";
    }
}
