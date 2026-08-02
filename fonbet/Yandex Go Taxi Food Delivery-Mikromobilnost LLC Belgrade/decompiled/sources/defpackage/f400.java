package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class f400 implements wls {
    public final /* synthetic */ zls A;
    public final /* synthetic */ zls B;
    public final /* synthetic */ to5 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ButtonSize x;
    public final /* synthetic */ zls y;
    public final /* synthetic */ zls z;

    public /* synthetic */ f400(sls slsVar, f530 f530Var, boolean z, ButtonSize buttonSize, zls zlsVar, zls zlsVar2, zls zlsVar3, zls zlsVar4, to5 to5Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = slsVar;
        this.c = f530Var;
        this.w = z;
        this.x = buttonSize;
        this.y = zlsVar;
        this.z = zlsVar2;
        this.A = zlsVar3;
        this.B = zlsVar4;
        this.C = to5Var;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.D;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                phb1.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (fid) obj, O, this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                xlb1.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (fid) obj, O2, this.E);
                break;
        }
        return zy11Var;
    }
}
