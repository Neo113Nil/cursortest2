package com.ybsdk.feature.webview.internal.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.domain.WebPerformanceReporter$startWebViewStatusCheck$1", f = "WebPerformanceReporter.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebPerformanceReporter$startWebViewStatusCheck$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $calculatedUrlSource;
    final /* synthetic */ sls $onLoadingTimedOut;
    final /* synthetic */ String $retpath;
    final /* synthetic */ long $startTimeMs;
    final /* synthetic */ long $statusCheckTimeoutMs;
    final /* synthetic */ sls $statusProvider;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebPerformanceReporter$startWebViewStatusCheck$1(b bVar, String str, String str2, String str3, long j, long j2, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
        this.$calculatedUrlSource = str2;
        this.$retpath = str3;
        this.$startTimeMs = j;
        this.$statusCheckTimeoutMs = j2;
        this.$statusProvider = slsVar;
        this.$onLoadingTimedOut = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebPerformanceReporter$startWebViewStatusCheck$1 webPerformanceReporter$startWebViewStatusCheck$1 = new WebPerformanceReporter$startWebViewStatusCheck$1(this.this$0, this.$url, this.$calculatedUrlSource, this.$retpath, this.$startTimeMs, this.$statusCheckTimeoutMs, this.$statusProvider, this.$onLoadingTimedOut, continuation);
        webPerformanceReporter$startWebViewStatusCheck$1.L$0 = obj;
        return webPerformanceReporter$startWebViewStatusCheck$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebPerformanceReporter$startWebViewStatusCheck$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            b bVar = this.this$0;
            String str = this.$url;
            String str2 = this.$calculatedUrlSource;
            String str3 = this.$retpath;
            long j = this.$startTimeMs;
            long j2 = this.$statusCheckTimeoutMs;
            sls slsVar = this.$statusProvider;
            sls slsVar2 = this.$onLoadingTimedOut;
            this.label = 1;
            if (b.a(bVar, tseVar, str, str2, str3, j, j2, slsVar, slsVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
