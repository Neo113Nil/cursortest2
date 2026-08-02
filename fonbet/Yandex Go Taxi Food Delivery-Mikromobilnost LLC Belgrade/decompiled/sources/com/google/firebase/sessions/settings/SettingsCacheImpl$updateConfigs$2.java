package com.google.firebase.sessions.settings;

import defpackage.mvg;
import defpackage.myq0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmyq0;", "it", "<anonymous>", "(Lmyq0;)Lmyq0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SettingsCacheImpl$updateConfigs$2 extends SuspendLambda implements wls {
    final /* synthetic */ myq0 $sessionConfigs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$updateConfigs$2(myq0 myq0Var, Continuation continuation) {
        super(2, continuation);
        this.$sessionConfigs = myq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsCacheImpl$updateConfigs$2(this.$sessionConfigs, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsCacheImpl$updateConfigs$2) create((myq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.$sessionConfigs;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
