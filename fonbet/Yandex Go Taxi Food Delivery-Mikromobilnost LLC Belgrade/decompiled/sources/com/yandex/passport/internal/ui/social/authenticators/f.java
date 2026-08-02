package com.yandex.passport.internal.ui.social.authenticators;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.ui.domik.n;
import com.yandex.passport.internal.ui.social.p;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.yr31;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public abstract class f extends yr31 {
    public final r0 A;
    public final gci0 B;
    public final LoginProperties b;
    public final SocialConfiguration c;
    public final boolean w;
    public final Object x;
    public final w0 y;
    public final n z = new n();

    public f(LoginProperties loginProperties, SocialConfiguration socialConfiguration, Bundle bundle, boolean z, Object obj, w0 w0Var) {
        this.b = loginProperties;
        this.c = socialConfiguration;
        this.w = z;
        this.x = obj;
        this.y = w0Var;
        r0 c = bvf0.c(p.b);
        this.A = c;
        this.B = kotlinx.coroutines.flow.e.d(c);
        if (bundle == null) {
            X();
        }
    }

    public abstract void W(int i, int i2, Intent intent);

    public abstract void X();

    public void Y(Bundle bundle) {
    }

    public void Z(Bundle bundle) {
    }

    public final void a0() {
        p pVar = p.c;
        r0 r0Var = this.A;
        r0Var.getClass();
        r0Var.m(null, pVar);
    }
}
