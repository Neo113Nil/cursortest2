package com.yandex.div.core.util;

import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Releasables.kt */
/* loaded from: classes7.dex */
final class ExpressionSubscriberImpl implements ExpressionSubscriber {
    private final List<Disposable> subscriptions = new ArrayList();

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }
}
