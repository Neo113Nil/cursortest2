package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.activation.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class ieg0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ f530 x;
    public final /* synthetic */ int y;

    public /* synthetic */ ieg0(boolean z, boolean z2, sls slsVar, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.w = slsVar;
        this.x = f530Var;
        this.y = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                dda1.e(this.b, this.c, this.w, this.x, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                c.c(this.b, this.c, this.w, this.x, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
