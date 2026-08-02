package defpackage;

import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;

/* loaded from: classes4.dex */
public final /* synthetic */ class mpm implements wls {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int a;
    public final /* synthetic */ kk2 b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ DsButton$Style w;
    public final /* synthetic */ f530 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ DsButton$Size z;

    public /* synthetic */ mpm(kk2 kk2Var, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, boolean z, DsButton$Size dsButton$Size, Object obj, Object obj2, String str, boolean z2, String str2, boolean z3, int i, int i2, int i3) {
        this.a = i3;
        this.b = kk2Var;
        this.c = slsVar;
        this.w = dsButton$Style;
        this.x = f530Var;
        this.y = z;
        this.z = dsButton$Size;
        this.G = obj;
        this.H = obj2;
        this.A = str;
        this.B = z2;
        this.C = str2;
        this.D = z3;
        this.E = i;
        this.F = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.F;
        int i3 = this.E;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i3 | 1);
                int O2 = vng.O(i2);
                po91.b(this.b, this.c, this.w, this.x, this.y, this.z, (pa90) obj4, (pa90) obj3, this.A, this.B, this.C, this.D, (fid) obj, O, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i3 | 1);
                int O4 = vng.O(i2);
                po91.a(this.b, this.c, this.w, this.x, this.y, this.z, (x3) obj4, (x3) obj3, this.A, this.B, this.C, this.D, (fid) obj, O3, O4);
                break;
        }
        return zy11Var;
    }
}
