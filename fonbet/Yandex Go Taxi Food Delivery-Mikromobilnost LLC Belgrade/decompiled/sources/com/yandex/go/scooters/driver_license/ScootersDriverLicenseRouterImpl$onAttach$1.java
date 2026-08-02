package com.yandex.go.scooters.driver_license;

import com.yandex.go.scooters.driver_license.api.domain.model.ScootersDriverLicenseVerificationStatus;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4g0;
import defpackage.r4n0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.z7n0;
import defpackage.zin0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.driver_license.ScootersDriverLicenseRouterImpl$onAttach$1", f = "ScootersDriverLicenseRouterImpl.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDriverLicenseRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ zin0 $payload;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.driver_license.ScootersDriverLicenseRouterImpl$onAttach$1$1", f = "ScootersDriverLicenseRouterImpl.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.driver_license.ScootersDriverLicenseRouterImpl$onAttach$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                this.label = 1;
                if (aVar.D.f("driver_license").collect(new r4n0(13, aVar), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDriverLicenseRouterImpl$onAttach$1(a aVar, zin0 zin0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = zin0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersDriverLicenseRouterImpl$onAttach$1 scootersDriverLicenseRouterImpl$onAttach$1 = new ScootersDriverLicenseRouterImpl$onAttach$1(this.this$0, this.$payload, continuation);
        scootersDriverLicenseRouterImpl$onAttach$1.L$0 = obj;
        return scootersDriverLicenseRouterImpl$onAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDriverLicenseRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.G.b(null);
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
            zin0 zin0Var = this.$payload;
            String str = zin0Var.b;
            a aVar = this.this$0;
            if (str != null) {
                aVar.G.b(ScootersDriverLicenseVerificationStatus.FAILED);
                aVar.A((m950) aVar.I.get(), new z7n0(str, true), new p4g0(aVar, 7));
            } else {
                String str2 = zin0Var.a;
                this.L$0 = null;
                this.label = 1;
                if (a.P(aVar, str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
