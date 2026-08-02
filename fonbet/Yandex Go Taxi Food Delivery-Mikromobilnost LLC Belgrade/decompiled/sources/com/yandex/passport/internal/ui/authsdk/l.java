package com.yandex.passport.internal.ui.authsdk;

import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.usecase.n1;
import defpackage.w53;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class l extends com.yandex.passport.internal.ui.base.h {
    public final com.yandex.passport.internal.ui.util.i A;
    public final com.yandex.passport.internal.ui.util.l B;
    public final com.yandex.passport.internal.core.accounts.d C;
    public final com.yandex.passport.internal.core.accounts.g D;
    public final com.yandex.passport.internal.network.client.c E;
    public BaseState F;
    public final c0 G;
    public final com.yandex.passport.internal.ui.g H;
    public final AuthSdkProperties I;
    public final n1 J;

    public l(c0 c0Var, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.core.accounts.g gVar, com.yandex.passport.internal.network.client.c cVar, AuthSdkProperties authSdkProperties, n1 n1Var, Bundle bundle) {
        k kVar = new k(null, 0);
        com.yandex.passport.internal.ui.util.i iVar = new com.yandex.passport.internal.ui.util.i();
        iVar.l(kVar);
        this.A = iVar;
        this.B = new com.yandex.passport.internal.ui.util.l();
        this.H = new com.yandex.passport.internal.ui.g();
        this.G = c0Var;
        this.C = dVar;
        this.D = gVar;
        this.E = cVar;
        this.I = authSdkProperties;
        this.J = n1Var;
        if (bundle == null) {
            this.F = new InitialState(authSdkProperties.getSelectedUid() != null ? com.yandex.passport.internal.util.p.B(authSdkProperties.getSelectedUid()) : null);
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("subtype", LegacyAccountType.STRING_LOGIN);
            w53Var.put("fromLoginSDK", "true");
            w53Var.put("reporter", authSdkProperties.getClientId());
            w53Var.put("caller_app_id", authSdkProperties.getCallerAppId());
            w53Var.put("caller_fingerprint", authSdkProperties.getCallerFingerprint());
            c0Var.a.a(com.yandex.passport.internal.analytics.g.e, w53Var);
        } else {
            BaseState baseState = (BaseState) bundle.getParcelable(ClidProvider.STATE);
            baseState.getClass();
            this.F = baseState;
        }
        d0();
    }

    @Override // com.yandex.passport.internal.ui.base.h
    public final void Y(Bundle bundle) {
        bundle.putParcelable(ClidProvider.STATE, this.F);
    }

    public final com.yandex.passport.internal.network.client.a a0() {
        return this.E.a(com.yandex.passport.internal.util.p.u(this.I.getLoginProperties().getFilter().getPrimaryEnvironment()));
    }

    public final void b0() {
        BaseState baseState = this.F;
        if (baseState instanceof WaitingAcceptState) {
            WaitingAcceptState waitingAcceptState = (WaitingAcceptState) baseState;
            this.F = new PermissionsAcceptedState(waitingAcceptState.permissionsResult, waitingAcceptState.modernAccount);
            d0();
        }
        String clientId = this.I.getClientId();
        c0 c0Var = this.G;
        c0Var.getClass();
        w53 w53Var = new w53();
        w53Var.put("reporter", clientId);
        c0Var.a.a(com.yandex.passport.internal.analytics.o.b, w53Var);
    }

    public final void c0(Exception exc, ModernAccount modernAccount) {
        EventError a = this.H.a(exc);
        this.b.m(a);
        this.A.m(new j(a, modernAccount, 1));
        this.G.a.a.reportError(com.yandex.passport.internal.analytics.o.e.a, exc);
    }

    public final void d0() {
        com.yandex.passport.legacy.lx.n d = com.yandex.passport.legacy.lx.m.d(new com.yandex.passport.internal.n(4, this));
        HashMap hashMap = this.x.a;
        com.yandex.passport.legacy.lx.g gVar = (com.yandex.passport.legacy.lx.g) hashMap.get(1);
        if (gVar != null) {
            gVar.a();
        }
        hashMap.put(1, d);
    }

    public final void e0() {
        this.B.m(new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.internal.ui.a(5, this.I.getLoginProperties()), Constants.MINIMAL_ERROR_STATUS_CODE));
        if (this.F instanceof WaitingAcceptState) {
            this.F = new WaitingAccountState(((WaitingAcceptState) this.F).modernAccount.getUid());
        }
    }
}
