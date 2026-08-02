package com.yandex.fintechsdk.security.impl.internal.devicechallenge;

import android.content.Context;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import defpackage.ay5;
import defpackage.by5;
import defpackage.ey5;
import defpackage.gaj;
import defpackage.haj;
import defpackage.ls31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.tse;
import defpackage.tx5;
import defpackage.vxh0;
import defpackage.w511;
import defpackage.wls;
import defpackage.z96;
import defpackage.zy11;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.JCP;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.security.impl.internal.devicechallenge.DeviceChallengeHelperImpl$getSignature$1", f = "DeviceChallengeHelperImpl.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeviceChallengeHelperImpl$getSignature$1 extends SuspendLambda implements wls {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ wls $completion;
    final /* synthetic */ byte[] $data;
    final /* synthetic */ String $dataBase64;
    final /* synthetic */ int $deviceChallengePostDelay;
    final /* synthetic */ int $deviceChallengeStartDelay;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceChallengeHelperImpl$getSignature$1(a aVar, int i, FragmentActivity fragmentActivity, byte[] bArr, String str, int i2, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deviceChallengeStartDelay = i;
        this.$activity = fragmentActivity;
        this.$data = bArr;
        this.$dataBase64 = str;
        this.$deviceChallengePostDelay = i2;
        this.$completion = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeviceChallengeHelperImpl$getSignature$1(this.this$0, this.$deviceChallengeStartDelay, this.$activity, this.$data, this.$dataBase64, this.$deviceChallengePostDelay, this.$completion, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeviceChallengeHelperImpl$getSignature$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object failure;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            int i2 = this.$deviceChallengeStartDelay;
            this.label = 1;
            aVar.getClass();
            if (i2 <= 0 || (obj2 = kotlinx.coroutines.a.i(i2, this)) != coroutineSingletons) {
                obj2 = zy11Var;
            }
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar2 = this.this$0;
        aVar2.getClass();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        PrivateKey privateKey = ((KeyStore.PrivateKeyEntry) keyStore.getEntry(aVar2.c(), null)).getPrivateKey();
        Signature signature = Signature.getInstance(JCP.SIGN_SHA256_ECDSA_NAME);
        signature.initSign(privateKey);
        a aVar3 = this.this$0;
        FragmentActivity fragmentActivity = this.$activity;
        ay5 ay5Var = new ay5(signature);
        byte[] bArr = this.$data;
        String str = this.$dataBase64;
        int i3 = this.$deviceChallengePostDelay;
        wls wlsVar = this.$completion;
        gaj gajVar = new gaj(aVar3, fragmentActivity, bArr, str, i3, wlsVar);
        haj hajVar = new haj(aVar3, fragmentActivity, str, i3, wlsVar);
        aVar3.getClass();
        Executor mainExecutor = fragmentActivity.getMainExecutor();
        tx5 tx5Var = new tx5(aVar3.a, hajVar, gajVar);
        ey5 ey5Var = new ey5();
        if (mainExecutor == null) {
            ny61.g("Executor must not be null.");
            return null;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ls31(fragmentActivity).b(BiometricViewModel.class);
        ey5Var.a = supportFragmentManager;
        biometricViewModel.b = mainExecutor;
        biometricViewModel.c = tx5Var;
        Context context = aVar3.b;
        String string = context.getString(vxh0.finsdk_confirm_the_payment);
        String string2 = context.getString(vxh0.finsdk_cancel);
        by5 by5Var = new by5();
        by5Var.a = string;
        PaymentKitConfig a = aVar3.c.a.b.a();
        if (a == null) {
            failure = Boolean.FALSE;
        } else {
            String str2 = a.getFlags().get("enableBiometryWithPassword");
            if (str2 == null) {
                failure = Boolean.FALSE;
            } else {
                try {
                    rbx rbxVar = sbx.d;
                    rbxVar.getClass();
                    b = rbxVar.b(z96.a, str2);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (b == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                failure = (Boolean) b;
                Object obj3 = Boolean.FALSE;
                if (failure instanceof Result.Failure) {
                    failure = obj3;
                }
            }
        }
        boolean booleanValue = ((Boolean) failure).booleanValue();
        if (booleanValue) {
            by5Var.d = 32783;
        } else {
            if (booleanValue) {
                w511.b();
                return null;
            }
            by5Var.d = 15;
            by5Var.b = string2;
        }
        ey5Var.a(by5Var.a(), ay5Var);
        return zy11Var;
    }
}
