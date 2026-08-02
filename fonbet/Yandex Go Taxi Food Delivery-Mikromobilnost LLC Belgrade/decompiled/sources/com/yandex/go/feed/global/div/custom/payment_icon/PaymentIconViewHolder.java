package com.yandex.go.feed.global.div.custom.payment_icon;

import android.widget.FrameLayout;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.payments.data.p;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import defpackage.a2a0;
import defpackage.clk;
import defpackage.cvw;
import defpackage.fre;
import defpackage.h3y;
import defpackage.l8x;
import defpackage.m1a0;
import defpackage.tje;
import defpackage.tse;
import defpackage.z0a0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.m0;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/feed/global/div/custom/payment_icon/PaymentIconViewHolder;", "Landroid/widget/FrameLayout;", "Ltse;", "scope", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lz0a0;", "paymentIconLoader", "La2a0;", "paymentInfoMapper", "Lh3y;", "Lcom/yandex/go/payments/data/p;", "selectedPaymentRepository", "<init>", "(Ltse;Lcom/yandex/div/core/view2/Div2View;Lz0a0;La2a0;Lh3y;)V", "Lcom/yandex/go/payments/design/composite/CompositePaymentIconsView;", "compositeView", "", "titleVariable", "Lzy11;", "startPaymentUpdates", "(Lcom/yandex/go/payments/design/composite/CompositePaymentIconsView;Ljava/lang/String;Lcom/yandex/div/core/view2/Div2View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm1a0;", "paymentInfo", "renderViewItem", "(Lcom/yandex/go/payments/design/composite/CompositePaymentIconsView;Lm1a0;)V", "Lorg/json/JSONObject;", "properties", "extractPaymentTitleVariable", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Lclk;", "divCustom", "init", "(Lclk;)V", "release", "()V", "Ltse;", "Lcom/yandex/div/core/view2/Div2View;", "Lz0a0;", "La2a0;", "Lh3y;", "Ll8x;", "paymentUpdatesJob", "Ll8x;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentIconViewHolder extends FrameLayout {
    private final Div2View divView;
    private final z0a0 paymentIconLoader;
    private final a2a0 paymentInfoMapper;
    private l8x paymentUpdatesJob;
    private final tse scope;
    private final h3y selectedPaymentRepository;

    public PaymentIconViewHolder(tse tseVar, Div2View div2View, z0a0 z0a0Var, a2a0 a2a0Var, h3y h3yVar) {
        super(div2View.getContext());
        this.scope = tseVar;
        this.divView = div2View;
        this.paymentIconLoader = z0a0Var;
        this.paymentInfoMapper = a2a0Var;
        this.selectedPaymentRepository = h3yVar;
    }

    private final String extractPaymentTitleVariable(JSONObject properties) {
        if (properties == null) {
            return null;
        }
        return cvw.J("title_variable", properties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderViewItem(CompositePaymentIconsView compositeView, m1a0 paymentInfo) {
        CompositePaymentIconsView.update$default(compositeView, paymentInfo, this.paymentIconLoader, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startPaymentUpdates(CompositePaymentIconsView compositePaymentIconsView, String str, Div2View div2View, Continuation<? super zy11> continuation) {
        return new m0(((p) this.selectedPaymentRepository.get()).b(), ((p) this.selectedPaymentRepository.get()).a(), new PaymentIconViewHolder$startPaymentUpdates$2(this, null)).collect(new fre(str, div2View, this, compositePaymentIconsView, 6), continuation);
    }

    public final void init(clk divCustom) {
        CompositePaymentIconsView compositePaymentIconsView = new CompositePaymentIconsView(this.divView.getContext(), null, 0, 6, null);
        addView(compositePaymentIconsView);
        this.paymentUpdatesJob = tje.N(this.scope, null, null, new PaymentIconViewHolder$init$1(this, compositePaymentIconsView, extractPaymentTitleVariable(divCustom.i), null), 3);
    }

    public final void release() {
        l8x l8xVar = this.paymentUpdatesJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }
}
