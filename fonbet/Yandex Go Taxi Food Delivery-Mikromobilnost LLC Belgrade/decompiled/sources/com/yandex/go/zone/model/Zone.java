package com.yandex.go.zone.model;

import com.yandex.go.zone.dto.objects.SupportedFeedbackChoices;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import defpackage.gsq0;
import defpackage.gw00;
import defpackage.h73;
import defpackage.i3y;
import defpackage.ih21;
import defpackage.jd90;
import defpackage.jl40;
import defpackage.lwj0;
import defpackage.ny61;
import defpackage.ob61;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tcc;
import defpackage.yw01;
import defpackage.z151;
import defpackage.zn11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/model/Zone;", "Llwj0;", "Companion", "com/yandex/go/zone/model/g", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Zone extends lwj0 {
    public static final g Companion = new g();
    public static final i3y[] G;
    public static final Zone H;
    public final String A;
    public final String B;
    public final ClientCacheSettings C;
    public final List D;
    public final zn11 E;
    public final i3y F;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final ReqDestinationRules d;
    public final boolean e;
    public final TimeZone f;
    public final PaymentOptions g;
    public final SupportedFeedbackChoices h;
    public final String i;
    public final ih21 j;
    public final List k;
    public final SupportPage l;
    public final String m;
    public final int n;
    public final int[] o;
    public final int p;
    public final kotlinx.serialization.json.b q;
    public final List r;
    public final List s;
    public final String t;
    public final boolean u;
    public final List v;
    public final List w;
    public final ZoneMulticlass x;
    public final Set y;
    public final jd90 z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        G = new i3y[]{null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z151(23)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z151(24)), kotlin.a.b(lazyThreadSafetyMode, new z151(25)), null, null, kotlin.a.b(lazyThreadSafetyMode, new z151(26)), kotlin.a.b(lazyThreadSafetyMode, new z151(27)), null, kotlin.a.b(lazyThreadSafetyMode, new z151(28)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z151(29)), null};
        H = new Zone(0);
    }

    public Zone(int i, boolean z, boolean z2, ReqDestinationRules reqDestinationRules, boolean z3, TimeZone timeZone, PaymentOptions paymentOptions, SupportedFeedbackChoices supportedFeedbackChoices, String str, ih21 ih21Var, List list, SupportPage supportPage, String str2, int i2, int[] iArr, int i3, kotlinx.serialization.json.b bVar, List list2, List list3, String str3, boolean z4, List list4, List list5, ZoneMulticlass zoneMulticlass, Set set, jd90 jd90Var, String str4, String str5, ClientCacheSettings clientCacheSettings, List list6, zn11 zn11Var) {
        this.a = "";
        final int i4 = 0;
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = new ReqDestinationRules(0);
        } else {
            this.d = reqDestinationRules;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = timeZone;
        }
        if ((i & 32) == 0) {
            this.g = new PaymentOptions(0);
        } else {
            this.g = paymentOptions;
        }
        if ((i & 64) == 0) {
            SupportedFeedbackChoices.Companion.getClass();
            this.h = SupportedFeedbackChoices.j;
        } else {
            this.h = supportedFeedbackChoices;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = ih21Var;
        }
        int i5 = i & 512;
        EmptyList emptyList = EmptyList.a;
        if (i5 == 0) {
            this.k = emptyList;
        } else {
            this.k = list;
        }
        if ((i & 1024) == 0) {
            this.l = new SupportPage(0);
        } else {
            this.l = supportPage;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = str2;
        }
        if ((i & 4096) == 0) {
            this.n = 0;
        } else {
            this.n = i2;
        }
        if ((i & 8192) == 0) {
            this.o = new int[0];
        } else {
            this.o = iArr;
        }
        if ((i & 16384) == 0) {
            this.p = 0;
        } else {
            this.p = i3;
        }
        if ((32768 & i) == 0) {
            this.q = null;
        } else {
            this.q = bVar;
        }
        if ((65536 & i) == 0) {
            this.r = emptyList;
        } else {
            this.r = list2;
        }
        if ((131072 & i) == 0) {
            this.s = emptyList;
        } else {
            this.s = list3;
        }
        if ((262144 & i) == 0) {
            this.t = "";
        } else {
            this.t = str3;
        }
        if ((524288 & i) == 0) {
            this.u = false;
        } else {
            this.u = z4;
        }
        if ((1048576 & i) == 0) {
            this.v = emptyList;
        } else {
            this.v = list4;
        }
        if ((2097152 & i) == 0) {
            this.w = emptyList;
        } else {
            this.w = list5;
        }
        if ((4194304 & i) == 0) {
            this.x = null;
        } else {
            this.x = zoneMulticlass;
        }
        this.y = (8388608 & i) == 0 ? EmptySet.a : set;
        this.z = (16777216 & i) == 0 ? jd90.c : jd90Var;
        if ((33554432 & i) == 0) {
            this.A = "";
        } else {
            this.A = str4;
        }
        if ((67108864 & i) == 0) {
            this.B = "";
        } else {
            this.B = str5;
        }
        if ((134217728 & i) == 0) {
            this.C = null;
        } else {
            this.C = clientCacheSettings;
        }
        if ((268435456 & i) == 0) {
            this.D = emptyList;
        } else {
            this.D = list6;
        }
        if ((i & 536870912) == 0) {
            this.E = null;
        } else {
            this.E = zn11Var;
        }
        this.F = kotlin.a.a(new sls(this) { // from class: com.yandex.go.zone.model.f
            public final /* synthetic */ Zone b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i6 = i4;
                Zone zone = this.b;
                switch (i6) {
                    case 0:
                        g gVar = Zone.Companion;
                        yw01 yw01Var = new yw01(kotlin.sequences.b.g(new h73(1, zone.g()), new ob61(3)), Zone$1$names$2.b);
                        HashSet hashSet = new HashSet();
                        kotlin.sequences.b.r(yw01Var, hashSet);
                        return Collections.unmodifiableSet(hashSet);
                    default:
                        g gVar2 = Zone.Companion;
                        yw01 yw01Var2 = new yw01(kotlin.sequences.b.g(new h73(1, zone.g()), new ob61(4)), Zone$retainRequirementNames$2$names$2.b);
                        HashSet hashSet2 = new HashSet();
                        kotlin.sequences.b.r(yw01Var2, hashSet2);
                        return Collections.unmodifiableSet(hashSet2);
                }
            }
        });
    }

    @Override // defpackage.lwj0
    /* renamed from: e, reason: from getter */
    public final zn11 getG() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final HashSet g() {
        List list = this.k;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((ZoneTariffInfo) it.next()).o);
        }
        return hashSet;
    }

    public final boolean h() {
        return !this.k.isEmpty();
    }

    public final boolean i(Zone zone) {
        if (!jl40.l(this.a, zone.a)) {
            return false;
        }
        List list = this.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ZoneTariffInfo) obj).d != null) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((ZoneTariffInfo) obj2).d, obj2);
        }
        List list2 = zone.k;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((ZoneTariffInfo) obj3).d != null) {
                arrayList2.add(obj3);
            }
        }
        int d2 = gw00.d(tcc.n(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
        for (Object obj4 : arrayList2) {
            linkedHashMap2.put(((ZoneTariffInfo) obj4).d, obj4);
        }
        if (!jl40.l(linkedHashMap2.keySet(), linkedHashMap.keySet()) || !jl40.l(this.w, zone.w)) {
            return false;
        }
        for (String str : linkedHashMap2.keySet()) {
            Object obj5 = linkedHashMap2.get(str);
            if (obj5 == null) {
                ny61.g("Required value was null.");
                return false;
            }
            List list3 = ((ZoneTariffInfo) obj5).o;
            Object obj6 = linkedHashMap.get(str);
            if (obj6 == null) {
                ny61.g("Required value was null.");
                return false;
            }
            List list4 = ((ZoneTariffInfo) obj6).o;
            if (list3.size() != list4.size() || !list3.containsAll(list4) || !list4.containsAll(list3)) {
                return false;
            }
        }
        return jl40.l(zone.v, this.v);
    }

    public final String toString() {
        return oyr.p("City{name='", this.a, "'}");
    }

    public Zone() {
        this(0);
    }

    public Zone(String str, boolean z, boolean z2, ReqDestinationRules reqDestinationRules, boolean z3, TimeZone timeZone, PaymentOptions paymentOptions, SupportedFeedbackChoices supportedFeedbackChoices, String str2, ih21 ih21Var, List list, SupportPage supportPage, String str3, int i, int[] iArr, int i2, kotlinx.serialization.json.b bVar, List list2, List list3, String str4, boolean z4, List list4, List list5, ZoneMulticlass zoneMulticlass, Set set, jd90 jd90Var, String str5, String str6, ClientCacheSettings clientCacheSettings, List list6, zn11 zn11Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = reqDestinationRules;
        this.e = z3;
        this.f = timeZone;
        this.g = paymentOptions;
        this.h = supportedFeedbackChoices;
        this.i = str2;
        this.j = ih21Var;
        this.k = list;
        this.l = supportPage;
        this.m = str3;
        this.n = i;
        this.o = iArr;
        this.p = i2;
        this.q = bVar;
        this.r = list2;
        this.s = list3;
        this.t = str4;
        this.u = z4;
        this.v = list4;
        this.w = list5;
        this.x = zoneMulticlass;
        this.y = set;
        this.z = jd90Var;
        this.A = str5;
        this.B = str6;
        this.C = clientCacheSettings;
        this.D = list6;
        this.E = zn11Var;
        final int i3 = 1;
        this.F = kotlin.a.a(new sls(this) { // from class: com.yandex.go.zone.model.f
            public final /* synthetic */ Zone b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i6 = i3;
                Zone zone = this.b;
                switch (i6) {
                    case 0:
                        g gVar = Zone.Companion;
                        yw01 yw01Var = new yw01(kotlin.sequences.b.g(new h73(1, zone.g()), new ob61(3)), Zone$1$names$2.b);
                        HashSet hashSet = new HashSet();
                        kotlin.sequences.b.r(yw01Var, hashSet);
                        return Collections.unmodifiableSet(hashSet);
                    default:
                        g gVar2 = Zone.Companion;
                        yw01 yw01Var2 = new yw01(kotlin.sequences.b.g(new h73(1, zone.g()), new ob61(4)), Zone$retainRequirementNames$2$names$2.b);
                        HashSet hashSet2 = new HashSet();
                        kotlin.sequences.b.r(yw01Var2, hashSet2);
                        return Collections.unmodifiableSet(hashSet2);
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Zone(int i) {
        this("", false, false, r4, false, (TimeZone) null, r7, SupportedFeedbackChoices.j, (String) null, (ih21) null, (List) r11, new SupportPage(0), (String) null, 0, new int[0], 0, (kotlinx.serialization.json.b) null, (List) r11, (List) r11, "", false, (List) r11, (List) r11, (ZoneMulticlass) null, (Set) r25, r26, "", "", (ClientCacheSettings) null, (List) r11, (zn11) null);
        ReqDestinationRules reqDestinationRules = new ReqDestinationRules(0);
        PaymentOptions paymentOptions = new PaymentOptions(0);
        SupportedFeedbackChoices.Companion.getClass();
        EmptySet emptySet = EmptySet.a;
        jd90 jd90Var = jd90.c;
        EmptyList emptyList = EmptyList.a;
    }
}
