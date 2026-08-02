package xsna;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: MediaRouteControllerDialogFragment.java */
/* loaded from: classes12.dex */
public class uw10 extends androidx.fragment.app.d {
    public final boolean x = false;
    public b33 y;
    public ex10 z;

    public uw10() {
        An(true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b33 b33Var = this.y;
        if (b33Var != null) {
            if (this.x) {
                ((androidx.mediarouter.app.e) b33Var).r();
            } else {
                ((androidx.mediarouter.app.b) b33Var).B();
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        b33 b33Var = this.y;
        if (b33Var == null || this.x) {
            return;
        }
        ((androidx.mediarouter.app.b) b33Var).q(false);
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public final Dialog yn(@Nullable Bundle bundle) {
        if (this.x) {
            androidx.mediarouter.app.e eVar = new androidx.mediarouter.app.e(mo2getContext());
            this.y = eVar;
            eVar.q(this.z);
        } else {
            this.y = new androidx.mediarouter.app.b(mo2getContext());
        }
        return this.y;
    }
}
