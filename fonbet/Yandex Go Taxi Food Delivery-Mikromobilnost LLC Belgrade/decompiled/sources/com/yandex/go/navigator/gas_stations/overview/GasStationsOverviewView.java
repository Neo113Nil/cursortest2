package com.yandex.go.navigator.gas_stations.overview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.yandex.go.navigator.repository.o;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ah00;
import defpackage.aki0;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.bys;
import defpackage.cma1;
import defpackage.do91;
import defpackage.ejp;
import defpackage.evu0;
import defpackage.ewc;
import defpackage.f3x;
import defpackage.fuh0;
import defpackage.fvs;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.ijs;
import defpackage.ip11;
import defpackage.j3x;
import defpackage.mqg0;
import defpackage.mth;
import defpackage.ntr;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.otr;
import defpackage.ovs;
import defpackage.ows;
import defpackage.ptr;
import defpackage.pts;
import defpackage.pvs;
import defpackage.pz40;
import defpackage.q69;
import defpackage.qpo;
import defpackage.qtg0;
import defpackage.qu;
import defpackage.qvs;
import defpackage.rvs;
import defpackage.s1r;
import defpackage.s8o;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tqu;
import defpackage.tus;
import defpackage.txk;
import defpackage.uvs;
import defpackage.vvs;
import defpackage.w511;
import defpackage.w69;
import defpackage.wb50;
import defpackage.wjm;
import defpackage.wxs;
import defpackage.xb50;
import defpackage.xng0;
import defpackage.z5h0;
import defpackage.zmh;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.DotsIndicatorView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B]\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001fH\u0014¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010#J\u0017\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001fH\u0014¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u0019H\u0014¢\u0006\u0004\b/\u0010\u001bJ\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001fH\u0002¢\u0006\u0004\b<\u0010#J\u0017\u0010?\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0019H\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u0019H\u0002¢\u0006\u0004\bR\u0010PJ\u0017\u0010U\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u001b\u0010Y\u001a\u00020\u001f*\u00020W2\u0006\u0010X\u001a\u00020\u0019H\u0002¢\u0006\u0004\bY\u0010ZJ\u001b\u0010[\u001a\u00020\u001f*\u00020W2\u0006\u0010X\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010ZR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\\R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010]R\u001b\u0010a\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010\u001bR\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010_\u001a\u0004\bd\u0010eR\u001b\u0010i\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010_\u001a\u0004\bh\u0010\u001bR\u001b\u0010l\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010_\u001a\u0004\bk\u0010\u001bR\u001b\u0010o\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010_\u001a\u0004\bn\u0010\u001bR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001c\u0010{\u001a\n\u0012\u0006\b\u0000\u0012\u00020z0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020+0}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/overview/GasStationsOverviewView;", "Lcom/yandex/go/navigator/BaseNavigatorModalView;", "Lvvs;", "Lcom/yandex/go/navigator/gas_stations/overview/h;", "presenter", "Lip11;", "typefaceDelegate", "Landroid/content/Context;", "context", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lah00;", "mapController", "Lcom/yandex/go/navigator/repository/o;", "userInteractionsListener", "Lewc;", "compassButtonPresenter", "Lcom/yandex/go/navigator/domain/e;", "focusModeChangeEventRepository", "Lwb50;", "focusCoordinator", "Lcom/yandex/go/navigator/analitycs/a;", "navigatorMainScreenAnalyticInteractor", "<init>", "(Lcom/yandex/go/navigator/gas_stations/overview/h;Lip11;Landroid/content/Context;Lru/yandex/taxi/discovery/a;Lah00;Lcom/yandex/go/navigator/repository/o;Lewc;Lcom/yandex/go/navigator/domain/e;Lwb50;Lcom/yandex/go/navigator/analitycs/a;)V", "", "getTopFocusRectOffset", "()I", "getBottomFocusRectOffset", "Lt1w;", "insets", "Lzy11;", "onInsetsHandled", "(Lt1w;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onGeoTap", "onOverviewButtonClicked", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "isArrowsPermanentlyHidden", "()Z", "onSlideOut", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "screenName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvvs;", "Lcom/yandex/go/navigator/gas_stations/overview/GasStationCardView;", "createGasStationCardView", "()Lcom/yandex/go/navigator/gas_stations/overview/GasStationCardView;", "setupRecyclerView", "Lcom/yandex/go/navigator/gas_stations/overview/GasStationsOverviewUiState$ExpansionState;", "expansionState", "renderExpansionState", "(Lcom/yandex/go/navigator/gas_stations/overview/GasStationsOverviewUiState$ExpansionState;)V", "Lrvs;", "titleState", "renderTitle", "(Lrvs;)V", "Lovs;", ClidProvider.STATE, "renderCardList", "(Lovs;)V", "Lpvs;", "failState", "renderFail", "(Lpvs;)V", "selectedItemIdx", "itemsCount", "updateDotsIndicator", "(II)V", "lastItemIdx", "updateDotsIndicatorSelection", "Lqvs;", "uiState", "renderFocusButton", "(Lqvs;)V", "Landroidx/recyclerview/widget/RecyclerView;", "targetPosition", "scrollToPositionNoAnimation", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "smoothScrollToPositionWithFixedTime", "Lcom/yandex/go/navigator/gas_stations/overview/h;", "Lip11;", "modalPeekHeight$delegate", "Li3y;", "getModalPeekHeight", "modalPeekHeight", "", "cardElevation$delegate", "getCardElevation", "()F", "cardElevation", "cardItemSpacing$delegate", "getCardItemSpacing", "cardItemSpacing", "cardItemEdgeMargin$delegate", "getCardItemEdgeMargin", "cardItemEdgeMargin", "cardItemWidth$delegate", "getCardItemWidth", "cardItemWidth", "Landroidx/recyclerview/widget/f0;", "snapHelper", "Landroidx/recyclerview/widget/f0;", "Lcom/yandex/go/navigator/gas_stations/overview/l;", "snapListener", "Lcom/yandex/go/navigator/gas_stations/overview/l;", "Lq69;", "centerCardListener", "Lq69;", "Lbys;", "", "adapter", "Lbys;", "Lpz40;", "isStationCardsDisplayedStateFlow", "Lpz40;", "com/yandex/go/navigator/gas_stations/overview/k", "w69", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationsOverviewView extends BaseNavigatorModalView<vvs> {
    public static final int $stable = 8;
    private final bys adapter;

    /* renamed from: cardElevation$delegate, reason: from kotlin metadata */
    private final i3y cardElevation;

    /* renamed from: cardItemEdgeMargin$delegate, reason: from kotlin metadata */
    private final i3y cardItemEdgeMargin;

    /* renamed from: cardItemSpacing$delegate, reason: from kotlin metadata */
    private final i3y cardItemSpacing;

    /* renamed from: cardItemWidth$delegate, reason: from kotlin metadata */
    private final i3y cardItemWidth;
    private final q69 centerCardListener;
    private final pz40 isStationCardsDisplayedStateFlow;

    /* renamed from: modalPeekHeight$delegate, reason: from kotlin metadata */
    private final i3y modalPeekHeight;
    private final h presenter;
    private final f0 snapHelper;
    private final l snapListener;
    private final ip11 typefaceDelegate;

    /* JADX WARN: Multi-variable type inference failed */
    public GasStationsOverviewView(h hVar, ip11 ip11Var, Context context, ru.yandex.taxi.discovery.a aVar, ah00 ah00Var, o oVar, ewc ewcVar, com.yandex.go.navigator.domain.e eVar, wb50 wb50Var, com.yandex.go.navigator.analitycs.a aVar2) {
        super(context, aVar, ah00Var, wb50Var, oVar, eVar, ewcVar, aVar2);
        this.presenter = hVar;
        this.typefaceDelegate = ip11Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: tvs
            public final /* synthetic */ GasStationsOverviewView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int modalPeekHeight_delegate$lambda$0;
                float cardElevation_delegate$lambda$0;
                int cardItemSpacing_delegate$lambda$0;
                int cardItemEdgeMargin_delegate$lambda$0;
                int cardItemWidth_delegate$lambda$0;
                int i2 = i;
                GasStationsOverviewView gasStationsOverviewView = this.b;
                switch (i2) {
                    case 0:
                        modalPeekHeight_delegate$lambda$0 = GasStationsOverviewView.modalPeekHeight_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(modalPeekHeight_delegate$lambda$0);
                    case 1:
                        cardElevation_delegate$lambda$0 = GasStationsOverviewView.cardElevation_delegate$lambda$0(gasStationsOverviewView);
                        return Float.valueOf(cardElevation_delegate$lambda$0);
                    case 2:
                        cardItemSpacing_delegate$lambda$0 = GasStationsOverviewView.cardItemSpacing_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemSpacing_delegate$lambda$0);
                    case 3:
                        cardItemEdgeMargin_delegate$lambda$0 = GasStationsOverviewView.cardItemEdgeMargin_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemEdgeMargin_delegate$lambda$0);
                    default:
                        cardItemWidth_delegate$lambda$0 = GasStationsOverviewView.cardItemWidth_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemWidth_delegate$lambda$0);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.modalPeekHeight = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.cardElevation = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: tvs
            public final /* synthetic */ GasStationsOverviewView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int modalPeekHeight_delegate$lambda$0;
                float cardElevation_delegate$lambda$0;
                int cardItemSpacing_delegate$lambda$0;
                int cardItemEdgeMargin_delegate$lambda$0;
                int cardItemWidth_delegate$lambda$0;
                int i22 = i2;
                GasStationsOverviewView gasStationsOverviewView = this.b;
                switch (i22) {
                    case 0:
                        modalPeekHeight_delegate$lambda$0 = GasStationsOverviewView.modalPeekHeight_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(modalPeekHeight_delegate$lambda$0);
                    case 1:
                        cardElevation_delegate$lambda$0 = GasStationsOverviewView.cardElevation_delegate$lambda$0(gasStationsOverviewView);
                        return Float.valueOf(cardElevation_delegate$lambda$0);
                    case 2:
                        cardItemSpacing_delegate$lambda$0 = GasStationsOverviewView.cardItemSpacing_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemSpacing_delegate$lambda$0);
                    case 3:
                        cardItemEdgeMargin_delegate$lambda$0 = GasStationsOverviewView.cardItemEdgeMargin_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemEdgeMargin_delegate$lambda$0);
                    default:
                        cardItemWidth_delegate$lambda$0 = GasStationsOverviewView.cardItemWidth_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemWidth_delegate$lambda$0);
                }
            }
        });
        final int i3 = 2;
        this.cardItemSpacing = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: tvs
            public final /* synthetic */ GasStationsOverviewView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int modalPeekHeight_delegate$lambda$0;
                float cardElevation_delegate$lambda$0;
                int cardItemSpacing_delegate$lambda$0;
                int cardItemEdgeMargin_delegate$lambda$0;
                int cardItemWidth_delegate$lambda$0;
                int i22 = i3;
                GasStationsOverviewView gasStationsOverviewView = this.b;
                switch (i22) {
                    case 0:
                        modalPeekHeight_delegate$lambda$0 = GasStationsOverviewView.modalPeekHeight_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(modalPeekHeight_delegate$lambda$0);
                    case 1:
                        cardElevation_delegate$lambda$0 = GasStationsOverviewView.cardElevation_delegate$lambda$0(gasStationsOverviewView);
                        return Float.valueOf(cardElevation_delegate$lambda$0);
                    case 2:
                        cardItemSpacing_delegate$lambda$0 = GasStationsOverviewView.cardItemSpacing_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemSpacing_delegate$lambda$0);
                    case 3:
                        cardItemEdgeMargin_delegate$lambda$0 = GasStationsOverviewView.cardItemEdgeMargin_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemEdgeMargin_delegate$lambda$0);
                    default:
                        cardItemWidth_delegate$lambda$0 = GasStationsOverviewView.cardItemWidth_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemWidth_delegate$lambda$0);
                }
            }
        });
        final int i4 = 3;
        this.cardItemEdgeMargin = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: tvs
            public final /* synthetic */ GasStationsOverviewView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int modalPeekHeight_delegate$lambda$0;
                float cardElevation_delegate$lambda$0;
                int cardItemSpacing_delegate$lambda$0;
                int cardItemEdgeMargin_delegate$lambda$0;
                int cardItemWidth_delegate$lambda$0;
                int i22 = i4;
                GasStationsOverviewView gasStationsOverviewView = this.b;
                switch (i22) {
                    case 0:
                        modalPeekHeight_delegate$lambda$0 = GasStationsOverviewView.modalPeekHeight_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(modalPeekHeight_delegate$lambda$0);
                    case 1:
                        cardElevation_delegate$lambda$0 = GasStationsOverviewView.cardElevation_delegate$lambda$0(gasStationsOverviewView);
                        return Float.valueOf(cardElevation_delegate$lambda$0);
                    case 2:
                        cardItemSpacing_delegate$lambda$0 = GasStationsOverviewView.cardItemSpacing_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemSpacing_delegate$lambda$0);
                    case 3:
                        cardItemEdgeMargin_delegate$lambda$0 = GasStationsOverviewView.cardItemEdgeMargin_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemEdgeMargin_delegate$lambda$0);
                    default:
                        cardItemWidth_delegate$lambda$0 = GasStationsOverviewView.cardItemWidth_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemWidth_delegate$lambda$0);
                }
            }
        });
        final int i5 = 4;
        this.cardItemWidth = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: tvs
            public final /* synthetic */ GasStationsOverviewView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int modalPeekHeight_delegate$lambda$0;
                float cardElevation_delegate$lambda$0;
                int cardItemSpacing_delegate$lambda$0;
                int cardItemEdgeMargin_delegate$lambda$0;
                int cardItemWidth_delegate$lambda$0;
                int i22 = i5;
                GasStationsOverviewView gasStationsOverviewView = this.b;
                switch (i22) {
                    case 0:
                        modalPeekHeight_delegate$lambda$0 = GasStationsOverviewView.modalPeekHeight_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(modalPeekHeight_delegate$lambda$0);
                    case 1:
                        cardElevation_delegate$lambda$0 = GasStationsOverviewView.cardElevation_delegate$lambda$0(gasStationsOverviewView);
                        return Float.valueOf(cardElevation_delegate$lambda$0);
                    case 2:
                        cardItemSpacing_delegate$lambda$0 = GasStationsOverviewView.cardItemSpacing_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemSpacing_delegate$lambda$0);
                    case 3:
                        cardItemEdgeMargin_delegate$lambda$0 = GasStationsOverviewView.cardItemEdgeMargin_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemEdgeMargin_delegate$lambda$0);
                    default:
                        cardItemWidth_delegate$lambda$0 = GasStationsOverviewView.cardItemWidth_delegate$lambda$0(gasStationsOverviewView);
                        return Integer.valueOf(cardItemWidth_delegate$lambda$0);
                }
            }
        });
        f0 f0Var = new f0();
        this.snapHelper = f0Var;
        this.snapListener = new l(((vvs) getBinding()).e, f0Var, new GasStationsOverviewView$snapListener$1(1, hVar, h.class, "onGasStationCardSnapped", "onGasStationCardSnapped(I)V", 0));
        this.centerCardListener = new q69(((vvs) getBinding()).e, new s1r(24, this));
        RecyclerView recyclerView = ((vvs) getBinding()).e;
        j3x j3xVar = new j3x();
        adapter$lambda$0(context, this, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        recyclerView.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        this.adapter = bysVar;
        this.isStationCardsDisplayedStateFlow = bvf0.c(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vvs access$getBinding(GasStationsOverviewView gasStationsOverviewView) {
        return (vvs) gasStationsOverviewView.getBinding();
    }

    private static final zy11 adapter$lambda$0(Context context, GasStationsOverviewView gasStationsOverviewView, j3x j3xVar) {
        j3xVar.b = new LinearLayoutManager(context, 0, false);
        aki0.b(new f3x(pts.class, j3xVar, new GasStationsOverviewView$adapter$1$itemViewBuilder$1(0, gasStationsOverviewView, GasStationsOverviewView.class, "createGasStationCardView", "createGasStationCardView()Lcom/yandex/go/navigator/gas_stations/overview/GasStationCardView;", 0)), new txk(28));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0$0(GasStationCardView gasStationCardView, pts ptsVar) {
        gasStationCardView.updateState(ptsVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float cardElevation_delegate$lambda$0(GasStationsOverviewView gasStationsOverviewView) {
        return ru.yandex.taxi.design.utils.c.h(6, gasStationsOverviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cardItemEdgeMargin_delegate$lambda$0(GasStationsOverviewView gasStationsOverviewView) {
        return ru.yandex.taxi.design.utils.c.h(21, gasStationsOverviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cardItemSpacing_delegate$lambda$0(GasStationsOverviewView gasStationsOverviewView) {
        return ru.yandex.taxi.design.utils.c.h(8, gasStationsOverviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cardItemWidth_delegate$lambda$0(GasStationsOverviewView gasStationsOverviewView) {
        return ofp0.b - ru.yandex.taxi.design.utils.c.h(42, gasStationsOverviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 centerCardListener$lambda$0(GasStationsOverviewView gasStationsOverviewView, int i) {
        int itemCount = gasStationsOverviewView.adapter.getItemCount();
        if (itemCount > 0) {
            gasStationsOverviewView.updateDotsIndicatorSelection(i, itemCount - 1);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GasStationCardView createGasStationCardView() {
        GasStationCardView gasStationCardView = new GasStationCardView(getContext(), null, 0, 6, null);
        gasStationCardView.setLayoutParams(new FrameLayout.LayoutParams(getCardItemWidth(), -2));
        gasStationCardView.setElevation(getCardElevation());
        return gasStationCardView;
    }

    private final float getCardElevation() {
        return ((Number) this.cardElevation.getValue()).floatValue();
    }

    private final int getCardItemEdgeMargin() {
        return ((Number) this.cardItemEdgeMargin.getValue()).intValue();
    }

    private final int getCardItemSpacing() {
        return ((Number) this.cardItemSpacing.getValue()).intValue();
    }

    private final int getCardItemWidth() {
        return ((Number) this.cardItemWidth.getValue()).intValue();
    }

    private final int getModalPeekHeight() {
        return ((Number) this.modalPeekHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int modalPeekHeight_delegate$lambda$0(GasStationsOverviewView gasStationsOverviewView) {
        return ru.yandex.taxi.design.utils.c.h(68, gasStationsOverviewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onBackPressed(h hVar) {
        com.yandex.go.navigator.gas_stations.repositories.c cVar = hVar.B;
        if (hVar.z.a() != GasStationSearchType.ON_AREA || cVar.g.getValue() == null) {
            hVar.x.a.r(new qu(9));
        } else {
            cVar.g.l(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void renderCardList(ovs state) {
        pz40 pz40Var = this.isStationCardsDisplayedStateFlow;
        Boolean bool = Boolean.FALSE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
        ((vvs) getBinding()).h.setVisibility(8);
        RecyclerView recyclerView = ((vvs) getBinding()).e;
        List list = state.a;
        recyclerView.setVisibility(list.isEmpty() ? 8 : 0);
        this.snapListener.d = -1;
        this.centerCardListener.c = -1;
        this.adapter.submitList(list, new qpo(19, this, state));
        updateDotsIndicator(state.b, list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderCardList$lambda$0(GasStationsOverviewView gasStationsOverviewView, ovs ovsVar) {
        OneShotPreDrawListener.add(gasStationsOverviewView, new do91(7, ovsVar, gasStationsOverviewView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderExpansionState(GasStationsOverviewUiState$ExpansionState expansionState) {
        int i = uvs.a[expansionState.ordinal()];
        if (i == 1) {
            if (getBottomSheetBehavior().E != 6) {
                anchor();
            }
        } else if (i != 2) {
            w511.b();
        } else if (getBottomSheetBehavior().E != 4) {
            collapse();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void renderFail(pvs failState) {
        ((vvs) getBinding()).e.setVisibility(8);
        ((vvs) getBinding()).c.setVisibility(8);
        ((vvs) getBinding()).h.setVisibility(0);
        ((vvs) getBinding()).b.setVisibility(failState.b != null ? 0 : 8);
        ((vvs) getBinding()).i.setText(failState.a);
        wjm wjmVar = failState.b;
        if (wjmVar != null) {
            ((vvs) getBinding()).g.setText((String) wjmVar.b);
            ((vvs) getBinding()).g.setDebounceClickListener(new ijs(1, (sls) wjmVar.c));
            ((vvs) getBinding()).f.setText((String) wjmVar.w);
            ((vvs) getBinding()).f.setDebounceClickListener(new ijs(2, (sls) wjmVar.x));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFocusButton(qvs uiState) {
        ptr ntrVar;
        int i = uvs.b[uiState.a.ordinal()];
        if (i == 1) {
            ntrVar = new ntr();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            ntrVar = new otr();
        }
        getLocationButton().a(ntrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void renderTitle(rvs titleState) {
        ShimmeringBar shimmeringBar = ((vvs) getBinding()).k;
        String str = titleState.a;
        shimmeringBar.setVisibility(evu0.J(str) ? 0 : 8);
        ((vvs) getBinding()).j.setVisibility(evu0.J(str) ? 8 : 0);
        ((vvs) getBinding()).j.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToPositionNoAnimation(RecyclerView recyclerView, int i) {
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.r(i, getCardItemEdgeMargin() - (getCardItemSpacing() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupRecyclerView() {
        ((vvs) getBinding()).e.addItemDecoration(new tqu(getCardItemEdgeMargin(), getCardItemEdgeMargin(), getCardItemSpacing()));
        this.snapHelper.b(((vvs) getBinding()).e);
        ((vvs) getBinding()).e.addOnScrollListener(this.snapListener);
        ((vvs) getBinding()).e.addOnScrollListener(this.centerCardListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScrollToPositionWithFixedTime(RecyclerView recyclerView, int i) {
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        w69 w69Var = new w69(recyclerView.getContext(), 1);
        w69Var.a = i;
        linearLayoutManager.v(w69Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateDotsIndicator(int selectedItemIdx, int itemsCount) {
        boolean z = itemsCount > 1;
        ((vvs) getBinding()).c.setVisibility(z ? 0 : 8);
        if (z) {
            ((vvs) getBinding()).c.setDotsCount(0);
            ((vvs) getBinding()).c.setDotsCount(Math.min(itemsCount, 3));
            updateDotsIndicatorSelection(selectedItemIdx, itemsCount - 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateDotsIndicatorSelection(int selectedItemIdx, int lastItemIdx) {
        ((vvs) getBinding()).c.setIndicator(selectedItemIdx == 0 ? 0 : (lastItemIdx != 1 && selectedItemIdx == lastItemIdx) ? 2 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ((vvs) getBinding()).c.setDotColors(s8o.m(new bdc(xng0.textMinor), getContext()), s8o.m(new bdc(xng0.textMain), getContext()));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vvs bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.gas_stations_overview_view, parent, false);
        int i = z5h0.buttons_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = z5h0.dots_indicator;
            DotsIndicatorView dotsIndicatorView = (DotsIndicatorView) cma1.O(i, inflate);
            if (dotsIndicatorView != null) {
                i = z5h0.filters_button;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = z5h0.gas_station_cards_rv;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = z5h0.main_button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent != null) {
                            i = z5h0.minor_button;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                            if (buttonComponent2 != null) {
                                i = z5h0.no_results_container;
                                GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                                if (goLinearLayout2 != null) {
                                    i = z5h0.no_results_description;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView != null) {
                                        i = z5h0.title;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                        if (robotoTextView2 != null) {
                                            i = z5h0.title_shimmer;
                                            ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, inflate);
                                            if (shimmeringBar != null) {
                                                return new vvs((GoLinearLayout) inflate, goLinearLayout, dotsIndicatorView, goImageView, recyclerView, buttonComponent, buttonComponent2, goLinearLayout2, robotoTextView, robotoTextView2, shimmeringBar);
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

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int getBottomFocusRectOffset() {
        return tje.u(48, getContext()) + getResources().getDimensionPixelSize(qtg0.gas_stations_overview_content_height);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public int getTopFocusRectOffset() {
        return tje.u(144, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getIsArrowHidden() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        getBottomSheetBehavior().a0 = false;
        setDismissOnBackPressed(false);
        setOnBackPressedListener(new ejp(17, this.presenter));
        h hVar = this.presenter;
        hVar.Bg(new k(this));
        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$renderFocusButton$$inlined$safeCollectIn$1(new m0(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.t(hVar.L), new GasStationsOverviewPresenter$renderFocusButton$$inlined$start$1(Boolean.FALSE, null)), hVar.F.a(), new GasStationsOverviewPresenter$renderFocusButton$1(3, null)), null, (fvs) hVar.Dg()), 3);
        ows owsVar = hVar.C;
        g gVar = new g(owsVar.b);
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(hVar.G.e, new GasStationsOverviewPresenter$renderModalExpansion$isInteractionFinishedFlow$1(2, null));
        tus tusVar = hVar.z;
        com.yandex.go.navigator.gas_stations.filters.repositories.b bVar = tusVar.m;
        com.yandex.go.navigator.gas_stations.repositories.c cVar = hVar.B;
        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$renderModalExpansion$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(bVar, cVar.i, gVar, I, new GasStationsOverviewPresenter$renderModalExpansion$1(5, null))), null, (fvs) hVar.Dg()), 3);
        com.yandex.go.navigator.gas_stations.filters.repositories.b bVar2 = tusVar.m;
        com.yandex.go.coroutines.b.h(hVar.Jg(), kotlinx.coroutines.flow.e.n(bVar2, owsVar.b, cVar.i, new GasStationsOverviewPresenter$listenResult$1(hVar, null)));
        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$listenSelectedGasStation$$inlined$safeCollectLatestIn$1(new m0(new mth(cVar.h, 6), bVar2, new GasStationsOverviewPresenter$listenSelectedGasStation$1(3, null)), null, hVar), 3);
        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$listenFocusRectReadyRequests$$inlined$safeCollectIn$1(new d((gci0) hVar.K.b), null, hVar), 3);
        requestApplyInsets();
        setBehaviorPeekHeight(getModalPeekHeight());
        setupRecyclerView();
        RobotoTextView robotoTextView = ((vvs) getBinding()).j;
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        robotoTextView.setTypeface(((zmh) ip11Var).d());
        ru.yandex.taxi.design.utils.c.z(new GasStationsOverviewView$onAttachedToWindow$2(0, this.presenter, h.class, "onFiltersButtonClick", "onFiltersButtonClick()V", 0), ((vvs) getBinding()).d);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void onGeoTap() {
        h hVar = this.presenter;
        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$onLocationButtonClicked$1(hVar, null), 3);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView, ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        setBehaviorPeekHeight(getModalPeekHeight() + insets.g);
    }

    @Override // com.yandex.go.navigator.BaseNavigatorModalView
    public void onOverviewButtonClicked() {
        super.onOverviewButtonClicked();
        h hVar = this.presenter;
        xb50 xb50Var = hVar.D;
        DrivingRoute drivingRoute = (DrivingRoute) xb50Var.a.a.getValue();
        if (drivingRoute != null) {
            xb50Var.a(drivingRoute, false);
        }
        hVar.L.g(Boolean.FALSE);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "gas_stations_overview_screen";
    }
}
