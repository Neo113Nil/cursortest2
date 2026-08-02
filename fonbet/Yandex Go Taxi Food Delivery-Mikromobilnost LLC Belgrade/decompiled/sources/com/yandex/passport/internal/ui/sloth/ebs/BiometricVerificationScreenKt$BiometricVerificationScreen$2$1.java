package com.yandex.passport.internal.ui.sloth.ebs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.l2;
import com.yandex.passport.common.ebs.CryptoSdkProperties;
import com.yandex.passport.internal.properties.EsiaBindProperties;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.w511;
import defpackage.wls;
import defpackage.yd00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/ebs/l0;", "effect", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/sloth/ebs/l0;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationScreenKt$BiometricVerificationScreen$2$1", f = "BiometricVerificationScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BiometricVerificationScreenKt$BiometricVerificationScreen$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ yd00 $createPermissionsLauncher;
    final /* synthetic */ yd00 $ebsBiometricVerificationLauncher;
    final /* synthetic */ yd00 $ebsCryptoSdkInitializationLauncher;
    final /* synthetic */ yd00 $esiaBind;
    final /* synthetic */ sls $onExit;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricVerificationScreenKt$BiometricVerificationScreen$2$1(yd00 yd00Var, yd00 yd00Var2, yd00 yd00Var3, yd00 yd00Var4, Context context, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$esiaBind = yd00Var;
        this.$createPermissionsLauncher = yd00Var2;
        this.$ebsCryptoSdkInitializationLauncher = yd00Var3;
        this.$ebsBiometricVerificationLauncher = yd00Var4;
        this.$context = context;
        this.$onExit = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BiometricVerificationScreenKt$BiometricVerificationScreen$2$1 biometricVerificationScreenKt$BiometricVerificationScreen$2$1 = new BiometricVerificationScreenKt$BiometricVerificationScreen$2$1(this.$esiaBind, this.$createPermissionsLauncher, this.$ebsCryptoSdkInitializationLauncher, this.$ebsBiometricVerificationLauncher, this.$context, this.$onExit, continuation);
        biometricVerificationScreenKt$BiometricVerificationScreen$2$1.L$0 = obj;
        return biometricVerificationScreenKt$BiometricVerificationScreen$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BiometricVerificationScreenKt$BiometricVerificationScreen$2$1 biometricVerificationScreenKt$BiometricVerificationScreen$2$1 = (BiometricVerificationScreenKt$BiometricVerificationScreen$2$1) create((l0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        biometricVerificationScreenKt$BiometricVerificationScreen$2$1.invokeSuspend(zy11Var);
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
        l0 l0Var = (l0) this.L$0;
        if (l0Var instanceof g0) {
            yd00 yd00Var = this.$esiaBind;
            PassportTheme passportTheme = PassportTheme.LIGHT;
            g0 g0Var = (g0) l0Var;
            PassportTheme z = com.yandex.passport.internal.util.p.z(g0Var.a);
            PassportUidImpl A = com.yandex.passport.internal.util.p.A(g0Var.b);
            String str = g0Var.c;
            String str2 = g0Var.d;
            String str3 = g0Var.e;
            EsiaBindProperties.Companion.getClass();
            PassportUidImpl.Companion.getClass();
            yd00Var.a(new EsiaBindProperties(z, l2.a(A), str, str2, str3));
        } else if (l0Var instanceof f0) {
            this.$createPermissionsLauncher.a("android.permission.CAMERA");
        } else if (l0Var instanceof k0) {
            this.$ebsCryptoSdkInitializationLauncher.a(new CryptoSdkProperties(((k0) l0Var).a));
        } else if (l0Var instanceof j0) {
            this.$ebsBiometricVerificationLauncher.a(((j0) l0Var).a);
        } else if (l0Var instanceof i0) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", this.$context.getPackageName(), null));
            intent.addFlags(SelfTester_JCP.IMITA);
            this.$context.startActivity(intent);
        } else {
            if (!jl40.l(l0Var, h0.a)) {
                w511.b();
                return null;
            }
            this.$onExit.invoke();
        }
        return zy11.a;
    }
}
