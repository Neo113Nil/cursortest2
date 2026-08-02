package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/CountersShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/q", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CountersShowPolicy {
    public static final q Companion = new q();
    public final String a;
    public final int b;
    public final Integer c;
    public final int d;

    public /* synthetic */ CountersShowPolicy(int i, int i2, int i3, Integer num, String str) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = Integer.MAX_VALUE;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = Integer.MAX_VALUE;
        } else {
            this.d = i3;
        }
    }

    public static final /* synthetic */ void d(CountersShowPolicy countersShowPolicy, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(countersShowPolicy.a, "")) {
            yjdVar.o(serialDescriptor, 0, countersShowPolicy.a);
        }
        if (yjdVar.F() || countersShowPolicy.b != Integer.MAX_VALUE) {
            yjdVar.A(1, countersShowPolicy.b, serialDescriptor);
        }
        if (yjdVar.F() || countersShowPolicy.c != null) {
            yjdVar.g(serialDescriptor, 2, h6w.a, countersShowPolicy.c);
        }
        if (!yjdVar.F() && countersShowPolicy.d == Integer.MAX_VALUE) {
            return;
        }
        yjdVar.A(3, countersShowPolicy.d, serialDescriptor);
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public final int c() {
        Integer num = this.c;
        return num != null ? num.intValue() : this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountersShowPolicy)) {
            return false;
        }
        CountersShowPolicy countersShowPolicy = (CountersShowPolicy) obj;
        return jl40.l(this.a, countersShowPolicy.a) && this.b == countersShowPolicy.b && jl40.l(this.c, countersShowPolicy.c) && this.d == countersShowPolicy.d;
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return Integer.hashCode(this.d) + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "CountersShowPolicy(id=", this.a, ", maxShowCount=", ", _maxUsageCount=");
        u.append(this.c);
        u.append(", _max_widget_usage_count=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public CountersShowPolicy() {
        this(null, 0, 0, 15);
    }

    public CountersShowPolicy(String str, int i, int i2, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        i = (i3 & 2) != 0 ? Integer.MAX_VALUE : i;
        i2 = (i3 & 8) != 0 ? Integer.MAX_VALUE : i2;
        this.a = str;
        this.b = i;
        this.c = null;
        this.d = i2;
    }
}
