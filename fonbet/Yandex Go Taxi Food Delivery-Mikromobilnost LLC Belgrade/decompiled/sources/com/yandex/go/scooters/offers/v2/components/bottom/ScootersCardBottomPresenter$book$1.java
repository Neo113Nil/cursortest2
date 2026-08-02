package com.yandex.go.scooters.offers.v2.components.bottom;

import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.d;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s4n0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomPresenter$book$1", f = "ScootersCardBottomPresenter.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersCardBottomPresenter$book$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ s4n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardBottomPresenter$book$1(s4n0 s4n0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s4n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardBottomPresenter$book$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardBottomPresenter$book$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (((defpackage.r95) r1).a(r5) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s4n0 s4n0Var;
        Object a;
        Throwable th;
        s4n0 s4n0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s4n0Var2 = (s4n0) this.L$0;
                    try {
                        b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return zy11.a;
                }
                s4n0 s4n0Var3 = (s4n0) this.L$0;
                try {
                    b.b(obj);
                    a = obj;
                    s4n0Var = s4n0Var3;
                } catch (Throwable th3) {
                    th = th3;
                    s4n0Var2 = s4n0Var3;
                }
                s4n0Var2.Kg(th);
                return zy11.a;
            }
            b.b(obj);
            s4n0Var = this.this$0;
            try {
                d dVar = s4n0Var.A;
                this.L$0 = s4n0Var;
                this.label = 1;
                a = dVar.a(this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th4) {
                s4n0 s4n0Var4 = s4n0Var;
                th = th4;
                s4n0Var2 = s4n0Var4;
            }
            this.L$0 = s4n0Var;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
