package com.yandex.payment.sdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import defpackage.rnf;
import defpackage.tls;
import defpackage.vv90;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/payment/sdk/ui/CvnInputView;", "Lrnf;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CvnInputView extends FrameLayout implements rnf {
    public /* synthetic */ CvnInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public abstract /* synthetic */ void focusInput();

    public abstract /* synthetic */ boolean isReady();

    @Override // defpackage.rnf
    public abstract /* synthetic */ void provideCvn();

    public abstract /* synthetic */ void reset();

    public abstract /* synthetic */ void setCardPaymentSystem(CardPaymentSystem cardPaymentSystem);

    public abstract /* synthetic */ void setOnCvnInputFocusChangeListener(tls tlsVar);

    public abstract /* synthetic */ void setOnReadyListener(tls tlsVar);

    @Override // defpackage.rnf
    public abstract /* synthetic */ void setPaymentApi(vv90 vv90Var);

    public CvnInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CvnInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CvnInputView(Context context) {
        this(context, null, 0, 6, null);
    }
}
