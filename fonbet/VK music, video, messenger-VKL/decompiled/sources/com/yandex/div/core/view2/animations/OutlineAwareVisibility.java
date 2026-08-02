package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.TransientView;
import xsna.gnp0;
import xsna.p4u0;
import xsna.vlp0;
import xsna.ymp0;

/* compiled from: OutlineAwareVisibility.kt */
/* loaded from: classes7.dex */
public class OutlineAwareVisibility extends p4u0 {
    @Override // xsna.p4u0
    public Animator onAppear(ViewGroup viewGroup, gnp0 gnp0Var, int i, final gnp0 gnp0Var2, int i2) {
        Object obj = gnp0Var2 != null ? gnp0Var2.b : null;
        final TransientView transientView = obj instanceof TransientView ? (TransientView) obj : null;
        if (transientView != null) {
            transientView.transitionStarted(gnp0Var2.b);
        }
        addListener(new ymp0() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onAppear$$inlined$doOnEnd$1
            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionEnd(vlp0 vlp0Var) {
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.transitionFinished(gnp0Var2.b);
                }
                vlp0.this.removeListener(this);
            }
        });
        return super.onAppear(viewGroup, gnp0Var, i, gnp0Var2, i2);
    }

    @Override // xsna.p4u0
    public Animator onDisappear(ViewGroup viewGroup, final gnp0 gnp0Var, int i, gnp0 gnp0Var2, int i2) {
        Object obj = gnp0Var != null ? gnp0Var.b : null;
        final TransientView transientView = obj instanceof TransientView ? (TransientView) obj : null;
        if (transientView != null) {
            transientView.transitionStarted(gnp0Var.b);
        }
        addListener(new ymp0() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onDisappear$$inlined$doOnEnd$1
            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionEnd(vlp0 vlp0Var) {
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.transitionFinished(gnp0Var.b);
                }
                vlp0.this.removeListener(this);
            }
        });
        return super.onDisappear(viewGroup, gnp0Var, i, gnp0Var2, i2);
    }
}
