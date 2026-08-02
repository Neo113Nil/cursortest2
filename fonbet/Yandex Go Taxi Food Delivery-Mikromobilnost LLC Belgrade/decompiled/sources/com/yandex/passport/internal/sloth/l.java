package com.yandex.passport.internal.sloth;

import android.app.Activity;
import android.net.ConnectivityManager;
import com.yandex.passport.sloth.ui.r;
import defpackage.eja1;
import defpackage.gci0;
import defpackage.ike;
import defpackage.pey;
import defpackage.wsr0;
import defpackage.xsr0;

/* loaded from: classes2.dex */
public final class l implements r {
    public final gci0 a;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Activity activity, com.yandex.passport.common.coroutine.e eVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService("connectivity");
        com.yandex.passport.common.coroutine.f fVar = (com.yandex.passport.common.coroutine.f) eVar;
        pey peyVar = activity instanceof pey ? (pey) activity : null;
        ike s = peyVar != null ? com.yandex.passport.internal.util.p.s(eja1.s(peyVar)) : fVar.a(false);
        this.a = kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.o(kotlinx.coroutines.flow.e.t(com.yandex.passport.internal.utils.b.f(connectivityManager, s))), s, wsr0.a(xsr0.a, 2), null);
    }
}
