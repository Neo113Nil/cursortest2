package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g0;
import defpackage.pbs;

/* loaded from: classes.dex */
public final class h extends pbs {
    public final /* synthetic */ Fragment a;

    public h(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.pbs
    public final void a() {
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a.a();
        g0.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
