package defpackage;

import com.yandex.go.navigator.alt_select.new_summary.a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class gg50 implements sy60 {
    public final /* synthetic */ a a;

    public gg50(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        n1();
        this.a.r(new qu(9));
    }

    public final void n1() {
        Object value;
        pe50 pe50Var;
        a aVar = this.a;
        lg50 lg50Var = aVar.G;
        if (!aVar.H.a()) {
            aVar.O.a(null);
            r0 r0Var = aVar.F.b;
            do {
                value = r0Var.getValue();
                pe50Var = (pe50) value;
            } while (!r0Var.k(value, pe50Var != null ? pe50.a(pe50Var, null, EmptyList.a, 1) : null));
            return;
        }
        pe50 pe50Var2 = lg50Var.d;
        if (pe50Var2 != null) {
            lg50Var.a.b.l(pe50Var2);
        }
        lg50Var.b.a(lg50Var.c.a());
        lg50Var.d = null;
        lg50Var.e = false;
        aVar.L.d();
    }

    public final void o1() {
        a aVar = this.a;
        aVar.R(((avj0) aVar.J).h(kyh0.add_route_stop), new uhu0(wgu0.a), null);
    }
}
