package xsna;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.LogoutReason;
import xsna.egn0;

/* compiled from: AccountManagerInteractorImpl.kt */
/* loaded from: classes.dex */
public final class lp implements kp {
    @Override // xsna.kp
    public final Bundle a(AccountAuthenticatorResponse accountAuthenticatorResponse) {
        return null;
    }

    @Override // xsna.kp
    public final void b(UserId userId) {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        egn0.a.a(wdx0Var, LogoutReason.USER, userId, 4);
    }
}
