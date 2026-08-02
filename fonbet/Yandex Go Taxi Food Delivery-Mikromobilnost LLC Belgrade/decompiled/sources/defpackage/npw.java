package defpackage;

import com.yandex.go.taxi.order.models.api.status.RequiredCardBalance;
import com.yandex.go.taxi.order.models.api.status.RequiredYangopayBalance;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes14.dex */
public final class npw extends iw40 {
    public final w030 c;
    public final hq70 w;
    public final vpw x;

    public npw(MainActivity mainActivity, a980 a980Var, w030 w030Var, hq70 hq70Var, vpw vpwVar) {
        super(mainActivity, a980Var);
        this.c = w030Var;
        this.w = hq70Var;
        this.x = vpwVar;
    }

    @Override // defpackage.lit
    public final void Qe(o2y0 o2y0Var, boolean z) {
        hq70 hq70Var = this.w;
        hq70Var.getClass();
        hq70Var.a(new xp70(o2y0Var, z));
        this.x.invoke();
    }

    @Override // defpackage.lit
    public final void S0(o2y0 o2y0Var) {
        hq70 hq70Var = this.w;
        hq70Var.getClass();
        hq70Var.a(new sp70(o2y0Var));
        this.x.invoke();
    }

    @Override // defpackage.sdj
    public final qdj h(tdj tdjVar, ModalView modalView) {
        this.c.s(modalView, true);
        return new mpw(modalView, 0);
    }

    @Override // defpackage.lit
    public final void lg(o2y0 o2y0Var) {
        hq70 hq70Var = this.w;
        hq70Var.getClass();
        hq70Var.a(new wp70(o2y0Var));
        this.x.invoke();
    }

    @Override // defpackage.lit
    public final void openOrderPaymentMethods(o2y0 o2y0Var) {
        hq70 hq70Var = this.w;
        hq70Var.getClass();
        hq70Var.a(new tp70(o2y0Var));
        this.x.invoke();
    }

    @Override // defpackage.lit
    public final void p3(o2y0 o2y0Var, RequiredYangopayBalance requiredYangopayBalance, boolean z) {
        hq70 hq70Var = this.w;
        hq70Var.getClass();
        hq70Var.a(new vp70(o2y0Var, requiredYangopayBalance, z));
        this.x.invoke();
    }

    @Override // defpackage.lit
    public final void ug(o2y0 o2y0Var, RequiredCardBalance requiredCardBalance, be9 be9Var) {
        hq70 hq70Var = this.w;
        hq70Var.getClass();
        hq70Var.a(new up70(o2y0Var, requiredCardBalance, be9Var));
        this.x.invoke();
    }
}
