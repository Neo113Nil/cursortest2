package com.yandex.go.payments.paymentlist.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.cards.ui.TransportCardWidgetView;
import com.yandex.go.payments.cards.ui.YbWidgetView;
import defpackage.aea0;
import defpackage.bda0;
import defpackage.bdc;
import defpackage.e6h0;
import defpackage.f6a0;
import defpackage.g0c;
import defpackage.g1a0;
import defpackage.ga1;
import defpackage.go51;
import defpackage.gt51;
import defpackage.gzy;
import defpackage.haa0;
import defpackage.hba0;
import defpackage.he7;
import defpackage.hm10;
import defpackage.i3y;
import defpackage.jm10;
import defpackage.jst;
import defpackage.kn2;
import defpackage.kvz;
import defpackage.kyh0;
import defpackage.l6a0;
import defpackage.ljy0;
import defpackage.lp2;
import defpackage.luh0;
import defpackage.m4a0;
import defpackage.mfb;
import defpackage.n4a0;
import defpackage.ngz0;
import defpackage.o2u;
import defpackage.o4a0;
import defpackage.p0u;
import defpackage.pav;
import defpackage.prq0;
import defpackage.q2u;
import defpackage.qc6;
import defpackage.qda0;
import defpackage.qoi0;
import defpackage.qz10;
import defpackage.rc6;
import defpackage.rp31;
import defpackage.rxz;
import defpackage.scc;
import defpackage.ssu;
import defpackage.tls;
import defpackage.u0a0;
import defpackage.u431;
import defpackage.vaa0;
import defpackage.vca0;
import defpackage.veu;
import defpackage.vp4;
import defpackage.xba0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y011;
import defpackage.z0a0;
import defpackage.zxs;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010\fJ\u000f\u0010+\u001a\u00020\nH\u0014¢\u0006\u0004\b+\u0010\fJ\u0015\u0010,\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b,\u0010\u0010J\u0017\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0014\u00102\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/yandex/go/payments/paymentlist/ui/PaymentMethodChooserView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateScrollIndicatorVisibility", "()V", "Lm4a0;", ClidProvider.STATE, "setAddCardWarningText", "(Lm4a0;)V", "Lz0a0;", "paymentImageLoader", "Lpav;", "imageLoader", "Li3y;", "Ll76;", "yangoPaySdkRouter", "Lrxz;", "loyaltyTabletFactory", "Lhba0;", "paymentMethodsItemClickListener", "Lu0a0;", "paymentIconInfoFactory", "init", "(Lz0a0;Lpav;Li3y;Lrxz;Lhba0;Lu0a0;)V", "height", "setMargins", "(I)V", "Landroidx/recyclerview/widget/RecyclerView;", "paymentMethodListView", "()Landroidx/recyclerview/widget/RecyclerView;", "Ljava/lang/Runnable;", "doneButtonClickListener", "setDoneButtonClickListener", "(Ljava/lang/Runnable;)V", "onAttachedToWindow", "onDetachedFromWindow", "setUIState", "", "buttonAnalyticsName", "setAddCardAnalyticsName", "(Ljava/lang/String;)V", "Lz0a0;", "paymentMethodList", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "bottomButtonContainer", "Landroid/view/View;", "Lru/yandex/taxi/design/ButtonComponent;", "bottomButton", "Lru/yandex/taxi/design/ButtonComponent;", "scrollIndicator", "Landroid/widget/TextView;", "addCardWarningText", "Landroid/widget/TextView;", "Ljava/lang/Runnable;", "Lf6a0;", "adapter", "Lf6a0;", "Lmfb;", "checkDrawableProvider", "Lmfb;", "Landroidx/recyclerview/widget/RecyclerView$g;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroid/view/View$OnLayoutChangeListener;", "addCardContainerLayoutListener", "Landroid/view/View$OnLayoutChangeListener;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodChooserView extends FrameLayout {
    public static final int $stable = 8;
    private f6a0 adapter;
    private final View.OnLayoutChangeListener addCardContainerLayoutListener;
    private final TextView addCardWarningText;
    private final ButtonComponent bottomButton;
    private final View bottomButtonContainer;
    private final mfb checkDrawableProvider;
    private Runnable doneButtonClickListener;
    private z0a0 paymentImageLoader;
    private final RecyclerView paymentMethodList;
    private final View scrollIndicator;
    private final RecyclerView.g scrollListener;

    public PaymentMethodChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, luh0.payment_method_chooser_view, true);
        int i2 = e6h0.payment_method_list;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.paymentMethodList = (RecyclerView) ((View) rp31.d(this, i2));
        this.bottomButtonContainer = (View) rp31.d(this, e6h0.bottom_add_card_container);
        this.bottomButton = (ButtonComponent) ((View) rp31.d(this, e6h0.bottom_button));
        this.scrollIndicator = (View) rp31.d(this, e6h0.scroll_indicator_shadow);
        this.addCardWarningText = (TextView) ((View) rp31.d(this, e6h0.add_card_warning));
        this.checkDrawableProvider = new mfb(context, attributeSet, xng0.listCheckBoxComponentStyle);
        this.scrollListener = new o4a0(this);
        this.addCardContainerLayoutListener = new lp2(1, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCardContainerLayoutListener$lambda$0(PaymentMethodChooserView paymentMethodChooserView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        paymentMethodChooserView.setMargins(i9);
        paymentMethodChooserView.post(new n4a0(paymentMethodChooserView, i9, 0));
    }

    private final void setAddCardWarningText(m4a0 state) {
        String str = state.d;
        if (str == null || !state.e) {
            this.addCardWarningText.setVisibility(8);
        } else if (state.c == PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.VISIBLE) {
            this.addCardWarningText.setVisibility(0);
            this.addCardWarningText.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUIState$lambda$0(PaymentMethodChooserView paymentMethodChooserView) {
        Runnable runnable = paymentMethodChooserView.doneButtonClickListener;
        if (runnable != null) {
            runnable.run();
        } else {
            jst.e.q("PaymentMethodChooserView backPressedListener missing");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUIState$lambda$1(m4a0 m4a0Var) {
        m4a0Var.b.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScrollIndicatorVisibility() {
        RecyclerView.Adapter adapter = this.paymentMethodList.getAdapter();
        RecyclerView.e layoutManager = this.paymentMethodList.getLayoutManager();
        if (adapter == null || layoutManager == null) {
            return;
        }
        if (this.bottomButtonContainer.getVisibility() != 0) {
            this.scrollIndicator.setVisibility(8);
            return;
        }
        int itemCount = adapter.getItemCount() - 1;
        int L1 = ((LinearLayoutManager) layoutManager).L1();
        this.scrollIndicator.setVisibility((L1 == -1 || L1 == itemCount) ? false : true ? 0 : 8);
    }

    public final void init(final z0a0 paymentImageLoader, final pav imageLoader, i3y yangoPaySdkRouter, rxz loyaltyTabletFactory, final hba0 paymentMethodsItemClickListener, u0a0 paymentIconInfoFactory) {
        this.paymentImageLoader = paymentImageLoader;
        final mfb mfbVar = this.checkDrawableProvider;
        int i = jm10.Z;
        g0c a = qoi0.a(hm10.class);
        int i2 = 29;
        p0u p0uVar = new p0u(i2);
        final int i3 = 0;
        tls tlsVar = new tls() { // from class: im10
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ListItemComponent listItemComponent = (ListItemComponent) obj;
                switch (i3) {
                    case 0:
                        return new jm10(listItemComponent, imageLoader, paymentMethodsItemClickListener, 0);
                    default:
                        return new bda0(listItemComponent, imageLoader, paymentMethodsItemClickListener);
                }
            }
        };
        Class a2 = a.a();
        final int i4 = 1;
        he7 he7Var = new he7(i4, tlsVar);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, p0uVar, emptyList, he7Var, null);
        int i5 = bda0.Z;
        g0c a3 = qoi0.a(xba0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new qz10(i2), emptyList, new he7(i4, new tls() { // from class: im10
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ListItemComponent listItemComponent = (ListItemComponent) obj;
                switch (i4) {
                    case 0:
                        return new jm10(listItemComponent, imageLoader, paymentMethodsItemClickListener, 0);
                    default:
                        return new bda0(listItemComponent, imageLoader, paymentMethodsItemClickListener);
                }
            }
        }), null);
        int i6 = rc6.U;
        g0c a4 = qoi0.a(vca0.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, new qz10(26), emptyList, new he7(i4, new qz10(27)), null);
        int i7 = haa0.T;
        g0c a5 = qoi0.a(o2u.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, new qz10(19), emptyList, new he7(i4, new qz10(20)), null);
        int i8 = com.yandex.go.payments.yangopay.ui.a.R;
        g0c a6 = qoi0.a(go51.class);
        zxs zxsVar5 = new zxs(a6.a(), 0, new ga1(21, imageLoader, paymentImageLoader, paymentIconInfoFactory), emptyList, new he7(i4, new u431(yangoPaySdkRouter, paymentMethodsItemClickListener)), null);
        int i9 = aea0.U;
        g0c a7 = qoi0.a(gt51.class);
        zxs zxsVar6 = new zxs(a7.a(), 0, new tls() { // from class: xda0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ViewGroup viewGroup = (ViewGroup) obj;
                switch (i3) {
                    case 0:
                        YbWidgetView ybWidgetView = new YbWidgetView(viewGroup.getContext(), mfbVar);
                        ybWidgetView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return ybWidgetView;
                    default:
                        TransportCardWidgetView transportCardWidgetView = new TransportCardWidgetView(viewGroup.getContext(), mfbVar);
                        transportCardWidgetView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return transportCardWidgetView;
                }
            }
        }, emptyList, new he7(i4, new tls() { // from class: rda0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        return new vp4((ListItemComponent) obj, paymentImageLoader, paymentMethodsItemClickListener, 1);
                    case 1:
                        return new aea0((YbWidgetView) obj, paymentImageLoader, paymentMethodsItemClickListener);
                    default:
                        return new vp4((TransportCardWidgetView) obj, paymentImageLoader, paymentMethodsItemClickListener, 3);
                }
            }
        }), null);
        int i10 = qc6.T;
        g0c a8 = qoi0.a(kvz.class);
        zxs zxsVar7 = new zxs(a8.a(), 0, new kn2(18, loyaltyTabletFactory, paymentMethodsItemClickListener), emptyList, new he7(i4, new qz10(25)), null);
        int i11 = haa0.T;
        g0c a9 = qoi0.a(gzy.class);
        zxs zxsVar8 = new zxs(a9.a(), 0, new qz10(23), emptyList, new he7(1, new qz10(24)), null);
        int i12 = prq0.S;
        g0c a10 = qoi0.a(ljy0.class);
        int i13 = 1;
        zxs zxsVar9 = new zxs(a10.a(), 0, new qda0(0), emptyList, new he7(i13, new qda0(i13)), null);
        int i14 = vaa0.U;
        g0c a11 = qoi0.a(q2u.class);
        zxs zxsVar10 = new zxs(a11.a(), 0, new qz10(21), emptyList, new he7(1, new qz10(22)), null);
        int i15 = vp4.W;
        g0c a12 = qoi0.a(ngz0.class);
        final int i16 = 0;
        final int i17 = 1;
        zxs zxsVar11 = new zxs(a12.a(), 0, new qda0(2), emptyList, new he7(i17, new tls() { // from class: rda0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return new vp4((ListItemComponent) obj, paymentImageLoader, paymentMethodsItemClickListener, 1);
                    case 1:
                        return new aea0((YbWidgetView) obj, paymentImageLoader, paymentMethodsItemClickListener);
                    default:
                        return new vp4((TransportCardWidgetView) obj, paymentImageLoader, paymentMethodsItemClickListener, 3);
                }
            }
        }), null);
        int i18 = c.a0;
        g0c a13 = qoi0.a(l6a0.class);
        zxs zxsVar12 = new zxs(a13.a(), 0, new qz10(28), emptyList, new he7(i17, new veu(paymentImageLoader, imageLoader, mfbVar, paymentMethodsItemClickListener, 1)), null);
        int i19 = vp4.W;
        g0c a14 = qoi0.a(y011.class);
        final int i20 = 2;
        this.adapter = new f6a0(scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, zxsVar5, zxsVar6, zxsVar7, zxsVar8, zxsVar9, zxsVar10, zxsVar11, zxsVar12, new zxs(a14.a(), 0, new tls() { // from class: xda0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ViewGroup viewGroup = (ViewGroup) obj;
                switch (i17) {
                    case 0:
                        YbWidgetView ybWidgetView = new YbWidgetView(viewGroup.getContext(), mfbVar);
                        ybWidgetView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return ybWidgetView;
                    default:
                        TransportCardWidgetView transportCardWidgetView = new TransportCardWidgetView(viewGroup.getContext(), mfbVar);
                        transportCardWidgetView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        return transportCardWidgetView;
                }
            }
        }, emptyList, new he7(i17, new tls() { // from class: rda0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                switch (i20) {
                    case 0:
                        return new vp4((ListItemComponent) obj, paymentImageLoader, paymentMethodsItemClickListener, 1);
                    case 1:
                        return new aea0((YbWidgetView) obj, paymentImageLoader, paymentMethodsItemClickListener);
                    default:
                        return new vp4((TransportCardWidgetView) obj, paymentImageLoader, paymentMethodsItemClickListener, 3);
                }
            }
        }), null)));
        this.paymentMethodList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.paymentMethodList.setAdapter(this.adapter);
        this.paymentMethodList.setItemAnimator(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.paymentMethodList.addOnScrollListener(this.scrollListener);
        this.bottomButtonContainer.addOnLayoutChangeListener(this.addCardContainerLayoutListener);
        z0a0 z0a0Var = this.paymentImageLoader;
        if (z0a0Var != null) {
            ((g1a0) z0a0Var).a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.paymentMethodList.removeOnScrollListener(this.scrollListener);
        this.bottomButtonContainer.removeOnLayoutChangeListener(this.addCardContainerLayoutListener);
        z0a0 z0a0Var = this.paymentImageLoader;
        if (z0a0Var != null) {
            ((g1a0) z0a0Var).d();
        }
    }

    /* renamed from: paymentMethodListView, reason: from getter */
    public final RecyclerView getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public final void setAddCardAnalyticsName(String buttonAnalyticsName) {
        this.bottomButton.setAnalyticsButtonName(buttonAnalyticsName);
    }

    public final void setDoneButtonClickListener(Runnable doneButtonClickListener) {
        this.doneButtonClickListener = doneButtonClickListener;
    }

    public final void setMargins(int height) {
        xw31.x(height, this.paymentMethodList);
        xw31.x(height, this.scrollIndicator);
        updateScrollIndicatorVisibility();
    }

    public final void setUIState(m4a0 state) {
        this.bottomButton.setAccent(false);
        this.bottomButton.setButtonBackground(new bdc(xng0.controlMinor));
        this.bottomButton.setText(getContext().getString(kyh0.common_done));
        boolean contains = scc.g(PaymentsScreen.SCOOTERS, PaymentsScreen.PLACES, PaymentsScreen.CHARGERS, PaymentsScreen.SUPERAPP, PaymentsScreen.SUMMARY, PaymentsScreen.DEBTS, PaymentsScreen.DRIVE, PaymentsScreen.PORTTECH, PaymentsScreen.PLUS, PaymentsScreen.DELIVERY_FORM, PaymentsScreen.TRANSPORT_SUMMARY, PaymentsScreen.TRANSPORT_CHECKOUT, PaymentsScreen.INTERCITY_DASHBOARD).contains(state.f);
        boolean z = state.c == PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.VISIBLE;
        boolean z2 = contains && !z;
        this.bottomButtonContainer.setVisibility(z ? 0 : 8);
        if (z2) {
            this.bottomButton.setDebounceClickListener(new ssu(19, this));
        }
        if (z) {
            this.bottomButton.setButtonBackground(new bdc(xng0.controlMain));
            this.bottomButton.setText(getContext().getString(kyh0.credit_cards_add));
            this.bottomButton.setTextTypeface(3);
            this.bottomButton.setDebounceClickListener(new ssu(20, state));
        } else {
            setMargins(0);
        }
        f6a0 f6a0Var = this.adapter;
        if (f6a0Var != null) {
            f6a0Var.submitList(state.a, null);
        }
        updateScrollIndicatorVisibility();
        setAddCardWarningText(state);
    }

    public PaymentMethodChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PaymentMethodChooserView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PaymentMethodChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
