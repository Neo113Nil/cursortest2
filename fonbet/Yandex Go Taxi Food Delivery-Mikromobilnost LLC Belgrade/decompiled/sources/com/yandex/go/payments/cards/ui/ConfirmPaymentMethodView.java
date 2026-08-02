package com.yandex.go.payments.cards.ui;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.r3e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/payments/cards/ui/ConfirmPaymentMethodView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "resume", "()V", "pause", "", "onDismiss", "()Z", "Lr3e;", "delegate", "setToolbarDelegate", "(Lr3e;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ConfirmPaymentMethodView extends FrameLayout {
    public static final int $stable = 8;

    public ConfirmPaymentMethodView(Context context) {
        super(context);
    }

    public abstract boolean onDismiss();

    public abstract void pause();

    public abstract void resume();

    public abstract void setToolbarDelegate(r3e delegate);
}
