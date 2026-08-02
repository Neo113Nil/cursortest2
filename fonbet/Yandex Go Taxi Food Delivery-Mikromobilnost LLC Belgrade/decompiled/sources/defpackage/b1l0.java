package defpackage;

import ru.yandex.taxi.widget.EditRoutePointModalView;

/* loaded from: classes14.dex */
public final class b1l0 extends m230 {
    public final w030 E;
    public EditRoutePointModalView F;
    public final boolean G;
    public final /* synthetic */ k1l0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1l0(k1l0 k1l0Var, w030 w030Var) {
        super(null);
        this.H = k1l0Var;
        this.E = w030Var;
        this.G = true;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        mnn mnnVar = (mnn) obj;
        super.G(mnnVar);
        EditRoutePointModalView editRoutePointModalView = this.F;
        if (editRoutePointModalView != null) {
            String str = mnnVar.a;
            if (str == null) {
                str = "";
            }
            editRoutePointModalView.setAddress(str);
            editRoutePointModalView.setCanChange(mnnVar.b);
            editRoutePointModalView.setCanRemove(mnnVar.c);
            editRoutePointModalView.setUiListener(new a1l0(this));
            return;
        }
        a3y0 a3y0Var = this.H.N;
        String l = a3y0Var.l(new String[]{"EditMidPointModalRouter", "onAttach"});
        hst hstVar = jst.e;
        String str2 = a3y0Var.a;
        hstVar.getClass();
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a != null && a.b(15)) {
            a.a(15, str2, null, "couldn't be launched, modalView is null", m.a);
        }
        r(new qu(9));
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        super.H((mnn) obj);
        this.F = null;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        EditRoutePointModalView editRoutePointModalView = new EditRoutePointModalView(this.H.D, null, 2, 0 == true ? 1 : 0);
        this.F = editRoutePointModalView;
        return editRoutePointModalView;
    }
}
