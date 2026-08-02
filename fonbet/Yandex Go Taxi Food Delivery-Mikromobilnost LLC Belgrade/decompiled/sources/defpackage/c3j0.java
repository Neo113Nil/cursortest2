package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class c3j0 implements b050 {
    public final pax0 a;
    public final String b;

    public c3j0(pax0 pax0Var, String str) {
        this.a = pax0Var;
        this.b = str;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("targetingInput");
        l80.a(foe.i).a(bfxVar, cVar, this.a);
        bfxVar.A1("plaqueId");
        bfxVar.r0(this.b);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(d3j0.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "mutation ReportPlaqueClicked($targetingInput: TargetingInput!, $plaqueId: String!) { plaqueClicked(input: { plaqueId: $plaqueId targeting: $targetingInput } ) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3j0)) {
            return false;
        }
        c3j0 c3j0Var = (c3j0) obj;
        return jl40.l(this.a, c3j0Var.a) && jl40.l(this.b, c3j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "14b60662631c6f79da1dba75dc7075c4e63bbe82bad841c4db22f7d2347a61fc";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "ReportPlaqueClicked";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportPlaqueClickedMutation(targetingInput=");
        sb.append(this.a);
        sb.append(", plaqueId=");
        return b64.p(sb, this.b, ')');
    }
}
