package com.yandex.passport.biometric.ui.initialization;

import android.content.Intent;
import com.yandex.passport.biometric.ui.initialization.d;
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

/* loaded from: classes15.dex */
public final /* synthetic */ class a implements vpr, jms {
    public final /* synthetic */ CryptoSdkInitializationActivity a;

    public a(CryptoSdkInitializationActivity cryptoSdkInitializationActivity) {
        this.a = cryptoSdkInitializationActivity;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        d.a aVar = (d.a) obj;
        int i = CryptoSdkInitializationActivity.b;
        if (!jl40.l(aVar, d.a.C0088a.a)) {
            boolean z = aVar instanceof c;
            CryptoSdkInitializationActivity cryptoSdkInitializationActivity = this.a;
            if (z) {
                cryptoSdkInitializationActivity.setResult(0, new Intent().putExtra(EsiaBindActivity.EXTRA_EXCEPTION, ((c) aVar).a));
                cryptoSdkInitializationActivity.finish();
            } else {
                if (!(aVar instanceof d.a.b)) {
                    w511.b();
                    return null;
                }
                cryptoSdkInitializationActivity.setResult(-1, null);
                cryptoSdkInitializationActivity.finish();
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
        return new AdaptedFunctionReference(2, this.a, CryptoSdkInitializationActivity.class, "handleState", "handleState(Lcom/yandex/passport/biometric/ui/initialization/CryptoSdkInitializationViewModel$State;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
