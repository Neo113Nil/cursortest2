package com.yandex.go.order.tariffs_suggest.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestView;
import defpackage.b47;
import defpackage.b6h0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.d7y0;
import defpackage.evu0;
import defpackage.fox0;
import defpackage.hbp0;
import defpackage.hp8;
import defpackage.huh0;
import defpackage.hxx;
import defpackage.ip8;
import defpackage.j1y;
import defpackage.k7y0;
import defpackage.kyh0;
import defpackage.l7y0;
import defpackage.lb80;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pep0;
import defpackage.pw1;
import defpackage.pwy0;
import defpackage.qb80;
import defpackage.ssx0;
import defpackage.tje;
import defpackage.tse0;
import defpackage.uh60;
import defpackage.yj70;
import defpackage.yxx0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.ListTitleComponent;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0014¢\u0006\u0004\b'\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/ui/OrderWithTariffSuggestView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lssx0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtil", "Lcom/yandex/go/order/tariffs_suggest/ui/a;", "presenter", "Lpwy0;", "themeSwitcherProvider", "Lru/yandex/taxi/design/utils/b;", "bgRepository", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/design/utils/a;Lcom/yandex/go/order/tariffs_suggest/ui/a;Lpwy0;Lru/yandex/taxi/design/utils/b;)V", "", "isExpanded", "Lzy11;", "updateExpandCollapseBtnText", "(Z)V", "Lb47;", "button", "updateAcceptButton", "(Lb47;)V", "Ld7y0;", "delegate", "setDelegate", "(Ld7y0;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "", "newState", "movedByUser", "canDrag", "bottomSheetStateChanged", "(IZZ)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/order/tariffs_suggest/ui/a;", "Lpwy0;", "Lru/yandex/taxi/design/utils/b;", "Lj1y;", "binding", "Lj1y;", "Lcom/yandex/go/order/tariffs_suggest/ui/OrderWithTariffButtonView;", "buttonView", "Lcom/yandex/go/order/tariffs_suggest/ui/OrderWithTariffButtonView;", "Ld7y0;", "Lhbp0;", "mainScope", "Lhbp0;", "Lcom/yandex/go/order/tariffs_suggest/adapter/a;", "adapter", "Lcom/yandex/go/order/tariffs_suggest/adapter/a;", "qb80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderWithTariffSuggestView extends GoFrameLayout implements ssx0 {
    private final com.yandex.go.order.tariffs_suggest.adapter.a adapter;
    private final ru.yandex.taxi.design.utils.b bgRepository;
    private final j1y binding;
    private final OrderWithTariffButtonView buttonView;
    private d7y0 delegate;
    private final hbp0 mainScope;
    private final a presenter;
    private final pwy0 themeSwitcherProvider;

    public OrderWithTariffSuggestView(Context context, ru.yandex.taxi.design.utils.a aVar, a aVar2, pwy0 pwy0Var, ru.yandex.taxi.design.utils.b bVar) {
        super(context, null, 0, 0, 14, null);
        this.presenter = aVar2;
        this.themeSwitcherProvider = pwy0Var;
        this.bgRepository = bVar;
        LayoutInflater.from(context).inflate(huh0.layout_order_with_tariff_suggests, this);
        int i = b6h0.container_tariffs;
        if (((GoLinearLayout) cma1.O(i, this)) != null) {
            i = b6h0.recycler_tariffs;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, this);
            if (recyclerView != null) {
                i = b6h0.title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, this);
                if (listTitleComponent != null) {
                    this.binding = new j1y(this, recyclerView, listTitleComponent);
                    OrderWithTariffButtonView orderWithTariffButtonView = new OrderWithTariffButtonView(context, null, 0, 6, null);
                    orderWithTariffButtonView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    orderWithTariffButtonView.setVisibility(8);
                    this.buttonView = orderWithTariffButtonView;
                    this.mainScope = new hbp0(new czo0(14), "", null);
                    this.adapter = new com.yandex.go.order.tariffs_suggest.adapter.a(aVar, new OrderWithTariffSuggestView$adapter$1(3, aVar2, a.class, "onSuggestedTariffClicked", "onSuggestedTariffClicked(Ljava/lang/String;ZZ)V", 0));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(OrderWithTariffSuggestView orderWithTariffSuggestView) {
        Object obj;
        a aVar = orderWithTariffSuggestView.presenter;
        lb80 Lg = aVar.Lg(true);
        if (Lg != null) {
            yxx0 yxx0Var = (yxx0) aVar.B.a;
            String str = Lg.a;
            ArrayList arrayList = Lg.b;
            String str2 = Lg.c;
            yxx0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("order_id", str);
            hashMap.put("selected_tariffs", arrayList);
            yxx0Var.a.a("TaxiOrder.TariffsSuggest.ApplyButtonTapped", hashMap, 1, tse0.r("suggest_id", hashMap, str2));
        }
        com.yandex.go.order.tariffs_suggest.repository.a aVar2 = aVar.x;
        List list = ((ip8) aVar2.j.a.getValue()).c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            String str3 = ((hp8) obj2).j;
            if (str3 != null && !evu0.J(str3)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            aVar.Ng();
            return;
        }
        if (((o2y0) aVar.y.q.getValue()) == null) {
            aVar.Ng();
            return;
        }
        Set set = (Set) aVar2.f.getValue();
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (set.contains(((hp8) obj).a)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hp8 hp8Var = (hp8) obj;
        String str4 = hp8Var != null ? hp8Var.j : null;
        if (str4 == null) {
            aVar.Ng();
            return;
        }
        com.yandex.go.order.tariffs_suggest.router.a aVar3 = (com.yandex.go.order.tariffs_suggest.router.a) aVar.D.get();
        aVar.F = aVar3;
        ((pep0) aVar.E).f(new pw1(11, aVar3, new uh60(25, aVar)), new fox0(str4), hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(OrderWithTariffSuggestView orderWithTariffSuggestView) {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        d7y0 d7y0Var = orderWithTariffSuggestView.delegate;
        if (d7y0Var != null) {
            int i = orderWithTariffSuggestView.presenter.G == 3 ? 4 : 3;
            anchorBottomSheetBehavior = ((k7y0) d7y0Var).a.bottomSheetBehavior;
            anchorBottomSheetBehavior.O(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAcceptButton(b47 button) {
        this.buttonView.setVisibility(0);
        this.buttonView.getButtonAccept().setEnabled(button.a);
        this.buttonView.getButtonAccept().setText(button.b);
        this.buttonView.getButtonAccept().setProgressing(button.c);
    }

    private final void updateExpandCollapseBtnText(boolean isExpanded) {
        this.buttonView.getButtonExpandCollapse().setContentDescription(getContext().getString(isExpanded ? kyh0.collapse_accessibility_description : kyh0.expand_accessibility_description));
    }

    @Override // defpackage.ssx0
    public View asView() {
        return this;
    }

    @Override // defpackage.ssx0
    public void bottomSheetStateChanged(int newState, boolean movedByUser, boolean canDrag) {
        lb80 Lg;
        boolean z = newState == 3;
        a aVar = this.presenter;
        yj70 yj70Var = aVar.B;
        aVar.G = newState;
        if (newState == 3) {
            lb80 Lg2 = aVar.Lg(false);
            if (Lg2 != null) {
                yxx0 yxx0Var = (yxx0) yj70Var.a;
                String str = Lg2.a;
                ArrayList arrayList = Lg2.b;
                String str2 = Lg2.c;
                yxx0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", str);
                hashMap.put("tariff_list", arrayList);
                yxx0Var.a.a("TaxiOrder.TariffsSuggest.Expanded", hashMap, 1, tse0.r("suggest_id", hashMap, str2));
            }
        } else if (newState == 6 && (Lg = aVar.Lg(false)) != null) {
            yxx0 yxx0Var2 = (yxx0) yj70Var.a;
            String str3 = Lg.a;
            ArrayList arrayList2 = Lg.b;
            String str4 = Lg.c;
            yxx0Var2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("order_id", str3);
            hashMap2.put("tariff_list", arrayList2);
            yxx0Var2.a.a("TaxiOrder.TariffsSuggest.Collapsed", hashMap2, 1, tse0.r("suggest_id", hashMap2, str4));
        }
        this.buttonView.getFooterShadow().setVisibility(z ? 8 : 0);
        updateExpandCollapseBtnText(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        l7y0 l7y0Var;
        super.onAttachedToWindow();
        this.mainScope.a();
        this.binding.b.setAdapter(this.adapter);
        d7y0 d7y0Var = this.delegate;
        if (d7y0Var != null) {
            OrderWithTariffButtonView orderWithTariffButtonView = this.buttonView;
            k7y0 k7y0Var = (k7y0) d7y0Var;
            ViewParent parent = orderWithTariffButtonView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(orderWithTariffButtonView);
            }
            l7y0Var = k7y0Var.a.binding;
            l7y0Var.e.addView(orderWithTariffButtonView);
        }
        final int i = 1;
        final int i2 = 0;
        updateExpandCollapseBtnText(this.presenter.G == 3);
        this.buttonView.getButtonExpandCollapse().setVisibility(tje.J(getContext()) ? 0 : 8);
        this.buttonView.getButtonAccept().setDebounceClickListener(new Runnable(this) { // from class: pb80
            public final /* synthetic */ OrderWithTariffSuggestView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                OrderWithTariffSuggestView orderWithTariffSuggestView = this.b;
                switch (i3) {
                    case 0:
                        OrderWithTariffSuggestView.onAttachedToWindow$lambda$0(orderWithTariffSuggestView);
                        break;
                    default:
                        OrderWithTariffSuggestView.onAttachedToWindow$lambda$1(orderWithTariffSuggestView);
                        break;
                }
            }
        });
        this.buttonView.getButtonExpandCollapse().setDebounceClickListener(new Runnable(this) { // from class: pb80
            public final /* synthetic */ OrderWithTariffSuggestView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                OrderWithTariffSuggestView orderWithTariffSuggestView = this.b;
                switch (i3) {
                    case 0:
                        OrderWithTariffSuggestView.onAttachedToWindow$lambda$0(orderWithTariffSuggestView);
                        break;
                    default:
                        OrderWithTariffSuggestView.onAttachedToWindow$lambda$1(orderWithTariffSuggestView);
                        break;
                }
            }
        });
        tje.N(this.mainScope, null, null, new OrderWithTariffSuggestView$onAttachedToWindow$$inlined$safeCollectIn$1(new c(this.themeSwitcherProvider.a(), this), null, this.buttonView), 3);
        a aVar = this.presenter;
        qb80 qb80Var = new qb80(this);
        aVar.Bg(qb80Var);
        tje.N(aVar.Jg(), null, null, new OrderWithTariffSuggestPresenter$attachView$1(aVar, qb80Var, null), 3);
        tje.N(aVar.Jg(), null, null, new OrderWithTariffSuggestPresenter$attachView$$inlined$collectIn$1(aVar.x.a(), null, qb80Var), 3);
        tje.N(aVar.Jg(), null, null, new OrderWithTariffSuggestPresenter$attachView$3(aVar, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        l7y0 l7y0Var;
        this.mainScope.b();
        this.presenter.Cg();
        d7y0 d7y0Var = this.delegate;
        if (d7y0Var != null) {
            OrderWithTariffButtonView orderWithTariffButtonView = this.buttonView;
            l7y0Var = ((k7y0) d7y0Var).a.binding;
            l7y0Var.e.removeView(orderWithTariffButtonView);
        }
        this.delegate = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.ssx0
    public void setDelegate(d7y0 delegate) {
        this.delegate = delegate;
    }
}
