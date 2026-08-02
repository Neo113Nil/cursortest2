package com.yandex.passport.internal.authsdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.q;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.authsdk.AuthSdkUtilsKt$initAuthSdkComponent$1", f = "AuthSdkUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class AuthSdkUtilsKt$initAuthSdkComponent$1 extends SuspendLambda implements wls {
    final /* synthetic */ PassportProcessGlobalComponent $component;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSdkUtilsKt$initAuthSdkComponent$1(PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation) {
        super(2, continuation);
        this.$component = passportProcessGlobalComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSdkUtilsKt$initAuthSdkComponent$1(this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AuthSdkUtilsKt$initAuthSdkComponent$1 authSdkUtilsKt$initAuthSdkComponent$1 = (AuthSdkUtilsKt$initAuthSdkComponent$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        authSdkUtilsKt$initAuthSdkComponent$1.invokeSuspend(zy11Var);
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
        j flagRepository = this.$component.getFlagRepository();
        com.yandex.passport.internal.flags.a aVar = q.a;
        List list = (List) flagRepository.b(q.x);
        Context applicationContext = this.$component.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        int i = list.contains(packageName) ? 1 : 2;
        ComponentName componentName = new ComponentName(packageName, "com.yandex.passport.AuthSdk");
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager.getComponentEnabledSetting(componentName) != i) {
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
        return zy11.a;
    }
}
