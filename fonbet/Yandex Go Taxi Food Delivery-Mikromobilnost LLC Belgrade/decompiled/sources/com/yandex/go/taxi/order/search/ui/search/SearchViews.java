package com.yandex.go.taxi.order.search.ui.search;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.taxi.order.search.ui.views.PinLocationView;
import com.yandex.go.taxi.order.search.ui.views.PointLocationView;
import com.yandex.go.taxi.order.search.ui.views.TwoPulsingCirclesView;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.dl40;
import defpackage.jl40;
import defpackage.mmp0;
import defpackage.pwf0;
import defpackage.rxp0;
import defpackage.sxp0;
import defpackage.txp0;
import defpackage.uxp0;
import defpackage.vng;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.order.search.ui.bubbles.PollingBubblesViewImpl;
import ru.yandex.taxi.order.search.ui.views.WidePulsingCirclesView;
import ru.yandex.taxi.ui.DebounceClickListener;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eJ\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0011¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\u000eJ\u0017\u00100\u001a\u00020\n2\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010G¨\u0006H"}, d2 = {"Lcom/yandex/go/taxi/order/search/ui/search/SearchViews;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ltxp0;", ClidProvider.STATE, "Lzy11;", "renderPulsar", "(Ltxp0;)V", "renderWideCirclesSearch", "()V", "renderTwoCirclesSearch", "renderEmptyPulsar", "Ljava/lang/Runnable;", "listener", "setMyLocationViewListener", "(Ljava/lang/Runnable;)V", "onAttachedToWindow", "onDetachedFromWindow", "addPollingBubblesView", "hidePollingBubblesView", "", "isSearch", "setSearchCoverVisibility", "(Z)V", "", CaretView.ALPHA_PROPERTY, "setSearchCoverAlpha", "(F)V", "Landroid/graphics/PointF;", "anchor", "setPulsingCirclesViewAnchor", "(Landroid/graphics/PointF;)V", "onMyLocationClickListener", "setOnMyLocationClickListener", "Lru/yandex/taxi/order/search/ui/bubbles/PollingBubblesViewImpl;", "pollingBubblesView", "()Lru/yandex/taxi/order/search/ui/bubbles/PollingBubblesViewImpl;", "Luxp0;", "render", "(Luxp0;)V", "hideLongSearch", "", "iconId", "setIconLocation", "(I)V", "Landroid/widget/FrameLayout$LayoutParams;", "circlesLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "Lru/yandex/taxi/order/search/ui/views/WidePulsingCirclesView;", "widePulsingCirclesView", "Lru/yandex/taxi/order/search/ui/views/WidePulsingCirclesView;", "Lcom/yandex/go/taxi/order/search/ui/views/TwoPulsingCirclesView;", "twoPulsingCirclesView", "Lcom/yandex/go/taxi/order/search/ui/views/TwoPulsingCirclesView;", "Lcom/yandex/go/taxi/order/search/ui/views/PinLocationView;", "pinLocationView", "Lcom/yandex/go/taxi/order/search/ui/views/PinLocationView;", "Lcom/yandex/go/taxi/order/search/ui/views/PointLocationView;", "pointLocationView", "Lcom/yandex/go/taxi/order/search/ui/views/PointLocationView;", "isSearching", "Z", "Lru/yandex/taxi/order/search/ui/bubbles/PollingBubblesViewImpl;", "Ldl40;", "multiClickHandler", "Ldl40;", "Ljava/lang/Runnable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchViews extends FrameLayout {
    public static final int $stable = 8;
    private final FrameLayout.LayoutParams circlesLayoutParams;
    private boolean isSearching;
    private final dl40 multiClickHandler;
    private Runnable onMyLocationClickListener;
    private final PinLocationView pinLocationView;
    private final PointLocationView pointLocationView;
    private PollingBubblesViewImpl pollingBubblesView;
    private final TwoPulsingCirclesView twoPulsingCirclesView;
    private final WidePulsingCirclesView widePulsingCirclesView;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchViews(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.circlesLayoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        int i = 2;
        WidePulsingCirclesView widePulsingCirclesView = new WidePulsingCirclesView(context, null, i, 0 == true ? 1 : 0);
        widePulsingCirclesView.setVisibility(8);
        this.widePulsingCirclesView = widePulsingCirclesView;
        TwoPulsingCirclesView twoPulsingCirclesView = new TwoPulsingCirclesView(context);
        twoPulsingCirclesView.setVisibility(8);
        this.twoPulsingCirclesView = twoPulsingCirclesView;
        PinLocationView pinLocationView = new PinLocationView(context);
        pinLocationView.setVisibility(4);
        pinLocationView.setImportantForAccessibility(2);
        this.pinLocationView = pinLocationView;
        PointLocationView pointLocationView = new PointLocationView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        pointLocationView.setVisibility(4);
        pointLocationView.setImportantForAccessibility(2);
        this.pointLocationView = pointLocationView;
        this.multiClickHandler = new dl40(0);
        this.onMyLocationClickListener = pwf0.c;
        setImportantForAccessibility(2);
        addView(pinLocationView, new FrameLayout.LayoutParams(-2, -2, 17));
        addView(pointLocationView, new FrameLayout.LayoutParams(-2, -2, 17));
        renderWideCirclesSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(SearchViews searchViews) {
        searchViews.onMyLocationClickListener.run();
    }

    private final void renderEmptyPulsar() {
        removeView(this.widePulsingCirclesView);
        removeView(this.twoPulsingCirclesView);
    }

    private final void renderPulsar(txp0 state) {
        if (!jl40.l(state, new txp0(ServiceLevel.SearchingPulsarDTO.SearchingPulsar.NONE, null, 0))) {
            hideLongSearch();
        }
        ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar = state.a;
        View view = state.b;
        int i = rxp0.a[searchingPulsar.ordinal()];
        if (i == 1) {
            renderWideCirclesSearch();
        } else if (i == 2) {
            renderTwoCirclesSearch();
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            renderEmptyPulsar();
        }
        this.pinLocationView.setPin(view, state.c);
        PinLocationView pinLocationView = this.pinLocationView;
        if (view != null) {
            pinLocationView.setVisibility(this.isSearching ? 0 : 4);
            this.pointLocationView.setVisibility(4);
        } else {
            pinLocationView.setVisibility(4);
            this.pointLocationView.setVisibility(this.isSearching ? 0 : 4);
        }
    }

    private final void renderTwoCirclesSearch() {
        if (this.twoPulsingCirclesView.getParent() == null) {
            removeView(this.widePulsingCirclesView);
            addView(this.twoPulsingCirclesView, 0, this.circlesLayoutParams);
        }
    }

    private final void renderWideCirclesSearch() {
        if (this.widePulsingCirclesView.getParent() == null) {
            removeView(this.twoPulsingCirclesView);
            addView(this.widePulsingCirclesView, 0, this.circlesLayoutParams);
        }
    }

    private final void setMyLocationViewListener(Runnable listener) {
        this.pinLocationView.setOnClickListener(new DebounceClickListener(this.multiClickHandler, listener));
    }

    public final void addPollingBubblesView() {
        PollingBubblesViewImpl pollingBubblesViewImpl = new PollingBubblesViewImpl(getContext());
        this.pollingBubblesView = pollingBubblesViewImpl;
        addView(pollingBubblesViewImpl);
    }

    public final void hideLongSearch() {
        this.pinLocationView.setVisibility(0);
        this.pointLocationView.setVisibility(0);
        setBackgroundResource(0);
    }

    public final void hidePollingBubblesView() {
        PollingBubblesViewImpl pollingBubblesViewImpl = this.pollingBubblesView;
        if (pollingBubblesViewImpl != null) {
            removeView(pollingBubblesViewImpl);
            this.pollingBubblesView = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMyLocationViewListener(new mmp0(4, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setMyLocationViewListener(pwf0.c);
        hideLongSearch();
    }

    /* renamed from: pollingBubblesView, reason: from getter */
    public final PollingBubblesViewImpl getPollingBubblesView() {
        return this.pollingBubblesView;
    }

    public final void render(uxp0 state) {
        if (state instanceof txp0) {
            renderPulsar((txp0) state);
        } else {
            if (state instanceof sxp0) {
                return;
            }
            w511.b();
        }
    }

    public final void setIconLocation(int iconId) {
        this.pointLocationView.setImageDrawable(vng.t(iconId, getContext()));
    }

    public final void setOnMyLocationClickListener(Runnable onMyLocationClickListener) {
        this.onMyLocationClickListener = onMyLocationClickListener;
    }

    public final void setPulsingCirclesViewAnchor(PointF anchor) {
        this.widePulsingCirclesView.setAnchorPoint(anchor);
        this.twoPulsingCirclesView.setAnchorPoint(anchor);
        this.pinLocationView.setAnchorPoint(anchor);
        this.pointLocationView.setAnchorPoint(anchor);
    }

    public final void setSearchCoverAlpha(float alpha) {
        this.widePulsingCirclesView.setAlpha(alpha);
        this.twoPulsingCirclesView.setAlpha(alpha);
        this.pinLocationView.setAlpha(alpha);
        this.pointLocationView.setAlpha(alpha);
    }

    public final void setSearchCoverVisibility(boolean isSearch) {
        this.widePulsingCirclesView.setVisibility(isSearch ? 0 : 8);
        this.twoPulsingCirclesView.setVisibility(isSearch ? 0 : 8);
        PinLocationView pinLocationView = this.pinLocationView;
        boolean z = true;
        pinLocationView.setVisibility(!isSearch || !pinLocationView.containsPin() ? 4 : 0);
        PointLocationView pointLocationView = this.pointLocationView;
        if (isSearch && !this.pinLocationView.containsPin()) {
            z = false;
        }
        pointLocationView.setVisibility(z ? 4 : 0);
        this.isSearching = isSearch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchViews(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SearchViews(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
