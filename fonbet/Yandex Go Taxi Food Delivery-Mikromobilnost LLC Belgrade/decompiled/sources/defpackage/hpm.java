package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class hpm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ int w;

    public /* synthetic */ hpm(long j, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = f530Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        f530 f530Var = this.c;
        long j = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                mo91.b(vng.O(i2 | 1), j, fidVar, f530Var);
                break;
            case 1:
                b.d(vng.O(i2 | 1), j, fidVar, f530Var);
                break;
            default:
                r4z0.h(vng.O(i2 | 1), j, fidVar, f530Var);
                break;
        }
        return zy11Var;
    }
}
