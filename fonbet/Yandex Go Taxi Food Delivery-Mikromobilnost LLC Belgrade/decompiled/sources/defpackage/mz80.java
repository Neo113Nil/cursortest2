package defpackage;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.g;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;

/* loaded from: classes13.dex */
public final /* synthetic */ class mz80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mz80(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void a(on70 on70Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                OverdraftContext overdraftContext = (OverdraftContext) obj2;
                g gVar = (g) obj;
                if (on70Var instanceof bz80) {
                    int i2 = nz80.a[overdraftContext.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        gVar.K.b(((bz80) on70Var).a);
                        break;
                    }
                }
                break;
            default:
                com.yandex.go.overdraft.ui.g gVar2 = (com.yandex.go.overdraft.ui.g) obj2;
                Preorder preorder = (Preorder) obj;
                if (gVar2.l.e.a() && !(on70Var instanceof az80)) {
                    preorder.e0 = true;
                }
                if (!(on70Var instanceof bz80)) {
                    if (!(on70Var instanceof cz80)) {
                        if (!(on70Var instanceof zy80) && !(on70Var instanceof az80)) {
                            w511.b();
                            break;
                        } else {
                            gVar2.C.onClose();
                            gVar2.C = com.yandex.go.overdraft.ui.g.E;
                            break;
                        }
                    } else {
                        boolean a = gVar2.l.e.a();
                        hb80 hb80Var = gVar2.C;
                        if (!a) {
                            hb80Var.onClose();
                            gVar2.C = com.yandex.go.overdraft.ui.g.E;
                            break;
                        } else {
                            hb80Var.a();
                            gVar2.C = com.yandex.go.overdraft.ui.g.E;
                            break;
                        }
                    }
                } else {
                    gVar2.o.b(((bz80) on70Var).a);
                    gVar2.C.onClose();
                    gVar2.C = com.yandex.go.overdraft.ui.g.E;
                    break;
                }
                break;
        }
    }
}
