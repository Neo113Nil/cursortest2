package defpackage;

import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;

/* loaded from: classes4.dex */
public final /* synthetic */ class fpm implements wls {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a;
    public final /* synthetic */ kk2 b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ DsButton$Style w;
    public final /* synthetic */ f530 x;
    public final /* synthetic */ DsButton$Size y;
    public final /* synthetic */ String z;

    public /* synthetic */ fpm(kk2 kk2Var, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, DsButton$Size dsButton$Size, Object obj, Object obj2, String str, boolean z, String str2, boolean z2, int i, int i2, int i3) {
        this.a = i3;
        this.b = kk2Var;
        this.c = slsVar;
        this.w = dsButton$Style;
        this.x = f530Var;
        this.y = dsButton$Size;
        this.F = obj;
        this.G = obj2;
        this.z = str;
        this.A = z;
        this.B = str2;
        this.C = z2;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.E;
        int i3 = this.D;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i3 | 1);
                int O2 = vng.O(i2);
                mo91.c(this.b, this.c, this.w, this.x, this.y, (x3) obj4, (x3) obj3, this.z, this.A, this.B, this.C, (fid) obj, O, O2);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i3 | 1);
                int O4 = vng.O(i2);
                mo91.d(this.b, this.c, this.w, this.x, this.y, (pa90) obj4, (pa90) obj3, this.z, this.A, this.B, this.C, (fid) obj, O3, O4);
                break;
        }
        return zy11Var;
    }
}
