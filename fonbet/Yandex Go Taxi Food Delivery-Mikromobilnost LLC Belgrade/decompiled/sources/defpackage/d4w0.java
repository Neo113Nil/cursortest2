package defpackage;

import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.c;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;

/* loaded from: classes12.dex */
public final /* synthetic */ class d4w0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ k9s0 c;

    public /* synthetic */ d4w0(c cVar, k9s0 k9s0Var, int i) {
        this.a = i;
        this.b = cVar;
        this.c = k9s0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k9s0 k9s0Var = this.c;
        c cVar = this.b;
        Preorder preorder = (Preorder) obj;
        switch (i) {
            case 0:
                cVar.f(preorder, k9s0Var);
                break;
            default:
                cVar.f(preorder, k9s0Var);
                break;
        }
        return zy11Var;
    }
}
