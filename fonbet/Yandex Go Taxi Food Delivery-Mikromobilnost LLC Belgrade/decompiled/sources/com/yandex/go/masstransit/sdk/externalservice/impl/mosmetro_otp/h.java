package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import defpackage.b7z0;
import defpackage.fa30;
import defpackage.gci0;
import defpackage.tpr;
import defpackage.yt11;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class h implements yt11 {
    public final com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a a;
    public final fa30 b;
    public final b7z0 c;
    public final LinkedHashMap d = new LinkedHashMap();

    public h(com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a aVar, fa30 fa30Var, b7z0 b7z0Var) {
        this.a = aVar;
        this.b = fa30Var;
        this.c = b7z0Var;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        gci0 d = kotlinx.coroutines.flow.e.d(this.a.b);
        return kotlinx.coroutines.flow.e.n(d, kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new e(d)), new MosmetroOtpUiStateInteractor$createCountdownFlow$$inlined$flatMapLatest$1(this, null)), kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new g(d)), new MosmetroOtpUiStateInteractor$createCountdownFlow$$inlined$flatMapLatest$1(this, null)), new MosmetroOtpUiStateInteractor$mapToUiState$1(this, null));
    }
}
