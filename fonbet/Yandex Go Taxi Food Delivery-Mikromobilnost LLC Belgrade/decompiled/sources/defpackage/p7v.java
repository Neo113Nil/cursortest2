package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp7v;", "", "Companion", "b7v", "d7v", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class p7v {
    public static final d7v Companion = new d7v();
    public final String a;
    public final String b;

    public /* synthetic */ p7v(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7v)) {
            return false;
        }
        p7v p7vVar = (p7v) obj;
        return jl40.l(this.a, p7vVar.a) && jl40.l(this.b, p7vVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("Image(imageUrl=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }

    public p7v(int i) {
        this.a = null;
        this.b = null;
    }

    public p7v() {
        this(0);
    }
}
