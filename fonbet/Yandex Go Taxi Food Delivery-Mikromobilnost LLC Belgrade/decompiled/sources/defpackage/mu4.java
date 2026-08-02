package defpackage;

import java.util.Arrays;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.communications.api.dto.ticket.a;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes5.dex */
public final /* synthetic */ class mu4 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a b;
    public final /* synthetic */ c c;

    public /* synthetic */ mu4(c cVar, a aVar) {
        this.c = cVar;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                duc ducVar = cVar.i;
                ((dae0) ducVar.a).d(aVar.b);
                break;
            default:
                vby vbyVar = xby.d;
                String.format("show ticket banner %s", Arrays.copyOf(new Object[]{aVar.b}, 1));
                vbyVar.getClass();
                cVar.b.k(aVar.b, null, Promotion.Type.TICKET, Promotion.a.contains(aVar.m()), cVar.r, aVar.f);
                rfw0 rfw0Var = cVar.k;
                mu4 mu4Var = new mu4(cVar, aVar);
                ((pep0) ((oep0) rfw0Var.a)).f(new uva(13, (p2z0) ((yvf0) rfw0Var.b).get(), mu4Var), new o2z0(aVar, null), hxx.a);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mu4(a aVar, c cVar) {
        this.b = aVar;
        this.c = cVar;
    }
}
