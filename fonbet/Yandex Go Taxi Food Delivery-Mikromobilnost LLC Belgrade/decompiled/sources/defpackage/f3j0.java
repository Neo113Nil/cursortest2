package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class f3j0 implements b050 {
    public final pax0 a;
    public final String b;
    public final yf70 c;

    public f3j0(pax0 pax0Var, String str, yf70 yf70Var) {
        this.a = pax0Var;
        this.b = str;
        this.c = yf70Var;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("targetingInput");
        l80.a(foe.i).a(bfxVar, cVar, this.a);
        bfxVar.A1("plaqueId");
        bfxVar.r0(this.b);
        yf70 yf70Var = this.c;
        if (yf70Var instanceof xf70) {
            bfxVar.A1("context");
            l80.i.a(bfxVar, cVar, ((xf70) yf70Var).a);
        }
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(g3j0.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "mutation ReportPlaqueSeen($targetingInput: TargetingInput!, $plaqueId: String!, $context: String) { plaqueSeen(input: { plaqueId: $plaqueId context: $context targeting: $targetingInput } ) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3j0)) {
            return false;
        }
        f3j0 f3j0Var = (f3j0) obj;
        return jl40.l(this.a, f3j0Var.a) && jl40.l(this.b, f3j0Var.b) && this.c.equals(f3j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "798eed9f4fa6be945412a2141a870fc64525c7ba5af81ef7477e9569351ff962";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "ReportPlaqueSeen";
    }

    public final String toString() {
        return "ReportPlaqueSeenMutation(targetingInput=" + this.a + ", plaqueId=" + this.b + ", context=" + this.c + ')';
    }
}
