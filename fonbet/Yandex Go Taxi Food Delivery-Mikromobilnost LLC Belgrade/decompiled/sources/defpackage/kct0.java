package defpackage;

import ru.yandex.taxi.masstransit.ui.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class kct0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nvi0 b;
    public final /* synthetic */ au2 c;
    public final /* synthetic */ int w;

    public /* synthetic */ kct0(nvi0 nvi0Var, au2 au2Var, int i, int i2) {
        this.a = i2;
        this.b = nvi0Var;
        this.c = au2Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        au2 au2Var = this.c;
        nvi0 nvi0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.c(nvi0Var, au2Var, fidVar, vng.O(i2 | 1));
                break;
            default:
                a.d(nvi0Var, au2Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
