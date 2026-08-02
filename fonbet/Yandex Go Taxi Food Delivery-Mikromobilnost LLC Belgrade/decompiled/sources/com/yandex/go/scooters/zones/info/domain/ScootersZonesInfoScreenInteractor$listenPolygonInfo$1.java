package com.yandex.go.scooters.zones.info.domain;

import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfoResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonInfoResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.info.domain.ScootersZonesInfoScreenInteractor$listenPolygonInfo$1", f = "ScootersZonesInfoScreenInteractor.kt", l = {28, 29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersZonesInfoScreenInteractor$listenPolygonInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $polygonId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersZonesInfoScreenInteractor$listenPolygonInfo$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$polygonId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersZonesInfoScreenInteractor$listenPolygonInfo$1 scootersZonesInfoScreenInteractor$listenPolygonInfo$1 = new ScootersZonesInfoScreenInteractor$listenPolygonInfo$1(this.this$0, this.$polygonId, continuation);
        scootersZonesInfoScreenInteractor$listenPolygonInfo$1.L$0 = obj;
        return scootersZonesInfoScreenInteractor$listenPolygonInfo$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersZonesInfoScreenInteractor$listenPolygonInfo$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersPolygonInfoResponse scootersPolygonInfoResponse;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            scootersPolygonInfoResponse = null;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            String str = this.$polygonId;
            com.yandex.go.scooters.zones.data.a aVar = cVar.b;
            this.L$0 = vprVar;
            this.label = 1;
            obj = aVar.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
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
            kotlin.b.b(obj);
        }
        scootersPolygonInfoResponse = (ScootersPolygonInfoResponse) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
