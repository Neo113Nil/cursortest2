package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class y6 implements com.yandex.passport.common.network.k0 {
    public static final x6 Companion = new x6();
    public static final KSerializer[] c = {BackendError.Companion.serializer(), null};
    public final BackendError a;
    public final String b;

    public /* synthetic */ y6(int i, BackendError backendError, String str) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, w6.a.getDescriptor());
            throw null;
        }
        this.a = backendError;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    @Override // com.yandex.passport.common.network.k0
    public final com.yandex.passport.common.network.d a() {
        return new com.yandex.passport.common.network.d(this.a.toString(), null, this.b);
    }

    public final BackendError b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return this.a == y6Var.a && jl40.l(this.b, y6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResult(error=");
        sb.append(this.a);
        sb.append(", requestId=");
        return b64.p(sb, this.b, ')');
    }
}
