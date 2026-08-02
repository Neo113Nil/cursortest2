package com.yandex.bricks;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import defpackage.ak6;
import defpackage.dk6;
import defpackage.pey;
import java.util.Objects;

/* loaded from: classes11.dex */
public class BrickViewLifecycle implements ak6, pey {
    public t a = new t(this, true);
    public final dk6 b = new dk6(this);
    public ViewHelper c;

    public final void a(View view) {
        ViewHelper viewHelper = this.c;
        if (viewHelper != null) {
            viewHelper.detachFromView();
            this.c = null;
        }
        ViewHelper viewHelper2 = new ViewHelper(this, view, 0);
        this.c = viewHelper2;
        viewHelper2.attachToView();
    }

    public final View b() {
        ViewHelper viewHelper = this.c;
        Objects.requireNonNull(viewHelper);
        return viewHelper.getView();
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.a;
    }

    @Override // defpackage.ak6
    public void onBrickAttach() {
        this.a.g(Lifecycle.Event.ON_CREATE);
    }

    @Override // defpackage.ak6
    public final void onBrickDetach() {
        this.a.g(Lifecycle.Event.ON_DESTROY);
        this.a = new t(this, true);
    }

    @Override // defpackage.ak6
    public void onBrickPause() {
        this.a.g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // defpackage.ak6
    public void onBrickResume() {
        this.a.g(Lifecycle.Event.ON_RESUME);
    }

    @Override // defpackage.ak6
    public final void onBrickStart() {
        this.a.g(Lifecycle.Event.ON_START);
    }

    @Override // defpackage.ak6
    public final void onBrickStop() {
        this.a.g(Lifecycle.Event.ON_STOP);
    }

    public class ViewHelper extends BrickController {
        private final View mView;

        private ViewHelper(View view) {
            super(BrickViewLifecycle.this, false);
            this.mView = view;
        }

        public void attachToView() {
            this.mView.addOnAttachStateChangeListener(this);
            if (BrickController.isAttachedToWindow(this.mView)) {
                onViewAttachedToWindow(this.mView);
            }
        }

        public void detachFromView() {
            this.mView.removeOnAttachStateChangeListener(this);
            if (BrickController.isAttachedToWindow(this.mView)) {
                onViewDetachedFromWindow(this.mView);
            }
        }

        public View getView() {
            return this.mView;
        }

        public /* synthetic */ ViewHelper(BrickViewLifecycle brickViewLifecycle, View view, int i) {
            this(view);
        }
    }
}
