package com.yandex.go.navigator.gas_stations.filters;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.b64;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.crb1;
import defpackage.cvs;
import defpackage.d6z;
import defpackage.da0;
import defpackage.eja1;
import defpackage.ejp;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fuh0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.ip11;
import defpackage.jl40;
import defpackage.kx7;
import defpackage.kyh0;
import defpackage.mth;
import defpackage.mus;
import defpackage.n5;
import defpackage.nus;
import defpackage.ny61;
import defpackage.p7h;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.qus;
import defpackage.rcc;
import defpackage.rus;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tus;
import defpackage.um6;
import defpackage.up11;
import defpackage.v2h0;
import defpackage.wts;
import defpackage.x95;
import defpackage.xng0;
import defpackage.xts;
import defpackage.xw31;
import defpackage.yts;
import defpackage.z5h0;
import defpackage.zmh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u00020\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00122\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000bH\u0014¢\u0006\u0004\b4\u0010\rJ\u000f\u00105\u001a\u00020\u000bH\u0014¢\u0006\u0004\b5\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/filters/GasStationsFiltersModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcvs;", "Landroid/content/Context;", "context", "Lrus;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lrus;Lip11;)V", "Lzy11;", "addShadowScrollListener", "()V", "updateShadowVisibility", "", "canScrollDown", "()Z", "", "Lyts;", "gasStationServiceWithFilters", "renderServicesWithFilters", "(Ljava/util/List;)V", "gasStationService", "Lwts;", "filter", "Lru/yandex/taxi/design/ListItemComponent;", "createFiltersView", "(Lyts;Lwts;)Lru/yandex/taxi/design/ListItemComponent;", "filters", "Landroid/view/View;", "createServiceTrailView", "(Lyts;Ljava/util/List;)Landroid/view/View;", "Lxts;", "gasStationServiceUiModels", "showAllServices", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "renderServices", "(Ljava/util/List;ZLru/yandex/taxi/theme/ThemeType;)V", "", "title", "createServiceTitle", "(Ljava/lang/String;)Lru/yandex/taxi/design/ListItemComponent;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcvs;", "onAttachedToWindow", "onDetachedFromWindow", "Lrus;", "Lcom/yandex/go/navigator/gas_stations/filters/SearchOnlyAlongRouteFilter;", "searchOnlyOnTheRouteFilters$delegate", "Li3y;", "getSearchOnlyOnTheRouteFilters", "()Lcom/yandex/go/navigator/gas_stations/filters/SearchOnlyAlongRouteFilter;", "searchOnlyOnTheRouteFilters", "mus", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationsFiltersModalView extends SlideableBindingModalView<cvs> {
    public static final int $stable = 8;
    private final rus presenter;

    /* renamed from: searchOnlyOnTheRouteFilters$delegate, reason: from kotlin metadata */
    private final i3y searchOnlyOnTheRouteFilters;

    public GasStationsFiltersModalView(Context context, rus rusVar, ip11 ip11Var) {
        super(context);
        this.presenter = rusVar;
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        addShadowScrollListener();
        getBinding().e.setTypeface(((zmh) ip11Var).d());
        getBinding().b.setDebounceClickListener(new ejp(16, rusVar));
        this.searchOnlyOnTheRouteFilters = kotlin.a.a(new n5(context, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$clearAllFilters(rus rusVar) {
        r0 r0Var = rusVar.G;
        Map f = kotlin.collections.b.f();
        r0Var.getClass();
        r0Var.m(null, f);
        r0 r0Var2 = rusVar.H;
        r0Var2.getClass();
        r0Var2.m(null, EmptyList.a);
        r0 r0Var3 = rusVar.I;
        Boolean bool = Boolean.TRUE;
        r0Var3.getClass();
        r0Var3.m(null, bool);
        tus tusVar = rusVar.x;
        tusVar.i = (Map) r0Var.getValue();
        tusVar.l = (List) r0Var2.getValue();
        tusVar.d = ((Boolean) r0Var3.getValue()).booleanValue();
        rusVar.Mg("clear_all");
    }

    private final void addShadowScrollListener() {
        getBinding().f.addScrollChangeListener(new x95(6, this));
    }

    private final boolean canScrollDown() {
        return getBinding().f.canScrollVertically(1);
    }

    private final ListItemComponent createFiltersView(yts gasStationService, wts filter) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(d6z.j(filter.b));
        listItemComponent.setTrailImage(filter.c ? v2h0.ic_checkbox_rounded_enabled : v2h0.ic_checkbox_rounded_disabled);
        int[] iArr = up11.a;
        listItemComponent.setTitleTypeface(eja1.w(3, 0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, tje.u(8, listItemComponent.getContext()), 0);
        listItemComponent.setLayoutParams(layoutParams);
        listItemComponent.setDebounceClickListener(new p7h(17, this, gasStationService, filter));
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static final void createFiltersView$lambda$0$0(GasStationsFiltersModalView gasStationsFiltersModalView, yts ytsVar, wts wtsVar) {
        ?? r4;
        rus rusVar = gasStationsFiltersModalView.presenter;
        String str = ytsVar.a;
        String str2 = wtsVar.a;
        boolean z = wtsVar.c;
        r0 r0Var = rusVar.G;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
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
        r0Var.m(null, linkedHashMap);
        rusVar.x.i = (Map) r0Var.getValue();
        rus.Ng(rusVar, "filter", str, !z ? str2 : null, null, 8);
    }

    private final ListItemComponent createServiceTitle(String title) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        listItemComponent.setTitle(title);
        listItemComponent.setTitleTextSizePx(tje.u(20, listItemComponent.getContext()));
        listItemComponent.setTitleTypeface(Typeface.DEFAULT_BOLD);
        listItemComponent.setTitleTextColor(qje.t(xng0.textMinor, listItemComponent.getContext()));
        return listItemComponent;
    }

    private final View createServiceTrailView(yts gasStationService, List<wts> filters) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ButtonComponent buttonComponent = new ButtonComponent(frameLayout.getContext(), null, 0, 6, null);
        buttonComponent.setButtonSize(0);
        buttonComponent.setRoundedCornersRadius(tje.u(25, buttonComponent.getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, tje.u(16, buttonComponent.getContext()), 0);
        buttonComponent.setLayoutParams(layoutParams);
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textMain));
        buttonComponent.setText(new SpannableStringBuilder().append((CharSequence) buttonComponent.getContext().getString(kyh0.navigator_gas_stations_filters_all_button_title, String.valueOf(filters.size()))).append((CharSequence) " ").append((CharSequence) crb1.f(buttonComponent.getContext(), Integer.valueOf(f1h0.ic_arrow_default), null, 14)));
        buttonComponent.setDebounceClickListener(new p7h(18, this, gasStationService, filters));
        frameLayout.addView(buttonComponent);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createServiceTrailView$lambda$0$0$0(GasStationsFiltersModalView gasStationsFiltersModalView, yts ytsVar, List list) {
        rus rusVar = gasStationsFiltersModalView.presenter;
        String str = ytsVar.a;
        rusVar.getClass();
        if (evu0.y(str, "fuel", false)) {
            rus.Ng(rusVar, "all_filters_fuel", null, null, null, 14);
        } else if (evu0.y(str, "chain", false)) {
            rus.Ng(rusVar, "all_filters_chains", null, null, null, 14);
        }
        ((da0) rusVar.A.b).r(new kx7(str, kotlin.collections.a.x0(list, new qus())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchOnlyAlongRouteFilter getSearchOnlyOnTheRouteFilters() {
        return (SearchOnlyAlongRouteFilter) this.searchOnlyOnTheRouteFilters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderServices(List<xts> gasStationServiceUiModels, boolean showAllServices, ThemeType themeType) {
        GoLinearLayout goLinearLayout = getBinding().d;
        GasStationsServiceFiltersView gasStationsServiceFiltersView = new GasStationsServiceFiltersView(getContext(), null, 0, 6, null);
        xw31.I(gasStationsServiceFiltersView, null, Integer.valueOf(tje.u(12, gasStationsServiceFiltersView.getContext())), null, null);
        gasStationsServiceFiltersView.setMaxLines(showAllServices ? null : 3);
        gasStationsServiceFiltersView.setOnBubbleClickListener(new nus(this.presenter));
        ListBuilder a = rcc.a();
        List<xts> list = gasStationServiceUiModels;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (xts xtsVar : list) {
            arrayList.add(new um6(b64.j(xtsVar.a, themeType.name()), 48, xtsVar.a, xtsVar.b, xtsVar.c));
        }
        a.addAll(arrayList);
        if (!showAllServices) {
            a.add(new um6(g8e.o("show_all", themeType.name()), 16, "show_all", gasStationsServiceFiltersView.getContext().getString(kyh0.navigator_gas_stations_filters_show_all_title), false));
        }
        gasStationsServiceFiltersView.setData(a.j());
        goLinearLayout.addView(gasStationsServiceFiltersView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderServicesWithFilters(List<yts> gasStationServiceWithFilters) {
        for (yts ytsVar : gasStationServiceWithFilters) {
            ListItemComponent createServiceTitle = createServiceTitle(ytsVar.b);
            List list = ytsVar.c;
            List<wts> list2 = ytsVar.d;
            if (list2.size() > 3) {
                createServiceTitle.setTrailView(createServiceTrailView(ytsVar, list2));
            }
            getBinding().d.addView(createServiceTitle);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                getBinding().d.addView(createFiltersView(ytsVar, (wts) it.next()));
            }
            GoLinearLayout goLinearLayout = getBinding().d;
            CardDivider cardDivider = new CardDivider(getContext(), null, 0, 6, null);
            cardDivider.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            cardDivider.setType(CardDivider.Type.BOTH);
            cardDivider.setFocusable(false);
            goLinearLayout.addView(cardDivider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchOnlyAlongRouteFilter searchOnlyOnTheRouteFilters_delegate$lambda$0(Context context) {
        return new SearchOnlyAlongRouteFilter(context, null, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateShadowVisibility() {
        getBinding().g.setVisibility(canScrollDown() ? 0 : 8);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        getBinding().e.applyTheme(themeType);
        getSearchOnlyOnTheRouteFilters().applyTheme(themeType);
        super.applyTheme(themeType);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public cvs bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.gas_stations_filters_view, parent, false);
        int i = z5h0.bottom_container;
        if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
            i = z5h0.clear_all_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = z5h0.close_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
                    i = z5h0.list;
                    GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                    if (goLinearLayout2 != null) {
                        i = z5h0.screen_title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = z5h0.scroll_view;
                            NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                            if (nestedScrollViewAdvanced != null) {
                                i = z5h0.shadow_btn;
                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                if (goFrameLayout != null) {
                                    return new cvs(goLinearLayout, buttonComponent, buttonComponent2, goLinearLayout2, robotoTextView, nestedScrollViewAdvanced, goFrameLayout);
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

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rus rusVar = this.presenter;
        mus musVar = new mus(this);
        rusVar.Bg(musVar);
        com.yandex.go.navigator.gas_stations.analytics.a aVar = rusVar.E;
        r0 r0Var = rusVar.I;
        boolean booleanValue = ((Boolean) r0Var.getValue()).booleanValue();
        Collection collection = (Collection) rusVar.H.getValue();
        if (collection.isEmpty()) {
            collection = null;
        }
        aVar.g(booleanValue, (List) collection, rusVar.Lg(), rusVar.Kg());
        pwy0 pwy0Var = rusVar.z;
        tje.N(rusVar.Jg(), null, null, new GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$1(pwy0Var.a(), null, rusVar, musVar), 3);
        tje.N(rusVar.Jg(), null, null, new GasStationsFiltersPresenter$attachView$$inlined$safeCollectIn$2(new b(new tpr[]{new mth(rusVar.x.f, 6), rusVar.H, rusVar.G, r0Var, rusVar.F, pwy0Var.a()}, rusVar), null, musVar), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
