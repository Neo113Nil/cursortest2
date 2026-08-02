package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ucg implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ucg(mdg mdgVar, boolean z) {
        this.d = mdgVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((mdg) this.d).T7((vqt) obj, this.c);
                return s3q0.a;
            default:
                DiscoverId discoverId = (DiscoverId) this.d;
                io.reactivex.rxjava3.internal.operators.observable.a2 g0 = ((io.reactivex.rxjava3.core.q) obj).g0();
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                io.reactivex.rxjava3.core.q<T> M0 = g0.M0(1, lVar);
                qs2 qs2Var = new qs2(new sd1(this.c, discoverId, 1), 12);
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return M0.E(qs2Var, lVar, kVar, kVar).F(new defpackage.d(new pcg(discoverId, 17), 22));
        }
    }

    public /* synthetic */ ucg(boolean z, DiscoverId discoverId) {
        this.c = z;
        this.d = discoverId;
    }
}
