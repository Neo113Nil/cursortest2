package xsna;

import android.net.Uri;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y5z implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ y5z(Uri uri, int i) {
        this.b = i;
        this.c = uri;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.e(new yh1(new vex(this.c, 2), 20)), io.reactivex.rxjava3.internal.functions.a.g);
            default:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                kg90 kg90Var = feh0.d;
                if (kg90Var == null) {
                    kg90Var = null;
                }
                kg90Var.getClass();
                feh0.d(this.c, kg90.a(kg90Var, 0, 7));
                return s3q0.a;
        }
    }
}
