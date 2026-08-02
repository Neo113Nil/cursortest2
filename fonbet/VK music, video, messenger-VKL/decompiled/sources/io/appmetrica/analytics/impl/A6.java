package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* loaded from: classes8.dex */
public final class A6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Gn apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new Gn(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
