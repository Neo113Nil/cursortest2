package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes8.dex */
public final class lro implements ejg0 {
    public final yf70 a;
    public final yf70 b;
    public final yf70 c;

    public lro(yf70 yf70Var, yf70 yf70Var2, yf70 yf70Var3) {
        this.a = yf70Var;
        this.b = yf70Var2;
        this.c = yf70Var3;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        yf70 yf70Var = this.a;
        if (yf70Var instanceof xf70) {
            bfxVar.A1("locationInput");
            ep60 a = l80.a(foe.d);
            Object obj = ((xf70) yf70Var).a;
            if (obj == null) {
                bfxVar.k2();
            } else {
                a.a(bfxVar, cVar, obj);
            }
        }
        yf70 yf70Var2 = this.b;
        if (yf70Var2 instanceof xf70) {
            bfxVar.A1("params");
            b70 d = cVar.d(iu00.a);
            foe foeVar = l80.a;
            if (d instanceof om60) {
                ny61.r("The adapter is already nullable");
                return;
            }
            Object obj2 = ((xf70) yf70Var2).a;
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                d.a(bfxVar, cVar, obj2);
            }
        }
        yf70 yf70Var3 = this.c;
        if (yf70Var3 instanceof xf70) {
            bfxVar.A1("testIds");
            b70 d2 = cVar.d(mlz.a);
            foe foeVar2 = l80.a;
            lqy lqyVar = new lqy(d2);
            Object obj3 = ((xf70) yf70Var3).a;
            if (obj3 == null) {
                bfxVar.k2();
            } else {
                lqyVar.a(bfxVar, cVar, obj3);
            }
        }
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(mro.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query Experiments($locationInput: LocationInput, $params: Map_String_ObjectScalar, $testIds: [Long!]) { experiments(location: $locationInput, params: $params, testIds: $testIds) { testIds triggeredTestIds triggeredExperimentSet { flags testId } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lro)) {
            return false;
        }
        lro lroVar = (lro) obj;
        return jl40.l(this.a, lroVar.a) && jl40.l(this.b, lroVar.b) && jl40.l(this.c, lroVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vfc.b(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "c847d08ad236977abf01218f14d5e3c2e529bfbde67462cbb005f3c12c1bd250";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "Experiments";
    }

    public final String toString() {
        return "ExperimentsQuery(locationInput=" + this.a + ", params=" + this.b + ", testIds=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lro() {
        this(r0, r0, r0);
        vf70 vf70Var = vf70.a;
    }
}
