package com.ybsdk.feature.pfm.internal.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.r9b0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.wcb0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pfm.internal.ui.PfmViewModel$loadPfmTransactionsNextPage$2", f = "PfmViewModel.kt", l = {538}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PfmViewModel$loadPfmTransactionsNextPage$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $cursor;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PfmViewModel$loadPfmTransactionsNextPage$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cursor = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PfmViewModel$loadPfmTransactionsNextPage$2(this.this$0, this.$cursor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PfmViewModel$loadPfmTransactionsNextPage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        r0 r0Var;
        Object value;
        wcb0 wcb0Var;
        r0 r0Var2;
        Object value2;
        wcb0 wcb0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            String str = this.$cursor;
            this.label = 1;
            Object e0 = bVar.e0(str, this);
            if (e0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = e0;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            r9b0 r9b0Var = (r9b0) obj2;
            pz40 Y = bVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                wcb0Var2 = (wcb0) value2;
            } while (!r0Var2.k(value2, wcb0.a(wcb0Var2, null, kotlin.collections.a.o0(kotlin.collections.a.K(wcb0Var2.c), new r8j0(r9b0Var, null, 14)), null, null, null, null, null, null, 507)));
        }
        b bVar3 = this.this$0;
        Throwable a = Result.a(obj2);
        if (a != null) {
            pz40 Y2 = bVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                wcb0Var = (wcb0) value;
            } while (!r0Var.k(value, wcb0.a(wcb0Var, null, kotlin.collections.a.o0(kotlin.collections.a.K(wcb0Var.c), new s8j0(a)), null, null, null, null, null, null, 507)));
        }
        return zy11.a;
    }
}
