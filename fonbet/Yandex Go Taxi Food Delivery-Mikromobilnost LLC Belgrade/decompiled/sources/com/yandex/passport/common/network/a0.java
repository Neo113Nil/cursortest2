package com.yandex.passport.common.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.HexString;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/common/network/a0;", "Lcom/yandex/passport/common/network/k0;", "Companion", "com/yandex/passport/common/network/y", "com/yandex/passport/common/network/z", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a0 implements k0 {
    public static final z Companion = new z();
    public static final KSerializer[] e;
    public final BackendError a;
    public final List b;
    public final String c;
    public final String d;

    static {
        b bVar = BackendError.Companion;
        e = new KSerializer[]{bVar.serializer(), new p53(bVar.serializer(), 0), null, null};
    }

    public /* synthetic */ a0(int i, BackendError backendError, List list, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = backendError;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    @Override // com.yandex.passport.common.network.k0
    public final d a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(HexString.CHAR_SPACE);
        sb.append(this.b);
        return new d(sb.toString(), this.c, this.d);
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final BackendError getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && jl40.l(this.b, a0Var.b) && jl40.l(this.c, a0Var.c) && jl40.l(this.d, a0Var.d);
    }

    public final int hashCode() {
        BackendError backendError = this.a;
        int c = unr0.c((backendError == null ? 0 : backendError.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleErrorResponse(error=");
        sb.append(this.a);
        sb.append(", errors=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", requestId=");
        return b64.p(sb, this.d, ')');
    }

    public a0() {
        this.a = null;
        this.b = EmptyList.a;
        this.c = null;
        this.d = null;
    }
}
