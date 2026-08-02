package com.yandex.messaging.data;

import android.content.SharedPreferences;
import defpackage.mvg;
import defpackage.nao0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.data.SdkPreferenceStore$preferenceChangeFlow$3", f = "SdkPreferenceStore.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SdkPreferenceStore$preferenceChangeFlow$3 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkPreferenceStore$preferenceChangeFlow$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SdkPreferenceStore$preferenceChangeFlow$3 sdkPreferenceStore$preferenceChangeFlow$3 = new SdkPreferenceStore$preferenceChangeFlow$3(this.this$0, continuation);
        sdkPreferenceStore$preferenceChangeFlow$3.L$0 = obj;
        return sdkPreferenceStore$preferenceChangeFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkPreferenceStore$preferenceChangeFlow$3) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final y6f0 y6f0Var = (y6f0) this.L$0;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: upp0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (str != null) {
                        ((x6f0) y6f0.this).d(str);
                    }
                }
            };
            this.this$0.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            nao0 nao0Var = new nao0(17, this.this$0, onSharedPreferenceChangeListener);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, nao0Var, this) == coroutineSingletons) {
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
