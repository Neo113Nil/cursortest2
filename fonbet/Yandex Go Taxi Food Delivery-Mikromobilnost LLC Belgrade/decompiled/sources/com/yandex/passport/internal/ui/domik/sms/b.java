package com.yandex.passport.internal.ui.domik.sms;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.network.mc;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.core.accounts.d;
import com.yandex.passport.internal.flags.presentation.o;
import com.yandex.passport.internal.helper.f;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.g9;
import com.yandex.passport.internal.report.i9;
import com.yandex.passport.internal.report.reporters.p0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.common.e;
import com.yandex.passport.internal.ui.domik.q;
import com.yandex.passport.internal.ui.domik.r;
import com.yandex.passport.internal.ui.domik.username.UsernameInputFragment;
import com.yandex.passport.internal.ui.n;
import com.yandex.passport.internal.usecase.ui.i0;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.legacy.lx.m;

/* loaded from: classes2.dex */
public final class b extends e {
    public final b0 E;
    public final r F;
    public final p0 G;
    public final LoginProperties H;
    public final d I;
    public final com.yandex.passport.internal.interaction.e J;

    public b(f fVar, c0 c0Var, q qVar, mc mcVar, com.yandex.passport.internal.network.mappers.b bVar, b0 b0Var, i0 i0Var, r rVar, p0 p0Var, LoginProperties loginProperties, d dVar) {
        super(bVar, mcVar, i0Var);
        this.E = b0Var;
        this.F = rVar;
        this.G = p0Var;
        this.H = loginProperties;
        this.I = dVar;
        com.yandex.passport.internal.interaction.e eVar = new com.yandex.passport.internal.interaction.e(fVar, this.A, new o(c0Var, this, qVar));
        Z(eVar);
        this.J = eVar;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.e
    public final void a0(BaseTrack baseTrack) {
        String str;
        RegTrack regTrack = (RegTrack) baseTrack;
        int i = 2;
        if (!regTrack.isUpgradePhonish()) {
            com.yandex.passport.internal.interaction.e eVar = this.J;
            eVar.c.m(Boolean.TRUE);
            eVar.a.a.add(m.d(new com.yandex.passport.internal.interaction.a(i, eVar, regTrack)));
            return;
        }
        LoginProperties loginProperties = this.H;
        PassportUidImpl selectedUid = loginProperties.getSelectedUid();
        ModernAccount e = selectedUid != null ? this.I.a().e(p.B(selectedUid)) : null;
        p0 p0Var = this.G;
        if (e == null) {
            PassportUidImpl selectedUid2 = loginProperties.getSelectedUid();
            if (selectedUid2 != null) {
                PassportAccountNotFoundException passportAccountNotFoundException = new PassportAccountNotFoundException(loginProperties.getSelectedUid());
                Uid B = p.B(selectedUid2);
                p0Var.getClass();
                p0Var.f(g9.w, new yd(B), new yd(passportAccountNotFoundException));
            }
            this.b.m(new EventError("unknown error", null, 2, null));
            return;
        }
        Uid uid = e.getUid();
        p0Var.getClass();
        p0Var.f(i9.w, new yd(uid));
        r rVar = this.F;
        rVar.getClass();
        n nVar = new n(5, regTrack, e);
        UsernameInputFragment.Companion.getClass();
        str = UsernameInputFragment.FRAGMENT_TAG;
        rVar.a.A.m(new com.yandex.passport.internal.ui.base.m(nVar, str, false));
    }
}
