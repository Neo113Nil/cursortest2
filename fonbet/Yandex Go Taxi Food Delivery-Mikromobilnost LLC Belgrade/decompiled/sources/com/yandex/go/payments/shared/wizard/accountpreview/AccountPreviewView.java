package com.yandex.go.payments.shared.wizard.accountpreview;

import android.content.Context;
import defpackage.luh0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/payments/shared/wizard/accountpreview/AccountPreviewView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Ljava/lang/Runnable;", "onDismiss", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;)V", "Lzy11;", "onBackPressed", "()V", "onTouchOutside", "onDismissManually", "Ljava/lang/Runnable;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountPreviewView extends SlideableModalView {
    public static final int $stable = 8;
    private final Runnable onDismiss;

    public AccountPreviewView(Context context, Runnable runnable) {
        super(context);
        this.onDismiss = runnable;
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return luh0.shared_payment_account_preview;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.onDismiss.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.onDismiss.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.onDismiss.run();
    }
}
