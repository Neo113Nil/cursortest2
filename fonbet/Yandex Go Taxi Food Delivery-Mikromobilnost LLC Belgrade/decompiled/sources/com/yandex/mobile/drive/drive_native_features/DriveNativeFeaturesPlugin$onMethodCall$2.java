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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.drive_native_features.DriveNativeFeaturesPlugin$onMethodCall$2", f = "DriveNativeFeaturesPlugin.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DriveNativeFeaturesPlugin$onMethodCall$2 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ x920 $call;
    final /* synthetic */ da20 $result;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveNativeFeaturesPlugin$onMethodCall$2(b bVar, Activity activity, x920 x920Var, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$activity = activity;
        this.$call = x920Var;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveNativeFeaturesPlugin$onMethodCall$2(this.this$0, this.$activity, this.$call, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveNativeFeaturesPlugin$onMethodCall$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        da20 da20Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.mobile.drive.scan.a a = b.a(this.this$0, this.$activity, this.$call);
            da20 da20Var2 = this.$result;
            b bVar = this.this$0;
            Activity activity = this.$activity;
            x920 x920Var = this.$call;
            this.L$0 = null;
            this.L$1 = da20Var2;
            this.label = 1;
            obj = b.b(bVar, activity, a, x920Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            da20Var = da20Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            da20Var = (da20) this.L$1;
            kotlin.b.b(obj);
        }
        da20Var.success(obj);
        return zy11.a;
    }
}
