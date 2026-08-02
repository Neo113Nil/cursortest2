package yads;

import android.os.Handler;
import android.view.View;
import xsna.epx;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class fq0 implements Runnable {
    public static final /* synthetic */ qcy[] f = {wb.a(fq0.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), wb.a(fq0.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final Handler b;
    public final dq0 c;
    public final mn2 d;
    public final mn2 e;

    public fq0(Handler handler, View view, dq0 dq0Var, lb2 lb2Var) {
        this.b = handler;
        this.c = dq0Var;
        this.d = nn2.a(lb2Var);
        this.e = nn2.a(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn2 mn2Var = this.e;
        qcy[] qcyVarArr = f;
        qcy qcyVar = qcyVarArr[1];
        View view = (View) mn2Var.a.get();
        mn2 mn2Var2 = this.d;
        qcy qcyVar2 = qcyVarArr[0];
        lb2 lb2Var = (lb2) mn2Var2.a.get();
        if (view == null || lb2Var == null) {
            return;
        }
        cq0 a = this.c.a(view);
        xw1 xw1Var = (xw1) lb2Var;
        if (!epx.f(a, xw1Var.r)) {
            xw1Var.r = a;
            xw1Var.b.a(new eq0(a.a, a.b));
        }
        this.b.postDelayed(this, 200L);
    }
}
