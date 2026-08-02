package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class v22 implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ qcy[] e = {wb.a(v22.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final p42 a;
    public final q22 b;
    public p22 c;
    public final mn2 d;

    public v22(View view, p42 p42Var, q22 q22Var) {
        this.a = p42Var;
        this.b = q22Var;
        this.d = nn2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        mn2 mn2Var = this.d;
        qcy[] qcyVarArr = e;
        qcy qcyVar = qcyVarArr[0];
        View view = (View) mn2Var.a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        mn2 mn2Var2 = this.d;
        qcy qcyVar2 = qcyVarArr[0];
        View view2 = (View) mn2Var2.a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            q22 q22Var = this.b;
            p42 p42Var = this.a;
            q22Var.getClass();
            p22 p22Var = new p22(view2, p42Var);
            this.c = p22Var;
            mn2 mn2Var3 = p22Var.b;
            qcy qcyVar3 = p22.d[0];
            View view3 = (View) mn2Var3.a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(p22Var);
        }
    }

    public final void b() {
        p22 p22Var = this.c;
        if (p22Var != null) {
            p22Var.a();
        }
        this.c = null;
        mn2 mn2Var = this.d;
        qcy qcyVar = e[0];
        View view = (View) mn2Var.a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.a.a.g();
        mn2 mn2Var = this.d;
        qcy qcyVar = e[0];
        View view2 = (View) mn2Var.a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            q22 q22Var = this.b;
            p42 p42Var = this.a;
            q22Var.getClass();
            p22 p22Var = new p22(view2, p42Var);
            this.c = p22Var;
            mn2 mn2Var2 = p22Var.b;
            qcy qcyVar2 = p22.d[0];
            View view3 = (View) mn2Var2.a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(p22Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        p22 p22Var = this.c;
        if (p22Var != null) {
            p22Var.a();
        }
        this.c = null;
        this.a.a.h();
    }
}
