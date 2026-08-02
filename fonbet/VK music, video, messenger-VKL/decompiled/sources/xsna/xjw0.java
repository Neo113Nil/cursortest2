package xsna;

import android.view.ViewGroup;

/* compiled from: VoipCallViewAsrRecordInProgressDelegate.kt */
/* loaded from: classes7.dex */
public final class xjw0 {
    public final l7s a;
    public final ov3 b;
    public final ViewGroup c;
    public khc0 d;
    public aw3 e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    public xjw0(l7s l7sVar, ov3 ov3Var, ViewGroup viewGroup) {
        this.a = l7sVar;
        this.b = ov3Var;
        this.c = viewGroup;
        bwt0.p0(viewGroup, false);
    }

    public final void a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        khc0 khc0Var = this.d;
        if (khc0Var != null) {
            aw3 aw3Var = this.e;
            if (aw3Var != null && (viewGroup2 = aw3Var.b) != null) {
                viewGroup2.getWidth();
            }
            aw3 aw3Var2 = this.e;
            int height = (aw3Var2 == null || (viewGroup = aw3Var2.b) == null) ? 0 : viewGroup.getHeight();
            mjw0 mjw0Var = (mjw0) khc0Var.c;
            mjw0Var.e.b(0, height);
            mjw0Var.f.d5(0, height);
        }
        this.g.e();
        aw3 aw3Var3 = this.e;
        if (aw3Var3 != null) {
            aw3Var3.h.a();
            aw3Var3.k = false;
        }
        this.e = null;
        ViewGroup viewGroup3 = this.c;
        bwt0.p0(viewGroup3, false);
        viewGroup3.removeAllViews();
    }
}
