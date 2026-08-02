package com.yandex.go.chargers.discovery.ui;

import defpackage.avj0;
import defpackage.bx9;
import defpackage.ej1;
import defpackage.h3y;
import defpackage.hx9;
import defpackage.ix9;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.nc60;
import defpackage.ny61;
import defpackage.oc60;
import defpackage.pc60;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.systemrequeirements.location.n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discovery.ui.ChargersDiscoveryPresenter$onGeoClick$1", f = "ChargersDiscoveryPresenter.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersDiscoveryPresenter$onGeoClick$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ bx9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscoveryPresenter$onGeoClick$1(bx9 bx9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bx9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDiscoveryPresenter$onGeoClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDiscoveryPresenter$onGeoClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ej1 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean b2 = this.this$0.z.b();
            bx9 bx9Var = this.this$0;
            if (b2) {
                hx9 hx9Var = (hx9) bx9Var.D.b;
                String h = ((avj0) ((zuj0) hx9Var.E)).h(kyh0.charger_location_permission_need_modal_view_description);
                b = ((pc60) ((oc60) ((h3y) hx9Var.P).get())).b(false);
                hx9Var.A(b, new nc60(h), sy60.Q2);
            } else {
                boolean c = bx9Var.z.c();
                bx9 bx9Var2 = this.this$0;
                if (c) {
                    n nVar = bx9Var2.z;
                    this.label = 1;
                    if (nVar.d(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    ((ix9) bx9Var2.Dg()).updateUserPosition();
                }
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
