package com.yandex.go.zone.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.zone.interactors.LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2", f = "LaunchIdChangedZoneLifecycleInteractor.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "emit", v = 2)
/* loaded from: classes8.dex */
public final class LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
