package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.api.location.GeoPoint;
import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel$RestrictionMode;
import com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel$Theme;
import com.yandex.plus.log.api.LogPriority;
import defpackage.ay50;
import defpackage.dy50;
import defpackage.e6d0;
import defpackage.gy50;
import defpackage.jzs;
import defpackage.mvg;
import defpackage.n1k0;
import defpackage.nw50;
import defpackage.ny61;
import defpackage.o1k0;
import defpackage.pgz;
import defpackage.tls;
import defpackage.tse;
import defpackage.vq50;
import defpackage.w511;
import defpackage.wls;
import defpackage.zcx;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.rest.RestPlaqueRepository$updatePlaqueConfiguration$2", f = "RestPlaqueRepository.kt", l = {HProv.PP_INFO, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_ENUM_LOG}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestPlaqueRepository$updatePlaqueConfiguration$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $retryAttempt;
    final /* synthetic */ int $retryMaxAttempts;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestPlaqueRepository$updatePlaqueConfiguration$2(b bVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$retryAttempt = i;
        this.$retryMaxAttempts = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RestPlaqueRepository$updatePlaqueConfiguration$2(this.this$0, this.$retryAttempt, this.$retryMaxAttempts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RestPlaqueRepository$updatePlaqueConfiguration$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
    
        if (r0 == r2) goto L71;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.home.benchmark.a aVar;
        nw50 nw50Var;
        Object invoke;
        NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme;
        Object a;
        e6d0 cVar;
        com.yandex.plus.home.benchmark.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = (com.yandex.plus.home.benchmark.a) this.this$0.i.invoke();
            jzs a2 = this.this$0.d.a();
            NetworkPlaquePayloadRequestModel$Theme networkPlaquePayloadRequestModel$Theme2 = ((Boolean) this.this$0.e.invoke()).booleanValue() ? NetworkPlaquePayloadRequestModel$Theme.LIGHT : NetworkPlaquePayloadRequestModel$Theme.DARK;
            this.this$0.s.getClass();
            if (a2 != null) {
                GeoPoint geoPoint = a2.a;
                vq50 vq50Var = geoPoint != null ? new vq50(geoPoint.getLat(), geoPoint.getLon(), geoPoint.getAccuracy()) : null;
                GeoPoint geoPoint2 = a2.b;
                nw50Var = new nw50(vq50Var, geoPoint2 != null ? new vq50(geoPoint2.getLat(), geoPoint2.getLon(), geoPoint2.getAccuracy()) : null);
            } else {
                nw50Var = new nw50(null, null);
            }
            tls tlsVar = this.this$0.f;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = networkPlaquePayloadRequestModel$Theme2;
            this.L$3 = nw50Var;
            this.label = 1;
            invoke = tlsVar.invoke(this);
            if (invoke != coroutineSingletons) {
                networkPlaquePayloadRequestModel$Theme = networkPlaquePayloadRequestModel$Theme2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (e6d0) this.L$3;
                aVar2 = (com.yandex.plus.home.benchmark.a) this.L$0;
                kotlin.b.b(obj);
                this.this$0.r.l(aVar2);
                this.this$0.c.a(cVar);
                return Boolean.valueOf(cVar instanceof e6d0.b);
            }
            com.yandex.plus.home.benchmark.a aVar3 = (com.yandex.plus.home.benchmark.a) this.L$0;
            kotlin.b.b(obj);
            aVar = aVar3;
            a = obj;
            e6d0 e6d0Var = (e6d0) a;
            try {
                if (e6d0Var instanceof e6d0.b) {
                    ay50 ay50Var = ((gy50) ((e6d0.b) e6d0Var).a).b;
                    if (ay50Var == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    e6d0Var = new e6d0.b(ay50Var, ((e6d0.b) e6d0Var).b);
                } else if (!(e6d0Var instanceof e6d0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = e6d0Var;
            } catch (Throwable th) {
                cVar = new e6d0.a.c(e6d0Var.getB(), th);
            }
            boolean z = cVar instanceof e6d0.b;
            if (z) {
                aVar.a();
            } else if (!(cVar instanceof e6d0.a)) {
                w511.b();
                return null;
            }
            if (!z) {
                if (!(cVar instanceof e6d0.a)) {
                    w511.b();
                    return null;
                }
                aVar.b();
            }
            r0 r0Var = this.this$0.q;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            n0 n0Var = this.this$0.p;
            Object a3 = cVar.getA();
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = cVar;
            this.label = 3;
            if (n0Var.emit(a3, this) != coroutineSingletons) {
                aVar2 = aVar;
                this.this$0.r.l(aVar2);
                this.this$0.c.a(cVar);
                return Boolean.valueOf(cVar instanceof e6d0.b);
            }
            return coroutineSingletons;
        }
        nw50Var = (nw50) this.L$3;
        networkPlaquePayloadRequestModel$Theme = (NetworkPlaquePayloadRequestModel$Theme) this.L$2;
        aVar = (com.yandex.plus.home.benchmark.a) this.L$0;
        kotlin.b.b(obj);
        invoke = obj;
        dy50 dy50Var = new dy50(networkPlaquePayloadRequestModel$Theme, nw50Var, ((Boolean) invoke).booleanValue() ? NetworkPlaquePayloadRequestModel$RestrictionMode.RESTRICTED : NetworkPlaquePayloadRequestModel$RestrictionMode.UNRESTRICTED);
        pgz pgzVar = this.this$0.m;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "RestPlaqueRepository", "updatePlaqueConfiguration() request=" + dy50Var);
        }
        aVar.c();
        b bVar = this.this$0;
        CrossPlaqueControllerApi crossPlaqueControllerApi = bVar.a;
        o1k0 o1k0Var = bVar.l;
        int i2 = this.$retryAttempt;
        int i3 = this.$retryMaxAttempts;
        zcx zcxVar = o1k0Var.a;
        n1k0 n1k0Var = new n1k0(i2, i3);
        zcxVar.getClass();
        String c = zcxVar.c(n1k0Var, n1k0.Companion.serializer());
        this.L$0 = aVar;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        a = crossPlaqueControllerApi.a(c, dy50Var, this);
    }
}
