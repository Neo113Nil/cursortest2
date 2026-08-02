package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import defpackage.h930;
import defpackage.jl40;
import defpackage.m930;
import defpackage.mvg;
import defpackage.n930;
import defpackage.ny61;
import defpackage.o930;
import defpackage.qu;
import defpackage.t930;
import defpackage.tse;
import defpackage.u930;
import defpackage.v930;
import defpackage.w511;
import defpackage.w930;
import defpackage.wls;
import defpackage.x930;
import defpackage.y930;
import defpackage.z930;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.MosmetroOtpRouter$content$1$1$1", f = "MosmetroOtpRouter.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MosmetroOtpRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ z930 $action;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosmetroOtpRouter$content$1$1$1(b bVar, z930 z930Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = z930Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MosmetroOtpRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MosmetroOtpRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        c cVar = bVar.I;
        z930 z930Var = this.$action;
        t930 t930Var = bVar.L;
        this.label = 1;
        com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a aVar = cVar.a;
        if (!jl40.l(z930Var, u930.a)) {
            if (z930Var instanceof x930) {
                b = cVar.a(((x930) z930Var).a, t930Var, this);
            } else if (z930Var instanceof w930) {
                String str = ((w930) z930Var).a;
                r0 r0Var = aVar.b;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, h930.a((h930) value, null, str, false, null, false, 27)));
            } else if (z930Var instanceof v930) {
                b = aVar.b(this);
            } else {
                if (!(z930Var instanceof y930)) {
                    w511.b();
                    return null;
                }
                o930 o930Var = ((y930) z930Var).a;
                if (o930Var instanceof m930) {
                    b = cVar.a(((m930) o930Var).a, t930Var, this);
                } else {
                    if (!(o930Var instanceof n930)) {
                        w511.b();
                        return null;
                    }
                    b = aVar.b(this);
                }
            }
            return b != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        t930Var.a.r(new qu(9));
        b = zy11Var;
        if (b != coroutineSingletons) {
        }
    }
}
