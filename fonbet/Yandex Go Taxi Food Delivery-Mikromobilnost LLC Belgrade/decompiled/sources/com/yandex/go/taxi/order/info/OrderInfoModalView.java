package com.yandex.go.taxi.order.info;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.order.info.OrderInfoContentView;
import com.yandex.go.taxi.order.info.OrderInfoModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.FreightageContract;
import defpackage.c230;
import defpackage.ec3;
import defpackage.g18;
import defpackage.k4o;
import defpackage.kyh0;
import defpackage.o2y0;
import defpackage.op70;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.uh60;
import defpackage.w511;
import defpackage.xdf;
import defpackage.zkh0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00103R\u0014\u00107\u001a\u0002048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/yandex/go/taxi/order/info/OrderInfoModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lnwy0;", "Landroid/content/Context;", "context", "Lo2y0;", "orderHolder", "Lcom/yandex/go/taxi/order/info/OrderInfoContentView;", "orderInfo", "Lxdf;", "currencyFormatter", "<init>", "(Landroid/content/Context;Lo2y0;Lcom/yandex/go/taxi/order/info/OrderInfoContentView;Lxdf;)V", "Lzy11;", "showOrderInfo", "()V", "showFreightageView", "Landroid/view/View;", "view", "showInnerView", "(Landroid/view/View;)V", "Lcom/yandex/go/taxi/order/info/OrderInfoModalView$State;", ClidProvider.STATE, "updateState", "(Lcom/yandex/go/taxi/order/info/OrderInfoModalView$State;)V", "Lc230;", "insetsType", "()Lc230;", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "Lcom/yandex/go/taxi/order/info/OrderInfoContentView;", "Lxdf;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "Lcom/yandex/go/taxi/order/info/OrderInfoOrganizationView;", "organizationView", "Lcom/yandex/go/taxi/order/info/OrderInfoOrganizationView;", "Lcom/yandex/go/taxi/order/info/OrderInfoFreightageView;", "freightageView", "Lcom/yandex/go/taxi/order/info/OrderInfoFreightageView;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lg18;", "onPreDrawCancellable", "Lg18;", "Landroid/widget/FrameLayout;", "frameLayout", "Landroid/widget/FrameLayout;", "Lcom/yandex/go/taxi/order/info/OrderInfoModalView$State;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "State", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderInfoModalView extends SlideableModalView {
    public static final int $stable = 8;
    private final xdf currencyFormatter;
    private final FrameLayout frameLayout;
    private final OrderInfoFreightageView freightageView;
    private g18 onPreDrawCancellable;
    private final TaxiOrder order;
    private final OrderInfoContentView orderInfo;
    private final OrderInfoOrganizationView organizationView;
    private State state;
    private final ToolbarComponent toolbar;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/info/OrderInfoModalView$State;", "", "MAIN", "FREIGHTAGE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State FREIGHTAGE;
        public static final State MAIN;

        static {
            State state = new State("MAIN", 0);
            MAIN = state;
            State state2 = new State("FREIGHTAGE", 1);
            FREIGHTAGE = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public OrderInfoModalView(Context context, o2y0 o2y0Var, OrderInfoContentView orderInfoContentView, xdf xdfVar) {
        super(context);
        this.orderInfo = orderInfoContentView;
        this.currencyFormatter = xdfVar;
        this.order = o2y0Var.b();
        OrderInfoOrganizationView orderInfoOrganizationView = new OrderInfoOrganizationView(getContext());
        this.organizationView = orderInfoOrganizationView;
        OrderInfoFreightageView orderInfoFreightageView = new OrderInfoFreightageView(getContext());
        this.freightageView = orderInfoFreightageView;
        int i = p8h0.order_info_title;
        WeakHashMap weakHashMap = b.a;
        this.toolbar = (ToolbarComponent) ((View) rp31.d(this, i));
        FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, p8h0.order_info_holder));
        this.frameLayout = frameLayout;
        this.state = State.MAIN;
        frameLayout.addView(orderInfoContentView);
        frameLayout.addView(orderInfoOrganizationView);
        frameLayout.addView(orderInfoFreightageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(OrderInfoModalView orderInfoModalView) {
        return orderInfoModalView.findViewById(p8h0.order_info_holder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(OrderInfoModalView orderInfoModalView) {
        orderInfoModalView.updateState(State.FREIGHTAGE);
    }

    private final void showFreightageView() {
        String str;
        FreightageContract freightageContract = this.order.V().e0;
        this.freightageView.init(freightageContract, this.order.V().K, this.currencyFormatter);
        if (freightageContract == null || (str = freightageContract.a) == null) {
            str = "";
        }
        this.toolbar.setTitle(str);
        showInnerView(this.freightageView);
    }

    private final void showInnerView(View view) {
        view.animate().translationX(0.0f);
        view.setVisibility(0);
        view.setTranslationX(this.frameLayout.getWidth());
        this.orderInfo.animate().translationX(-this.frameLayout.getWidth());
        this.toolbar.enableNavigationButton();
        this.toolbar.setOnNavigationClickListener(new op70(4, this));
        refreshNestedScrollView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInnerView$lambda$0(OrderInfoModalView orderInfoModalView) {
        orderInfoModalView.updateState(State.MAIN);
    }

    private final void showOrderInfo() {
        this.toolbar.setDebounceClickListener(null);
        this.toolbar.disableNavigationButton();
        this.toolbar.setTitle(kyh0.info_title);
        this.orderInfo.animate().translationX(0.0f);
        this.organizationView.animate().translationX(this.frameLayout.getWidth());
        this.freightageView.animate().translationX(this.frameLayout.getWidth());
        refreshNestedScrollView(this.orderInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(State state) {
        int i = a.a[state.ordinal()];
        if (i == 1) {
            showOrderInfo();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            showFreightageView();
        }
        this.state = state;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return zkh0.order_info_modal_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new uh60(20, this), false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, ec3] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, dai] */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final boolean z = true;
        b.q(this.toolbar, true);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.go.taxi.order.info.OrderInfoModalView$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                this.updateState(OrderInfoModalView.State.MAIN);
                this.onPreDrawCancellable = null;
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, this, 7);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.onPreDrawCancellable = (g18) ref$ObjectRef.element;
        this.orderInfo.setUiListener(new OrderInfoContentView.a() { // from class: ay70
            @Override // com.yandex.go.taxi.order.info.OrderInfoContentView.a
            public final void Ua() {
                OrderInfoModalView.onAttachedToWindow$lambda$1(OrderInfoModalView.this);
            }
        });
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        State state = this.state;
        State state2 = State.MAIN;
        if (state != state2) {
            updateState(state2);
        } else {
            super.onBackPressed();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.onPreDrawCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.onPreDrawCancellable = null;
        this.orderInfo.setUiListener(null);
        this.toolbar.setDebounceClickListener(null);
    }
}
