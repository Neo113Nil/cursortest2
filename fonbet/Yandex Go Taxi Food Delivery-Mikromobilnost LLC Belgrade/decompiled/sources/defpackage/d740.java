package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class d740 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wti0 b;

    public /* synthetic */ d740(wti0 wti0Var, int i, int i2) {
        this.a = i2;
        this.b = wti0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wti0 wti0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b.b(wti0Var, fidVar, vng.O(1));
                break;
            case 1:
                b.a(wti0Var, fidVar, vng.O(1));
                break;
            default:
                b.c(wti0Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
