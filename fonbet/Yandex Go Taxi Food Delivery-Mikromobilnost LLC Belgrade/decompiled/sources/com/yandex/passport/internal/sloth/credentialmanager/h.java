package com.yandex.passport.internal.sloth.credentialmanager;

import android.content.Context;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class h implements d {
    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    public final Object a(boolean z, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, Continuation continuation) {
        return new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("Stub implementation", new NotImplementedError(0)));
    }

    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    public final Object b(GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, String str, Continuation continuation) {
        return new Result.Failure(new CredentialManagerInterface$CredentialManagerRequestException("Stub implementation", new NotImplementedError(0)));
    }

    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    public final Object c(a aVar, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, ContinuationImpl continuationImpl) {
        return Boolean.FALSE;
    }

    @Override // com.yandex.passport.internal.sloth.credentialmanager.d
    public final void d(Context context) {
    }
}
