package com.yandex.go.taxi.order.promotions.modal_default;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.promotions.modal_default.model.ModalDefaultAction;
import com.yandex.go.taxi.order.promotions.modal_default.router.a;
import defpackage.b0b;
import defpackage.br70;
import defpackage.bts0;
import defpackage.cr70;
import defpackage.dr70;
import defpackage.er70;
import defpackage.fd60;
import defpackage.g0c;
import defpackage.g760;
import defpackage.g990;
import defpackage.he7;
import defpackage.kv5;
import defpackage.lki;
import defpackage.mt6;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.op70;
import defpackage.py20;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.rr70;
import defpackage.scc;
import defpackage.tje;
import defpackage.tn1;
import defpackage.txc;
import defpackage.ur70;
import defpackage.us4;
import defpackage.vz1;
import defpackage.w9u;
import defpackage.wr70;
import defpackage.y57;
import defpackage.yq70;
import defpackage.zkh0;
import defpackage.zq70;
import defpackage.zxs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/yandex/go/taxi/order/promotions/modal_default/OrderDefaultModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lpy20;", "Lrr70;", "presenter", "Landroid/content/Context;", "context", "Lbts0;", "slotItemViewFactory", "<init>", "(Lrr70;Landroid/content/Context;Lbts0;)V", "Lzy11;", "onCloseButtonClick", "()V", "sliderAccept", "setupRecyclerView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpy20;", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "onTouchOutside", "onSlideOut", "Lrr70;", "Lbts0;", "Lyq70;", "adapter", "Lyq70;", "wr70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderDefaultModalView extends SlideableBindingModalView<py20> {
    public static final int $stable = 8;
    private yq70 adapter;
    private final rr70 presenter;
    private final bts0 slotItemViewFactory;

    public OrderDefaultModalView(rr70 rr70Var, Context context, bts0 bts0Var) {
        super(context);
        this.presenter = rr70Var;
        this.slotItemViewFactory = bts0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(nqs0 nqs0Var) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCloseButtonClick() {
        rr70 rr70Var = this.presenter;
        rr70Var.B.b(rr70Var.z, CommunicationModalAnalyticsData$CloseReason.CLOSE_BUTTON);
        ((a) rr70Var.y.a).r(new fd60(27));
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = getBinding().b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sliderAccept() {
        this.presenter.Kg(ModalDefaultAction.Order);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public py20 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.modal_default_view, parent, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            return new py20(recyclerView, recyclerView);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rr70 rr70Var = this.presenter;
        wr70 wr70Var = new wr70(this);
        rr70Var.Bg(wr70Var);
        rr70Var.B.c(rr70Var.z);
        int i = 3;
        tje.N(rr70Var.Jg(), null, null, new OrderDefaultModalPresenter$attachView$1(rr70Var, wr70Var, null), 3);
        int i2 = 1;
        qdb1.b(this, new op70(i2, this));
        txc txcVar = new txc(i, this.presenter);
        OrderDefaultModalView$onAttachedToWindow$3 orderDefaultModalView$onAttachedToWindow$3 = new OrderDefaultModalView$onAttachedToWindow$3(0, this, OrderDefaultModalView.class, "sliderAccept", "sliderAccept()V", 0);
        bts0 bts0Var = this.slotItemViewFactory;
        ur70 ur70Var = new ur70(i2);
        lki lkiVar = new lki(i);
        int i3 = b0b.e0;
        g0c a = qoi0.a(cr70.class);
        w9u w9uVar = new w9u(4);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, w9uVar);
        int i4 = b0b.e0;
        g0c a3 = qoi0.a(dr70.class);
        int i5 = 22;
        zxs zxsVar2 = new zxs(a3.a(), 0, null, emptyList, null, new g990(i5));
        int i6 = mt6.Z;
        g0c a4 = qoi0.a(zq70.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, new vz1(bts0Var, 2), emptyList, new he7(i2, new kv5(i5, ur70Var)), null);
        int i7 = g760.V;
        g0c a5 = qoi0.a(er70.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, null, emptyList, null, new us4(11, orderDefaultModalView$onAttachedToWindow$3));
        int i8 = y57.Z;
        g0c a6 = qoi0.a(br70.class);
        this.adapter = new yq70(lkiVar, scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, new zxs(a6.a(), 0, null, emptyList, null, new tn1(28, txcVar))));
        setupRecyclerView();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        rr70 rr70Var = this.presenter;
        rr70Var.B.b(rr70Var.z, CommunicationModalAnalyticsData$CloseReason.SYSTEM_BACK);
        ((a) rr70Var.y.a).r(new fd60(27));
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        rr70 rr70Var = this.presenter;
        rr70Var.B.b(rr70Var.z, CommunicationModalAnalyticsData$CloseReason.SWIPE);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        rr70 rr70Var = this.presenter;
        rr70Var.B.b(rr70Var.z, CommunicationModalAnalyticsData$CloseReason.TAP_OUTSIDE);
    }
}
