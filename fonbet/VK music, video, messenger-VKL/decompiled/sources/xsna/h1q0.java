package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* compiled from: UiTrackingFragmentStateAdapter.kt */
/* loaded from: classes17.dex */
public final class h1q0 implements obs {
    public final /* synthetic */ k1q0 b;

    public h1q0(k1q0 k1q0Var) {
        this.b = k1q0Var;
    }

    @Override // xsna.obs
    public final void onResume() {
        k1q0 k1q0Var = this.b;
        int i = k1q0Var.n;
        if (i == -1) {
            return;
        }
        try {
            Fragment F0 = k1q0Var.F0(i);
            if (F0 == null) {
                F0 = k1q0Var.z0(i);
            }
            if (k1q0Var.q) {
                if ((F0 instanceof v0q0) && !((v0q0) F0).sk()) {
                    return;
                }
                if ((F0 instanceof o0q0) && ((o0q0) F0).getUiTrackingFragment() == null) {
                    return;
                }
            } else if ((F0 instanceof v0q0) && !((v0q0) F0).sk()) {
                return;
            }
            a2q0.a.getClass();
            k1q0Var.l.post(new hv2(a2q0.c(F0), 16));
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException unused) {
        }
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onDestroy() {
    }

    @Override // xsna.obs
    public final void onDestroyView() {
    }

    @Override // xsna.obs
    public final void onPause() {
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
