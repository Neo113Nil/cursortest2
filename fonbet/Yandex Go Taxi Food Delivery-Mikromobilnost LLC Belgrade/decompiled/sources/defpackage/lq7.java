package defpackage;

import ru.yandex.logistics.care.camera.data.BackgroundVisibility;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.header.d;

/* loaded from: classes11.dex */
public final /* synthetic */ class lq7 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ lq7(long j, BackgroundVisibility backgroundVisibility, f530 f530Var, int i) {
        this.b = j;
        this.w = backgroundVisibility;
        this.x = f530Var;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        Object obj3 = this.w;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                mt71.i(this.b, (BackgroundVisibility) obj3, (f530) obj4, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int O2 = vng.O(i2 | 1);
                d.c((vs0) obj3, this.b, (sls) obj4, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                gpb1.b((f530) obj4, this.b, (zls) obj3, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ lq7(vs0 vs0Var, long j, sls slsVar, int i) {
        this.w = vs0Var;
        this.b = j;
        this.x = slsVar;
        this.c = i;
    }

    public /* synthetic */ lq7(f530 f530Var, long j, zls zlsVar, int i) {
        this.x = f530Var;
        this.b = j;
        this.w = zlsVar;
        this.c = i;
    }
}
