package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes8.dex */
public interface Converter<S, P> {
    P fromModel(S s);

    S toModel(P p);
}
