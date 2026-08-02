package com.ybsdk.screens.registration.codeconfirmation.presentation;

import defpackage.m9c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewModel$5$1", f = "CodeConfirmationViewModel.kt", l = {HProv.PP_SECURITY_LEVEL, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CodeConfirmationViewModel$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b $interactor;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeConfirmationViewModel$5$1(c cVar, com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$interactor = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CodeConfirmationViewModel$5$1(this.this$0, this.$interactor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CodeConfirmationViewModel$5$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (((defpackage.tpr) r5).collect(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.screens.registration.domain.interactors.a aVar = this.this$0.J;
            String applicationId = this.$interactor.a.getApplicationId();
            this.label = 1;
            obj = aVar.c(applicationId, true, true, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        m9c m9cVar = new m9c(this.$interactor);
        this.label = 2;
    }
}
