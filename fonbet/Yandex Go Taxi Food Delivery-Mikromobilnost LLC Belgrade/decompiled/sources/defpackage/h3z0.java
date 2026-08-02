package defpackage;

import com.yandex.go.taxi.summary.verticalsummary.ui.i;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;
import ru.yandex.taxi.communications.ticket.ui.component.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class h3z0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ h3z0(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, c36 c36Var, int i) {
        this.b = f530Var;
        this.w = jt1Var;
        this.x = nheVar;
        this.c = f;
        this.y = c36Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(24583);
                c.b((f530) obj6, (TicketTopAsset) obj5, this.c, (byk0) obj4, (sls) obj3, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                j76.f((f530) obj6, (jt1) obj5, (nhe) obj4, this.c, (c36) obj3, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(3505);
                i.b((lx40) obj6, (qor) obj5, (qor) obj4, (qor) obj3, this.c, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ h3z0(f530 f530Var, TicketTopAsset ticketTopAsset, float f, byk0 byk0Var, sls slsVar, int i) {
        this.b = f530Var;
        this.w = ticketTopAsset;
        this.c = f;
        this.x = byk0Var;
        this.y = slsVar;
    }

    public /* synthetic */ h3z0(lx40 lx40Var, qor qorVar, qor qorVar2, qor qorVar3, float f, int i) {
        this.b = lx40Var;
        this.w = qorVar;
        this.x = qorVar2;
        this.y = qorVar3;
        this.c = f;
    }
}
