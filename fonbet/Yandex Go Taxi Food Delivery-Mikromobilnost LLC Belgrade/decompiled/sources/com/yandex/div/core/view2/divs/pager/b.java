package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.f;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivPager$ItemAlignment;
import com.yandex.div2.DivPager$Orientation;
import defpackage.a2l;
import defpackage.aua0;
import defpackage.aw5;
import defpackage.b2l;
import defpackage.c2l;
import defpackage.d2l;
import defpackage.dab1;
import defpackage.fb51;
import defpackage.ffx;
import defpackage.gb51;
import defpackage.hb51;
import defpackage.hgk;
import defpackage.j0g;
import defpackage.k890;
import defpackage.kp50;
import defpackage.l2l;
import defpackage.m2l;
import defpackage.n2l;
import defpackage.npl;
import defpackage.opl;
import defpackage.pce;
import defpackage.per;
import defpackage.q2k;
import defpackage.q2l;
import defpackage.qer;
import defpackage.r8;
import defpackage.rvo;
import defpackage.s2l;
import defpackage.s59;
import defpackage.s821;
import defpackage.t1l;
import defpackage.tls;
import defpackage.u890;
import defpackage.v1l;
import defpackage.w511;
import defpackage.wl50;
import defpackage.xsi0;
import defpackage.y890;
import defpackage.yh;
import defpackage.yvf0;
import defpackage.z2l;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class b extends r8 {
    public final k890 A;
    public final yh B;
    public final com.yandex.div.core.view2.divs.e c;
    public final f w;
    public final yvf0 x;
    public final z2l y;
    public final com.yandex.div.core.c z;

    public b(com.yandex.div.core.view2.divs.e eVar, f fVar, yvf0 yvf0Var, z2l z2lVar, com.yandex.div.core.c cVar, k890 k890Var, yh yhVar) {
        super(4, eVar);
        this.c = eVar;
        this.w = fVar;
        this.x = yvf0Var;
        this.y = z2lVar;
        this.z = cVar;
        this.A = k890Var;
        this.B = yhVar;
    }

    public final void Hg(final aw5 aw5Var, final DivPagerView divPagerView, q2k q2kVar, com.yandex.div.core.state.b bVar) {
        int m;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        k890 k890Var = this.A;
        t1l t1lVar = q2kVar.c;
        synchronized (k890Var.a) {
            k890Var.b.put(t1lVar, divPagerView);
        }
        q2k div = divPagerView.getDiv();
        if (q2kVar == div) {
            final ViewPager2 viewPager = divPagerView.getViewPager();
            RecyclerView.Adapter adapter = viewPager.getAdapter();
            a aVar = adapter instanceof a ? (a) adapter : null;
            if (aVar == null) {
                return;
            }
            if (!aVar.k(divPagerView.getRecyclerView(), this.y, aw5Var)) {
                com.yandex.div.core.view2.divs.a.l(divPagerView, aw5Var, (hgk) this.x.get());
                viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindView$$inlined$doOnNextLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        ViewPager2.this.requestTransform();
                    }
                });
                return;
            } else {
                s2l pagerOnItemsCountChange = divPagerView.getPagerOnItemsCountChange();
                if (pagerOnItemsCountChange != null) {
                    PagerIndicatorView.attachPager$lambda$3((PagerIndicatorView) ((s59) pagerOnItemsCountChange).a);
                    return;
                }
                return;
            }
        }
        if (div != null) {
            divPagerView.setChangePageCallbackForOffScreenPages$div_release(null);
            ViewPager2 viewPager2 = divPagerView.getViewPager();
            int itemDecorationCount = viewPager2.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                viewPager2.removeItemDecorationAt(i);
            }
            divPagerView.setPageTransformer$div_release(null);
        }
        this.c.d(aw5Var, divPagerView, q2kVar, div);
        final t1l t1lVar2 = q2kVar.c;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        Div2View div2View = aw5Var.a;
        final rvo rvoVar = aw5Var.b;
        final SparseArray sparseArray = new SparseArray();
        boolean a = this.B.a(divPagerView.getContext());
        divPagerView.setRecycledViewPool(new xsi0(div2View.getReleaseViewVisitor$div_release()));
        final a aVar2 = new a(com.yandex.div.internal.core.a.c(t1lVar2.t, t1lVar2.r, rvoVar), aw5Var, (hgk) this.x.get(), sparseArray, this.w, bVar, divPagerView);
        divPagerView.getViewPager().setAdapter(aVar2);
        final RecyclerView recyclerView2 = (RecyclerView) divPagerView.getViewPager().getChildAt(0);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        t1lVar2.q.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindInfiniteScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r4v9, types: [T, v1l] */
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                RecyclerView.Adapter adapter2 = DivPagerView.this.getViewPager().getAdapter();
                a aVar3 = adapter2 instanceof a ? (a) adapter2 : null;
                if (aVar3 != null && aVar3.J != booleanValue) {
                    aVar3.J = booleanValue;
                    aVar3.notifyItemRangeChanged(0, aVar3.G.size());
                    DivPagerView divPagerView2 = aVar3.F;
                    divPagerView2.setCurrentItem$div_release(divPagerView2.getCurrentItem$div_release() + (booleanValue ? 2 : -2));
                }
                Ref$ObjectRef<RecyclerView.g> ref$ObjectRef2 = ref$ObjectRef;
                if (booleanValue) {
                    RecyclerView.g gVar = ref$ObjectRef2.element;
                    RecyclerView.g gVar2 = gVar;
                    if (gVar == null) {
                        b bVar2 = this;
                        DivPagerView divPagerView3 = DivPagerView.this;
                        bVar2.getClass();
                        ?? v1lVar = new v1l(divPagerView3);
                        ref$ObjectRef.element = v1lVar;
                        gVar2 = v1lVar;
                    }
                    recyclerView2.addOnScrollListener(gVar2);
                } else {
                    RecyclerView.g gVar3 = ref$ObjectRef2.element;
                    if (gVar3 != null) {
                        recyclerView2.removeOnScrollListener(gVar3);
                    }
                }
                return zy11.a;
            }
        });
        s2l pagerOnItemsCountChange2 = divPagerView.getPagerOnItemsCountChange();
        if (pagerOnItemsCountChange2 != null) {
            PagerIndicatorView.attachPager$lambda$3((PagerIndicatorView) ((s59) pagerOnItemsCountChange2).a);
        }
        divPagerView.setClipToPage$div_release(div2View.getDiv2Component().w());
        divPagerView.setOrientation((t1lVar2.x.a(rvoVar) == DivPager$Orientation.HORIZONTAL ? 1 : 0) ^ 1);
        aVar2.I = (DivPager$ItemAlignment) t1lVar2.i.a(rvoVar);
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bind$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v2, types: [wl50] */
            /* JADX WARN: Type inference failed for: r4v10, types: [aua0] */
            /* JADX WARN: Type inference failed for: r6v6 */
            /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                SparseArray<Float> sparseArray2;
                RecyclerView recyclerView3;
                boolean z;
                DivPager$ItemAlignment divPager$ItemAlignment;
                hb51 hb51Var;
                boolean z2;
                a aVar3;
                hb51 hb51Var2;
                l2l l2lVar;
                RecyclerView.d fb51Var;
                b bVar2 = b.this;
                DivPagerView divPagerView2 = divPagerView;
                t1l t1lVar3 = t1lVar2;
                rvo rvoVar2 = rvoVar;
                SparseArray<Float> sparseArray3 = sparseArray;
                a aVar4 = aVar2;
                bVar2.getClass();
                RecyclerView recyclerView4 = divPagerView2.getRecyclerView();
                if (recyclerView4 != null) {
                    int i2 = t1lVar3.x.a(rvoVar2) == DivPager$Orientation.HORIZONTAL ? 1 : 0;
                    divPagerView2.setOrientation(i2 ^ 1);
                    aVar4.I = (DivPager$ItemAlignment) t1lVar3.i.a(rvoVar2);
                    if (ffx.V(divPagerView2)) {
                        DisplayMetrics displayMetrics = divPagerView2.getResources().getDisplayMetrics();
                        ViewPager2 viewPager3 = divPagerView2.getViewPager();
                        int width = i2 != 0 ? viewPager3.getWidth() : viewPager3.getHeight();
                        float K = com.yandex.div.core.view2.divs.a.K(t1lVar3.s, displayMetrics, rvoVar2);
                        boolean booleanValue = ((Boolean) t1lVar3.q.a(rvoVar2)).booleanValue();
                        DivPager$ItemAlignment divPager$ItemAlignment2 = (DivPager$ItemAlignment) t1lVar3.D.a(rvoVar2);
                        ?? r7 = i2;
                        l2l l2lVar2 = new l2l(t1lVar3.y, rvoVar2, divPagerView2, displayMetrics, r7, divPager$ItemAlignment2);
                        d2l d2lVar = t1lVar3.u;
                        if (d2lVar instanceof c2l) {
                            ?? aua0Var = new aua0(((c2l) d2lVar).b, rvoVar2, width, l2lVar2, divPager$ItemAlignment2);
                            recyclerView3 = recyclerView4;
                            z = r7 == true ? 1 : 0;
                            hb51Var = aua0Var;
                            sparseArray2 = sparseArray3;
                            divPager$ItemAlignment = divPager$ItemAlignment2;
                        } else if (d2lVar instanceof a2l) {
                            sparseArray2 = sparseArray3;
                            ?? wl50Var = new wl50(((a2l) d2lVar).b, rvoVar2, displayMetrics, width, K, l2lVar2, divPager$ItemAlignment2);
                            recyclerView3 = recyclerView4;
                            z = r7 == true ? 1 : 0;
                            hb51Var = wl50Var;
                            divPager$ItemAlignment = divPager$ItemAlignment2;
                        } else {
                            sparseArray2 = sparseArray3;
                            if (!(d2lVar instanceof b2l)) {
                                w511.b();
                                return null;
                            }
                            hb51 hb51Var3 = new hb51(recyclerView4, r7, width, l2lVar2, divPager$ItemAlignment2);
                            recyclerView3 = recyclerView4;
                            z = r7 == true ? 1 : 0;
                            divPager$ItemAlignment = divPager$ItemAlignment2;
                            hb51Var = hb51Var3;
                        }
                        if (hb51Var instanceof qer) {
                            qer qerVar = (qer) hb51Var;
                            z2 = booleanValue;
                            new d(divPagerView2, width, K, qerVar, l2lVar2, z2, aVar4);
                            l2lVar = l2lVar2;
                            aVar3 = aVar4;
                            fb51Var = new per(l2lVar, qerVar);
                            hb51Var2 = hb51Var;
                        } else {
                            z2 = booleanValue;
                            aVar3 = aVar4;
                            hb51 hb51Var4 = hb51Var;
                            new gb51(divPagerView2, K, hb51Var4, l2lVar2, aVar3);
                            hb51Var2 = hb51Var4;
                            l2lVar = l2lVar2;
                            fb51Var = new fb51(width, l2lVar, divPager$ItemAlignment);
                        }
                        ViewPager2 viewPager4 = divPagerView2.getViewPager();
                        int itemDecorationCount2 = viewPager4.getItemDecorationCount();
                        for (int i3 = 0; i3 < itemDecorationCount2; i3++) {
                            viewPager4.removeItemDecorationAt(i3);
                        }
                        viewPager4.addItemDecoration(fb51Var);
                        divPagerView2.setPageTransformer$div_release(new q2l(recyclerView3, rvoVar2, sparseArray2, width, t1lVar3.z, new n2l(width, K, hb51Var2, l2lVar, z2, aVar3, divPager$ItemAlignment), z));
                    }
                }
                return zy11.a;
            }
        };
        DivEdgeInsets divEdgeInsets = t1lVar2.y;
        divPagerView.addSubscription((divEdgeInsets == null || (expression4 = divEdgeInsets.c) == null) ? null : expression4.c(rvoVar, tlsVar));
        DivEdgeInsets divEdgeInsets2 = t1lVar2.y;
        divPagerView.addSubscription((divEdgeInsets2 == null || (expression3 = divEdgeInsets2.d) == null) ? null : expression3.c(rvoVar, tlsVar));
        DivEdgeInsets divEdgeInsets3 = t1lVar2.y;
        divPagerView.addSubscription((divEdgeInsets3 == null || (expression2 = divEdgeInsets3.f) == null) ? null : expression2.c(rvoVar, tlsVar));
        DivEdgeInsets divEdgeInsets4 = t1lVar2.y;
        divPagerView.addSubscription((divEdgeInsets4 == null || (expression = divEdgeInsets4.a) == null) ? null : expression.c(rvoVar, tlsVar));
        divPagerView.addSubscription(t1lVar2.s.b.c(rvoVar, tlsVar));
        divPagerView.addSubscription(t1lVar2.s.a.c(rvoVar, tlsVar));
        divPagerView.addSubscription(t1lVar2.D.c(rvoVar, tlsVar));
        divPagerView.addSubscription(t1lVar2.i.c(rvoVar, tlsVar));
        divPagerView.addSubscription(t1lVar2.x.c(rvoVar, tlsVar));
        divPagerView.addSubscription(new DivPagerBinder$observeSizeChange$1(divPagerView.getViewPager(), tlsVar, t1lVar2));
        d2l d2lVar = t1lVar2.u;
        if (d2lVar instanceof a2l) {
            a2l a2lVar = (a2l) d2lVar;
            divPagerView.addSubscription(a2lVar.b.a.b.c(rvoVar, tlsVar));
            divPagerView.addSubscription(a2lVar.b.a.a.c(rvoVar, tlsVar));
        } else if (d2lVar instanceof c2l) {
            divPagerView.addSubscription(((c2l) d2lVar).b.a.a.c(rvoVar, tlsVar));
        }
        divPagerView.setPagerSelectedActionsDispatcher$div_release(new u890(div2View, aVar2.G, this.z));
        divPagerView.setChangePageCallbackForLogger$div_release(new m2l(t1lVar2, aVar2.G, aw5Var, recyclerView, divPagerView));
        opl currentState = div2View.getCurrentState();
        if (currentState != null) {
            String str = t1lVar2.p;
            if (str == null) {
                str = String.valueOf(t1lVar2.hashCode());
            }
            npl nplVar = (npl) currentState.b.get(str);
            y890 y890Var = nplVar instanceof y890 ? (y890) nplVar : null;
            divPagerView.setChangePageCallbackForState$div_release(new s821(str, currentState));
            if (y890Var != null) {
                int i2 = y890Var.a;
                Integer valueOf = i2 < aVar2.G.size() - aVar2.m() ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    m = valueOf.intValue();
                    divPagerView.setCurrentItem$div_release(m);
                }
            }
            long longValue = ((Number) t1lVar2.j.a(rvoVar)).longValue();
            long j = longValue >> 31;
            m = ((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE) + aVar2.m();
            divPagerView.setCurrentItem$div_release(m);
        }
        divPagerView.addSubscription(t1lVar2.A.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bind$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivPagerView.this.setOnInterceptTouchEventListener(((Boolean) obj).booleanValue() ? dab1.K : null);
                return zy11.a;
            }
        }));
        final DivCollectionItemBuilder divCollectionItemBuilder = t1lVar2.r;
        if (divCollectionItemBuilder != null) {
            com.yandex.div.core.view2.divs.a.k(divCollectionItemBuilder, aw5Var.b, new tls() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    a aVar3 = (a) DivPagerView.this.getViewPager().getAdapter();
                    if (aVar3 != null) {
                        DivCollectionItemBuilder divCollectionItemBuilder2 = divCollectionItemBuilder;
                        aw5 aw5Var2 = aw5Var;
                        final DivPagerView divPagerView2 = DivPagerView.this;
                        ArrayList a2 = com.yandex.div.internal.core.a.a(divCollectionItemBuilder2, aw5Var2.b);
                        ArrayList arrayList = aVar3.a;
                        int size = arrayList.size();
                        aVar3.K = 0;
                        DivPagerView divPagerView3 = aVar3.F;
                        int currentItem$div_release = divPagerView3.getCurrentItem$div_release();
                        pce pceVar = new pce(arrayList, a2, 1);
                        kp50.f(pceVar, true).a(new j0g(aVar3, a2, false));
                        aVar3.A = com.yandex.div.core.state.a.i(arrayList);
                        aVar3.i();
                        if (aVar3.K == size) {
                            divPagerView3.setCurrentItem$div_release(currentItem$div_release);
                        }
                        s2l pagerOnItemsCountChange3 = divPagerView2.getPagerOnItemsCountChange();
                        if (pagerOnItemsCountChange3 != null) {
                            PagerIndicatorView.attachPager$lambda$3((PagerIndicatorView) ((s59) pagerOnItemsCountChange3).a);
                        }
                        RecyclerView recyclerView3 = divPagerView2.getRecyclerView();
                        if (recyclerView3 != null) {
                            recyclerView3.scrollToPosition(aVar3.p(divPagerView2.getCurrentItem$div_release()));
                        }
                        divPagerView2.getViewPager().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1$invoke$lambda$1$$inlined$doOnNextLayout$1
                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                view.removeOnLayoutChangeListener(this);
                                DivPagerView.this.getViewPager().requestTransform();
                            }
                        });
                    }
                    return zy11.a;
                }
            });
        }
        if (a) {
            divPagerView.enableAccessibility();
        }
    }
}
