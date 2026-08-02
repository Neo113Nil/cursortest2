package com.yandex.go.taxi.order.performer;

import defpackage.jbm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oim;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.performer.DriverInfoProcessing$makeRequestIfNeeded$1", f = "DriverInfoProcessing.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DriverInfoProcessing$makeRequestIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $performerTag;
    final /* synthetic */ wls $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oim this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverInfoProcessing$makeRequestIfNeeded$1(wls wlsVar, String str, oim oimVar, Continuation continuation) {
        super(2, continuation);
        this.$request = wlsVar;
        this.$performerTag = str;
        this.this$0 = oimVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriverInfoProcessing$makeRequestIfNeeded$1(this.$request, this.$performerTag, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriverInfoProcessing$makeRequestIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oim oimVar;
        oim oimVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                wls wlsVar = this.$request;
                String str = this.$performerTag;
                oim oimVar3 = this.this$0;
                try {
                    this.L$0 = oimVar3;
                    this.L$1 = oimVar3;
                    this.label = 1;
                    if (wlsVar.invoke(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oimVar2 = oimVar3;
                    oimVar = oimVar2;
                } catch (Throwable th) {
                    th = th;
                    oimVar = oimVar3;
                    oimVar.b.b("makeRequestIfNeeded", th, new jbm(14));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oimVar = (oim) this.L$1;
                oimVar2 = (oim) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    oimVar.b.b("makeRequestIfNeeded", th, new jbm(14));
                    return zy11.a;
                }
            }
            oimVar2.e = true;
            r0 r0Var = oimVar2.c;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
