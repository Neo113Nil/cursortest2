package com.yandex.mobile.drive.drive_native_features;

import android.app.Activity;
import defpackage.da20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x920;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.drive_native_features.DriveNativeFeaturesPlugin$onMethodCall$4", f = "DriveNativeFeaturesPlugin.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DriveNativeFeaturesPlugin$onMethodCall$4 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ x920 $call;
    final /* synthetic */ da20 $result;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveNativeFeaturesPlugin$onMethodCall$4(b bVar, Activity activity, x920 x920Var, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$activity = activity;
        this.$call = x920Var;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveNativeFeaturesPlugin$onMethodCall$4(this.this$0, this.$activity, this.$call, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveNativeFeaturesPlugin$onMethodCall$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.mobile.drive.scan.a a = b.a(this.this$0, this.$activity, this.$call);
            this.L$0 = null;
            this.label = 1;
            if (a.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$result.success(null);
        return zy11.a;
    }
}
