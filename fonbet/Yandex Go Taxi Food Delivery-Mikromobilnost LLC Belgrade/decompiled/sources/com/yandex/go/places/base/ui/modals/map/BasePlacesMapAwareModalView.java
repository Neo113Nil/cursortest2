package com.yandex.go.places.base.ui.modals.map;

import android.content.Context;
import android.view.View;
import com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView;
import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.c2x0;
import defpackage.d75;
import defpackage.dzg0;
import defpackage.e75;
import defpackage.fz20;
import defpackage.g75;
import defpackage.i3y;
import defpackage.mrg0;
import defpackage.mw2;
import defpackage.mzh0;
import defpackage.n5;
import defpackage.p3v;
import defpackage.sls;
import defpackage.tje;
import defpackage.wac0;
import defpackage.xr00;
import defpackage.xtg0;
import defpackage.xw31;
import defpackage.yac0;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0010\b\u0001\u0010\u0006*\u00020\u0003*\u00020\u0004*\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u00020\bB5\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104¨\u00065"}, d2 = {"Lcom/yandex/go/places/base/ui/modals/map/BasePlacesMapAwareModalView;", "Lzo31;", "T", "Le75;", "Ld75;", "Lg75;", CA20Status.STATUS_CERTIFICATE_V, "Lcom/yandex/go/places/base/ui/modals/lifecycle/BasePlacesLifecycleAwareModalView;", "Lp3v;", "Landroid/content/Context;", "context", "Lfz20;", "modalMode", "Lyac0;", "mapConfig", "Lc2x0;", "systemBarsCoordinator", "Lcom/yandex/go/places/base/ui/modals/map/c;", "presenter", "<init>", "(Landroid/content/Context;Lfz20;Lyac0;Lc2x0;Lcom/yandex/go/places/base/ui/modals/map/c;)V", "Lkotlin/Function0;", "Lzy11;", "onClick", "attachBackButton", "(Lsls;)V", "onAttachedToWindow", "()V", "listener", "setAppearAnimationCompleteListener", "Lcom/yandex/go/places/base/ui/modals/map/c;", "getPresenter", "()Lcom/yandex/go/places/base/ui/modals/map/c;", "Lcom/yandex/go/places/common/ui/ControlButtonView;", "backButton$delegate", "Li3y;", "getBackButton", "()Lcom/yandex/go/places/common/ui/ControlButtonView;", "backButton", "Lcom/yandex/go/places/base/ui/views/MapButtonsView;", "rightSideButtonsContainer$delegate", "getRightSideButtonsContainer", "()Lcom/yandex/go/places/base/ui/views/MapButtonsView;", "rightSideButtonsContainer", "Lwac0;", "currentScreenMapConfig", "Lwac0;", "getCurrentScreenMapConfig", "()Lwac0;", "", "isMapEnabled", "Z", "()Z", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BasePlacesMapAwareModalView<T extends zo31, V extends e75 & d75 & g75> extends BasePlacesLifecycleAwareModalView<T, V> implements p3v {

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    private final i3y backButton;
    private final wac0 currentScreenMapConfig;
    private final boolean isMapEnabled;
    private final c presenter;

    /* renamed from: rightSideButtonsContainer$delegate, reason: from kotlin metadata */
    private final i3y rightSideButtonsContainer;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (getCurrentScreenMapConfig() != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasePlacesMapAwareModalView(Context context, fz20 fz20Var, yac0 yac0Var, c2x0 c2x0Var, c cVar) {
        super(context, fz20Var, c2x0Var, cVar);
        boolean z;
        this.presenter = cVar;
        n5 n5Var = new n5(context, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.backButton = kotlin.a.b(lazyThreadSafetyMode, n5Var);
        this.rightSideButtonsContainer = kotlin.a.b(lazyThreadSafetyMode, new mw2(19, this, context));
        this.currentScreenMapConfig = yac0Var.a(getMapScreenId());
        xr00 mapSettings$base = getMapSettings$base();
        if (mapSettings$base != null) {
            z = true;
            if (mapSettings$base.a) {
            }
        }
        z = false;
        this.isMapEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ControlButtonView backButton_delegate$lambda$0(Context context) {
        ControlButtonView controlButtonView = new ControlButtonView(context, null, 0, 6, null);
        controlButtonView.setImageResource(dzg0.ic_arrow_left);
        controlButtonView.setMirrorForRtl();
        controlButtonView.setContentDescription(context.getString(mzh0.common_back));
        return controlButtonView;
    }

    private final ControlButtonView getBackButton() {
        return (ControlButtonView) this.backButton.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapButtonsView rightSideButtonsContainer_delegate$lambda$0(BasePlacesMapAwareModalView basePlacesMapAwareModalView, Context context) {
        return new MapButtonsView(context, new BasePlacesMapAwareModalView$rightSideButtonsContainer$2$1(0, basePlacesMapAwareModalView.getPresenter(), c.class, "onZoomInButtonClicked", "onZoomInButtonClicked()V", 0), new BasePlacesMapAwareModalView$rightSideButtonsContainer$2$2(0, basePlacesMapAwareModalView.getPresenter(), c.class, "onZoomOutButtonClicked", "onZoomOutButtonClicked()V", 0), new BasePlacesMapAwareModalView$rightSideButtonsContainer$2$4(0, basePlacesMapAwareModalView.getPresenter(), c.class, "onLocationFocusingButtonClicked", "onLocationFocusingButtonClicked()V", 0), new BasePlacesMapAwareModalView$rightSideButtonsContainer$2$3(0, basePlacesMapAwareModalView.getPresenter(), c.class, "onCompassButtonClicked", "onCompassButtonClicked()V", 0), basePlacesMapAwareModalView.getPresenter().y.b());
    }

    public final void attachBackButton(sls onClick) {
        int r = tje.r(xtg0.discovery_map_controls_edge_margin, getContext());
        int r2 = tje.r(mrg0.go_design_s_space, getContext());
        ControlButtonView backButton = getBackButton();
        backButton.setOnControlButtonClicked(onClick);
        SlideableModalView.addViewAboveCard$default(this, backButton, 8388611, 0, 4, null);
        xw31.E(backButton, Integer.valueOf(r), 0, 0, Integer.valueOf(r2));
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public wac0 getCurrentScreenMapConfig() {
        return this.currentScreenMapConfig;
    }

    @Override // defpackage.n3v
    public View getDelayedGoneLayoutReadyView() {
        return this;
    }

    @Override // defpackage.p3v
    public abstract /* synthetic */ PlacesMapConfig$PlacesMapScreenName getMapScreenId();

    public final MapButtonsView getRightSideButtonsContainer() {
        return (MapButtonsView) this.rightSideButtonsContainer.getValue();
    }

    @Override // defpackage.p3v
    /* renamed from: isMapEnabled, reason: from getter */
    public boolean getIsMapEnabled() {
        return this.isMapEnabled;
    }

    @Override // defpackage.n3v
    public /* bridge */ boolean isReadyForDelayedGone() {
        return super.isReadyForDelayedGone();
    }

    @Override // com.yandex.go.places.base.ui.modals.lifecycle.BasePlacesLifecycleAwareModalView, com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        BasePlacesMapAwareModalView<T, V> basePlacesMapAwareModalView;
        xr00 mapSettings$base = getMapSettings$base();
        boolean z = false;
        boolean z2 = mapSettings$base != null && mapSettings$base.b;
        xr00 mapSettings$base2 = getMapSettings$base();
        if (mapSettings$base2 != null && mapSettings$base2.c) {
            z = true;
        }
        if (z2 || z) {
            getRightSideButtonsContainer().updateLocationFocusingButtonVisibility(z2);
            getRightSideButtonsContainer().updateZoomButtonsVisibility(z);
            basePlacesMapAwareModalView = this;
            SlideableModalView.addViewAboveCard$default(basePlacesMapAwareModalView, getRightSideButtonsContainer(), 8388613, 0, 4, null);
        } else {
            basePlacesMapAwareModalView = this;
        }
        super.onAttachedToWindow();
    }

    public void setAppearAnimationCompleteListener(sls listener) {
        setOneShotAppearAnimationCompleteListener(listener);
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public c getPresenter() {
        return this.presenter;
    }
}
