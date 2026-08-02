package ru.ok.tracer.base.inject;

import xsna.e9e0;

/* compiled from: ProviderUtils.kt */
/* loaded from: classes11.dex */
public final class ProviderUtils {
    public static final <T> e9e0<T> providerOf(T t) {
        return new SimpleProvider(t);
    }
}
