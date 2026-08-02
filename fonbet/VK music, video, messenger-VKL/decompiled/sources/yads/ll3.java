package yads;

import android.view.View;
import xsna.qcy;

/* loaded from: classes10.dex */
public abstract class ll3 {
    public static final /* synthetic */ qcy[] b = {wb.a(ll3.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final mn2 a;

    public ll3(View view) {
        this.a = nn2.a(view);
    }

    public void a() {
    }

    public abstract boolean a(View view, Object obj);

    public final View b() {
        mn2 mn2Var = this.a;
        qcy qcyVar = b[0];
        return (View) mn2Var.a.get();
    }

    public abstract void b(View view, Object obj);

    public final boolean c() {
        View b2 = b();
        return b2 != null && !om3.b(b2) && b2.getWidth() >= 1 && b2.getHeight() >= 1;
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public void a(oi oiVar, ol3 ol3Var, Object obj) {
        View b2 = b();
        if (b2 == null) {
            return;
        }
        ol3Var.a(b2, oiVar);
        ol3Var.a(oiVar, new nl3(b2));
    }
}
