package com.lightside.slab;

import android.view.View;
import defpackage.lns0;
import kotlin.Metadata;

/* loaded from: classes11.dex */
public class SlabViewLifecycle implements lns0 {
    public ViewHelper a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/lightside/slab/SlabViewLifecycle$ViewHelper;", "Lcom/lightside/slab/SlabController;", "Landroid/view/View;", "view", "<init>", "(Lcom/lightside/slab/SlabViewLifecycle;Landroid/view/View;)V", "Lzy11;", "attachToView", "()V", "detachFromView", "Landroid/view/View;", "getView", "()Landroid/view/View;", "slab_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ViewHelper extends SlabController {
        private final View view;

        public ViewHelper(View view) {
            super(SlabViewLifecycle.this, false);
            this.view = view;
        }

        public final void attachToView() {
            this.view.addOnAttachStateChangeListener(this);
            SlabViewLifecycle slabViewLifecycle = SlabViewLifecycle.this;
            View view = this.view;
            slabViewLifecycle.getClass();
            if (view.isAttachedToWindow()) {
                onViewAttachedToWindow(this.view);
            }
        }

        public final void detachFromView() {
            this.view.removeOnAttachStateChangeListener(this);
            SlabViewLifecycle slabViewLifecycle = SlabViewLifecycle.this;
            View view = this.view;
            slabViewLifecycle.getClass();
            if (view.isAttachedToWindow()) {
                onViewDetachedFromWindow(this.view);
            }
        }

        public final View getView() {
            return this.view;
        }
    }

    @Override // defpackage.lns0
    public void a() {
    }

    @Override // defpackage.lns0
    public final void onDetach() {
    }

    @Override // defpackage.lns0
    public final void onPause() {
    }

    @Override // defpackage.lns0
    public final void onResume() {
    }

    @Override // defpackage.lns0
    public final void onStart() {
    }

    @Override // defpackage.lns0
    public final void onStop() {
    }
}
