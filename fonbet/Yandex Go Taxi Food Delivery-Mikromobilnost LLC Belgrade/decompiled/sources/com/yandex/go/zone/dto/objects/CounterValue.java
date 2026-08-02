package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CounterValue;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/h0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CounterValue {
    public static final h0 Companion = new h0();
    public final int a;
    public final String b;

    public /* synthetic */ CounterValue(int i, int i2, String str) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CounterValue)) {
            return false;
        }
        CounterValue counterValue = (CounterValue) obj;
        return this.a == counterValue.a && jl40.l(this.b, counterValue.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "CounterValue(duration=", ", label=", this.b, Extension.C_BRAKE);
    }

    public CounterValue() {
        this.a = 0;
        this.b = "";
    }
}
