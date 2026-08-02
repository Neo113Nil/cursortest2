package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d;

/* loaded from: classes11.dex */
public final /* synthetic */ class hp5 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ hp5(int i, int i2, int i3) {
        this.a = 2;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        int i3 = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                jp5.f(i3, vng.O(i2 | 1), fidVar);
                break;
            case 1:
                num.intValue();
                ul91.b(i3, vng.O(i2 | 1), fidVar);
                break;
            default:
                num.getClass();
                d.a(i3, i2, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ hp5(int i, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
