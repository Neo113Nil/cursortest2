package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5126qm implements ProtobufConverter {
    public final Je a = new Je();
    public final C5139ra b = new C5139ra();
    public final Rm c = new Rm();
    public final C5132r3 d = new C5132r3();
    public final C5334z2 e = new C5334z2();
    public final I6 f = new I6();
    public final Nm g = new Nm();
    public final Ad h = new Ad();
    public final O9 i = new O9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Gm fromModel(@NonNull C5203tm c5203tm) {
        Gm gm = new Gm();
        gm.s = c5203tm.u;
        gm.t = c5203tm.v;
        String str = c5203tm.a;
        if (str != null) {
            gm.a = str;
        }
        List list = c5203tm.f;
        if (list != null) {
            gm.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c5203tm.g;
        if (list2 != null) {
            gm.g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c5203tm.b;
        if (list3 != null) {
            gm.c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c5203tm.h;
        if (list4 != null) {
            gm.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c5203tm.i;
        if (map != null) {
            gm.h = this.f.fromModel(map);
        }
        Ie ie = c5203tm.s;
        if (ie != null) {
            gm.v = this.a.fromModel(ie);
        }
        String str2 = c5203tm.j;
        if (str2 != null) {
            gm.j = str2;
        }
        String str3 = c5203tm.c;
        if (str3 != null) {
            gm.d = str3;
        }
        String str4 = c5203tm.d;
        if (str4 != null) {
            gm.e = str4;
        }
        String str5 = c5203tm.e;
        if (str5 != null) {
            gm.r = str5;
        }
        gm.i = this.b.fromModel(c5203tm.m);
        String str6 = c5203tm.k;
        if (str6 != null) {
            gm.k = str6;
        }
        String str7 = c5203tm.l;
        if (str7 != null) {
            gm.l = str7;
        }
        gm.m = c5203tm.p;
        gm.b = c5203tm.n;
        gm.q = c5203tm.o;
        RetryPolicyConfig retryPolicyConfig = c5203tm.t;
        gm.w = retryPolicyConfig.maxIntervalSeconds;
        gm.x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c5203tm.q;
        if (str8 != null) {
            gm.n = str8;
        }
        Qm qm = c5203tm.r;
        if (qm != null) {
            this.c.getClass();
            Fm fm = new Fm();
            fm.a = qm.a;
            gm.p = fm;
        }
        gm.u = c5203tm.w;
        C5081p3 c5081p3 = c5203tm.x;
        if (c5081p3 != null) {
            this.d.getClass();
            C5329ym c5329ym = new C5329ym();
            c5329ym.a = c5081p3.a;
            gm.y = c5329ym;
        }
        C5309y2 c5309y2 = c5203tm.y;
        if (c5309y2 != null) {
            gm.z = this.e.fromModel(c5309y2);
        }
        gm.A = this.g.fromModel(c5203tm.z);
        gm.B = this.h.fromModel(c5203tm.A);
        gm.C = this.i.fromModel(c5203tm.B);
        return gm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5203tm toModel(@NonNull Gm gm) {
        C5177sm c5177sm = new C5177sm(this.b.toModel(gm.i));
        c5177sm.a = gm.a;
        c5177sm.j = gm.j;
        c5177sm.c = gm.d;
        c5177sm.b = Arrays.asList(gm.c);
        c5177sm.g = Arrays.asList(gm.g);
        c5177sm.f = Arrays.asList(gm.f);
        c5177sm.d = gm.e;
        c5177sm.e = gm.r;
        c5177sm.h = Arrays.asList(gm.o);
        c5177sm.k = gm.k;
        c5177sm.l = gm.l;
        c5177sm.q = gm.m;
        c5177sm.o = gm.b;
        c5177sm.p = gm.q;
        c5177sm.t = gm.s;
        c5177sm.u = gm.t;
        c5177sm.r = gm.n;
        c5177sm.v = gm.u;
        c5177sm.w = new RetryPolicyConfig(gm.w, gm.x);
        c5177sm.i = this.f.toModel(gm.h);
        Dm dm = gm.v;
        if (dm != null) {
            this.a.getClass();
            c5177sm.n = new Ie(dm.a, dm.b);
        }
        Fm fm = gm.p;
        if (fm != null) {
            this.c.getClass();
            c5177sm.s = new Qm(fm.a);
        }
        C5329ym c5329ym = gm.y;
        if (c5329ym != null) {
            this.d.getClass();
            c5177sm.x = new C5081p3(c5329ym.a);
        }
        C5304xm c5304xm = gm.z;
        if (c5304xm != null) {
            c5177sm.y = this.e.toModel(c5304xm);
        }
        Em em = gm.A;
        if (em != null) {
            this.g.getClass();
            c5177sm.z = new Mm(em.a);
        }
        c5177sm.A = this.h.toModel(gm.B);
        Am am = gm.C;
        if (am != null) {
            this.i.getClass();
            c5177sm.B = new N9(am.a);
        }
        return new C5203tm(c5177sm);
    }
}
