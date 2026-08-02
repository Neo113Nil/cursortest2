package com.yandex.go.payments.shared.details.settings;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import defpackage.ior0;
import defpackage.kor0;
import defpackage.nor0;
import defpackage.oor0;
import defpackage.q6c0;
import defpackage.tje;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kor0 kor0Var = (kor0) obj;
                oor0 oor0Var = kor0Var.D;
                oor0Var.f = false;
                boolean z = oor0Var.c;
                oor0Var.c = true;
                oor0Var.d = kor0Var.C.n;
                oor0Var.e = true;
                oor0Var.f = false;
                tje.N(kor0Var.Jg(), null, null, new SharedPaymentSettingsPresenter$onAccountRemoveConfirmed$1(kor0Var, z, null), 3);
                break;
            default:
                kor0 kor0Var2 = ((nor0) obj).c;
                q6c0 q6c0Var = kor0Var2.z;
                String str = kor0Var2.B.b;
                oor0 oor0Var2 = kor0Var2.D;
                q6c0Var.M(str, oor0Var2, SharedPaymentAnalytics$Button.DONE);
                ((ior0) kor0Var2.Dg()).closeKeyboard();
                oor0Var2.e = true;
                oor0Var2.d = kor0Var2.C.h;
                kor0Var2.Lg();
                tje.N(kor0Var2.Jg(), null, null, new SharedPaymentSettingsPresenter$onSaveClick$1(kor0Var2, null), 3);
                break;
        }
    }
}
