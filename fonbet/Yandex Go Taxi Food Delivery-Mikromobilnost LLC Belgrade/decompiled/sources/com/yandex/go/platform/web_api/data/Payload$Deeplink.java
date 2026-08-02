package com.yandex.go.platform.web_api.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/platform/web_api/data/Payload$Deeplink", "Lcom/yandex/go/platform/web_api/data/c;", "Companion", "$serializer", "com/yandex/go/platform/web_api/data/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Payload$Deeplink extends c {
    public static final a Companion = new a();
    public final String a;
    public final boolean b;

    public Payload$Deeplink(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, Payload$Deeplink$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payload$Deeplink)) {
            return false;
        }
        Payload$Deeplink payload$Deeplink = (Payload$Deeplink) obj;
        return jl40.l(this.a, payload$Deeplink.a) && this.b == payload$Deeplink.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deeplink(uri=");
        sb.append(this.a);
        sb.append(", isInternal=");
        return unr0.u(sb, this.b, ')');
    }

    public Payload$Deeplink(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
