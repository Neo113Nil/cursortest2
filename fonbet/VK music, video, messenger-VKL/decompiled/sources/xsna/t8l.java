package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* compiled from: DecorToolbar.java */
/* loaded from: classes11.dex */
public interface t8l {
    boolean a();

    void b(Menu menu, j.a aVar);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    void h(int i);

    int i();

    void j(int i);

    void k(boolean z);

    void l();

    void m();

    int n();

    void o(Drawable drawable);

    void p(CharSequence charSequence);

    b0u0 q(int i, long j);

    boolean r();

    void s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i);
}
