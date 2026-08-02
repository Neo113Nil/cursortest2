package com.yandex.plus.core.network.okhttp.client;

import defpackage.g0c;
import defpackage.gz50;
import defpackage.m8w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sq50;
import defpackage.sz50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltse;", "Lsz50;", "Lnz50;", "Lm5j0;", "Lrvj0;", "Lcom/yandex/plus/core/network/okhttp/response/OkHttpNetworkResponse;", "<anonymous>", "(Ltse;)Lsz50;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.client.BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkResult$1", f = "BaseOkHttpNetworkClient.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ sq50 $context;
    final /* synthetic */ com.yandex.plus.core.network.interceptor.a $networkChain;
    final /* synthetic */ gz50 $networkRequest;
    final /* synthetic */ m8w $okHttpChain;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkResult$1(sq50 sq50Var, m8w m8wVar, com.yandex.plus.core.network.interceptor.a aVar, gz50 gz50Var, Continuation continuation) {
        super(2, continuation);
        this.$context = sq50Var;
        this.$okHttpChain = m8wVar;
        this.$networkChain = aVar;
        this.$networkRequest = gz50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkResult$1(this.$context, this.$okHttpChain, this.$networkChain, this.$networkRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                sq50 sq50Var = this.$context;
                m8w m8wVar = this.$okHttpChain;
                g0c a = qoi0.a(m8w.class);
                LinkedHashMap linkedHashMap = sq50Var.a;
                if (m8wVar != null) {
                    linkedHashMap.put(a, m8wVar);
                } else {
                    linkedHashMap.remove(a);
                }
                com.yandex.plus.core.network.interceptor.a aVar = this.$networkChain;
                gz50 gz50Var = this.$networkRequest;
                this.label = 1;
                obj = aVar.b(gz50Var, this);
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
            return (sz50) obj;
        } finally {
            sq50 sq50Var2 = this.$context;
            sq50Var2.a.remove(qoi0.a(m8w.class));
        }
    }
}
