package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.e8;
import com.yandex.passport.data.network.i8;
import com.yandex.passport.data.network.j8;
import com.yandex.passport.internal.link_auth.QrLink;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/link_auth/QrLink;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/link_auth/QrLink;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetQrLinkPerformer$performMethod$1", f = "GetQrLinkPerformer.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetQrLinkPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.m1 $method;
    int label;
    final /* synthetic */ j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetQrLinkPerformer$performMethod$1(com.yandex.passport.internal.methods.m1 m1Var, j0 j0Var, Continuation continuation) {
        super(2, continuation);
        this.$method = m1Var;
        this.this$0 = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetQrLinkPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetQrLinkPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Environment u = com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) this.$method.b.c);
            j0 j0Var = this.this$0;
            j8 j8Var = j0Var.a;
            j0Var.w.getClass();
            e8 e8Var = new e8(com.yandex.passport.internal.network.mappers.b.a(u), (String) this.$method.c.c);
            this.label = 1;
            obj = j8Var.a(e8Var, this);
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
        com.yandex.passport.internal.methods.m1 m1Var = this.$method;
        if (!(value instanceof Result.Failure)) {
            i8 i8Var = (i8) value;
            value = new QrLink((PassportEnvironmentImpl) m1Var.b.c, i8Var.b, i8Var.c, i8Var.d, i8Var.e, i8Var.f, i8Var.g);
        }
        kotlin.b.b(value);
        return value;
    }
}
