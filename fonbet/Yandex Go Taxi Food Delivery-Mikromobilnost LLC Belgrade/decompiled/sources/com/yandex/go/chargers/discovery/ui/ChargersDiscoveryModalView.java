package com.yandex.go.chargers.discovery.ui;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenButtonV5;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenOpenReasonV2;
import com.yandex.go.chargers.api.ChargersOpenReason;
import com.yandex.go.chargers.attention.presentation.ChargersAttentionView;
import com.yandex.go.chargers.discovery.ui.ChargersDiscoveryModalView;
import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import com.yandex.go.chargers.ui.ChargersShortcutsLikeSlideableModalView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.a2i0;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.b64;
import defpackage.bx9;
import defpackage.byx;
import defpackage.c230;
import defpackage.c430;
import defpackage.dn7;
import defpackage.e230;
import defpackage.em9;
import defpackage.fhb1;
import defpackage.fi91;
import defpackage.gh00;
import defpackage.gzr0;
import defpackage.isj;
import defpackage.itg0;
import defpackage.ix9;
import defpackage.ju8;
import defpackage.khh0;
import defpackage.m2a;
import defpackage.mj9;
import defpackage.mn9;
import defpackage.mo21;
import defpackage.ndh0;
import defpackage.nm7;
import defpackage.ny61;
import defpackage.psh0;
import defpackage.pw9;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qw9;
import defpackage.s2a;
import defpackage.saa;
import defpackage.sc;
import defpackage.tje;
import defpackage.un0;
import defpackage.w511;
import defpackage.wwj;
import defpackage.xng0;
import defpackage.xwj;
import defpackage.xx9;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bi\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020*H\u0014¢\u0006\u0004\b1\u0010,J\u000f\u00102\u001a\u00020*H\u0014¢\u0006\u0004\b2\u0010,J\u0017\u00105\u001a\u00020*2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020'H\u0016¢\u0006\u0004\b7\u0010)J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020*H\u0014¢\u0006\u0004\b;\u0010,J\u0017\u0010=\u001a\u00020*2\u0006\u0010<\u001a\u00020'H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020*H\u0016¢\u0006\u0004\b?\u0010,J!\u0010B\u001a\u00020*2\u0006\u0010@\u001a\u0002082\b\u0010A\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020*H\u0016¢\u0006\u0004\bD\u0010,J\u000f\u0010E\u001a\u00020*H\u0016¢\u0006\u0004\bE\u0010,J\u000f\u0010F\u001a\u00020*H\u0016¢\u0006\u0004\bF\u0010,J\u0017\u0010I\u001a\u00020*2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020*2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020*H\u0016¢\u0006\u0004\bO\u0010,J\u0017\u0010Q\u001a\u00020*2\u0006\u0010P\u001a\u00020-H\u0016¢\u0006\u0004\bQ\u00100J\u0017\u0010S\u001a\u00020K2\u0006\u0010R\u001a\u00020-H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020*2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\\R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010^R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010_R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010`R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010aR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020-8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lcom/yandex/go/chargers/discovery/ui/ChargersDiscoveryModalView;", "Lcom/yandex/go/chargers/ui/ChargersShortcutsLikeSlideableModalView;", "Lmj9;", "Lix9;", "Landroid/content/Context;", "context", "Lah00;", "mapController", "Lgzr0;", "shortcutGridView", "La3v;", "focusCoordinator", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "mapObservationPresenter", "Lbx9;", "chargersDiscoveryPresenter", "Lwwj;", "discoveryUserLocationOverlay", "Lmn9;", "chargersAttentionViewDelegate", "Lxx9;", "chargersEnvironmentRepository", "Lqw9;", "chargersDiscoveryAnalyticsProxy", "Lsaa;", "chargersOrchestratorUserEventsInteractor", "<init>", "(Landroid/content/Context;Lah00;Lgzr0;La3v;Lru/yandex/taxi/discovery/a;Lru/yandex/taxi/layers/presentation/optimalview/c;Lbx9;Lwwj;Lmn9;Lxx9;Lqw9;Lsaa;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lmj9;", "Le230;", "insetsType", "()Le230;", "", "canDragToExpandFromAnchored", "()Z", "Lzy11;", "onAttachedToWindow", "()V", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "canHandleScreenTracking", "", "screenName", "()Ljava/lang/String;", "onArrowClick", "isFallback", "updateAnchorHeight", "(Z)V", "updateUserPosition", "title", "subtitle", "showMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "hideMessage", "showFirstUsageHint", "hideFirstUsageHint", "Lmo21;", "userLocation", "updateUserLocation", "(Lmo21;)V", "", "azimuth", "updateAzimuth", "(F)V", "showError", "count", "updateBadgeCount", "dp", "dpToPx", "(I)F", "Landroid/view/View;", "attentionView", "disablePromoImageClipping", "(Landroid/view/View;)V", "Lah00;", "Lgzr0;", "La3v;", "Lru/yandex/taxi/discovery/a;", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "Lbx9;", "Lwwj;", "Lmn9;", "Lxx9;", "Lqw9;", "Lsaa;", "Lisj;", "discoveryCameraMoveHandler", "Lisj;", "Ljava/lang/Runnable;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "getSlideableBackgroundAttrRes", "()I", "slideableBackgroundAttrRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscoveryModalView extends ChargersShortcutsLikeSlideableModalView<mj9> implements ix9 {
    private FloatButtonIconComponent backButton;
    private final mn9 chargersAttentionViewDelegate;
    private final qw9 chargersDiscoveryAnalyticsProxy;
    private final bx9 chargersDiscoveryPresenter;
    private final xx9 chargersEnvironmentRepository;
    private final saa chargersOrchestratorUserEventsInteractor;
    private final isj discoveryCameraMoveHandler;
    private final ru.yandex.taxi.discovery.a discoveryPresenter;
    private final wwj discoveryUserLocationOverlay;
    private final a3v focusCoordinator;
    private final ah00 mapController;
    private final ru.yandex.taxi.layers.presentation.optimalview.c mapObservationPresenter;
    private Runnable onBackPressedListener;
    private final gzr0 shortcutGridView;

    public ChargersDiscoveryModalView(Context context, ah00 ah00Var, gzr0 gzr0Var, a3v a3vVar, ru.yandex.taxi.discovery.a aVar, ru.yandex.taxi.layers.presentation.optimalview.c cVar, bx9 bx9Var, wwj wwjVar, mn9 mn9Var, xx9 xx9Var, qw9 qw9Var, saa saaVar) {
        super(context, 6);
        this.mapController = ah00Var;
        this.shortcutGridView = gzr0Var;
        this.focusCoordinator = a3vVar;
        this.discoveryPresenter = aVar;
        this.mapObservationPresenter = cVar;
        this.chargersDiscoveryPresenter = bx9Var;
        this.discoveryUserLocationOverlay = wwjVar;
        this.chargersAttentionViewDelegate = mn9Var;
        this.chargersEnvironmentRepository = xx9Var;
        this.chargersDiscoveryAnalyticsProxy = qw9Var;
        this.chargersOrchestratorUserEventsInteractor = saaVar;
        this.discoveryCameraMoveHandler = new isj(ah00Var);
        setOnAppearingListener(new sc(3, this));
    }

    private final void disablePromoImageClipping(View attentionView) {
        ViewParent parent = attentionView.findViewById(khh0.attention_header_image).getParent();
        while ((parent instanceof ViewGroup) && !parent.equals(this)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setClipToOutline(false);
            parent = viewGroup.getParent();
        }
        View findViewById = findViewById(ndh0.slideable_modal_view_bottom_sheet);
        if (findViewById != null) {
            fi91.f(findViewById, qje.t(xng0.bgMain, getContext()), dpToPx(24));
        }
    }

    private final float dpToPx(int dp) {
        return dp * getContext().getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(ChargersDiscoveryModalView chargersDiscoveryModalView) {
        return chargersDiscoveryModalView.shortcutGridView.getView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ChargersDiscoveryModalView chargersDiscoveryModalView) {
        Runnable runnable = chargersDiscoveryModalView.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    private static final zy11 onAttachedToWindow$lambda$1(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setBadgeBackgroundColor(ru.yandex.taxi.design.utils.c.c(xng0.controlMain, floatButtonIconComponent));
        floatButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(ChargersDiscoveryModalView chargersDiscoveryModalView) {
        if (chargersDiscoveryModalView.getCollapsedByUser()) {
            return;
        }
        chargersDiscoveryModalView.anchor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onGeoClick(bx9 bx9Var) {
        bx9Var.E.a(ChargersAnalytics$ChargersMainScreenButtonV5.Geo);
        tje.N(bx9Var.Jg(), null, null, new ChargersDiscoveryPresenter$onGeoClick$1(bx9Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBackPressedListener$lambda$0(ChargersDiscoveryModalView chargersDiscoveryModalView, Runnable runnable) {
        chargersDiscoveryModalView.chargersDiscoveryAnalyticsProxy.a(ChargersAnalytics$ChargersMainScreenButtonV5.Back);
        chargersDiscoveryModalView.chargersDiscoveryAnalyticsProxy.c = ChargersAnalytics$ChargersMainScreenCloseReason.Back;
        runnable.run();
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public mj9 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(psh0.charger_discovery_view, parent, false);
        if (inflate != null) {
            return new mj9((GoFrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // com.yandex.go.chargers.ui.ChargersShortcutsLikeSlideableModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // defpackage.mq00
    public /* bridge */ void collapseForZoom() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getSlideableBackgroundAttrRes() {
        return xng0.bgTransparent;
    }

    @Override // defpackage.mq00
    public void hideFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void hideMessage() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new ju8(24, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (behaviourState() == 3) {
            anchor();
        } else {
            expand();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, com.yandex.go.chargers.discovery.ui.ChargersDiscoveryModalView, ix9, l050, mq00, ru.yandex.taxi.widget.ModalView, ru.yandex.taxi.widget.SlideableBindingModalView, ru.yandex.taxi.widget.SlideableModalView] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ChargersAnalytics$ChargersMainScreenOpenReasonV2 chargersAnalytics$ChargersMainScreenOpenReasonV2;
        Uri uri;
        super.onAttachedToWindow();
        final int i = 0;
        setDismissOnTouchOutside(false);
        updateAnchorHeight(false);
        setBehaviorPeekHeight(tje.u(80, getContext()));
        ChargersAttentionView a = ((com.yandex.go.chargers.attention.presentation.b) this.chargersAttentionViewDelegate).a(this.shortcutGridView.getView());
        ((mj9) getBinding()).a.addView(a, new FrameLayout.LayoutParams(-1, -1));
        disablePromoImageClipping(a);
        refreshNestedScrollView(this.shortcutGridView.getView());
        this.chargersEnvironmentRepository.a.getClass();
        Runnable runnable = new Runnable(this) { // from class: zw9
            public final /* synthetic */ ChargersDiscoveryModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ChargersDiscoveryModalView chargersDiscoveryModalView = this.b;
                switch (i2) {
                    case 0:
                        ChargersDiscoveryModalView.onAttachedToWindow$lambda$0(chargersDiscoveryModalView);
                        break;
                    case 1:
                        chargersDiscoveryModalView.collapse();
                        break;
                    default:
                        ChargersDiscoveryModalView.onAttachedToWindow$lambda$2(chargersDiscoveryModalView);
                        break;
                }
            }
        };
        ?? r7 = 0;
        r7 = 0;
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), r7, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(runnable);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        onAttachedToWindow$lambda$1(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        fhb1.a(this, new dn7(27, this.chargersDiscoveryPresenter));
        this.mapObservationPresenter.Lg(this);
        bx9 bx9Var = this.chargersDiscoveryPresenter;
        bx9Var.Bg(this);
        bx9Var.A.b(new byx(Screen.DISCOVERY, new c430(Mode.CHARGERS, (kotlinx.serialization.json.b) null, (un0) null)));
        bx9Var.x.i(com.yandex.go.navigation.screen.api.Screen.CHARGERS_DISCOVERY);
        com.yandex.go.chargers.discovery.domain.c cVar = bx9Var.C;
        tje.N(bx9Var.Jg(), null, null, new ChargersDiscoveryPresenter$attachView$$inlined$collectIn$1(cVar.a(), null, bx9Var), 3);
        tje.N(bx9Var.Jg(), null, null, new ChargersDiscoveryPresenter$attachView$$inlined$collectIn$2(e.t(new d(new b(cVar.a.d()))), null, this), 3);
        isj isjVar = this.discoveryCameraMoveHandler;
        final int i2 = 1;
        Runnable runnable2 = new Runnable(this) { // from class: zw9
            public final /* synthetic */ ChargersDiscoveryModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ChargersDiscoveryModalView chargersDiscoveryModalView = this.b;
                switch (i22) {
                    case 0:
                        ChargersDiscoveryModalView.onAttachedToWindow$lambda$0(chargersDiscoveryModalView);
                        break;
                    case 1:
                        chargersDiscoveryModalView.collapse();
                        break;
                    default:
                        ChargersDiscoveryModalView.onAttachedToWindow$lambda$2(chargersDiscoveryModalView);
                        break;
                }
            }
        };
        final int i3 = 2;
        Runnable runnable3 = new Runnable(this) { // from class: zw9
            public final /* synthetic */ ChargersDiscoveryModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                ChargersDiscoveryModalView chargersDiscoveryModalView = this.b;
                switch (i22) {
                    case 0:
                        ChargersDiscoveryModalView.onAttachedToWindow$lambda$0(chargersDiscoveryModalView);
                        break;
                    case 1:
                        chargersDiscoveryModalView.collapse();
                        break;
                    default:
                        ChargersDiscoveryModalView.onAttachedToWindow$lambda$2(chargersDiscoveryModalView);
                        break;
                }
            }
        };
        isjVar.d = runnable2;
        isjVar.e = runnable3;
        ((gh00) isjVar.a).e(isjVar.c);
        qw9 qw9Var = this.chargersDiscoveryAnalyticsProxy;
        s2a s2aVar = qw9Var.b;
        m2a m2aVar = s2aVar instanceof m2a ? (m2a) s2aVar : null;
        if (m2aVar != null && (uri = m2aVar.b) != null) {
            r7 = uri.toString();
        }
        em9 em9Var = qw9Var.a;
        ChargersOpenReason j = s2aVar.j();
        switch (j != null ? pw9.a[j.ordinal()] : -1) {
            case -1:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.Unknown;
                break;
            case 0:
            default:
                w511.b();
                return;
            case 1:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.Deeplink;
                break;
            case 2:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.Shortcut;
                break;
            case 3:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.DetailedOrder;
                break;
            case 4:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.Unknown;
                break;
            case 5:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.Unknown;
                break;
            case 6:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.DiscountsAndPromocodes;
                break;
            case 7:
                chargersAnalytics$ChargersMainScreenOpenReasonV2 = ChargersAnalytics$ChargersMainScreenOpenReasonV2.Unknown;
                break;
        }
        HashMap w = b64.w(em9Var);
        w.put("open_reason", chargersAnalytics$ChargersMainScreenOpenReasonV2.getEventValue());
        if (r7 != 0) {
            w.put("deeplink_value", r7);
        }
        em9Var.a.a("Chargers.MainScreen.Shown", w, 3, new HashMap());
        ((com.yandex.go.chargers.orchestrator_user_events.domain.b) this.chargersOrchestratorUserEventsInteractor).a(ChargersOrchestratorUserEventType.DISCOVERY);
        this.shortcutGridView.resume();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.yandex.go.chargers.attention.presentation.b bVar = (com.yandex.go.chargers.attention.presentation.b) this.chargersAttentionViewDelegate;
        bVar.b = null;
        bVar.a.Cg();
        this.discoveryCameraMoveHandler.a();
        this.mapObservationPresenter.Cg();
        qw9 qw9Var = this.chargersDiscoveryAnalyticsProxy;
        em9 em9Var = qw9Var.a;
        ChargersAnalytics$ChargersMainScreenCloseReason chargersAnalytics$ChargersMainScreenCloseReason = qw9Var.c;
        if (chargersAnalytics$ChargersMainScreenCloseReason == null) {
            chargersAnalytics$ChargersMainScreenCloseReason = ChargersAnalytics$ChargersMainScreenCloseReason.Unknown;
        }
        HashMap w = b64.w(em9Var);
        w.put("close_reason", chargersAnalytics$ChargersMainScreenCloseReason.getEventValue());
        em9Var.a.a("Chargers.MainScreen.Closed", w, 1, new HashMap());
        this.shortcutGridView.pause();
        this.chargersDiscoveryPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.focusCoordinator.b8(this);
        this.focusCoordinator.q3(qoi0.a(ChargersDiscoveryModalView.class), 0, tje.r(itg0.chargers_top_notification_focus_rect_margin, getContext()), 0, tje.r(itg0.chargers_discovery_anchor, getContext()));
        ((gh00) this.mapController).L(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.focusCoordinator.a0(this);
        this.focusCoordinator.Lc(qoi0.a(ChargersDiscoveryModalView.class), null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "chargers_discovery";
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        nm7 nm7Var = new nm7(25, this, onBackPressedListener);
        super.setOnBackPressedListener(nm7Var);
        this.onBackPressedListener = nm7Var;
    }

    public void showError() {
    }

    @Override // defpackage.mq00
    public void showFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void showMessage(String title, String subtitle) {
    }

    @Override // defpackage.ix9
    public void updateAnchorHeight(boolean isFallback) {
        setBehaviorAnchorHeight(Integer.valueOf(tje.r(isFallback ? itg0.chargers_discovery_fallback_anchor : itg0.chargers_discovery_anchor, getContext())));
    }

    @Override // defpackage.rwj
    public void updateAzimuth(float azimuth) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.updateAzimuth(azimuth);
        }
    }

    @Override // defpackage.rwj
    public void updateBadgeCount(int count) {
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            if (count > 0) {
                floatButtonIconComponent.setBadgeText(String.valueOf(count));
            } else {
                floatButtonIconComponent.setBadgeText(null);
            }
        }
    }

    @Override // defpackage.rwj
    public void updateUserLocation(mo21 userLocation) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a(userLocation);
        }
    }

    @Override // defpackage.ix9
    public void updateUserPosition() {
        this.discoveryPresenter.Ng();
    }
}
