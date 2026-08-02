package com.ybsdk.feature.pin.internal.domain.biometric;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptContent;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptMode;
import defpackage.ey5;
import defpackage.gqp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.trp0;
import defpackage.tse;
import defpackage.vx5;
import defpackage.vz;
import defpackage.wls;
import defpackage.zy11;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.domain.biometric.BiometricHelperImpl$showBiometricPrompt$1", f = "BiometricHelperImpl.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BiometricHelperImpl$showBiometricPrompt$1 extends SuspendLambda implements wls {
    final /* synthetic */ ey5 $biometricPrompt;
    final /* synthetic */ BiometricHelper$PromptContent $content;
    final /* synthetic */ Fragment $currentFragment;
    final /* synthetic */ BiometricHelper$PromptMode $mode;
    final /* synthetic */ tls $onError;
    final /* synthetic */ com.ybsdk.feature.pin.internal.domain.a $pinCryptographyManager;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricHelperImpl$showBiometricPrompt$1(BiometricHelper$PromptMode biometricHelper$PromptMode, com.ybsdk.feature.pin.internal.domain.a aVar, Fragment fragment, tls tlsVar, ey5 ey5Var, a aVar2, BiometricHelper$PromptContent biometricHelper$PromptContent, Continuation continuation) {
        super(2, continuation);
        this.$mode = biometricHelper$PromptMode;
        this.$pinCryptographyManager = aVar;
        this.$currentFragment = fragment;
        this.$onError = tlsVar;
        this.$biometricPrompt = ey5Var;
        this.this$0 = aVar2;
        this.$content = biometricHelper$PromptContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricHelperImpl$showBiometricPrompt$1(this.$mode, this.$pinCryptographyManager, this.$currentFragment, this.$onError, this.$biometricPrompt, this.this$0, this.$content, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricHelperImpl$showBiometricPrompt$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0059 A[Catch: all -> 0x000d, TRY_LEAVE, TryCatch #0 {all -> 0x000d, blocks: (B:5:0x0009, B:6:0x0034, B:7:0x0051, B:9:0x0059, B:16:0x001a, B:20:0x0029, B:23:0x0038, B:24:0x003d, B:25:0x003e), top: B:2:0x0005 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Cipher cipher;
        View view;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            this.$onError.invoke(th);
            trp0 trp0Var = trp0.a;
            trp0.e(new gqp0(th, this.$mode.name(), true, "showBiometricPrompt"));
        }
        if (i == 0) {
            b.b(obj);
            int i2 = vx5.a[this.$mode.ordinal()];
            if (i2 == 1) {
                com.ybsdk.feature.pin.internal.domain.a aVar = this.$pinCryptographyManager;
                aVar.getClass();
                Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher2.init(1, aVar.d());
                cipher = cipher2;
                view = this.$currentFragment.getView();
                if (view != null) {
                    view.post(new vz(view, this.$biometricPrompt, this.this$0, this.$content, cipher, 1));
                }
                return zy11.a;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            com.ybsdk.feature.pin.internal.domain.a aVar2 = this.$pinCryptographyManager;
            this.label = 1;
            obj = aVar2.c(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        cipher = (Cipher) obj;
        view = this.$currentFragment.getView();
        if (view != null) {
        }
        return zy11.a;
    }
}
