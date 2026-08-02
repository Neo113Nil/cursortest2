package defpackage;

import android.view.View;

/* loaded from: classes7.dex */
public abstract class ia71 {
    public static final /* synthetic */ kgx[] b = {qha1.a(ia71.class, "viewReference", "getViewReference()Landroid/view/View;")};
    public final r581 a;

    public ia71(View view) {
        this.a = new r581(view);
    }

    public void a(View view) {
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public void b(uy71 uy71Var, pj71 pj71Var, Object obj) {
        View d = d();
        if (d == null) {
            return;
        }
        pj71Var.m(d, uy71Var);
        pj71Var.o(uy71Var, new ip31(d));
    }

    public abstract boolean c(View view, Object obj);

    public final View d() {
        kgx kgxVar = b[0];
        return (View) this.a.a.get();
    }

    public abstract void e(View view, Object obj);

    public final boolean f() {
        View d = d();
        return d != null && !sj71.e(d) && d.getWidth() >= 1 && d.getHeight() >= 1;
    }
}
