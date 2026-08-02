package com.yandex.go.beginners.safety.photo.main;

import defpackage.exl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tan;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.safety.photo.main.SafetyPhotoMainRouter$content$1$2$1$1", f = "SafetyPhotoMainRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SafetyPhotoMainRouter$content$1$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ exl0 $state;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPhotoMainRouter$content$1$2$1$1(exl0 exl0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$state = exl0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyPhotoMainRouter$content$1$2$1$1(this.$state, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SafetyPhotoMainRouter$content$1$2$1$1 safetyPhotoMainRouter$content$1$2$1$1 = (SafetyPhotoMainRouter$content$1$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        safetyPhotoMainRouter$content$1$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.$state.h;
        if (str != null) {
            tan tanVar = ((com.yandex.go.agreement.photoupload.a) this.this$0.L).c;
            tanVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("id", str);
            tanVar.a.a("EULA.Shown", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
