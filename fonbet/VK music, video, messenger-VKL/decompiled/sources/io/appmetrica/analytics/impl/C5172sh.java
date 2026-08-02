package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5172sh extends Y5 {
    public final C4927j5 b;
    public final InterfaceC5146rh c;
    public final O3 d;

    public C5172sh(@NonNull C4927j5 c4927j5, @NonNull InterfaceC5146rh interfaceC5146rh) {
        this(c4927j5, interfaceC5146rh, new O3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.Y5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5224uh load(@NonNull X5 x5) {
        C5224uh c5224uh = (C5224uh) super.load(x5);
        c5224uh.m = ((C5095ph) x5.componentArguments).a;
        c5224uh.r = this.b.t.a();
        c5224uh.w = this.b.q.a();
        C5095ph c5095ph = (C5095ph) x5.componentArguments;
        c5224uh.d = c5095ph.b;
        c5224uh.e = c5095ph.c;
        c5224uh.f = c5095ph.d;
        c5224uh.i = c5095ph.e;
        c5224uh.g = c5095ph.f;
        c5224uh.h = c5095ph.g;
        Boolean valueOf = Boolean.valueOf(c5095ph.h);
        InterfaceC5146rh interfaceC5146rh = this.c;
        c5224uh.j = valueOf;
        c5224uh.k = interfaceC5146rh;
        C5095ph c5095ph2 = (C5095ph) x5.componentArguments;
        c5224uh.v = c5095ph2.j;
        C5100pm c5100pm = x5.a;
        C5286x4 c5286x4 = c5100pm.n;
        c5224uh.n = c5286x4.a;
        Ie ie = c5100pm.s;
        if (ie != null) {
            c5224uh.s = ie.a;
            c5224uh.t = ie.b;
        }
        c5224uh.o = c5286x4.b;
        c5224uh.q = c5100pm.e;
        c5224uh.p = c5100pm.k;
        O3 o3 = this.d;
        Map<String, String> map = c5095ph2.i;
        L3 f = C5342za.I.f();
        o3.getClass();
        c5224uh.u = O3.a(map, c5100pm, f);
        c5224uh.x = this.b.v.e.keySet();
        return c5224uh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C5224uh(this.b);
    }

    public C5172sh(C4927j5 c4927j5, InterfaceC5146rh interfaceC5146rh, O3 o3) {
        super(c4927j5.getContext(), c4927j5.b().c());
        this.b = c4927j5;
        this.c = interfaceC5146rh;
        this.d = o3;
    }

    @NonNull
    public final C5224uh a() {
        return new C5224uh(this.b);
    }
}
