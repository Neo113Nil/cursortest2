package com.yandex.go.charity;

import defpackage.a91;
import defpackage.lza;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.svb;
import defpackage.tls;
import defpackage.tse;
import defpackage.tvb;
import defpackage.wls;
import defpackage.yfa;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.charity.CharityRouterImpl$doWithUrl$2", f = "CharityRouterImpl.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CharityRouterImpl$doWithUrl$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $consumer;
    final /* synthetic */ tvb $router;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharityRouterImpl$doWithUrl$2(a aVar, tvb tvbVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$router = tvbVar;
        this.$consumer = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CharityRouterImpl$doWithUrl$2(this.this$0, this.$router, this.$consumer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CharityRouterImpl$doWithUrl$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            yfa yfaVar = this.this$0.E;
            this.label = 1;
            obj = ((com.yandex.go.charity.repository.a) yfaVar.a).b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str = ((lza) obj).e;
        ((svb) this.$router).T(new a91(this.$consumer, str, 6));
        return zy11.a;
    }
}
