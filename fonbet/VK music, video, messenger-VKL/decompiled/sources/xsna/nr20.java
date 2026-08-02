package xsna;

import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import kotlin.NoWhenBranchMatchedException;
import xsna.sr20;
import xsna.tr20;
import xsna.ur20;
import xsna.uu1;

/* compiled from: MiniWidgetSettingsTabFeature.kt */
/* loaded from: classes6.dex */
public final class nr20 extends wk50<wr20, vr20, tr20, ur20> {
    public final ynx0 f;
    public final f4z g;

    public nr20(rr20 rr20Var, ynx0 ynx0Var) {
        super(null, rr20Var);
        this.f = ynx0Var;
        this.g = new f4z();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(ynx0Var.b(), new nm3(new c220(2), 20));
        m1r m1rVar = new m1r(new bjk(this, 20), 7);
        new l8k(19);
        this.e.b(i0Var.subscribe(m1rVar, new mr20()));
    }

    @Override // xsna.wk50
    public final void N(vr20 vr20Var, tr20 tr20Var) {
        tr20 tr20Var2 = tr20Var;
        boolean equals = tr20Var2.equals(tr20.b.b);
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        ynx0 ynx0Var = this.f;
        if (equals) {
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.c0(ynx0Var.k(), new j50(new eqq(this, 18), 27), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new sh6(new dkg(this, 28), 21), new btb(new z7w(4), 2)));
            return;
        }
        if (tr20Var2.equals(tr20.e.b)) {
            bVar.b(itg0.m(ynx0Var.j(WidgetSettingsModalOpenSource.ERROR_DIALOG)));
            return;
        }
        if (tr20Var2 instanceof tr20.c) {
            uu1.b a = ynx0Var.a(((tr20.c) tr20Var2).b);
            if (a != null) {
                T(new ur20.a.d(a, true));
                return;
            }
            return;
        }
        if (tr20Var2 instanceof tr20.d) {
            uu1.b e = ynx0Var.e(((tr20.d) tr20Var2).b);
            if (e != null) {
                T(new ur20.a.d(e, false));
                return;
            }
            return;
        }
        if (tr20Var2 instanceof tr20.g) {
            ynx0Var.g(((tr20.g) tr20Var2).b);
            return;
        }
        if (tr20Var2 instanceof tr20.a) {
            String str = ((tr20.a) tr20Var2).b;
            this.g.b(epx.f(str, SuperAppMiniWidgetItemDto.TypeDto.MW_STEPS.i()) ? sr20.c.a : epx.f(str, SuperAppMiniWidgetItemDto.TypeDto.MW_MUSIC.i()) ? sr20.b.a : sr20.a.a);
        } else {
            if (!tr20Var2.equals(tr20.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ynx0Var.i();
        }
    }
}
