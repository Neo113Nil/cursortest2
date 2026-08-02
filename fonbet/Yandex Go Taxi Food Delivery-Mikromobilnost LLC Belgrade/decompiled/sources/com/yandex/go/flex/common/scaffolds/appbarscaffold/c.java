package com.yandex.go.flex.common.scaffolds.appbarscaffold;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.c;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.shadow.AppBarShadowView;
import com.yandex.passport.internal.widget.NotTouchableToolbar;
import defpackage.b3k;
import defpackage.c231;
import defpackage.cma1;
import defpackage.cnr0;
import defpackage.cyl;
import defpackage.ew2;
import defpackage.exy0;
import defpackage.gtq0;
import defpackage.h2y;
import defpackage.h8;
import defpackage.hgr0;
import defpackage.ip2;
import defpackage.jhc;
import defpackage.jl40;
import defpackage.jp2;
import defpackage.kp2;
import defpackage.kth0;
import defpackage.l3k;
import defpackage.lp2;
import defpackage.m810;
import defpackage.mds0;
import defpackage.mih0;
import defpackage.mjm0;
import defpackage.n35;
import defpackage.n530;
import defpackage.nch0;
import defpackage.np2;
import defpackage.ny61;
import defpackage.op2;
import defpackage.ovl;
import defpackage.pjm0;
import defpackage.pp2;
import defpackage.pvl;
import defpackage.pxl;
import defpackage.qje;
import defpackage.qp2;
import defpackage.r8;
import defpackage.rp2;
import defpackage.t6f0;
import defpackage.tje;
import defpackage.u131;
import defpackage.uh6;
import defpackage.w0j;
import defpackage.wjm0;
import defpackage.xng0;
import defpackage.xvl;
import defpackage.ycc;
import flex.section.divkit.DivkitSnippet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewBottomRounded$1;

/* loaded from: classes.dex */
public final class c extends pjm0 {
    public Div2View A;
    public Div2View B;
    public h2y C;
    public RecyclerView D;
    public final rp2 E = new rp2();
    public r8 F;
    public final ovl G;
    public final l3k H;
    public final qp2 I;
    public final float J;
    public final jhc K;
    public final jhc L;
    public final wjm0 M;
    public final pp2 N;
    public final op2 O;
    public final AppBarScaffoldController$contentHierarchyChangeListener$1 P;
    public final kp2 Q;
    public final lp2 R;
    public final w0j a;
    public final b3k b;
    public final n530 c;
    public final ru.yandex.taxi.design.utils.a w;
    public AppBarScaffold x;
    public Div2View y;
    public Div2View z;

