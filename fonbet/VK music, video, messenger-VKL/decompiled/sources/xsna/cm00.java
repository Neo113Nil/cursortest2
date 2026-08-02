package xsna;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cm00 implements izs {
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ im00 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ cm00(double d, double d2, im00 im00Var, boolean z) {
        this.b = d;
        this.c = d2;
        this.d = im00Var;
        this.e = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        oj00 oj00Var = (oj00) obj;
        im00 im00Var = this.d;
        float f = im00Var.s ? oj00Var.h().a.c : 14.0f;
        im00Var.s = true;
        vj00 vj00Var = ofx.a;
        if (vj00Var == null) {
            vj00Var = null;
        }
        vj00Var.getClass();
        CameraPosition.a i = CameraPosition.i();
        i.b(new LatLng(this.b, this.c));
        i.c(f);
        tar0 tar0Var = new tar0(xa4.C(i.a()));
        if (this.e) {
            oj00Var.c(tar0Var);
        } else {
            oj00Var.b(tar0Var);
        }
        im00Var.w = null;
        return s3q0.a;
    }
}
