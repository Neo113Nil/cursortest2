package com.ybsdk.screens.upgrade;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import defpackage.k03;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.EsiaDeeplinkDelegate$addApplicationIdFromUri$1", f = "EsiaDeeplinkDelegate.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class EsiaDeeplinkDelegate$addApplicationIdFromUri$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ k03 $this_addApplicationIdFromUri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsiaDeeplinkDelegate$addApplicationIdFromUri$1(k03 k03Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_addApplicationIdFromUri = k03Var;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EsiaDeeplinkDelegate$addApplicationIdFromUri$1(this.$this_addApplicationIdFromUri, this.$applicationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EsiaDeeplinkDelegate$addApplicationIdFromUri$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            k03 k03Var = this.$this_addApplicationIdFromUri;
            String str = this.$applicationId;
            ApplicationType applicationType = ApplicationType.SIMPLIFIED_IDENTIFICATION;
            this.label = 1;
            if (((com.ybsdk.common.repositiories.applications.b) k03Var).a(applicationType, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
