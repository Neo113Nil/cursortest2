package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import xsna.wjk0;

/* compiled from: SpectatorsInlineView.kt */
/* loaded from: classes3.dex */
public final class yjk0 extends FrameLayout implements wjk0 {
    public rlk b;
    public vjk0 c;

    public yjk0(Context context) {
        super(context, null, 0);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        vjk0 vjk0Var = this.c;
        if (vjk0Var != null) {
            vjk0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        vjk0 vjk0Var = this.c;
        if (vjk0Var != null) {
            vjk0Var.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        vjk0 vjk0Var = this.c;
        if (vjk0Var != null) {
            vjk0Var.resume();
        }
    }

    @Override // xsna.wjk0
    public void setCurrentViewers(int i) {
        rlk rlkVar = this.b;
        if (rlkVar != null) {
            rlkVar.setCurrentViewers(i);
        }
    }

    public final void setSpectatorsCounterView(rlk rlkVar) {
        this.b = rlkVar;
    }

    @Override // xsna.rr6
    public vjk0 getPresenter() {
        return this.c;
    }

    @Override // xsna.rr6
    public void setPresenter(vjk0 vjk0Var) {
        this.c = vjk0Var;
    }

    @Override // xsna.wjk0
    public final void X() {
    }

    @Override // xsna.wjk0
    public final void Y2() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.wjk0
    public final void T1(boolean z) {
    }

    @Override // xsna.wjk0
    public void setTimeText(int i) {
    }

    @Override // xsna.wjk0
    public void setUser(wjk0.a aVar) {
    }

    @Override // xsna.wjk0
    public final void Y(boolean z, boolean z2) {
    }

    @Override // xsna.wjk0
    public final void v2(int i, boolean z) {
    }
}
