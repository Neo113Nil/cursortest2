package com.yandex.go.chargers.payments.domain;

import defpackage.cne0;
import defpackage.cxq0;
import defpackage.i3y;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.payments.domain.ChargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1", f = "ChargersPaymentComponentHolderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1 chargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1 = (ChargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        lv90 lv90Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        cxq0 cxq0Var = this.this$0.d;
        if (!((cne0) ((i3y) cxq0Var.x).getValue()).g("migrated", false) && (l = ((cne0) ((i3y) cxq0Var.x).getValue()).l("no_feature", null)) != null) {
            try {
                lv90Var = (lv90) ((xnt) ((wnt) cxq0Var.w)).c(l, lv90.Companion.serializer());
            } catch (Exception unused) {
            }
        }
        if (lv90Var != null) {
            this.this$0.c().e.a(lv90Var, "no_feature");
        }
        ((cne0) ((i3y) this.this$0.d.x).getValue()).u("migrated", true);
        return zy11.a;
    }
}
