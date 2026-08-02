package com.ybsdk.feature.settings.internal.view;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.a5p0;
import defpackage.a8r0;
import defpackage.a9r0;
import defpackage.aer0;
import defpackage.arm0;
import defpackage.b8r0;
import defpackage.b9r0;
import defpackage.ber0;
import defpackage.bgc;
import defpackage.cer0;
import defpackage.cp1;
import defpackage.der0;
import defpackage.eja1;
import defpackage.ger0;
import defpackage.her0;
import defpackage.hlq0;
import defpackage.i8r0;
import defpackage.j8r0;
import defpackage.k8r0;
import defpackage.lum;
import defpackage.lxo0;
import defpackage.m8r0;
import defpackage.mtw;
import defpackage.n6r0;
import defpackage.n7r0;
import defpackage.n8r0;
import defpackage.o6r0;
import defpackage.pgk0;
import defpackage.qa3;
import defpackage.rdr0;
import defpackage.sdr0;
import defpackage.t6r0;
import defpackage.tdr0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u6r0;
import defpackage.udr0;
import defpackage.uwl0;
import defpackage.v5r0;
import defpackage.w5r0;
import defpackage.w8r0;
import defpackage.wls;
import defpackage.wnf0;

/* loaded from: classes3.dex */
public final class b implements n6r0 {
    public final n7r0 a;
    public final tfl0 b;
    public final AppAnalyticsReporter c;
    public final pgk0 d;

    public b(n7r0 n7r0Var, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, pgk0 pgk0Var) {
        this.a = n7r0Var;
        this.b = tfl0Var;
        this.c = appAnalyticsReporter;
        this.d = pgk0Var;
    }

    public static qa3 a(b bVar, wls wlsVar, tls tlsVar, tls tlsVar2, b8r0 b8r0Var, a8r0 a8r0Var, b8r0 b8r0Var2, b8r0 b8r0Var3, int i) {
        tls hlq0Var = (i & 4) != 0 ? new hlq0(13) : tlsVar2;
        int i2 = 14;
        Object hlq0Var2 = (i & 8) != 0 ? new hlq0(i2) : b8r0Var;
        int i3 = 12;
        Object bgcVar = (i & 16) != 0 ? new bgc(12) : a8r0Var;
        int i4 = 15;
        tls hlq0Var3 = (i & 32) != 0 ? new hlq0(i4) : b8r0Var2;
        tls hlq0Var4 = (i & 64) != 0 ? new hlq0(i4) : b8r0Var3;
        int i5 = 16;
        return new qa3(w8r0.a, new lum(new i8r0(16), ger0.a, new hlq0(27), her0.a), new lum(new i8r0(1), m8r0.a, new hlq0(17), n8r0.a), new lum(new i8r0(i2), aer0.a, new lxo0(10, new SettingsAdapterFactoryImpl$createInternalAdapter$7(1, bVar.a, n7r0.class, "resolveAndNavigate", "resolveAndNavigate(Ljava/lang/String;)V", 0), hlq0Var, new cp1(wlsVar, i3)), ber0.a), new lum(new arm0(27), v5r0.a, new a5p0(i5, new SettingsAdapterFactoryImpl$createInternalAdapter$9(1, bVar.a, n7r0.class, "resolveAndNavigate", "resolveAndNavigate(Ljava/lang/String;)V", 0), new lxo0(9, bVar, bgcVar, hlq0Var2)), w5r0.a), new lum(new i8r0(0), j8r0.a, new hlq0(i5), k8r0.a), new lum(new i8r0(2), a9r0.a, new uwl0(4, new o6r0(bVar, 1)), b9r0.a), new lum(new i8r0(i3), rdr0.a, new hlq0(26), sdr0.a), new lum(new i8r0(15), cer0.a, new uwl0(7, tlsVar), der0.a), new lum(new i8r0(13), tdr0.a, new mtw(26), udr0.a), new lum(new arm0(29), t6r0.a, new wnf0(hlq0Var3, hlq0Var4, 3), u6r0.a));
    }

    public static void b(Activity activity, wls wlsVar) {
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            return;
        }
        tje.N(eja1.s(fragmentActivity), null, null, new SettingsAdapterFactoryImpl$launchInLifecycleScope$1(wlsVar, fragmentActivity, null), 3);
    }
}
