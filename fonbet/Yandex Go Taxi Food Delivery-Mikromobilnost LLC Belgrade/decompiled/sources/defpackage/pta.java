package defpackage;

import com.yandex.go.chargers.subscription.presentation.landing.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class pta implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;

    public /* synthetic */ pta(f530 f530Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = f530Var;
        this.c = i;
        this.w = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        int i3 = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c.d(vng.O(i3 | 1), i2, fidVar, f530Var);
                break;
            case 1:
                yrl.b(vng.O(i3 | 1), i2, fidVar, f530Var);
                break;
            case 2:
                pmb1.d(vng.O(i3 | 1), i2, fidVar, f530Var);
                break;
            default:
                d5b1.d(vng.O(i3 | 1), i2, fidVar, f530Var);
                break;
        }
        return zy11Var;
    }
}
