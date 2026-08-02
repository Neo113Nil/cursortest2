package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.buttons.h;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class n4j implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ n4j(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                hVar.d.c("ShareRoute");
                hVar.g.a(hVar.j);
                break;
            case 1:
                hVar.d.c("Cancel");
                ((f) hVar.f).s0(hVar.j);
                break;
            default:
                hVar.d.c("AddTaxi");
                hVar.c.Kg();
                break;
        }
        return zy11Var;
    }
}
