package com.yandex.passport.internal.ui.challenge.vpn;

import android.app.Activity;
import android.content.Intent;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeScreenKt$VpnChallengeScreen$4$1", f = "VpnChallengeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VpnChallengeScreenKt$VpnChallengeScreen$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ m3u0 $state$delegate;
    final /* synthetic */ a0 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnChallengeScreenKt$VpnChallengeScreen$4$1(Activity activity, a0 a0Var, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.$viewModel = a0Var;
        this.$state$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VpnChallengeScreenKt$VpnChallengeScreen$4$1(this.$activity, this.$viewModel, this.$state$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VpnChallengeScreenKt$VpnChallengeScreen$4$1 vpnChallengeScreenKt$VpnChallengeScreen$4$1 = (VpnChallengeScreenKt$VpnChallengeScreen$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        vpnChallengeScreenKt$VpnChallengeScreen$4$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = ((s) this.$state$delegate.getValue()).d;
        zy11 zy11Var = zy11.a;
        if (!z) {
            return zy11Var;
        }
        Activity activity = this.$activity;
        if (activity != null) {
            com.yandex.passport.internal.util.a.a(activity, new Intent("android.settings.SETTINGS"));
        }
        this.$viewModel.W(y.a);
        return zy11Var;
    }
}
