package xsna;

import android.view.MotionEvent;
import android.view.View;
import xsna.jc80;

/* compiled from: StorySendMessageDialog.kt */
/* loaded from: classes6.dex */
public final class rcm0 implements jc80.b {
    public final /* synthetic */ tcm0 a;

    public rcm0(tcm0 tcm0Var) {
        this.a = tcm0Var;
    }

    @Override // xsna.jc80.b
    public final void d(int i, int i2) {
        ycm0 ycm0Var = this.a.m;
        if (ycm0Var == null || ycm0Var.k) {
            return;
        }
        mcm0 mcm0Var = ycm0Var.h;
        if (mcm0Var == null) {
            mcm0Var = null;
        }
        ((tcm0) mcm0Var).dismiss();
    }

    @Override // xsna.jc80.b
    public final void b() {
    }

    @Override // xsna.jc80.b
    public final void c() {
    }

    @Override // xsna.jc80.b
    public final void a(int i) {
    }

    @Override // xsna.jc80.b
    public final void onTouch(View view, MotionEvent motionEvent) {
    }
}
