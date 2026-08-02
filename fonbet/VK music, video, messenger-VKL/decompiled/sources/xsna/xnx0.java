package xsna;

import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import kotlin.NoWhenBranchMatchedException;
import xsna.cox0;
import xsna.vnx0;

/* compiled from: WidgetSettingsFeature.kt */
/* loaded from: classes6.dex */
public final class xnx0 extends wk50<oox0, eox0, vnx0, cox0> {
    public final ynx0 f;
    public final f4z g;

    public xnx0(dox0 dox0Var, ynx0 ynx0Var) {
        super(null, dox0Var);
        this.f = ynx0Var;
        this.g = new f4z();
        this.e.b(ynx0Var.b().subscribe(new dpo0(new efr0(this, 17), 12), new dtb(new t9o0(11), 2)));
        this.e.b(ynx0Var.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new j720(new l9v0(this, 8), 21), new qmm0(new o7j0(21), 1)));
    }

    @Override // xsna.wk50
    public final void N(eox0 eox0Var, vnx0 vnx0Var) {
        vnx0 vnx0Var2 = vnx0Var;
        if (!(vnx0Var2 instanceof vnx0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        WidgetSettingsModalOpenSource widgetSettingsModalOpenSource = ((vnx0.a) vnx0Var2).b;
        T(cox0.a.b.b);
        this.e.b(this.f.j(widgetSettingsModalOpenSource).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qf(new g2h0(17), 6), new f0o0(new jan0(this, 18), 8)));
    }
}
