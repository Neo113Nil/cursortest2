package com.yandex.messaging.ui.neophonish;

import android.content.Intent;
import com.yandex.messaging.auth.CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1;
import defpackage.dm50;
import defpackage.fm50;
import defpackage.hff;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wl3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.neophonish.NeophonishAttachMenuViewModel$onGoToYandexId$1", f = "NeophonishAttachMenuViewModel.kt", l = {32, 35}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NeophonishAttachMenuViewModel$onGoToYandexId$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ fm50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeophonishAttachMenuViewModel$onGoToYandexId$1(fm50 fm50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fm50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NeophonishAttachMenuViewModel$onGoToYandexId$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NeophonishAttachMenuViewModel$onGoToYandexId$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            fm50 fm50Var = this.this$0;
            dm50 dm50Var = new dm50(a);
            this.label = 2;
            if (fm50Var.W(dm50Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
