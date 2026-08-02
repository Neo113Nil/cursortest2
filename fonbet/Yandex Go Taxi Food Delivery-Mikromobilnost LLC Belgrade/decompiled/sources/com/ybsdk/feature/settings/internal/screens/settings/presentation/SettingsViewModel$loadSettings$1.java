package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wdr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel$loadSettings$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsViewModel$loadSettings$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $showShimmer;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$loadSettings$1(boolean z, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$showShimmer = z;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$loadSettings$1(this.$showShimmer, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SettingsViewModel$loadSettings$1 settingsViewModel$loadSettings$1 = (SettingsViewModel$loadSettings$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        settingsViewModel$loadSettings$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.$showShimmer) {
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, wdr0.a((wdr0) value, new t8j0(), null, null, null, false, null, null, null, null, false, 4094)));
        }
        a aVar = this.this$0;
        aVar.getClass();
        tje.N(ds31.a(aVar), null, null, new SettingsViewModel$loadCommonSettings$1(aVar, null), 3);
        return zy11.a;
    }
}
