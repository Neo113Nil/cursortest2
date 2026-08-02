package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.ftx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainScreenAddressInteractorImpl$onNewZoneAddress$2", f = "SuperAppMainScreenAddressInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenAddressInteractorImpl$onNewZoneAddress$2 extends SuspendLambda implements wls {
    final /* synthetic */ ZoneAddress $zoneAddress;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenAddressInteractorImpl$onNewZoneAddress$2(v vVar, ZoneAddress zoneAddress, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$zoneAddress = zoneAddress;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenAddressInteractorImpl$onNewZoneAddress$2(this.this$0, this.$zoneAddress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppMainScreenAddressInteractorImpl$onNewZoneAddress$2 superAppMainScreenAddressInteractorImpl$onNewZoneAddress$2 = (SuperAppMainScreenAddressInteractorImpl$onNewZoneAddress$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppMainScreenAddressInteractorImpl$onNewZoneAddress$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.b.m(this.$zoneAddress, null);
        ftx ftxVar = this.this$0.p;
        ftxVar.a.l(this.$zoneAddress.b);
        return zy11.a;
    }
}
