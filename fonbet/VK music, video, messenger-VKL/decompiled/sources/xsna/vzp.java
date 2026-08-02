package xsna;

import kotlin.Pair;

/* compiled from: EventHubServiceParams.kt */
/* loaded from: classes3.dex */
public final class vzp {
    public final gau0 a;
    public final pdh0 b;
    public final eul0 c;
    public final wqf0 d;
    public final int e;
    public final Pair<Boolean, Long> f;
    public final wwe0 g;
    public final boolean h;

    public vzp(gau0 gau0Var, pdh0 pdh0Var, eul0 eul0Var, wqf0 wqf0Var, int i, Pair pair, wwe0 wwe0Var, boolean z) {
        this.a = gau0Var;
        this.b = pdh0Var;
        this.c = eul0Var;
        this.d = wqf0Var;
        this.e = i;
        this.f = pair;
        this.g = wwe0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzp)) {
            return false;
        }
        vzp vzpVar = (vzp) obj;
        return this.a.equals(vzpVar.a) && this.b.equals(vzpVar.b) && this.c.equals(vzpVar.c) && this.d.equals(vzpVar.d) && this.e == vzpVar.e && epx.f(this.f, vzpVar.f) && epx.f(this.g, vzpVar.g) && this.h == vzpVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + shy.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31;
        wwe0 wwe0Var = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (wwe0Var == null ? 0 : wwe0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventHubServiceParams(urlBuilderProvider=");
        sb.append(this.a);
        sb.append(", accessTokenProvider=");
        sb.append(this.b);
        sb.append(", clientProvider=");
        sb.append(this.c);
        sb.append(", logFlipperProvider=");
        sb.append(this.d);
        sb.append(", ehspVersion=");
        sb.append(this.e);
        sb.append(", compressionEnabledMinSize=");
        sb.append(this.f);
        sb.append(", rateLimit=");
        sb.append(this.g);
        sb.append(", apiCallsEnabled=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
