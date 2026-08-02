package com.yandex.delivery.live.location.impl.domain;

import defpackage.a0t;
import defpackage.awy;
import defpackage.dpc;
import defpackage.fo2;
import defpackage.fpc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscription$State;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.live.location.impl.domain.LiveLocationInteractor$startSendingLocation$1", f = "LiveLocationInteractor.kt", l = {40, 41, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LiveLocationInteractor$startSendingLocation$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationInteractor$startSendingLocation$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LiveLocationInteractor$startSendingLocation$1 liveLocationInteractor$startSendingLocation$1 = new LiveLocationInteractor$startSendingLocation$1(this.this$0, continuation);
        liveLocationInteractor$startSendingLocation$1.L$0 = obj;
        return liveLocationInteractor$startSendingLocation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveLocationInteractor$startSendingLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x010a, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r14) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        if (r15 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        if (r15 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x010a -> B:32:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a0t a0tVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                a0tVar = (a0t) obj;
                awy awyVar = this.this$0.b;
                this.L$0 = tseVar;
                this.L$1 = a0tVar;
                this.label = 2;
                obj = ((com.yandex.delivery.live.location.impl.data.a) awyVar).b(a0tVar, this);
            } else if (i == 2) {
                a0tVar = (a0t) this.L$1;
                b.b(obj);
                fpc fpcVar = (fpc) obj;
                a aVar = this.this$0;
                aVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("geo_position", kotlin.collections.b.i(new Pair("lat", Double.valueOf(a0tVar.a)), new Pair("lon", Double.valueOf(a0tVar.b)), new Pair("accuracy", Double.valueOf(a0tVar.c))));
                aVar.d.a.o("DeliveryLiveLocation.Coordinates.Submitted", null, linkedHashMap);
                if (fpcVar instanceof dpc) {
                    boolean booleanValue = ((Boolean) ((dpc) fpcVar).a).booleanValue();
                    boolean z = this.this$0.c.observe().getValue() == AppVisibilitySubscription$State.BACKGROUND;
                    if (!booleanValue && z) {
                        a aVar2 = this.this$0;
                        pzt0 pzt0Var = aVar2.f;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        aVar2.f = null;
                        return zy11.a;
                    }
                }
                fo2 extras = fpcVar.getExtras();
                Long l = extras != null ? extras.a : null;
                long longValue = l != null ? l.longValue() : 60000L;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        b.b(obj);
        if (kotlinx.coroutines.a.p(tseVar.getCoroutineContext())) {
            g gVar = this.this$0.a;
            this.L$0 = tseVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = gVar.a(this);
        }
        return zy11.a;
    }
}
