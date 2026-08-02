package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.core.app.t0;
import androidx.core.app.u0;
import androidx.lifecycle.Lifecycle;
import defpackage.an10;
import defpackage.b170;
import defpackage.e9e;
import defpackage.g2m0;
import defpackage.gcs;
import defpackage.hds;
import defpackage.j2m0;
import defpackage.qs31;
import defpackage.qx60;
import defpackage.rk10;
import defpackage.rs31;
import defpackage.rx60;
import defpackage.t50;
import defpackage.x50;
import defpackage.xx60;

/* loaded from: classes.dex */
public final class l extends gcs implements xx60, b170, t0, u0, rs31, rx60, x50, j2m0, hds, rk10 {
    public final /* synthetic */ FragmentActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.x = fragmentActivity;
    }

    @Override // defpackage.hds
    public final void a(Fragment fragment) {
        this.x.onAttachFragment(fragment);
    }

    @Override // defpackage.rk10
    public final void addMenuProvider(an10 an10Var) {
        this.x.addMenuProvider(an10Var);
    }

    @Override // defpackage.xx60
    public final void addOnConfigurationChangedListener(e9e e9eVar) {
        this.x.addOnConfigurationChangedListener(e9eVar);
    }

    @Override // androidx.core.app.t0
    public final void addOnMultiWindowModeChangedListener(e9e e9eVar) {
        this.x.addOnMultiWindowModeChangedListener(e9eVar);
    }

    @Override // androidx.core.app.u0
    public final void addOnPictureInPictureModeChangedListener(e9e e9eVar) {
        this.x.addOnPictureInPictureModeChangedListener(e9eVar);
    }

    @Override // defpackage.b170
    public final void addOnTrimMemoryListener(e9e e9eVar) {
        this.x.addOnTrimMemoryListener(e9eVar);
    }

    @Override // defpackage.acs
    public final View b(int i) {
        return this.x.findViewById(i);
    }

    @Override // defpackage.acs
    public final boolean c() {
        Window window = this.x.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.x50
    public final t50 getActivityResultRegistry() {
        return this.x.getActivityResultRegistry();
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.x.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.rx60
    public final qx60 getOnBackPressedDispatcher() {
        return this.x.getOnBackPressedDispatcher();
    }

    @Override // defpackage.j2m0
    public final g2m0 getSavedStateRegistry() {
        return this.x.getSavedStateRegistry();
    }

    @Override // defpackage.rs31
    public final qs31 getViewModelStore() {
        return this.x.getViewModelStore();
    }

    @Override // defpackage.rk10
    public final void removeMenuProvider(an10 an10Var) {
        this.x.removeMenuProvider(an10Var);
    }

    @Override // defpackage.xx60
    public final void removeOnConfigurationChangedListener(e9e e9eVar) {
        this.x.removeOnConfigurationChangedListener(e9eVar);
    }

    @Override // androidx.core.app.t0
    public final void removeOnMultiWindowModeChangedListener(e9e e9eVar) {
        this.x.removeOnMultiWindowModeChangedListener(e9eVar);
    }

    @Override // androidx.core.app.u0
    public final void removeOnPictureInPictureModeChangedListener(e9e e9eVar) {
        this.x.removeOnPictureInPictureModeChangedListener(e9eVar);
    }

    @Override // defpackage.b170
    public final void removeOnTrimMemoryListener(e9e e9eVar) {
        this.x.removeOnTrimMemoryListener(e9eVar);
    }
}
