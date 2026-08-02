package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes15.dex */
public final class k0 implements v7p {
    public final /* synthetic */ int a;
    public final j0 b;

    public /* synthetic */ k0(j0 j0Var, int i) {
        this.a = i;
        this.b = j0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        j0 j0Var = this.b;
        switch (i) {
            case 0:
                ProgressPropertiesImpl progressPropertiesImpl = j0Var.c;
                q5z.i(progressPropertiesImpl);
                return progressPropertiesImpl;
            default:
                PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl = j0Var.b;
                q5z.i(passportDeleteAccountPropertiesImpl);
                return passportDeleteAccountPropertiesImpl;
        }
    }
}
