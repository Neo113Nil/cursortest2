package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class a740 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wp2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ a740(wp2 wp2Var, int i) {
        this.b = wp2Var;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        wp2 wp2Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                b.h(wp2Var, fidVar, vng.O(1), i2);
                break;
            default:
                num.intValue();
                ru.yandex.taxi.communications.ticket.ui.component.b.a(wp2Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a740(wp2 wp2Var, int i, int i2) {
        this.b = wp2Var;
        this.c = i2;
    }
}
