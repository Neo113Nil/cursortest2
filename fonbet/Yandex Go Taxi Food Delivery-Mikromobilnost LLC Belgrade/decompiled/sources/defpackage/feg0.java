package defpackage;

import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class feg0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ sls x;

    public /* synthetic */ feg0(f530 f530Var, String str, boolean z, sls slsVar) {
        this.b = f530Var;
        this.c = str;
        this.w = z;
        this.x = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dda1.d(vng.O(1), (fid) obj, this.x, this.b, this.c, this.w);
                break;
            case 1:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    a.d(0, btsVar, this.x, this.b, this.c, this.w);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                a.d(vng.O(1), (fid) obj, this.x, this.b, this.c, this.w);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ feg0(f530 f530Var, String str, boolean z, sls slsVar, int i) {
        this.b = f530Var;
        this.c = str;
        this.w = z;
        this.x = slsVar;
    }

    public /* synthetic */ feg0(String str, sls slsVar, f530 f530Var, boolean z, int i) {
        this.c = str;
        this.x = slsVar;
        this.b = f530Var;
        this.w = z;
    }
}
