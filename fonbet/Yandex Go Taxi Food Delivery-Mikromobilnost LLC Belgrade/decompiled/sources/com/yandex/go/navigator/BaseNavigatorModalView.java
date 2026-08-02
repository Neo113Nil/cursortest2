package com.yandex.go.navigator;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.alt_select.traffic.TrafficJamView;
import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.map_interactions.parkings.CarParsToggle;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.navigator.rotatemap.CompassButtonPresenter$attachView$$inlined$safeCollectIn$1;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.bvf0;
import defpackage.c230;
import defpackage.cma1;
import defpackage.dh00;
import defpackage.e230;
import defpackage.eg3;
import defpackage.ewc;
import defpackage.fuh0;
import defpackage.gh00;
import defpackage.gs7;
import defpackage.i3y;
import defpackage.j55;
import defpackage.k55;
import defpackage.mo21;
import defpackage.mtr;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.pz40;
import defpackage.q57;
import defpackage.qdb1;
import defpackage.rwj;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tpr;
import defpackage.w04;
import defpackage.wb50;
import defpackage.xw31;
import defpackage.z5h0;
import defpackage.zi;
import defpackage.zo31;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0002\u0087\u0001BG\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0014¢\u0006\u0004\b#\u0010\u001cJ\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010\u001cJ\u000f\u0010%\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u001f\u0010)\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001fH\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010\u001cJ\u0017\u0010.\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020&H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020&H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020&H\u0014¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020&H\u0014¢\u0006\u0004\b:\u00108J\u0010\u0010;\u001a\u00020\u001aH\u0084@¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0014¢\u0006\u0004\b=\u0010\u001cJ\u000f\u0010>\u001a\u00020\u001aH\u0014¢\u0006\u0004\b>\u0010\u001cJ\u000f\u0010?\u001a\u00020\u001aH\u0014¢\u0006\u0004\b?\u0010\u001cJ\u0019\u0010B\u001a\u00020\u001a2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001fH\u0014¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020FH\u0014¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001aH\u0016¢\u0006\u0004\bJ\u0010\u001cJ\u000f\u0010K\u001a\u00020&H\u0014¢\u0006\u0004\bK\u00108J\u0017\u0010N\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020FH\u0016¢\u0006\u0004\bQ\u0010IJ\u000f\u0010R\u001a\u00020\u001aH\u0016¢\u0006\u0004\bR\u0010\u001cJ!\u0010V\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020S2\b\u0010U\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bX\u0010\u001cJ\u000f\u0010Y\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010\u001cJ\u000f\u0010Z\u001a\u00020\u001aH\u0016¢\u0006\u0004\bZ\u0010\u001cJ\u000f\u0010[\u001a\u00020\u001aH\u0002¢\u0006\u0004\b[\u0010\u001cJ\u000f\u0010\\\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\\\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010]R\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010cR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010dR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020&0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0017\u0010n\u001a\u00020m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010y\u001a\u00020x8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0019\u0010~\u001a\u00020}8\u0006¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0084\u0001\u001a\u00020&8DX\u0084\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u00108R\u0017\u0010\u0085\u0001\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/yandex/go/navigator/BaseNavigatorModalView;", "Lzo31;", "T", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lrwj;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lah00;", "mapController", "Lwb50;", "focusCoordinator", "Lcom/yandex/go/navigator/repository/o;", "userInteractionsListener", "Lcom/yandex/go/navigator/domain/e;", "focusModeChangeEventRepository", "Lewc;", "compassButtonPresenter", "Lcom/yandex/go/navigator/analitycs/a;", "navigatorMainScreenAnalyticInteractor", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/discovery/a;Lah00;Lwb50;Lcom/yandex/go/navigator/repository/o;Lcom/yandex/go/navigator/domain/e;Lewc;Lcom/yandex/go/navigator/analitycs/a;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "hideFloatButtonLocationHolder", "()V", "showFloatingComponents", "hideFloatingComponents", "", "isVisible", "changeFloatingComponentsVisibility", "(Z)V", "onBackPressed", "onLocationButtonClicked", "onOverviewButtonClicked", "", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "onGeoTap", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "contentTop", "onModalViewAppear", "(I)V", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "getTopFocusRectOffset", "()I", "getHorizontalFocusRectOffset", "getBottomFocusRectOffset", "prepareStaticFocusRect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttachedToWindow", "animateDismissBackground", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissWithAction", "(Ljava/lang/Runnable;)V", "canDragToExpandFromAnchored", "()Z", "", "newOffset", "onDialogSlide", "(F)V", "updateRightSideContainer", "topRightSideButtonsOffset", "Lmo21;", "userLocation", "updateUserLocation", "(Lmo21;)V", "azimuth", "updateAzimuth", "showError", "", "title", "subtitle", "showMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "hideMessage", "showFirstUsageHint", "hideFirstUsageHint", "updateFabsPaddings", "onCompassButtonClicked", "Lru/yandex/taxi/discovery/a;", "Lah00;", "getMapController", "()Lah00;", "Lwb50;", "Lcom/yandex/go/navigator/repository/o;", "Lcom/yandex/go/navigator/domain/e;", "Lewc;", "Lcom/yandex/go/navigator/analitycs/a;", "Lpz40;", "bottomInsetStateFlow", "Lpz40;", "Ltpr;", "Landroid/graphics/Rect;", "staticFocusRectStateFlow", "Ltpr;", "Lq57;", "rightSideButtonsContainer", "Lq57;", "getRightSideButtonsContainer", "()Lq57;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton$delegate", "Li3y;", "getBackButton", "()Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lmtr;", "locationButton", "Lmtr;", "getLocationButton", "()Lmtr;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "compassButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "getCompassButton", "()Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "floatingButtonSize$delegate", "getFloatingButtonSize", "floatingButtonSize", "spaceBetweenFabs", CA20Status.STATUS_USER_I, "k55", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseNavigatorModalView<T extends zo31> extends SlideableBindingModalView<T> implements rwj {
    public static final int $stable = 8;

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    private final i3y backButton;
    private final pz40 bottomInsetStateFlow;
    private final RotatableFloatButton compassButton;
    private final ewc compassButtonPresenter;
    private final ru.yandex.taxi.discovery.a discoveryPresenter;

    /* renamed from: floatingButtonSize$delegate, reason: from kotlin metadata */
    private final i3y floatingButtonSize;
    private final wb50 focusCoordinator;
    private final com.yandex.go.navigator.domain.e focusModeChangeEventRepository;
    private final mtr locationButton;
    private final ah00 mapController;
    private final com.yandex.go.navigator.analitycs.a navigatorMainScreenAnalyticInteractor;
    private final q57 rightSideButtonsContainer;
    private final int spaceBetweenFabs;
    private final tpr staticFocusRectStateFlow;
    private final o userInteractionsListener;

    public BaseNavigatorModalView(Context context, ru.yandex.taxi.discovery.a aVar, ah00 ah00Var, wb50 wb50Var, o oVar, com.yandex.go.navigator.domain.e eVar, ewc ewcVar, com.yandex.go.navigator.analitycs.a aVar2) {
        super(context);
        this.discoveryPresenter = aVar;
        this.mapController = ah00Var;
        this.focusCoordinator = wb50Var;
        this.userInteractionsListener = oVar;
        this.focusModeChangeEventRepository = eVar;
        this.compassButtonPresenter = ewcVar;
        this.navigatorMainScreenAnalyticInteractor = aVar2;
        final int i = 0;
        r0 c = bvf0.c(0);
        this.bottomInsetStateFlow = c;
        this.staticFocusRectStateFlow = new c(c, this);
        View inflate = LayoutInflater.from(context).inflate(fuh0.buttons_side_container, (ViewGroup) null, false);
        int i2 = z5h0.car_parks;
        CarParsToggle carParsToggle = (CarParsToggle) cma1.O(i2, inflate);
        if (carParsToggle != null) {
            i2 = z5h0.float_button_holder_layout;
            FloatButtonHolderLayout floatButtonHolderLayout = (FloatButtonHolderLayout) cma1.O(i2, inflate);
            if (floatButtonHolderLayout != null) {
                i2 = z5h0.location_spacer;
                Space space = (Space) cma1.O(i2, inflate);
                if (space != null) {
                    i2 = z5h0.traffic_view;
                    TrafficJamView trafficJamView = (TrafficJamView) cma1.O(i2, inflate);
                    if (trafficJamView != null) {
                        GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
                        this.rightSideButtonsContainer = new q57(goLinearLayout, carParsToggle, floatButtonHolderLayout, space, trafficJamView);
                        sls slsVar = new sls(this) { // from class: i55
                            public final /* synthetic */ BaseNavigatorModalView b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                FloatButtonIconComponent backButton_delegate$lambda$0;
                                int floatingButtonSize_delegate$lambda$0;
                                int i3 = i;
                                BaseNavigatorModalView baseNavigatorModalView = this.b;
                                switch (i3) {
                                    case 0:
                                        backButton_delegate$lambda$0 = BaseNavigatorModalView.backButton_delegate$lambda$0(baseNavigatorModalView);
                                        return backButton_delegate$lambda$0;
                                    default:
                                        floatingButtonSize_delegate$lambda$0 = BaseNavigatorModalView.floatingButtonSize_delegate$lambda$0(baseNavigatorModalView);
                                        return Integer.valueOf(floatingButtonSize_delegate$lambda$0);
                                }
                            }
                        };
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                        this.backButton = kotlin.a.b(lazyThreadSafetyMode, slsVar);
                        final int i3 = 1;
                        this.floatingButtonSize = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: i55
                            public final /* synthetic */ BaseNavigatorModalView b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                FloatButtonIconComponent backButton_delegate$lambda$0;
                                int floatingButtonSize_delegate$lambda$0;
                                int i32 = i3;
                                BaseNavigatorModalView baseNavigatorModalView = this.b;
                                switch (i32) {
                                    case 0:
                                        backButton_delegate$lambda$0 = BaseNavigatorModalView.backButton_delegate$lambda$0(baseNavigatorModalView);
                                        return backButton_delegate$lambda$0;
                                    default:
                                        floatingButtonSize_delegate$lambda$0 = BaseNavigatorModalView.floatingButtonSize_delegate$lambda$0(baseNavigatorModalView);
                                        return Integer.valueOf(floatingButtonSize_delegate$lambda$0);
                                }
                            }
                        });
                        this.spaceBetweenFabs = tje.u(8, getContext());
                        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
                        setEnableBackgroundOnAppearing(false);
                        setDismissOnTouchOutside(false);
                        floatButtonHolderLayout.setLayoutDirection(xw31.n(context) ? 1 : 0);
                        this.compassButton = eg3.a(floatButtonHolderLayout, new j55(this, i));
                        this.locationButton = new mtr(floatButtonHolderLayout, new BaseNavigatorModalView$1$2(0, this, BaseNavigatorModalView.class, "updateFabsPaddings", "updateFabsPaddings()V", 0), new BaseNavigatorModalView$1$3(0, this, BaseNavigatorModalView.class, "onOverviewButtonClicked", "onOverviewButtonClicked()V", 0), new BaseNavigatorModalView$1$4(0, this, BaseNavigatorModalView.class, "onLocationButtonClicked", "onLocationButtonClicked()V", 0));
                        updateFabsPaddings();
                        goLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                        SlideableModalView.addViewAboveCard$default(this, goLinearLayout, 8388613, 0, 4, null);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatButtonIconComponent backButton_delegate$lambda$0(BaseNavigatorModalView baseNavigatorModalView) {
        return qdb1.b(baseNavigatorModalView, new j55(baseNavigatorModalView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissWithAction$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int floatingButtonSize_delegate$lambda$0(BaseNavigatorModalView baseNavigatorModalView) {
        return ru.yandex.taxi.design.utils.c.h(68, baseNavigatorModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCompassButtonClicked() {
        this.navigatorMainScreenAnalyticInteractor.e();
        this.focusModeChangeEventRepository.a(FocusMode.FREE);
        this.userInteractionsListener.b();
        ewc ewcVar = this.compassButtonPresenter;
        ah00 ah00Var = ewcVar.x;
        Point d = ((gh00) ah00Var).e.d(ewcVar.y.b.b());
        if (d == null) {
            d = ((gh00) ewcVar.x).e.c.getTarget();
        }
        Point point = d;
        gs7 gs7Var = ewcVar.y;
        ScreenPoint b = gs7Var.b.b();
        float j = ((gh00) gs7Var.a).j();
        Animation.Type type = Animation.Type.SMOOTH;
        wb50 wb50Var = gs7Var.b;
        ScreenPoint a = wb50Var.a();
        wb50Var.g(b);
        dh00.a(gs7Var.a, point, j, type, new w04(22, gs7Var, a), 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFabsPaddings() {
        RotatableFloatButton rotatableFloatButton = this.compassButton;
        rotatableFloatButton.setPaddingRelative(0, rotatableFloatButton.getPaddingTop(), 0, rotatableFloatButton.getPaddingBottom());
        RotatableFloatButton rotatableFloatButton2 = this.locationButton.e;
        if (rotatableFloatButton2 != null) {
            rotatableFloatButton2.setPaddingRelative(this.spaceBetweenFabs, rotatableFloatButton2.getPaddingTop(), 0, rotatableFloatButton2.getPaddingBottom());
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return false;
    }

    public void changeFloatingComponentsVisibility(boolean isVisible) {
        int i = 0;
        View[] viewArr = {getBackButton(), this.rightSideButtonsContainer.a};
        if (isVisible) {
            View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, 2);
            int length = viewArr2.length;
            while (i < length) {
                cma1.J(viewArr2[i]);
                i++;
            }
            return;
        }
        View[] viewArr3 = (View[]) Arrays.copyOf(viewArr, 2);
        int length2 = viewArr3.length;
        while (i < length2) {
            cma1.L(viewArr3[i]);
            i++;
        }
    }

    @Override // defpackage.mq00
    public /* bridge */ void collapseForZoom() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismissWithAction(Runnable onAnimationEnd) {
        if (!isCollapsed()) {
            super.dismissWithAction(onAnimationEnd);
            return;
        }
        if (onAnimationEnd == null) {
            onAnimationEnd = new zi(11);
        }
        dismissInternal(onAnimationEnd);
    }

    public FloatButtonIconComponent getBackButton() {
        return (FloatButtonIconComponent) this.backButton.getValue();
    }

    public int getBottomFocusRectOffset() {
        return ofp0.c / 2;
    }

    public final RotatableFloatButton getCompassButton() {
        return this.compassButton;
    }

    public final int getFloatingButtonSize() {
        return ((Number) this.floatingButtonSize.getValue()).intValue();
    }

    public int getHorizontalFocusRectOffset() {
        return getFloatingButtonSize();
    }

    public final mtr getLocationButton() {
        return this.locationButton;
    }

    public final ah00 getMapController() {
        return this.mapController;
    }

    public final q57 getRightSideButtonsContainer() {
        return this.rightSideButtonsContainer;
    }

    public int getTopFocusRectOffset() {
        return getTopPadding() + getFloatingButtonSize();
    }

    @Override // defpackage.mq00
    public void hideFirstUsageHint() {
    }

    public final void hideFloatButtonLocationHolder() {
        this.rightSideButtonsContainer.c.setVisibility(8);
        this.rightSideButtonsContainer.d.setVisibility(8);
    }

    public void hideFloatingComponents() {
        changeFloatingComponentsVisibility(false);
    }

    @Override // defpackage.mq00
    public void hideMessage() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new BaseNavigatorModalView$insetsType$1(this, BaseNavigatorModalView.class, "cardContentContainer", "getCardContentContainer()Landroid/view/ViewGroup;", 0), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.focusCoordinator.c();
        requestApplyInsets();
        this.discoveryPresenter.Mg(this);
        ewc ewcVar = this.compassButtonPresenter;
        k55 k55Var = new k55(this);
        ewcVar.Bg(k55Var);
        tje.N(ewcVar.Jg(), null, null, new CompassButtonPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new com.yandex.go.navigator.rotatemap.b(ewcVar.z, ewcVar)), null, k55Var), 3);
        showFloatingComponents();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.navigatorMainScreenAnalyticInteractor.d();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (newState == 3 && movedByUser) {
            this.userInteractionsListener.b();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.discoveryPresenter.Cg();
        this.compassButtonPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        updateRightSideContainer();
    }

    public void onGeoTap() {
        this.discoveryPresenter.Ng();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        pz40 pz40Var = this.bottomInsetStateFlow;
        Integer valueOf = Integer.valueOf(insets.g);
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, valueOf);
    }

    public void onLocationButtonClicked() {
        this.navigatorMainScreenAnalyticInteractor.f();
        onGeoTap();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        updateRightSideContainer();
    }

    public void onOverviewButtonClicked() {
        this.navigatorMainScreenAnalyticInteractor.g();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prepareStaticFocusRect(Continuation<? super zy11> continuation) {
        BaseNavigatorModalView$prepareStaticFocusRect$1 baseNavigatorModalView$prepareStaticFocusRect$1;
        int i;
        wb50 wb50Var;
        if (continuation instanceof BaseNavigatorModalView$prepareStaticFocusRect$1) {
            baseNavigatorModalView$prepareStaticFocusRect$1 = (BaseNavigatorModalView$prepareStaticFocusRect$1) continuation;
            int i2 = baseNavigatorModalView$prepareStaticFocusRect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseNavigatorModalView$prepareStaticFocusRect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseNavigatorModalView$prepareStaticFocusRect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseNavigatorModalView$prepareStaticFocusRect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wb50 wb50Var2 = this.focusCoordinator;
                    tpr tprVar = this.staticFocusRectStateFlow;
                    baseNavigatorModalView$prepareStaticFocusRect$1.L$0 = wb50Var2;
                    baseNavigatorModalView$prepareStaticFocusRect$1.label = 1;
                    Object y = kotlinx.coroutines.flow.e.y(tprVar, baseNavigatorModalView$prepareStaticFocusRect$1);
                    if (y == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = y;
                    wb50Var = wb50Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wb50Var = (wb50) baseNavigatorModalView$prepareStaticFocusRect$1.L$0;
                    kotlin.b.b(obj);
                }
                wb50Var.h((Rect) obj);
                return zy11.a;
            }
        }
        baseNavigatorModalView$prepareStaticFocusRect$1 = new BaseNavigatorModalView$prepareStaticFocusRect$1(this, continuation);
        Object obj2 = baseNavigatorModalView$prepareStaticFocusRect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseNavigatorModalView$prepareStaticFocusRect$1.label;
        if (i != 0) {
        }
        wb50Var.h((Rect) obj2);
        return zy11.a;
    }

    public void showError() {
    }

    @Override // defpackage.mq00
    public void showFirstUsageHint() {
    }

    public void showFloatingComponents() {
        changeFloatingComponentsVisibility(true);
    }

    @Override // defpackage.mq00
    public void showMessage(String title, String subtitle) {
    }

    public int topRightSideButtonsOffset() {
        return getTopOffset() + getTopPadding();
    }

    @Override // defpackage.rwj
    public void updateAzimuth(float azimuth) {
    }

    @Override // defpackage.rwj
    public /* bridge */ void updateBadgeCount(int i) {
    }

    public void updateRightSideContainer() {
        ru.yandex.taxi.design.utils.c.C(getBottomSheet().getTop() - topRightSideButtonsOffset(), this.rightSideButtonsContainer.a);
    }

    @Override // defpackage.rwj
    public void updateUserLocation(mo21 userLocation) {
    }
}
