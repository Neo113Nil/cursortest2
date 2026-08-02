package xsna;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: ActionMode.java */
/* loaded from: classes11.dex */
public abstract class g40 {
    public Object b;
    public boolean c;

    /* compiled from: ActionMode.java */
    public interface a {
        boolean a(g40 g40Var, MenuItem menuItem);

        boolean b(g40 g40Var, Menu menu);

        boolean c(g40 g40Var, Menu menu);

        void d(g40 g40Var);
    }

    public abstract void c();

    public abstract View d();

    public abstract androidx.appcompat.view.menu.f e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public boolean j() {
        return false;
    }

    public abstract void k(View view);

    public abstract void l(int i);

    public abstract void m(CharSequence charSequence);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(boolean z) {
        this.c = z;
    }
}
