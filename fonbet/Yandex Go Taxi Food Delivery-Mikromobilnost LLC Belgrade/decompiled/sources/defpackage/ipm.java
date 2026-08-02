package defpackage;

import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$State;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class ipm implements wls {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ kk2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ int z;

    public /* synthetic */ ipm(kk2 kk2Var, f530 f530Var, long j, long j2, long j3, sjy0 sjy0Var, long j4, int i, boolean z, int i2, int i3, Map map, tls tlsVar, ety0 ety0Var, int i4) {
        this.b = kk2Var;
        this.D = f530Var;
        this.c = j;
        this.w = j2;
        this.x = j3;
        this.E = sjy0Var;
        this.y = j4;
        this.z = i;
        this.A = z;
        this.B = i2;
        this.C = i3;
        this.F = map;
        this.G = tlsVar;
        this.H = ety0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        Object obj5 = this.F;
        Object obj6 = this.E;
        Object obj7 = this.D;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(this.z | 1);
                int O2 = vng.O(this.B);
                mo91.a(this.b, (DsButton$State) obj7, (DsButton$Size) obj6, (x3) obj5, (x3) obj4, (String) obj3, this.c, this.w, this.x, this.y, this.A, (fid) obj, O, O2, this.C);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(3121);
                jeb1.b(this.b, (f530) obj7, this.c, this.w, this.x, (sjy0) obj6, this.y, this.z, this.A, this.B, this.C, (Map) obj5, (tls) obj4, (ety0) obj3, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ipm(kk2 kk2Var, DsButton$State dsButton$State, DsButton$Size dsButton$Size, x3 x3Var, x3 x3Var2, String str, long j, long j2, long j3, long j4, boolean z, int i, int i2, int i3) {
        this.b = kk2Var;
        this.D = dsButton$State;
        this.E = dsButton$Size;
        this.F = x3Var;
        this.G = x3Var2;
        this.H = str;
        this.c = j;
        this.w = j2;
        this.x = j3;
        this.y = j4;
        this.A = z;
        this.z = i;
        this.B = i2;
        this.C = i3;
    }
}
