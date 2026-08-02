package defpackage;

import ru.yandex.taxi.communications.ticket.ui.component.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class d3z0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vti0 b;
    public final /* synthetic */ wp2 c;
    public final /* synthetic */ wp2 w;
    public final /* synthetic */ wp2 x;

    public /* synthetic */ d3z0(vti0 vti0Var, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, int i, int i2) {
        this.a = i2;
        this.b = vti0Var;
        this.c = wp2Var;
        this.w = wp2Var2;
        this.x = wp2Var3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                b.b(this.b, this.c, this.w, this.x, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                b.f(this.b, this.c, this.w, this.x, (fid) obj, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(1);
                b.e(this.b, this.c, this.w, this.x, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }
}
