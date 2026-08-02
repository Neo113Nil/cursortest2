package com.ybsdk.feature.divkit.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "T"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$load$2", f = "DivDownloader.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivDownloader$load$2 extends SuspendLambda implements tls {
    final /* synthetic */ zls $call;
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ String $resolvedBody;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDownloader$load$2(zls zlsVar, String str, Map map, Continuation continuation) {
        super(1, continuation);
        this.$call = zlsVar;
        this.$resolvedBody = str;
        this.$headers = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DivDownloader$load$2(this.$call, this.$resolvedBody, this.$headers, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DivDownloader$load$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        Map<String, String> map = this.$headers;
        this.label = 1;
        Object invoke = zlsVar.invoke(str, map, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
