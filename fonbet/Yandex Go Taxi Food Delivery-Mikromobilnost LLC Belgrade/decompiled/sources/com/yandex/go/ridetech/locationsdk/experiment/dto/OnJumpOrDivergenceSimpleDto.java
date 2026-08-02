package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.kz60;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ridetech/locationsdk/experiment/dto/OnJumpOrDivergenceSimpleDto;", "Lcom/yandex/go/ridetech/locationsdk/experiment/dto/i;", "Companion", "ReachabilityDto", "$serializer", "com/yandex/go/ridetech/locationsdk/experiment/dto/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnJumpOrDivergenceSimpleDto extends i {
    public static final b Companion = new b();
    public static final i3y[] t;
    public final Set a;
    public final List b;
    public final List c;
    public final Double d;
    public final boolean e;
    public final boolean f;
    public final Long g;
    public final long h;
    public final long i;
    public final ReachabilityDto j;
    public final Long k;
    public final Long l;
    public final ReachabilityDto m;
    public final ReachabilityDto n;
    public final Long o;
    public final Long p;
    public final ReachabilityDto q;
    public final ReachabilityDto r;
    public final Long s;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        t = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new j660(29)), kotlin.a.b(lazyThreadSafetyMode, new kz60(0)), kotlin.a.b(lazyThreadSafetyMode, new kz60(1)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ OnJumpOrDivergenceSimpleDto(int i, Set set, List list, List list2, Double d, boolean z, boolean z2, Long l, long j, long j2, ReachabilityDto reachabilityDto, Long l2, Long l3, ReachabilityDto reachabilityDto2, ReachabilityDto reachabilityDto3, Long l4, Long l5, ReachabilityDto reachabilityDto4, ReachabilityDto reachabilityDto5, Long l6) {
        this.a = (i & 1) == 0 ? EmptySet.a : set;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
        if ((i & 128) == 0) {
            this.h = 10000L;
        } else {
            this.h = j;
        }
        if ((i & 256) == 0) {
            this.i = 5000L;
        } else {
            this.i = j2;
        }
        if ((i & 512) == 0) {
            this.j = new ReachabilityDto(0);
        } else {
            this.j = reachabilityDto;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = reachabilityDto2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = reachabilityDto3;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l5;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = reachabilityDto4;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = reachabilityDto5;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = l6;
        }
    }

    @Override // com.yandex.go.ridetech.locationsdk.experiment.dto.i
    public final Type a() {
        return Type.ON_JUMP_OR_DIVERGENCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ridetech/locationsdk/experiment/dto/OnJumpOrDivergenceSimpleDto$ReachabilityDto;", "", "Companion", "$serializer", "com/yandex/go/ridetech/locationsdk/experiment/dto/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class ReachabilityDto {
        public static final c Companion = new c();
        public final double a;
        public final long b;
        public final boolean c;

        public /* synthetic */ ReachabilityDto(int i, double d, long j, boolean z) {
            this.a = (i & 1) == 0 ? 100.0d : d;
            if ((i & 2) == 0) {
                this.b = 10000L;
            } else {
                this.b = j;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final long getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final double getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getC() {
            return this.c;
        }

        public ReachabilityDto(int i) {
            this.a = 100.0d;
            this.b = 10000L;
            this.c = false;
        }

        public ReachabilityDto() {
            this(0);
        }
    }

    public OnJumpOrDivergenceSimpleDto() {
        ReachabilityDto reachabilityDto = new ReachabilityDto(0);
        this.a = EmptySet.a;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = null;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = 10000L;
        this.i = 5000L;
        this.j = reachabilityDto;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }
}
