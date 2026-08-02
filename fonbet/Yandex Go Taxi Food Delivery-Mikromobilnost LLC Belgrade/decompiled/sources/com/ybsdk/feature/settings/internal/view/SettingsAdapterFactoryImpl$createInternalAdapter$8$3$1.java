package com.ybsdk.feature.settings.internal.view;

import android.app.Activity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Activity;", "it", "Lzy11;", "<anonymous>", "(Landroid/app/Activity;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.view.SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1", f = "SettingsAdapterFactoryImpl.kt", l = {231}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1(b bVar, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1(this.this$0, this.$activity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1 settingsAdapterFactoryImpl$createInternalAdapter$8$3$1 = (SettingsAdapterFactoryImpl$createInternalAdapter$8$3$1) create((Activity) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        settingsAdapterFactoryImpl$createInternalAdapter$8$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.getClass();
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
