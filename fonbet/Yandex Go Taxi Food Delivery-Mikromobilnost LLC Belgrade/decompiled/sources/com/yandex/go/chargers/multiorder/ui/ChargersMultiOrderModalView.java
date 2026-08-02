package com.yandex.go.chargers.multiorder.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveMultiOrderCardButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveMultiOrderCardModeId;
import com.yandex.go.chargers.design.components.ChargersGeoButtonIconComponent;
import com.yandex.go.chargers.design.components.ChargersOrderTabsView;
import com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.b64;
import defpackage.c29;
import defpackage.em9;
import defpackage.fhb1;
import defpackage.h5a;
import defpackage.i5a;
import defpackage.j4a;
import defpackage.jl40;
import defpackage.m4a;
import defpackage.mqg0;
import defpackage.o4a;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.r4a;
import defpackage.rl9;
import defpackage.s3a;
import defpackage.tje;
import defpackage.u5a;
import defpackage.u90;
import defpackage.uda;
import defpackage.uqs;
import defpackage.w5a;
import defpackage.xw31;
import defpackage.xx9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u000f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0014¢\u0006\u0004\b-\u0010\u0011J\u000f\u0010.\u001a\u00020\u000fH\u0014¢\u0006\u0004\b.\u0010\u0011J\u000f\u0010/\u001a\u00020\u000fH\u0014¢\u0006\u0004\b/\u0010\u0011J\u000f\u00100\u001a\u00020\u000fH\u0014¢\u0006\u0004\b0\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/yandex/go/chargers/multiorder/ui/ChargersMultiOrderModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lw5a;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "La3v;", "focusCoordinator", "Lxx9;", "chargersEnvironmentRepository", "Lr4a;", "presenter", "<init>", "(Landroid/content/Context;Lpav;La3v;Lxx9;Lr4a;)V", "Lzy11;", "setFocusCoordinatorMargins", "()V", "Luda;", "mode", "onTabChanged", "(Luda;)V", "Lu5a;", "tabsConfig", "setupTabs", "(Lu5a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw5a;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "onAttachedToWindow", "onArrowClick", "onDetachedFromWindow", "onBackPressed", "Lpav;", "La3v;", "Lxx9;", "Lr4a;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent;", "locationButton", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent;", "Ls3a;", "adapter", "Ls3a;", "focusRectTopAdditionalMargin", CA20Status.STATUS_USER_I, "focusRectBottomAdditionalMargin", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/yandex/go/chargers/design/components/ChargersOrderTabsView;", "tabsView", "Lcom/yandex/go/chargers/design/components/ChargersOrderTabsView;", "m4a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersMultiOrderModalView extends SlideableBindingModalView<w5a> {
    private final s3a adapter;
    private final FloatButtonIconComponent backButton;
    private final xx9 chargersEnvironmentRepository;
    private final a3v focusCoordinator;
    private final int focusRectBottomAdditionalMargin;
    private final int focusRectTopAdditionalMargin;
    private final pav imageLoader;
    private final ChargersGeoButtonIconComponent locationButton;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final r4a presenter;
    private ChargersOrderTabsView tabsView;

    public ChargersMultiOrderModalView(Context context, pav pavVar, a3v a3vVar, xx9 xx9Var, final r4a r4aVar) {
        super(context);
        this.imageLoader = pavVar;
        this.focusCoordinator = a3vVar;
        this.chargersEnvironmentRepository = xx9Var;
        this.presenter = r4aVar;
        final int i = 0;
        BackButtonIconComponent b = qdb1.b(this, new Runnable() { // from class: l4a
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                r4a r4aVar2 = r4aVar;
                switch (i2) {
                    case 0:
                        ChargersMultiOrderModalView.backButton$backClicked(r4aVar2);
                        break;
                    default:
                        ChargersMultiOrderModalView.locationButton$locationClicked(r4aVar2);
                        break;
                }
            }
        });
        xx9Var.a.getClass();
        b.setVisibility(0);
        this.backButton = b;
        final int i2 = 1;
        this.locationButton = fhb1.a(this, new Runnable() { // from class: l4a
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                r4a r4aVar2 = r4aVar;
                switch (i22) {
                    case 0:
                        ChargersMultiOrderModalView.backButton$backClicked(r4aVar2);
                        break;
                    default:
                        ChargersMultiOrderModalView.locationButton$locationClicked(r4aVar2);
                        break;
                }
            }
        });
        s3a s3aVar = new s3a(pavVar, new ChargersMultiOrderModalView$adapter$1(1, r4aVar, r4a.class, "orderClicked", "orderClicked(Lcom/yandex/go/chargers/multiorder/ui/ChargersMultiOrderUiState$MultiOrderTabsConfig$MultiOrderItemUiState;)V", 0));
        this.adapter = s3aVar;
        this.focusRectTopAdditionalMargin = tje.u(68, getContext());
        this.focusRectBottomAdditionalMargin = tje.u(64, getContext());
        this.onLayoutChangeListener = new u90(15, this);
        ChargersOrderTabsView chargersOrderTabsView = new ChargersOrderTabsView(context, null, 0, 6, null);
        chargersOrderTabsView.setOnTabSelectedListener(new c29(8, this));
        SlideableModalView.addViewAboveCard$default(this, chargersOrderTabsView, 1, 0, 4, null);
        OneShotPreDrawListener.add(chargersOrderTabsView, new uqs(chargersOrderTabsView, chargersOrderTabsView, this));
        chargersOrderTabsView.setVisibility(4);
        this.tabsView = chargersOrderTabsView;
        w5a binding = getBinding();
        binding.b.setOutline(0, null);
        binding.d.setAdapter(s3aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$backClicked(r4a r4aVar) {
        ((j4a) r4aVar.C.b).r(new qu(9));
        r4aVar.x.a(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.Back, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void locationButton$locationClicked(r4a r4aVar) {
        tje.N(r4aVar.Jg(), null, null, new ChargersMultiOrderPresenter$locationClicked$1(r4aVar, null), 3);
        r4aVar.x.a(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.Geo, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabChanged(uda mode) {
        r4a r4aVar = this.presenter;
        em9 em9Var = r4aVar.x;
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName = ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.Switcher;
        String str = mode.a;
        em9Var.a(chargersAnalytics$ChargersActiveMultiOrderCardButtonName, jl40.l(str, "take_another") ? ChargersAnalytics$ChargersActiveMultiOrderCardModeId.TakeAnother : jl40.l(str, "finish_rental") ? ChargersAnalytics$ChargersActiveMultiOrderCardModeId.FinishRental : null);
        r4aVar.y.e.a.l(mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFocusCoordinatorMargins() {
        this.focusCoordinator.Lc(ChargersMultiOrderModalView.class, new Rect(0, this.focusRectTopAdditionalMargin, 0, getBinding().a.getHeight() + this.focusRectBottomAdditionalMargin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupTabs(u5a tabsConfig) {
        if (tabsConfig != null) {
            ArrayList arrayList = tabsConfig.a;
            if (!arrayList.isEmpty()) {
                ChargersOrderTabsView chargersOrderTabsView = this.tabsView;
                chargersOrderTabsView.setTabs(arrayList, tabsConfig.b);
                chargersOrderTabsView.setVisibility(0);
                return;
            }
        }
        this.tabsView.setVisibility(4);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef A[LOOP:1: B:13:0x00ed->B:14:0x00ef, LOOP_END] */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        uda udaVar;
        Object obj;
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        this.focusCoordinator.b8(this);
        getBinding().a.addOnLayoutChangeListener(this.onLayoutChangeListener);
        r4a r4aVar = this.presenter;
        r4aVar.Bg(new m4a(this));
        em9 em9Var = r4aVar.x;
        ArrayList arrayList = r4aVar.B;
        int size = arrayList.size();
        HashMap w = b64.w(em9Var);
        w.put("count", Integer.valueOf(size));
        w.put("order_id_list", arrayList);
        em9Var.a.a("Chargers.ActiveMultiOrderCard.Shown", w, 1, new HashMap());
        f fVar = r4aVar.y;
        i5a i5aVar = ((rl9) kotlinx.coroutines.flow.e.d(fVar.d.d).a.getValue()).b;
        if (i5aVar != null) {
            Iterator it = i5aVar.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((h5a) obj).a, i5aVar.d)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            h5a h5aVar = (h5a) obj;
            if (h5aVar != null) {
                udaVar = new uda(h5aVar.a, h5aVar.b, h5aVar.c);
                fVar.e.a.l(udaVar);
                tje.N(r4aVar.Jg(), null, null, new ChargersMultiOrderPresenter$listenToChargersModeState$$inlined$collectIn$1(fVar.f, null, r4aVar), 3);
                tje.N(r4aVar.Jg(), null, null, new ChargersMultiOrderPresenter$listenToUiState$$inlined$collectIn$1(fVar.a(), null, (o4a) r4aVar.Dg()), 3);
                tje.N(r4aVar.Jg(), null, null, new ChargersMultiOrderPresenter$observeLayersConditionChange$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new n(new c(fVar.a()), new ChargersMultiOrderPresenter$observeLayersConditionChange$2(2, null))), null, r4aVar), 3);
                ArrayList arrayList2 = new ArrayList(8);
                for (int i = 0; i < 8; i++) {
                    arrayList2.add(Float.valueOf(100.0f));
                }
                getBinding().c.setBackground(new ShapeDrawable(new RoundRectShape(kotlin.collections.a.G0(arrayList2), null, null)));
            }
        }
        udaVar = null;
        fVar.e.a.l(udaVar);
        tje.N(r4aVar.Jg(), null, null, new ChargersMultiOrderPresenter$listenToChargersModeState$$inlined$collectIn$1(fVar.f, null, r4aVar), 3);
        tje.N(r4aVar.Jg(), null, null, new ChargersMultiOrderPresenter$listenToUiState$$inlined$collectIn$1(fVar.a(), null, (o4a) r4aVar.Dg()), 3);
        tje.N(r4aVar.Jg(), null, null, new ChargersMultiOrderPresenter$observeLayersConditionChange$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new n(new c(fVar.a()), new ChargersMultiOrderPresenter$observeLayersConditionChange$2(2, null))), null, r4aVar), 3);
        ArrayList arrayList22 = new ArrayList(8);
        while (i < 8) {
        }
        getBinding().c.setBackground(new ShapeDrawable(new RoundRectShape(kotlin.collections.a.G0(arrayList22), null, null)));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.x.a(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.Back, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        this.focusCoordinator.t4(ChargersMultiOrderModalView.class);
        this.focusCoordinator.a0(this);
        getBinding().a.removeOnLayoutChangeListener(this.onLayoutChangeListener);
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getBinding().a, event) || xw31.o(getRootView(), this.backButton, event) || xw31.o(getRootView(), this.locationButton, event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        super.setInitialBehaviorState(bottomSheetBehavior);
        bottomSheetBehavior.a0 = false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public w5a bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return w5a.o(inflater, parent);
    }
}
