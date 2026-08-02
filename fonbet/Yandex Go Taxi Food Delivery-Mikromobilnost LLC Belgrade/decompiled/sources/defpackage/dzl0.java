package defpackage;

import android.os.Bundle;
import com.ybsdk.feature.card.internal.samsungpay.d;

/* loaded from: classes3.dex */
public final class dzl0 implements r8u0 {
    public final /* synthetic */ d a;
    public final /* synthetic */ kol0 b;

    public dzl0(kol0 kol0Var, d dVar) {
        this.a = dVar;
        this.b = kol0Var;
    }

    @Override // defpackage.r8u0
    public final void onFail(int i, Bundle bundle) {
        d.b(this.a, "Failed getting SamsungPay walletInfo", Integer.valueOf(i), bundle, null, null, 24);
        this.b.resumeWith(ezl0.a);
    }

    @Override // defpackage.r8u0
    public final void onSuccess(int i, Bundle bundle) {
        String string = bundle != null ? bundle.getString("deviceId") : null;
        String string2 = bundle != null ? bundle.getString("walletDMId") : null;
        kol0 kol0Var = this.b;
        if (string != null && string2 != null) {
            kol0Var.resumeWith(new fzl0(string, string2));
        } else {
            d.b(this.a, "There is no data in walletInfo", null, null, null, b64.l("deviceId: ", string, ", walletId: ", string2), 14);
            kol0Var.resumeWith(ezl0.a);
        }
    }
}
