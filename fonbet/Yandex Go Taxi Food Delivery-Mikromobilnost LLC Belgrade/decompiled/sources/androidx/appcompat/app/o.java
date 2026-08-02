package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.du31;
import defpackage.e651;
import defpackage.f651;
import defpackage.fah0;
import defpackage.iog0;
import defpackage.ji41;
import defpackage.n4i0;
import defpackage.np31;
import defpackage.ny61;
import defpackage.rog0;
import defpackage.ur;
import defpackage.vf2;
import defpackage.vr;
import defpackage.vw;
import defpackage.wyg;
import defpackage.ytz0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class o extends ActionBar implements ur {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public wyg e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public f651 i;
    public f651 j;
    public h k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public du31 t;
    public boolean u;
    public boolean v;
    public final e651 w;
    public final e651 x;
    public final ji41 y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    public o(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new e651(this, 0);
        this.x = new e651(this, 1);
        this.y = new ji41(9, this);
        View decorView = activity.getWindow().getDecorView();
        y(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void A(boolean z2) {
        boolean z3 = this.r || !(this.p || this.q);
        boolean z4 = this.s;
        ji41 ji41Var = this.y;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.s = false;
                du31 du31Var = this.t;
                if (du31Var != null) {
                    du31Var.a();
                }
                int i = this.n;
                e651 e651Var = this.w;
                if (i != 0 || (!this.u && !z2)) {
                    e651Var.onAnimationEnd(null);
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                du31 du31Var2 = new du31();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                androidx.core.view.d c = androidx.core.view.b.c(this.d);
                c.e(f);
                View view2 = (View) c.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(ji41Var != null ? new vf2(22, ji41Var, view2) : null);
                }
                boolean z5 = du31Var2.e;
                ArrayList arrayList = du31Var2.a;
                if (!z5) {
                    arrayList.add(c);
                }
                if (this.o && view != null) {
                    androidx.core.view.d c2 = androidx.core.view.b.c(view);
                    c2.e(f);
                    if (!du31Var2.e) {
                        arrayList.add(c2);
                    }
                }
                boolean z6 = du31Var2.e;
                if (!z6) {
                    du31Var2.c = z;
                }
                if (!z6) {
                    du31Var2.b = 250L;
                }
                if (!z6) {
                    du31Var2.d = e651Var;
                }
                this.t = du31Var2;
                du31Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.s = true;
        du31 du31Var3 = this.t;
        if (du31Var3 != null) {
            du31Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        e651 e651Var2 = this.x;
        if (i2 == 0 && (this.u || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.d.setTranslationY(f2);
            du31 du31Var4 = new du31();
            androidx.core.view.d c3 = androidx.core.view.b.c(this.d);
            c3.e(0.0f);
            View view3 = (View) c3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(ji41Var != null ? new vf2(22, ji41Var, view3) : null);
            }
            boolean z7 = du31Var4.e;
            ArrayList arrayList2 = du31Var4.a;
            if (!z7) {
                arrayList2.add(c3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                androidx.core.view.d c4 = androidx.core.view.b.c(view);
                c4.e(0.0f);
                if (!du31Var4.e) {
                    arrayList2.add(c4);
                }
            }
            boolean z8 = du31Var4.e;
            if (!z8) {
                du31Var4.c = A;
            }
            if (!z8) {
                du31Var4.b = 250L;
            }
            if (!z8) {
                du31Var4.d = e651Var2;
            }
            this.t = du31Var4;
            du31Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            e651Var2.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            np31.c(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        wyg wygVar = this.e;
        if (wygVar == null || !((p) wygVar).a.hasExpandedActionView()) {
            return false;
        }
        ((p) this.e).a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ny61.u();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return ((p) this.e).b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(iog0.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void f() {
        if (this.p) {
            return;
        }
        this.p = true;
        A(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean h() {
        int height = this.d.getHeight();
        if (this.s) {
            return height == 0 || this.c.getActionBarHideOffset() < height;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void i() {
        z(vr.d(this.a).a.getResources().getBoolean(rog0.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean k(int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        f651 f651Var = this.i;
        if (f651Var == null || (menuBuilder = f651Var.w) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n(ColorDrawable colorDrawable) {
        this.d.setPrimaryBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o(boolean z2) {
        if (this.h) {
            return;
        }
        p(z2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p(boolean z2) {
        int i = z2 ? 4 : 0;
        p pVar = (p) this.e;
        int i2 = pVar.b;
        this.h = true;
        pVar.a((i & 4) | (i2 & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z2) {
        int i = z2 ? 8 : 0;
        p pVar = (p) this.e;
        pVar.a((i & 8) | (pVar.b & (-9)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(Drawable drawable) {
        p pVar = (p) this.e;
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
    public final void s(boolean z2) {
        du31 du31Var;
        this.u = z2;
        if (z2 || (du31Var = this.t) == null) {
            return;
        }
        du31Var.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void t(CharSequence charSequence) {
        p pVar = (p) this.e;
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
        p pVar = (p) this.e;
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
        if (this.p) {
            this.p = false;
            A(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final vw w(h hVar) {
        f651 f651Var = this.i;
        if (f651Var != null) {
            f651Var.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.killMode();
        f651 f651Var2 = new f651(this, this.f.getContext(), hVar);
        MenuBuilder menuBuilder = f651Var2.w;
        menuBuilder.stopDispatchingItemsChanged();
        try {
            if (!f651Var2.x.a.c(f651Var2, menuBuilder)) {
                return null;
            }
            this.i = f651Var2;
            f651Var2.g();
            this.f.initForMode(f651Var2);
            x(true);
            return f651Var2;
        } finally {
            menuBuilder.startDispatchingItemsChanged();
        }
    }

    public final void x(boolean z2) {
        androidx.core.view.d dVar;
        androidx.core.view.d dVar2;
        boolean z3 = this.r;
        if (z2) {
            if (!z3) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                A(false);
            }
        } else if (z3) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            A(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        wyg wygVar = this.e;
        if (!isLaidOut) {
            if (z2) {
                ((p) wygVar).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((p) wygVar).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            p pVar = (p) wygVar;
            dVar = androidx.core.view.b.c(pVar.a);
            dVar.a(0.0f);
            dVar.c(100L);
            dVar.d(new ytz0(pVar, 4));
            dVar2 = this.f.setupAnimatorToVisibility(0, 200L);
        } else {
            p pVar2 = (p) wygVar;
            androidx.core.view.d c = androidx.core.view.b.c(pVar2.a);
            c.a(1.0f);
            c.c(200L);
            c.d(new ytz0(pVar2, 0));
            dVar = this.f.setupAnimatorToVisibility(8, 100L);
            dVar2 = c;
        }
        du31 du31Var = new du31();
        ArrayList arrayList = du31Var.a;
        arrayList.add(dVar);
        View view = (View) dVar.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) dVar2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(dVar2);
        du31Var.b();
    }

    public final void y(View view) {
        wyg wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(fah0.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(fah0.action_bar);
        if (findViewById instanceof wyg) {
            wrapper = (wyg) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(fah0.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(fah0.action_bar_container);
        this.d = actionBarContainer;
        wyg wygVar = this.e;
        if (wygVar == null || this.f == null || actionBarContainer == null) {
            ny61.r(o.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((p) wygVar).a.getContext();
        this.a = context;
        if ((((p) this.e).b & 4) != 0) {
            this.h = true;
        }
        Context context2 = vr.d(context).a;
        int i = context2.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        z(context2.getResources().getBoolean(rog0.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, n4i0.ActionBar, iog0.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(n4i0.ActionBar_hideOnContentScroll, false)) {
            if (!this.c.isInOverlayMode()) {
                ny61.r("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.v = true;
                this.c.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(n4i0.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.m(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void z(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((p) this.e).getClass();
        } else {
            ((p) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((p) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public o(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new e651(this, 0);
        this.x = new e651(this, 1);
        this.y = new ji41(9, this);
        y(dialog.getWindow().getDecorView());
    }
}
