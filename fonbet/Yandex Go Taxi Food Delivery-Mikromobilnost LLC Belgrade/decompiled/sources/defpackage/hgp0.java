package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: classes2.dex */
public final class hgp0 implements DefaultLifecycleObserver {
    public final View a;
    public final zq6 b;
    public final zwf0 c;
    public ggp0 w;

    public hgp0(View view, mgp0 mgp0Var, zq6 zq6Var, zwf0 zwf0Var) {
        this.a = view;
        this.b = zq6Var;
        this.c = zwf0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        Activity activity;
        ggp0 ggp0Var = this.w;
        if (ggp0Var != null) {
            Context context = this.a.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                activity.unregisterScreenCaptureCallback(ggp0Var);
            }
        }
        this.w = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        Activity activity;
        Context context = this.a.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return;
        }
        ggp0 ggp0Var = new ggp0(0, this);
        this.w = ggp0Var;
        activity.registerScreenCaptureCallback(activity.getMainExecutor(), ggp0Var);
    }
}
