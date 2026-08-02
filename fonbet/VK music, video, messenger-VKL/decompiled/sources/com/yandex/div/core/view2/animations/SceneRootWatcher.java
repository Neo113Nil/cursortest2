package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import xsna.p5h0;
import xsna.vlp0;
import xsna.ymp0;
import xsna.zmp0;

/* compiled from: SceneRootWatcher.kt */
/* loaded from: classes7.dex */
public final class SceneRootWatcher {
    public static final SceneRootWatcher INSTANCE = new SceneRootWatcher();

    private SceneRootWatcher() {
    }

    public final void watchFor(final ViewGroup viewGroup, final vlp0 vlp0Var) {
        final OnDetachListener onDetachListener = new OnDetachListener(viewGroup);
        viewGroup.addOnAttachStateChangeListener(onDetachListener);
        vlp0Var.addListener(new ymp0() { // from class: com.yandex.div.core.view2.animations.SceneRootWatcher$watchFor$$inlined$doOnEnd$1
            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionEnd(vlp0 vlp0Var2) {
                viewGroup.removeOnAttachStateChangeListener(onDetachListener);
                vlp0.this.removeListener(this);
            }
        });
    }

    public final void watchFor(p5h0 p5h0Var, vlp0 vlp0Var) {
        watchFor(p5h0Var.a, vlp0Var);
    }

    /* compiled from: SceneRootWatcher.kt */
    public static final class OnDetachListener implements View.OnAttachStateChangeListener {
        private final ViewGroup sceneRoot;

        public OnDetachListener(ViewGroup viewGroup) {
            this.sceneRoot = viewGroup;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.sceneRoot.removeOnAttachStateChangeListener(this);
            zmp0.b(this.sceneRoot);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
