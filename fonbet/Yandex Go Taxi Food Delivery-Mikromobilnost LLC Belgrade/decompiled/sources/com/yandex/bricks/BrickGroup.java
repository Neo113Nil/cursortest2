package com.yandex.bricks;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import defpackage.ak6;
import defpackage.pey;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class BrickGroup implements ak6, pey {
    public Object a;
    public t b = new t(this, true);

    public static class BrickGroupController extends BrickController {
        private final BrickGroup mBrickGroup;
        private final ViewGroup mContainer;

        public BrickGroupController(ViewGroup viewGroup, BrickGroup brickGroup) {
            super(brickGroup, false);
            this.mContainer = viewGroup;
            this.mBrickGroup = brickGroup;
        }

        public void addToContainer() {
            this.mContainer.addOnAttachStateChangeListener(this);
            BrickGroup brickGroup = this.mBrickGroup;
            ViewGroup viewGroup = this.mContainer;
            brickGroup.getClass();
            LayoutInflater.from(viewGroup.getContext());
            Object a = brickGroup.a();
            Objects.requireNonNull(a);
            brickGroup.a = a;
            if (BrickController.isAttachedToWindow(this.mContainer)) {
                onViewAttachedToWindow(this.mContainer);
            }
        }

        public void removeFromContainer() {
            if (BrickController.isAttachedToWindow(this.mContainer)) {
                onViewDetachedFromWindow(this.mContainer);
            }
            this.mContainer.removeAllViews();
            this.mContainer.removeOnAttachStateChangeListener(this);
        }
    }

    public abstract Object a();

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.b;
    }

    @Override // defpackage.ak6
    public final void onBrickAttach() {
        this.b.g(Lifecycle.Event.ON_CREATE);
    }

    @Override // defpackage.ak6
    public final void onBrickDetach() {
        this.b.g(Lifecycle.Event.ON_DESTROY);
        this.b = new t(this, true);
    }

    @Override // defpackage.ak6
    public final void onBrickPause() {
        this.b.g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // defpackage.ak6
    public final void onBrickResume() {
        this.b.g(Lifecycle.Event.ON_RESUME);
    }

    @Override // defpackage.ak6
    public final void onBrickStart() {
        this.b.g(Lifecycle.Event.ON_START);
    }

    @Override // defpackage.ak6
    public final void onBrickStop() {
        this.b.g(Lifecycle.Event.ON_STOP);
    }
}
