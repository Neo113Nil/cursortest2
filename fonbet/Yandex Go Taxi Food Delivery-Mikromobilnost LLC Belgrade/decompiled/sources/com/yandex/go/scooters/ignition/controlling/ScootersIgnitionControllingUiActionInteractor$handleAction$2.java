package com.yandex.go.scooters.ignition.controlling;

import android.content.Context;
import com.yandex.go.scooters.ignition.controlling.enabled_notification.ScootersIgnitionControllingEnabledNotification;
import com.yandex.go.scooters.ignition.data.j;
import com.yandex.go.scooters.ignition.domain.k;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.brn0;
import defpackage.k7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.tj60;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w040;
import defpackage.wls;
import defpackage.wz1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiActionInteractor$handleAction$2", f = "ScootersIgnitionControllingUiActionInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 58, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiActionInteractor$handleAction$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiActionInteractor$handleAction$2(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionControllingUiActionInteractor$handleAction$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingUiActionInteractor$handleAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r10 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r10.d(r9) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r10.b(r9) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0.i;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    w040 w040Var = this.this$0.j;
                    w040Var.getClass();
                    ScootersIgnitionControllingEnabledNotification scootersIgnitionControllingEnabledNotification = new ScootersIgnitionControllingEnabledNotification((Context) w040Var.a, (pav) w040Var.b, (tse) w040Var.c, (k7x0) w040Var.d, (pwy0) w040Var.e, (ru.yandex.taxi.widget.c) w040Var.f, (brn0) w040Var.h, null);
                    tj60 tj60Var = (tj60) w040Var.g;
                    scootersIgnitionControllingEnabledNotification.setExpiresListener(new wz1(16, w040Var));
                    tj60Var.d(scootersIgnitionControllingEnabledNotification);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            tpr a = this.this$0.f.a();
            this.label = 3;
            obj = kotlinx.coroutines.flow.e.y(a, this);
        }
        k kVar = this.this$0.c;
        this.label = 2;
    }
}
