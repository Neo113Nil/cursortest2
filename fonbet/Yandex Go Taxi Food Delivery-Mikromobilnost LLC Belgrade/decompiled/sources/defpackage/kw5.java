package defpackage;

import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: classes2.dex */
public final class kw5 implements DefaultLifecycleObserver {
    public final /* synthetic */ AlertDialog a;

    public kw5(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        this.a.dismiss();
    }
}
