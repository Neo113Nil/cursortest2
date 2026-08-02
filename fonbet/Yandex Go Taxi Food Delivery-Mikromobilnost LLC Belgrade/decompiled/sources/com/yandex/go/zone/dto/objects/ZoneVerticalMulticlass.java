package com.yandex.go.zone.dto.objects;

import com.yandex.go.multitariff.SelectionRules;
import defpackage.bd61;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlass;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/x6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneVerticalMulticlass {
    public static final x6 Companion = new x6();
    public static final i3y[] j = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bd61(23)), null, null, null, null, null, null, null};
    public final Integer a;
    public final List b;
    public final n7v c;
    public final String d;
    public final ZoneVerticalMulticlassDetails e;
    public final SelectionRules f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public ZoneVerticalMulticlass(int i, Integer num, List list, n7v n7vVar, String str, ZoneVerticalMulticlassDetails zoneVerticalMulticlassDetails, SelectionRules selectionRules, boolean z, String str2, boolean z2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = n7vVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            ZoneVerticalMulticlassDetails.Companion.getClass();
            this.e = ZoneVerticalMulticlassDetails.d;
        } else {
            this.e = zoneVerticalMulticlassDetails;
        }
        if ((i & 32) == 0) {
            this.f = SelectionRules.b;
        } else {
            this.f = selectionRules;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneVerticalMulticlass)) {
            return false;
        }
        ZoneVerticalMulticlass zoneVerticalMulticlass = (ZoneVerticalMulticlass) obj;
        return jl40.l(this.a, zoneVerticalMulticlass.a) && jl40.l(this.b, zoneVerticalMulticlass.b) && jl40.l(this.c, zoneVerticalMulticlass.c) && jl40.l(this.d, zoneVerticalMulticlass.d) && jl40.l(this.e, zoneVerticalMulticlass.e) && jl40.l(this.f, zoneVerticalMulticlass.f) && this.g == zoneVerticalMulticlass.g && jl40.l(this.h, zoneVerticalMulticlass.h) && this.i == zoneVerticalMulticlass.i;
    }

    public final int hashCode() {
        Integer num = this.a;
        int c = unr0.c((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        n7v n7vVar = this.c;
        int e = unr0.e((this.f.a.hashCode() + ((this.e.hashCode() + unr0.b((c + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.i) + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoneVerticalMulticlass(position=");
        sb.append(this.a);
        sb.append(", tariffs=");
        sb.append(this.b);
        sb.append(", selectorIcon=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", details=");
        sb.append(this.e);
        sb.append(", selectionRules=");
        sb.append(this.f);
        sb.append(", canBeDefault=");
        unr0.A(", mode=", this.h, ", shouldDeactivateInappropriateTariffs=", sb, this.g);
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }

    public ZoneVerticalMulticlass() {
        ZoneVerticalMulticlassDetails.Companion.getClass();
        ZoneVerticalMulticlassDetails zoneVerticalMulticlassDetails = ZoneVerticalMulticlassDetails.d;
        SelectionRules selectionRules = SelectionRules.b;
        this.a = null;
        this.b = EmptyList.a;
        this.c = null;
        this.d = "";
        this.e = zoneVerticalMulticlassDetails;
        this.f = selectionRules;
        this.g = false;
        this.h = null;
        this.i = false;
    }
}
