package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.x0;
import flex.section.divkit.cache.DivWrapperView;

/* loaded from: classes4.dex */
public class hul extends x0 implements g170, DefaultLifecycleObserver, f170 {
    public final DivWrapperView N;
    public vol O;
    public dee P;
    public rzl Q;
    public String R;

    public hul(DivWrapperView divWrapperView) {
        super(divWrapperView);
        this.N = divWrapperView;
    }

    @Override // defpackage.g170
    public final void A() {
        this.N.tryLogVisibility();
    }

    @Override // defpackage.f170
    public final void h() {
        rzl rzlVar;
        String str = this.R;
        if (str == null || (rzlVar = this.Q) == null) {
            return;
        }
        ((lb7) rzlVar).z(new l3m(str));
    }

    @Override // defpackage.f170
    public final void l() {
        rzl rzlVar;
        String str = this.R;
        if (str == null || (rzlVar = this.Q) == null) {
            return;
        }
        ((lb7) rzlVar).z(new k3m(str));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(pey peyVar) {
    }
}
