package com.yandex.go.navigator.gas_stations.filters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import defpackage.aki0;
import defpackage.bns;
import defpackage.bys;
import defpackage.c230;
import defpackage.cma1;
import defpackage.cus;
import defpackage.eus;
import defpackage.f3x;
import defpackage.fuh0;
import defpackage.ip11;
import defpackage.j3x;
import defpackage.jl40;
import defpackage.jus;
import defpackage.n5;
import defpackage.ny61;
import defpackage.p7h;
import defpackage.qje;
import defpackage.qu;
import defpackage.rcc;
import defpackage.sts;
import defpackage.tje;
import defpackage.tus;
import defpackage.v2h0;
import defpackage.wts;
import defpackage.wxs;
import defpackage.x95;
import defpackage.xng0;
import defpackage.yus;
import defpackage.z5h0;
import defpackage.zmh;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001c\u0010$\u001a\n\u0012\u0006\b\u0000\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/filters/GasStationsFiltersListModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lyus;", "Landroid/content/Context;", "context", "Ljus;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Ljus;Lip11;)V", "Lzy11;", "addShadowScrollListener", "()V", "updateShadowVisibility", "", "canScrollDown", "()Z", "Lc230;", "insetsType", "()Lc230;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyus;", "onAttachedToWindow", "onDetachedFromWindow", "Ljus;", "Lbys;", "", "adapter", "Lbys;", "eus", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationsFiltersListModalView extends SlideableBindingModalView<yus> {
    public static final int $stable = 8;
    private final bys adapter;
    private final jus presenter;

    public GasStationsFiltersListModalView(Context context, jus jusVar, ip11 ip11Var) {
        super(context);
        this.presenter = jusVar;
        RecyclerView recyclerView = getBinding().c;
        j3x j3xVar = new j3x();
        adapter$lambda$0(context, this, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        recyclerView.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        this.adapter = bysVar;
        setArrowDefaultColor(qje.t(xng0.textInvert, context));
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        addShadowScrollListener();
        getBinding().d.setTypeface(((zmh) ip11Var).d());
    }

    private static final zy11 adapter$lambda$0(Context context, GasStationsFiltersListModalView gasStationsFiltersListModalView, j3x j3xVar) {
        n5 n5Var = new n5(context, 21);
        j3xVar.getClass();
        aki0.b(new f3x(cus.class, j3xVar, n5Var), new bns(3, gasStationsFiltersListModalView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListItemComponent adapter$lambda$0$0(Context context) {
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, tje.u(8, listItemComponent.getContext()), 0);
        listItemComponent.setLayoutParams(layoutParams);
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0$1(GasStationsFiltersListModalView gasStationsFiltersListModalView, ListItemComponent listItemComponent, cus cusVar) {
        wts wtsVar = cusVar.b;
        String str = cusVar.a;
        listItemComponent.setTitle(wtsVar.b);
        listItemComponent.setTrailImage(wtsVar.c ? v2h0.ic_checkbox_rounded_enabled : v2h0.ic_checkbox_rounded_disabled);
        listItemComponent.setDebounceClickListener(new p7h(16, gasStationsFiltersListModalView, str, wtsVar));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static final void adapter$lambda$0$1$0(GasStationsFiltersListModalView gasStationsFiltersListModalView, String str, wts wtsVar) {
        ?? r4;
        jus jusVar = gasStationsFiltersListModalView.presenter;
        String str2 = wtsVar.a;
        boolean z = wtsVar.c;
        tus tusVar = jusVar.C;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tusVar.i);
        if (z) {
            List list = (List) linkedHashMap.get(str);
            if (list != null) {
                r4 = new ArrayList();
                for (Object obj : list) {
                    if (!jl40.l((String) obj, str2)) {
                        r4.add(obj);
                    }
                }
            } else {
                r4 = EmptyList.a;
            }
            linkedHashMap.put(str, r4);
            List list2 = (List) linkedHashMap.get(str);
            if (list2 != null && list2.isEmpty()) {
                linkedHashMap.remove(str);
            }
        } else {
            ListBuilder a = rcc.a();
            List list3 = (List) linkedHashMap.get(str);
            if (list3 != null) {
                a.addAll(list3);
            }
            a.add(str2);
            linkedHashMap.put(str, a.j());
        }
        r0 r0Var = jusVar.E;
        r0Var.getClass();
        r0Var.m(null, linkedHashMap);
        tusVar.i = linkedHashMap;
        if (z) {
            str2 = null;
        }
        jusVar.Kg("filter", str2);
    }

    private final void addShadowScrollListener() {
        getBinding().e.addScrollChangeListener(new x95(5, this));
    }

    private final boolean canScrollDown() {
        return getBinding().e.canScrollVertically(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closeSettings(jus jusVar) {
        jusVar.Kg("done", null);
        ((sts) jusVar.z.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closeSettings$0(jus jusVar) {
        jusVar.Kg("done", null);
        ((sts) jusVar.z.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateShadowVisibility() {
        getBinding().f.setVisibility(canScrollDown() ? 0 : 8);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.adapter.notifyDataSetChanged();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yus bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.gas_stations_filters_service_list, parent, false);
        int i = z5h0.bottom_container;
        if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
            i = z5h0.close_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
                i = z5h0.list;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = z5h0.screen_title;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = z5h0.scroll_view;
                        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                        if (nestedScrollViewAdvanced != null) {
                            i = z5h0.shadow_btn;
                            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                            if (goFrameLayout != null) {
                                return new yus(goLinearLayout, buttonComponent, recyclerView, robotoTextView, nestedScrollViewAdvanced, goFrameLayout);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        List list;
        List list2;
        List list3;
        List list4;
        super.onAttachedToWindow();
        jus jusVar = this.presenter;
        eus eusVar = new eus(this);
        jusVar.Bg(eusVar);
        r0 r0Var = jusVar.E;
        boolean z = jusVar.G;
        String str = jusVar.x;
        boolean z2 = jusVar.F;
        if (z2 || z) {
            com.yandex.go.navigator.gas_stations.analytics.a aVar = jusVar.D;
            if (!z || (list4 = (List) ((Map) r0Var.getValue()).get(str)) == null) {
                list = null;
            } else {
                List list5 = list4;
                if (list5.isEmpty()) {
                    list5 = null;
                }
                list = list5;
            }
            if (!z2 || (list3 = (List) ((Map) r0Var.getValue()).get(str)) == null) {
                list2 = null;
            } else {
                List list6 = list3;
                if (list6.isEmpty()) {
                    list6 = null;
                }
                list2 = list6;
            }
            aVar.d(str, list, list2);
        }
        tje.N(jusVar.Jg(), null, null, new GasStationsFiltersListPresenter$attachView$$inlined$safeCollectIn$1(r0Var, null, jusVar, eusVar), 3);
        tje.N(jusVar.Jg(), null, null, new GasStationsFiltersListPresenter$attachView$$inlined$safeCollectIn$2(jusVar.A.a(), null, jusVar, eusVar), 3);
        ButtonComponent buttonComponent = getBinding().b;
        final jus jusVar2 = this.presenter;
        final int i = 0;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: dus
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                jus jusVar3 = jusVar2;
                switch (i2) {
                    case 0:
                        GasStationsFiltersListModalView.onAttachedToWindow$closeSettings(jusVar3);
                        break;
                    default:
                        GasStationsFiltersListModalView.onAttachedToWindow$closeSettings$0(jusVar3);
                        break;
                }
            }
        });
        final jus jusVar3 = this.presenter;
        final int i2 = 1;
        setOnTouchOutsideListener(new Runnable() { // from class: dus
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                jus jusVar32 = jusVar3;
                switch (i22) {
                    case 0:
                        GasStationsFiltersListModalView.onAttachedToWindow$closeSettings(jusVar32);
                        break;
                    default:
                        GasStationsFiltersListModalView.onAttachedToWindow$closeSettings$0(jusVar32);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
