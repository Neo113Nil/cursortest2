package com.yandex.passport.internal.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.impl.KPassportUiApiImpl$special$$inlined$registerAndTransformCommon$1$1", f = "KPassportUiApiImpl.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class KPassportUiApiImpl$special$$inlined$registerAndTransformCommon$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $result$inlined;
    final /* synthetic */ vpr $this_emitOn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPassportUiApiImpl$special$$inlined$registerAndTransformCommon$1$1(vpr vprVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$this_emitOn = vprVar;
        this.$result$inlined = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KPassportUiApiImpl$special$$inlined$registerAndTransformCommon$1$1(this.$this_emitOn, this.$result$inlined, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KPassportUiApiImpl$special$$inlined$registerAndTransformCommon$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = this.$this_emitOn;
            Object obj2 = this.$result$inlined;
            this.label = 1;
            if (vprVar.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
