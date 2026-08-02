package com.yandex.go.scooters.tariff_fix.selection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.domain.ScootersOfferCardFocusInteractor$FocusType;
import com.yandex.go.scooters.domain.w;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionModalView;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.abb1;
import defpackage.ah00;
import defpackage.aym0;
import defpackage.byx;
import defpackage.c430;
import defpackage.c4p0;
import defpackage.cma1;
import defpackage.cwa1;
import defpackage.cyx;
import defpackage.d4p0;
import defpackage.ehn0;
import defpackage.fh00;
import defpackage.g8n0;
import defpackage.gh00;
import defpackage.gzx;
import defpackage.k1b1;
import defpackage.kdx;
import defpackage.mqg0;
import defpackage.n4p0;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.qfh0;
import defpackage.r4p0;
import defpackage.r7p0;
import defpackage.scc;
import defpackage.sls;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u8w;
import defpackage.v3n0;
import defpackage.wls;
import defpackage.wnt;
import defpackage.x4p0;
import defpackage.xnt;
import defpackage.xw31;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0095\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012&\b\u0001\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0014¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u000fH\u0014¢\u0006\u0004\b$\u0010\"J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020%2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R2\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00107R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00108R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/yandex/go/scooters/tariff_fix/selection/ScootersTariffFixSelectionModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ld4p0;", "Landroid/content/Context;", "context", "Lg8n0;", "scootersCompassRotatableFloatButtonFactory", "Lgzx;", "layersUserLocationOverlay", "Lc4p0;", "scootersTariffFixAreaOverlay", "Lx4p0;", "scootersTariffFixSelectionRouteOverlay", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lzy11;", "onAboutListener", "onSuggestListener", "Lkotlin/Function1;", "", "onErrorListener", "Lcom/yandex/go/scooters/tariff_fix/selection/b;", "scootersTariffFixPresenter", "Ln4p0;", "scootersTariffFixAnalytics", "<init>", "(Landroid/content/Context;Lg8n0;Lgzx;Lc4p0;Lx4p0;Lwls;Lsls;Ltls;Lcom/yandex/go/scooters/tariff_fix/selection/b;Ln4p0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ld4p0;", "onAttachedToWindow", "()V", "onAppearAnimationComplete", "onDetachedFromWindow", "", "isArrowsPermanentlyHidden", "()Z", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Lgzx;", "Lc4p0;", "Lx4p0;", "Lwls;", "Lsls;", "Ltls;", "Lcom/yandex/go/scooters/tariff_fix/selection/b;", "Ln4p0;", "backPressedListener", "Ljava/lang/Runnable;", "r4p0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffFixSelectionModalView extends SlideableBindingModalView<d4p0> {
    public static final int $stable = 8;
    private Runnable backPressedListener;
    private final gzx layersUserLocationOverlay;
    private final wls onAboutListener;
    private final tls onErrorListener;
    private final sls onSuggestListener;
    private final n4p0 scootersTariffFixAnalytics;
    private final c4p0 scootersTariffFixAreaOverlay;
    private final b scootersTariffFixPresenter;
    private final x4p0 scootersTariffFixSelectionRouteOverlay;

    public ScootersTariffFixSelectionModalView(Context context, g8n0 g8n0Var, gzx gzxVar, c4p0 c4p0Var, x4p0 x4p0Var, wls wlsVar, sls slsVar, tls tlsVar, b bVar, n4p0 n4p0Var) {
        super(context);
        this.layersUserLocationOverlay = gzxVar;
        this.scootersTariffFixAreaOverlay = c4p0Var;
        this.scootersTariffFixSelectionRouteOverlay = x4p0Var;
        this.onAboutListener = wlsVar;
        this.onSuggestListener = slsVar;
        this.onErrorListener = tlsVar;
        this.scootersTariffFixPresenter = bVar;
        this.scootersTariffFixAnalytics = n4p0Var;
        k1b1.b(this, g8n0Var.a(), new v3n0(24, bVar));
        getBottomSheetBehavior().a0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$handleFocus(b bVar) {
        tje.N(bVar.Jg(), null, null, new ScootersTariffFixSelectionPresenter$handleFocus$1(bVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView) {
        Runnable runnable = scootersTariffFixSelectionModalView.backPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView) {
        scootersTariffFixSelectionModalView.onSuggestListener.invoke();
        scootersTariffFixSelectionModalView.scootersTariffFixAnalytics.a(ScootersTariffFixSelectionAnalytics$CardButton.ADDRESS_SEARCH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$2(ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView) {
        scootersTariffFixSelectionModalView.onAboutListener.invoke(new ScootersTariffFixSelectionModalView$onAttachedToWindow$3$1(0, scootersTariffFixSelectionModalView.scootersTariffFixAnalytics, n4p0.class, "aboutTariffShown", "aboutTariffShown()V", 0), new ScootersTariffFixSelectionModalView$onAttachedToWindow$3$2(0, scootersTariffFixSelectionModalView.scootersTariffFixAnalytics, n4p0.class, "aboutTariffClosed", "aboutTariffClosed()V", 0));
        scootersTariffFixSelectionModalView.scootersTariffFixAnalytics.a(ScootersTariffFixSelectionAnalytics$CardButton.ABOUT_FIX);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public d4p0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_tariff_fix_modal_view, parent, false);
        int i = qfh0.about_tariff;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = qfh0.address;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = qfh0.image;
                if (((GoImageView) cma1.O(i, inflate)) != null) {
                    i = qfh0.order_btn;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        i = qfh0.subtitle;
                        if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                            i = qfh0.suggest_shimmer_1;
                            ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, inflate);
                            if (shimmeringBar != null) {
                                i = qfh0.suggest_shimmer_2;
                                ShimmeringBar shimmeringBar2 = (ShimmeringBar) cma1.O(i, inflate);
                                if (shimmeringBar2 != null) {
                                    i = qfh0.time_on_the_way;
                                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                    if (listItemComponent2 != null) {
                                        i = qfh0.title;
                                        if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                                            return new d4p0((GoConstraintLayout) inflate, robotoTextView, listItemComponent, buttonComponent, shimmeringBar, shimmeringBar2, listItemComponent2);
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
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        this.layersUserLocationOverlay.attach();
        b bVar = this.scootersTariffFixPresenter;
        cyx cyxVar = bVar.D;
        wnt wntVar = bVar.x;
        kdx kdxVar = new kdx();
        r7p0 r7p0Var = bVar.L;
        kdx kdxVar2 = new kdx();
        abb1.d(kdxVar2, "number", r7p0Var.a);
        abb1.d(kdxVar2, DRMInfoProvider.MediaDRMKeys.VENDOR, r7p0Var.b.k());
        kdxVar.b("selected_vehicle", kdxVar2.a());
        zzs zzsVar = (zzs) bVar.I.b;
        if (zzsVar != null) {
            kdxVar.b("destination", ((xnt) wntVar).a(zzsVar, zzs.Companion.serializer()));
        }
        cyxVar.b(new byx(Screen.CHOOSE_B, new c430(Mode.SCOOTERS, (kotlinx.serialization.json.b) null, new aym0(kdxVar.a(), scc.g("destination", "selected_parking", "parking_selection_mode")))));
        tje.N(bVar.Jg(), null, null, new ScootersTariffFixSelectionPresenter$listenUserGeo$1(bVar, null), 3);
        tje.N(bVar.Jg(), null, null, new ScootersTariffFixSelectionPresenter$listenUserGeo$2(bVar, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        qdb1.b(this, new Runnable(this) { // from class: p4p0
            public final /* synthetic */ ScootersTariffFixSelectionModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.b;
                switch (i2) {
                    case 0:
                        ScootersTariffFixSelectionModalView.onAttachedToWindow$lambda$0(scootersTariffFixSelectionModalView);
                        break;
                    default:
                        ScootersTariffFixSelectionModalView.onAttachedToWindow$lambda$1(scootersTariffFixSelectionModalView);
                        break;
                }
            }
        });
        b bVar = this.scootersTariffFixPresenter;
        bVar.Bg(new r4p0(this));
        w wVar = bVar.E;
        wVar.d.a(ScootersOfferCardFocusInteractor$FocusType.FOCUS_ON_USER);
        zzs zzsVar = (zzs) bVar.I.b;
        ah00 ah00Var = bVar.y;
        float f = 15.0f;
        if (zzsVar == null) {
            gh00 gh00Var = (gh00) ah00Var;
            gh00Var.H(new CameraPosition(gh00Var.e.c.getTarget(), 15.0f, ((gh00) bVar.y).e.c.getAzimuth(), ((gh00) bVar.y).e.c.getTilt()));
            bVar.Lg(((gh00) bVar.y).e.b(), ScootersTariffFixSelectionPresenter$AddressType.USER_POSITION);
        } else {
            Point d = cwa1.d(zzsVar);
            gh00 gh00Var2 = (gh00) ah00Var;
            gh00Var2.getClass();
            gh00Var2.q(new fh00(gh00Var2, d, f));
            bVar.Lg(((gh00) bVar.y).e.b(), ScootersTariffFixSelectionPresenter$AddressType.USER_DESTINATION);
        }
        tje.N(bVar.Jg(), null, null, new ScootersTariffFixSelectionPresenter$attachView$1(bVar, null), 3);
        tje.N(bVar.Jg(), null, null, new ScootersTariffFixSelectionPresenter$showRoute$1(bVar, null), 3);
        tje.N(bVar.Jg(), null, null, new ScootersTariffFixSelectionPresenter$showRoute$2(bVar, null), 3);
        final int i2 = 1;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: p4p0
            public final /* synthetic */ ScootersTariffFixSelectionModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.b;
                switch (i22) {
                    case 0:
                        ScootersTariffFixSelectionModalView.onAttachedToWindow$lambda$0(scootersTariffFixSelectionModalView);
                        break;
                    default:
                        ScootersTariffFixSelectionModalView.onAttachedToWindow$lambda$1(scootersTariffFixSelectionModalView);
                        break;
                }
            }
        });
        c.z(new ehn0(27, this), getBinding().b);
        n4p0 n4p0Var = this.scootersTariffFixAnalytics;
        u8w u8wVar = n4p0Var.b;
        String reason = n4p0Var.c.getReason();
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", reason);
        u8wVar.a.a("ScootersParkingSelectionCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersTariffFixPresenter.Cg();
        this.layersUserLocationOverlay.detach();
        this.scootersTariffFixAreaOverlay.Hg();
        ((j) this.scootersTariffFixAnalytics.a).d("ScootersParkingSelectionCard.Closed").m();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.backPressedListener = onBackPressedListener;
    }
}
