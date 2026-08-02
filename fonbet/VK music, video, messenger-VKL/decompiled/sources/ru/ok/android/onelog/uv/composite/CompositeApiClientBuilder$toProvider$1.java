package ru.ok.android.onelog.uv.composite;

import kotlin.Lazy;
import ru.ok.android.api.core.ApiClient;
import xsna.bpn0;
import xsna.e9e0;
import xsna.fr4;

/* compiled from: CompositeApiClientBuilder.kt */
/* loaded from: classes11.dex */
public final class CompositeApiClientBuilder$toProvider$1 implements e9e0<ApiClient> {
    private final Lazy instance$delegate;

    public CompositeApiClientBuilder$toProvider$1(CompositeApiClientBuilder compositeApiClientBuilder) {
        this.instance$delegate = new bpn0(new fr4(compositeApiClientBuilder, 5));
    }

    private final ApiClient getInstance() {
        return (ApiClient) this.instance$delegate.getValue();
    }

    @Override // xsna.e9e0
    public ApiClient get() {
        return getInstance();
    }
}
