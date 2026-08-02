package com.yandex.messaging.ui.settings;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdr0;
import defpackage.wls;
import defpackage.x4b0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4b0;", "info", "Lzy11;", "<anonymous>", "(Lx4b0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.SettingsScreenViewModel$observePhoneNumber$1", f = "SettingsScreenViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SettingsScreenViewModel$observePhoneNumber$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsScreenViewModel$observePhoneNumber$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SettingsScreenViewModel$observePhoneNumber$1 settingsScreenViewModel$observePhoneNumber$1 = new SettingsScreenViewModel$observePhoneNumber$1(this.this$0, continuation);
        settingsScreenViewModel$observePhoneNumber$1.L$0 = obj;
        return settingsScreenViewModel$observePhoneNumber$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SettingsScreenViewModel$observePhoneNumber$1 settingsScreenViewModel$observePhoneNumber$1 = (SettingsScreenViewModel$observePhoneNumber$1) create((x4b0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        settingsScreenViewModel$observePhoneNumber$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        x4b0 x4b0Var = (x4b0) this.L$0;
        r0 r0Var = this.this$0.G;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, pdr0.a((pdr0) value, false, false, false, false, x4b0Var.f, null, null, false, false, 507903)));
        return zy11.a;
    }
}
