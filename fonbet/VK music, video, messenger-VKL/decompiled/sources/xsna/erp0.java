package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: TrimScreen.java */
/* loaded from: classes15.dex */
public final class erp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ com.vk.attachpicker.screen.m c;

    public erp0(com.vk.attachpicker.screen.m mVar, Activity activity) {
        this.c = mVar;
        this.b = activity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.vk.attachpicker.screen.m mVar = this.c;
        Activity activity = this.b;
        if (activity != null) {
            mVar.h.b(activity);
        }
        mVar.F = true;
        mVar.x.setEnabled(true);
    }
}
