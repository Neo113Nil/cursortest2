package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.o4;
import com.yandex.passport.data.network.t4;
import com.yandex.passport.internal.entities.Cookie;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/data/network/s4;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetCodeByCookiePerformer$performMethod$1", f = "GetCodeByCookiePerformer.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetCodeByCookiePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.b1 $method;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCodeByCookiePerformer$performMethod$1(z zVar, com.yandex.passport.internal.methods.b1 b1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zVar;
        this.$method = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetCodeByCookiePerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetCodeByCookiePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.credentials.d dVar = this.this$0.c;
        PassportEnvironmentImpl m303getEnvironment = ((Cookie) this.$method.b.c).m303getEnvironment();
        com.yandex.passport.internal.properties.p pVar = dVar.a;
        com.yandex.passport.common.core.a aVar = Environment.Companion;
        int integer = m303getEnvironment.getInteger();
        aVar.getClass();
        com.yandex.passport.internal.j g = com.yandex.passport.internal.util.p.g(pVar, com.yandex.passport.common.core.a.a(integer));
        String makeCookies = ((Cookie) this.$method.b.c).makeCookies();
        if (makeCookies == null) {
            ny61.r("Required value was null.");
            return null;
        }
        z zVar = this.this$0;
        t4 t4Var = zVar.a;
        com.yandex.passport.internal.network.mappers.b bVar = zVar.w;
        Environment u = com.yandex.passport.internal.util.p.u(((Cookie) this.$method.b.c).m303getEnvironment());
        bVar.getClass();
        o4 o4Var = new o4(com.yandex.passport.internal.network.mappers.b.a(u), makeCookies, ((Cookie) this.$method.b.c).getHost(), g.getDecryptedId(), g.getDecryptedSecret());
        this.label = 1;
        Object a = t4Var.a(o4Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
