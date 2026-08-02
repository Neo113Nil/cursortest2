package com.yandex.go.image.internal.coil.fetcher;

import defpackage.eyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u0003H\n"}, d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.PriorityRequestFactory$handleRequest$requestHolder$1$1$3$1", f = "PriorityRequestFactory.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class PriorityRequestFactory$handleRequest$requestHolder$1$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $requestFactory;
    final /* synthetic */ eyc $unlock;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityRequestFactory$handleRequest$requestHolder$1$1$3$1(eyc eycVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$unlock = eycVar;
        this.$requestFactory = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriorityRequestFactory$handleRequest$requestHolder$1$1$3$1(this.$unlock, this.$requestFactory, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriorityRequestFactory$handleRequest$requestHolder$1$1$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (((defpackage.fyc) r5).s(r4) == r0) goto L16;
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
            eyc eycVar = this.$unlock;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        tls tlsVar = this.$requestFactory;
        this.label = 2;
        Object invoke = tlsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
