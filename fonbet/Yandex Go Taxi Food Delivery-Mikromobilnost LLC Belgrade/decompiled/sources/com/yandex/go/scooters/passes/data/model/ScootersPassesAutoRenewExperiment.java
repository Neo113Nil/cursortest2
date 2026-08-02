package com.yandex.go.scooters.passes.data.model;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/ScootersPassesAutoRenewExperiment;", "Lw96;", "Lc6z;", "Companion", "Keys", "com/yandex/go/scooters/passes/data/model/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersPassesAutoRenewExperiment extends w96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(4)), null, null, null};
    public static final Keys h;
    public final boolean b;
    public final Map c;
    public final Keys d;
    public final Keys e;
    public final boolean f;

    static {
        new ScootersPassesAutoRenewExperiment(0);
        h = new Keys(0);
    }

    public /* synthetic */ ScootersPassesAutoRenewExperiment(int i, boolean z, Map map, Keys keys, Keys keys2, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        int i2 = i & 4;
        Keys keys3 = h;
        if (i2 == 0) {
            this.d = keys3;
        } else {
            this.d = keys;
        }
        if ((i & 8) == 0) {
            this.e = keys3;
        } else {
            this.e = keys2;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/ScootersPassesAutoRenewExperiment$Keys;", "", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Keys {
        public static final d Companion = new d();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(5))};
        public final List a;

        public /* synthetic */ Keys(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public Keys(int i) {
            this.a = EmptyList.a;
        }

        public Keys() {
            this(0);
        }
    }

    public ScootersPassesAutoRenewExperiment() {
        this(0);
    }

    public ScootersPassesAutoRenewExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        Keys keys = h;
        this.d = keys;
        this.e = keys;
        this.f = false;
    }
}
