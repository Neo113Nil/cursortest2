package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.hs31;
import defpackage.sls;

/* loaded from: classes2.dex */
public final /* synthetic */ class y0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ y0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        hs31 hs31Var;
        switch (this.a) {
            case 0:
                return androidx.compose.runtime.f.j(LogoutOption.ThisApp);
            default:
                hs31Var = x0.B;
                return hs31Var;
        }
    }
}
