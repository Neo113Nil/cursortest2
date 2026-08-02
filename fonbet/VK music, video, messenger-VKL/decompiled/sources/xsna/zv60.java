package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: NewsfeedPreloadController.kt */
/* loaded from: classes4.dex */
public final class zv60 implements obs {
    public final /* synthetic */ aw60 b;
    public final /* synthetic */ mbs c;

    public zv60(aw60 aw60Var, mbs mbsVar) {
        this.b = aw60Var;
        this.c = mbsVar;
    }

    @Override // xsna.obs
    public final void onDestroy() {
        x0d0 x0d0Var = this.b.a;
        ly3 ly3Var = x0d0Var.b;
        ly3Var.a.e();
        com.vk.mvi.core.internal.executors.a.c(new h20(ly3Var, 3));
        x0d0Var.e.a();
        x0d0Var.f.c();
        this.c.d(this);
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        aw60 aw60Var = this.b;
        ef90 ef90Var = aw60Var.b;
        if (ef90Var != null) {
            aw60Var.a.g.m(ef90Var);
        }
        k5r0 k5r0Var = aw60Var.c;
        if (k5r0Var != null) {
            aw60Var.a.g.m(k5r0Var);
        }
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onPause() {
    }

    @Override // xsna.obs
    public final void onResume() {
    }

    @Override // xsna.obs
    public final void onStop() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
