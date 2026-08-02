package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lo8s0;", "", "Companion", "f8s0", "i8s0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class o8s0 {
    public static final i8s0 Companion = new i8s0();
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public /* synthetic */ o8s0(int i, int i2, int i3, int i4, String str) {
        if ((i & 1) == 0) {
            this.a = Integer.MAX_VALUE;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = Integer.MAX_VALUE;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i4;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8s0)) {
            return false;
        }
        o8s0 o8s0Var = (o8s0) obj;
        return this.a == o8s0Var.a && this.b == o8s0Var.b && this.c == o8s0Var.c && jl40.l(this.d, o8s0Var.d);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.h(this.c, ", contextId=", this.d, Extension.C_BRAKE, b64.s(this.a, this.b, "ShowPolicy(maxShowCount=", ", maxUsageCount=", ", maxDailyShowCount="));
    }

    public o8s0(int i) {
        this.a = (i & 1) != 0 ? Integer.MAX_VALUE : 1;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = null;
    }

    public o8s0() {
        this(15);
    }
}
