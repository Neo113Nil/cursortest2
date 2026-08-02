package com.yandex.go.taxi.order.common;

import defpackage.bq70;
import defpackage.cq70;
import defpackage.egz;
import defpackage.hq70;
import defpackage.jq6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw70;
import defpackage.y9x0;
import defpackage.yp70;
import defpackage.z9x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.common.OrderFragmentPresenterDelegate$resume$1", f = "OrderFragmentPresenterDelegate.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderFragmentPresenterDelegate$resume$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenterDelegate$resume$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderFragmentPresenterDelegate$resume$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenterDelegate$resume$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x002f -> B:5:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq6 jq6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.channels.a aVar = this.this$0.F;
            aVar.getClass();
            jq6Var = new jq6(aVar);
            this.L$0 = jq6Var;
            this.label = 1;
            obj = jq6Var.a(this);
            if (obj == coroutineSingletons) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jq6Var = (jq6) this.L$0;
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                o2y0 o2y0Var = (o2y0) jq6Var.b();
                f fVar = this.this$0;
                hq70 hq70Var = fVar.k;
                DriveState c = o2y0Var.c();
                xw70 xw70Var = fVar.A;
                if (xw70Var != null) {
                    xw70Var.invoke(c);
                }
                fVar.m.f(c);
                if (c.compareTo(DriveState.DRIVING) >= 0) {
                    ((z9x0) ((y9x0) fVar.l.get())).a(new egz());
                }
                boolean b = fVar.q.b(o2y0Var.b().a, o2y0Var.b().b.b);
                if (b && c.compareTo(DriveState.TRANSPORTING) >= 0 && c.compareTo(DriveState.COMPLETE) < 0) {
                    hq70Var.a(new bq70(o2y0Var));
                } else if (b && c == DriveState.COMPLETE) {
                    hq70Var.a(new cq70(o2y0Var));
                }
                if (c.compareTo(DriveState.CANCELLED) >= 0) {
                    hq70Var.a(new yp70(o2y0Var));
                }
                this.L$0 = jq6Var;
                this.label = 1;
                obj = jq6Var.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
            }
        }
    }
}
