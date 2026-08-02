package com.yandex.passport.common.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.qje;
import java.util.List;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class x implements k0 {
    public static final w Companion = new w();
    public static final KSerializer[] c = {new p53(BackendError.Companion.serializer(), 0), null};
    public final List a;
    public final String b;

    public /* synthetic */ x(int i, List list, String str) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, v.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    @Override // com.yandex.passport.common.network.k0
    public final d a() {
        return new d(this.a.toString(), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return jl40.l(this.a, xVar.a) && jl40.l(this.b, xVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultErrorResponse(errors=");
        sb.append(this.a);
        sb.append(", requestId=");
        return b64.p(sb, this.b, ')');
    }
}
