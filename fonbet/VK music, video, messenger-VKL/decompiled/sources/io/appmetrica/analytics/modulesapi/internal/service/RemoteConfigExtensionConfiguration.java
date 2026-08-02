package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class RemoteConfigExtensionConfiguration<S> {
    public abstract Map<String, Integer> getBlocks();

    public abstract List<String> getFeatures();

    public abstract JsonParser<S> getJsonParser();

    public abstract Converter<S, byte[]> getProtobufConverter();

    public abstract RemoteConfigUpdateListener<S> getRemoteConfigUpdateListener();
}
