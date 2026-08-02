package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import defpackage.aub;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.gjw;
import defpackage.hkw;
import defpackage.ikw;
import defpackage.j8h0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.k7x0;
import defpackage.kp50;
import defpackage.lds0;
import defpackage.m7x0;
import defpackage.mqu;
import defpackage.nac;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pkw;
import defpackage.tkh0;
import defpackage.tkw;
import defpackage.w511;
import defpackage.xen;
import defpackage.xm2;
import defpackage.xy40;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001JB-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b2\u0010-J\u000f\u00103\u001a\u00020\u000fH\u0014¢\u0006\u0004\b3\u0010/J\u0015\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020$0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;Lpav;Lk7x0;)V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView$ViewMode;", "viewMode", "Lzy11;", "updateChildrenVisibilityForMode", "(Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView$ViewMode;)V", "", "Lpkw;", "tariffs", "renderTariffs", "(Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView$ViewMode;Ljava/util/List;)V", "tariffSelectorItem", "renderSingleTariffContainer", "(Lpkw;)V", "firstTariff", "secondTariff", "renderTwoTariffsContainer", "(Lpkw;Lpkw;)V", "renderMultipleTariffsContainer", "(Ljava/util/List;)V", "", "selectPosition", "scrollToSelectedTariff", "(I)V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffView;", "tariffView", "bindTariffUiState", "(Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffView;Lpkw;)V", "Landroid/widget/ImageView;", "imageView", "", "iconTag", "setIcon", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "reloadSingleTariffIconOnThemeChange", "()V", "reloadIconOnThemeChange", "(Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffView;)V", "setIconIfTagChanged", "onAttachedToWindow", "Lgjw;", "tariffSelectorSection", "render", "(Lgjw;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lpav;", "Lk7x0;", "Likw;", "binding", "Likw;", "Lhkw;", "multipleTariffsAdapter", "Lhkw;", "currentViewMode", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView$ViewMode;", "Lxy40;", "tariffViewsCache", "Lxy40;", "ViewMode", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardTariffSelectorContainerView extends FrameLayout implements nwy0 {
    private final ikw binding;
    private ViewMode currentViewMode;
    private final g dashboardPresenter;
    private final pav imageLoader;
    private final hkw multipleTariffsAdapter;
    private final k7x0 tagUrlFormatter;
    private final xy40 tariffViewsCache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardTariffSelectorContainerView$ViewMode;", "", "SINGLE_TARIFF", "TWO_TARIFFS", "MULTIPLE_TARIFFS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ViewMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ViewMode[] $VALUES;
        public static final ViewMode MULTIPLE_TARIFFS;
        public static final ViewMode SINGLE_TARIFF;
        public static final ViewMode TWO_TARIFFS;

        static {
            ViewMode viewMode = new ViewMode("SINGLE_TARIFF", 0);
            SINGLE_TARIFF = viewMode;
            ViewMode viewMode2 = new ViewMode("TWO_TARIFFS", 1);
            TWO_TARIFFS = viewMode2;
            ViewMode viewMode3 = new ViewMode("MULTIPLE_TARIFFS", 2);
            MULTIPLE_TARIFFS = viewMode3;
            ViewMode[] viewModeArr = {viewMode, viewMode2, viewMode3};
            $VALUES = viewModeArr;
            $ENTRIES = kotlin.enums.a.a(viewModeArr);
        }

        public static ViewMode valueOf(String str) {
            return (ViewMode) Enum.valueOf(ViewMode.class, str);
        }

        public static ViewMode[] values() {
            return (ViewMode[]) $VALUES.clone();
        }
    }

    public IntercityDashboardTariffSelectorContainerView(Context context, g gVar, pav pavVar, k7x0 k7x0Var) {
        super(context);
        this.dashboardPresenter = gVar;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        View inflate = LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_tariff_selector_container, (ViewGroup) this, false);
        addView(inflate);
        int i = j8h0.first_tariff_view;
        IntercityDashboardTariffView intercityDashboardTariffView = (IntercityDashboardTariffView) cma1.O(i, inflate);
        if (intercityDashboardTariffView != null) {
            i = j8h0.multiple_tariffs_container;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = j8h0.second_tariff_view;
                IntercityDashboardTariffView intercityDashboardTariffView2 = (IntercityDashboardTariffView) cma1.O(i, inflate);
                if (intercityDashboardTariffView2 != null) {
                    i = j8h0.single_tariff_container;
                    IntercityDashboardSingleTariffContainerView intercityDashboardSingleTariffContainerView = (IntercityDashboardSingleTariffContainerView) cma1.O(i, inflate);
                    if (intercityDashboardSingleTariffContainerView != null) {
                        FrameLayout frameLayout = (FrameLayout) inflate;
                        i = j8h0.two_tariffs_container;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                        if (linearLayout != null) {
                            this.binding = new ikw(frameLayout, intercityDashboardTariffView, recyclerView, intercityDashboardTariffView2, intercityDashboardSingleTariffContainerView, linearLayout);
                            this.multipleTariffsAdapter = new hkw(pavVar, k7x0Var, new xen(28, this));
                            this.tariffViewsCache = new xy40((Object) null);
                            recyclerView.addItemDecoration(new tkw());
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void bindTariffUiState(IntercityDashboardTariffView tariffView, pkw tariffSelectorItem) {
        setIconIfTagChanged(tariffView.getUnselectedTariffIconView(), tariffSelectorItem.d ? tariffSelectorItem.e.d : tariffSelectorItem.g.d);
        setIconIfTagChanged(tariffView.getSelectedTariffIconView(), tariffSelectorItem.f.d);
        tariffView.render(tariffSelectorItem);
        if (tariffSelectorItem.c || !tariffSelectorItem.d) {
            tariffView.setOnClickListener(null);
        } else {
            c.z(new mqu(13, this, tariffSelectorItem), tariffView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindTariffUiState$lambda$0(IntercityDashboardTariffSelectorContainerView intercityDashboardTariffSelectorContainerView, pkw pkwVar) {
        intercityDashboardTariffSelectorContainerView.dashboardPresenter.Sg(pkwVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void multipleTariffsAdapter$lambda$0(IntercityDashboardTariffSelectorContainerView intercityDashboardTariffSelectorContainerView, pkw pkwVar) {
        intercityDashboardTariffSelectorContainerView.dashboardPresenter.Sg(pkwVar);
    }

    private final void reloadIconOnThemeChange(IntercityDashboardTariffView tariffView) {
        ImageView selectedTariffIconView = tariffView.getSelectedTariffIconView();
        Object tag = selectedTariffIconView.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            setIcon(selectedTariffIconView, str);
        }
        ImageView unselectedTariffIconView = tariffView.getUnselectedTariffIconView();
        Object tag2 = unselectedTariffIconView.getTag();
        String str2 = tag2 instanceof String ? (String) tag2 : null;
        if (str2 != null) {
            setIcon(unselectedTariffIconView, str2);
        }
    }

    private final void reloadSingleTariffIconOnThemeChange() {
        ImageView singleTariffIconView = this.binding.e.getSingleTariffIconView();
        Object tag = singleTariffIconView.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            setIcon(singleTariffIconView, str);
        }
    }

    private final void renderMultipleTariffsContainer(List<pkw> tariffs) {
        hkw hkwVar = this.multipleTariffsAdapter;
        List list = hkwVar.y;
        hkwVar.y = kotlin.collections.a.J0(tariffs);
        kp50.f(new lds0(list, tariffs, new aub(12)), true).b(hkwVar);
        Iterator<pkw> it = tariffs.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().c) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            scrollToSelectedTariff(i);
        }
    }

    private final void renderSingleTariffContainer(pkw tariffSelectorItem) {
        this.binding.e.render(tariffSelectorItem);
        setIconIfTagChanged(this.binding.e.getSingleTariffIconView(), tariffSelectorItem.f.d);
    }

    private final void renderTariffs(ViewMode viewMode, List<pkw> tariffs) {
        int i = a.a[viewMode.ordinal()];
        if (i == 1) {
            renderSingleTariffContainer((pkw) kotlin.collections.a.P(tariffs));
            return;
        }
        if (i == 2) {
            renderTwoTariffsContainer(tariffs.get(0), tariffs.get(1));
        } else if (i == 3) {
            renderMultipleTariffsContainer(tariffs);
        } else {
            w511.b();
        }
    }

    private final void renderTwoTariffsContainer(pkw firstTariff, pkw secondTariff) {
        bindTariffUiState(this.binding.b, firstTariff);
        bindTariffUiState(this.binding.d, secondTariff);
    }

    private final void scrollToSelectedTariff(int selectPosition) {
        this.binding.c.post(new xm2(this, selectPosition, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToSelectedTariff$lambda$0(IntercityDashboardTariffSelectorContainerView intercityDashboardTariffSelectorContainerView, int i) {
        intercityDashboardTariffSelectorContainerView.binding.c.scrollToPosition(i);
    }

    private final void setIcon(ImageView imageView, String iconTag) {
        if (evu0.J(iconTag)) {
            imageView.setImageDrawable(null);
            imageView.setTag(null);
        } else {
            ((nac) this.imageLoader.a(imageView)).c(((m7x0) this.tagUrlFormatter).a(iconTag));
            imageView.setTag(iconTag);
        }
    }

    private final void setIconIfTagChanged(ImageView imageView, String iconTag) {
        Object tag = imageView.getTag();
        if (jl40.l(tag instanceof String ? (String) tag : null, iconTag)) {
            return;
        }
        setIcon(imageView, iconTag);
    }

    private final void updateChildrenVisibilityForMode(ViewMode viewMode) {
        ikw ikwVar = this.binding;
        ikwVar.e.setVisibility(viewMode == ViewMode.SINGLE_TARIFF ? 0 : 8);
        ikwVar.f.setVisibility(viewMode == ViewMode.TWO_TARIFFS ? 0 : 8);
        ikwVar.c.setVisibility(viewMode == ViewMode.MULTIPLE_TARIFFS ? 0 : 8);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        reloadSingleTariffIconOnThemeChange();
        reloadIconOnThemeChange(this.binding.b);
        reloadIconOnThemeChange(this.binding.d);
        xy40 xy40Var = this.tariffViewsCache;
        Object[] objArr = xy40Var.a;
        int i = xy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            reloadIconOnThemeChange((IntercityDashboardTariffView) objArr[i2]);
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.c.setAdapter(this.multipleTariffsAdapter);
        this.binding.c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }

    public final void render(gjw tariffSelectorSection) {
        int size = tariffSelectorSection.b.size();
        ViewMode viewMode = size != 1 ? size != 2 ? ViewMode.MULTIPLE_TARIFFS : ViewMode.TWO_TARIFFS : ViewMode.SINGLE_TARIFF;
        this.currentViewMode = viewMode;
        if (viewMode == null) {
            viewMode = null;
        }
        updateChildrenVisibilityForMode(viewMode);
        ViewMode viewMode2 = this.currentViewMode;
        renderTariffs(viewMode2 != null ? viewMode2 : null, tariffSelectorSection.b);
    }
}
