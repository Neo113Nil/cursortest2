package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4931j9 extends Pf {
    public final Bi a;
    public final HashMap b;
    public final C4 c;

    public C4931j9(C4927j5 c4927j5) {
        Bi bi = new Bi(c4927j5);
        this.a = bi;
        this.c = new C4(bi);
        this.b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC5037nb.EVENT_TYPE_ACTIVATION, new C4870h(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_START, new Ol(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_REGULAR, new Qg(this.a));
        C5218ub c5218ub = new C5218ub(this.a);
        hashMap.put(EnumC5037nb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_TYPE_SEND_REFERRER, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_TYPE_CUSTOM_EVENT, c5218ub);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_SET_SESSION_EXTRA;
        Bi bi = this.a;
        hashMap.put(enumC5037nb, new Jl(bi, bi.t));
        hashMap.put(EnumC5037nb.EVENT_TYPE_APP_OPEN, new Xg(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_PURGE_BUFFER, new C4732bg(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new E6(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Ff(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C4843fo(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Gf(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new C4817eo(this.a));
        hashMap.put(EnumC5037nb.EVENT_TYPE_ANR, c5218ub);
        EnumC5037nb enumC5037nb2 = EnumC5037nb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Bi bi2 = this.a;
        hashMap.put(enumC5037nb2, new Jl(bi2, bi2.e));
        EnumC5037nb enumC5037nb3 = EnumC5037nb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Bi bi3 = this.a;
        hashMap.put(enumC5037nb3, new Jl(bi3, bi3.f));
        hashMap.put(EnumC5037nb.EVENT_TYPE_SEND_USER_PROFILE, c5218ub);
        EnumC5037nb enumC5037nb4 = EnumC5037nb.EVENT_TYPE_SET_USER_PROFILE_ID;
        Bi bi4 = this.a;
        hashMap.put(enumC5037nb4, new Jl(bi4, bi4.k));
        hashMap.put(EnumC5037nb.EVENT_TYPE_SEND_REVENUE_EVENT, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_TYPE_CLEANUP, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_TYPE_WEBVIEW_SYNC, c5218ub);
        hashMap.put(EnumC5037nb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new Q9(this.a));
        return hashMap;
    }

    public final Bi b() {
        return this.a;
    }

    public final void a(EnumC5037nb enumC5037nb, Aa aa) {
        this.b.put(enumC5037nb, aa);
    }

    @Override // io.appmetrica.analytics.impl.Pf
    public final AbstractC4906i9 a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC5037nb a = EnumC5037nb.a(i);
        C4 c4 = this.c;
        if (c4 != null) {
            c4.a(a, linkedList);
        }
        Aa aa = (Aa) this.b.get(a);
        if (aa != null) {
            aa.a(linkedList);
        }
        return new C4880h9(linkedList);
    }

    public final Aa a(EnumC5037nb enumC5037nb) {
        return (Aa) this.b.get(enumC5037nb);
    }
}
