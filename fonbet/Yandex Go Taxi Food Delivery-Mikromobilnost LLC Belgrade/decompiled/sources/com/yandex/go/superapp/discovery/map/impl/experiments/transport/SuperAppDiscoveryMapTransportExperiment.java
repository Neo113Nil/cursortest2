package com.yandex.go.superapp.discovery.map.impl.experiments.transport;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.l9u;
import defpackage.tsv0;
import defpackage.vn11;
import defpackage.y35;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.StopModalDto;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/transport/SuperAppDiscoveryMapTransportExperiment;", "Lvn11;", "Lc6z;", "Companion", "TransportModeScreenConfig", "com/yandex/go/superapp/discovery/map/impl/experiments/transport/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppDiscoveryMapTransportExperiment implements vn11, c6z {
    public static final a Companion = new a();
    public static final i3y[] d;
    public static final SuperAppDiscoveryMapTransportExperiment e;
    public final Map b;
    public final Map c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new tsv0(9)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(10))};
        e = new SuperAppDiscoveryMapTransportExperiment(0);
    }

    public /* synthetic */ SuperAppDiscoveryMapTransportExperiment(int i, Map map, Map map2) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.b;
    }

    public SuperAppDiscoveryMapTransportExperiment() {
        this(0);
    }

    public SuperAppDiscoveryMapTransportExperiment(int i) {
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        this.b = f;
        this.c = f2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/transport/SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig;", "Ly35;", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/transport/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TransportModeScreenConfig implements y35 {
        public static final b Companion = new b();
        public static final i3y[] n;
        public final boolean b;
        public final long c;
        public final long d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final Map h;
        public final List i;
        public final StopModalDto j;
        public final int k;
        public final l9u l;
        public final long m;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            n = new i3y[]{null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tsv0(11)), kotlin.a.b(lazyThreadSafetyMode, new tsv0(12)), null, null, null, null};
        }

        public TransportModeScreenConfig(int i, boolean z, long j, long j2, String str, boolean z2, boolean z3, Map map, List list, StopModalDto stopModalDto, int i2, l9u l9uVar, long j3) {
            l9u l9uVar2;
            if ((i & 1) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 2) == 0) {
                this.c = 60L;
            } else {
                this.c = j;
            }
            if ((i & 4) == 0) {
                this.d = 30L;
            } else {
                this.d = j2;
            }
            if ((i & 8) == 0) {
                this.e = "";
            } else {
                this.e = str;
            }
            if ((i & 16) == 0) {
                this.f = false;
            } else {
                this.f = z2;
            }
            if ((i & 32) == 0) {
                this.g = false;
            } else {
                this.g = z3;
            }
            if ((i & 64) == 0) {
                this.h = kotlin.collections.b.f();
            } else {
                this.h = map;
            }
            if ((i & 128) == 0) {
                this.i = EmptyList.a;
            } else {
                this.i = list;
            }
            if ((i & 256) == 0) {
                this.j = null;
            } else {
                this.j = stopModalDto;
            }
            if ((i & 512) == 0) {
                this.k = 0;
            } else {
                this.k = i2;
            }
            if ((i & 1024) == 0) {
                l9u.Companion.getClass();
                l9uVar2 = l9u.d;
            } else {
                l9uVar2 = l9uVar;
            }
            this.l = l9uVar2;
            this.m = (i & 2048) == 0 ? 2000L : j3;
        }

        @Override // defpackage.y35
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.e;
        }

        @Override // defpackage.y35
        /* renamed from: c, reason: from getter */
        public final List getJ() {
            return this.i;
        }

        @Override // defpackage.y35
        /* renamed from: d, reason: from getter */
        public final boolean getH() {
            return this.g;
        }

        @Override // defpackage.y35
        /* renamed from: e, reason: from getter */
        public final Map getI() {
            return this.h;
        }

        public TransportModeScreenConfig() {
            Map f = kotlin.collections.b.f();
            l9u.Companion.getClass();
            this.b = false;
            this.c = 60L;
            this.d = 30L;
            this.e = "";
            this.f = false;
            this.g = false;
            this.h = f;
            this.i = EmptyList.a;
            this.j = null;
            this.k = 0;
            this.l = l9u.d;
            this.m = 2000L;
        }
    }
}
