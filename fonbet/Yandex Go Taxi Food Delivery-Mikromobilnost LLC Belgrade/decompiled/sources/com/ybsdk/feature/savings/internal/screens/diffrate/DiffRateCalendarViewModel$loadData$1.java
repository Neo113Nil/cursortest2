package com.ybsdk.feature.savings.internal.screens.diffrate;

import com.ybsdk.core.analytics.generated.PlusStatusDiffRate;
import com.ybsdk.core.analytics.generated.delegates.DiffRateEvents$BottomsheetDiffRateCalendarLoadedResult;
import defpackage.bij;
import defpackage.eij;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qoh;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarViewModel$loadData$1", f = "DiffRateCalendarViewModel.kt", l = {109, 110}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DiffRateCalendarViewModel$loadData$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiffRateCalendarViewModel$loadData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DiffRateCalendarViewModel$loadData$1 diffRateCalendarViewModel$loadData$1 = new DiffRateCalendarViewModel$loadData$1(this.this$0, continuation);
        diffRateCalendarViewModel$loadData$1.L$0 = obj;
        return diffRateCalendarViewModel$loadData$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiffRateCalendarViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        t8j0 t8j0Var;
        noh h;
        a aVar;
        r0 r0Var2;
        Object value2;
        s8j0 s8j0Var;
        r0 r0Var3;
        Object value3;
        r8j0 r8j0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            a aVar2 = this.this$0;
            aVar2.I = false;
            pz40 Y = aVar2.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                t8j0Var = new t8j0();
                ((eij) value).getClass();
            } while (!r0Var.k(value, new eij(t8j0Var)));
            qoh h2 = tje.h(tseVar, null, null, new DiffRateCalendarViewModel$loadData$1$plusDeferred$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new DiffRateCalendarViewModel$loadData$1$calendarDeferred$1(this.this$0, null), 3);
            a aVar3 = this.this$0;
            this.L$0 = h;
            this.L$1 = aVar3;
            this.label = 1;
            Object s = h2.s(this);
            if (s != coroutineSingletons) {
                aVar = aVar3;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            Object value4 = ((Result) obj).getValue();
            a aVar4 = this.this$0;
            Throwable a = Result.a(value4);
            if (a == null) {
                bij bijVar = (bij) value4;
                aVar4.I = true;
                pz40 Y2 = aVar4.Y();
                do {
                    r0Var3 = (r0) Y2;
                    value3 = r0Var3.getValue();
                    r8j0Var = new r8j0(bijVar, null, 14);
                    ((eij) value3).getClass();
                } while (!r0Var3.k(value3, new eij(r8j0Var)));
            } else {
                pz40 Y3 = aVar4.Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                    s8j0Var = new s8j0(a);
                    ((eij) value2).getClass();
                } while (!r0Var2.k(value2, new eij(s8j0Var)));
                aVar4.F.u.b(DiffRateEvents$BottomsheetDiffRateCalendarLoadedResult.ERROR, "", aVar4.H ? PlusStatusDiffRate.ACTIVE : PlusStatusDiffRate.INACTIVE);
            }
            return zy11.a;
        }
        aVar = (a) this.L$1;
        h = (noh) this.L$0;
        b.b(obj);
        aVar.H = ((Boolean) obj).booleanValue();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = h.k(this);
    }
}
