package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class ka50 extends DrawerLayout.a {
    public WeakReference a = null;
    public final /* synthetic */ NavigationView b;

    public ka50(NavigationView navigationView) {
        this.b = navigationView;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void a(View view) {
        if (view != this.b) {
            return;
        }
        d();
        if (!view.isAttachedToWindow() || view.isInTouchMode()) {
            return;
        }
        view.requestFocus();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void b(View view) {
        WeakReference weakReference;
        if (view == this.b && (weakReference = this.a) != null) {
            View view2 = (View) weakReference.get();
            if (view2 == null || !view2.isAttachedToWindow() || view2.isInTouchMode()) {
                this.a = null;
            } else {
                view2.requestFocus();
                this.a = null;
            }
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void c(float f, View view) {
        if (view != this.b) {
            return;
        }
        if ((view.getParent() instanceof DrawerLayout) && ((DrawerLayout) view.getParent()).isDrawerOpen(view)) {
            return;
        }
        d();
    }

    public final void d() {
        Activity a;
        if (this.a == null) {
            NavigationView navigationView = this.b;
            View view = null;
            if (!navigationView.hasFocus() && (a = jke.a(navigationView.getContext())) != null) {
                view = a.getCurrentFocus();
            }
            this.a = new WeakReference(view);
        }
    }
}
