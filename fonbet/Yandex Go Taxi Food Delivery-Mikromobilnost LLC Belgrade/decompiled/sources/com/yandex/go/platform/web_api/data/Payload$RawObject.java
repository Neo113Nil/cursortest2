package com.yandex.go.platform.web_api.data;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.qje;
import defpackage.smw0;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/platform/web_api/data/Payload$RawObject", "Lcom/yandex/go/platform/web_api/data/c;", "Companion", "$serializer", "com/yandex/go/platform/web_api/data/b", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Payload$RawObject extends c {
    public static final b Companion = new b();
    public static final KSerializer[] b;
    public final Map a;

    static {
        auu0 auu0Var = auu0.a;
        b = new KSerializer[]{new k8u(auu0Var, auu0Var, 1)};
    }

    public Payload$RawObject(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            qje.Z(i, 1, Payload$RawObject$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Payload$RawObject) && jl40.l(this.a, ((Payload$RawObject) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("RawObject(data="), this.a, ')');
    }
}
