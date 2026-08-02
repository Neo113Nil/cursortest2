package com.yandex.go.agreement.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qk1;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "shouldShow", "", "Ldd;", "requiredAcceptances", "Lqk1;", "<anonymous>", "(ZLjava/util/List;)Lqk1;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.repository.AgreementToShowRepositoryImpl$locationPermissionToShowFlow$1", f = "AgreementToShowRepository.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AgreementToShowRepositoryImpl$locationPermissionToShowFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreementToShowRepositoryImpl$locationPermissionToShowFlow$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AgreementToShowRepositoryImpl$locationPermissionToShowFlow$1 agreementToShowRepositoryImpl$locationPermissionToShowFlow$1 = new AgreementToShowRepositoryImpl$locationPermissionToShowFlow$1(this.this$0, (Continuation) obj3);
        agreementToShowRepositoryImpl$locationPermissionToShowFlow$1.Z$0 = booleanValue;
        agreementToShowRepositoryImpl$locationPermissionToShowFlow$1.L$0 = (List) obj2;
        return agreementToShowRepositoryImpl$locationPermissionToShowFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!z) {
                return null;
            }
            g gVar = this.this$0;
            this.L$0 = null;
            this.Z$0 = z;
            this.label = 1;
            obj = gVar.c(list, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (qk1) obj;
    }
}
