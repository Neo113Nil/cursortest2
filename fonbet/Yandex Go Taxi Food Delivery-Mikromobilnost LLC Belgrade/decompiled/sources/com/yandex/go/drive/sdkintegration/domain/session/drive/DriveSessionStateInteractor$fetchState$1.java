package com.yandex.go.drive.sdkintegration.domain.session.drive;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.drive.DriveSessionStateInteractor", f = "DriveSessionStateInteractor.kt", l = {HProv.PP_CIPHEROID, HProv.PP_SIGNATUREOID, 99}, m = "fetchState", v = 2)
/* loaded from: classes.dex */
final class DriveSessionStateInteractor$fetchState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveSessionStateInteractor$fetchState$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.c(this.this$0, null, this);
    }
}
