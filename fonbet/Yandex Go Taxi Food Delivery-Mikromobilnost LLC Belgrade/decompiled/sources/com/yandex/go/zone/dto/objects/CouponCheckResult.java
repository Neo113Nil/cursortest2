package com.yandex.go.zone.dto.objects;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CouponCheckResult;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/i0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CouponCheckResult {
    public static final i0 Companion = new i0();
    public static final i3y[] j = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(8)), null, null, null};
    public final boolean a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final Boolean g;
    public final ief h;
    public final String i;

    public /* synthetic */ CouponCheckResult(int i, boolean z, double d, String str, String str2, String str3, List list, Boolean bool, ief iefVar, String str4) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = iefVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponCheckResult)) {
            return false;
        }
        CouponCheckResult couponCheckResult = (CouponCheckResult) obj;
        return this.a == couponCheckResult.a && Double.compare(this.b, couponCheckResult.b) == 0 && jl40.l(this.c, couponCheckResult.c) && jl40.l(this.d, couponCheckResult.d) && jl40.l(this.e, couponCheckResult.e) && jl40.l(this.f, couponCheckResult.f) && jl40.l(this.g, couponCheckResult.g) && jl40.l(this.h, couponCheckResult.h) && jl40.l(this.i, couponCheckResult.i);
    }

    public final int hashCode() {
        int a = unr0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        ief iefVar = this.h;
        int hashCode6 = (hashCode5 + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        String str4 = this.i;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponCheckResult(isValid=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        g8e.D(sb, ", valueStr=", this.c, ", description=", this.d);
        sb.append(", cardDescription=");
        sb.append(this.e);
        sb.append(", details=");
        sb.append(this.f);
        sb.append(", isValidAny=");
        sb.append(this.g);
        sb.append(", currencyRules=");
        sb.append(this.h);
        return unr0.r(sb, ", errorCode=", this.i, Extension.C_BRAKE);
    }

    public CouponCheckResult() {
        this.a = false;
        this.b = 0.0d;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
