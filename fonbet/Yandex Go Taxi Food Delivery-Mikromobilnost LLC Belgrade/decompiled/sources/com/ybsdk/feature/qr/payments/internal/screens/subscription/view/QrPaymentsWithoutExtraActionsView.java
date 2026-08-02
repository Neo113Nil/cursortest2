package com.ybsdk.feature.qr.payments.internal.screens.subscription.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import defpackage.cma1;
import defpackage.jl40;
import defpackage.mu5;
import defpackage.ny61;
import defpackage.pbh0;
import defpackage.pdq0;
import defpackage.rbv;
import defpackage.tbg0;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.z361;
import defpackage.znh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/view/QrPaymentsWithoutExtraActionsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "Lcom/ybsdk/core/utils/text/Text;", "text", "Lzy11;", "renderText", "(Landroid/widget/TextView;Lcom/ybsdk/core/utils/text/Text;)V", "Ltbg0;", ClidProvider.STATE, "render", "(Ltbg0;)V", "Lkotlin/Function1;", "", "listener", "onSelectAgreement", "(Ltls;)V", "Lz361;", "binding", "Lz361;", "currentState", "Ltbg0;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrPaymentsWithoutExtraActionsView extends LinearLayout {
    private final z361 binding;
    private tbg0 currentState;

    public QrPaymentsWithoutExtraActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(znh0.ybsdk_payment_wthout_extra_actions_view, this);
        int i2 = pbh0.qrPaymentSubscriptionAgreements;
        SelectPaymentMethodView selectPaymentMethodView = (SelectPaymentMethodView) cma1.O(i2, this);
        if (selectPaymentMethodView != null) {
            i2 = pbh0.qrPaymentSubscriptionAgreementsTitle;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = pbh0.qrPaymentSubscriptionDescription;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    i2 = pbh0.qrPaymentSubscriptionLogo;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                    if (appCompatImageView != null) {
                        i2 = pbh0.qrPaymentSubscriptionTitle;
                        TextView textView3 = (TextView) cma1.O(i2, this);
                        if (textView3 != null) {
                            this.binding = new z361(this, selectPaymentMethodView, textView, textView2, appCompatImageView, textView3);
                            setOrientation(1);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void renderText(TextView textView, Text text) {
        textView.setText(text != null ? d.a(textView.getContext(), text) : null);
    }

    public final void onSelectAgreement(tls listener) {
        this.binding.b.setListener(new mu5(listener));
    }

    public final void render(tbg0 state) {
        rbv rbvVar = state.c;
        Text text = state.d;
        pdq0 pdq0Var = state.e;
        z361 z361Var = this.binding;
        if (jl40.l(this.currentState, state)) {
            return;
        }
        TextView textView = z361Var.f;
        TextView textView2 = z361Var.c;
        SelectPaymentMethodView selectPaymentMethodView = z361Var.b;
        renderText(textView, state.a);
        renderText(z361Var.d, state.b);
        tbg0 tbg0Var = this.currentState;
        if (!rbvVar.equals(tbg0Var != null ? tbg0Var.c : null)) {
            v4b1.k(rbvVar, z361Var.e, null, null, 6);
        }
        selectPaymentMethodView.setVisibility(pdq0Var != null ? 0 : 8);
        if (pdq0Var != null) {
            selectPaymentMethodView.render(pdq0Var);
        }
        textView2.setVisibility(text != null ? 0 : 8);
        if (text == null) {
            text = Text.Empty.INSTANCE;
        }
        textView2.setText(d.a(getContext(), text));
        this.currentState = state;
    }

    public QrPaymentsWithoutExtraActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ QrPaymentsWithoutExtraActionsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public QrPaymentsWithoutExtraActionsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
