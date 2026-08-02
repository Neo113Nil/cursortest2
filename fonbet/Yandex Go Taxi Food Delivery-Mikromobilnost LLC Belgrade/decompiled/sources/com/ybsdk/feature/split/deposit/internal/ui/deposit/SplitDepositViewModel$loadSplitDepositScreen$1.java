package com.ybsdk.feature.split.deposit.internal.ui.deposit;

import defpackage.ctt0;
import defpackage.itt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.vut0;
import defpackage.w511;
import defpackage.wls;
import defpackage.ztt0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositViewModel$loadSplitDepositScreen$1", f = "SplitDepositViewModel.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositViewModel$loadSplitDepositScreen$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositViewModel$loadSplitDepositScreen$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplitDepositViewModel$loadSplitDepositScreen$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositViewModel$loadSplitDepositScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b;
        Object s8j0Var;
        u8j0 t8j0Var;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, vut0.a((vut0) value, new t8j0(), false, null, 254)));
            a aVar = this.this$0;
            com.ybsdk.feature.split.deposit.internal.data.deposit.repository.a aVar2 = aVar.B;
            String str = ((vut0) aVar.X()).f;
            String str2 = ((vut0) this.this$0.X()).g;
            String str3 = ((vut0) this.this$0.X()).h;
            this.label = 1;
            b = aVar2.b(str, str2, str3, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(b);
        if (a == null) {
            ztt0 ztt0Var = (ztt0) b;
            itt0 itt0Var = aVar3.G;
            itt0Var.a = new ctt0(ztt0Var.b, itt0Var.a.b);
            s8j0Var = new r8j0(ztt0Var, null, 14);
        } else {
            s8j0Var = new s8j0(a);
        }
        if (s8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) s8j0Var;
            t8j0Var = new r8j0(((ztt0) r8j0Var.a).a, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (s8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) s8j0Var).a);
        } else {
            if (!(s8j0Var instanceof t8j0)) {
                w511.b();
                return null;
            }
            t8j0Var = new t8j0();
        }
        pz40 Y2 = this.this$0.Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, vut0.a((vut0) value2, t8j0Var, false, null, 254)));
        return zy11.a;
    }
}
