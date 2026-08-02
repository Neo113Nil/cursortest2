package com.ybsdk.screens.upgrade.presentation.edit;

import defpackage.ja21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb21;
import defpackage.z921;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lja21;", "form", "Lsb21;", "innSuggest", "Lzy11;", "<anonymous>", "(Lja21;Lsb21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditViewModel$3", f = "UpgradeEditViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeEditViewModel$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeEditViewModel$3(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpgradeEditViewModel$3 upgradeEditViewModel$3 = new UpgradeEditViewModel$3(this.this$0, (Continuation) obj3);
        upgradeEditViewModel$3.L$0 = (ja21) obj;
        upgradeEditViewModel$3.L$1 = (sb21) obj2;
        zy11 zy11Var = zy11.a;
        upgradeEditViewModel$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ja21 ja21Var = (ja21) this.L$0;
        sb21 sb21Var = (sb21) this.L$1;
        b bVar = this.this$0;
        bVar.f0(z921.a((z921) bVar.X(), null, ja21Var, sb21Var, 1));
        return zy11.a;
    }
}
