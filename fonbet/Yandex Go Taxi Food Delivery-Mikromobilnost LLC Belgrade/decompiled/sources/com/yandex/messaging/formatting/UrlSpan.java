package com.yandex.messaging.formatting;

import android.text.style.ClickableSpan;
import android.view.View;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/formatting/UrlSpan;", "Landroid/text/style/ClickableSpan;", "Lkotlin/Function0;", "Lzy11;", "onClickAction", "<init>", "(Lsls;)V", "Landroid/view/View;", "widget", "onClick", "(Landroid/view/View;)V", "Lsls;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlSpan extends ClickableSpan {
    public static final int $stable = 0;
    private final sls onClickAction;

    public UrlSpan(sls slsVar) {
        this.onClickAction = slsVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        this.onClickAction.invoke();
    }
}
