package com.yandex.passport.internal.ui.domik.phone_number;

import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.p0;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.r;
import com.yandex.passport.internal.usecase.ui.v0;

/* loaded from: classes2.dex */
public final class a extends b {
    public final r B;
    public final b0 C;
    public final v0 D;
    public final p0 E;
    public final LoginProperties F;
    public final com.yandex.passport.biometric.ui.verification.a G = new com.yandex.passport.biometric.ui.verification.a(8, this);

    public a(r rVar, b0 b0Var, v0 v0Var, p0 p0Var, LoginProperties loginProperties) {
        this.B = rVar;
        this.C = b0Var;
        this.D = v0Var;
        this.E = p0Var;
        this.F = loginProperties;
    }
}
