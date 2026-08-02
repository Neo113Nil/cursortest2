package defpackage;

import com.yandex.quark.utils.Disposable;
import com.yandex.quark.webchat.feature.dependencies.BufferingProfile;
import com.yandex.quark.webchat.feature.dependencies.a;
import com.yandex.quark.webchat.js.d;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class jd41 implements Disposable {
    public final BufferingProfile A;
    public final BufferingProfile B;
    public final d C;
    public final d D;
    public final js1 E;
    public final sc41 F;
    public final vjd G;
    public final cr6 H;
    public final cr6 I;
    public final br6 J;
    public final br6 K;
    public final onh a;
    public final a b;
    public final wwi c;
    public final tc41 w;
    public final r0 x;
    public final r0 y;
    public final ge41 z;

    public jd41(ike ikeVar, zwf0 zwf0Var, onh onhVar, a aVar) {
        this.a = onhVar;
        this.b = aVar;
        wwi wwiVar = new wwi();
        this.c = wwiVar;
        dsw dswVar = new dsw(new s59(wwiVar));
        tc41 tc41Var = new tc41();
        this.w = tc41Var;
        r0 c = bvf0.c(new dsu(0));
        this.x = c;
        this.y = c;
        this.z = new ge41(zwf0Var);
        BufferingProfile bufferingProfile = new BufferingProfile();
        this.A = bufferingProfile;
        this.B = bufferingProfile;
        d dVar = new d(dswVar, tc41Var, ikeVar);
        this.C = dVar;
        this.D = dVar;
        js1 js1Var = new js1();
        this.E = js1Var;
        this.F = new sc41(new va90(ikeVar, js1Var, new bg3(2)), ikeVar);
        this.G = new vjd();
        cr6 cr6Var = new cr6();
        this.H = cr6Var;
        this.I = cr6Var;
        br6 br6Var = new br6();
        this.J = br6Var;
        this.K = br6Var;
    }

    @Override // com.yandex.quark.utils.Disposable
    public final void dispose() {
        this.G.dispose();
    }
}
