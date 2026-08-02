package defpackage;

import com.yandex.passport.internal.flags.presentation.c1;

/* loaded from: classes5.dex */
public final /* synthetic */ class gk11 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ gk11(f530 f530Var, mie mieVar, wp2 wp2Var, int i, int i2) {
        this.a = 1;
        this.b = f530Var;
        this.x = mieVar;
        this.y = wp2Var;
        this.c = i;
        this.w = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                ik11.a((wls) obj4, (wls) obj3, this.b, (fid) obj, O, this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                a8a1.f(this.b, (mie) obj4, (wp2) obj3, (fid) obj, O2, this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                c1.k((tls) obj4, (sls) obj3, this.b, (fid) obj, O3, this.w);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ gk11(cms cmsVar, cms cmsVar2, f530 f530Var, int i, int i2, int i3) {
        this.a = i3;
        this.x = cmsVar;
        this.y = cmsVar2;
        this.b = f530Var;
        this.c = i;
        this.w = i2;
    }
}
