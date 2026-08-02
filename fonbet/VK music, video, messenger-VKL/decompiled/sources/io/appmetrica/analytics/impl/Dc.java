package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class Dc extends C5057o5 {
    public Dc(@NonNull Context context, @NonNull C4747c5 c4747c5, @NonNull A4 a4, @NonNull AbstractC4876h5 abstractC4876h5, @NonNull C5100pm c5100pm, @NonNull InterfaceC5146rh interfaceC5146rh, @NonNull ICommonExecutor iCommonExecutor, int i, @NonNull C5227uk c5227uk, @NonNull Rb rb, @NonNull E9 e9) {
        super(context, c4747c5, a4, abstractC4876h5, c5100pm, interfaceC5146rh, iCommonExecutor, i, rb, e9);
    }

    @NonNull
    public final C5348zg a(@NonNull Bc bc) {
        C5246ve c5246ve = new C5246ve(bc);
        Objects.requireNonNull(bc);
        return new C5348zg(c5246ve, new Ac(bc), bc);
    }

    @Override // io.appmetrica.analytics.impl.C5057o5
    @NonNull
    public final C9 a(@NonNull H9 h9, @NonNull X6 x6, @NonNull C4707ah c4707ah, @NonNull A4 a4, @NonNull C4747c5 c4747c5, @NonNull C4860gf c4860gf) {
        return this.l.a(h9, x6, c4707ah, a4, c4747c5, c4860gf).a();
    }
}
