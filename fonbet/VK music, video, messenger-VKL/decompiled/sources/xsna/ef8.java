package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: BroadcastErrorView.java */
/* loaded from: classes16.dex */
public final class ef8 extends FrameLayout implements af8 {
    public ze8 b;

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public ze8 getPresenter() {
        return this.b;
    }

    @Override // xsna.rr6
    public void setPresenter(ze8 ze8Var) {
        this.b = ze8Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.rr6
    public final void release() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }
}
