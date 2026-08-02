package com.yandex.messaging.ui.timeline;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.activity.MessengerRequestCode;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.internal.view.timeline.o;
import defpackage.acu;
import defpackage.apq0;
import defpackage.b00;
import defpackage.b40;
import defpackage.blt0;
import defpackage.c1x0;
import defpackage.cjw0;
import defpackage.ct21;
import defpackage.drb1;
import defpackage.e9t;
import defpackage.ebz0;
import defpackage.ek3;
import defpackage.f0z0;
import defpackage.fdz0;
import defpackage.g92;
import defpackage.h4g0;
import defpackage.hbz0;
import defpackage.hcz0;
import defpackage.hdu;
import defpackage.i3b;
import defpackage.ike;
import defpackage.izg;
import defpackage.j3b;
import defpackage.jbz0;
import defpackage.jhu0;
import defpackage.jn3;
import defpackage.jqr;
import defpackage.key0;
import defpackage.kgx;
import defpackage.ldz0;
import defpackage.lqo;
import defpackage.m9b;
import defpackage.mdz0;
import defpackage.mza0;
import defpackage.n2v0;
import defpackage.n720;
import defpackage.nh20;
import defpackage.odz0;
import defpackage.oew0;
import defpackage.okb1;
import defpackage.oyr;
import defpackage.oz;
import defpackage.pf4;
import defpackage.ps10;
import defpackage.pz;
import defpackage.pzt0;
import defpackage.q0r;
import defpackage.q3f0;
import defpackage.q6b;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.rp3;
import defpackage.ryv;
import defpackage.s8b;
import defpackage.sae;
import defpackage.tje;
import defpackage.u4t;
import defpackage.uza;
import defpackage.vg3;
import defpackage.vjx;
import defpackage.w270;
import defpackage.w3c;
import defpackage.x22;
import defpackage.x270;
import defpackage.xcz0;
import defpackage.xqi0;
import defpackage.ycz0;
import defpackage.yk3;
import defpackage.zgv;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class f extends Brick {
    public static final /* synthetic */ kgx[] e0 = {new MutablePropertyReference1Impl("privacyApiRestrictionsSubscription", 0, "getPrivacyApiRestrictionsSubscription()Lcom/yandex/alicekit/core/Disposable;", f.class), oyr.B(qoi0.a, f.class, "deepSyncChatNotificationControllerSubscription", "getDeepSyncChatNotificationControllerSubscription()Lcom/yandex/alicekit/core/Disposable;", 0)};
    public final odz0 A;
    public final q3f0 B;
    public final h4g0 C;
    public final com.yandex.messaging.internal.e D;
    public final com.yandex.messaging.domain.b E;
    public final u4t F;
    public final w270 G;
    public final key0 H;
    public final b I;
    public final hcz0 J;
    public final d K;
    public final q0r L;
    public final ps10 M;
    public final ryv N;
    public final apq0 O;
    public final nh20 P;
    public final nh20 Q;
    public final lqo R;
    public final com.yandex.messaging.domain.miniapp.c S;
    public final e9t T;
    public final x22 U;
    public final o V;
    public j3b W;
    public boolean Z;
    public final Activity a;
    public s8b a0;
    public final hbz0 b;
    public final qp3 b0;
    public final jbz0 c;
    public final qp3 c0;
    public nh20 d0;
    public final ChatRequest w;
    public final izg x;
    public final q6b y;
    public final b00 z;

    public f(Activity activity, hbz0 hbz0Var, jbz0 jbz0Var, ChatRequest chatRequest, izg izgVar, xqi0 xqi0Var, q6b q6bVar, b00 b00Var, odz0 odz0Var, q3f0 q3f0Var, h4g0 h4g0Var, com.yandex.messaging.internal.e eVar, com.yandex.messaging.domain.b bVar, u4t u4tVar, w270 w270Var, key0 key0Var, b bVar2, hcz0 hcz0Var, d dVar, q0r q0rVar, ps10 ps10Var, ryv ryvVar, apq0 apq0Var, nh20 nh20Var, nh20 nh20Var2, lqo lqoVar, com.yandex.messaging.domain.miniapp.c cVar, e9t e9tVar, x22 x22Var, o oVar) {
        this.a = activity;
        this.b = hbz0Var;
        this.c = jbz0Var;
        this.w = chatRequest;
        this.x = izgVar;
        this.y = q6bVar;
        this.z = b00Var;
        this.A = odz0Var;
        this.B = q3f0Var;
        this.C = h4g0Var;
        this.D = eVar;
        this.E = bVar;
        this.F = u4tVar;
        this.G = w270Var;
        this.H = key0Var;
        this.I = bVar2;
        this.J = hcz0Var;
        this.K = dVar;
        this.L = q0rVar;
        this.M = ps10Var;
        this.N = ryvVar;
        this.O = apq0Var;
        this.P = nh20Var;
        this.Q = nh20Var2;
        this.R = lqoVar;
        this.S = cVar;
        this.T = e9tVar;
        this.U = x22Var;
        this.V = oVar;
        tje.e();
        xqi0Var.q = true;
        yk3 yk3Var = xqi0Var.p;
        if (yk3Var != null) {
            yk3Var.b();
        }
        this.Z = true;
        this.b0 = new qp3();
        this.c0 = new qp3();
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.b.getRoot();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x01fc, code lost:
    
        if (((java.lang.System.currentTimeMillis() - r9.a) / 86400000) >= 1) goto L15;
     */
    @Override // com.yandex.bricks.Brick, defpackage.ak6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBrickAttach() {
        long j;
        super.onBrickAttach();
        Intent intent = this.a.getIntent();
        b bVar = this.I;
        bVar.n = intent;
        ike ikeVar = bVar.o;
        ChatReporter$onAttach$1 chatReporter$onAttach$1 = new ChatReporter$onAttach$1(bVar, intent, null);
        int i = 3;
        pzt0 N = tje.N(ikeVar, null, null, chatReporter$onAttach$1, 3);
        rp3 rp3Var = bVar.m;
        kgx kgxVar = b.p[0];
        rp3Var.a(N);
        jbz0 jbz0Var = this.c;
        ChatRequest chatRequest = jbz0Var.b;
        hbz0 hbz0Var = jbz0Var.c;
        com.yandex.bricks.c cVar = hbz0Var.y;
        i iVar = jbz0Var.g;
        cVar.a(iVar);
        com.yandex.bricks.c cVar2 = hbz0Var.O;
        blt0 blt0Var = jbz0Var.i;
        cVar2.a(blt0Var);
        hbz0Var.C.a(jbz0Var.j);
        com.yandex.bricks.c cVar3 = hbz0Var.H;
        com.yandex.messaging.internal.view.chat.c cVar4 = jbz0Var.k;
        cVar3.a(cVar4);
        hbz0Var.I.a(jbz0Var.l);
        hbz0Var.D.a(jbz0Var.m);
        hbz0Var.E.a(jbz0Var.n);
        jbz0Var.z.getClass();
        n720 n720Var = jbz0Var.B;
        if (n720Var.a() && jbz0Var.D.w) {
            jbz0Var.C.getClass();
        }
        hbz0Var.P.a(jbz0Var.o);
        hbz0Var.Q.a(jbz0Var.y);
        hbz0Var.L.a(jbz0Var.s);
        hbz0Var.M.a(jbz0Var.u);
        hbz0Var.K.a(jbz0Var.t);
        iVar.b0 = new c1x0(jbz0Var);
        iVar.c0 = new jhu0(jbz0Var);
        blt0Var.x = new n2v0(18, jbz0Var.e);
        new hdu(hbz0Var.getRoot());
        cVar4.J = jbz0Var.f;
        pzt0 pzt0Var = jbz0Var.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        jbz0Var.H = kotlinx.coroutines.flow.e.H(jbz0Var.G, new jqr(jbz0Var.x.a(chatRequest), new TimelineFragmentViewController$attach$1(jbz0Var, null), i));
        jbz0Var.A.a(hbz0Var.N);
        jbz0Var.d.a(hbz0Var.getRoot(), "chat", chatRequest.toString());
        final q0r q0rVar = this.L;
        q0rVar.b.f(55062, new mza0() { // from class: o0r
            @Override // defpackage.mza0
            public final void a(nza0 nza0Var) {
                q0r q0rVar2 = q0r.this;
                if (q0rVar2.f != null && q0rVar2.e != null && nza0Var.a()) {
                    k0b k0bVar = q0rVar2.c;
                    String str = q0rVar2.f;
                    String str2 = q0rVar2.e;
                    k0bVar.getClass();
                    tje.e();
                    b00 b00Var = k0bVar.a;
                    ((Handler) b00Var.a.get()).post(new tz(b00Var, k0bVar.b, str, str2, 2));
                }
                q0rVar2.f = null;
                q0rVar2.e = null;
            }
        });
        ps10 ps10Var = this.M;
        ps10Var.l.f(100, ps10Var.G);
        b40 b40Var = ps10Var.w;
        MessengerRequestCode messengerRequestCode = MessengerRequestCode.CAMERA;
        b40Var.getClass();
        this.K.a();
        this.V.a();
        com.yandex.messaging.internal.e eVar = this.D;
        ChatRequest chatRequest2 = this.w;
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(eVar.a(chatRequest2), new TimelineFragmentBrick$onBrickAttach$1(this, null), i));
        q();
        this.H.getClass();
        Boolean bool = Boolean.FALSE;
        int i2 = 2;
        kotlinx.coroutines.flow.e.H(getBrickScope(), kotlinx.coroutines.flow.e.n(new g92(i2, bool), new g92(i2, bool), eVar.a(chatRequest2), new TimelineFragmentBrick$onBrickAttach$2(this, null)));
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.G.a(), new TimelineFragmentBrick$onBrickAttach$3(this, null), i));
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.E.b(chatRequest2), new TimelineFragmentBrick$onBrickAttach$4(this, null), i));
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.F.a(chatRequest2), new TimelineFragmentBrick$onBrickAttach$5(this, null), i));
        ebz0 ebz0Var = new ebz0(this);
        q3f0 q3f0Var = this.B;
        q3f0Var.getClass();
        tje.e();
        q3f0Var.c.b(ebz0Var);
        pf4 pf4Var = new pf4(ebz0Var, q3f0Var);
        kgx kgxVar2 = e0[0];
        this.b0.b(pf4Var);
        b00 b00Var = this.z;
        ((Handler) b00Var.a.get()).post(new oz(b00Var, chatRequest2, 1));
        h4g0 h4g0Var = this.C;
        w3c w3cVar = h4g0Var.b;
        tje.e();
        vjx vjxVar = h4g0Var.f;
        if (vjxVar.a != -1) {
            w3cVar.getClass();
        }
        jn3 jn3Var = h4g0Var.a;
        ek3 ek3Var = new ek3();
        jn3Var.getClass();
        tje.e();
        AuthorizationObservable$AuthState authorizationObservable$AuthState = jn3Var.i;
        if (authorizationObservable$AuthState == null) {
            authorizationObservable$AuthState = jn3Var.a();
            jn3Var.i = authorizationObservable$AuthState;
        }
        Pair pair = new Pair("user_status", (String) jn3Var.b(authorizationObservable$AuthState, ek3Var));
        SharedPreferences sharedPreferences = h4g0Var.c;
        String string = sharedPreferences.getString("push_token", null);
        if (string != null) {
            byte[] bytes = string.getBytes(uza.a);
            j = drb1.e(bytes.length, bytes);
        } else {
            j = 0;
        }
        h4g0Var.e.reportEvent("push settings", kotlin.collections.b.i(pair, new Pair("token_hash", Long.valueOf(j)), new Pair("push_platform", sharedPreferences.getString("push_token_type", null)), new Pair("logout_token", sharedPreferences.getString("logout_token", null)), new Pair("client_notifications", h4g0Var.d.getBoolean("disable_all_notifications", false) ? "off" : "on")));
        w3cVar.getClass();
        ((Handler) vjxVar.b).post(new vg3(vjxVar, System.currentTimeMillis(), 4));
        oew0 oew0Var = new oew0(26, this);
        if (n720Var.a()) {
            ((Toolbar) ((fdz0) jbz0Var.q.get()).w.getValue()).setOnClickListener(new zgv(5, oew0Var));
        }
        q6b q6bVar = this.y;
        if (q6bVar.j) {
            q6bVar.j = false;
            ycz0 ycz0Var = this.A.d;
            ChatSearchToolbarBrick chatSearchToolbarBrick = ycz0Var.a;
            ycz0Var.i = true;
            ((m9b) ycz0Var.f.get()).I = new xcz0(ycz0Var);
            com.yandex.messaging.internal.view.chat.c cVar5 = ycz0Var.b;
            cVar5.M = false;
            cVar5.r();
            com.yandex.messaging.internal.view.chat.e eVar2 = ycz0Var.c;
            if (eVar2.z != null) {
                eVar2.C = true;
                eVar2.u();
            }
            com.yandex.messaging.input.c cVar6 = (com.yandex.messaging.input.c) ycz0Var.d.get();
            cVar6.h = true;
            cVar6.c();
            chatSearchToolbarBrick.setNavigationDelegate(new xcz0(ycz0Var));
            chatSearchToolbarBrick.showSearch();
        }
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.S.a(chatRequest2), new TimelineFragmentBrick$onBrickAttach$9(this, null), 3));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        jbz0 jbz0Var = this.c;
        pzt0 pzt0Var = jbz0Var.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        jbz0Var.H = null;
        pzt0 pzt0Var2 = jbz0Var.I;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        jbz0Var.I = null;
        rp3 rp3Var = this.V.e;
        kgx kgxVar = o.f[0];
        rp3Var.a(null);
        kgx kgxVar2 = e0[0];
        this.b0.b(null);
        apq0 apq0Var = this.O;
        cjw0 cjw0Var = apq0Var.c;
        ((LinkedHashMap) cjw0Var.b).clear();
        ((LinkedHashMap) cjw0Var.c).clear();
        cjw0 cjw0Var2 = apq0Var.b;
        ((LinkedHashMap) cjw0Var2.b).clear();
        ((LinkedHashMap) cjw0Var2.c).clear();
        b bVar = this.I;
        rp3 rp3Var2 = bVar.m;
        kgx kgxVar3 = b.p[0];
        rp3Var2.a(null);
        bVar.b(null, x270.b);
        bVar.a(null, bVar.n);
        if (!bVar.l) {
            bVar.l = true;
            bVar.a.c("chat closed", "chat window", Integer.valueOf(bVar.i));
        }
        d dVar = this.K;
        kotlinx.coroutines.a.g(dVar.C.a, null);
        dVar.D = true;
        this.L.b.d(55062);
        ps10 ps10Var = this.M;
        ps10Var.l.d(100);
        b40 b40Var = ps10Var.w;
        MessengerRequestCode messengerRequestCode = MessengerRequestCode.CAMERA;
        b40Var.getClass();
        nh20 nh20Var = this.d0;
        if (nh20Var != null && nh20Var.isShowing()) {
            this.U.c("csat_cancel", CRLReasonCodeExtension.REASON, "timeline closed");
        }
        nh20 nh20Var2 = this.d0;
        if (nh20Var2 != null) {
            nh20Var2.dismiss();
        }
        this.d0 = null;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickPause() {
        super.onBrickPause();
        kgx kgxVar = e0[1];
        this.c0.b(null);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickResume() {
        super.onBrickResume();
        f0z0 f0z0Var = new f0z0(7);
        com.yandex.messaging.internal.authorized.chat.b bVar = this.x.a;
        sae saeVar = new sae(25);
        saeVar.b = f0z0Var;
        ct21 e = bVar.e(this.w, saeVar);
        kgx kgxVar = e0[1];
        this.c0.b(e);
    }

    public final void q() {
        i3b a;
        j3b j3bVar = this.W;
        if (j3bVar == null || (a = j3bVar.a()) == null) {
            return;
        }
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(kotlinx.coroutines.flow.e.t(new acu(this.T.a(a.b), 29)), new TimelineFragmentBrick$subscribeThreadState$1$2(this, null), 3));
    }

    public final void r(j3b j3bVar) {
        if (j3bVar.J && this.c.F.equals(ldz0.a)) {
            b00 b00Var = this.z;
            ((Handler) b00Var.a.get()).post(new pz(b00Var, this.w, 2));
        }
    }

    public final void s() {
        s8b s8bVar;
        j3b j3bVar = this.W;
        if (j3bVar == null) {
            return;
        }
        boolean k = j3bVar.J ? okb1.b(j3bVar).k() && this.Z : okb1.b(j3bVar).k();
        jbz0 jbz0Var = this.c;
        if ((jbz0Var.F instanceof ldz0) == k && (s8bVar = this.a0) != null && s8bVar.b == okb1.b(j3bVar).b) {
            return;
        }
        this.a0 = okb1.b(j3bVar);
        jbz0Var.b(k ? ldz0.a : mdz0.b);
        r(j3bVar);
    }
}
