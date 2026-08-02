package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.lifecycle.m;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class bft0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ bft0(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.e.q(((pv0) obj).a);
                break;
            default:
                Address h = mVar.e.c().h();
                if (h != null && mVar.e.c().b.isEmpty() && !((ry41) mVar.c).f()) {
                    ((gh00) mVar.a).G(h.B());
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
