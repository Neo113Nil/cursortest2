package com.yandex.passport.internal.report;

import android.content.Context;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.HostReporter$1", f = "MetricaReporter.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class HostReporter$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ kd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostReporter$1(kd kdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HostReporter$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HostReporter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kd kdVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kd kdVar2 = this.this$0;
            Context context = kdVar2.a;
            this.L$0 = kdVar2;
            this.label = 1;
            Object k0 = tje.k0(uyj.a, new MetricaReporterKt$getBaseParams$2(context, null), this);
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            kdVar = kdVar2;
            obj = k0;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kdVar = (kd) this.L$0;
            kotlin.b.b(obj);
        }
        kdVar.c = (Map) obj;
        String str = (String) this.this$0.c.get(MetaDataField.DEVICE_ID_FIELD);
        if (str == null) {
            str = "Unknown";
        }
        od.a(str, this.this$0.b);
        return zy11.a;
    }
}
