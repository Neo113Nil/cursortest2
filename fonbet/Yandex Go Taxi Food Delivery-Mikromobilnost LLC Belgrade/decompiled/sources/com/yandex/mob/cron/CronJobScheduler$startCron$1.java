package com.yandex.mob.cron;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.cron.CronJobScheduler", f = "CronJobScheduler.kt", l = {HProv.PP_DHOID, HProv.PP_BIO_STATISTICA_LEN, HProv.PP_BIO_STATISTICA_LEN, 104, 105}, m = "startCron")
/* loaded from: classes8.dex */
final class CronJobScheduler$startCron$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronJobScheduler$startCron$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(this.this$0, 0, null, this);
    }
}
