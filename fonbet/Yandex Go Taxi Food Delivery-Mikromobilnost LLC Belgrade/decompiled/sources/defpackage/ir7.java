package defpackage;

import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;

/* loaded from: classes7.dex */
public final /* synthetic */ class ir7 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr7 b;
    public final /* synthetic */ CameraPosition c;
    public final /* synthetic */ CameraUpdateReason w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ ir7(jr7 jr7Var, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z, int i) {
        this.a = i;
        this.b = jr7Var;
        this.c = cameraPosition;
        this.w = cameraUpdateReason;
        this.x = z;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                CameraUpdateReason cameraUpdateReason = CameraUpdateReason.GESTURES;
                jr7 jr7Var = this.b;
                CameraUpdateReason cameraUpdateReason2 = this.w;
                boolean z = this.x;
                boolean z2 = cameraUpdateReason2 == cameraUpdateReason && !(jr7Var.f == cameraUpdateReason2 && jl40.l(jr7Var.g, Boolean.valueOf(z)));
                jr7Var.f = cameraUpdateReason2;
                jr7Var.g = Boolean.valueOf(z);
                jr7Var.d.a(new ir7(jr7Var, this.c, cameraUpdateReason2, z, 1), z2);
                break;
            default:
                jr7 jr7Var2 = this.b;
                jr7Var2.c(new ex0(jr7Var2, this.c, this.w, this.x, 5));
                break;
        }
        return zy11Var;
    }
}
