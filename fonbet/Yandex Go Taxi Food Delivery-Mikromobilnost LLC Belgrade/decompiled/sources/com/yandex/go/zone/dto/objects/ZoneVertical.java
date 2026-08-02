package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.bd61;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ZoneVertical;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/w6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneVertical {
    public static final w6 Companion = new w6();
    public static final i3y[] o;
    public final String a;
    public final String b;
    public final VerticalType c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final n7v h;
    public final n7v i;
    public final n7v j;
    public final String k;
    public final ZoneVerticalMulticlass l;
    public final List m;
    public final boolean n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(20)), null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(21)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bd61(22)), null};
    }

    public /* synthetic */ ZoneVertical(int i, String str, String str2, VerticalType verticalType, String str3, String str4, List list, String str5, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, String str6, ZoneVerticalMulticlass zoneVerticalMulticlass, List list2, boolean z) {
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
            this.c = VerticalType.NONE;
        } else {
            this.c = verticalType;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        int i2 = i & 32;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.f = emptyList;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = n7vVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = n7vVar2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = n7vVar3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = zoneVerticalMulticlass;
        }
        if ((i & 4096) == 0) {
            this.m = emptyList;
        } else {
            this.m = list2;
        }
        this.n = (i & 8192) == 0 ? false : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneVertical)) {
            return false;
        }
        ZoneVertical zoneVertical = (ZoneVertical) obj;
        return jl40.l(this.a, zoneVertical.a) && jl40.l(this.b, zoneVertical.b) && this.c == zoneVertical.c && jl40.l(this.d, zoneVertical.d) && jl40.l(this.e, zoneVertical.e) && jl40.l(this.f, zoneVertical.f) && jl40.l(this.g, zoneVertical.g) && jl40.l(this.h, zoneVertical.h) && jl40.l(this.i, zoneVertical.i) && jl40.l(this.j, zoneVertical.j) && jl40.l(this.k, zoneVertical.k) && jl40.l(this.l, zoneVertical.l) && jl40.l(this.m, zoneVertical.m) && this.n == zoneVertical.n;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        n7v n7vVar = this.h;
        int hashCode2 = (hashCode + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        n7v n7vVar2 = this.i;
        int hashCode3 = (hashCode2 + (n7vVar2 == null ? 0 : n7vVar2.hashCode())) * 31;
        n7v n7vVar3 = this.j;
        int hashCode4 = (hashCode3 + (n7vVar3 == null ? 0 : n7vVar3.hashCode())) * 31;
        String str2 = this.k;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ZoneVerticalMulticlass zoneVerticalMulticlass = this.l;
        return Boolean.hashCode(this.n) + unr0.c((hashCode5 + (zoneVerticalMulticlass != null ? zoneVerticalMulticlass.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder v = b64.v("ZoneVertical(id=", this.a, ", tariffClass=", this.b, ", type=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", titleTemplate=");
        tse0.x(this.e, ", tariffs=", ", defaultTariff=", v, this.f);
        v.append(this.g);
        v.append(", image=");
        v.append(this.h);
        v.append(", icon=");
        v.append(this.i);
        v.append(", headerIcon=");
        v.append(this.j);
        v.append(", headerTitle=");
        v.append(this.k);
        v.append(", multiclass=");
        v.append(this.l);
        v.append(", requirementOverrides=");
        v.append(this.m);
        v.append(", trapOnly=");
        v.append(this.n);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ZoneVertical() {
        VerticalType verticalType = VerticalType.NONE;
        this.a = "";
        this.b = "";
        this.c = verticalType;
        this.d = "";
        this.e = "";
        EmptyList emptyList = EmptyList.a;
        this.f = emptyList;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = emptyList;
        this.n = false;
    }
}
