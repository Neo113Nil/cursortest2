package com.yandex.go.tariffcard.experiment;

import com.yandex.go.tariffcard.api.experiment.HeaderCollapseButtonType;
import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.uiv0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/SummaryOptionsTariffCardExperiment;", "Lxn11;", "Companion", "com/yandex/go/tariffcard/experiment/o", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SummaryOptionsTariffCardExperiment implements xn11 {
    public static final o Companion = new o();
    public static final i3y[] s;
    public static final SummaryOptionsTariffCardExperiment t;
    public final boolean b;
    public final List c;
    public final List d;
    public final jsq0 e;
    public final List f;
    public final Map g;
    public final HeaderCollapseButtonType h;
    public final Map i;
    public final Map j;
    public final boolean k;
    public final Map l;
    public final Map m;
    public final Map n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final List r;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new c3u0(29)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(4)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(5)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(6)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(7)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(8)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(9)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(10)), null, kotlin.a.b(lazyThreadSafetyMode, new uiv0(0)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(1)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(2)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new uiv0(3))};
        t = new SummaryOptionsTariffCardExperiment(131070);
    }

    public /* synthetic */ SummaryOptionsTariffCardExperiment(int i, boolean z, List list, List list2, jsq0 jsq0Var, List list3, Map map, HeaderCollapseButtonType headerCollapseButtonType, Map map2, Map map3, boolean z2, Map map4, Map map5, Map map6, boolean z3, boolean z4, boolean z5, List list4) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = jsq0Var;
        }
        if ((i & 16) == 0) {
            this.f = emptyList;
        } else {
            this.f = list3;
        }
        if ((i & 32) == 0) {
            this.g = kotlin.collections.b.f();
        } else {
            this.g = map;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = headerCollapseButtonType;
        }
        if ((i & 128) == 0) {
            this.i = kotlin.collections.b.f();
        } else {
            this.i = map2;
        }
        if ((i & 256) == 0) {
            this.j = kotlin.collections.b.f();
        } else {
            this.j = map3;
        }
        if ((i & 512) == 0) {
            this.k = false;
        } else {
            this.k = z2;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = map4;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = map5;
        }
        this.n = (i & 4096) == 0 ? kotlin.collections.b.f() : map6;
        if ((i & 8192) == 0) {
            this.o = false;
        } else {
            this.o = z3;
        }
        if ((i & 16384) == 0) {
            this.p = false;
        } else {
            this.p = z4;
        }
        if ((32768 & i) == 0) {
            this.q = false;
        } else {
            this.q = z5;
        }
        if ((i & 65536) == 0) {
            this.r = emptyList;
        } else {
            this.r = list4;
        }
    }

    public SummaryOptionsTariffCardExperiment() {
        this(131071);
    }

    public SummaryOptionsTariffCardExperiment(int i) {
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        Map f3 = kotlin.collections.b.f();
        Map f4 = kotlin.collections.b.f();
        this.b = false;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = null;
        this.f = emptyList;
        this.g = f;
        this.h = null;
        this.i = f2;
        this.j = f3;
        this.k = false;
        this.l = null;
        this.m = null;
        this.n = f4;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = emptyList;
    }
}
