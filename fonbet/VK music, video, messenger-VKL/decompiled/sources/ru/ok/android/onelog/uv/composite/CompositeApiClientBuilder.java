package ru.ok.android.onelog.uv.composite;

import ru.ok.android.api.core.ApiClient;
import ru.ok.android.onelog.uv.UVApiClient;
import xsna.e9e0;

/* compiled from: CompositeApiClientBuilder.kt */
/* loaded from: classes11.dex */
public final class CompositeApiClientBuilder {
    private e9e0<ApiClient> okApiClientProvider;
    private OneLogRoutingPolicy routingPolicy;
    private e9e0<UVApiClient> uvApiClientProvider;

    public final ApiClient build() {
        OneLogRoutingPolicy oneLogRoutingPolicy = this.routingPolicy;
        if (oneLogRoutingPolicy == null) {
            throw new IllegalStateException("setRoutingPolicyProvider() must be called on the builder.");
        }
        e9e0<ApiClient> e9e0Var = this.okApiClientProvider;
        ApiClient apiClient = e9e0Var != null ? e9e0Var.get() : null;
        e9e0<UVApiClient> e9e0Var2 = this.uvApiClientProvider;
        return new CompositeApiClient(apiClient, e9e0Var2 != null ? e9e0Var2.get() : null, oneLogRoutingPolicy);
    }

    public final CompositeApiClientBuilder setOkApiClientProvider(e9e0<ApiClient> e9e0Var) {
        this.okApiClientProvider = e9e0Var;
        return this;
    }

    public final CompositeApiClientBuilder setRoutingPolicy(OneLogRoutingPolicy oneLogRoutingPolicy) {
        this.routingPolicy = oneLogRoutingPolicy;
        return this;
    }

    public final CompositeApiClientBuilder setUvApiClientProvider(e9e0<UVApiClient> e9e0Var) {
        this.uvApiClientProvider = e9e0Var;
        return this;
    }

    public final e9e0<ApiClient> toProvider() {
        return new CompositeApiClientBuilder$toProvider$1(this);
    }
}
