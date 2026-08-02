package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes8.dex */
public interface LastKnownLocationExtractorProviderFactory {
    LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider();

    LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider();
}
