package com.yandex.messaging.sdk;

import android.content.SharedPreferences;
import com.yandex.messaging.profile.ProfileCreator$IdCreationType;
import com.yandex.messaging.profile.e;
import defpackage.enp0;
import defpackage.ftn;
import defpackage.jl40;
import defpackage.lqo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pnp0;
import defpackage.q5z;
import defpackage.tje;
import defpackage.tse;
import defpackage.tz10;
import defpackage.wls;
import defpackage.x22;
import defpackage.z8g;
import defpackage.za51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.sdk.SdkComponentHolder$init$1$1", f = "SdkComponentHolder.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SdkComponentHolder$init$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ enp0 $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkComponentHolder$init$1$1(enp0 enp0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = enp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkComponentHolder$init$1$1(this.$this_apply, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkComponentHolder$init$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.messaging.auth.passport.b bVar;
        ProfileCreator$IdCreationType profileCreator$IdCreationType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lqo lqoVar = ((z8g) this.$this_apply).a.d;
            q5z.i(lqoVar);
            if (lqoVar.a(tz10.Y) && (bVar = ((z8g) this.$this_apply).a.n) != null) {
                this.label = 1;
                if (com.yandex.messaging.auth.passport.b.b(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        e eVar = (e) ((z8g) this.$this_apply).F.get();
        eVar.getClass();
        tje.e();
        za51 za51Var = eVar.e;
        SharedPreferences sharedPreferences = za51Var.b;
        SharedPreferences sharedPreferences2 = za51Var.b;
        String string = sharedPreferences.getString("workspace_id", null);
        String str = za51Var.a.c;
        if (str == null) {
            str = "default";
        }
        if (string == null) {
            sharedPreferences2.edit().putString("workspace_id", str).apply();
        } else if (!jl40.l(sharedPreferences2.getString("workspace_id", null), str)) {
            sharedPreferences2.edit().putString("workspace_id", str).apply();
            profileCreator$IdCreationType = ProfileCreator$IdCreationType.REGENERATE;
            eVar.a(eVar.b.a(profileCreator$IdCreationType));
            x22 a = ((z8g) this.$this_apply).a();
            if (ftn.e()) {
                ftn.a().k(new pnp0(a));
            }
            q5z.i(((z8g) this.$this_apply).a.k);
            return zy11.a;
        }
        profileCreator$IdCreationType = ProfileCreator$IdCreationType.USE_DEFAULT_OR_INITIAL;
        eVar.a(eVar.b.a(profileCreator$IdCreationType));
        x22 a2 = ((z8g) this.$this_apply).a();
        if (ftn.e()) {
        }
        q5z.i(((z8g) this.$this_apply).a.k);
        return zy11.a;
    }
}
