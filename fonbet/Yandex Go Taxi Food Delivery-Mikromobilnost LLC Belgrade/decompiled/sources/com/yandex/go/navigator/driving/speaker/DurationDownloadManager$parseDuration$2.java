package com.yandex.go.navigator.driving.speaker;

import defpackage.auu0;
import defpackage.e6m;
import defpackage.jst;
import defpackage.k8u;
import defpackage.mvg;
import defpackage.my31;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.speaker.DurationDownloadManager$parseDuration$2", f = "DurationDownloadManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DurationDownloadManager$parseDuration$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationDownloadManager$parseDuration$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DurationDownloadManager$parseDuration$2 durationDownloadManager$parseDuration$2 = new DurationDownloadManager$parseDuration$2(this.this$0, continuation);
        durationDownloadManager$parseDuration$2.L$0 = obj;
        return durationDownloadManager$parseDuration$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DurationDownloadManager$parseDuration$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        try {
            wnt wntVar = aVar.b;
            my31 my31Var = aVar.c;
            my31Var.getClass();
            xnt xntVar = (xnt) wntVar;
            failure = (Map) xntVar.b(new FileInputStream(new File(my31Var.a.a + "/durations.json")), new k8u(auu0.a, e6m.a, 1));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        a aVar2 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            aVar2.f = (Map) failure;
        }
        if (Result.a(failure) != null) {
            jst.e.getClass();
        }
        return new Result(failure);
    }
}
