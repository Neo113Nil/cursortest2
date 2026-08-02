package com.yandex.passport.internal.sloth.credentialmanager;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public interface d {
    Object a(boolean z, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, Continuation continuation);

    Object b(GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, String str, Continuation continuation);

    Object c(a aVar, GoogleCredentialManagerImpl$Companion$CredentialManagerPlace googleCredentialManagerImpl$Companion$CredentialManagerPlace, ContinuationImpl continuationImpl);

    void d(Context context);
}
