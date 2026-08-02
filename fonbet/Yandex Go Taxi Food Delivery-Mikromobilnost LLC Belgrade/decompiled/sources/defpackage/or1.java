package defpackage;

import com.yx360.design.compose.atoms.DsDivider$VerticalPadding;

/* loaded from: classes11.dex */
public final /* synthetic */ class or1 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ or1(o4q0 o4q0Var, boolean z, tls tlsVar, int i, int i2) {
        this.y = o4q0Var;
        this.b = z;
        this.c = tlsVar;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                jra1.a((d611) obj4, (f530) obj3, this.b, (fid) obj, O, this.x);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                uo91.a(this.b, (DsDivider$VerticalPadding) obj4, (f530) obj3, (fid) obj, O2, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                x6b1.d((o4q0) obj4, this.b, (tls) obj3, (fid) obj, O3, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ or1(d611 d611Var, f530 f530Var, boolean z, int i, int i2) {
        this.y = d611Var;
        this.c = f530Var;
        this.b = z;
        this.w = i;
        this.x = i2;
    }

    public /* synthetic */ or1(boolean z, DsDivider$VerticalPadding dsDivider$VerticalPadding, f530 f530Var, int i, int i2) {
        this.b = z;
        this.y = dsDivider$VerticalPadding;
        this.c = f530Var;
        this.w = i;
        this.x = i2;
    }
}
