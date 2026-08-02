package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.f;
import com.yandex.div.core.view2.divs.g;
import com.yandex.div.core.view2.divs.gallery.b;
import com.yandex.div.core.view2.divs.h;
import com.yandex.div.core.view2.divs.i;
import com.yandex.div.core.view2.divs.j;
import com.yandex.div.core.view2.divs.k;
import com.yandex.div.core.view2.divs.m;
import com.yandex.div.core.view2.divs.r;
import com.yandex.div.core.view2.divs.s;
import com.yandex.div.core.view2.divs.t;
import com.yandex.div.core.view2.divs.u;
import com.yandex.div.core.view2.divs.v;
import com.yandex.div.core.view2.divs.w;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.x;
import com.yandex.div.internal.view.DivImageView;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div2.DivContainer;
import defpackage.hgk;
import defpackage.iwp0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class hgk {
    public final vml a;
    public final w b;
    public final f c;
    public final s d;
    public final j e;
    public final h f;
    public final i g;
    public final b h;
    public final com.yandex.div.core.view2.divs.pager.b i;
    public final com.yandex.div.core.view2.divs.tabs.b j;
    public final u k;
    public final g l;
    public final k m;
    public final t n;
    public final m o;
    public final r p;
    public final x q;
    public final cpk r;
    public final k890 s;
    public final v t;

    public hgk(vml vmlVar, w wVar, f fVar, s sVar, j jVar, h hVar, i iVar, b bVar, com.yandex.div.core.view2.divs.pager.b bVar2, com.yandex.div.core.view2.divs.tabs.b bVar3, u uVar, g gVar, k kVar, t tVar, m mVar, r rVar, x xVar, cpk cpkVar, k890 k890Var, v vVar) {
        this.a = vmlVar;
        this.b = wVar;
        this.c = fVar;
        this.d = sVar;
        this.e = jVar;
        this.f = hVar;
        this.g = iVar;
        this.h = bVar;
        this.i = bVar2;
        this.j = bVar3;
        this.k = uVar;
        this.l = gVar;
        this.m = kVar;
        this.n = tVar;
        this.o = mVar;
        this.p = rVar;
        this.q = xVar;
        this.r = cpkVar;
        this.s = k890Var;
        this.t = vVar;
    }

    public final void a(Div2View div2View) {
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        boolean a = fu11Var.a();
        k890 k890Var = this.s;
        if (a) {
            k890Var.a();
            return;
        }
        a g = unr0.g(div2View, ngd0Var);
        if (fu11Var.a()) {
            k890Var.a();
        } else {
            g.c(new sls() { // from class: com.yandex.div.core.view2.DivBinder$attachIndicators$$inlined$runMainThreadAction$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    hgk.this.s.a();
                    return zy11.a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(aw5 aw5Var, View view, m3k m3kVar, com.yandex.div.core.state.b bVar) {
        m3k div;
        kmo kmoVar;
        cpk cpkVar = this.r;
        try {
            aw5 a = aw5Var.a(aw5Var.a.getRuntimeStore().e(m3kVar, aw5Var.b, bVar.b()).a);
            Div2View div2View = a.a;
            rvo rvoVar = a.b;
            n2k0 currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release != null) {
                int c = m3kVar.c();
                HashMap hashMap = currentRebindReusableList$div_release.a;
                LinkedList linkedList = (LinkedList) hashMap.get(Integer.valueOf(c));
                if (linkedList != null && !linkedList.isEmpty()) {
                    kmoVar = (kmo) linkedList.pop();
                    Collection collection = (Collection) hashMap.get(Integer.valueOf(c));
                    if (collection == null || collection.isEmpty()) {
                        hashMap.remove(Integer.valueOf(c));
                    }
                    if (kmoVar != null) {
                        return;
                    }
                }
                kmoVar = null;
                if (kmoVar != null) {
                }
            }
            if (!((Boolean) this.a.n(m3kVar, rvoVar)).booleanValue()) {
                com.yandex.div.core.view2.divs.a.e(view, m3kVar.d().e(), rvoVar);
                return;
            }
            egk d = m3kVar.d();
            if (cpkVar.b(d)) {
                for (dpk dpkVar : cpkVar.a) {
                    if (dpkVar.matches(d)) {
                        dpkVar.beforeBindView(div2View, rvoVar, view, d);
                    }
                }
            }
            if (!(m3kVar instanceof j2k) && (div = ((msk) view).getDiv()) != null) {
                cpkVar.e(div2View, rvoVar, view, div.d());
            }
            if (m3kVar instanceof x2k) {
                this.b.Bg(a, (DivLineHeightTextView) view, (x2k) m3kVar, null);
            } else if (m3kVar instanceof n2k) {
                this.e.Bg(a, (DivImageView) view, (n2k) m3kVar, null);
            } else if (m3kVar instanceof l2k) {
                this.f.Bg(a, (DivGifImageView) view, (l2k) m3kVar, null);
            } else if (m3kVar instanceof s2k) {
                this.d.Bg(a, (DivSeparatorView) view, (s2k) m3kVar, null);
            } else if (m3kVar instanceof i2k) {
                c(a, view, (i2k) m3kVar, bVar);
            } else if (m3kVar instanceof m2k) {
                this.g.Ig(a, (DivGridLayout) view, (m2k) m3kVar, bVar);
            } else if (m3kVar instanceof k2k) {
                this.h.Hg(a, (DivRecyclerView) view, (k2k) m3kVar, bVar);
            } else if (m3kVar instanceof q2k) {
                this.i.Hg(a, (DivPagerView) view, (q2k) m3kVar, bVar);
            } else if (m3kVar instanceof w2k) {
                this.j.Kg(a, (DivTabsLayout) view, (w2k) m3kVar, bVar);
            } else if (m3kVar instanceof u2k) {
                this.k.Hg(a, (DivStateLayout) view, (u2k) m3kVar, bVar);
            } else if (m3kVar instanceof j2k) {
                this.l.Ig(a, (DivCustomWrapper) view, (j2k) m3kVar, bVar);
            } else if (m3kVar instanceof o2k) {
                d(a, view, (o2k) m3kVar);
            } else if (m3kVar instanceof t2k) {
                this.n.Bg(a, (DivSliderView) view, (t2k) m3kVar, bVar);
            } else if (m3kVar instanceof p2k) {
                this.o.Bg(a, (DivInputView) view, (p2k) m3kVar, bVar);
            } else if (m3kVar instanceof r2k) {
                this.p.Bg(a, (DivSelectView) view, (r2k) m3kVar, bVar);
            } else if (m3kVar instanceof y2k) {
                this.q.Bg(a, (DivVideoView) view, (y2k) m3kVar, bVar);
            } else {
                if (!(m3kVar instanceof v2k)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.t.Bg(a, (DivSwitchView) view, (v2k) m3kVar, bVar);
            }
            if (m3kVar instanceof j2k) {
                return;
            }
            cpkVar.a(div2View, rvoVar, view, m3kVar.d());
        } catch (ParsingException e) {
            if (e.getReason() != ParsingExceptionReason.MISSING_VARIABLE && e.getReason() != ParsingExceptionReason.INVALID_VALUE && e.getReason() != ParsingExceptionReason.TYPE_MISMATCH) {
                throw e;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(aw5 aw5Var, View view, i2k i2kVar, com.yandex.div.core.state.b bVar) {
        rvo oldExpressionResolver$div_release;
        Div2View div2View = aw5Var.a;
        ViewGroup viewGroup = (ViewGroup) view;
        msk mskVar = (msk) viewGroup;
        i2k i2kVar2 = (i2k) mskVar.getDiv();
        aw5 bindingContext = mskVar.getBindingContext();
        if (bindingContext == null || (oldExpressionResolver$div_release = bindingContext.b) == null) {
            oldExpressionResolver$div_release = div2View.getOldExpressionResolver$div_release();
        }
        rvo rvoVar = oldExpressionResolver$div_release;
        f fVar = this.c;
        if (i2kVar == i2kVar2) {
            fVar.Lg(viewGroup, aw5Var, i2kVar.c, i2kVar2.c, rvoVar, bVar, false);
            return;
        }
        fVar.c.d(aw5Var, viewGroup, i2kVar, i2kVar2);
        DivContainer divContainer = i2kVar.c;
        fVar.Hc(viewGroup, aw5Var, divContainer, i2kVar2 != null ? i2kVar2.c : null);
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                div2View.unbindViewFromDiv$div_release(childAt);
                i = i2;
            }
        }
        fVar.Lg(viewGroup, aw5Var, divContainer, i2kVar2 != null ? i2kVar2.c : null, rvoVar, bVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Type inference failed for: r11v9, types: [T, iwp0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(aw5 aw5Var, View view, o2k o2kVar) {
        egk egkVar;
        t1l t1lVar;
        k kVar = this.m;
        DivPagerIndicatorView divPagerIndicatorView = (DivPagerIndicatorView) view;
        Div2View div2View = aw5Var.a;
        m3k rootDiv$div_release = div2View.rootDiv$div_release();
        if (rootDiv$div_release != null) {
            tvo tvoVar = div2View.getRuntimeStore().e(rootDiv$div_release, div2View.getExpressionResolver(), div2View.getCurrentRootPath$div_release().b()).a;
            egk d = o2kVar.d();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            jll a = com.yandex.div.core.util.a.a(rootDiv$div_release, tvoVar);
            Iterator it = new jll(a.a, a.b, new tls() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    for (iwp0 iwp0Var : arrayList) {
                        iwp0Var.b++;
                        iwp0Var.c++;
                    }
                    iwp0 iwp0Var2 = (iwp0) ref$ObjectRef.element;
                    if (iwp0Var2 != null) {
                        iwp0Var2.b++;
                        iwp0Var2.c++;
                    }
                    return Boolean.TRUE;
                }
            }, new tls() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    for (iwp0 iwp0Var : arrayList) {
                        int i = iwp0Var.b;
                        if (i > 0) {
                            iwp0Var.b = i - 1;
                            iwp0Var.c--;
                        } else {
                            iwp0Var.c++;
                        }
                    }
                    iwp0 iwp0Var2 = (iwp0) ref$ObjectRef.element;
                    if (iwp0Var2 != null) {
                        int i2 = iwp0Var2.b;
                        if (i2 > 0) {
                            iwp0Var2.b = i2 - 1;
                            iwp0Var2.c--;
                        } else {
                            iwp0Var2.c++;
                        }
                    }
                    return zy11.a;
                }
            }, a.e).iterator();
            int i = 0;
            while (true) {
                a8 a8Var = (a8) it;
                if (a8Var.hasNext()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    egk d2 = ((cxk) a8Var.next()).a.d();
                    if (d2 == d) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            iwp0 iwp0Var = (iwp0) it2.next();
                            Object obj = iwp0Var.a;
                            if (((egk) obj) != null) {
                                linkedHashMap.put(obj, Integer.valueOf(iwp0Var.c));
                            }
                        }
                        arrayList.clear();
                        ref$ObjectRef.element = new iwp0(null);
                    }
                    if (d2 instanceof t1l) {
                        t1l t1lVar2 = (t1l) d2;
                        String str = o2kVar.c.A;
                        if (str == null || jl40.l(t1lVar2.p, str)) {
                            T t = ref$ObjectRef.element;
                            if (t != 0) {
                                linkedHashMap.put(d2, Integer.valueOf(((iwp0) t).c));
                            } else {
                                arrayList.add(new iwp0(t1lVar2));
                            }
                        }
                    }
                    i = i2;
                } else {
                    Integer num = (Integer) kotlin.collections.a.h0(linkedHashMap.values());
                    if (num != null) {
                        int intValue = num.intValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (((Number) entry.getValue()).intValue() == intValue) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set keySet = linkedHashMap2.keySet();
                        if (!keySet.isEmpty()) {
                            if (keySet.size() > 1) {
                                qoi0.a(t1l.class).d();
                            }
                            egkVar = (egk) kotlin.collections.a.O(keySet);
                            t1lVar = (t1l) egkVar;
                            if (t1lVar != null) {
                                k890 k890Var = kVar.c;
                                synchronized (k890Var.a) {
                                    k890Var.c.add(new j890(divPagerIndicatorView, t1lVar));
                                }
                            }
                        }
                    }
                    egkVar = null;
                    t1lVar = (t1l) egkVar;
                    if (t1lVar != null) {
                    }
                }
            }
        }
        kVar.Bg(aw5Var, divPagerIndicatorView, o2kVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(aw5 aw5Var, View view, m3k m3kVar) {
        if (m3kVar instanceof x2k) {
            DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) view;
            divLineHeightTextView.setDiv(m3kVar);
            divLineHeightTextView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof n2k) {
            DivImageView divImageView = (DivImageView) view;
            divImageView.setDiv(m3kVar);
            divImageView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof l2k) {
            DivGifImageView divGifImageView = (DivGifImageView) view;
            divGifImageView.setDiv(m3kVar);
            divGifImageView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof s2k) {
            DivSeparatorView divSeparatorView = (DivSeparatorView) view;
            divSeparatorView.setDiv(m3kVar);
            divSeparatorView.setBindingContext(aw5Var);
            return;
        }
        int i = 0;
        if (m3kVar instanceof i2k) {
            i2k i2kVar = (i2k) m3kVar;
            ViewGroup viewGroup = (ViewGroup) view;
            ((msk) viewGroup).setDiv(i2kVar);
            hgk hgkVar = (hgk) this.c.y.get();
            DivContainer divContainer = i2kVar.c;
            for (Object obj : com.yandex.div.internal.core.a.c(divContainer.B, divContainer.z, aw5Var.b)) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                cxk cxkVar = (cxk) obj;
                View childAt = viewGroup.getChildAt(i);
                aw5 v = com.yandex.div.core.view2.divs.a.v(childAt);
                if (v == null) {
                    v = aw5Var;
                }
                hgkVar.e(v, childAt, cxkVar.a);
                i = i2;
            }
            return;
        }
        if (m3kVar instanceof m2k) {
            m2k m2kVar = (m2k) m3kVar;
            DivGridLayout divGridLayout = (DivGridLayout) view;
            divGridLayout.setDiv(m2kVar);
            List list = m2kVar.c.y;
            if (list == null) {
                list = EmptyList.a;
            }
            int size = list.size();
            while (i < size) {
                View childAt2 = divGridLayout.getChildAt(i);
                aw5 v2 = com.yandex.div.core.view2.divs.a.v(childAt2);
                if (v2 == null) {
                    v2 = aw5Var;
                }
                ((hgk) this.g.w.get()).e(v2, childAt2, (m3k) list.get(i));
                i++;
            }
            return;
        }
        if (m3kVar instanceof k2k) {
            DivRecyclerView divRecyclerView = (DivRecyclerView) view;
            divRecyclerView.setDiv(m3kVar);
            divRecyclerView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof q2k) {
            DivPagerView divPagerView = (DivPagerView) view;
            divPagerView.setDiv(m3kVar);
            divPagerView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof w2k) {
            DivTabsLayout divTabsLayout = (DivTabsLayout) view;
            divTabsLayout.setDiv(m3kVar);
            divTabsLayout.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof u2k) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            divStateLayout.setDiv(m3kVar);
            divStateLayout.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof j2k) {
            DivCustomWrapper divCustomWrapper = (DivCustomWrapper) view;
            divCustomWrapper.setDiv(m3kVar);
            divCustomWrapper.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof o2k) {
            DivPagerIndicatorView divPagerIndicatorView = (DivPagerIndicatorView) view;
            divPagerIndicatorView.setDiv(m3kVar);
            divPagerIndicatorView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof t2k) {
            DivSliderView divSliderView = (DivSliderView) view;
            divSliderView.setDiv(m3kVar);
            divSliderView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof p2k) {
            DivInputView divInputView = (DivInputView) view;
            divInputView.setDiv(m3kVar);
            divInputView.setBindingContext(aw5Var);
            return;
        }
        if (m3kVar instanceof r2k) {
            DivSelectView divSelectView = (DivSelectView) view;
            divSelectView.setDiv(m3kVar);
            divSelectView.setBindingContext(aw5Var);
        } else if (m3kVar instanceof y2k) {
            DivVideoView divVideoView = (DivVideoView) view;
            divVideoView.setDiv(m3kVar);
            divVideoView.setBindingContext(aw5Var);
        } else {
            if (!(m3kVar instanceof v2k)) {
                w511.b();
                return;
            }
            DivSwitchView divSwitchView = (DivSwitchView) view;
            divSwitchView.setDiv(m3kVar);
            divSwitchView.setBindingContext(aw5Var);
        }
    }
}