    /* JADX WARN: Type inference failed for: r1v8, types: [com.yandex.go.flex.common.scaffolds.appbarscaffold.AppBarScaffoldController$contentHierarchyChangeListener$1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kp2] */
    public c(w0j w0jVar, b3k b3kVar, exy0 exy0Var, cyl cylVar, n530 n530Var, ru.yandex.taxi.design.utils.a aVar) {
        this.a = w0jVar;
        this.b = b3kVar;
        this.c = n530Var;
        this.w = aVar;
        new pvl();
        this.G = new ovl();
        this.H = new l3k(cylVar);
        this.I = new qp2();
        float o = uh6.o(32.0f);
        this.J = o;
        this.K = new jhc(exy0Var, new jp2(this, 0));
        this.L = new jhc(exy0Var, new jp2(this, 1));
        this.M = new wjm0(new jp2(this, 2));
        this.N = new pp2(this);
        this.O = new op2(this, o);
        this.P = new ViewGroup.OnHierarchyChangeListener() { // from class: com.yandex.go.flex.common.scaffolds.appbarscaffold.AppBarScaffoldController$contentHierarchyChangeListener$1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                c.this.b();
                c.this.f();
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
                c.this.e();
                c.this.b();
                c.this.f();
            }
        };
        this.Q = new ip2() { // from class: kp2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [np2] */
            /* JADX WARN: Type inference failed for: r5v5, types: [np2] */
            @Override // defpackage.gp2
            public final void a(AppBarLayout appBarLayout, int i) {
                mp2 mp2Var;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                c cVar = c.this;
                h2y h2yVar = cVar.C;
                qp2 qp2Var = cVar.I;
                op2 op2Var = cVar.O;
                if (h2yVar != null) {
                    AppBarShadowView appBarShadowView = h2yVar.c;
                    r8 r8Var = cVar.F;
                    if (totalScrollRange != 0) {
                        mp2 mp2Var2 = r8Var instanceof mp2 ? (mp2) r8Var : null;
                        mp2Var = mp2Var2;
                        if (mp2Var2 == null) {
                            mp2Var = new mp2(1, appBarShadowView);
                        }
                        boolean z = Math.abs(i) == totalScrollRange;
                        View view = (View) mp2Var.b;
                        if (!jl40.l(mp2Var.c, Boolean.valueOf(z))) {
                            boolean z2 = mp2Var.c == null;
                            mp2Var.c = Boolean.valueOf(z);
                            float f = z ? 1.0f : 0.0f;
                            view.animate().cancel();
                            if (z2) {
                                view.setAlpha(f);
                            } else {
                                view.animate().alpha(f).setDuration(150L).start();
                            }
                        }
                    } else {
                        mp2Var = r8Var instanceof np2 ? (np2) r8Var : null;
                        if (mp2Var == null) {
                            mp2Var = new np2(cVar.J, appBarShadowView);
                        }
                    }
                    cVar.F = mp2Var;
                }
                cVar.b();
                cVar.f();
                RecyclerView recyclerView = cVar.D;
                if (recyclerView != null) {
                    recyclerView.removeOnScrollListener(op2Var);
                }
                if (totalScrollRange != 0) {
                    cVar.j(Math.abs(i) / totalScrollRange);
                    qp2Var.a.j(1.0f - r12);
                } else {
                    RecyclerView recyclerView2 = cVar.D;
                    if (recyclerView2 != null) {
                        recyclerView2.addOnScrollListener(op2Var);
                        op2Var.a(recyclerView2);
                    }
                    qp2Var.a.j(0.0d);
                }
            }
        };
        this.R = new lp2(0, this);
    }

    public static float g(RecyclerView recyclerView) {
        View view;
        RecyclerView.e layoutManager;
        if (recyclerView.getChildCount() > 0) {
            int i = 0 + 1;
            View childAt = recyclerView.getChildAt(0);
            if (childAt == null) {
                ny61.s();
                return 0.0f;
            }
            if (i < recyclerView.getChildCount()) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                while (true) {
                    int i2 = i + 1;
                    View childAt2 = recyclerView.getChildAt(i);
                    if (childAt2 == null) {
                        ny61.s();
                        return 0.0f;
                    }
                    int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt2);
                    if (childAdapterPosition > childAdapterPosition2) {
                        childAt = childAt2;
                        childAdapterPosition = childAdapterPosition2;
                    }
                    if (!(i2 < recyclerView.getChildCount())) {
                        break;
                    }
                    i = i2;
                }
            }
            view = childAt;
        } else {
            view = null;
        }
        if (view == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return 0.0f;
        }
        return Math.abs(layoutManager.n0(view));
    }

    public static void h(ViewGroup viewGroup, boolean z) {
        if (viewGroup.isEnabled() == z) {
            return;
        }
        viewGroup.setEnabled(z);
        Iterator h8Var = new h8(3, viewGroup);
        ArrayList arrayList = new ArrayList();
        while (h8Var.hasNext()) {
            Object next = h8Var.next();
            Iterator it = (Iterator) n35.x.invoke(next);
            if (it == null || !it.hasNext()) {
                while (!h8Var.hasNext() && !arrayList.isEmpty()) {
                    h8Var = (Iterator) kotlin.collections.a.Z(arrayList);
                    ycc.z(arrayList);
                }
            } else {
                arrayList.add(h8Var);
                h8Var = it;
            }
            ((View) next).setEnabled(z);
        }
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        h2y h2yVar = this.C;
        if (h2yVar != null) {
            return h2yVar.e;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final void b() {
        h2y h2yVar = this.C;
        RecyclerView recyclerView = h2yVar != null ? (RecyclerView) h2yVar.e.findViewById(nch0.flexsdk_recycler_view_id) : null;
        if (this.D != recyclerView) {
            e();
            this.D = recyclerView;
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(this.N);
            }
        }
    }

    public final Div2View c(ViewGroup viewGroup, Div2Context div2Context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Div2View a = this.H.a(div2Context, marginLayoutParams);
        a.setId(View.generateViewId());
        viewGroup.addView(a);
        return a;
    }

    public final void d(Div2View div2View, DivkitSnippet divkitSnippet, pxl pxlVar) {
        Object parent = div2View.getParent();
        View view = parent instanceof View ? (View) parent : null;
        mds0 c = divkitSnippet != null ? this.G.c(divkitSnippet, pxlVar, this.c) : null;
        if (c == null) {
            if (view != null) {
                view.setVisibility(8);
            }
            div2View.cleanup();
            div2View.setActionHandler(null);
            return;
        }
        xvl xvlVar = c.a;
        div2View.setData(xvlVar.b.a, xvlVar.c);
        div2View.setActionHandler(c.b);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void e() {
        RecyclerView recyclerView = this.D;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.N);
        }
        RecyclerView recyclerView2 = this.D;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.O);
        }
        this.D = null;
    }

    public final void f() {
        RecyclerView recyclerView = this.D;
        if (recyclerView == null) {
            return;
        }
        Div2View div2View = this.B;
        if (div2View != null) {
            div2View.setTranslationY(-g(recyclerView));
        }
        h2y h2yVar = this.C;
        if (h2yVar != null) {
            i(h2yVar, recyclerView);
        }
    }

    public final void i(h2y h2yVar, RecyclerView recyclerView) {
        if (this.E.a == null) {
            return;
        }
        r8 r8Var = this.F;
        np2 np2Var = r8Var instanceof np2 ? (np2) r8Var : null;
        if (np2Var != null) {
            np2Var.Hg(recyclerView != null ? g(recyclerView) : 0.0f);
        }
        h2yVar.c.setTranslationY(h2yVar.b.getBottom() - (r1.getIntrinsicHeight() - r0.c.bottom));
    }

    public final void j(float f) {
        h2y h2yVar = this.C;
        if (h2yVar != null) {
            GoFrameLayout goFrameLayout = h2yVar.f;
            Drawable background = h2yVar.d.getBackground();
            if (background != null) {
                background.setAlpha((int) (255.0f * f));
            }
            goFrameLayout.setAlpha(1.0f - f);
            h(goFrameLayout, ((double) f) < 0.5d);
        }
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        h2y h2yVar;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(kth0.layout_shared_appbarscaffold, (ViewGroup) null, false);
        int i = mih0.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i, inflate);
        if (appBarLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
            i = mih0.appbar_shadow;
            AppBarShadowView appBarShadowView = (AppBarShadowView) cma1.O(i, inflate);
            if (appBarShadowView != null) {
                i = mih0.bottom_content;
                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                if (goFrameLayout != null) {
                    i = mih0.collapsing;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) cma1.O(i, inflate);
                    if (collapsingToolbarLayout != null) {
                        i = mih0.content;
                        GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, inflate);
                        if (goFrameLayout2 != null) {
                            i = mih0.scrollable_background_content;
                            GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i, inflate);
                            if (goFrameLayout3 != null) {
                                i = mih0.toolbar_content;
                                NotTouchableToolbar notTouchableToolbar = (NotTouchableToolbar) cma1.O(i, inflate);
                                if (notTouchableToolbar != null) {
                                    i = mih0.top_content;
                                    GoFrameLayout goFrameLayout4 = (GoFrameLayout) cma1.O(i, inflate);
                                    if (goFrameLayout4 != null) {
                                        this.C = new h2y(coordinatorLayout, appBarLayout, appBarShadowView, goFrameLayout, collapsingToolbarLayout, goFrameLayout2, goFrameLayout3, notTouchableToolbar, goFrameLayout4);
                                        appBarLayout.setStateListAnimator(null);
                                        appBarLayout.setElevation(0.0f);
                                        Div2Context a = this.b.a(viewGroup.getContext(), this.a);
                                        goFrameLayout3.setClipChildren(false);
                                        goFrameLayout3.setClipToPadding(false);
                                        Div2View c = c(goFrameLayout3, a, new FrameLayout.LayoutParams(-1, -2));
                                        c.setClipChildren(false);
                                        c.setClipToPadding(false);
                                        this.B = c;
                                        this.y = c(goFrameLayout4, a, new FrameLayout.LayoutParams(-1, -2));
                                        this.z = c(notTouchableToolbar, a, new Toolbar.LayoutParams(-1, -2));
                                        this.A = c(goFrameLayout, a, new FrameLayout.LayoutParams(-1, -2));
                                        com.yandex.div.core.expression.variables.a divVariableController = a.getDivVariableController();
                                        c231 c231Var = this.I.a;
                                        c231 c231Var2 = new c231[]{c231Var}[0];
                                        c231 g = divVariableController.g(c231Var2.c());
                                        if (g != null) {
                                            c231Var2.h(g);
                                        }
                                        divVariableController.i(c231Var);
                                        wjm0 wjm0Var = this.M;
                                        wjm0Var.cancel();
                                        wjm0Var.b = goFrameLayout2;
                                        t6f0 t6f0Var = new t6f0(3, wjm0Var);
                                        WeakHashMap weakHashMap = androidx.core.view.b.a;
                                        ViewCompat$Api21Impl.o(goFrameLayout2, t6f0Var);
                                        goFrameLayout2.setOnHierarchyChangeListener(this.P);
                                        appBarLayout.addOnOffsetChangedListener((ip2) this.Q);
                                        appBarLayout.addOnLayoutChangeListener(this.R);
                                        c231 g2 = a.getDivVariableController().g("ignoreFitSystemWindows");
                                        u131 u131Var = g2 instanceof u131 ? (u131) g2 : null;
                                        if ((u131Var != null ? jl40.l(u131Var.d(), Boolean.TRUE) : false) && (h2yVar = this.C) != null) {
                                            h2yVar.b.setFitsSystemWindows(false);
                                        }
                                        return coordinatorLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.M.cancel();
        this.K.cancel();
        this.L.cancel();
        this.x = null;
        Div2View div2View = this.y;
        if (div2View != null) {
            div2View.cleanup();
            div2View.setActionHandler(null);
        }
        Div2View div2View2 = this.z;
        if (div2View2 != null) {
            div2View2.cleanup();
            div2View2.setActionHandler(null);
        }
        Div2View div2View3 = this.A;
        if (div2View3 != null) {
            div2View3.cleanup();
            div2View3.setActionHandler(null);
        }
        Div2View div2View4 = this.B;
        if (div2View4 != null) {
            div2View4.cleanup();
            div2View4.setActionHandler(null);
        }
        h2y h2yVar = this.C;
        if (h2yVar != null) {
            h2yVar.b.removeOnOffsetChangedListener((ip2) this.Q);
        }
        h2y h2yVar2 = this.C;
        if (h2yVar2 != null) {
            h2yVar2.b.removeOnLayoutChangeListener(this.R);
        }
        h2y h2yVar3 = this.C;
        if (h2yVar3 != null) {
            h2yVar3.e.setOnHierarchyChangeListener(null);
        }
        RecyclerView recyclerView = this.D;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.O);
        }
        e();
        this.F = null;
        this.C = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        Float f;
        Div2View div2View;
        ew2 ew2Var = (ew2) obj;
        h2y h2yVar = this.C;
        mjm0 mjm0Var = (mjm0) ew2Var.b;
        AppBarScaffold appBarScaffold = mjm0Var instanceof AppBarScaffold ? (AppBarScaffold) mjm0Var : null;
        if (appBarScaffold != null) {
            DivkitSnippet divkitSnippet = appBarScaffold.f;
            if (jl40.l(this.x, appBarScaffold) || h2yVar == null) {
                return;
            }
            this.x = appBarScaffold;
            this.L.a(appBarScaffold.b);
            this.K.a(appBarScaffold.h);
            GoFrameLayout goFrameLayout = this.M.b;
            if (goFrameLayout != null) {
                goFrameLayout.requestApplyInsets();
            }
            pxl pxlVar = new pxl((cnr0) ew2Var.c);
            Div2View div2View2 = this.y;
            if (div2View2 != null) {
                d(div2View2, appBarScaffold.d, pxlVar);
            }
            Div2View div2View3 = this.z;
            if (div2View3 != null) {
                d(div2View3, appBarScaffold.a, pxlVar);
            }
            Div2View div2View4 = this.A;
            if (div2View4 != null) {
                d(div2View4, appBarScaffold.e, pxlVar);
            }
            Div2View div2View5 = this.B;
            if (div2View5 != null) {
                d(div2View5, divkitSnippet, pxlVar);
            }
            Div2View div2View6 = this.B;
            int i = 0;
            if (div2View6 != null) {
                h(div2View6, false);
            }
            if (divkitSnippet == null && (div2View = this.B) != null) {
                div2View.setTranslationY(0.0f);
            }
            b();
            f();
            AppBarLayout appBarLayout = h2yVar.b;
            Float f2 = appBarScaffold.c;
            int b = f2 != null ? m810.b(uh6.o(f2.floatValue())) : 0;
            if (b <= 0) {
                appBarLayout.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            } else {
                appBarLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(b));
                appBarLayout.setClipToOutline(true);
            }
            boolean z = h2yVar.f.getVisibility() == 0;
            CollapsingToolbarLayout collapsingToolbarLayout = h2yVar.d;
            ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
                return;
            }
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
            layoutParams2.setScrollFlags(z ? 3 : 0);
            collapsingToolbarLayout.setLayoutParams(layoutParams2);
            AppBarScaffold appBarScaffold2 = this.x;
            if (appBarScaffold2 != null && (f = appBarScaffold2.c) != null) {
                i = m810.b(uh6.o(f.floatValue()));
            }
            int i2 = i;
            rp2 rp2Var = this.E;
            Drawable drawable = rp2Var.a;
            Rect rect = rp2Var.c;
            if (drawable == null || rp2Var.b != i2) {
                CoordinatorLayout coordinatorLayout = h2yVar.a;
                AppBarShadowView appBarShadowView = h2yVar.c;
                Context context = coordinatorLayout.getContext();
                Drawable v = gtq0.v(this.w, context, i2, new hgr0(0.0f, tje.w(2, context), tje.w(4, context), qje.u(context.getTheme(), xng0.effectShadowBottomClose)), 0, 16);
                rp2Var.a = v;
                rp2Var.b = i2;
                v.getPadding(rect);
                appBarShadowView.setBackground(v);
                appBarShadowView.setCutout(i2, rect);
                ViewGroup.LayoutParams layoutParams3 = appBarShadowView.getLayoutParams();
                if (layoutParams3 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.height = v.getIntrinsicHeight();
                marginLayoutParams.leftMargin = -rect.left;
                marginLayoutParams.rightMargin = -rect.right;
                appBarShadowView.setLayoutParams(marginLayoutParams);
            }
            RecyclerView recyclerView = this.D;
            if (recyclerView == null) {
                recyclerView = (RecyclerView) h2yVar.e.findViewById(nch0.flexsdk_recycler_view_id);
            }
            i(h2yVar, recyclerView);
        }
    }
}
