package xsna;

import xsna.vsf;
import xsna.ypf;

/* compiled from: ClipsWrapperState.kt */
/* loaded from: classes17.dex */
public final class stf {
    public final quf a;
    public final guf b;
    public final duf c;
    public final uqf d;
    public final ypf e;
    public final vsf f;

    public stf() {
        this(0);
    }

    public static stf a(stf stfVar, quf qufVar, guf gufVar, duf dufVar, uqf uqfVar, ypf ypfVar, vsf vsfVar, int i) {
        if ((i & 1) != 0) {
            qufVar = stfVar.a;
        }
        quf qufVar2 = qufVar;
        if ((i & 2) != 0) {
            gufVar = stfVar.b;
        }
        guf gufVar2 = gufVar;
        if ((i & 4) != 0) {
            dufVar = stfVar.c;
        }
        duf dufVar2 = dufVar;
        if ((i & 8) != 0) {
            uqfVar = stfVar.d;
        }
        uqf uqfVar2 = uqfVar;
        if ((i & 16) != 0) {
            ypfVar = stfVar.e;
        }
        ypf ypfVar2 = ypfVar;
        if ((i & 32) != 0) {
            vsfVar = stfVar.f;
        }
        return new stf(qufVar2, gufVar2, dufVar2, uqfVar2, ypfVar2, vsfVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stf)) {
            return false;
        }
        stf stfVar = (stf) obj;
        return epx.f(this.a, stfVar.a) && epx.f(this.b, stfVar.b) && epx.f(this.c, stfVar.c) && epx.f(this.d, stfVar.d) && epx.f(this.e, stfVar.e) && epx.f(this.f, stfVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a.a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClipsWrapperState(uiVisibility=" + this.a + ", titles=" + this.b + ", tabsState=" + this.c + ", focusedItemState=" + this.d + ", downloadState=" + this.e + ", openActionState=" + this.f + ')';
    }

    public stf(quf qufVar, guf gufVar, duf dufVar, uqf uqfVar, ypf ypfVar, vsf vsfVar) {
        this.a = qufVar;
        this.b = gufVar;
        this.c = dufVar;
        this.d = uqfVar;
        this.e = ypfVar;
        this.f = vsfVar;
    }

    public /* synthetic */ stf(int i) {
        this(new quf(true), new guf(0), new duf(0), new uqf(null), ypf.c.a, vsf.a.a);
    }
}
