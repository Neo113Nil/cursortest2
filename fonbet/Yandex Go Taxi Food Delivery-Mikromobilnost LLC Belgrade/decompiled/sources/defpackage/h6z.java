package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh6z;", "", "Companion", "f6z", "g6z", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class h6z {
    public static final g6z Companion = new g6z();
    public final String a;
    public final b580 b;

    public /* synthetic */ h6z(int i, String str, b580 b580Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = b580Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6z)) {
            return false;
        }
        h6z h6zVar = (h6z) obj;
        return jl40.l(this.a, h6zVar.a) && jl40.l(this.b, h6zVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        b580 b580Var = this.b;
        return hashCode + (b580Var != null ? b580Var.hashCode() : 0);
    }

    public final String toString() {
        return "StorageEntity(storageKey=" + this.a + ", requirement=" + this.b + Extension.C_BRAKE;
    }

    public h6z(String str, b580 b580Var) {
        this.a = str;
        this.b = b580Var;
    }

    public h6z() {
        this(null, null);
    }
}
