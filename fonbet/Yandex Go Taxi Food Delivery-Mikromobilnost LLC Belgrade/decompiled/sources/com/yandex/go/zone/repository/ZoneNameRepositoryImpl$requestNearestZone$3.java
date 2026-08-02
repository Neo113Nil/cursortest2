package com.yandex.go.zone.repository;

import com.yandex.go.net.taxi.dto.request.NearestZoneParam;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import com.yandex.go.zone.dto.ZoneInfoApi;
import defpackage.ae61;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.td61;
import defpackage.tls;
import defpackage.tse;
import defpackage.ud61;
import defpackage.vd61;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import defpackage.zzs;
import java.io.BufferedInputStream;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.repository.ZoneNameRepositoryImpl$requestNearestZone$3", f = "ZoneNameRepositoryImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class ZoneNameRepositoryImpl$requestNearestZone$3 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ r this$0;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.zone.repository.ZoneNameRepositoryImpl$requestNearestZone$3$1", f = "ZoneNameRepositoryImpl.kt", l = {99}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.zone.repository.ZoneNameRepositoryImpl$requestNearestZone$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ zzs $geoPoint;
        final /* synthetic */ String $userId;
        int label;
        final /* synthetic */ r this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r rVar, zzs zzsVar, String str, Continuation continuation) {
            super(1, continuation);
            this.this$0 = rVar;
            this.$geoPoint = zzsVar;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$geoPoint, this.$userId, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                r0 r0Var = this.this$0.k;
                vd61 vd61Var = new vd61(this.$geoPoint);
                r0Var.getClass();
                r0Var.m(null, vd61Var);
                cmt<NearestZoneResponse> a = ((ZoneInfoApi) this.this$0.h.getValue()).a(new NearestZoneParam(this.$geoPoint, this.$userId));
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.a(a, null, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            NearestZoneResponse nearestZoneResponse = (NearestZoneResponse) obj;
            r0 r0Var2 = this.this$0.k;
            ud61 ud61Var = new ud61(this.$geoPoint, nearestZoneResponse);
            r0Var2.getClass();
            r0Var2.m(null, ud61Var);
            if (!jl40.l(this.this$0.j, nearestZoneResponse.a)) {
                ae61 ae61Var = this.this$0.d;
                cne0 cne0Var = ae61Var.a;
                cne0Var.w(ae61Var.c);
                cne0Var.w(ae61Var.b);
            }
            String str = nearestZoneResponse.a;
            if (str == null) {
                throw new ZoneNameRepositoryImpl$ZoneNameIsEmptyException(null);
            }
            r rVar = this.this$0;
            synchronized (rVar) {
                rVar.j = str;
                rVar.i.r("lastCity", str);
            }
            return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneNameRepositoryImpl$requestNearestZone$3(r rVar, zzs zzsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$geoPoint = zzsVar;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneNameRepositoryImpl$requestNearestZone$3(this.this$0, this.$geoPoint, this.$userId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneNameRepositoryImpl$requestNearestZone$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        td61 td61Var = td61.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                r rVar = this.this$0;
                l lVar = rVar.g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(rVar, this.$geoPoint, this.$userId, null);
                this.label = 1;
                obj = lVar.a("nearestzone", anonymousClass1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return (String) obj;
        } catch (CancellationException e) {
            r0 r0Var = this.this$0.k;
            r0Var.getClass();
            r0Var.m(null, td61Var);
            throw e;
        } catch (Exception e2) {
            r0 r0Var2 = this.this$0.k;
            r0Var2.getClass();
            r0Var2.m(null, td61Var);
            r rVar2 = this.this$0;
            rVar2.getClass();
            if (!s8o.C(e2)) {
                throw new ZoneNameRepositoryImpl$ZoneNameIsEmptyException(e2);
            }
            BufferedInputStream N = s8o.N(e2);
            if (N == null) {
                throw new ZoneNameRepositoryImpl$ZoneNameIsEmptyException(e2);
            }
            NearestZoneResponse nearestZoneResponse = (NearestZoneResponse) ((xnt) rVar2.e.a).b(N, NearestZoneResponse.Companion.serializer());
            if (nearestZoneResponse == null || (str = nearestZoneResponse.a) == null) {
                throw new ZoneNameRepositoryImpl$ZoneNameIsEmptyException(e2);
            }
            return str;
        }
    }
}
