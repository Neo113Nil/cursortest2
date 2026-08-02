package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class c980 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d980 b;

    public /* synthetic */ c980(d980 d980Var, int i) {
        this.a = i;
        this.b = d980Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String e;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d980 d980Var = this.b;
        switch (i) {
            case 0:
                d980Var.t = (q48) obj;
                d980Var.a();
                break;
            case 1:
                d980Var.q = (lez0) obj;
                d980Var.a();
                break;
            case 2:
                d980Var.v = (TaxiOrder) obj;
                d980Var.z.cancel();
                String f = d980Var.b().f();
                if ((f != null && f.length() != 0) || ((e = d980Var.b().e()) != null && e.length() != 0)) {
                    d980Var.y.run();
                    break;
                } else {
                    d980Var.a();
                    break;
                }
            default:
                CharSequence charSequence = (CharSequence) obj;
                if (!jl40.l(charSequence, d980Var.w)) {
                    d980Var.w = charSequence;
                    d980Var.a();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
