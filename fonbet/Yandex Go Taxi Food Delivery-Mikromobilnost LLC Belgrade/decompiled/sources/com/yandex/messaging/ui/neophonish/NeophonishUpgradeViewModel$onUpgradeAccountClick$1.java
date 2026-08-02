package com.yandex.messaging.ui.neophonish;

import android.content.Intent;
import com.yandex.messaging.auth.CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1;
import defpackage.hff;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rm50;
import defpackage.tje;
import defpackage.tm50;
import defpackage.tse;
import defpackage.wl3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.neophonish.NeophonishUpgradeViewModel$onUpgradeAccountClick$1", f = "NeophonishUpgradeViewModel.kt", l = {30, 33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NeophonishUpgradeViewModel$onUpgradeAccountClick$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ tm50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeophonishUpgradeViewModel$onUpgradeAccountClick$1(tm50 tm50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tm50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NeophonishUpgradeViewModel$onUpgradeAccountClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NeophonishUpgradeViewModel$onUpgradeAccountClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Intent a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            hff hffVar = this.this$0.y;
            this.label = 1;
            hffVar.getClass();
            obj = tje.k0(get_context(), new CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1(null, hffVar), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        wl3 wl3Var = (wl3) obj;
        if (wl3Var != null && (a = this.this$0.z.a(wl3Var)) != null) {
            tm50 tm50Var = this.this$0;
            rm50 rm50Var = new rm50(a);
            this.label = 2;
            if (tm50Var.W(rm50Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
