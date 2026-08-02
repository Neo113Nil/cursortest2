package com.ybsdk.persistence;

import android.content.SharedPreferences;
import com.ybsdk.persistence.b;
import defpackage.ew2;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zr01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.persistence.UserIndependentStorage$hapticChangedFlow$1", f = "UserIndependentStorage.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class UserIndependentStorage$hapticChangedFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserIndependentStorage$hapticChangedFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserIndependentStorage$hapticChangedFlow$1 userIndependentStorage$hapticChangedFlow$1 = new UserIndependentStorage$hapticChangedFlow$1(this.this$0, continuation);
        userIndependentStorage$hapticChangedFlow$1.L$0 = obj;
        return userIndependentStorage$hapticChangedFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserIndependentStorage$hapticChangedFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final y6f0 y6f0Var = (y6f0) this.L$0;
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.getClass();
            ew2 ew2Var = this.this$0.b;
            kgx kgxVar = b.l[0];
            x6f0Var.d(ew2Var.a());
            final b bVar = this.this$0;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: hn21
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    i5z0.a.a(g8e.o("preference changed ", str), new Object[0]);
                    if (jl40.l(str, "is_haptic_feedback_enabled")) {
                        x6f0 x6f0Var2 = (x6f0) y6f0.this;
                        x6f0Var2.getClass();
                        ew2 ew2Var2 = bVar.b;
                        kgx kgxVar2 = b.l[0];
                        x6f0Var2.d(ew2Var2.a());
                    }
                }
            };
            bVar.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            zr01 zr01Var = new zr01(19, this.this$0, onSharedPreferenceChangeListener);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, zr01Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
