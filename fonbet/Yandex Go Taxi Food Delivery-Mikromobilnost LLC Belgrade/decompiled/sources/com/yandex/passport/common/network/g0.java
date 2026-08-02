package com.yandex.passport.common.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes15.dex */
public final class g0 implements k0 {
    public static final f0 Companion = new f0();
    public static final KSerializer[] d = {BackendError.Companion.serializer(), null, null};
    public final BackendError a;
    public final String b;
    public final String c;

    public /* synthetic */ g0(int i, BackendError backendError, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, e0.a.getDescriptor());
            throw null;
        }
        this.a = backendError;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    @Override // com.yandex.passport.common.network.k0
    public final d a() {
        return new d(this.a.toString(), this.b, this.c);
    }

    public final String b() {
        return this.b;
    }

    public final BackendError c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && jl40.l(this.b, g0Var.b) && jl40.l(this.c, g0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleErrorResponse(error=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", requestId=");
        return b64.p(sb, this.c, ')');
    }
}
