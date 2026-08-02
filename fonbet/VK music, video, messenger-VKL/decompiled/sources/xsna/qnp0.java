package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: TranslateFeatureImpl.kt */
/* loaded from: classes6.dex */
public final class qnp0 extends FragmentManager.m {
    public final /* synthetic */ llp a;
    public final /* synthetic */ FragmentManager b;

    public qnp0(rnp0 rnp0Var, llp llpVar, FragmentManager fragmentManager) {
        this.a = llpVar;
        this.b = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final void a(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof pb20) {
            rnp0.c(fragment.requireContext().getApplicationContext(), fragmentManager, fragment, this.a);
            this.b.r0(this);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final void d(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment instanceof pb20) {
            this.b.r0(this);
        }
    }
}
