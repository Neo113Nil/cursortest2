package com.yandex.mob.cron;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.cron.CronJobScheduler", f = "CronJobScheduler.kt", l = {111, HProv.PP_NK_SYNC, HProv.PP_INFO, Constants.VPN_TRAFFIC}, m = "checkTrigger")
/* loaded from: classes8.dex */
final class CronJobScheduler$checkTrigger$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronJobScheduler$checkTrigger$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, 0, null, this);
    }
}
