package com.yandex.messaging.ui.settings;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.SettingsComposeFragment$SettingsScreenRoot$1$1$1", f = "SettingsComposeFragment.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SettingsComposeFragment$SettingsScreenRoot$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ pkz $logoutUiDelegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsComposeFragment$SettingsScreenRoot$1$1$1(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SettingsComposeFragment$SettingsScreenRoot$1$1$1 settingsComposeFragment$SettingsScreenRoot$1$1$1 = (SettingsComposeFragment$SettingsScreenRoot$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        settingsComposeFragment$SettingsScreenRoot$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
