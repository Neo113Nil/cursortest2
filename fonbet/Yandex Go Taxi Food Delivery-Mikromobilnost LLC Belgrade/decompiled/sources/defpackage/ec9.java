package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.fragment.MapFragment;

/* loaded from: classes12.dex */
public final class ec9 extends MapFragment.a {
    public final /* synthetic */ fc9 a;
    public final /* synthetic */ o2y0 b;

    public ec9(fc9 fc9Var, o2y0 o2y0Var) {
        this.a = fc9Var;
        this.b = o2y0Var;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        fc9 fc9Var = this.a;
        sls slsVar = ((ag9) fc9Var.I).a;
        if (slsVar != null) {
            slsVar.invoke();
        }
        fc9Var.r(new qu(9));
    }

    @Override // defpackage.si00
    public final void h(String str) {
        fc9 fc9Var = this.a;
        bg9 bg9Var = (bg9) fc9Var.H;
        bg9Var.a.invoke(this.b, str);
        fc9Var.r(new qu(9));
    }
}
