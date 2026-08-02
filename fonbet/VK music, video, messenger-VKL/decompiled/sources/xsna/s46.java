package xsna;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseActionsProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class s46 extends wx20 {
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ r46 e;
    public final /* synthetic */ e520 f;

    public s46(long j, boolean z, r46 r46Var, e520 e520Var) {
        this.c = j;
        this.d = z;
        this.e = r46Var;
        this.f = e520Var;
    }

    @Override // xsna.wx20
    public final List<e520> a() {
        return Collections.singletonList(this.f);
    }

    @Override // xsna.wx20
    public final void f(Context context, e520 e520Var) {
        dz2 x;
        t6g0 t6g0Var = t6g0.b;
        hwp0 k0 = t6g0.d().k0();
        k0.getClass();
        int i = 2;
        int i2 = 5;
        long j = this.c;
        boolean z = this.d;
        if (z) {
            tfx tfxVar = new tfx("stickers.showUGCKeyboard", new sqe0(3), new hub0(i2));
            tfx.m(tfxVar, "owner_id", j, 0L, 12);
            x = yfb.x(tfxVar);
        } else {
            tfx tfxVar2 = new tfx("stickers.hideUGCKeyboard", new wcl0(0), new gub0(i));
            tfx.m(tfxVar2, "owner_id", j, 0L, 12);
            x = yfb.x(tfxVar2);
        }
        io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(x);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.single.b0 m = w0.m(asu0Var.c()).l(new tj60(new kdw(23), 16)).l(new hkc0(new gwp0(k0, j, z), 7)).m(asu0Var.d());
        r46 r46Var = this.e;
        r46Var.e(m.subscribe(new p41(new qm1(r46Var, i2), 5), new wn(new fj1(i), i2)));
    }
}
