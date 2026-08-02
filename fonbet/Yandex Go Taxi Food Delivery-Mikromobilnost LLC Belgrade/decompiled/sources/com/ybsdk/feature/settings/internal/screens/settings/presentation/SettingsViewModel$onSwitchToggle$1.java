package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel$onSwitchToggle$1", f = "SettingsViewModel.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsViewModel$onSwitchToggle$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ o8r0 $settingItem;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$onSwitchToggle$1(a aVar, o8r0 o8r0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$settingItem = o8r0Var;
        this.$isChecked = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$onSwitchToggle$1(this.this$0, this.$settingItem, this.$isChecked, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsViewModel$onSwitchToggle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            o8r0 a = o8r0.a(this.$settingItem, null, false, this.$isChecked, null, 4031);
            this.label = 1;
            if (aVar.c0(a, null, this) == coroutineSingletons) {
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
