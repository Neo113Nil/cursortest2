package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.cwd;
import defpackage.m4r0;
import defpackage.mvg;
import defpackage.nrx0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldk31;", "<anonymous>", "()Ldk31;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.interactor.SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1", f = "SetTariffInfoInteractorImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1 extends SuspendLambda implements tls {
    final /* synthetic */ Zone $zone$inlined;
    final /* synthetic */ String $zoneMode$inlined;
    Object L$0;
    int label;
    final /* synthetic */ m4r0 this$0;
    final /* synthetic */ m4r0 this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1(m4r0 m4r0Var, Continuation continuation, m4r0 m4r0Var2, Zone zone, String str) {
        super(1, continuation);
        this.this$0$inline_fun = m4r0Var;
        this.this$0 = m4r0Var2;
        this.$zone$inlined = zone;
        this.$zoneMode$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1(this.this$0$inline_fun, continuation, this.this$0, this.$zone$inlined, this.$zoneMode$inlined);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m4r0 m4r0Var = this.this$0;
            com.yandex.go.taxi.tariffs.factory.a aVar = m4r0Var.b;
            Zone zone = this.$zone$inlined;
            String str = this.$zoneMode$inlined;
            if (str == null) {
                str = m4r0Var.c.a.Q;
            }
            nrx0 nrx0Var = this.this$0.a;
            String l = nrx0Var.b.l("PreferenceUtils.FIELD_DISPLAYABLE_TARIFF_OVERRIDES", null);
            if (l == null) {
                list = EmptyList.a;
            } else {
                list = (List) ((xnt) nrx0Var.a).c(l, nrx0.c);
            }
            this.L$0 = null;
            this.label = 1;
            obj = aVar.a(zone, str, list, this);
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
        return this.this$0$inline_fun.e.a((cwd) obj);
    }
}
