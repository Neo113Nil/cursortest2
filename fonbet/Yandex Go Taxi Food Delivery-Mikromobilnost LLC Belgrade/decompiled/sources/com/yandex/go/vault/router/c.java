package com.yandex.go.vault.router;

import android.content.SharedPreferences;
import android.os.SystemClock;
import defpackage.a850;
import defpackage.g92;
import defpackage.h331;
import defpackage.h55;
import defpackage.i331;
import defpackage.i3y;
import defpackage.j331;
import defpackage.jcg;
import defpackage.ljr;
import defpackage.mqg0;
import defpackage.nhr;
import defpackage.o7r0;
import defpackage.ph70;
import defpackage.pv01;
import defpackage.pys;
import defpackage.q331;
import defpackage.qmr;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vlr;
import defpackage.w030;
import defpackage.wgr;
import defpackage.yvf0;
import defpackage.z231;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.h;

/* loaded from: classes14.dex */
public final class c extends h55 {
    public final w030 D;
    public final jcg E;
    public final wgr F;
    public final ph70 G;
    public final a850 H;
    public final z231 I;
    public final i331 J;
    public final com.yandex.go.vault.data.b K;
    public final yvf0 L;
    public final ru.yandex.taxi.deeplinks.b M;
    public final ljr N;
    public final com.yandex.go.vault.domain.a O;
    public final vlr P;
    public final i3y Q;

    public c(w030 w030Var, jcg jcgVar, wgr wgrVar, ph70 ph70Var, a850 a850Var, z231 z231Var, i331 i331Var, com.yandex.go.vault.data.b bVar, yvf0 yvf0Var, ru.yandex.taxi.deeplinks.b bVar2, ljr ljrVar, com.yandex.go.vault.domain.a aVar, vlr vlrVar) {
        super(null);
        this.D = w030Var;
        this.E = jcgVar;
        this.F = wgrVar;
        this.G = ph70Var;
        this.H = a850Var;
        this.I = z231Var;
        this.J = i331Var;
        this.K = bVar;
        this.L = yvf0Var;
        this.M = bVar2;
        this.N = ljrVar;
        this.O = aVar;
        this.P = vlrVar;
        this.Q = kotlin.a.a(new pv01(26, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        o7r0 o7r0Var = this.I.a;
        o7r0Var.getClass();
        o7r0Var.a.a("Vault.MainScreen.Closed", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        q331 q331Var = (q331) obj;
        VaultMainRouter$createConfig$1 vaultMainRouter$createConfig$1 = new VaultMainRouter$createConfig$1(1, this, c.class, "handleAction", "handleAction(Lflex/core/model/Action;)Z", 0);
        h K = e.K((tpr[]) Arrays.copyOf(new tpr[]{new rol0(new VaultMainRouter$createConfig$2(this, q331Var, null)), this.F.b()}, 2));
        g92 g92Var = new g92(2, Boolean.FALSE);
        i331 i331Var = this.J;
        SharedPreferences sharedPreferences = i331Var.b;
        nhr nhrVar = new nhr(this.P, null, K, g92Var, i331.a(i331Var.a, sharedPreferences.getString("main_screen_first_gradient_color", null), sharedPreferences.getString("main_screen_second_gradient_color", null)), Integer.valueOf(mqg0.black), vaultMainRouter$createConfig$1, this.N, null, qmr.a, 1538);
        String str = q331Var.a;
        z231 z231Var = this.I;
        z231Var.c = true;
        Long l = j331.a;
        j331.a = Long.valueOf(SystemClock.elapsedRealtime());
        o7r0 o7r0Var = z231Var.a;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        o7r0Var.a.a("Vault.MainScreen.Open", hashMap, 1, new HashMap());
        A((pys) this.Q.getValue(), nhrVar, new h331(this, 0));
        tje.N(o(), null, null, new VaultMainRouter$onLaunch$2(this, null), 3);
    }
}
