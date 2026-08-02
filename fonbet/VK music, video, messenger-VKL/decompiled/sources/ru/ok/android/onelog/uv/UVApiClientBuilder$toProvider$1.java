package ru.ok.android.onelog.uv;

import kotlin.Lazy;
import xsna.bpn0;
import xsna.e9e0;
import xsna.myd0;

/* compiled from: UVApiClientBuilder.kt */
/* loaded from: classes9.dex */
public final class UVApiClientBuilder$toProvider$1 implements e9e0<UVApiClient> {
    private final Lazy instance$delegate;

    public UVApiClientBuilder$toProvider$1(UVApiClientBuilder uVApiClientBuilder) {
        this.instance$delegate = new bpn0(new myd0(uVApiClientBuilder, 17));
    }

    private final UVApiClient getInstance() {
        return (UVApiClient) this.instance$delegate.getValue();
    }

    @Override // xsna.e9e0
    public UVApiClient get() {
        return getInstance();
    }
}
