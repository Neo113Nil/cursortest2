package com.yandex.go.quark.ai_assistant.impl.router;

import android.content.Context;
import com.yandex.go.quark.ai_assistant.api.chat.ChatViewController$Mode;
import com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView;
import com.yandex.go.quark.api.router.QuarkDynamicFeatureRouter$Payload$DisplayMode;
import com.yandex.quark.yango.ActiveMode;
import defpackage.aj0;
import defpackage.am1;
import defpackage.bm1;
import defpackage.cm1;
import defpackage.d4;
import defpackage.dm1;
import defpackage.doh;
import defpackage.fhg0;
import defpackage.gm1;
import defpackage.h3y;
import defpackage.hm1;
import defpackage.jl40;
import defpackage.kl1;
import defpackage.m950;
import defpackage.mjv0;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rdb;
import defpackage.rl1;
import defpackage.ryh;
import defpackage.sl1;
import defpackage.t6z;
import defpackage.tje;
import defpackage.tl1;
import defpackage.u45;
import defpackage.ul2;
import defpackage.vvb1;
import defpackage.w030;
import defpackage.w511;
import defpackage.wig0;
import defpackage.wl1;
import defpackage.wmt;
import defpackage.xgg0;
import defpackage.xl1;
import defpackage.yl1;
import defpackage.ymt;
import defpackage.yvf0;
import defpackage.zl1;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes13.dex */
public final class c extends com.yandex.go.navigation.modals.coroutines.a {
    public final Context F;
    public final w030 G;
    public final mjv0 H;
    public final aj0 I;
    public final yvf0 J;
    public final zuj0 K;
    public final h3y L;
    public final rl1 M;
    public boolean N;
    public pzt0 O;
    public xgg0 P;

    public c(Context context, w030 w030Var, mjv0 mjv0Var, aj0 aj0Var, yvf0 yvf0Var, zuj0 zuj0Var, h3y h3yVar) {
        super(null);
        this.F = context;
        this.G = w030Var;
        this.H = mjv0Var;
        this.I = aj0Var;
        this.J = yvf0Var;
        this.K = zuj0Var;
        this.L = h3yVar;
        this.M = new rl1();
        this.N = true;
        this.P = xgg0.c;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.H.a.remove(qoi0.a(c.class));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        hm1 hm1Var = (hm1) obj;
        gm1 gm1Var = hm1Var.e;
        if (gm1Var == null) {
            gm1Var = gm1.c;
        }
        String str = gm1Var.a;
        if (str == null) {
            str = "com.yandex.go";
        }
        String str2 = gm1Var.b;
        if (str2 == null) {
            str2 = "go_android";
        }
        this.P = new xgg0(str, str2);
        this.H.a.add(qoi0.a(c.class));
        cm1 cm1Var = hm1Var.a;
        if (cm1Var instanceof bm1) {
            U(((bm1) cm1Var).a, hm1Var);
        } else {
            if (jl40.l(cm1Var, am1.a)) {
                return;
            }
            w511.b();
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final void R(u45 u45Var) {
        this.N = false;
        if (this.M.b.a.getValue() != null) {
            return;
        }
        hm1 hm1Var = (hm1) this.x;
        cm1 cm1Var = hm1Var != null ? hm1Var.a : null;
        if ((cm1Var instanceof bm1) || !jl40.l(cm1Var, am1.a)) {
            return;
        }
        T(false);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        kl1 kl1Var;
        hm1 hm1Var = (hm1) obj;
        int i = sl1.a[hm1Var.g.ordinal()];
        if (i == 1) {
            kl1Var = vvb1.b;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            kl1Var = (kl1) this.L.get();
        }
        kl1 kl1Var2 = kl1Var;
        wl1 wl1Var = new wl1(this.M, new ryh(15, this), kl1Var2, hm1Var.i, this.P, hm1Var.h);
        boolean z = this.N;
        return new AiAssistantModalView(this.F, wl1Var, z ? hm1Var.b : dm1.a, z ? NavigationDirection.FORWARD : NavigationDirection.BACKWARD, hm1Var.f, new d4(22, this));
    }

    public final void T(boolean z) {
        QuarkDynamicFeatureRouter$Payload$DisplayMode quarkDynamicFeatureRouter$Payload$DisplayMode;
        m950 m950Var = (m950) this.I.get();
        xgg0 xgg0Var = this.P;
        hm1 hm1Var = (hm1) this.x;
        zl1 zl1Var = hm1Var != null ? hm1Var.f : null;
        if (zl1Var == null || (zl1Var instanceof xl1)) {
            quarkDynamicFeatureRouter$Payload$DisplayMode = QuarkDynamicFeatureRouter$Payload$DisplayMode.Headerless;
        } else {
            if (!zl1Var.equals(yl1.a)) {
                w511.b();
                return;
            }
            quarkDynamicFeatureRouter$Payload$DisplayMode = QuarkDynamicFeatureRouter$Payload$DisplayMode.Default;
        }
        D(m950Var, new fhg0(z, xgg0Var, quarkDynamicFeatureRouter$Payload$DisplayMode), new tl1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(rdb rdbVar, hm1 hm1Var) {
        ActiveMode activeMode;
        pzt0 pzt0Var;
        pzt0 pzt0Var2;
        this.M.a(rdbVar);
        ChatViewController$Mode chatViewController$Mode = hm1Var.c;
        com.yandex.go.quark.dynamic.c cVar = (com.yandex.go.quark.dynamic.c) rdbVar;
        cVar.getClass();
        int i = wig0.a[chatViewController$Mode.ordinal()];
        if (i == 1) {
            activeMode = ActiveMode.GO;
        } else if (i == 2) {
            activeMode = ActiveMode.EATS;
        } else if (i == 3) {
            activeMode = ActiveMode.GROCERY;
        } else if (i == 4) {
            activeMode = ActiveMode.MARKET;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            activeMode = ActiveMode.DELIVERY;
        }
        ymt ymtVar = ((doh) cVar.c.g.a.getValue()).b.b;
        synchronized (ymtVar) {
            wmt wmtVar = ymtVar.d;
            t6z t6zVar = wmtVar.a;
            wmtVar.getClass();
            wmt wmtVar2 = new wmt(t6zVar, activeMode);
            ymtVar.d = wmtVar2;
            ul2 f = ymtVar.f(wmtVar2);
            synchronized (ymtVar) {
                ymtVar.e = f;
                ymtVar.e(f);
            }
            pzt0Var = this.O;
            if (pzt0Var == null && pzt0Var.k0()) {
                return;
            }
            pzt0Var2 = this.O;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            this.O = tje.N(o(), null, null, new AiAssistantModalViewRouter$setupChatViewController$1(rdbVar, hm1Var, null), 3);
        }
        pzt0Var = this.O;
        if (pzt0Var == null) {
        }
        pzt0Var2 = this.O;
        if (pzt0Var2 != null) {
        }
        this.O = tje.N(o(), null, null, new AiAssistantModalViewRouter$setupChatViewController$1(rdbVar, hm1Var, null), 3);
    }
}
