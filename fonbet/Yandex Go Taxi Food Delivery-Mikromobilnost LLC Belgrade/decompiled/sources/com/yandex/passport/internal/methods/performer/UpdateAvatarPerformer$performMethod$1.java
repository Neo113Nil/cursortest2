package com.yandex.passport.internal.methods.performer;

import android.net.Uri;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.t2;
import com.yandex.passport.internal.usecase.s1;
import com.yandex.passport.internal.usecase.t1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.UpdateAvatarPerformer$performMethod$1", f = "UpdateAvatarPerformer.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpdateAvatarPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ t2 $method;
    int label;
    final /* synthetic */ l1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAvatarPerformer$performMethod$1(t2 t2Var, l1 l1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = t2Var;
        this.this$0 = l1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateAvatarPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateAvatarPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
            t1 t1Var = this.this$0.a;
            com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
            Uri uri = (Uri) this.$method.c.c;
            aVar.getClass();
            s1 s1Var = new s1(B, uri.toString());
            this.label = 1;
            obj = t1Var.a(s1Var, this);
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
        Object value = ((Result) obj).getValue();
        if (!(value instanceof Result.Failure)) {
            ((com.yandex.passport.common.url.b) value).getClass();
            value = zy11.a;
        }
        l1 l1Var = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            try {
                throw com.yandex.passport.internal.methods.performer.error.a.a(l1Var.b, a, null, null, null, null, new PassportFailedResponseException(String.valueOf(a.getMessage())), 30);
            } catch (Throwable th) {
                value = new Result.Failure(th);
            }
        }
        return new Result(value);
    }
}
