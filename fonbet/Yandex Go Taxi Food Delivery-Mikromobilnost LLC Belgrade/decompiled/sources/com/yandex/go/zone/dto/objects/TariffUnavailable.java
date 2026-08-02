package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffUnavailable;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/n6", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffUnavailable {
    public static final n6 Companion = new n6();
    public static final i3y[] l = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(4)), null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final com.yandex.go.dto.response.d2 d;
    public final boolean e;
    public final boolean f;
    public final SuffixSpanType g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;

    public /* synthetic */ TariffUnavailable(int i, String str, String str2, String str3, com.yandex.go.dto.response.d2 d2Var, boolean z, boolean z2, SuffixSpanType suffixSpanType, String str4, boolean z3, String str5, String str6) {
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
            this.d = null;
        } else {
            this.d = d2Var;
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
            this.g = suffixSpanType;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffUnavailable)) {
            return false;
        }
        TariffUnavailable tariffUnavailable = (TariffUnavailable) obj;
        return jl40.l(this.a, tariffUnavailable.a) && jl40.l(this.b, tariffUnavailable.b) && jl40.l(this.c, tariffUnavailable.c) && jl40.l(this.d, tariffUnavailable.d) && this.e == tariffUnavailable.e && this.f == tariffUnavailable.f && this.g == tariffUnavailable.g && jl40.l(this.h, tariffUnavailable.h) && this.i == tariffUnavailable.i && jl40.l(this.j, tariffUnavailable.j) && jl40.l(this.k, tariffUnavailable.k);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        com.yandex.go.dto.response.d2 d2Var = this.d;
        int e = unr0.e(unr0.e((b + (d2Var == null ? 0 : d2Var.hashCode())) * 31, 31, this.e), 31, this.f);
        SuffixSpanType suffixSpanType = this.g;
        int e2 = unr0.e(unr0.b((e + (suffixSpanType == null ? 0 : suffixSpanType.hashCode())) * 31, 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode = (e2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TariffUnavailable(code=", this.a, ", message=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", orderButtonAction=");
        v.append(this.d);
        v.append(", scheduledOrderUnsupported=");
        nnm.v(", showPrice=", ", subtitleSuffixSpan=", v, this.e, this.f);
        v.append(this.g);
        v.append(", fallbackTariff=");
        v.append(this.h);
        v.append(", noServiceOffered=");
        unr0.A(", orderButtonColor=", this.j, ", orderButtonTextColor=", v, this.i);
        return oyr.t(v, this.k, Extension.C_BRAKE);
    }

    public TariffUnavailable() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = "";
        this.i = false;
        this.j = null;
        this.k = null;
    }
}
