package com.yandex.go.morphlex.router;

import com.yandex.go.address.models.Address;
import com.yandex.go.morphlex.network.MorphlexScenarioContextParam;
import defpackage.d0l0;
import defpackage.ep21;
import defpackage.g8e;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/morphlex/network/MorphlexScenarioContextParam;", "<anonymous>", "(Ltse;)Lcom/yandex/go/morphlex/network/MorphlexScenarioContextParam;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.router.MorphlexDeeplinkRouter$requestScenarioContext$param$1", f = "MorphlexDeeplinkRouter.kt", l = {110, HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexDeeplinkRouter$requestScenarioContext$param$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $screenId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexDeeplinkRouter$requestScenarioContext$param$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MorphlexDeeplinkRouter$requestScenarioContext$param$1 morphlexDeeplinkRouter$requestScenarioContext$param$1 = new MorphlexDeeplinkRouter$requestScenarioContext$param$1(this.this$0, this.$screenId, continuation);
        morphlexDeeplinkRouter$requestScenarioContext$param$1.L$0 = obj;
        return morphlexDeeplinkRouter$requestScenarioContext$param$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MorphlexDeeplinkRouter$requestScenarioContext$param$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        MorphlexScenarioContextParam.Point point;
        MorphlexScenarioContextParam.Point point2;
        mo21 A;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MorphlexScenarioContextParam.Point point3 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new MorphlexDeeplinkRouter$requestScenarioContext$param$1$routeDeferred$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new MorphlexDeeplinkRouter$requestScenarioContext$param$1$userLocation$1(this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MorphlexScenarioContextParam.Point point4 = (MorphlexScenarioContextParam.Point) this.L$5;
                MorphlexScenarioContextParam.Point point5 = (MorphlexScenarioContextParam.Point) this.L$4;
                kotlin.b.b(obj);
                point2 = point4;
                point = point5;
                A = vng.A((ep21) obj);
                if (A != null) {
                    this.this$0.getClass();
                    point3 = new MorphlexScenarioContextParam.Point(A.a, A.b);
                }
                return new MorphlexScenarioContextParam(point, point2, point3, Boolean.valueOf(tje.L(this.this$0.G)), g8e.o("morphlex/", this.$screenId));
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        d0l0 d0l0Var = (d0l0) obj;
        a aVar = this.this$0;
        Address h3 = d0l0Var.h();
        zzs B = h3 != null ? h3.B() : null;
        aVar.getClass();
        MorphlexScenarioContextParam.Point point6 = B == null ? null : new MorphlexScenarioContextParam.Point(B.a, B.b);
        a aVar2 = this.this$0;
        Address b = d0l0Var.b();
        zzs B2 = b != null ? b.B() : null;
        aVar2.getClass();
        MorphlexScenarioContextParam.Point point7 = B2 == null ? null : new MorphlexScenarioContextParam.Point(B2.a, B2.b);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = point6;
        this.L$5 = point7;
        this.label = 2;
        obj = h.k(this);
        if (obj != coroutineSingletons) {
            point = point6;
            point2 = point7;
            A = vng.A((ep21) obj);
            if (A != null) {
            }
            return new MorphlexScenarioContextParam(point, point2, point3, Boolean.valueOf(tje.L(this.this$0.G)), g8e.o("morphlex/", this.$screenId));
        }
        return coroutineSingletons;
    }
}
