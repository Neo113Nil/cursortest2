package com.ybsdk.feature.settings.internal.view;

import androidx.fragment.app.FragmentActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.view.SettingsAdapterFactoryImpl$launchInLifecycleScope$1", f = "SettingsAdapterFactoryImpl.kt", l = {262}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsAdapterFactoryImpl$launchInLifecycleScope$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $action;
    final /* synthetic */ FragmentActivity $fragmentActivity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAdapterFactoryImpl$launchInLifecycleScope$1(wls wlsVar, FragmentActivity fragmentActivity, Continuation continuation) {
        super(2, continuation);
        this.$action = wlsVar;
        this.$fragmentActivity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsAdapterFactoryImpl$launchInLifecycleScope$1(this.$action, this.$fragmentActivity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsAdapterFactoryImpl$launchInLifecycleScope$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wls wlsVar = this.$action;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            this.label = 1;
            if (wlsVar.invoke(fragmentActivity, this) == coroutineSingletons) {
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
