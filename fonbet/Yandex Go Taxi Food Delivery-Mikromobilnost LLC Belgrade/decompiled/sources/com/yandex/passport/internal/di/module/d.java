package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.biometric.api.PassportBiometricFactory;
import com.yandex.passport.common.ebs.t;
import com.yandex.passport.internal.ui.sloth.ebs.g1;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class d implements v7p {
    public final /* synthetic */ int a;
    public final a b;
    public final yvf0 c;

    public /* synthetic */ d(a aVar, yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = aVar;
        this.c = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) yvf0Var.get();
                aVar.getClass();
                return new com.yandex.passport.common.resources.a(context.getResources());
            case 1:
                com.yandex.passport.internal.properties.p pVar = (com.yandex.passport.internal.properties.p) yvf0Var.get();
                aVar.getClass();
                return Boolean.valueOf(pVar.w);
            default:
                g1 g1Var = (g1) yvf0Var.get();
                aVar.getClass();
                try {
                    PassportBiometricFactory passportBiometricFactory = PassportBiometricFactory.INSTANCE;
                    return (t) PassportBiometricFactory.class.getMethod("createPassportEbsApi", null).invoke(null, null);
                } catch (Exception unused) {
                    return g1Var;
                }
        }
    }
}
