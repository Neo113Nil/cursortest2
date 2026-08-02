package com.yandex.go.payments.shared.details;

import android.content.Context;
import defpackage.lq31;
import defpackage.luh0;
import defpackage.nsa1;
import defpackage.x42;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/payments/shared/details/AccountDetailsView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Ljava/lang/Runnable;", "onDismiss", "Lx42;", "paramsProvider", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;Lx42;)V", "Lzy11;", "onBackPressed", "()V", "onTouchOutside", "onDismissManually", "", "settlingLayoutChanges", "()Z", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Ljava/lang/Runnable;", "Lx42;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountDetailsView extends SlideableModalView {
    public static final int $stable = 8;
    private final Runnable onDismiss;
    private final x42 paramsProvider;

    public AccountDetailsView(Context context, Runnable runnable, x42 x42Var) {
        super(context);
        this.onDismiss = runnable;
        this.paramsProvider = x42Var;
        setAnalyticsContext(createAnalyticsContext("FamilyAccount", nsa1.d()));
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return luh0.shared_payment_account_details;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return this.paramsProvider.getEventAnalyticsParams(eventType);
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

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }
}
