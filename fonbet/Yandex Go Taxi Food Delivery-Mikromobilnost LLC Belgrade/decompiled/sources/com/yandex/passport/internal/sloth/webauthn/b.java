package com.yandex.passport.internal.sloth.webauthn;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class b implements c {
    @Override // com.yandex.passport.internal.sloth.webauthn.c
    public final Object a(String str, Continuation continuation) {
        return new Result.Failure(new IllegalStateException("Not supported"));
    }

    @Override // com.yandex.passport.internal.sloth.webauthn.c
    public final Object b() {
        return new Result.Failure(new IllegalStateException("Not supported"));
    }

    @Override // com.yandex.passport.internal.sloth.webauthn.c
    public final void c(AppCompatActivity appCompatActivity) {
    }

    @Override // com.yandex.passport.internal.sloth.webauthn.c
    public final Object d(String str, Continuation continuation) {
        return new Result.Failure(new IllegalStateException("Not supported"));
    }
}
