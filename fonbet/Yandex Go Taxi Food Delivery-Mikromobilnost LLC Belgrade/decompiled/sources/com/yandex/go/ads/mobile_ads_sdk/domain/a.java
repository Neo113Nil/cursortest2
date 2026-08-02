package com.yandex.go.ads.mobile_ads_sdk.domain;

import defpackage.cne0;
import defpackage.cp5;
import defpackage.j24;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ums0;
import defpackage.v60;
import defpackage.vit;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a {
    public final tse a;
    public final cp5 b;
    public final vit c;
    public final ums0 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public a(tse tseVar, cp5 cp5Var, vit vitVar, ums0 ums0Var) {
        this.a = tseVar;
        this.b = cp5Var;
        this.c = vitVar;
        this.d = ums0Var;
    }

    public final String a() {
        ConcurrentHashMap concurrentHashMap = this.e;
        v60 v60Var = v60.a;
        if (concurrentHashMap.get(v60Var) == null) {
            pzt0 N = tje.N(this.a, null, null, new BidderTokenInteractor$fetchBidderToken$1$1(this, v60Var, null), 3);
            N.w(new j24(25, this));
            concurrentHashMap.putIfAbsent(v60Var, N);
        }
        return ((cne0) this.c.b).l("native", null);
    }
}
