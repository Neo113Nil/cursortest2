package com.yandex.go.taxi.order.ui.recenter;

import android.content.Context;
import defpackage.a7y0;
import defpackage.b7y0;
import defpackage.c7y0;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.kux0;
import defpackage.kyh0;
import defpackage.l1t;
import defpackage.m1t;
import defpackage.oji;
import defpackage.xbi0;
import defpackage.z6y0;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.map.overlay.RecenterType;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002\u0014%B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0018\u0010\u0015\u001a\u00060\u0014R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR+\u0010 \u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/yandex/go/taxi/order/ui/recenter/TaxiOrderTrackingRecenterButton;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "Lc7y0;", "presenter", "Ll1t;", "geoSharingRouter", "<init>", "(Landroid/content/Context;Lc7y0;Ll1t;)V", "Lzy11;", "updateVisibility", "()V", "", "translateFloatButton", "()F", "onAttachedToWindow", "onDetachedFromWindow", "Lc7y0;", "Ll1t;", "La7y0;", "mvpView", "La7y0;", "", "isVisible", "Z", "Lru/yandex/taxi/map/overlay/RecenterType;", "nextRecenterType", "Lru/yandex/taxi/map/overlay/RecenterType;", "<set-?>", "isAutoRecenter$delegate", "Lxbi0;", "isAutoRecenter", "()Z", "setAutoRecenter", "(Z)V", "Companion", "z6y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingRecenterButton extends FloatButtonIconComponent {
    public static final float SLIDE_INACCURACY = 0.01f;
    private final l1t geoSharingRouter;

    /* renamed from: isAutoRecenter$delegate, reason: from kotlin metadata */
    private final xbi0 isAutoRecenter;
    private boolean isVisible;
    private final a7y0 mvpView;
    private RecenterType nextRecenterType;
    private final c7y0 presenter;
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("isAutoRecenter", 0, "isAutoRecenter()Z", TaxiOrderTrackingRecenterButton.class)};
    public static final z6y0 Companion = new z6y0();
    public static final int $stable = 8;

    public TaxiOrderTrackingRecenterButton(Context context, c7y0 c7y0Var, l1t l1tVar) {
        super(context, null, 0, 0, 14, null);
        this.presenter = c7y0Var;
        this.geoSharingRouter = l1tVar;
        this.mvpView = new a7y0(this);
        this.isVisible = true;
        this.nextRecenterType = RecenterType.ALL_ROUTE;
        this.isAutoRecenter = new oji(this);
        setVisibility(8);
        setContentDescription(context.getString(kyh0.order_details_with_feed_recenter_button_content_description_title));
        setDebounceClickListener(new kux0(5, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TaxiOrderTrackingRecenterButton taxiOrderTrackingRecenterButton) {
        ((m1t) taxiOrderTrackingRecenterButton.geoSharingRouter).a().setNextRecenterType(taxiOrderTrackingRecenterButton.nextRecenterType);
    }

    private final boolean isAutoRecenter() {
        return ((Boolean) this.isAutoRecenter.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutoRecenter(boolean z) {
        this.isAutoRecenter.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVisibility() {
        boolean isAutoRecenter = isAutoRecenter();
        setImportantForAccessibility(!isAutoRecenter ? 1 : 2);
        if (!isAutoRecenter && !this.isVisible) {
            this.isVisible = true;
            cma1.J(this);
        } else if (isAutoRecenter && this.isVisible) {
            this.isVisible = false;
            cma1.L(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c7y0 c7y0Var = this.presenter;
        a7y0 a7y0Var = this.mvpView;
        c7y0Var.Bg(a7y0Var);
        int i = 3;
        e.H(c7y0Var.Jg(), new jqr(c7y0Var.x.a, new TaxiOrderTrackingRecenterPresenter$attachView$1(2, a7y0Var, b7y0.class, "onAutoRecenterUpdated", "onAutoRecenterUpdated(Z)V", 4), i));
        e.H(c7y0Var.Jg(), new jqr(e.t(e.c(c7y0Var.y.a)), new TaxiOrderTrackingRecenterPresenter$attachView$2(2, a7y0Var, b7y0.class, "setNextRecenterType", "setNextRecenterType(Lru/yandex/taxi/map/overlay/RecenterType;)V", 4), i));
        setIcon(f1h0.ic_all_route);
    }

    @Override // ru.yandex.taxi.design.FloatButtonIconComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.design.FloatButtonIconComponent
    public float translateFloatButton() {
        return 0.0f;
    }
}
