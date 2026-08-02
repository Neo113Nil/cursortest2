package com.yandex.messaging.domain.contacts;

import com.yandex.messaging.internal.authorized.j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes15.dex */
public final class a {
    public final j a;

    public a(j jVar) {
        this.a = jVar;
    }

    public final Object a(Continuation continuation) {
        return this.a.b(new ClearPhoneContactsUseCase$execute$2(2, null), (SuspendLambda) continuation);
    }
}
