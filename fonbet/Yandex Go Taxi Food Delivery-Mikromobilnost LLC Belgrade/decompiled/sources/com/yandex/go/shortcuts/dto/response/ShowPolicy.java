package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ShowPolicy;", "", "Companion", "com/yandex/go/shortcuts/dto/response/q2", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShowPolicy {
    public static final q2 Companion = new q2();
    public static final ShowPolicy d = new ShowPolicy(0);
    public final String a;
    public final int b;
    public final int c;

    public /* synthetic */ ShowPolicy(int i, int i2, int i3, String str) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
    }

    public static final /* synthetic */ void a(ShowPolicy showPolicy, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(showPolicy.a, "")) {
            yjdVar.o(serialDescriptor, 0, showPolicy.a);
        }
        if (yjdVar.F() || showPolicy.b != 0) {
            yjdVar.A(1, showPolicy.b, serialDescriptor);
        }
        if (!yjdVar.F() && showPolicy.c == 0) {
            return;
        }
        yjdVar.A(2, showPolicy.c, serialDescriptor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowPolicy)) {
            return false;
        }
        ShowPolicy showPolicy = (ShowPolicy) obj;
        return jl40.l(this.a, showPolicy.a) && this.b == showPolicy.b && this.c == showPolicy.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", ", hoursToExpiration="));
    }

    public ShowPolicy(int i) {
        this.a = "";
        this.b = 0;
        this.c = 0;
    }

    public ShowPolicy() {
        this(0);
    }
}
