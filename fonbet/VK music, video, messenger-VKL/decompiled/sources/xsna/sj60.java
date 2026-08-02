package xsna;

import com.vk.newsfeed.api.di.NewsFeedComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sj60 implements izs {
    public final /* synthetic */ uj60 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ sj60(uj60 uj60Var, long j, int i) {
        this.b = uj60Var;
        this.c = j;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        iw60 iw60Var = (iw60) obj;
        zvq zvqVar = new zvq();
        uj60 uj60Var = this.b;
        io.reactivex.rxjava3.core.x l = ((NewsFeedComponent) uj60Var.i.getValue()).Aa().l(iw60Var, new jw60(this.c, (lu0) uj60Var.j.getValue(), zvqVar, uj60Var.r));
        kn4 kn4Var = new kn4();
        boolean booleanValue = ((Boolean) uj60Var.o.getValue()).booleanValue();
        int i = this.d;
        if (booleanValue && i == 0) {
            l = new io.reactivex.rxjava3.internal.operators.single.o(l, new xk30(new e810(uj60Var, kn4Var), 7));
        }
        if (i == 0) {
            l = new io.reactivex.rxjava3.internal.operators.single.n(l, new s440(new fk5(uj60Var, i, 1), 6));
        }
        boolean z = iw60Var.d;
        qz60 qz60Var = (qz60) uj60Var.b.getCurrentState();
        String str = qz60Var.b.d;
        boolean z2 = i == 0 && z && qz60Var.h.d && epx.f(uj60Var.f.b.d, "append") && (str == null || str.length() == 0);
        if (!((Boolean) uj60Var.k.getValue()).booleanValue() || !z2) {
            return l;
        }
        int i2 = 7;
        return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(l, new g600(new t440(uj60Var, 5), i2)), new lkz(new xd40(uj60Var, 5), i2)).h(new ljs(new f0z(uj60Var, 16), 13)), new b9b(uj60Var, 3));
    }
}
