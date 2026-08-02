package com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp;

import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o3z;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1", f = "LongSearchV2CarOverlayPresenter.kt", l = {156, 160}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c.Kg(r4, (java.util.Map) r1, r7) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Object k0;
        c cVar2;
        Throwable th;
        c cVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar3 = (c) this.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return zy11.a;
                }
                c cVar4 = (c) this.L$1;
                cVar2 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                    k0 = obj;
                    cVar = cVar4;
                } catch (Throwable th3) {
                    th = th3;
                    cVar3 = cVar4;
                }
                cVar3.E.b("subscribeForUiUpdates", th, new o3z(12));
                return zy11.a;
            }
            kotlin.b.b(obj);
            cVar = this.this$0;
            try {
                jse jseVar = cVar.G;
                LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1$1$state$1 longSearchV2CarOverlayPresenter$subscribeForUiUpdates$1$1$state$1 = new LongSearchV2CarOverlayPresenter$subscribeForUiUpdates$1$1$state$1(cVar, null);
                this.L$0 = cVar;
                this.L$1 = cVar;
                this.label = 1;
                k0 = tje.k0(jseVar, longSearchV2CarOverlayPresenter$subscribeForUiUpdates$1$1$state$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar2 = cVar;
            } catch (Throwable th4) {
                c cVar5 = cVar;
                th = th4;
                cVar3 = cVar5;
            }
            this.L$0 = cVar;
            this.L$1 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
