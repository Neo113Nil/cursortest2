package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbze;", "", "Companion", "zye", "aze", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class bze {
    public static final aze Companion = new aze();
    public final String a;
    public final int b;
    public final int c;

    public /* synthetic */ bze(int i, int i2, int i3, String str) {
        this.a = (i & 1) == 0 ? "" : str;
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
        if (!(obj instanceof bze)) {
            return false;
        }
        bze bzeVar = (bze) obj;
        return jl40.l(this.a, bzeVar.a) && this.b == bzeVar.b && this.c == bzeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "CounterArrowActionButton(deeplink=", this.a, ", counterTotal=", ", counterCurrent="));
    }

    public bze(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public bze() {
        this("", 0, 0);
    }
}
