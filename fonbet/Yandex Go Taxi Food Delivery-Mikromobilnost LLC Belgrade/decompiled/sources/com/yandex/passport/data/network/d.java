package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.qje;
import java.util.List;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class d implements com.yandex.passport.common.network.k0 {
    public static final c Companion = new c();
    public static final KSerializer[] e = {new p53(BackendError.Companion.serializer(), 0), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ d(String str, int i, String str2, String str3, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, b.a.getDescriptor());
            throw null;
        }
        this.a = list;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    @Override // com.yandex.passport.common.network.k0
    public final com.yandex.passport.common.network.d a() {
        return new com.yandex.passport.common.network.d(this.a.toString(), this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b) && jl40.l(this.c, dVar.c) && jl40.l(this.d, dVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResponse(errors=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", captchaImageUrl=");
        sb.append(this.c);
        sb.append(", requestId=");
        return b64.p(sb, this.d, ')');
    }
}
