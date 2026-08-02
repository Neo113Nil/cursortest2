package com.ybsdk.di.modules;

import android.app.Activity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.dzh0;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.DeeplinkModule$provideSetAppIconDelegate$1$1$1", f = "DeeplinkModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeeplinkModule$provideSetAppIconDelegate$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkModule$provideSetAppIconDelegate$1$1$1(Activity activity, Continuation continuation) {
        super(2, continuation);
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkModule$provideSetAppIconDelegate$1$1$1(this.$activity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeeplinkModule$provideSetAppIconDelegate$1$1$1 deeplinkModule$provideSetAppIconDelegate$1$1$1 = (DeeplinkModule$provideSetAppIconDelegate$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deeplinkModule$provideSetAppIconDelegate$1$1$1.invokeSuspend(zy11Var);
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
        com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, this.$activity, new n0t0(unr0.h(Text.Companion, dzh0.ybsdk_common_default_error)), null, 12);
        return zy11.a;
    }
}
