package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class p22 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ qcy[] d = {wb.a(p22.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final p42 a;
    public final mn2 b;
    public Integer c;

    public p22(View view, p42 p42Var) {
        this.a = p42Var;
        this.b = nn2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        mn2 mn2Var = this.b;
        qcy qcyVar = d[0];
        View view = (View) mn2Var.a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        mn2 mn2Var = this.b;
        qcy qcyVar = d[0];
        View view = (View) mn2Var.a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.a.a.g();
            } else {
                this.a.a.h();
            }
        }
    }
}
