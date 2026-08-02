package com.yandex.messaging.profile;

import android.os.Looper;
import defpackage.eff0;
import defpackage.i5m;
import defpackage.kse;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.sjh;
import defpackage.t6f0;
import defpackage.t9a0;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uti0;
import defpackage.uyj;
import defpackage.v320;
import defpackage.vef0;
import defpackage.wls;
import defpackage.yef0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.ProfileManager$asyncProfile$1$1", f = "ProfileManager.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ProfileManager$asyncProfile$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $newAsyncProfile;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileManager$asyncProfile$1$1(noh nohVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$newAsyncProfile = nohVar;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileManager$asyncProfile$1$1(this.$newAsyncProfile, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileManager$asyncProfile$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            noh nohVar = this.$newAsyncProfile;
            this.label = 1;
            obj = nohVar.k(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        v320 v320Var = (v320) obj;
        h hVar = this.this$0.f;
        hVar.getClass();
        yef0 yef0Var = (yef0) ((p8g) v320Var).Z.get();
        sjh sjhVar = uyj.a;
        tje.N(yef0Var, mdh.b, null, new SdkComponentManager$dispatchComponents$1(v320Var, hVar, null), 2);
        vef0 vef0Var = this.this$0.c;
        kse.b(vef0Var.a);
        vef0Var.d = new t9a0(28, v320Var);
        uti0 uti0Var = vef0Var.c;
        if (uti0Var != null) {
            uti0Var.close();
        }
        p8g p8gVar = (p8g) v320Var;
        vef0Var.c = new uti0(new tig0(i5m.a(p8gVar.l0), (Looper) p8gVar.b.d.get()), new t6f0(1, vef0Var));
        e eVar = this.this$0;
        v320 v320Var2 = eVar.j;
        if (v320Var2 != null) {
            ((eff0) ((p8g) v320Var2).b0.get()).a();
            eVar.j = null;
        }
        this.this$0.j = v320Var;
        return zy11.a;
    }
}
