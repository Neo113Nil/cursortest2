package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.PopupWindow;
import com.yandex.div.core.d;
import com.yandex.div.core.e;
import com.yandex.div.core.tooltip.DivTooltipContainer;
import com.yandex.div.core.tooltip.a;
import com.yandex.div.core.tooltip.b;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.i;
import com.yandex.div2.DivTooltip$Position;
import defpackage.aw5;
import defpackage.bj91;
import defpackage.c5l;
import defpackage.cj91;
import defpackage.f5l;
import defpackage.ffx;
import defpackage.gil;
import defpackage.h5l;
import defpackage.i5l;
import defpackage.izz0;
import defpackage.jjl;
import defpackage.kil;
import defpackage.m3k;
import defpackage.m6o;
import defpackage.msk;
import defpackage.ngh0;
import defpackage.ny61;
import defpackage.qx60;
import defpackage.rvo;
import defpackage.rx60;
import defpackage.sls;
import defpackage.suz0;
import defpackage.tis0;
import defpackage.tls;
import defpackage.uml;
import defpackage.unr0;
import defpackage.wwg;
import defpackage.yh;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class b {
    public final i a;
    public final i5l b;
    public final m6o c;
    public final jjl d;
    public final yh e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final Handler g = new Handler(Looper.getMainLooper());

    public b(i iVar, i5l i5lVar, jjl jjlVar, yh yhVar, m6o m6oVar) {
        this.a = iVar;
        this.b = i5lVar;
        this.c = m6oVar;
        this.d = jjlVar;
        this.e = yhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Type inference failed for: r0v3, types: [c5l, jil] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final b bVar, final View view, final gil gilVar, final aw5 aw5Var, final boolean z) {
        View view2;
        View view3;
        Ref$BooleanRef ref$BooleanRef;
        boolean z2;
        Ref$BooleanRef ref$BooleanRef2;
        m3k m3kVar;
        kil kilVar;
        qx60 onBackPressedDispatcher;
        boolean n;
        msk s;
        m3k div;
        View j;
        bVar.getClass();
        final Div2View div2View = aw5Var.a;
        final rvo rvoVar = aw5Var.b;
        m3k m3kVar2 = gilVar.f;
        m3k m3kVar3 = gilVar.l;
        boolean z3 = m3kVar3 != null;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        int p = z3 ? -1 : uml.p(m3kVar2.d().getWidth(), displayMetrics, rvoVar, null);
        int p2 = z3 ? -1 : uml.p(m3kVar2.d().getHeight(), displayMetrics, rvoVar, null);
        String str = gilVar.d;
        if (str != null) {
            j = bj91.j(div2View, str);
            view2 = j;
        } else {
            view2 = null;
        }
        jjl jjlVar = bVar.d;
        final DivTooltipContainer divTooltipContainer = new DivTooltipContainer(aw5Var.a.getContext(), null, 0, 6, null);
        View a = m3kVar3 != null ? jjlVar.a(aw5Var, m3kVar3) : null;
        if (view2 == null || (s = com.yandex.div.core.view2.divs.a.s(view2)) == null || (div = s.getDiv()) == null) {
            view3 = null;
        } else {
            view3 = jjlVar.a(aw5Var, div);
            cj91.b(view3);
        }
        divTooltipContainer.setViews(a, view3, jjlVar.a(aw5Var, m3kVar2));
        divTooltipContainer.setLayoutParams(new ViewGroup.LayoutParams(p, p2));
        final View tooltipView = divTooltipContainer.getTooltipView();
        if (tooltipView == null) {
            return;
        }
        int i = p2;
        boolean e = bj91.e(gilVar);
        final SafePopupWindow safePopupWindow = (SafePopupWindow) DivTooltipController$1.w.invoke(divTooltipContainer, Integer.valueOf(p), Integer.valueOf(i));
        final izz0 izz0Var = new izz0(new tis0(view), safePopupWindow);
        Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
        safePopupWindow.setTouchable(true);
        safePopupWindow.setOutsideTouchable(bj91.f(gilVar, rvoVar));
        safePopupWindow.setFocusable(e);
        safePopupWindow.setTouchModal(e);
        boolean isOutsideTouchable = safePopupWindow.isOutsideTouchable();
        List list = gilVar.m;
        if (m3kVar3 != null) {
            n = bj91.n(m3kVar3);
            if (n) {
                ref$BooleanRef = ref$BooleanRef3;
                z2 = true;
                Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef;
                safePopupWindow.setTouchInterceptor(new PopupWindowTouchListener(divTooltipContainer, e, isOutsideTouchable, list, aw5Var, izz0Var, z2, new sls() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        b.this.d(gilVar.h);
                        return zy11.a;
                    }
                }));
                if (!z3) {
                    a.j(safePopupWindow, gilVar, rvoVar);
                }
                if (z3) {
                    ref$BooleanRef2 = ref$BooleanRef4;
                } else {
                    safePopupWindow.setAttachedInDecor(true);
                    safePopupWindow.setClippingEnabled(false);
                    ref$BooleanRef2 = ref$BooleanRef4;
                    ref$BooleanRef2.element = true;
                }
                if (bVar.e.a(div2View.getContext())) {
                    m3kVar = m3kVar2;
                    kilVar = null;
                } else {
                    kil kilVar2 = new kil(bVar, gilVar, div2View);
                    rx60 r = wwg.r(div2View);
                    if (r == null || (onBackPressedDispatcher = r.getOnBackPressedDispatcher()) == null) {
                        div2View.logError(new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
                    } else {
                        onBackPressedDispatcher.b(kilVar2);
                    }
                    kilVar = kilVar2;
                    m3kVar = m3kVar2;
                }
                final m3k m3kVar4 = m3kVar;
                final suz0 suz0Var = new suz0(gilVar.h, aw5Var, gilVar, safePopupWindow, kilVar);
                if (!e) {
                    divTooltipContainer.setDismissAction(new tls() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$2
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            tis0 tis0Var = izz0.this.a;
                            tis0Var.b = true;
                            tis0Var.H((MotionEvent) obj);
                            return zy11.a;
                        }
                    });
                }
                safePopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(gilVar, aw5Var, divTooltipContainer, div2View, view, safePopupWindow, suz0Var) { // from class: iil
                    public final /* synthetic */ gil b;
                    public final /* synthetic */ aw5 c;
                    public final /* synthetic */ DivTooltipContainer w;
                    public final /* synthetic */ View x;
                    public final /* synthetic */ SafePopupWindow y;
                    public final /* synthetic */ suz0 z;

                    {
                        this.x = view;
                        this.y = safePopupWindow;
                        this.z = suz0Var;
                    }

                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        List l;
                        b bVar2 = b.this;
                        LinkedHashMap linkedHashMap = bVar2.f;
                        gil gilVar2 = this.b;
                        linkedHashMap.remove(gilVar2.h);
                        m3k m3kVar5 = gilVar2.f;
                        i iVar = bVar2.a;
                        aw5 aw5Var2 = this.c;
                        i.l(iVar, aw5Var2.a, aw5Var2.b, null, m3kVar5);
                        LinkedHashMap f = iVar.f();
                        DivTooltipContainer divTooltipContainer2 = this.w;
                        m3k m3kVar6 = (m3k) f.get(divTooltipContainer2);
                        if (m3kVar6 != null && (l = m3kVar6.d().l()) != null) {
                            rvo rvoVar2 = aw5Var2.b;
                            iVar.j(aw5Var2.a, rvoVar2, divTooltipContainer2, m3kVar6, EmptyList.a, i.e(l, rvoVar2));
                        }
                        bj91.p(this.y.getContentView(), bVar2.e);
                        mx60 mx60Var = this.z.f;
                        if (mx60Var == null) {
                            return;
                        }
                        mx60Var.h(false);
                    }
                });
                i5l i5lVar = bVar.b;
                final Ref$BooleanRef ref$BooleanRef5 = ref$BooleanRef2;
                final View view4 = view2;
                final boolean z4 = z3;
                ?? r0 = new c5l(view, bVar, div2View, gilVar, z, divTooltipContainer, safePopupWindow, tooltipView, rvoVar, z4, ref$BooleanRef5, view4, aw5Var, m3kVar4) { // from class: jil
                    public final /* synthetic */ View A;
                    public final /* synthetic */ rvo B;
                    public final /* synthetic */ boolean C;
                    public final /* synthetic */ Ref$BooleanRef D;
                    public final /* synthetic */ View E;
                    public final /* synthetic */ aw5 F;
                    public final /* synthetic */ m3k G;
                    public final /* synthetic */ View b;
                    public final /* synthetic */ b c;
                    public final /* synthetic */ Div2View w;
                    public final /* synthetic */ gil x;
                    public final /* synthetic */ DivTooltipContainer y;
                    public final /* synthetic */ SafePopupWindow z;

                    {
                        this.y = divTooltipContainer;
                        this.z = safePopupWindow;
                        this.A = tooltipView;
                        this.B = rvoVar;
                        this.C = z4;
                        this.D = ref$BooleanRef5;
                        this.E = view4;
                        this.F = aw5Var;
                        this.G = m3kVar4;
                    }

                    @Override // defpackage.c5l
                    public final void finish(boolean z5) {
                        final View view5;
                        final Div2View div2View2;
                        final View view6;
                        final gil gilVar2;
                        final rvo rvoVar2;
                        final b bVar2;
                        b bVar3;
                        boolean z6;
                        int i2;
                        Point point;
                        b bVar4 = this.c;
                        gil gilVar3 = this.x;
                        if (!z5 && !suz0.this.g) {
                            View view7 = this.b;
                            if (view7.isAttachedToWindow()) {
                                bVar4.getClass();
                                i iVar = bVar4.a;
                                m6o m6oVar = bVar4.c;
                                final DivTooltipContainer divTooltipContainer2 = this.y;
                                boolean V = ffx.V(divTooltipContainer2);
                                Div2View div2View3 = this.w;
                                final SafePopupWindow safePopupWindow2 = this.z;
                                View view8 = this.A;
                                rvo rvoVar3 = this.B;
                                final boolean z7 = this.C;
                                final Ref$BooleanRef ref$BooleanRef6 = this.D;
                                final View view9 = this.E;
                                final aw5 aw5Var2 = this.F;
                                final m3k m3kVar5 = this.G;
                                if (!V || divTooltipContainer2.isLayoutRequested()) {
                                    view5 = view8;
                                    div2View2 = div2View3;
                                    view6 = view7;
                                    gilVar2 = gilVar3;
                                    rvoVar2 = rvoVar3;
                                    bVar2 = bVar4;
                                    divTooltipContainer2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$21$$inlined$doOnActualLayout$1
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public void onLayoutChange(View view10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                            view10.removeOnLayoutChangeListener(this);
                                            Rect c = bj91.c(Div2View.this);
                                            Point g = bj91.g(view5, view6, gilVar2, rvoVar2);
                                            int min = Math.min(view5.getWidth(), c.width());
                                            int min2 = Math.min(view5.getHeight(), c.height());
                                            if (min < view5.getWidth()) {
                                                bVar2.c.a(Div2View.this.get_divData(), Div2View.this.getDataTag()).f(new Throwable("Tooltip width > screen size, width was changed"));
                                            }
                                            if (min2 < view5.getHeight()) {
                                                bVar2.c.a(Div2View.this.get_divData(), Div2View.this.getDataTag()).f(new Throwable("Tooltip height > screen size, height was changed"));
                                            }
                                            if (z7) {
                                                Point point2 = ref$BooleanRef6.element ? new Point(0, 0) : new Point(c.left, c.top);
                                                safePopupWindow2.update(0, 0, -1, -1);
                                                divTooltipContainer2.setTooltipPosition(g.x - point2.x, g.y - point2.y, min, min2);
                                                View view11 = view9;
                                                if (view11 != null) {
                                                    int[] iArr = new int[2];
                                                    view11.getLocationOnScreen(iArr);
                                                    Point point3 = new Point(iArr[0], iArr[1]);
                                                    divTooltipContainer2.setBringToTopPosition(point3.x - point2.x, point3.y - point2.y, view11.getWidth(), view11.getHeight());
                                                }
                                            } else {
                                                safePopupWindow2.update(g.x, g.y, min, min2);
                                            }
                                            b bVar5 = bVar2;
                                            aw5 aw5Var3 = aw5Var2;
                                            m3k m3kVar6 = m3kVar5;
                                            DivTooltipContainer divTooltipContainer3 = divTooltipContainer2;
                                            i iVar2 = bVar5.a;
                                            Div2View div2View4 = aw5Var3.a;
                                            rvo rvoVar4 = aw5Var3.b;
                                            i.l(iVar2, div2View4, rvoVar4, null, m3kVar6);
                                            i.l(bVar5.a, aw5Var3.a, rvoVar4, divTooltipContainer3, m3kVar6);
                                            bVar2.getClass();
                                        }
                                    });
                                } else {
                                    Rect c = bj91.c(div2View3);
                                    Point g = bj91.g(view8, view7, gilVar3, rvoVar3);
                                    int min = Math.min(view8.getWidth(), c.width());
                                    int min2 = Math.min(view8.getHeight(), c.height());
                                    if (min < view8.getWidth()) {
                                        bVar3 = bVar4;
                                        z6 = z7;
                                        m6oVar.a(div2View3.get_divData(), div2View3.getDataTag()).f(new Throwable("Tooltip width > screen size, width was changed"));
                                    } else {
                                        bVar3 = bVar4;
                                        z6 = z7;
                                    }
                                    if (min2 < view8.getHeight()) {
                                        m6oVar.a(div2View3.get_divData(), div2View3.getDataTag()).f(new Throwable("Tooltip height > screen size, height was changed"));
                                    }
                                    if (z6) {
                                        if (ref$BooleanRef6.element) {
                                            i2 = 0;
                                            point = new Point(0, 0);
                                        } else {
                                            i2 = 0;
                                            point = new Point(c.left, c.top);
                                        }
                                        safePopupWindow2.update(i2, i2, -1, -1);
                                        divTooltipContainer2.setTooltipPosition(g.x - point.x, g.y - point.y, min, min2);
                                        if (view9 != null) {
                                            int[] iArr = new int[2];
                                            view9.getLocationOnScreen(iArr);
                                            Point point2 = new Point(iArr[0], iArr[1]);
                                            divTooltipContainer2.setBringToTopPosition(point2.x - point.x, point2.y - point.y, view9.getWidth(), view9.getHeight());
                                        }
                                    } else {
                                        safePopupWindow2.update(g.x, g.y, min, min2);
                                    }
                                    Div2View div2View4 = aw5Var2.a;
                                    rvo rvoVar4 = aw5Var2.b;
                                    i.l(iVar, div2View4, rvoVar4, null, m3kVar5);
                                    i.l(iVar, aw5Var2.a, rvoVar4, divTooltipContainer2, m3kVar5);
                                    view5 = view8;
                                    div2View2 = div2View3;
                                    view6 = view7;
                                    gilVar2 = gilVar3;
                                    rvoVar2 = rvoVar3;
                                    bVar2 = bVar3;
                                }
                                safePopupWindow2.showAtLocation(view6, 0, 0, 0);
                                View substrateView = divTooltipContainer2.getSubstrateView();
                                if (substrateView != null) {
                                    Animation d = a.d(gilVar2.a, rvoVar2, view5, (DivTooltip$Position) gilVar2.k.a(rvoVar2), true);
                                    AlphaAnimation c2 = a.c(true);
                                    c2.setDuration(d.getDuration());
                                    c2.setInterpolator(d.getInterpolator());
                                    view5.startAnimation(d);
                                    substrateView.startAnimation(c2);
                                }
                                bj91.p(view5, bVar2.e);
                                if (((Number) gilVar2.g.a(rvoVar2)).longValue() != 0) {
                                    bVar2.g.postDelayed(new tqs(7, bVar2, gilVar2, div2View2), ((Number) gilVar2.g.a(rvoVar2)).longValue());
                                    return;
                                }
                                return;
                            }
                        }
                        bVar4.f.remove(gilVar3.h);
                    }
                };
                i5lVar.getClass();
                d dVar = new d(r0);
                h5l p3 = new e(i5lVar, dVar, r0, rvoVar).p(m3kVar4);
                dVar.j();
                suz0Var.e = p3;
                bVar.f.put(gilVar.h, suz0Var);
            }
        }
        ref$BooleanRef = ref$BooleanRef3;
        z2 = false;
        Ref$BooleanRef ref$BooleanRef42 = ref$BooleanRef;
        safePopupWindow.setTouchInterceptor(new PopupWindowTouchListener(divTooltipContainer, e, isOutsideTouchable, list, aw5Var, izz0Var, z2, new sls() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                b.this.d(gilVar.h);
                return zy11.a;
            }
        }));
        if (!z3) {
        }
        if (z3) {
        }
        if (bVar.e.a(div2View.getContext())) {
        }
        final m3k m3kVar42 = m3kVar;
        final suz0 suz0Var2 = new suz0(gilVar.h, aw5Var, gilVar, safePopupWindow, kilVar);
        if (!e) {
        }
        safePopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(gilVar, aw5Var, divTooltipContainer, div2View, view, safePopupWindow, suz0Var2) { // from class: iil
            public final /* synthetic */ gil b;
            public final /* synthetic */ aw5 c;
            public final /* synthetic */ DivTooltipContainer w;
            public final /* synthetic */ View x;
            public final /* synthetic */ SafePopupWindow y;
            public final /* synthetic */ suz0 z;

            {
                this.x = view;
                this.y = safePopupWindow;
                this.z = suz0Var2;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                List l;
                b bVar2 = b.this;
                LinkedHashMap linkedHashMap = bVar2.f;
                gil gilVar2 = this.b;
                linkedHashMap.remove(gilVar2.h);
                m3k m3kVar5 = gilVar2.f;
                i iVar = bVar2.a;
                aw5 aw5Var2 = this.c;
                i.l(iVar, aw5Var2.a, aw5Var2.b, null, m3kVar5);
                LinkedHashMap f = iVar.f();
                DivTooltipContainer divTooltipContainer2 = this.w;
                m3k m3kVar6 = (m3k) f.get(divTooltipContainer2);
                if (m3kVar6 != null && (l = m3kVar6.d().l()) != null) {
                    rvo rvoVar2 = aw5Var2.b;
                    iVar.j(aw5Var2.a, rvoVar2, divTooltipContainer2, m3kVar6, EmptyList.a, i.e(l, rvoVar2));
                }
                bj91.p(this.y.getContentView(), bVar2.e);
                mx60 mx60Var = this.z.f;
                if (mx60Var == null) {
                    return;
                }
                mx60Var.h(false);
            }
        });
        i5l i5lVar2 = bVar.b;
        final Ref$BooleanRef ref$BooleanRef52 = ref$BooleanRef2;
        final View view42 = view2;
        final boolean z42 = z3;
        ?? r02 = new c5l(view, bVar, div2View, gilVar, z, divTooltipContainer, safePopupWindow, tooltipView, rvoVar, z42, ref$BooleanRef52, view42, aw5Var, m3kVar42) { // from class: jil
            public final /* synthetic */ View A;
            public final /* synthetic */ rvo B;
            public final /* synthetic */ boolean C;
            public final /* synthetic */ Ref$BooleanRef D;
            public final /* synthetic */ View E;
            public final /* synthetic */ aw5 F;
            public final /* synthetic */ m3k G;
            public final /* synthetic */ View b;
            public final /* synthetic */ b c;
            public final /* synthetic */ Div2View w;
            public final /* synthetic */ gil x;
            public final /* synthetic */ DivTooltipContainer y;
            public final /* synthetic */ SafePopupWindow z;

            {
                this.y = divTooltipContainer;
                this.z = safePopupWindow;
                this.A = tooltipView;
                this.B = rvoVar;
                this.C = z42;
                this.D = ref$BooleanRef52;
                this.E = view42;
                this.F = aw5Var;
                this.G = m3kVar42;
            }

            @Override // defpackage.c5l
            public final void finish(boolean z5) {
                final View view5;
                final Div2View div2View2;
                final View view6;
                final gil gilVar2;
                final rvo rvoVar2;
                final b bVar2;
                b bVar3;
                boolean z6;
                int i2;
                Point point;
                b bVar4 = this.c;
                gil gilVar3 = this.x;
                if (!z5 && !suz0.this.g) {
                    View view7 = this.b;
                    if (view7.isAttachedToWindow()) {
                        bVar4.getClass();
                        i iVar = bVar4.a;
                        m6o m6oVar = bVar4.c;
                        final DivTooltipContainer divTooltipContainer2 = this.y;
                        boolean V = ffx.V(divTooltipContainer2);
                        Div2View div2View3 = this.w;
                        final SafePopupWindow safePopupWindow2 = this.z;
                        View view8 = this.A;
                        rvo rvoVar3 = this.B;
                        final boolean z7 = this.C;
                        final Ref$BooleanRef ref$BooleanRef6 = this.D;
                        final View view9 = this.E;
                        final aw5 aw5Var2 = this.F;
                        final m3k m3kVar5 = this.G;
                        if (!V || divTooltipContainer2.isLayoutRequested()) {
                            view5 = view8;
                            div2View2 = div2View3;
                            view6 = view7;
                            gilVar2 = gilVar3;
                            rvoVar2 = rvoVar3;
                            bVar2 = bVar4;
                            divTooltipContainer2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$21$$inlined$doOnActualLayout$1
                                @Override // android.view.View.OnLayoutChangeListener
                                public void onLayoutChange(View view10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                    view10.removeOnLayoutChangeListener(this);
                                    Rect c = bj91.c(Div2View.this);
                                    Point g = bj91.g(view5, view6, gilVar2, rvoVar2);
                                    int min = Math.min(view5.getWidth(), c.width());
                                    int min2 = Math.min(view5.getHeight(), c.height());
                                    if (min < view5.getWidth()) {
                                        bVar2.c.a(Div2View.this.get_divData(), Div2View.this.getDataTag()).f(new Throwable("Tooltip width > screen size, width was changed"));
                                    }
                                    if (min2 < view5.getHeight()) {
                                        bVar2.c.a(Div2View.this.get_divData(), Div2View.this.getDataTag()).f(new Throwable("Tooltip height > screen size, height was changed"));
                                    }
                                    if (z7) {
                                        Point point2 = ref$BooleanRef6.element ? new Point(0, 0) : new Point(c.left, c.top);
                                        safePopupWindow2.update(0, 0, -1, -1);
                                        divTooltipContainer2.setTooltipPosition(g.x - point2.x, g.y - point2.y, min, min2);
                                        View view11 = view9;
                                        if (view11 != null) {
                                            int[] iArr = new int[2];
                                            view11.getLocationOnScreen(iArr);
                                            Point point3 = new Point(iArr[0], iArr[1]);
                                            divTooltipContainer2.setBringToTopPosition(point3.x - point2.x, point3.y - point2.y, view11.getWidth(), view11.getHeight());
                                        }
                                    } else {
                                        safePopupWindow2.update(g.x, g.y, min, min2);
                                    }
                                    b bVar5 = bVar2;
                                    aw5 aw5Var3 = aw5Var2;
                                    m3k m3kVar6 = m3kVar5;
                                    DivTooltipContainer divTooltipContainer3 = divTooltipContainer2;
                                    i iVar2 = bVar5.a;
                                    Div2View div2View4 = aw5Var3.a;
                                    rvo rvoVar4 = aw5Var3.b;
                                    i.l(iVar2, div2View4, rvoVar4, null, m3kVar6);
                                    i.l(bVar5.a, aw5Var3.a, rvoVar4, divTooltipContainer3, m3kVar6);
                                    bVar2.getClass();
                                }
                            });
                        } else {
                            Rect c = bj91.c(div2View3);
                            Point g = bj91.g(view8, view7, gilVar3, rvoVar3);
                            int min = Math.min(view8.getWidth(), c.width());
                            int min2 = Math.min(view8.getHeight(), c.height());
                            if (min < view8.getWidth()) {
                                bVar3 = bVar4;
                                z6 = z7;
                                m6oVar.a(div2View3.get_divData(), div2View3.getDataTag()).f(new Throwable("Tooltip width > screen size, width was changed"));
                            } else {
                                bVar3 = bVar4;
                                z6 = z7;
                            }
                            if (min2 < view8.getHeight()) {
                                m6oVar.a(div2View3.get_divData(), div2View3.getDataTag()).f(new Throwable("Tooltip height > screen size, height was changed"));
                            }
                            if (z6) {
                                if (ref$BooleanRef6.element) {
                                    i2 = 0;
                                    point = new Point(0, 0);
                                } else {
                                    i2 = 0;
                                    point = new Point(c.left, c.top);
                                }
                                safePopupWindow2.update(i2, i2, -1, -1);
                                divTooltipContainer2.setTooltipPosition(g.x - point.x, g.y - point.y, min, min2);
                                if (view9 != null) {
                                    int[] iArr = new int[2];
                                    view9.getLocationOnScreen(iArr);
                                    Point point2 = new Point(iArr[0], iArr[1]);
                                    divTooltipContainer2.setBringToTopPosition(point2.x - point.x, point2.y - point.y, view9.getWidth(), view9.getHeight());
                                }
                            } else {
                                safePopupWindow2.update(g.x, g.y, min, min2);
                            }
                            Div2View div2View4 = aw5Var2.a;
                            rvo rvoVar4 = aw5Var2.b;
                            i.l(iVar, div2View4, rvoVar4, null, m3kVar5);
                            i.l(iVar, aw5Var2.a, rvoVar4, divTooltipContainer2, m3kVar5);
                            view5 = view8;
                            div2View2 = div2View3;
                            view6 = view7;
                            gilVar2 = gilVar3;
                            rvoVar2 = rvoVar3;
                            bVar2 = bVar3;
                        }
                        safePopupWindow2.showAtLocation(view6, 0, 0, 0);
                        View substrateView = divTooltipContainer2.getSubstrateView();
                        if (substrateView != null) {
                            Animation d = a.d(gilVar2.a, rvoVar2, view5, (DivTooltip$Position) gilVar2.k.a(rvoVar2), true);
                            AlphaAnimation c2 = a.c(true);
                            c2.setDuration(d.getDuration());
                            c2.setInterpolator(d.getInterpolator());
                            view5.startAnimation(d);
                            substrateView.startAnimation(c2);
                        }
                        bj91.p(view5, bVar2.e);
                        if (((Number) gilVar2.g.a(rvoVar2)).longValue() != 0) {
                            bVar2.g.postDelayed(new tqs(7, bVar2, gilVar2, div2View2), ((Number) gilVar2.g.a(rvoVar2)).longValue());
                            return;
                        }
                        return;
                    }
                }
                bVar4.f.remove(gilVar3.h);
            }
        };
        i5lVar2.getClass();
        d dVar2 = new d(r02);
        h5l p32 = new e(i5lVar2, dVar2, r02, rvoVar).p(m3kVar42);
        dVar2.j();
        suz0Var2.e = p32;
        bVar.f.put(gilVar.h, suz0Var2);
    }

    public final void b(View view) {
        LinkedHashMap linkedHashMap;
        Object tag = view.getTag(ngh0.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = this.f;
                if (!hasNext) {
                    break;
                }
                suz0 suz0Var = (suz0) linkedHashMap.get(((gil) it.next()).h);
                String c = suz0Var == null ? null : c(suz0Var);
                if (c != null) {
                    arrayList.add(c);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove((String) it2.next());
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                b(childAt);
                i = i2;
            }
        }
    }

    public final String c(suz0 suz0Var) {
        suz0Var.g = true;
        SafePopupWindow safePopupWindow = suz0Var.d;
        h5l h5lVar = suz0Var.e;
        if (h5lVar != null) {
            Iterator it = h5lVar.a.iterator();
            while (it.hasNext()) {
                ((f5l) it.next()).cancel();
            }
        }
        if (safePopupWindow.isShowing()) {
            a.b(safePopupWindow);
            safePopupWindow.dismiss();
            return null;
        }
        aw5 aw5Var = suz0Var.b;
        m3k m3kVar = suz0Var.c.f;
        i.l(this.a, aw5Var.a, aw5Var.b, null, m3kVar);
        return suz0Var.a;
    }

    public final void d(String str) {
        final suz0 suz0Var = (suz0) this.f.get(str);
        if (suz0Var == null) {
            return;
        }
        SafePopupWindow safePopupWindow = suz0Var.d;
        View contentView = safePopupWindow.getContentView();
        DivTooltipContainer divTooltipContainer = contentView instanceof DivTooltipContainer ? (DivTooltipContainer) contentView : null;
        View substrateView = divTooltipContainer != null ? divTooltipContainer.getSubstrateView() : null;
        View tooltipView = divTooltipContainer != null ? divTooltipContainer.getTooltipView() : null;
        if (substrateView == null || tooltipView == null) {
            safePopupWindow.dismiss();
            return;
        }
        substrateView.clearAnimation();
        tooltipView.clearAnimation();
        a.a(suz0Var.c, suz0Var.b.b, tooltipView, substrateView, new sls() { // from class: com.yandex.div.core.tooltip.DivTooltipController$hideTooltip$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                if (suz0.this.d.isShowing()) {
                    suz0.this.d.dismiss();
                }
                return zy11.a;
            }
        });
    }

    public final void e(String str, aw5 aw5Var, final boolean z) {
        Pair k;
        final aw5 aw5Var2;
        zy11 zy11Var;
        k = bj91.k(aw5Var.a, str);
        if (k != null) {
            final gil gilVar = (gil) k.getFirst();
            final View view = (View) k.getSecond();
            if (this.f.containsKey(gilVar.h)) {
                aw5Var2 = aw5Var;
            } else {
                if (!ffx.V(view) || view.isLayoutRequested()) {
                    aw5Var2 = aw5Var;
                    view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$showTooltip$$inlined$doOnActualLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view2.removeOnLayoutChangeListener(this);
                            b.a(b.this, view, gilVar, aw5Var2, z);
                        }
                    });
                } else {
                    a(this, view, gilVar, aw5Var, z);
                    aw5Var2 = aw5Var;
                }
                if (!ffx.V(view) && !view.isLayoutRequested()) {
                    view.requestLayout();
                }
            }
            zy11Var = zy11.a;
        } else {
            aw5Var2 = aw5Var;
            zy11Var = null;
        }
        if (zy11Var == null) {
            aw5Var2.a.logError(new IllegalStateException(unr0.l('\'', "Unable to find view for tooltip '", str)));
        }
    }
}
