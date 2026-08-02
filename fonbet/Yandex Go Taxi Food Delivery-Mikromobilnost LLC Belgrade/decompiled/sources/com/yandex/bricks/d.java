package com.yandex.bricks;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.x0;
import defpackage.ak6;
import defpackage.dk6;
import defpackage.pey;
import defpackage.z83;

/* loaded from: classes11.dex */
public abstract class d extends x0 implements ak6, pey {
    public final BrickViewHolder$ViewHolderController N;
    public t O;
    public final dk6 P;
    public Object Q;

    public d(View view) {
        super(view);
        this.O = new t(this, true);
        this.P = new dk6(this);
        this.N = new BrickViewHolder$ViewHolderController(this);
    }

    public final void c(Object obj) {
        z83.d(obj, null);
        Object obj2 = this.Q;
        BrickViewHolder$ViewHolderController brickViewHolder$ViewHolderController = this.N;
        if (obj2 != null) {
            if (t(obj2, obj)) {
                this.Q = obj;
                return;
            }
            brickViewHolder$ViewHolderController.detachFrom();
        }
        this.Q = obj;
        brickViewHolder$ViewHolderController.attachTo();
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.O;
    }

    @Override // defpackage.ak6
    public void onBrickAttach() {
        this.O.g(Lifecycle.Event.ON_CREATE);
    }

    @Override // defpackage.ak6
    public void onBrickDetach() {
        this.O.g(Lifecycle.Event.ON_DESTROY);
        this.O = new t(this, true);
    }

    @Override // defpackage.ak6
    public final void onBrickPause() {
        this.O.g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // defpackage.ak6
    public final void onBrickResume() {
        this.O.g(Lifecycle.Event.ON_RESUME);
    }

    @Override // defpackage.ak6
    public final void onBrickStart() {
        this.O.g(Lifecycle.Event.ON_START);
    }

    @Override // defpackage.ak6
    public final void onBrickStop() {
        this.O.g(Lifecycle.Event.ON_STOP);
    }

    public abstract boolean t(Object obj, Object obj2);
}
