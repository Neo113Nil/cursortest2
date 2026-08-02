package com.yandex.messaging.internal.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.yandex.passport.internal.flags.experiments.o;
import com.yandex.passport.internal.impl.d;
import com.yandex.passport.internal.provider.communication.e;
import com.yandex.passport.internal.provider.communication.p;
import defpackage.acu;
import defpackage.ey4;
import defpackage.gci0;
import defpackage.jqr;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.x22;
import defpackage.xdf0;
import defpackage.xsr0;
import defpackage.xvf0;

/* loaded from: classes15.dex */
public final class c {
    public final Handler a;
    public final x22 b;
    public final ConnectivityManager c;
    public final gci0 d;

    public c(Context context, Handler handler, xdf0 xdf0Var, com.yandex.messaging.auth.passport.b bVar, x22 x22Var) {
        tpr g;
        e eVar;
        tpr tprVar;
        this.a = handler;
        this.b = x22Var;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        if (bVar != null) {
            bVar.b.getClass();
            o oVar = p.a;
            g = new ey4(new acu(new d(kotlinx.coroutines.flow.e.t((oVar == null || (eVar = (e) ((xvf0) oVar.a).get()) == null || (tprVar = eVar.b) == null) ? pvn.a : tprVar), 0), 7), 26);
        } else {
            g = kotlinx.coroutines.flow.e.g(new VpnMonitor$observeVpn$1(this, null));
        }
        jqr jqrVar = new jqr(g, new VpnMonitor$isVpnEnabledFlow$1(this, null), 3);
        xsr0.a.getClass();
        this.d = kotlinx.coroutines.flow.e.R(jqrVar, xdf0Var, wsr0.b, Boolean.valueOf(a()));
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = this.c;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return false;
            }
            return networkCapabilities.hasTransport(4);
        } catch (SecurityException unused) {
            return false;
        }
    }
}
