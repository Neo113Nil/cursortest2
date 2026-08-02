package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SurgeAlertContentBalance;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/r5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SurgeAlertContentBalance {
    public static final r5 Companion = new r5();
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public /* synthetic */ SurgeAlertContentBalance(int i, int i2, String str, String str2, String str3) {
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
        this.c = (i & 4) == 0 ? 0 : i2;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeAlertContentBalance)) {
            return false;
        }
        SurgeAlertContentBalance surgeAlertContentBalance = (SurgeAlertContentBalance) obj;
        return jl40.l(this.a, surgeAlertContentBalance.a) && jl40.l(this.b, surgeAlertContentBalance.b) && this.c == surgeAlertContentBalance.c && jl40.l(this.d, surgeAlertContentBalance.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return xvz.h(this.c, ", backgroundColor=", this.d, Extension.C_BRAKE, b64.v("SurgeAlertContentBalance(color=", this.a, ", valueIcon=", this.b, ", balanceInner="));
    }

    public SurgeAlertContentBalance(int i) {
        this.a = "";
        this.b = "";
        this.c = 0;
        this.d = "";
    }

    public SurgeAlertContentBalance() {
        this(0);
    }
}
