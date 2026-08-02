package com.yandex.fintechsdk.features.bdui.internal.presentation.fragment;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import defpackage.ah5;
import defpackage.azw;
import defpackage.b2w;
import defpackage.dh5;
import defpackage.ds31;
import defpackage.fke;
import defpackage.gdr;
import defpackage.gzr;
import defpackage.hh5;
import defpackage.hsb;
import defpackage.iee;
import defpackage.lee;
import defpackage.lh5;
import defpackage.nh5;
import defpackage.ns31;
import defpackage.p85;
import defpackage.pao;
import defpackage.qmf;
import defpackage.rbs;
import defpackage.ryw;
import defpackage.scc;
import defpackage.ug5;
import defpackage.uva0;
import defpackage.uyi0;
import defpackage.vh5;
import defpackage.wc5;
import defpackage.wg5;
import defpackage.ycs;
import defpackage.ype;
import defpackage.z22;
import defpackage.zfl0;
import defpackage.zy11;
import defpackage.zyw;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final class c extends wc5 {
    public final ug5 A;
    public final lh5 B;
    public final dh5 C;
    public final vh5 D;
    public final hsb E;
    public final iee F;
    public final lee G;
    public final fke H;
    public final Map I;
    public final qmf J;
    public final Map K;
    public final pao L;
    public final gdr M;
    public final FlexAdapter N;
    public final gzr O;
    public final rbs P;
    public final ycs Q;
    public final ryw R;
    public final zyw S;
    public final azw T;
    public final OkHttpClient.a U;
    public final uyi0 V;
    public final com.yandex.fintechsdk.core.navigation.impl.api.router.a W;
    public final zfl0 Z;
    public final uva0 a0;
    public final ns31 b0;
    public final Set c;
    public final hh5 c0;
    public final z22 w;
    public final wg5 x;
    public final ah5 y;
    public final ype z;

    public c(Set set, z22 z22Var, wg5 wg5Var, ah5 ah5Var, ype ypeVar, ug5 ug5Var, lh5 lh5Var, dh5 dh5Var, vh5 vh5Var, hsb hsbVar, iee ieeVar, lee leeVar, fke fkeVar, Map map, qmf qmfVar, Map map2, pao paoVar, gdr gdrVar, FlexAdapter flexAdapter, gzr gzrVar, rbs rbsVar, ycs ycsVar, b2w b2wVar, ryw rywVar, zyw zywVar, azw azwVar, OkHttpClient.a aVar, uyi0 uyi0Var, com.yandex.fintechsdk.core.navigation.impl.api.router.a aVar2, zfl0 zfl0Var, uva0 uva0Var, ns31 ns31Var) {
        super(zy11.a);
        this.c = set;
        this.w = z22Var;
        this.x = wg5Var;
        this.y = ah5Var;
        this.z = ypeVar;
        this.A = ug5Var;
        this.B = lh5Var;
        this.C = dh5Var;
        this.D = vh5Var;
        this.E = hsbVar;
        this.F = ieeVar;
        this.G = leeVar;
        this.H = fkeVar;
        this.I = map;
        this.J = qmfVar;
        this.K = map2;
        this.L = paoVar;
        this.M = gdrVar;
        this.N = flexAdapter;
        this.O = gzrVar;
        this.P = rbsVar;
        this.Q = ycsVar;
        this.R = rywVar;
        this.S = zywVar;
        this.T = azwVar;
        this.U = aVar;
        this.V = uyi0Var;
        this.W = aVar2;
        this.Z = zfl0Var;
        this.a0 = uva0Var;
        this.b0 = ns31Var;
        this.c0 = new hh5(1, b2wVar);
        ns31Var.c(ds31.a(this));
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(this, new BduiViewModel$collectLaunchChromeTabActions$1(this, null));
    }

    @Override // defpackage.yr31
    public final void V() {
        FlexAdapter flexAdapter = this.N;
        if (flexAdapter != null) {
            flexAdapter.clear();
        }
        X();
        this.b0.c(null);
    }

    @Override // defpackage.wc5
    public final void W() {
        FlexAdapter flexAdapter = this.N;
        nh5 currentRouteHandler = flexAdapter != null ? flexAdapter.getCurrentRouteHandler() : null;
        if (currentRouteHandler == null || currentRouteHandler.getBackStackEntryCount() <= 1) {
            this.B.a();
        } else {
            currentRouteHandler.backward(true, kotlin.collections.b.f());
        }
    }

    public final void X() {
        Iterator it = scc.g(this.F, this.G, this.H, this.P, this.Q, this.Z).iterator();
        while (it.hasNext()) {
            ((p85) it.next()).c(null);
        }
    }
}
