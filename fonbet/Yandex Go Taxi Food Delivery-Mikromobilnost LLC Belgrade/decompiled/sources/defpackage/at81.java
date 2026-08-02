package defpackage;

import android.os.Handler;
import android.view.View;
import yads.t92;

/* loaded from: classes7.dex */
public final class at81 implements Runnable {
    public static final /* synthetic */ kgx[] x = {qha1.a(at81.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;"), qha1.a(at81.class, "viewReference", "getViewReference()Landroid/view/View;")};
    public final Handler a;
    public final mm81 b;
    public final r581 c;
    public final r581 w;

    public at81(t92 t92Var, tj61 tj61Var, Handler handler, mm81 mm81Var) {
        this.a = handler;
        this.b = mm81Var;
        this.c = new r581(tj61Var);
        this.w = new r581(t92Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        kgx[] kgxVarArr = x;
        kgx kgxVar = kgxVarArr[1];
        View view = (View) this.w.a.get();
        kgx kgxVar2 = kgxVarArr[0];
        tj61 tj61Var = (tj61) this.c.a.get();
        if (view == null || tj61Var == null) {
            return;
        }
        this.b.getClass();
        gj81 a = mm81.a(view);
        if (!a.equals(tj61Var.n)) {
            tj61Var.n = a;
            tj61Var.b.B(new we6(a.a, a.b, 17));
        }
        this.a.postDelayed(this, 200L);
    }
}
