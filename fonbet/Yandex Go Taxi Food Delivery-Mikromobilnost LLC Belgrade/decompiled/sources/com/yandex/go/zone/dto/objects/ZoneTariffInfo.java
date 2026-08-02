package com.yandex.go.zone.dto.objects;

import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.zone.model.ZoneMode;
import defpackage.b64;
import defpackage.bd61;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.nnm;
import defpackage.oay0;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.wv51;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ZoneTariffInfo;", "", "Companion", "com/yandex/go/zone/dto/objects/v6", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneTariffInfo {
    public static final v6 Companion = new v6();
    public static final i3y[] K;
    public final List A;
    public final List B;
    public final ExtraContactPhonesRules C;
    public final boolean D;
    public final String E;
    public final DeliveryZoneTariffExtra F;
    public final List G;
    public final SuggestsPreferences H;
    public final AttributedDescription I;
    public final transient i3y J;
    public final String a;
    public final String b;
    public final n7v c;
    public final String d;
    public final String e;
    public final n7v f;
    public final n7v g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final Boolean r;
    public final boolean s;
    public final TariffCard t;
    public final boolean u;
    public final String v;
    public final int w;
    public final int x;
    public final Map y;
    public final List z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        K = new i3y[]{null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(11)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(14)), kotlin.a.b(lazyThreadSafetyMode, new bd61(15)), kotlin.a.b(lazyThreadSafetyMode, new bd61(16)), kotlin.a.b(lazyThreadSafetyMode, new bd61(17)), kotlin.a.b(lazyThreadSafetyMode, new bd61(18)), kotlin.a.b(lazyThreadSafetyMode, new bd61(19)), null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(8)), kotlin.a.b(lazyThreadSafetyMode, new bd61(9)), kotlin.a.b(lazyThreadSafetyMode, new bd61(10)), kotlin.a.b(lazyThreadSafetyMode, new bd61(12)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(13)), null, null};
    }

    public /* synthetic */ ZoneTariffInfo(int i, int i2, String str, String str2, n7v n7vVar, String str3, String str4, n7v n7vVar2, n7v n7vVar3, List list, boolean z, boolean z2, boolean z3, List list2, List list3, List list4, List list5, List list6, List list7, Boolean bool, boolean z4, TariffCard tariffCard, boolean z5, String str5, int i3, int i4, Map map, List list8, List list9, List list10, ExtraContactPhonesRules extraContactPhonesRules, boolean z6, String str6, DeliveryZoneTariffExtra deliveryZoneTariffExtra, List list11, SuggestsPreferences suggestsPreferences, AttributedDescription attributedDescription) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = n7v.f;
        } else {
            this.c = n7vVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = n7v.f;
        } else {
            this.f = n7vVar2;
        }
        if ((i & 64) == 0) {
            this.g = n7v.f;
        } else {
            this.g = n7vVar3;
        }
        int i5 = i & 128;
        EmptyList emptyList = EmptyList.a;
        if (i5 == 0) {
            this.h = emptyList;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z2;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list4;
        }
        if ((i & 16384) == 0) {
            this.o = emptyList;
        } else {
            this.o = list5;
        }
        if ((32768 & i) == 0) {
            this.p = emptyList;
        } else {
            this.p = list6;
        }
        if ((65536 & i) == 0) {
            this.q = emptyList;
        } else {
            this.q = list7;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool;
        }
        if ((262144 & i) == 0) {
            this.s = false;
        } else {
            this.s = z4;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = tariffCard;
        }
        if ((1048576 & i) == 0) {
            this.u = false;
        } else {
            this.u = z5;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str5;
        }
        if ((4194304 & i) == 0) {
            this.w = 0;
        } else {
            this.w = i3;
        }
        if ((8388608 & i) == 0) {
            this.x = 0;
        } else {
            this.x = i4;
        }
        this.y = (16777216 & i) == 0 ? kotlin.collections.b.f() : map;
        if ((33554432 & i) == 0) {
            this.z = emptyList;
        } else {
            this.z = list8;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = list9;
        }
        if ((134217728 & i) == 0) {
            this.B = emptyList;
        } else {
            this.B = list10;
        }
        this.C = (268435456 & i) == 0 ? ExtraContactPhonesRules.f : extraContactPhonesRules;
        this.D = (536870912 & i) == 0 ? true : z6;
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = str6;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = deliveryZoneTariffExtra;
        }
        if ((i2 & 1) == 0) {
            this.G = emptyList;
        } else {
            this.G = list11;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = suggestsPreferences;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = attributedDescription;
        }
        this.J = kotlin.a.a(new oay0(28, this));
    }

    public final boolean a(String str) {
        Collection collection = this.A;
        if (collection == null) {
            collection = EmptyList.a;
        }
        ZoneMode.Companion.getClass();
        if (!com.yandex.go.zone.model.h.a(str)) {
            Collection collection2 = collection;
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return true;
            }
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (jl40.l((String) it.next(), str)) {
                    return false;
                }
            }
            return true;
        }
        if (collection.isEmpty()) {
            return false;
        }
        Collection collection3 = collection;
        if ((collection3 instanceof Collection) && collection3.isEmpty()) {
            return true;
        }
        Iterator it2 = collection3.iterator();
        while (it2.hasNext()) {
            if (com.yandex.go.zone.model.h.a((String) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneTariffInfo)) {
            return false;
        }
        ZoneTariffInfo zoneTariffInfo = (ZoneTariffInfo) obj;
        return jl40.l(this.a, zoneTariffInfo.a) && jl40.l(this.b, zoneTariffInfo.b) && jl40.l(this.c, zoneTariffInfo.c) && jl40.l(this.d, zoneTariffInfo.d) && jl40.l(this.e, zoneTariffInfo.e) && jl40.l(this.f, zoneTariffInfo.f) && jl40.l(this.g, zoneTariffInfo.g) && jl40.l(this.h, zoneTariffInfo.h) && this.i == zoneTariffInfo.i && this.j == zoneTariffInfo.j && this.k == zoneTariffInfo.k && jl40.l(this.l, zoneTariffInfo.l) && jl40.l(this.m, zoneTariffInfo.m) && jl40.l(this.n, zoneTariffInfo.n) && jl40.l(this.o, zoneTariffInfo.o) && jl40.l(this.p, zoneTariffInfo.p) && jl40.l(this.q, zoneTariffInfo.q) && jl40.l(this.r, zoneTariffInfo.r) && this.s == zoneTariffInfo.s && jl40.l(this.t, zoneTariffInfo.t) && this.u == zoneTariffInfo.u && jl40.l(this.v, zoneTariffInfo.v) && this.w == zoneTariffInfo.w && this.x == zoneTariffInfo.x && jl40.l(this.y, zoneTariffInfo.y) && jl40.l(this.z, zoneTariffInfo.z) && jl40.l(this.A, zoneTariffInfo.A) && jl40.l(this.B, zoneTariffInfo.B) && jl40.l(this.C, zoneTariffInfo.C) && this.D == zoneTariffInfo.D && jl40.l(this.E, zoneTariffInfo.E) && jl40.l(this.F, zoneTariffInfo.F) && jl40.l(this.G, zoneTariffInfo.G) && jl40.l(this.H, zoneTariffInfo.H) && jl40.l(this.I, zoneTariffInfo.I);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int e = unr0.e(unr0.e(unr0.e(unr0.c((this.g.hashCode() + ((this.f.hashCode() + unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        List list = this.l;
        int hashCode3 = (e + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.m;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.n;
        int c = unr0.c(unr0.c(unr0.c((hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q);
        Boolean bool = this.r;
        int e2 = unr0.e((c + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.s);
        TariffCard tariffCard = this.t;
        int e3 = unr0.e((e2 + (tariffCard == null ? 0 : tariffCard.hashCode())) * 31, 31, this.u);
        String str4 = this.v;
        int c2 = unr0.c(unr0.d(oyr.b(this.x, oyr.b(this.w, (e3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31, this.y), 31, this.z);
        List list4 = this.A;
        int e4 = unr0.e((this.C.hashCode() + unr0.c((c2 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.B)) * 31, 31, this.D);
        String str5 = this.E;
        int hashCode5 = (e4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DeliveryZoneTariffExtra deliveryZoneTariffExtra = this.F;
        int c3 = unr0.c((hashCode5 + (deliveryZoneTariffExtra == null ? 0 : deliveryZoneTariffExtra.a.hashCode())) * 31, 31, this.G);
        SuggestsPreferences suggestsPreferences = this.H;
        int hashCode6 = (c3 + (suggestsPreferences == null ? 0 : suggestsPreferences.a.hashCode())) * 31;
        AttributedDescription attributedDescription = this.I;
        return hashCode6 + (attributedDescription != null ? attributedDescription.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ZoneTariffInfo(description=", this.a, ", id=", this.b, ", image=");
        v.append(this.c);
        v.append(", name=");
        v.append(this.d);
        v.append(", tariffClass=");
        v.append(this.e);
        v.append(", icon=");
        v.append(this.f);
        v.append(", productIcon=");
        v.append(this.g);
        v.append(", serviceLevels=");
        v.append(this.h);
        v.append(", isDefault=");
        nnm.v(", canBeDefault=", ", isOnlyForSoonOrders=", v, this.i, this.j);
        v.append(this.k);
        v.append(", paymentTypes=");
        v.append(this.l);
        v.append(", viewSections=");
        nnm.w(v, this.m, ", groupDefinitions=", this.n, ", supportedRequirements=");
        nnm.w(v, this.o, ", commentSupportedRequirements=", this.p, ", requirementGroups=");
        v.append(this.q);
        v.append(", orderForOtherProhibited=");
        v.append(this.r);
        v.append(", isHidden=");
        v.append(this.s);
        v.append(", tariffCard=");
        v.append(this.t);
        v.append(", isCommentsDisabled=");
        unr0.A(", supportedRequirementsLabel=", this.v, ", maxWaitingTimeMin=", v, this.u);
        vfc.u(this.w, this.x, ", maxRoutePointsCount=", ", notifications=", v);
        v.append(this.y);
        v.append(", brandings=");
        v.append(this.z);
        v.append(", supportedModes=");
        nnm.w(v, this.A, ", actions=", this.B, ", extraContactPhonesRules=");
        v.append(this.C);
        v.append(", tollRoadsEnabled=");
        v.append(this.D);
        v.append(", orderFlow=");
        v.append(this.E);
        v.append(", deliveryExtra=");
        v.append(this.F);
        v.append(", customEndpoints=");
        v.append(this.G);
        v.append(", suggestsPreferences=");
        v.append(this.H);
        v.append(", attributedDescription=");
        v.append(this.I);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ZoneTariffInfo(String str, String str2, n7v n7vVar, String str3, String str4, n7v n7vVar2, n7v n7vVar3, List list, boolean z, boolean z2, boolean z3, List list2, List list3, List list4, List list5, List list6, List list7, Boolean bool, boolean z4, TariffCard tariffCard, boolean z5, String str5, int i, int i2, Map map, List list8, List list9, List list10, ExtraContactPhonesRules extraContactPhonesRules, boolean z6, String str6, DeliveryZoneTariffExtra deliveryZoneTariffExtra, List list11, SuggestsPreferences suggestsPreferences, AttributedDescription attributedDescription) {
        this.a = str;
        this.b = str2;
        this.c = n7vVar;
        this.d = str3;
        this.e = str4;
        this.f = n7vVar2;
        this.g = n7vVar3;
        this.h = list;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = list2;
        this.m = list3;
        this.n = list4;
        this.o = list5;
        this.p = list6;
        this.q = list7;
        this.r = bool;
        this.s = z4;
        this.t = tariffCard;
        this.u = z5;
        this.v = str5;
        this.w = i;
        this.x = i2;
        this.y = map;
        this.z = list8;
        this.A = list9;
        this.B = list10;
        this.C = extraContactPhonesRules;
        this.D = z6;
        this.E = str6;
        this.F = deliveryZoneTariffExtra;
        this.G = list11;
        this.H = suggestsPreferences;
        this.I = attributedDescription;
        this.J = kotlin.a.a(new wv51(2, this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZoneTariffInfo() {
        this(null, null, r3, null, "", r3, r3, r8, false, false, false, null, null, null, r8, r8, r8, null, false, null, false, null, 0, 0, r25, r8, null, r8, r29, true, null, null, r8, null, null);
        n7v n7vVar = n7v.f;
        Map f = kotlin.collections.b.f();
        ExtraContactPhonesRules extraContactPhonesRules = ExtraContactPhonesRules.f;
        EmptyList emptyList = EmptyList.a;
    }
}
