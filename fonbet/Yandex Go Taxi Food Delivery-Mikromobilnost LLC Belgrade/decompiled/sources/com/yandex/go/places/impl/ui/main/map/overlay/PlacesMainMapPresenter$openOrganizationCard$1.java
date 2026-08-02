package com.yandex.go.places.impl.ui.main.map.overlay;

import defpackage.i4b0;
import defpackage.muj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t9c0;
import defpackage.ti80;
import defpackage.tse;
import defpackage.u3m;
import defpackage.uac0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.overlay.PlacesMainMapPresenter$openOrganizationCard$1", f = "PlacesMainMapPresenter.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMainMapPresenter$openOrganizationCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ ti80 $id;
    int label;
    final /* synthetic */ uac0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMainMapPresenter$openOrganizationCard$1(uac0 uac0Var, ti80 ti80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uac0Var;
        this.$id = ti80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMainMapPresenter$openOrganizationCard$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMainMapPresenter$openOrganizationCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uac0 uac0Var = this.this$0;
            uac0Var.K = true;
            com.yandex.go.places.experiments.flex.b bVar = uac0Var.H;
            this.label = 1;
            b = bVar.b(t9c0.b, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        u3m u3mVar = (u3m) b;
        boolean z = u3mVar != null && u3mVar.c;
        uac0 uac0Var2 = this.this$0;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b.c(uac0Var2.y, muj.b, this.$id, uac0Var2.B.a(), null, null, false, z, null, z, false, false, false, false, null, new i4b0(21, this.this$0), 15360);
        return zy11.a;
    }
}
