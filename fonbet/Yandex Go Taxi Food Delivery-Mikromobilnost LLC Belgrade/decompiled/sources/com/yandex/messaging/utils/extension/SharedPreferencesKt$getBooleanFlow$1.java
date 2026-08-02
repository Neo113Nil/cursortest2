package com.yandex.messaging.utils.extension;

import android.content.SharedPreferences;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppr0;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.utils.extension.SharedPreferencesKt$getBooleanFlow$1", f = "SharedPreferences.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SharedPreferencesKt$getBooleanFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $default;
    final /* synthetic */ String $key;
    final /* synthetic */ SharedPreferences $this_getBooleanFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesKt$getBooleanFlow$1(SharedPreferences sharedPreferences, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$this_getBooleanFlow = sharedPreferences;
        this.$key = str;
        this.$default = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharedPreferencesKt$getBooleanFlow$1 sharedPreferencesKt$getBooleanFlow$1 = new SharedPreferencesKt$getBooleanFlow$1(this.$this_getBooleanFlow, this.$key, this.$default, continuation);
        sharedPreferencesKt$getBooleanFlow$1.L$0 = obj;
        return sharedPreferencesKt$getBooleanFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPreferencesKt$getBooleanFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            final y6f0 y6f0Var = (y6f0) this.L$0;
            final String str = this.$key;
            final boolean z = this.$default;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: opr0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    String str3 = str;
                    if (jl40.l(str2, str3)) {
                        ((x6f0) y6f0Var).d(Boolean.valueOf(sharedPreferences.getBoolean(str3, z)));
                    }
                }
            };
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.d(Boolean.valueOf(this.$this_getBooleanFlow.getBoolean(str, z)));
            this.$this_getBooleanFlow.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            ppr0 ppr0Var = new ppr0(0, this.$this_getBooleanFlow, onSharedPreferenceChangeListener);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(x6f0Var, ppr0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
