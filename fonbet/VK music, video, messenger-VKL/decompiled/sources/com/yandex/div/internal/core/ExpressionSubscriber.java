package com.yandex.div.internal.core;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.Releasable;
import java.util.Iterator;
import java.util.List;

/* compiled from: ExpressionSubscriber.kt */
/* loaded from: classes7.dex */
public interface ExpressionSubscriber extends Releasable {
    default void addSubscription(Disposable disposable) {
        if (disposable == null || disposable == Disposable.NULL) {
            return;
        }
        getSubscriptions().add(disposable);
    }

    default void closeAllSubscription() {
        Iterator<T> it = getSubscriptions().iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        getSubscriptions().clear();
    }

    List<Disposable> getSubscriptions();

    @Override // com.yandex.div.core.view2.Releasable
    default void release() {
        closeAllSubscription();
    }
}
