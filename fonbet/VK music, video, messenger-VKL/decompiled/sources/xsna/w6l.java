package xsna;

import java.util.List;
import java.util.Set;
import kotlin.Lazy;

/* compiled from: DebugSettingsConfig.kt */
/* loaded from: classes.dex */
public final class w6l {
    public final gzs<Boolean> a;
    public final gzs<Boolean> b;
    public final gzs<Integer> c;
    public final gzs<Boolean> d;
    public final Lazy<Set<String>> e;
    public final Lazy<Set<String>> f;
    public final izs<String, s3q0> g;
    public final bpn0 h;
    public final gzs<Boolean> i;
    public final Lazy<List<c03>> j;
    public final izs<a03, String> k;

    public w6l(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, bpn0 bpn0Var, bpn0 bpn0Var2, izs izsVar, bpn0 bpn0Var3, gzs gzsVar5, bpn0 bpn0Var4, izs izsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = gzsVar3;
        this.d = gzsVar4;
        this.e = bpn0Var;
        this.f = bpn0Var2;
        this.g = izsVar;
        this.h = bpn0Var3;
        this.i = gzsVar5;
        this.j = bpn0Var4;
        this.k = izsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6l)) {
            return false;
        }
        w6l w6lVar = (w6l) obj;
        return epx.f(this.a, w6lVar.a) && epx.f(this.b, w6lVar.b) && epx.f(this.c, w6lVar.c) && epx.f(this.d, w6lVar.d) && epx.f(this.e, w6lVar.e) && epx.f(this.f, w6lVar.f) && epx.f(this.g, w6lVar.g) && epx.f(this.h, w6lVar.h) && epx.f(this.i, w6lVar.i) && epx.f(this.j, w6lVar.j) && epx.f(this.k, w6lVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + g7r0.a(this.j, sf3.a(tq.b(this.h, dq.c(g7r0.a(this.f, g7r0.a(this.e, sf3.a(sf3.a(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugSettingsConfig(isSaveNetStatToFile=");
        sb.append(this.a);
        sb.append(", isKnetDetailedLogEnabled=");
        sb.append(this.b);
        sb.append(", apiMaxLength=");
        sb.append(this.c);
        sb.append(", isXOwnerEnabled=");
        sb.append(this.d);
        sb.append(", enabledMethods=");
        sb.append(this.e);
        sb.append(", disabledMethods=");
        sb.append(this.f);
        sb.append(", statDelegate=");
        sb.append(this.g);
        sb.append(", isOtelTracingEnabled=");
        sb.append(this.h);
        sb.append(", isMockApiResponseEnabled=");
        sb.append(this.i);
        sb.append(", mockApiResponses=");
        sb.append(this.j);
        sb.append(", resolveMockApiResponse=");
        return up.c(sb, this.k, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w6l() {
        this(new ml7(r0), new ml7(r0), new iy2(16), new ml7(17), new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(12)), new bpn0(new qe3(17)), new xx0(27), new bpn0(new ml7(17)), new ml7(17), new bpn0(new lk(14)), new y90(21));
        int i = 17;
    }
}
