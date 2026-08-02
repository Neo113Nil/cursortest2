package com.yandex.go.chargers.station.presentation.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardButtonNameV3;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardOpenReasonV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardScrollState;
import com.yandex.go.chargers.design.components.ChargersGeoButtonIconComponent;
import com.yandex.go.chargers.design.components.badges.ChargersBadgesView;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsModalView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationFooterView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationHeaderView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationUsageInstructionView;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.a2i0;
import defpackage.a3v;
import defpackage.b64;
import defpackage.cma1;
import defpackage.cra;
import defpackage.e230;
import defpackage.em9;
import defpackage.fhb1;
import defpackage.fss;
import defpackage.g18;
import defpackage.gea;
import defpackage.hsa;
import defpackage.jra;
import defpackage.l7a;
import defpackage.m950;
import defpackage.msa;
import defpackage.nac;
import defpackage.nra;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pra;
import defpackage.qu;
import defpackage.sra;
import defpackage.sy60;
import defpackage.t1w;
import defpackage.tje;
import defpackage.uj9;
import defpackage.uz;
import defpackage.vhh0;
import defpackage.w130;
import defpackage.wsh0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001QB7\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0015H\u0014¢\u0006\u0004\b,\u0010\u0017J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u001dH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0014¢\u0006\u0004\b1\u0010\u0017J\u0017\u00104\u001a\u00020\u001d2\u0006\u00103\u001a\u000202H\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0015H\u0014¢\u0006\u0004\b6\u0010\u0017J\u0017\u00107\u001a\u00020\u001d2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b7\u00105J\u000f\u00108\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u0010\u0017J\u001d\u0010<\u001a\u00020\u0015*\u0002092\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0016\u0010B\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010CR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/yandex/go/chargers/station/presentation/details/ChargersStationDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lmsa;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "La3v;", "focusCoordinator", "Lsra;", "presenter", "Lfss;", "galleryViewerAnalyticsProxy", "<init>", "(Landroid/content/Context;Lpav;La3v;Lsra;Lfss;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lmsa;", "Lzy11;", "onAttachedToWindow", "()V", "onBackPressed", "Le230;", "insetsType", "()Le230;", "onSlideOut", "", "canDragToExpandFromAnchored", "()Z", "canHandleScreenTracking", "", "screenName", "()Ljava/lang/String;", "", "newOffset", "setBackgroundDimColor", "(F)V", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "animateDismissBackground", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "isTouchInsideCardContent", "updateCardAnchorHeight", "Lru/yandex/taxi/design/ListItemComponent;", "Lcra;", "partnerInformation", "success", "(Lru/yandex/taxi/design/ListItemComponent;Lcra;)V", "Lpav;", "La3v;", "Lsra;", "Lfss;", "isModalSheetReadyHandled", "Z", "Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationFooterView;", "chargersStationFooterView", "Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationFooterView;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent;", "geoButton", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent;", "touchExplorationEnabled", "Lg18;", "partnerImageCancellable", "Lg18;", "pra", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationDetailsModalView extends SlideableBindingModalView<msa> {
    public static final int $stable = 8;
    private final FloatButtonIconComponent backButton;
    private final ChargersStationFooterView chargersStationFooterView;
    private final a3v focusCoordinator;
    private final fss galleryViewerAnalyticsProxy;
    private final ChargersGeoButtonIconComponent geoButton;
    private final pav imageLoader;
    private boolean isModalSheetReadyHandled;
    private g18 partnerImageCancellable;
    private final sra presenter;
    private final boolean touchExplorationEnabled;

    public ChargersStationDetailsModalView(Context context, pav pavVar, a3v a3vVar, final sra sraVar, fss fssVar) {
        super(context, 4);
        this.imageLoader = pavVar;
        this.focusCoordinator = a3vVar;
        this.presenter = sraVar;
        this.galleryViewerAnalyticsProxy = fssVar;
        this.chargersStationFooterView = new ChargersStationFooterView(context, pavVar, new ChargersStationDetailsModalView$chargersStationFooterView$1(1, sraVar, sra.class, "handleButtonClick", "handleButtonClick(Lcom/yandex/go/chargers/domain/model/ChargersAction;Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersLocationCardButtonNameV3;)V", 0));
        final int i = 0;
        Runnable runnable = new Runnable() { // from class: ora
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                sra sraVar2 = sraVar;
                switch (i2) {
                    case 0:
                        ChargersStationDetailsModalView.backButton$onBackClicked(sraVar2);
                        break;
                    default:
                        ChargersStationDetailsModalView.geoButton$onGeoButtonClicked(sraVar2);
                        break;
                }
            }
        };
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(runnable);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        backButton$lambda$0(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        final int i2 = 1;
        this.geoButton = fhb1.a(this, new Runnable() { // from class: ora
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                sra sraVar2 = sraVar;
                switch (i22) {
                    case 0:
                        ChargersStationDetailsModalView.backButton$onBackClicked(sraVar2);
                        break;
                    default:
                        ChargersStationDetailsModalView.geoButton$onGeoButtonClicked(sraVar2);
                        break;
                }
            }
        });
        this.touchExplorationEnabled = tje.L(context);
    }

    private static final zy11 backButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setBadgeBackgroundColor(c.c(xng0.controlMain, floatButtonIconComponent));
        floatButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$onBackClicked(sra sraVar) {
        jra jraVar = sraVar.z;
        jraVar.a(ChargersAnalytics$ChargersLocationCardButtonNameV3.Back);
        jraVar.b = ChargersAnalytics$ChargersLocationCardCloseReason.Back;
        ((hsa) sraVar.H.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void geoButton$onGeoButtonClicked(sra sraVar) {
        sraVar.z.a(ChargersAnalytics$ChargersLocationCardButtonNameV3.Geo);
        tje.N(sraVar.Jg(), null, null, new ChargersStationDetailsPresenter$onGeoButtonClicked$1(sraVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ChargersStationDetailsModalView chargersStationDetailsModalView, t1w t1wVar) {
        boolean z = t1wVar.f;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        chargersStationDetailsModalView.setTopSystemWindowInset(t1wVar.b - c.h(24, chargersStationDetailsModalView));
        chargersStationDetailsModalView.chargersStationFooterView.handleInsets(t1wVar);
        View cardContentView = chargersStationDetailsModalView.getCardContentView();
        cardContentView.setPadding(cardContentView.getPaddingLeft(), cardContentView.getPaddingTop(), cardContentView.getPaddingRight(), t1wVar.g);
        return zy11Var;
    }

    private final boolean isTouchInsideCardContent(MotionEvent event) {
        return xw31.o(getRootView(), getCardContentView(), event) || xw31.o(getRootView(), this.backButton, event) || xw31.o(getRootView(), this.geoButton, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(ChargersStationDetailsModalView chargersStationDetailsModalView, uj9 uj9Var) {
        chargersStationDetailsModalView.presenter.Kg(uj9Var, ChargersAnalytics$ChargersLocationCardButtonNameV3.SurgeIcon);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void success(ListItemComponent listItemComponent, cra craVar) {
        if (craVar == null) {
            listItemComponent.setVisibility(8);
            return;
        }
        listItemComponent.setVisibility(0);
        String str = craVar.a;
        if (str != null) {
            g18 g18Var = this.partnerImageCancellable;
            if (g18Var != null) {
                g18Var.cancel();
            }
            this.partnerImageCancellable = ((nac) this.imageLoader.a(getBinding().i.getLeadImageView())).c(str);
        }
        listItemComponent.setTitle(craVar.b);
        listItemComponent.setDebounceClickListener(new l7a(2, this, craVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void success$lambda$1(ChargersStationDetailsModalView chargersStationDetailsModalView, cra craVar) {
        hsa hsaVar = (hsa) chargersStationDetailsModalView.presenter.H.a;
        hsaVar.A((m950) hsaVar.P.get(), new gea(craVar.c, craVar.d), sy60.Q2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCardAnchorHeight() {
        postDelayed(new uz(16, this), 350L);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public msa bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wsh0.chargers_station_details_view, parent, false);
        parent.addView(inflate);
        int i = vhh0.about_location;
        ChargersStationAboutLocationView chargersStationAboutLocationView = (ChargersStationAboutLocationView) cma1.O(i, inflate);
        if (chargersStationAboutLocationView != null) {
            i = vhh0.badges;
            ChargersBadgesView chargersBadgesView = (ChargersBadgesView) cma1.O(i, inflate);
            if (chargersBadgesView != null) {
                i = vhh0.container;
                if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                    i = vhh0.container_scroll_view;
                    NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                    if (nestedScrollView != null) {
                        i = vhh0.divider_1;
                        CardDivider cardDivider = (CardDivider) cma1.O(i, inflate);
                        if (cardDivider != null) {
                            i = vhh0.divider_2;
                            CardDivider cardDivider2 = (CardDivider) cma1.O(i, inflate);
                            if (cardDivider2 != null) {
                                i = vhh0.divider_3;
                                CardDivider cardDivider3 = (CardDivider) cma1.O(i, inflate);
                                if (cardDivider3 != null) {
                                    i = vhh0.header;
                                    ChargersStationHeaderView chargersStationHeaderView = (ChargersStationHeaderView) cma1.O(i, inflate);
                                    if (chargersStationHeaderView != null) {
                                        i = vhh0.partner_information;
                                        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                        if (listItemComponent != null) {
                                            i = vhh0.tariffs;
                                            ChargersTariffsView chargersTariffsView = (ChargersTariffsView) cma1.O(i, inflate);
                                            if (chargersTariffsView != null) {
                                                i = vhh0.usage_instruction;
                                                ChargersStationUsageInstructionView chargersStationUsageInstructionView = (ChargersStationUsageInstructionView) cma1.O(i, inflate);
                                                if (chargersStationUsageInstructionView != null) {
                                                    return new msa((FrameLayout) inflate, chargersStationAboutLocationView, chargersBadgesView, nestedScrollView, cardDivider, cardDivider2, cardDivider3, chargersStationHeaderView, listItemComponent, chargersTariffsView, chargersStationUsageInstructionView);
                                                }
                                            }
                                        }
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

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new nra(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setEnableBackgroundOnAppearing(false);
        getBottomSheetBehavior().C = false;
        getBottomSheetBehavior().a0 = true;
        getBottomSheetBehavior().c0 = true;
        refreshNestedScrollView(getBinding().d);
        setBehaviorPeekHeight(tje.u(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, getContext()));
        this.chargersStationFooterView.attach((CoordinatorLayout) getContent());
        sra sraVar = this.presenter;
        sraVar.Bg(new pra(this));
        jra jraVar = sraVar.z;
        ChargersStationOpenReason chargersStationOpenReason = sraVar.G;
        em9 em9Var = jraVar.a;
        ChargersAnalytics$ChargersLocationCardOpenReasonV2 b = jra.b(chargersStationOpenReason);
        HashMap w = b64.w(em9Var);
        w.put("open_reason", b.getEventValue());
        em9Var.a.a("Chargers.LocationCard.Opened", w, 3, new HashMap());
        tje.N(sraVar.Jg(), null, null, new ChargersStationDetailsPresenter$attachView$1(sraVar, null), 3);
        tje.N(sraVar.Jg(), null, null, new ChargersStationDetailsPresenter$attachView$2(sraVar, null), 3);
        getBinding().b.setImageLoader(this.imageLoader);
        getBinding().k.setImageLoader(this.imageLoader);
        getBinding().b.setGalleryViewerAnalyticsProxy(this.galleryViewerAnalyticsProxy);
        getBinding().b.setOnImageClickListener(new ChargersStationDetailsModalView$onAttachedToWindow$1(2, this.presenter, sra.class, "showImageGallery", "showImageGallery(Ljava/util/List;I)V", 0));
        getBinding().c.setBadgeClickListener(new ChargersStationDetailsModalView$onAttachedToWindow$2(1, this.presenter, sra.class, "onBadgeClicked", "onBadgeClicked(Lcom/yandex/go/chargers/domain/model/ChargersBadge;)V", 0));
        getBinding().j.setOnTariffDetailItemTitleClickListener(new ChargersStationDetailsModalView$onAttachedToWindow$3(1, this.presenter, sra.class, "onTariffItemInfoClicked", "onTariffItemInfoClicked(Lcom/yandex/go/chargers/tariff_item_info/api/domain/model/ChargersTariffDetailItem$Hint;)V", 0));
        getBinding().j.setOnTariffDetailItemValueClickListener(new nra(this, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.z.b = ChargersAnalytics$ChargersLocationCardCloseReason.Back;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        ChargersAnalytics$ChargersLocationCardScrollState chargersAnalytics$ChargersLocationCardScrollState;
        jra jraVar = this.presenter.z;
        jraVar.getClass();
        if (newState == 3) {
            chargersAnalytics$ChargersLocationCardScrollState = ChargersAnalytics$ChargersLocationCardScrollState.Expanded;
        } else {
            if (newState != 4) {
                if (newState == 6) {
                    chargersAnalytics$ChargersLocationCardScrollState = ChargersAnalytics$ChargersLocationCardScrollState.Anchored;
                }
                this.chargersStationFooterView.updatePlateBySheetState(newState);
                super.onBehaviorStateChanged(newState, movedByUser);
            }
            chargersAnalytics$ChargersLocationCardScrollState = ChargersAnalytics$ChargersLocationCardScrollState.Collapsed;
        }
        em9 em9Var = jraVar.a;
        HashMap w = b64.w(em9Var);
        w.put(ClidProvider.STATE, chargersAnalytics$ChargersLocationCardScrollState.getEventValue());
        em9Var.a.a("Chargers.LocationCard.Scrolled", w, 1, new HashMap());
        this.chargersStationFooterView.updatePlateBySheetState(newState);
        super.onBehaviorStateChanged(newState, movedByUser);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.partnerImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.partnerImageCancellable = null;
        super.onDetachedFromWindow();
        this.presenter.Cg();
        getBinding().c.removeBadgeClickListener();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.focusCoordinator.b8(this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.focusCoordinator.t4(ChargersStationDetailsModalView.class);
        this.focusCoordinator.a0(this);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (isTouchInsideCardContent(event)) {
            return super.onTouchEvent(event);
        }
        if (isExpanded() && !this.touchExplorationEnabled) {
            anchor();
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "chargers_station";
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
        super.setBackgroundDimColor((0.8f > newOffset || newOffset > 1.0f) ? 0.0f : (newOffset - 0.8f) / 0.19999999f);
    }
}
