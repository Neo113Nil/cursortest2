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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1", f = "LongSearchV2CarOverlayPresenter.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Throwable th;
        c cVar2;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar3 = this.this$0;
                try {
                    jse jseVar = cVar3.G;
                    LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1$1$1 longSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1$1$1 = new LongSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1$1$1(cVar3, null);
                    this.L$0 = cVar3;
                    this.L$1 = cVar3;
                    this.label = 1;
                    if (tje.k0(jseVar, longSearchV2CarOverlayPresenter$subscribeForNearestDriversUpdates$1$1$1, this) == r0) {
                        return r0;
                    }
                    cVar = cVar3;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    cVar = cVar3;
                    th = th2;
                    cVar2 = cVar;
                    cVar2.E.b("subscribeForNearestDriversUpdates", th, new o3z(11));
                    cVar.D.c();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$1;
                cVar2 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                    cVar2.E.b("subscribeForNearestDriversUpdates", th, new o3z(11));
                    cVar.D.c();
                    return zy11.a;
                }
            }
            cVar.D.c();
            return zy11.a;
        } catch (Throwable th4) {
            r0.D.c();
            throw th4;
        }
    }
}
