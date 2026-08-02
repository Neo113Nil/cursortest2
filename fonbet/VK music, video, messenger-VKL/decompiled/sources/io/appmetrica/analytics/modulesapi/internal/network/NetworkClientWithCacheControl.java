package io.appmetrica.analytics.modulesapi.internal.network;

/* loaded from: classes8.dex */
public interface NetworkClientWithCacheControl {
    String getETag();

    void onError();

    void onNotModified();

    void onResponse(String str, byte[] bArr);
}
