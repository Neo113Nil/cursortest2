package com.ybsdk.feature.pin.internal.domain.biometric;

import android.content.Context;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptContent;
import com.ybsdk.feature.pin.api.entities.BiometricHelper$PromptMode;
import defpackage.abe;
import defpackage.dy5;
import defpackage.eja1;
import defpackage.ey5;
import defpackage.fy5;
import defpackage.ls31;
import defpackage.mrj;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tls;
import defpackage.tn1;
import defpackage.ux5;

/* loaded from: classes3.dex */
public final class a implements ux5 {
    public final Context a;
    public final mrj b;
    public final AppAnalyticsReporter c;

    public a(Context context, AppAnalyticsReporter appAnalyticsReporter) {
        mrj mrjVar = new mrj(new abe(context, 2));
        this.a = context;
        this.b = mrjVar;
        this.c = appAnalyticsReporter;
    }

    public static String b(int i) {
        return i != -2 ? i != -1 ? i != 0 ? i != 1 ? i != 11 ? i != 12 ? i != 15 ? oyr.i(i, "CODE_") : "SECURITY_UPDATE_REQUIRED" : "NO_HARDWARE" : "NONE_ENROLLED" : "HW_UNAVAILABLE" : "SUCCESS" : "UNKNOWN" : "UNSUPPORTED";
    }

    public final ey5 a(BaseMvvmFragment baseMvvmFragment, tls tlsVar, sls slsVar, tls tlsVar2) {
        fy5 fy5Var = new fy5(tlsVar, slsVar, tlsVar2, new tn1(24, this));
        ey5 ey5Var = new ey5();
        FragmentActivity activity = baseMvvmFragment.getActivity();
        FragmentManager childFragmentManager = baseMvvmFragment.getChildFragmentManager();
        BiometricViewModel biometricViewModel = activity != null ? (BiometricViewModel) new ls31(activity).b(BiometricViewModel.class) : null;
        if (biometricViewModel != null) {
            baseMvvmFragment.getLifecycle().a(new dy5(biometricViewModel));
        }
        ey5Var.a = childFragmentManager;
        if (biometricViewModel != null) {
            biometricViewModel.c = fy5Var;
        }
        return ey5Var;
    }

    public final boolean c() {
        return this.b.g(15) == 0;
    }

    public final void d(BaseMvvmFragment baseMvvmFragment, BiometricHelper$PromptMode biometricHelper$PromptMode, ey5 ey5Var, BiometricHelper$PromptContent biometricHelper$PromptContent, com.ybsdk.feature.pin.internal.domain.a aVar, tls tlsVar) {
        eja1.s(baseMvvmFragment).c(new BiometricHelperImpl$showBiometricPrompt$1(biometricHelper$PromptMode, aVar, baseMvvmFragment, tlsVar, ey5Var, this, biometricHelper$PromptContent, null));
    }
}
