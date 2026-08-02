package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;

/* loaded from: classes11.dex */
public abstract class c {
    public static void a(Scene scene, Transition transition) {
        b(transition, scene.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.animations.SceneRootWatcher$OnDetachListener] */
    public static void b(Transition transition, final ViewGroup viewGroup) {
        ?? r0 = new View.OnAttachStateChangeListener(viewGroup) { // from class: com.yandex.div.core.view2.animations.SceneRootWatcher$OnDetachListener
            private final ViewGroup sceneRoot;

            {
                this.sceneRoot = viewGroup;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.sceneRoot.removeOnAttachStateChangeListener(this);
                TransitionManager.b(this.sceneRoot);
            }
        };
        viewGroup.addOnAttachStateChangeListener(r0);
        transition.a(new b(transition, viewGroup, r0));
    }
}
