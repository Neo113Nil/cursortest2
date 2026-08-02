package com.yandex.plus.core.network.okhttp.client;

import defpackage.d5j0;
import defpackage.gz50;
import defpackage.kvj0;
import defpackage.lz50;
import defpackage.m8w;
import defpackage.mub1;
import defpackage.mvg;
import defpackage.n55;
import defpackage.nub1;
import defpackage.ny61;
import defpackage.nz50;
import defpackage.tls;
import defpackage.zci0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006j\u0002`\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lsq50;", "<unused var>", "Lgz50;", "Lm5j0;", "Lcom/yandex/plus/core/network/okhttp/request/OkHttpNetworkRequest;", "request", "Lsz50;", "Lnz50;", "Lrvj0;", "Lcom/yandex/plus/core/network/okhttp/response/OkHttpNetworkResponse;", "Lcom/yandex/plus/core/network/okhttp/interceptor/OkHttpNetworkResult;", "<anonymous>", "(Lsq50;Lgz50;)Lsz50;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.client.BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1", f = "BaseOkHttpNetworkClient.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ m8w $okHttpChain;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnz50;", "Lm5j0;", "Lrvj0;", "Lcom/yandex/plus/core/network/okhttp/response/OkHttpNetworkResponse;", "<anonymous>", "()Lnz50;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.core.network.okhttp.client.BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1$2", f = "BaseOkHttpNetworkClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.core.network.okhttp.client.BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements tls {
        final /* synthetic */ m8w $okHttpChain;
        final /* synthetic */ gz50 $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(gz50 gz50Var, m8w m8wVar, Continuation continuation) {
            super(1, continuation);
            this.$request = gz50Var;
            this.$okHttpChain = m8wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.$request, this.$okHttpChain, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            d5j0 d5j0Var;
            lz50 lz50Var;
            lz50 lz50Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            kvj0 b = ((zci0) this.$okHttpChain).b(nub1.f(this.$request));
            kvj0 kvj0Var = b.B;
            if (kvj0Var == null || (d5j0Var = kvj0Var.a) == null) {
                d5j0Var = b.a;
            }
            gz50 e = nub1.e(d5j0Var);
            String protocol = b.b.getProtocol();
            if (protocol.equals("http/1.0")) {
                lz50Var2 = lz50.b;
            } else if (protocol.equals("http/1.1")) {
                lz50Var2 = lz50.c;
            } else if (protocol.equals("h2")) {
                lz50Var2 = lz50.d;
            } else {
                if (!protocol.equals("quic")) {
                    lz50Var = new lz50(protocol);
                    return new nz50(e, lz50Var, b.w, b.c, mub1.e(b.y), b.z);
                }
                lz50Var2 = lz50.e;
            }
            lz50Var = lz50Var2;
            return new nz50(e, lz50Var, b.w, b.c, mub1.e(b.y), b.z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1(d dVar, m8w m8wVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$okHttpChain = m8wVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1 baseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1 = new BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1(this.this$0, this.$okHttpChain, (Continuation) obj3);
        baseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1.L$0 = (gz50) obj2;
        return baseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gz50 gz50Var = (gz50) this.L$0;
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
        n55 n55Var = new n55(this.this$0, 1);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(gz50Var, this.$okHttpChain, null);
        this.L$0 = null;
        this.label = 1;
        Object c = com.yandex.plus.core.network.call.a.c(n55Var, anonymousClass2, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
