package com.ybsdk.screens.registration.codeconfirmation.presentation;

import defpackage.gao;
import defpackage.i9c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9c;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.r9c;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.ur80;
import defpackage.vqb;
import defpackage.vr80;
import defpackage.w511;
import defpackage.wls;
import defpackage.wr80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewModel$onCodeReady$2", f = "CodeConfirmationViewModel.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CodeConfirmationViewModel$onCodeReady$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeConfirmationViewModel$onCodeReady$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CodeConfirmationViewModel$onCodeReady$2(this.this$0, this.$code, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CodeConfirmationViewModel$onCodeReady$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        boolean z;
        CodeConfirmationViewState$CodeState codeConfirmationViewState$CodeState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            i9c i9cVar = cVar.C;
            String str = this.$code;
            int i2 = ((a) cVar.X()).g;
            c cVar2 = this.this$0;
            this.label = 1;
            Object a = i9cVar.a(str, i2, cVar2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        c cVar3 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            wr80 wr80Var = (wr80) obj2;
            pz40 Y = cVar3.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, a.a((a) value2, null, 0L, 0L, 0, new r8j0(wr80Var, null, 14), null, null, false, null, 16255)));
            if (wr80Var instanceof ur80) {
                pz40 Y2 = cVar3.Y();
                do {
                    r0Var4 = (r0) Y2;
                    value4 = r0Var4.getValue();
                    z = ((ur80) wr80Var).e;
                    codeConfirmationViewState$CodeState = CodeConfirmationViewState$CodeState.ERROR;
                } while (!r0Var4.k(value4, a.a((a) value4, null, 0L, 0L, 0, null, null, null, z, codeConfirmationViewState$CodeState, 4095)));
                c.b0(cVar3, codeConfirmationViewState$CodeState);
            } else {
                if (!(wr80Var instanceof vr80)) {
                    w511.b();
                    return null;
                }
                cVar3.Z(new o9c(CodeConfirmationViewState$CodeState.SUCCESS));
                pz40 Y3 = cVar3.Y();
                do {
                    r0Var3 = (r0) Y3;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, a.a((a) value3, null, 0L, 0L, 0, null, null, null, false, CodeConfirmationViewState$CodeState.SUCCESS, 4095)));
                cVar3.C.b((vr80) wr80Var, new vqb(9, cVar3));
            }
        }
        c cVar4 = this.this$0;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            cVar4.K.s(((a) cVar4.X()).g, a2);
            cVar4.Z(new r9c(gao.e(null, null, a2, 3)));
            pz40 Y4 = cVar4.Y();
            do {
                r0Var = (r0) Y4;
                value = r0Var.getValue();
            } while (!r0Var.k(value, a.a((a) value, null, 0L, 0L, 0, new s8j0(a2), null, null, false, null, 16255)));
        }
        return zy11.a;
    }
}
