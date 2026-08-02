package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jbm;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/Driver;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/i", "FeedbackBadges", "ProfileFact", "KisArt", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Driver {
    public static final i Companion = new i();
    public static final i3y[] u;
    public static final Driver v;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Forwarding e;
    public final String f;
    public final String g;
    public final zzs h;
    public final Double i;
    public final boolean j;
    public final List k;
    public final String l;
    public final List m;
    public final String n;
    public final String o;
    public final String p;
    public final KisArt q;
    public final List r;
    public final boolean s;
    public final boolean t;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new i3y[]{null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jbm(6)), null, kotlin.a.b(lazyThreadSafetyMode, new jbm(7)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jbm(8)), null, null};
        v = new Driver(0);
    }

    public /* synthetic */ Driver(int i, String str, String str2, String str3, String str4, Forwarding forwarding, String str5, String str6, zzs zzsVar, Double d, boolean z, List list, String str7, List list2, String str8, String str9, String str10, KisArt kisArt, List list3, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = forwarding;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = zzsVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
        int i2 = i & 1024;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.k = emptyList;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str7;
        }
        if ((i & 4096) == 0) {
            this.m = emptyList;
        } else {
            this.m = list2;
        }
        if ((i & 8192) == 0) {
            this.n = "";
        } else {
            this.n = str8;
        }
        if ((i & 16384) == 0) {
            this.o = "";
        } else {
            this.o = str9;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str10;
        }
        this.q = (65536 & i) == 0 ? KisArt.c : kisArt;
        if ((131072 & i) == 0) {
            this.r = emptyList;
        } else {
            this.r = list3;
        }
        if ((262144 & i) == 0) {
            this.s = false;
        } else {
            this.s = z2;
        }
        if ((i & 524288) == 0) {
            this.t = false;
        } else {
            this.t = z3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final zzs getH() {
        return this.h;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: g, reason: from getter */
    public final String getP() {
        return this.p;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/Driver$KisArt;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/k", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class KisArt {
        public static final k Companion = new k();
        public static final KisArt c = new KisArt(0);
        public final String a;
        public final String b;

        public /* synthetic */ KisArt(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public KisArt(int i) {
            this.a = "";
            this.b = "";
        }

        public KisArt() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/Driver$ProfileFact;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/l", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ProfileFact {
        public static final l Companion = new l();
        public final String a;
        public final String b;
        public final boolean c;

        public /* synthetic */ ProfileFact(String str, int i, String str2, boolean z) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public ProfileFact() {
            this.a = "";
            this.b = "";
            this.c = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/Driver$FeedbackBadges;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FeedbackBadges {
        public static final j Companion = new j();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ FeedbackBadges(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public FeedbackBadges() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }

    public Driver(int i) {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = "";
        this.g = "";
        this.h = null;
        this.i = null;
        this.j = false;
        EmptyList emptyList = EmptyList.a;
        this.k = emptyList;
        this.l = "";
        this.m = emptyList;
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = KisArt.c;
        this.r = emptyList;
        this.s = false;
        this.t = false;
    }

    public Driver() {
        this(0);
    }
}
