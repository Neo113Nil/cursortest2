package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Details;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/r", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Details {
    public static final r Companion = new r();
    public final Title a;
    public final String b;

    public /* synthetic */ Details(int i, Title title, String str) {
        this.a = (i & 1) == 0 ? new Title(0) : title;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public static final /* synthetic */ void a(Details details, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(details.a, new Title(0))) {
            yjdVar.e(serialDescriptor, 0, Title$$serializer.INSTANCE, details.a);
        }
        if (!yjdVar.F() && jl40.l(details.b, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 1, details.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Details)) {
            return false;
        }
        Details details = (Details) obj;
        return jl40.l(this.a, details.a) && jl40.l(this.b, details.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Details(content=" + this.a + ", accessibilityLabel=" + this.b + Extension.C_BRAKE;
    }

    public Details() {
        this(0);
    }

    public Details(int i) {
        this.a = new Title(0);
        this.b = "";
    }
}
