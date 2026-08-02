package com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit;

import com.ybsdk.feature.transactions.impl.data.c;
import defpackage.mjl;
import defpackage.mvg;
import defpackage.njl;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
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
@mvg(c = "com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit.DivTransactionInfoViewModel$loadData$1", f = "DivTransactionInfoViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivTransactionInfoViewModel$loadData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTransactionInfoViewModel$loadData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivTransactionInfoViewModel$loadData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivTransactionInfoViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        t8j0 t8j0Var;
        Object a;
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
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                t8j0Var = new t8j0();
                ((njl) value).getClass();
            } while (!r0Var.k(value, new njl(t8j0Var)));
            a aVar = this.this$0;
            c cVar = aVar.B;
            String transactionId = aVar.D.getTransactionId();
            this.label = 1;
            a = cVar.a(transactionId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            mjl mjlVar = (mjl) a;
            pz40 Y2 = aVar2.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
                r8j0Var = new r8j0(mjlVar, null, 14);
                ((njl) value3).getClass();
            } while (!r0Var3.k(value3, new njl(r8j0Var)));
        }
        a aVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            pz40 Y3 = aVar3.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
                s8j0Var = new s8j0(a2);
                ((njl) value2).getClass();
            } while (!r0Var2.k(value2, new njl(s8j0Var)));
        }
        return zy11.a;
    }
}
