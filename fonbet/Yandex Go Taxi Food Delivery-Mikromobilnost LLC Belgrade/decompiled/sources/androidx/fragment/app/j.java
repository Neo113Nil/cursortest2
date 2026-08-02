package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import defpackage.pey;

/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.q {
    public final /* synthetic */ Fragment a;

    public j(Fragment fragment) {
        this.a = fragment;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        View view;
        if (event != Lifecycle.Event.ON_STOP || (view = this.a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
