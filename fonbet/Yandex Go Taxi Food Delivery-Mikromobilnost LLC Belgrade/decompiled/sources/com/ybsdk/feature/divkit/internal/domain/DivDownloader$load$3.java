package com.ybsdk.feature.divkit.internal.domain;

import com.ybsdk.core.utils.ext.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "T", "idempotencyToken", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$load$3", f = "DivDownloader.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivDownloader$load$3 extends SuspendLambda implements wls {
    final /* synthetic */ zls $call;
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ String $resolvedBody;
    /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "T"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$load$3$1", f = "DivDownloader.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.divkit.internal.domain.DivDownloader$load$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ zls $call;
        final /* synthetic */ String $resolvedBody;
        final /* synthetic */ Map<String, String> $totalHeaders;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(zls zlsVar, String str, Map map, Continuation continuation) {
            super(1, continuation);
            this.$call = zlsVar;
            this.$resolvedBody = str;
            this.$totalHeaders = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.$call, this.$resolvedBody, this.$totalHeaders, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
            zls zlsVar = this.$call;
            String str = this.$resolvedBody;
            Map<String, String> map = this.$totalHeaders;
            this.label = 1;
            Object invoke = zlsVar.invoke(str, map, this);
            return invoke == coroutineSingletons ? coroutineSingletons : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDownloader$load$3(zls zlsVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.$headers = map;
        this.$call = zlsVar;
        this.$resolvedBody = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DivDownloader$load$3 divDownloader$load$3 = new DivDownloader$load$3(this.$call, this.$resolvedBody, this.$headers, continuation);
        divDownloader$load$3.L$0 = obj;
        return divDownloader$load$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivDownloader$load$3) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.$resolvedBody, kotlin.collections.b.o(this.$headers, new Pair("X-Idempotency-Token", (String) this.L$0)), null);
            this.label = 1;
            c = c.c(anonymousClass1, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
