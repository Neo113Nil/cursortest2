package defpackage;

import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;

/* loaded from: classes11.dex */
public final /* synthetic */ class gj9 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ gj9(f530 f530Var, f530 f530Var2, z8m z8mVar, int i, boolean z, boolean z2, sls slsVar, sls slsVar2, int i2, int i3) {
        this.b = f530Var;
        this.A = f530Var2;
        this.B = z8mVar;
        this.c = i;
        this.w = z;
        this.x = z2;
        this.C = slsVar;
        this.D = slsVar2;
        this.y = i2;
        this.z = i3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.A;
        Object obj6 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                zgb1.a((CharSequence) obj5, this.b, this.c, this.w, (String) obj6, (so31) obj4, this.x, (w4a1) obj3, (fid) obj, O, this.z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                ul91.a(this.b, (f530) obj5, (z8m) obj6, this.c, this.w, this.x, (sls) obj4, (sls) obj3, (fid) obj, O2, this.z);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(this.c | 1);
                int O4 = vng.O(i2);
                po91.c((String) obj6, (sls) obj5, (DsButton$Style) obj4, this.b, this.w, (DsButton$Size) obj3, this.x, (fid) obj, O3, O4, this.z);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ gj9(CharSequence charSequence, f530 f530Var, int i, boolean z, String str, so31 so31Var, boolean z2, w4a1 w4a1Var, int i2, int i3) {
        this.A = charSequence;
        this.b = f530Var;
        this.c = i;
        this.w = z;
        this.B = str;
        this.C = so31Var;
        this.x = z2;
        this.D = w4a1Var;
        this.y = i2;
        this.z = i3;
    }

    public /* synthetic */ gj9(String str, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, boolean z, DsButton$Size dsButton$Size, boolean z2, int i, int i2, int i3) {
        this.B = str;
        this.A = slsVar;
        this.C = dsButton$Style;
        this.b = f530Var;
        this.w = z;
        this.D = dsButton$Size;
        this.x = z2;
        this.c = i;
        this.y = i2;
        this.z = i3;
    }
}
