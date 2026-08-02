package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import defpackage.b24;
import defpackage.mu3;
import defpackage.mvg;
import defpackage.n04;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.q;
import defpackage.s24;
import defpackage.tse;
import defpackage.u04;
import defpackage.uy21;
import defpackage.wls;
import defpackage.z1b1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2ViewModel$saveAutoTopupSetting$1", f = "AutoTopupSetupV2ViewModel.kt", l = {737}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupV2ViewModel$saveAutoTopupSetting$1 extends SuspendLambda implements wls {
    final /* synthetic */ mu3 $bottomSheetState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupV2ViewModel$saveAutoTopupSetting$1(b bVar, mu3 mu3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$bottomSheetState = mu3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupV2ViewModel$saveAutoTopupSetting$1(this.this$0, this.$bottomSheetState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupV2ViewModel$saveAutoTopupSetting$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s24 s24Var;
        b bVar;
        mu3 mu3Var;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n04 n04Var = (n04) ((u04) this.this$0.X()).a.a();
            if (n04Var != null) {
                b24 b24Var = n04Var.e;
                mu3 mu3Var2 = this.$bottomSheetState;
                b bVar3 = this.this$0;
                s24 e = z1b1.e(b24Var, mu3Var2.a.a, mu3Var2.b.a);
                this.L$0 = mu3Var2;
                this.L$1 = bVar3;
                this.L$2 = e;
                this.label = 1;
                if (b.f0(bVar3, e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                s24Var = e;
                bVar = bVar3;
                mu3Var = mu3Var2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        s24 s24Var2 = (s24) this.L$2;
        bVar = (b) this.L$1;
        mu3Var = (mu3) this.L$0;
        kotlin.b.b(obj);
        s24Var = s24Var2;
        uy21 uy21Var = ((u04) bVar.X()).n;
        if (uy21Var != null) {
            if (uy21Var.b.isEmpty()) {
                pz40 Y = bVar.Y();
                while (true) {
                    r0 r0Var = (r0) Y;
                    Object value = r0Var.getValue();
                    bVar2 = bVar;
                    if (r0Var.k(value, u04.a((u04) value, null, null, null, s24Var, null, null, null, null, null, null, null, null, null, null, false, 32759))) {
                        break;
                    }
                    bVar = bVar2;
                }
                bVar2.h0();
            } else {
                b bVar4 = bVar;
                bVar4.a0(new q(14, bVar4, uy21Var, mu3Var));
            }
        }
        return zy11.a;
    }
}
