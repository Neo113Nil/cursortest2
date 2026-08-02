package com.yandex.go.payments.cards.ui;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/cards/ui/Card3dsView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Card3dsView extends LinearLayout {
    public static final int $stable = 8;

    public Card3dsView(Context context) {
        super(context);
    }

    public abstract /* synthetic */ boolean isLoadingError();

    public abstract /* synthetic */ boolean onDismiss();

    public abstract /* synthetic */ void pause();

    public abstract /* synthetic */ void resume();
}
