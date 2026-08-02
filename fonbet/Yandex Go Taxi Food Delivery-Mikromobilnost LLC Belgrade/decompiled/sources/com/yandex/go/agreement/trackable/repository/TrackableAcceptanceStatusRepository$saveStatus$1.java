package com.yandex.go.agreement.trackable.repository;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.agreement.trackable.network.TrackableAcceptanceApi;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.trackable.repository.TrackableAcceptanceStatusRepository$saveStatus$1", f = "TrackableAcceptanceStatusRepository.kt", l = {36, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TrackableAcceptanceStatusRepository$saveStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $onError;
    final /* synthetic */ TrackableAcceptanceActionParam $param;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableAcceptanceStatusRepository$saveStatus$1(a aVar, TrackableAcceptanceActionParam trackableAcceptanceActionParam, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$param = trackableAcceptanceActionParam;
        this.$onError = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackableAcceptanceStatusRepository$saveStatus$1(this.this$0, this.$param, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackableAcceptanceStatusRepository$saveStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r7, null, r6) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wls wlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                TrackableAcceptanceActionParam trackableAcceptanceActionParam = this.$param;
                wls wlsVar2 = this.$onError;
                try {
                    cmt<zy11> a = ((TrackableAcceptanceApi) aVar.c.getValue()).a(trackableAcceptanceActionParam);
                    this.L$0 = wlsVar2;
                    this.label = 1;
                } catch (Throwable th) {
                    th = th;
                    wlsVar = wlsVar2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                wlsVar = (wls) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
