package com.yandex.go.yb.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jl40;
import defpackage.lt51;
import defpackage.mdh;
import defpackage.mt51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3", f = "UpdateYbWalletsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $countryCode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.yb.domain.UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3$1", f = "UpdateYbWalletsInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.yb.domain.UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $countryCode;
        int label;
        final /* synthetic */ o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = oVar;
            this.$countryCode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$countryCode, continuation);
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
                kotlin.b.b(obj);
                this.this$0.g = this.$countryCode;
                com.yandex.go.yb.data.u uVar = this.this$0.a;
                String str = this.$countryCode;
                this.label = 1;
                if (uVar.i(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3(o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$countryCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3 updateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3 = new UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3(this.this$0, this.$countryCode, continuation);
        updateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3.L$0 = obj;
        return updateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pzt0 pzt0Var = this.this$0.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (!jl40.l(this.$countryCode, ((mt51) this.this$0.e.get()).b)) {
            r0 r0Var = ((mt51) this.this$0.e.get()).a;
            lt51 lt51Var = lt51.d;
            r0Var.getClass();
            r0Var.m(null, lt51Var);
        }
        this.this$0.b.getClass();
        sjh sjhVar = uyj.a;
        pzt0 N = tje.N(tseVar, mdh.b, null, new AnonymousClass1(this.this$0, this.$countryCode, null), 2);
        this.this$0.f = N;
        return N;
    }
}
