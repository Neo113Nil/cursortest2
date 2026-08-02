package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class o9n implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ bdz0 c;

    public /* synthetic */ o9n(f530 f530Var, bdz0 bdz0Var, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = bdz0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bdz0 bdz0Var = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.c(f530Var, bdz0Var, fidVar, vng.O(7));
                break;
            case 1:
                a.a(f530Var, bdz0Var, fidVar, vng.O(7));
                break;
            default:
                a.f(f530Var, bdz0Var, fidVar, vng.O(7));
                break;
        }
        return zy11Var;
    }
}
