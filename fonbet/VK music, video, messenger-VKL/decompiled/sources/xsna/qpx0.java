package xsna;

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
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.eu;
import xsna.o23;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes11.dex */
public final class qpx0 extends eu implements ActionBarOverlayLayout.d {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public t8l e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public d i;
    public d j;
    public o23.e k;
    public boolean l;
    public final ArrayList<eu.b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public c0u0 t;
    public boolean u;
    public boolean v;
    public final a w;
    public final b x;
    public final c y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* compiled from: WindowDecorActionBar.java */
    public class a extends f0u0 {
        public a() {
        }

        @Override // xsna.e0u0
        public final void b() {
            View view;
            qpx0 qpx0Var = qpx0.this;
            if (qpx0Var.p && (view = qpx0Var.g) != null) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                qpx0Var.d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            qpx0Var.d.setVisibility(8);
            qpx0Var.d.setTransitioning(false);
            qpx0Var.t = null;
            o23.e eVar = qpx0Var.k;
            if (eVar != null) {
                eVar.d(qpx0Var.j);
                qpx0Var.j = null;
                qpx0Var.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = qpx0Var.c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class b extends f0u0 {
        public b() {
        }

        @Override // xsna.e0u0
        public final void b() {
            qpx0 qpx0Var = qpx0.this;
            qpx0Var.t = null;
            qpx0Var.d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class c implements g0u0 {
        public c() {
        }

        @Override // xsna.g0u0
        public final void a() {
            ((View) qpx0.this.d.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    public class d extends g40 implements f.a {
        public final Context d;
        public final androidx.appcompat.view.menu.f e;
        public o23.e f;
        public WeakReference<View> g;

        public d(Context context, o23.e eVar) {
            this.d = context;
            this.f = eVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.l = 1;
            this.e = fVar;
            fVar.e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void a(@NonNull androidx.appcompat.view.menu.f fVar) {
            if (this.f == null) {
                return;
            }
            i();
            ActionMenuPresenter actionMenuPresenter = qpx0.this.f.e;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.n();
            }
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar, @NonNull MenuItem menuItem) {
            o23.e eVar = this.f;
            if (eVar != null) {
                return eVar.a.a(this, menuItem);
            }
            return false;
        }

        @Override // xsna.g40
        public final void c() {
            qpx0 qpx0Var = qpx0.this;
            if (qpx0Var.i != this) {
                return;
            }
            if (qpx0Var.q) {
                qpx0Var.j = this;
                qpx0Var.k = this.f;
            } else {
                this.f.d(this);
            }
            this.f = null;
            qpx0Var.x(false);
            ActionBarContextView actionBarContextView = qpx0Var.f;
            if (actionBarContextView.l == null) {
                actionBarContextView.h();
            }
            qpx0Var.c.setHideOnContentScrollEnabled(qpx0Var.v);
            qpx0Var.i = null;
        }

        @Override // xsna.g40
        public final View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // xsna.g40
        public final androidx.appcompat.view.menu.f e() {
            return this.e;
        }

        @Override // xsna.g40
        public final MenuInflater f() {
            return new lin0(this.d);
        }

        @Override // xsna.g40
        public final CharSequence g() {
            return qpx0.this.f.getSubtitle();
        }

        @Override // xsna.g40
        public final CharSequence h() {
            return qpx0.this.f.getTitle();
        }

        @Override // xsna.g40
        public final void i() {
            if (qpx0.this.i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.e;
            fVar.w();
            try {
                this.f.c(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // xsna.g40
        public final boolean j() {
            return qpx0.this.f.t;
        }

        @Override // xsna.g40
        public final void k(View view) {
            qpx0.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // xsna.g40
        public final void l(int i) {
            m(qpx0.this.a.getResources().getString(i));
        }

        @Override // xsna.g40
        public final void m(CharSequence charSequence) {
            qpx0.this.f.setSubtitle(charSequence);
        }

        @Override // xsna.g40
        public final void n(int i) {
            o(qpx0.this.a.getResources().getString(i));
        }

        @Override // xsna.g40
        public final void o(CharSequence charSequence) {
            qpx0.this.f.setTitle(charSequence);
        }

        @Override // xsna.g40
        public final void p(boolean z) {
            this.c = z;
            qpx0.this.f.setTitleOptional(z);
        }
    }

    public qpx0(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        y(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void A(boolean z2) {
        boolean z3 = this.q;
        boolean z4 = this.r;
        c cVar = this.y;
        View view = this.g;
        if (!z4 && z3) {
            if (this.s) {
                this.s = false;
                c0u0 c0u0Var = this.t;
                if (c0u0Var != null) {
                    c0u0Var.a();
                }
                int i = this.o;
                a aVar = this.w;
                if (i != 0 || (!this.u && !z2)) {
                    aVar.b();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                c0u0 c0u0Var2 = new c0u0();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r11[1];
                }
                b0u0 b2 = iut0.b(this.d);
                b2.f(f);
                b2.e(cVar);
                boolean z5 = c0u0Var2.e;
                ArrayList<b0u0> arrayList = c0u0Var2.a;
                if (!z5) {
                    arrayList.add(b2);
                }
                if (this.p && view != null) {
                    b0u0 b3 = iut0.b(view);
                    b3.f(f);
                    if (!c0u0Var2.e) {
                        arrayList.add(b3);
                    }
                }
                boolean z6 = c0u0Var2.e;
                if (!z6) {
                    c0u0Var2.c = z;
                }
                if (!z6) {
                    c0u0Var2.b = 250L;
                }
                if (!z6) {
                    c0u0Var2.d = aVar;
                }
                this.t = c0u0Var2;
                c0u0Var2.b();
                return;
            }
            return;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        c0u0 c0u0Var3 = this.t;
        if (c0u0Var3 != null) {
            c0u0Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.o;
        b bVar = this.x;
        if (i2 == 0 && (this.u || z2)) {
            this.d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r11[1];
            }
            this.d.setTranslationY(f2);
            c0u0 c0u0Var4 = new c0u0();
            b0u0 b4 = iut0.b(this.d);
            b4.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            b4.e(cVar);
            boolean z7 = c0u0Var4.e;
            ArrayList<b0u0> arrayList2 = c0u0Var4.a;
            if (!z7) {
                arrayList2.add(b4);
            }
            if (this.p && view != null) {
                view.setTranslationY(f2);
                b0u0 b5 = iut0.b(view);
                b5.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (!c0u0Var4.e) {
                    arrayList2.add(b5);
                }
            }
            boolean z8 = c0u0Var4.e;
            if (!z8) {
                c0u0Var4.c = A;
            }
            if (!z8) {
                c0u0Var4.b = 250L;
            }
            if (!z8) {
                c0u0Var4.d = bVar;
            }
            this.t = c0u0Var4;
            c0u0Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.p && view != null) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            bVar.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // xsna.eu
    public final boolean b() {
        t8l t8lVar = this.e;
        if (t8lVar == null || !t8lVar.r()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // xsna.eu
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList<eu.b> arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // xsna.eu
    public final int d() {
        return this.e.n();
    }

    @Override // xsna.eu
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.vkontakte.android.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // xsna.eu
    public final void g() {
        z(this.a.getResources().getBoolean(com.vkontakte.android.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // xsna.eu
    public final boolean i(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.e) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // xsna.eu
    public final void l(ColorDrawable colorDrawable) {
        this.d.setPrimaryBackground(colorDrawable);
    }

    @Override // xsna.eu
    public final void m(boolean z2) {
        if (this.h) {
            return;
        }
        n(z2);
    }

    @Override // xsna.eu
    public final void n(boolean z2) {
        int i = z2 ? 4 : 0;
        int n = this.e.n();
        this.h = true;
        this.e.h((i & 4) | (n & (-5)));
    }

    @Override // xsna.eu
    public final void o(boolean z2) {
        this.e.h(((z2 ? 2 : 0) & 2) | (this.e.n() & (-3)));
    }

    @Override // xsna.eu
    public final void p() {
        this.e.j(com.vkontakte.android.R.string.accessibility_back);
    }

    @Override // xsna.eu
    public final void q() {
        this.e.s();
    }

    @Override // xsna.eu
    public final void r(Drawable drawable) {
        this.e.o(drawable);
    }

    @Override // xsna.eu
    public final void s(boolean z2) {
        c0u0 c0u0Var;
        this.u = z2;
        if (z2 || (c0u0Var = this.t) == null) {
            return;
        }
        c0u0Var.a();
    }

    @Override // xsna.eu
    public final void t(String str) {
        this.e.p(str);
    }

    @Override // xsna.eu
    public final void u(String str) {
        this.e.setTitle(str);
    }

    @Override // xsna.eu
    public final void v(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // xsna.eu
    public final g40 w(o23.e eVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar2 = new d(this.f.getContext(), eVar);
        androidx.appcompat.view.menu.f fVar = dVar2.e;
        fVar.w();
        try {
            if (!dVar2.f.a.b(dVar2, fVar)) {
                return null;
            }
            this.i = dVar2;
            dVar2.i();
            this.f.f(dVar2);
            x(true);
            return dVar2;
        } finally {
            fVar.v();
        }
    }

    public final void x(boolean z2) {
        b0u0 q;
        b0u0 e;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                A(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            A(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                this.e.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            e = this.e.q(4, 100L);
            q = this.f.e(0, 200L);
        } else {
            q = this.e.q(0, 200L);
            e = this.f.e(8, 100L);
        }
        c0u0 c0u0Var = new c0u0();
        ArrayList<b0u0> arrayList = c0u0Var.a;
        arrayList.add(e);
        View view = e.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = q.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(q);
        c0u0Var.b();
    }

    public final void y(View view) {
        t8l wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.vkontakte.android.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.vkontakte.android.R.id.action_bar);
        if (findViewById instanceof t8l) {
            wrapper = (t8l) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.vkontakte.android.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.vkontakte.android.R.id.action_bar_container);
        this.d = actionBarContainer;
        t8l t8lVar = this.e;
        if (t8lVar == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(qpx0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.a = t8lVar.getContext();
        if ((this.e.n() & 4) != 0) {
            this.h = true;
        }
        Context context = this.a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        z(context.getResources().getBoolean(com.vkontakte.android.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, R$styleable.a, com.vkontakte.android.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void z(boolean z2) {
        this.n = z2;
        if (z2) {
            this.d.setTabContainer(null);
            this.e.m();
        } else {
            this.e.m();
            this.d.setTabContainer(null);
        }
        boolean z3 = false;
        boolean z4 = this.e.i() == 2;
        this.e.k(!this.n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (!this.n && z4) {
            z3 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public qpx0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        y(dialog.getWindow().getDecorView());
    }
}
