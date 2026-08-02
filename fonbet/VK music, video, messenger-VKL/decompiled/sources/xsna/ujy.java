package xsna;

import xsna.jjy;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ujy implements izs {
    public final /* synthetic */ wdp0 b;
    public final /* synthetic */ wjy.a c;

    public /* synthetic */ ujy(wdp0 wdp0Var, wjy.a aVar) {
        this.b = wdp0Var;
        this.c = aVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sek sekVar = (sek) obj;
        jjy jjyVar = wjy.b;
        if (jjyVar != null) {
            jjy.a aVar = (jjy.a) new sjy(this.b, sekVar, this.c, 0).invoke(new jjy.a(jjyVar.a));
            lti ltiVar = aVar.a;
            rt8 rt8Var = rt8.c;
            j5g.v0(new jjy.b(ltiVar), aVar.b);
        }
        return s3q0.a;
    }
}
