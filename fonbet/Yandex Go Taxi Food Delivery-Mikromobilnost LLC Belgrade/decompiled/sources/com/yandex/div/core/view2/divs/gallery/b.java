package com.yandex.div.core.view2.divs.gallery;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.e;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.f;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivGallery;
import defpackage.aw5;
import defpackage.dab1;
import defpackage.ffx;
import defpackage.gip0;
import defpackage.hgk;
import defpackage.j0g;
import defpackage.k2k;
import defpackage.kp50;
import defpackage.m810;
import defpackage.npl;
import defpackage.opl;
import defpackage.pce;
import defpackage.qrk;
import defpackage.r8;
import defpackage.rvo;
import defpackage.s590;
import defpackage.tls;
import defpackage.u821;
import defpackage.urk;
import defpackage.vrk;
import defpackage.w511;
import defpackage.w890;
import defpackage.xsi0;
import defpackage.yvf0;
import defpackage.z2l;
import defpackage.zrs;
import defpackage.zy11;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends r8 {
    public final e c;
    public final f w;
    public final yvf0 x;
    public final z2l y;
    public final float z;

    public b(e eVar, f fVar, yvf0 yvf0Var, z2l z2lVar, float f) {
        super(4, eVar);
        this.c = eVar;
        this.w = fVar;
        this.x = yvf0Var;
        this.y = z2lVar;
        this.z = f;
    }

    public final void Hg(final aw5 aw5Var, final DivRecyclerView divRecyclerView, k2k k2kVar, com.yandex.div.core.state.b bVar) {
        k2k div = divRecyclerView.getDiv();
        yvf0 yvf0Var = this.x;
        if (k2kVar == div) {
            RecyclerView.Adapter adapter = divRecyclerView.getAdapter();
            a aVar = adapter instanceof a ? (a) adapter : null;
            if (aVar == null) {
                return;
            }
            aVar.k(divRecyclerView, this.y, aw5Var);
            com.yandex.div.core.view2.divs.a.l(divRecyclerView, aw5Var, (hgk) yvf0Var.get());
            return;
        }
        this.c.d(aw5Var, divRecyclerView, k2kVar, div);
        rvo rvoVar = aw5Var.b;
        final DivGallery divGallery = k2kVar.c;
        final a aVar2 = new a(com.yandex.div.internal.core.a.b(divGallery, rvoVar), aw5Var, (hgk) yvf0Var.get(), this.w, bVar);
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bind$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                b.this.Ig(divRecyclerView, aw5Var, divGallery, aVar2);
                return zy11.a;
            }
        };
        divRecyclerView.addSubscription(divGallery.x.c(rvoVar, tlsVar));
        divRecyclerView.addSubscription(divGallery.E.c(rvoVar, tlsVar));
        divRecyclerView.addSubscription(divGallery.D.c(rvoVar, tlsVar));
        divRecyclerView.addSubscription(divGallery.t.c(rvoVar, tlsVar));
        divRecyclerView.addSubscription(divGallery.z.c(rvoVar, tlsVar));
        Expression expression = divGallery.h;
        if (expression != null) {
            divRecyclerView.addSubscription(expression.c(rvoVar, tlsVar));
        }
        divRecyclerView.setRecycledViewPool(new xsi0(aw5Var.a.getReleaseViewVisitor$div_release()));
        divRecyclerView.setScrollingTouchSlop(1);
        divRecyclerView.setClipToPadding(false);
        divRecyclerView.setOverScrollMode(2);
        divRecyclerView.setAdapter(aVar2);
        final DivCollectionItemBuilder divCollectionItemBuilder = divGallery.s;
        if (divCollectionItemBuilder != null) {
            com.yandex.div.core.view2.divs.a.k(divCollectionItemBuilder, rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bindItemBuilder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    a aVar3 = (a) DivRecyclerView.this.getAdapter();
                    if (aVar3 != null) {
                        ArrayList a = com.yandex.div.internal.core.a.a(divCollectionItemBuilder, aw5Var.b);
                        ArrayList arrayList = aVar3.a;
                        pce pceVar = new pce(arrayList, a, 1);
                        kp50.f(pceVar, true).a(new j0g(aVar3, a, false));
                        aVar3.A = com.yandex.div.core.state.a.i(arrayList);
                        aVar3.i();
                    }
                    return zy11.a;
                }
            });
        }
        final RecyclerView.c itemAnimator = divRecyclerView.getItemAnimator();
        divRecyclerView.setItemAnimator(null);
        if (!ffx.V(divRecyclerView) || divRecyclerView.isLayoutRequested()) {
            divRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$resetAnimatorAndRestoreOnLayout$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (DivRecyclerView.this.getItemAnimator() == null) {
                        DivRecyclerView.this.setItemAnimator(itemAnimator);
                    }
                }
            });
        } else if (divRecyclerView.getItemAnimator() == null) {
            divRecyclerView.setItemAnimator(itemAnimator);
        }
        Ig(divRecyclerView, aw5Var, divGallery, aVar2);
    }

    public final void Ig(DivRecyclerView divRecyclerView, aw5 aw5Var, DivGallery divGallery, a aVar) {
        int i;
        int i2;
        ScrollPosition scrollPosition;
        DisplayMetrics displayMetrics = divRecyclerView.getResources().getDisplayMetrics();
        rvo rvoVar = aw5Var.b;
        Expression expression = divGallery.x;
        Expression expression2 = divGallery.t;
        int i3 = ((DivGallery.Orientation) expression.a(rvoVar)) == DivGallery.Orientation.HORIZONTAL ? 0 : 1;
        aVar.E = i3;
        boolean z = divGallery.E.a(rvoVar) == DivGallery.Scrollbar.AUTO;
        divRecyclerView.setVerticalScrollBarEnabled(z && i3 == 1);
        divRecyclerView.setHorizontalScrollBarEnabled(z && i3 == 0);
        divRecyclerView.setScrollbarFadingEnabled(false);
        Expression expression3 = divGallery.h;
        if (expression3 != null) {
            long longValue = ((Number) expression3.a(rvoVar)).longValue();
            long j = longValue >> 31;
            i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = 1;
        }
        aVar.F = i;
        Expression expression4 = divGallery.k;
        if (expression4 == null) {
            expression4 = expression2;
        }
        float q = com.yandex.div.core.view2.divs.a.q((Number) expression4.a(rvoVar), displayMetrics);
        aVar.G = q;
        divRecyclerView.setClipChildren(false);
        s590 s590Var = i == 1 ? new s590(com.yandex.div.core.view2.divs.a.o((Long) expression2.a(rvoVar), displayMetrics), 0, i3, 61) : new s590(com.yandex.div.core.view2.divs.a.o((Long) expression2.a(rvoVar), displayMetrics), m810.b(q), i3, 57);
        for (int itemDecorationCount = divRecyclerView.getItemDecorationCount() - 1; -1 < itemDecorationCount; itemDecorationCount--) {
            divRecyclerView.removeItemDecorationAt(itemDecorationCount);
        }
        divRecyclerView.addItemDecoration(s590Var);
        DivGallery.ScrollMode scrollMode = (DivGallery.ScrollMode) divGallery.D.a(rvoVar);
        divRecyclerView.setScrollMode(scrollMode);
        int i4 = qrk.a[scrollMode.ordinal()];
        if (i4 == 1) {
            w890 pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper != null) {
                pagerSnapStartHelper.b(null);
            }
        } else if (i4 == 2) {
            int o = com.yandex.div.core.view2.divs.a.o((Long) expression2.a(rvoVar), divRecyclerView.getResources().getDisplayMetrics());
            w890 pagerSnapStartHelper2 = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 != null) {
                pagerSnapStartHelper2.m(o);
            } else {
                pagerSnapStartHelper2 = new w890(o);
                divRecyclerView.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.b(divRecyclerView);
        }
        urk divLinearLayoutManager = i == 1 ? new DivLinearLayoutManager(aw5Var, divRecyclerView, divGallery, i3) : new DivGridLayoutManager(aw5Var, divRecyclerView, divGallery, i3);
        divRecyclerView.setLayoutManager(divLinearLayoutManager.x());
        divRecyclerView.setScrollInterceptionAngle(this.z);
        divRecyclerView.clearOnScrollListeners();
        opl currentState = aw5Var.a.getCurrentState();
        if (currentState != null) {
            String str = divGallery.r;
            if (str == null) {
                str = String.valueOf(divGallery.hashCode());
            }
            npl nplVar = (npl) currentState.b.get(str);
            zrs zrsVar = nplVar instanceof zrs ? (zrs) nplVar : null;
            if (zrsVar != null) {
                i2 = zrsVar.a;
            } else {
                long longValue2 = ((Number) divGallery.l.a(rvoVar)).longValue();
                long j2 = longValue2 >> 31;
                i2 = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            int paddingStart = zrsVar != null ? zrsVar.b : i2 != 0 ? 0 : i3 == 0 ? divRecyclerView.getPaddingStart() : divRecyclerView.getPaddingTop();
            int i5 = gip0.a[scrollMode.ordinal()];
            if (i5 == 1) {
                scrollPosition = ScrollPosition.DEFAULT;
            } else {
                if (i5 != 2) {
                    w511.b();
                    return;
                }
                scrollPosition = ScrollPosition.CENTER;
            }
            Object layoutManager = divRecyclerView.getLayoutManager();
            urk urkVar = layoutManager instanceof urk ? (urk) layoutManager : null;
            if (urkVar != null) {
                if (paddingStart == 0 && i2 == 0) {
                    urkVar.i(i2, scrollPosition);
                } else {
                    urkVar.j(i2, paddingStart, scrollPosition);
                }
            }
            divRecyclerView.addOnScrollListener(new u821(str, currentState, divLinearLayoutManager));
        }
        divRecyclerView.addOnScrollListener(new vrk(aw5Var, divRecyclerView, divLinearLayoutManager, divGallery));
        divRecyclerView.setOnInterceptTouchEventListener(((Boolean) divGallery.z.a(rvoVar)).booleanValue() ? dab1.K : null);
    }
}
