package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import defpackage.c1x0;
import defpackage.h3s0;
import defpackage.jhu0;
import defpackage.ny61;
import defpackage.wpy0;
import defpackage.wvb1;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class n extends ActionBar {
    public final p a;
    public final Window.Callback b;
    public final wpy0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final h3s0 h = new h3s0(5, this);

    public n(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        c1x0 c1x0Var = new c1x0(this);
        p pVar = new p(toolbar, false);
        this.a = pVar;
        callback.getClass();
        this.b = callback;
        pVar.k = callback;
        toolbar.setOnMenuItemClickListener(c1x0Var);
        if (!pVar.g) {
            pVar.h = charSequence;
            if ((pVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (pVar.g) {
                    androidx.core.view.b.r(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.c = new wpy0(6, this);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean a() {
        return this.a.a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        p pVar = this.a;
        if (!pVar.a.hasExpandedActionView()) {
            return false;
        }
        pVar.a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ny61.u();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return this.a.b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void f() {
        this.a.a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean g() {
        p pVar = this.a;
        Toolbar toolbar = pVar.a;
        h3s0 h3s0Var = this.h;
        toolbar.removeCallbacks(h3s0Var);
        Toolbar toolbar2 = pVar.a;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        toolbar2.postOnAnimation(h3s0Var);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean h() {
        return this.a.a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void i() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void j() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean k(int i, KeyEvent keyEvent) {
        Menu x = x();
        if (x == null) {
            return false;
        }
        x.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return x.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean l(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean m() {
        return this.a.a.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n(ColorDrawable colorDrawable) {
        this.a.a.setBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p(boolean z) {
        int i = z ? 4 : 0;
        p pVar = this.a;
        pVar.a((i & 4) | (pVar.b & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z) {
        int i = z ? 8 : 0;
        p pVar = this.a;
        pVar.a((i & 8) | (pVar.b & (-9)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(Drawable drawable) {
        p pVar = this.a;
        pVar.f = drawable;
        int i = pVar.b & 4;
        Toolbar toolbar = pVar.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = pVar.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void s(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void t(CharSequence charSequence) {
        p pVar = this.a;
        pVar.g = true;
        Toolbar toolbar = pVar.a;
        pVar.h = charSequence;
        if ((pVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (pVar.g) {
                androidx.core.view.b.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void u(CharSequence charSequence) {
        p pVar = this.a;
        if (pVar.g) {
            return;
        }
        Toolbar toolbar = pVar.a;
        pVar.h = charSequence;
        if ((pVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (pVar.g) {
                androidx.core.view.b.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void v() {
        this.a.a.setVisibility(0);
    }

    public final Menu x() {
        boolean z = this.e;
        p pVar = this.a;
        if (!z) {
            pVar.a.setMenuCallbacks(new wvb1(this), new jhu0(this));
            this.e = true;
        }
        return pVar.a.getMenu();
    }
}
