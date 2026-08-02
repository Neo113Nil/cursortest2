package com.yandex.go.taxi.summary.mobilityhub.repository;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.mobilityhub.model.TransportErrorReason;
import com.yandex.mapkit.geometry.Point;
import defpackage.cwa1;
import defpackage.d0l0;
import defpackage.m811;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p811;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lp811;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.repository.TransportRouteInteractor$requestRoute$1", f = "TransportRouteInteractor.kt", l = {36, 43, 46}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransportRouteInteractor$requestRoute$1 extends SuspendLambda implements wls {
    final /* synthetic */ d0l0 $route;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRouteInteractor$requestRoute$1(d0l0 d0l0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$route = d0l0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransportRouteInteractor$requestRoute$1 transportRouteInteractor$requestRoute$1 = new TransportRouteInteractor$requestRoute$1(this.$route, this.this$0, continuation);
        transportRouteInteractor$requestRoute$1.L$0 = obj;
        return transportRouteInteractor$requestRoute$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportRouteInteractor$requestRoute$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        if (r0.emit(r8, r7) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0.emit(defpackage.o811.a, r7) == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m811Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            m811Var = (p811) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
        }
        Address h = this.$route.h();
        Address b = this.$route.b();
        if (h == null) {
            m811Var = new m811(TransportErrorReason.NoSource);
        } else if (b == null) {
            m811Var = new m811(TransportErrorReason.NoDestination);
        } else {
            a aVar = this.this$0;
            Point d = cwa1.d(h.B());
            Point d2 = cwa1.d(b.B());
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = a.a(aVar, d, d2, this);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
    }
}
