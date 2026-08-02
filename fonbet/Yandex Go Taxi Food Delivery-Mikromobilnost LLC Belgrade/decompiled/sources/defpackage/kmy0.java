package defpackage;

import androidx.compose.material.TextFieldType;
import androidx.compose.material.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class kmy0 implements wls {
    public final /* synthetic */ wls A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ h8w E;
    public final /* synthetic */ j690 F;
    public final /* synthetic */ ehr0 G;
    public final /* synthetic */ jmy0 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ wls c;
    public final /* synthetic */ gy31 w;
    public final /* synthetic */ wls x;
    public final /* synthetic */ wls y;
    public final /* synthetic */ wls z;

    public /* synthetic */ kmy0(omy0 omy0Var, String str, wls wlsVar, boolean z, boolean z2, gy31 gy31Var, h8w h8wVar, boolean z3, wls wlsVar2, wls wlsVar3, wls wlsVar4, wls wlsVar5, ehr0 ehr0Var, jmy0 jmy0Var, j690 j690Var, int i, int i2) {
        this.K = omy0Var;
        this.b = str;
        this.c = wlsVar;
        this.B = z;
        this.C = z2;
        this.w = gy31Var;
        this.E = h8wVar;
        this.D = z3;
        this.x = wlsVar2;
        this.y = wlsVar3;
        this.z = wlsVar4;
        this.A = wlsVar5;
        this.G = ehr0Var;
        this.H = jmy0Var;
        this.F = j690Var;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.I;
        Object obj3 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                ((omy0) obj3).d(this.b, this.c, this.B, this.C, this.w, this.E, this.D, this.x, this.y, this.z, this.A, this.G, this.H, this.F, (fid) obj, O, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                int O3 = vng.O(this.J);
                a.b((TextFieldType) obj3, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (fid) obj, O2, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ kmy0(TextFieldType textFieldType, String str, wls wlsVar, gy31 gy31Var, wls wlsVar2, wls wlsVar3, wls wlsVar4, wls wlsVar5, boolean z, boolean z2, boolean z3, h8w h8wVar, j690 j690Var, ehr0 ehr0Var, jmy0 jmy0Var, int i, int i2) {
        this.K = textFieldType;
        this.b = str;
        this.c = wlsVar;
        this.w = gy31Var;
        this.x = wlsVar2;
        this.y = wlsVar3;
        this.z = wlsVar4;
        this.A = wlsVar5;
        this.B = z;
        this.C = z2;
        this.D = z3;
        this.E = h8wVar;
        this.F = j690Var;
        this.G = ehr0Var;
        this.H = jmy0Var;
        this.I = i;
        this.J = i2;
    }
}
