package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SurgeBalanceContentInfo;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/v5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SurgeBalanceContentInfo {
    public static final v5 Companion = new v5();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public /* synthetic */ SurgeBalanceContentInfo(int i, int i2, String str, String str2, String str3, String str4) {
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
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeBalanceContentInfo)) {
            return false;
        }
        SurgeBalanceContentInfo surgeBalanceContentInfo = (SurgeBalanceContentInfo) obj;
        return jl40.l(this.a, surgeBalanceContentInfo.a) && jl40.l(this.b, surgeBalanceContentInfo.b) && jl40.l(this.c, surgeBalanceContentInfo.c) && jl40.l(this.d, surgeBalanceContentInfo.d) && this.e == surgeBalanceContentInfo.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("SurgeBalanceContentInfo(leadingIconTag=", this.a, ", trailIconTag=", this.b, ", valueIconTag=");
        g8e.D(v, this.c, ", color=", this.d, ", balanceInner=");
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }

    public SurgeBalanceContentInfo(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
    }

    public SurgeBalanceContentInfo() {
        this(0);
    }
}
