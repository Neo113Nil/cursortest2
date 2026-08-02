package xsna;

import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: VKCameraUpdateFactory.kt */
/* loaded from: classes.dex */
public final class uar0 implements fo9 {
    public static final uar0 a = new uar0();

    @Override // xsna.fo9
    public final tar0 a(fk9 fk9Var) {
        return new tar0(xa4.C(((sar0) fk9Var).b()));
    }

    @Override // xsna.fo9
    public final tar0 b(int i, u9h0 u9h0Var) {
        return new tar0(xa4.E(new LatLngBounds(edi.B(u9h0Var.c()), edi.B(u9h0Var.b())), i));
    }
}
