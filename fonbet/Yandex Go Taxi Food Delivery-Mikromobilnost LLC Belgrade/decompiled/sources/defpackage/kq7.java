package defpackage;

import androidx.compose.runtime.internal.a;
import ru.yandex.logistics.care.camera.data.BackgroundVisibility;

/* loaded from: classes7.dex */
public final /* synthetic */ class kq7 implements wls {
    public final /* synthetic */ cms A;
    public final /* synthetic */ f530 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ kq7(f530 f530Var, boolean z, zx01 zx01Var, v2o v2oVar, ymo ymoVar, boolean z2, boolean z3, zls zlsVar, a aVar, int i) {
        this.a = 3;
        this.B = f530Var;
        this.b = z;
        this.x = zx01Var;
        this.y = v2oVar;
        this.z = ymoVar;
        this.c = z2;
        this.w = z3;
        this.A = zlsVar;
        this.C = aVar;
        this.D = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.D;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.C;
        cms cmsVar = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(12582913);
                mt71.a(this.b, this.c, this.w, (String) obj6, (ozd) obj5, (pzd) obj4, (tls) cmsVar, this.B, this.D, (BackgroundVisibility) obj3, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                mt71.b(this.b, this.c, this.w, (String) obj6, (ozd) obj5, (pzd) obj4, (tls) cmsVar, this.B, (BackgroundVisibility) obj3, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                mt71.c(this.b, this.c, this.w, (String) obj6, (ozd) obj5, (pzd) obj4, (tls) cmsVar, this.B, (BackgroundVisibility) obj3, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                cx20.b(this.B, this.b, (zx01) obj6, (v2o) obj5, (ymo) obj4, this.c, this.w, (zls) cmsVar, (a) obj3, (fid) obj, O4);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ kq7(boolean z, boolean z2, boolean z3, String str, ozd ozdVar, pzd pzdVar, tls tlsVar, f530 f530Var, int i, BackgroundVisibility backgroundVisibility, int i2) {
        this.a = 0;
        this.b = z;
        this.c = z2;
        this.w = z3;
        this.x = str;
        this.y = ozdVar;
        this.z = pzdVar;
        this.A = tlsVar;
        this.B = f530Var;
        this.D = i;
        this.C = backgroundVisibility;
    }

    public /* synthetic */ kq7(boolean z, boolean z2, boolean z3, String str, ozd ozdVar, pzd pzdVar, tls tlsVar, f530 f530Var, BackgroundVisibility backgroundVisibility, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.w = z3;
        this.x = str;
        this.y = ozdVar;
        this.z = pzdVar;
        this.A = tlsVar;
        this.B = f530Var;
        this.C = backgroundVisibility;
        this.D = i;
    }
}
