package com.yandex.go.scooters.preselection.loading.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.api.data.model.SelectedParking;
import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomLoadingComponent;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardOptionsListComponent;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2i0;
import defpackage.abb1;
import defpackage.ahn;
import defpackage.ajl0;
import defpackage.amo0;
import defpackage.aym0;
import defpackage.byx;
import defpackage.c430;
import defpackage.cma1;
import defpackage.cyx;
import defpackage.e230;
import defpackage.g8n0;
import defpackage.iin0;
import defpackage.k1b1;
import defpackage.kdx;
import defpackage.mqg0;
import defpackage.msg0;
import defpackage.ny61;
import defpackage.o5o0;
import defpackage.p3w;
import defpackage.qdb1;
import defpackage.qfh0;
import defpackage.r7p0;
import defpackage.slo0;
import defpackage.sls;
import defpackage.srh0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tlo0;
import defpackage.tls;
import defpackage.un0;
import defpackage.usg0;
import defpackage.v3n0;
import defpackage.vgn;
import defpackage.vlo0;
import defpackage.w130;
import defpackage.wlo0;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.xw31;
import defpackage.ylo0;
import defpackage.zlo0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.scooters.data.ScootersParkingSelectionMode;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018BE\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010+R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010.R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00100R\u0016\u00101\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/go/scooters/preselection/loading/v2/ScootersPreselectionLoadingV2ModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lamo0;", "Landroid/content/Context;", "context", "Lg8n0;", "scootersCompassRotatableFloatButtonFactory", "Lkotlin/Function1;", "", "Lzy11;", "onErrorHappenedListener", "Lylo0;", "scootersPreselectionLoadingPresenter", "", "withoutUi", "<init>", "(Landroid/content/Context;Lg8n0;Ltls;Lylo0;Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lamo0;", "Le230;", "insetsType", "()Le230;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Ltls;", "Lylo0;", "Z", "Lkotlin/Function0;", "Lsls;", "dismissedByBackPress", "Lcom/yandex/go/scooters/offers/v2/components/bottom/ScootersCardBottomLoadingComponent;", "scootersCardBottomLoadingComponent", "Lcom/yandex/go/scooters/offers/v2/components/bottom/ScootersCardBottomLoadingComponent;", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardOptionsListComponent;", "optionsListComponent", "Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardOptionsListComponent;", "zlo0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPreselectionLoadingV2ModalView extends SlideableBindingModalView<amo0> {
    public static final int $stable = 8;
    private boolean dismissedByBackPress;
    private sls onBackPressedListener;
    private final tls onErrorHappenedListener;
    private final ScootersCardOptionsListComponent optionsListComponent;
    private final ScootersCardBottomLoadingComponent scootersCardBottomLoadingComponent;
    private final ylo0 scootersPreselectionLoadingPresenter;
    private final boolean withoutUi;

    public ScootersPreselectionLoadingV2ModalView(Context context, g8n0 g8n0Var, tls tlsVar, ylo0 ylo0Var, boolean z) {
        super(context);
        this.onErrorHappenedListener = tlsVar;
        this.scootersPreselectionLoadingPresenter = ylo0Var;
        this.withoutUi = z;
        ScootersCardBottomLoadingComponent scootersCardBottomLoadingComponent = new ScootersCardBottomLoadingComponent(context);
        this.scootersCardBottomLoadingComponent = scootersCardBottomLoadingComponent;
        ScootersCardOptionsListComponent scootersCardOptionsListComponent = new ScootersCardOptionsListComponent(context, null);
        this.optionsListComponent = scootersCardOptionsListComponent;
        setVisibility(z ? 8 : 0);
        getBottomSheetBehavior().a0 = false;
        View content = getContent();
        CoordinatorLayout coordinatorLayout = content instanceof CoordinatorLayout ? (CoordinatorLayout) content : null;
        if (coordinatorLayout != null) {
            CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            coordinatorLayout.addView(scootersCardBottomLoadingComponent, layoutParams);
        }
        GoLinearLayout goLinearLayout = getBinding().b;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, tje.r(usg0.round_section_divider_height, goLinearLayout.getContext()));
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet = null;
        int i = 0;
        ScootersCardHeaderComponent scootersCardHeaderComponent = new ScootersCardHeaderComponent(context, attributeSet, i, 0, 14, defaultConstructorMarker);
        goLinearLayout.addView(scootersCardHeaderComponent, layoutParams2);
        scootersCardHeaderComponent.loading();
        int r = tje.r(msg0.scooters_card_tariffs_min_height, goLinearLayout.getContext());
        ShimmeringBar shimmeringBar = new ShimmeringBar(context, attributeSet, i, a2i0.StandartShimmeringBarStyle, 6, defaultConstructorMarker);
        shimmeringBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, r));
        goLinearLayout.addView(shimmeringBar);
        goLinearLayout.addView(scootersCardOptionsListComponent, layoutParams2);
        scootersCardOptionsListComponent.loading(false);
        qdb1.b(this, new v3n0(19, this));
        k1b1.b(this, g8n0Var.a(), new v3n0(20, ylo0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$geoTapped(ylo0 ylo0Var) {
        tje.N(ylo0Var.Jg(), null, null, new ScootersPreselectionLoadingPresenter$geoTapped$1(ylo0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ScootersPreselectionLoadingV2ModalView scootersPreselectionLoadingV2ModalView) {
        sls slsVar = scootersPreselectionLoadingV2ModalView.onBackPressedListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersPreselectionLoadingV2ModalView scootersPreselectionLoadingV2ModalView, t1w t1wVar) {
        boolean z = t1wVar.f;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        scootersPreselectionLoadingV2ModalView.setTopSystemWindowInset(t1wVar.b);
        ScootersCardBottomLoadingComponent scootersCardBottomLoadingComponent = scootersPreselectionLoadingV2ModalView.scootersCardBottomLoadingComponent;
        scootersCardBottomLoadingComponent.setPadding(scootersCardBottomLoadingComponent.getPaddingLeft(), scootersCardBottomLoadingComponent.getPaddingTop(), scootersCardBottomLoadingComponent.getPaddingRight(), t1wVar.g);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBackPressedListener$lambda$0(ScootersPreselectionLoadingV2ModalView scootersPreselectionLoadingV2ModalView, Runnable runnable) {
        scootersPreselectionLoadingV2ModalView.dismissedByBackPress = true;
        runnable.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        if (this.dismissedByBackPress) {
            super.animateDismiss(startAction, endAction);
        } else {
            startAction.run();
            endAction.run();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public amo0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_preselection_loading_v2_modal_view, parent, false);
        parent.addView(inflate);
        int i = qfh0.container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            return new amo0(goLinearLayout, (GoFrameLayout) inflate);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new iin0(19, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00df, code lost:
    
        if (r7 == null) goto L31;
     */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        un0 aym0Var;
        b bVar;
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        ylo0 ylo0Var = this.scootersPreselectionLoadingPresenter;
        zlo0 zlo0Var = new zlo0(this);
        ylo0Var.Bg(zlo0Var);
        tje.N(ylo0Var.Jg(), null, null, new ScootersPreselectionLoadingPresenter$attachView$1(ylo0Var, zlo0Var, null), 3);
        vgn vgnVar = ylo0Var.C.a;
        ahn ahnVar = vgnVar != null ? vgnVar.b : null;
        if (ahnVar != null) {
            tje.N(ylo0Var.Jg(), null, null, new ScootersPreselectionLoadingPresenter$attachView$2(ahnVar, ylo0Var, null), 3);
            return;
        }
        tje.N(ylo0Var.Jg(), null, null, new ScootersPreselectionLoadingPresenter$attachView$3(ylo0Var, zlo0Var, null), 3);
        o5o0 o5o0Var = ylo0Var.z;
        wlo0 wlo0Var = ylo0Var.E;
        o5o0Var.getClass();
        Pair pair = wlo0Var instanceof tlo0 ? new Pair(((tlo0) wlo0Var).b, null) : wlo0Var instanceof slo0 ? new Pair(null, null) : wlo0Var instanceof vlo0 ? new Pair(((vlo0) wlo0Var).b, null) : new Pair(null, null);
        zzs zzsVar = (zzs) pair.getFirst();
        SelectedParking selectedParking = (SelectedParking) pair.getSecond();
        cyx cyxVar = o5o0Var.b;
        r7p0 number = wlo0Var.getNumber();
        wnt wntVar = o5o0Var.a;
        if (selectedParking == null && zzsVar == null) {
            kdx kdxVar = new kdx();
            o5o0.a(kdxVar, number);
            aym0Var = new p3w("scooters", kdxVar.a());
        } else {
            kdx kdxVar2 = new kdx();
            o5o0.a(kdxVar2, number);
            if (selectedParking != null) {
                kdxVar2.b("selected_parking", ((xnt) wntVar).a(selectedParking, SelectedParking.Companion.serializer()));
                abb1.d(kdxVar2, "parking_selection_mode", ScootersParkingSelectionMode.PRESELECTED.getModeName());
            }
            if (selectedParking == null) {
                if (zzsVar != null) {
                    bVar = ((xnt) wntVar).a(zzsVar, zzs.Companion.serializer());
                }
                bVar = JsonNull.INSTANCE;
                kdxVar2.b("destination", bVar);
            }
            aym0Var = new aym0(kdxVar2.a(), Collections.singletonList("selected_vehicle"));
        }
        cyxVar.b(new byx(Screen.DISCOVERY, new c430(Mode.SCOOTERS, (b) null, aym0Var), byx.d));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersPreselectionLoadingPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.withoutUi && xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        ajl0 ajl0Var = new ajl0(28, this, onBackPressedListener);
        super.setOnBackPressedListener(ajl0Var);
        this.onBackPressedListener = new ScootersPreselectionLoadingV2ModalView$setOnBackPressedListener$1(0, ajl0Var, Runnable.class, "run", "run()V", 0);
    }
}
