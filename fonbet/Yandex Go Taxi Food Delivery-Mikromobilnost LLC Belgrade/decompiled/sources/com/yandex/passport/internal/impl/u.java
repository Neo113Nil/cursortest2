package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.t0;
import com.yandex.passport.common.bitflag.EnumFlagHolder;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.VisualProperties;
import defpackage.x40;

/* loaded from: classes8.dex */
public final class u extends x40 {
    public final com.yandex.passport.api.e a;

    public u(com.yandex.passport.api.e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        n2 n2Var = (n2) obj;
        Filter.a aVar = new Filter.a();
        com.yandex.passport.api.d dVar = KPassportEnvironment.Companion;
        t0 environment = n2Var.a().getUid().getEnvironment();
        dVar.getClass();
        aVar.a = com.yandex.passport.api.d.a(environment);
        PassportAccountType passportAccountType = PassportAccountType.PHONISH;
        EnumFlagHolder enumFlagHolder = aVar.x;
        enumFlagHolder.reset();
        enumFlagHolder.set(passportAccountType);
        Filter a = aVar.a();
        PassportTheme b = n2Var.b();
        String primaryDisplayName = n2Var.a().getPrimaryDisplayName();
        k2 uid = n2Var.a().getUid();
        PassportUidImpl.Companion.getClass();
        return this.a.i(context, new LoginProperties(null, false, null, a, b, null, l2.a(uid), true, false, null, primaryDisplayName, false, null, null, null, new VisualProperties(n2Var.c(), false, false, null, false, null, null, null, null, false, false, null, null, null, false, false, 65534, null), null, null, null, null, null, false, null, null, true, null, null, false, null, false, null, 2130672423, null));
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return com.yandex.passport.api.r.d(i, intent);
    }
}
