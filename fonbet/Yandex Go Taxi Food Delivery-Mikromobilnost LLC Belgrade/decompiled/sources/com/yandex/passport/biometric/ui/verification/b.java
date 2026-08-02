package com.yandex.passport.biometric.ui.verification;

import android.content.Intent;
import com.yandex.passport.biometric.ui.verification.e;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.NotInitializedSdkEbsException;

/* loaded from: classes15.dex */
public final /* synthetic */ class b implements vpr, jms {
    public final /* synthetic */ BiometricAuthSdkActivity a;

    public b(BiometricAuthSdkActivity biometricAuthSdkActivity) {
        this.a = biometricAuthSdkActivity;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        e.a aVar = (e.a) obj;
        int i = BiometricAuthSdkActivity.c;
        if (!jl40.l(aVar, e.a.C0089a.a)) {
            if (!(aVar instanceof d)) {
                w511.b();
                return null;
            }
            Exception exc = ((d) aVar).a;
            boolean z = exc instanceof NotInitializedSdkEbsException;
            BiometricAuthSdkActivity biometricAuthSdkActivity = this.a;
            if (z) {
                biometricAuthSdkActivity.setResult(999, null);
                biometricAuthSdkActivity.finish();
            } else {
                biometricAuthSdkActivity.setResult(444, new Intent().putExtra(EsiaBindActivity.EXTRA_EXCEPTION, exc));
                biometricAuthSdkActivity.finish();
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, BiometricAuthSdkActivity.class, "handleState", "handleState(Lcom/yandex/passport/biometric/ui/verification/BiometricAuthSdkViewModel$State;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
