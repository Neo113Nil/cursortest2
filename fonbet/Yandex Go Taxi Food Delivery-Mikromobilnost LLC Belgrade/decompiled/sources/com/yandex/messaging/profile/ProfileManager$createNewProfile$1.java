package com.yandex.messaging.profile;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.qoh;
import defpackage.tse;
import defpackage.v320;
import defpackage.wl3;
import defpackage.wls;
import defpackage.xqi0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.ProfileManager$createNewProfile$1", f = "ProfileManager.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ProfileManager$createNewProfile$1 extends SuspendLambda implements wls {
    final /* synthetic */ wl3 $authUid;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileManager$createNewProfile$1(e eVar, wl3 wl3Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$authUid = wl3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileManager$createNewProfile$1(this.this$0, this.$authUid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileManager$createNewProfile$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xqi0 xqi0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh qohVar = this.this$0.i;
            if (qohVar != null) {
                this.label = 1;
                obj = qohVar.s(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v320 v320Var = (v320) obj;
        if (v320Var != null && (xqi0Var = (xqi0) ((p8g) v320Var).v.get()) != null) {
            xqi0Var.f(this.$authUid);
        }
        return zy11.a;
    }
}
