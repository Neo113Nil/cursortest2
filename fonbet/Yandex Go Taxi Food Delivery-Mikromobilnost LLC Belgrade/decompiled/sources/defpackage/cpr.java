package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class cpr implements wls {
    public final /* synthetic */ int A;
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ButtonSize w;
    public final /* synthetic */ sls x;
    public final /* synthetic */ zls y;
    public final /* synthetic */ int z;

    public /* synthetic */ cpr(f530 f530Var, boolean z, ButtonSize buttonSize, sls slsVar, zls zlsVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = f530Var;
        this.c = z;
        this.w = buttonSize;
        this.x = slsVar;
        this.y = zlsVar;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                vpa1.a(this.b, this.c, this.w, this.x, this.y, (fid) obj, O, this.A);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                ohb1.b(this.b, this.c, this.w, this.x, this.y, (fid) obj, O2, this.A);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                ulb1.a(this.b, this.c, this.w, this.x, this.y, (fid) obj, O3, this.A);
                break;
        }
        return zy11Var;
    }
}
