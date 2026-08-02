package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljh60;", "", "Companion", "hh60", "ih60", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class jh60 {
    public static final ih60 Companion = new ih60();
    public final String a;
    public final int b;
    public final int c;

    public /* synthetic */ jh60(int i, int i2, int i3, String str) {
        this.a = (i & 1) == 0 ? null : str;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh60)) {
            return false;
        }
        jh60 jh60Var = (jh60) obj;
        return jl40.l(this.a, jh60Var.a) && this.b == jh60Var.b && this.c == jh60Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "NotificationDisplayLimit(type=", this.a, ", days=", ", limit="));
    }

    public jh60() {
        this.a = null;
        this.b = 0;
        this.c = 0;
    }
}
