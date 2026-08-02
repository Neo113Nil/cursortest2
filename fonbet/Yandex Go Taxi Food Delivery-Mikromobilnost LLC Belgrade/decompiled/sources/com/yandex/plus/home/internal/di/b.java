package com.yandex.plus.home.internal.di;

import defpackage.cop0;
import defpackage.dc20;
import defpackage.fih;
import defpackage.i3y;
import defpackage.i4j0;
import defpackage.l2z;
import defpackage.lho;
import defpackage.p42;
import defpackage.skd0;
import defpackage.sls;
import defpackage.sop0;
import defpackage.uho;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes8.dex */
public final class b {
    public final i3y A;
    public final i3y B;
    public final i3y C;
    public final i3y D;
    public final i3y E;
    public final i3y F;
    public final i3y G;
    public final cop0 a;
    public final com.yandex.plus.domain.auth.impl.a b;
    public final String c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public final i3y i;
    public final i3y j;
    public final i3y k;
    public final i3y l;
    public final i3y m;
    public final i3y n;
    public final i3y o;
    public final i3y p;
    public final i3y q;
    public final i3y r;
    public final i3y s;
    public final i3y t;
    public final i3y u;
    public final i3y v;
    public final i3y w;
    public final i3y x;
    public final i3y y;
    public final i3y z;

    public b(cop0 cop0Var, com.yandex.plus.domain.auth.impl.a aVar, sls slsVar, l2z l2zVar) {
        this.a = cop0Var;
        this.b = aVar;
        i3y i3yVar = skd0.a;
        this.c = skd0.d().toString();
        final int i = 0;
        this.d = kotlin.a.a(new p42(this, i));
        this.e = kotlin.a.a(new p42(this, 28));
        this.f = kotlin.a.a(new p42(this, 10));
        this.g = kotlin.a.a(new p42(this, 13));
        this.h = kotlin.a.a(new p42(this, 14));
        this.i = kotlin.a.a(new p42(this, 15));
        this.j = kotlin.a.a(new p42(this, 16));
        this.k = kotlin.a.a(new p42(this, 17));
        this.l = kotlin.a.a(new p42(this, 18));
        this.m = kotlin.a.a(new p42(this, 11));
        this.n = kotlin.a.a(new p42(this, 20));
        this.o = kotlin.a.a(new p42(this, 24));
        this.p = kotlin.a.a(new p42(this, 25));
        final int i2 = 1;
        this.q = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.internal.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                b bVar = this.b;
                switch (i3) {
                    case 0:
                        return new fih(new PropertyReference0Impl(bVar) { // from class: com.yandex.plus.home.internal.di.AnalyticsModule$payButtonAnalytics$2$1
                            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                            public final Object get() {
                                return ((b) this.receiver).c();
                            }
                        }, (com.yandex.plus.home.analytics.evgen.a) bVar.f.getValue());
                    default:
                        return new dc20(new PropertyReference0Impl(bVar) { // from class: com.yandex.plus.home.internal.di.AnalyticsModule$webEventSender$2$1
                            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                            public final Object get() {
                                return ((b) this.receiver).c();
                            }
                        });
                }
            }
        });
        this.r = kotlin.a.a(new p42(this, 26));
        this.s = kotlin.a.a(new p42(this, 27));
        this.t = kotlin.a.a(new p42(this, 29));
        this.u = kotlin.a.a(new p42(this, i2));
        this.v = kotlin.a.a(new p42(this, 2));
        this.w = kotlin.a.a(slsVar);
        this.x = kotlin.a.a(l2zVar);
        this.y = kotlin.a.a(new p42(this, 3));
        this.z = kotlin.a.a(new p42(this, 4));
        this.A = kotlin.a.a(new p42(this, 5));
        this.B = kotlin.a.a(new p42(this, 6));
        this.C = kotlin.a.a(new p42(this, 7));
        this.D = kotlin.a.a(new p42(this, 8));
        this.E = kotlin.a.a(new p42(this, 9));
        this.F = kotlin.a.a(new p42(this, 12));
        this.G = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.internal.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                Object bVar = this.b;
                switch (i3) {
                    case 0:
                        return new fih(new PropertyReference0Impl(bVar) { // from class: com.yandex.plus.home.internal.di.AnalyticsModule$payButtonAnalytics$2$1
                            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                            public final Object get() {
                                return ((b) this.receiver).c();
                            }
                        }, (com.yandex.plus.home.analytics.evgen.a) bVar.f.getValue());
                    default:
                        return new dc20(new PropertyReference0Impl(bVar) { // from class: com.yandex.plus.home.internal.di.AnalyticsModule$webEventSender$2$1
                            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                            public final Object get() {
                                return ((b) this.receiver).c();
                            }
                        });
                }
            }
        });
    }

    public final lho a() {
        return (lho) this.g.getValue();
    }

    public final uho b() {
        return (uho) this.h.getValue();
    }

    public final i4j0 c() {
        return (i4j0) this.x.getValue();
    }

    public final void d() {
        i3y i3yVar = skd0.a;
        skd0.b = new AnalyticsModule$initSdkLogger$1(this, b.class, "reporters", "getReporters$plus_sdk_release()Lcom/yandex/plus/core/analytics/Reporters;", 0);
        ReentrantLock reentrantLock = sop0.b;
        reentrantLock.lock();
        try {
            Integer num = 10000;
            sop0.a = num.intValue();
            while (true) {
                LinkedList linkedList = sop0.c;
                if (linkedList.size() < sop0.a) {
                    return;
                } else {
                    linkedList.remove();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
