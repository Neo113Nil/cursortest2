package com.ybsdk.di.modules;

import android.app.Activity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.j0t0;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.DeeplinkModule$provideSnackBarDeeplink$1$1", f = "DeeplinkModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeeplinkModule$provideSnackBarDeeplink$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ DeeplinkAction.ShowSnackbar $deeplinkAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkModule$provideSnackBarDeeplink$1$1(Activity activity, DeeplinkAction.ShowSnackbar showSnackbar, Continuation continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.$deeplinkAction = showSnackbar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkModule$provideSnackBarDeeplink$1$1(this.$activity, this.$deeplinkAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeeplinkModule$provideSnackBarDeeplink$1$1 deeplinkModule$provideSnackBarDeeplink$1$1 = (DeeplinkModule$provideSnackBarDeeplink$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deeplinkModule$provideSnackBarDeeplink$1$1.invokeSuspend(zy11Var);
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
        com.ybsdk.widgets.common.snackbar.a aVar = Snackbar.Companion;
        Activity activity = this.$activity;
        Text text = this.$deeplinkAction.getText();
        Text description = this.$deeplinkAction.getDescription();
        if (description == null) {
            description = Text.Empty.INSTANCE;
        }
        n0t0 n0t0Var = new n0t0(text, description);
        Long duration = this.$deeplinkAction.getDuration();
        com.ybsdk.widgets.common.snackbar.a.a(aVar, activity, n0t0Var, duration != null ? new j0t0(duration.longValue()) : j0t0.b, 8);
        return zy11.a;
    }
}
