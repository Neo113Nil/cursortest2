package com.yandex.go.taxi.order.search.polling.model;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jbm;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/search/polling/model/DriverCandidate;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/search/polling/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DriverCandidate {
    public static final a Companion = new a();
    public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jbm(9)), null, null, null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ DriverCandidate(int i, String str, String str2, List list, String str3, String str4, String str5, String str6) {
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
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverCandidate)) {
            return false;
        }
        DriverCandidate driverCandidate = (DriverCandidate) obj;
        return jl40.l(this.a, driverCandidate.a) && jl40.l(this.b, driverCandidate.b) && jl40.l(this.c, driverCandidate.c) && jl40.l(this.d, driverCandidate.d) && jl40.l(this.e, driverCandidate.e) && jl40.l(this.f, driverCandidate.f) && jl40.l(this.g, driverCandidate.g);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DriverCandidate(id=", this.a, ", tariffName=", this.b, ", positions=");
        oyr.D(", carColorCode=", this.d, ", name=", v, this.c);
        g8e.D(v, this.e, ", rating=", this.f, ", photoUrl=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }

    public DriverCandidate(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public DriverCandidate() {
        this((127 & 1) != 0 ? "" : null, (127 & 2) != 0 ? "" : null, null, null, null, null, (127 & 4) != 0 ? EmptyList.a : null);
    }
}
