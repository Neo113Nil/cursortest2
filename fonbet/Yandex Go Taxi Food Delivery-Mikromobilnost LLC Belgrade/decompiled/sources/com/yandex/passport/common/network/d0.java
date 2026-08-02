package com.yandex.passport.common.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qcx;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class d0 implements k0 {
    public static final c0 Companion = new c0();
    public final kotlinx.serialization.json.c a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ d0(int i, String str, String str2, String str3, kotlinx.serialization.json.c cVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, b0.a.getDescriptor());
            throw null;
        }
        this.a = cVar;
        if ((i & 2) == 0) {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) qcx.m(cVar).get("phrase");
            str = String.valueOf(bVar != null ? qcx.n(bVar) : null);
        }
        this.b = str;
        if ((i & 4) == 0) {
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) qcx.m(cVar).get("trace");
            this.c = String.valueOf(bVar2 != null ? qcx.n(bVar2) : null);
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    @Override // com.yandex.passport.common.network.k0
    public final d a() {
        return new d(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jl40.l(this.a, d0Var.a) && jl40.l(this.b, d0Var.b) && jl40.l(this.c, d0Var.c) && jl40.l(this.d, d0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhraseTraceErrorResponse(status=");
        sb.append(this.a);
        sb.append(", phrase=");
        sb.append(this.b);
        sb.append(", trace=");
        sb.append(this.c);
        sb.append(", requestId=");
        return b64.p(sb, this.d, ')');
    }
}
