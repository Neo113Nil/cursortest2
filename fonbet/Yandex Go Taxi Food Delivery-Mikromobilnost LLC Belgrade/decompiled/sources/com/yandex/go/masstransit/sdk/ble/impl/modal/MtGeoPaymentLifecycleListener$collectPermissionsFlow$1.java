package com.yandex.go.masstransit.sdk.ble.impl.modal;

import defpackage.bms;
import defpackage.mvg;
import defpackage.n26;
import defpackage.ny61;
import defpackage.t16;
import defpackage.tk30;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.modal.MtGeoPaymentLifecycleListener$collectPermissionsFlow$1", f = "MtGeoPaymentLifecycleListener.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtGeoPaymentLifecycleListener$collectPermissionsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ n26 $config;
    final /* synthetic */ tse $scope;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "bleEnabled", "blePermissionState", "geoPermissionState"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.modal.MtGeoPaymentLifecycleListener$collectPermissionsFlow$1$1", f = "MtGeoPaymentLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.masstransit.sdk.ble.impl.modal.MtGeoPaymentLifecycleListener$collectPermissionsFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements bms {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        /* synthetic */ boolean Z$2;
        int label;

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            boolean booleanValue3 = ((Boolean) obj3).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
            anonymousClass1.Z$0 = booleanValue;
            anonymousClass1.Z$1 = booleanValue2;
            anonymousClass1.Z$2 = booleanValue3;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            boolean z3 = this.Z$2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(z && z2 && z3);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoPaymentLifecycleListener$collectPermissionsFlow$1(d dVar, n26 n26Var, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$config = n26Var;
        this.$scope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoPaymentLifecycleListener$collectPermissionsFlow$1(this.this$0, this.$config, this.$scope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoPaymentLifecycleListener$collectPermissionsFlow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(((t16) dVar.e.a).a.d, kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.adapter.a) dVar.c.a).c), kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.adapter.a) this.this$0.c.a).b), new AnonymousClass1(4, null)));
            tk30 tk30Var = new tk30(this.this$0, this.$config, this.$scope, i2);
            this.label = 1;
            if (t.collect(tk30Var, this) == coroutineSingletons) {
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
