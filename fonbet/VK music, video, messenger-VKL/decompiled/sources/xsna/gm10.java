package xsna;

import android.app.Activity;
import android.transition.Transition;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
/* loaded from: classes13.dex */
public final class gm10 extends wmp0 {
    public final /* synthetic */ Activity a;

    public gm10(Activity activity) {
        this.a = activity;
    }

    @Override // xsna.wmp0, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        View view;
        WeakReference<View> weakReference = im10.e;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.setAlpha(1.0f);
            im10.e = null;
        }
        Activity activity = this.a;
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
