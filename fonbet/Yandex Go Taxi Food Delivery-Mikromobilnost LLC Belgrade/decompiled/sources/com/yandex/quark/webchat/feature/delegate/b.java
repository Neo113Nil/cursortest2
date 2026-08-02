package com.yandex.quark.webchat.feature.delegate;

import android.content.Context;
import com.yandex.quark.webchat.auth.internal.synchronizer.c;
import com.yandex.quark.webchat.feature.dependencies.BufferingProfile;
import com.yandex.quark.webchat.g;
import com.yandex.quark.webchat.js.d;
import com.yandex.quark.webchat.params.WebChatParams;
import defpackage.au50;
import defpackage.azq;
import defpackage.br6;
import defpackage.bs1;
import defpackage.bst;
import defpackage.bvf0;
import defpackage.eci0;
import defpackage.fd41;
import defpackage.ffx;
import defpackage.fm60;
import defpackage.ge41;
import defpackage.gp50;
import defpackage.gw00;
import defpackage.ha2;
import defpackage.hd41;
import defpackage.id41;
import defpackage.id5;
import defpackage.ike;
import defpackage.jd41;
import defpackage.jqr;
import defpackage.ke41;
import defpackage.kp50;
import defpackage.kxj0;
import defpackage.lb7;
import defpackage.ls1;
import defpackage.lxj0;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mxj0;
import defpackage.ne1;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.onh;
import defpackage.qe41;
import defpackage.qqy;
import defpackage.rc41;
import defpackage.rcc;
import defpackage.s2n;
import defpackage.sc41;
import defpackage.sjh;
import defpackage.szq0;
import defpackage.t6f0;
import defpackage.tc41;
import defpackage.tcc;
import defpackage.tig0;
import defpackage.tje;
import defpackage.ts1;
import defpackage.u28;
import defpackage.uc41;
import defpackage.uyj;
import defpackage.va90;
import defpackage.vc41;
import defpackage.vjd;
import defpackage.w511;
import defpackage.wc41;
import defpackage.wly0;
import defpackage.wsr0;
import defpackage.wwg;
import defpackage.xsr0;
import defpackage.xw91;
import defpackage.y9z;
import defpackage.yq6;
import defpackage.z28;
import defpackage.z3x0;
import defpackage.zc41;
import defpackage.zq6;
import defpackage.zr1;
import defpackage.zwf0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class b {
    public final wc41 a;
    public final zwf0 b;
    public final zc41 c;
    public final jd41 d;
    public final ike e;
    public final vjd f;
    public final WebChatParams g;
    public final uc41 h;
    public final String i;
    public final id5 j;
    public final szq0 k;
    public final c l;
    public final qe41 m;
    public final LinkedHashMap n;

    public b(Context context, ike ikeVar, wly0 wly0Var, wc41 wc41Var, zq6 zq6Var, zwf0 zwf0Var, yq6 yq6Var, y9z y9zVar, OkHttpClient.a aVar, bst bstVar, zc41 zc41Var, jd41 jd41Var, com.yandex.quark.webchat.auth.internal.a aVar2, sc41 sc41Var, lb7 lb7Var) {
        z3x0 z3x0Var;
        ge41 ge41Var = jd41Var.z;
        r0 r0Var = jd41Var.y;
        this.a = wc41Var;
        this.b = zwf0Var;
        this.c = zc41Var;
        this.d = jd41Var;
        ike g = kp50.g(ikeVar, EmptyCoroutineContext.a);
        this.e = g;
        this.f = new vjd();
        WebChatParams webChatParams = zc41Var.f;
        this.g = webChatParams;
        fd41 fd41Var = zc41Var.g;
        azq azqVar = zc41Var.b;
        webChatParams.getClass();
        WebChatParams.DialogSessionMode dialogSessionMode = webChatParams.f;
        gp50 gp50Var = new gp50(13, zwf0Var);
        this.h = gp50Var;
        n0 c = ffx.c(0, 0, null, 7);
        xsr0.a.getClass();
        eci0 O = e.O(c, g, wsr0.c, 0);
        String str = webChatParams.b;
        this.i = str == null ? "https://alice.yandex.ru" : str;
        ke41 ke41Var = new ke41();
        tig0 tig0Var = new tig0(r0Var, zwf0Var);
        mxj0 mxj0Var = zc41Var.e;
        if (mxj0Var instanceof kxj0) {
            z3x0Var = ((kxj0) mxj0Var).a;
        } else {
            if (!(mxj0Var instanceof lxj0)) {
                w511.b();
                throw null;
            }
            new fm60();
            z3x0Var = new z3x0(0);
        }
        this.j = z3x0Var;
        this.k = new szq0();
        s2n s2nVar = (s2n) wwg.x(zc41Var.i);
        if (wwg.x(zc41Var.j) != null) {
            ny61.u();
            throw null;
        }
        if (wwg.x(zc41Var.k) != null) {
            ny61.u();
            throw null;
        }
        if (wwg.x(zc41Var.l) != null) {
            ny61.u();
            throw null;
        }
        if (wwg.x(zc41Var.m) != null) {
            ny61.u();
            throw null;
        }
        com.yandex.go.quark.dynamic.chat.a aVar3 = (com.yandex.go.quark.dynamic.chat.a) wwg.x(zc41Var.n);
        com.yandex.quark.webchat.auth.internal.b bVar = new com.yandex.quark.webchat.auth.internal.b(aVar2, z3x0Var, wly0Var, aVar);
        com.yandex.quark.webchat.auth.internal.synchronizer.a aVar4 = new com.yandex.quark.webchat.auth.internal.synchronizer.a(webChatParams.c, new ne1(context), bVar, zwf0Var, zq6Var);
        onh onhVar = jd41Var.a;
        com.yandex.go.quark.dynamic.chat.b bVar2 = zc41Var.a;
        fd41Var.getClass();
        this.l = new c(onhVar, bVar, bVar2, g, zwf0Var, zq6Var, new jqr(new mth(new n(e.n(bvf0.c(EmptyList.a), new mth(r0Var, 17), zc41Var.h.a, new WebChatFeatureDelegate$authorizationSynchronizer$2(this, null)), new WebChatFeatureDelegate$authorizationSynchronizer$3(this, null)), 6), new WebChatFeatureDelegate$authorizationSynchronizer$4(this, null), 3), ke41Var, yq6Var, aVar4);
        tc41 tc41Var = jd41Var.w;
        SetBuilder setBuilder = new SetBuilder();
        setBuilder.addAll(vc41.a);
        int[] iArr = hd41.a;
        int i = iArr[dialogSessionMode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setBuilder.add("AliceCapability");
            } else if (i != 3) {
                w511.b();
                throw null;
            }
        }
        int i2 = iArr[dialogSessionMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                w511.b();
                throw null;
            }
            setBuilder.add("AliceProCapability");
        }
        au50 au50Var = new au50(13, setBuilder.b());
        nfh nfhVar = new nfh();
        nfhVar.a = zwf0Var;
        nfhVar.b = au50Var;
        nfhVar.c = new ha2(8, tc41Var.a(), nfhVar);
        this.m = new qe41(O, wly0Var, zwf0Var, zq6Var, new g(ge41Var, ge41Var, zwf0Var), azqVar, new va90(wc41Var), jd41Var.I, ke41Var, jd41Var.D, new t6f0(11, this), yq6Var, new WebChatFeatureDelegate$webChatViewControllerFactory$2(0, aVar4, com.yandex.quark.webchat.auth.internal.synchronizer.a.class, "onCookieUsed", "onCookieUsed()V", 0), tig0Var, y9zVar, null, gp50Var, nfhVar, bstVar, new id41(), sc41Var);
        ls1 ls1Var = new ls1(zwf0Var, ge41Var, ge41Var, context, g, wly0Var, aVar, zq6Var);
        zr1 zr1Var = new zr1(zwf0Var, context, new xw91(s2nVar == null ? new s2n() : s2nVar));
        ListBuilder a = rcc.a();
        if (s2nVar != null) {
            a.add(new ts1(s2nVar, zwf0Var));
        }
        a.add(ls1Var);
        a.add(zr1Var);
        if (aVar3 != null) {
            a.add(new bs1(zwf0Var, aVar3));
        }
        ListBuilder j = a.j();
        int d = gw00.d(tcc.n(j, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        ListIterator listIterator = j.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            }
            Object next = qqyVar.next();
            linkedHashMap.put(new z28(((u28) next).a()), next);
        }
        this.n = linkedHashMap;
        this.g.i.getClass();
        this.b.c("WebChatFeatureDelegate", "AuthInvalidBridge is disabled, skipping initialization");
        jd41 jd41Var2 = this.d;
        vjd vjdVar = this.f;
        tc41 tc41Var2 = jd41Var2.w;
        com.yandex.quark.webchat.feature.dependencies.a aVar5 = jd41Var2.b;
        d dVar = jd41Var2.D;
        uc41 uc41Var = this.h;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            tc41Var2.b(uc41Var, (u28) it.next());
        }
        vjdVar.a(dVar.b(uc41Var));
        ike ikeVar2 = this.e;
        sjh sjhVar = uyj.a;
        tje.N(ikeVar2, mdh.b, null, new WebChatFeatureDelegate$registerCapabilities$2(aVar5, this, null), 2);
        BufferingProfile bufferingProfile = jd41Var2.B;
        int i3 = hd41.a[this.g.f.ordinal()];
        if (i3 == 1) {
            vjdVar.a(bufferingProfile.a(new rc41()));
        } else if (i3 != 2 && i3 != 3) {
            w511.b();
            throw null;
        }
        szq0 szq0Var = this.k;
        br6 br6Var = this.d.K;
        szq0Var.getClass();
    }
}
