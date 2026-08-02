package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipCarouselAttachesSetupParams.kt */
/* loaded from: classes18.dex */
public final class tmc {
    public final int a;
    public final UserId b;
    public final smc c;
    public final boolean d;
    public final boolean e;
    public final k64 f;
    public final boolean g;

    public tmc(int i, UserId userId, smc smcVar, boolean z, boolean z2, k64 k64Var, boolean z3) {
        this.a = i;
        this.b = userId;
        this.c = smcVar;
        this.d = z;
        this.e = z2;
        this.f = k64Var;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmc)) {
            return false;
        }
        tmc tmcVar = (tmc) obj;
        return this.a == tmcVar.a && epx.f(this.b, tmcVar.b) && epx.f(this.c, tmcVar.c) && this.d == tmcVar.d && this.e == tmcVar.e && epx.f(this.f, tmcVar.f) && this.g == tmcVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + qoy.b(qoy.b((this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b)) * 31, 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCarouselAttachesSetupParams(videoId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isFadeEndEnabled=");
        sb.append(this.d);
        sb.append(", isDarkBackground=");
        sb.append(this.e);
        sb.append(", attachesContentPadding=");
        sb.append(this.f);
        sb.append(", isCompactCarousel=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
