package yads;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class j42 implements z00 {
    public final f2 a;
    public final ny0 b;

    public j42(q2 q2Var, ny0 ny0Var) {
        this.a = q2Var;
        this.b = ny0Var;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", j5Var);
        ((q2) this.a).a(16, bundle);
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        qu2 qu2Var = this.b.a;
        if (qu2Var == null || qu2Var.t) {
            return;
        }
        ((q2) this.a).a.finish();
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        ((q2) this.a).a(17, null);
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        ((q2) this.a).a(18, null);
    }

    @Override // yads.z00
    public final void onAdClicked() {
    }
}
