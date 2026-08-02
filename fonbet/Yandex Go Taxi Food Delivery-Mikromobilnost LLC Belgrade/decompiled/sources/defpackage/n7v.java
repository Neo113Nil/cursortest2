package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln7v;", "", "Companion", "e7v", "c7v", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class n7v {
    public static final e7v Companion = new e7v();
    public static final n7v f = new n7v(null, 31);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ih21 e;

    public /* synthetic */ n7v(int i, String str, String str2, String str3, String str4, ih21 ih21Var) {
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
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ih21Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7v)) {
            return false;
        }
        n7v n7vVar = (n7v) obj;
        return jl40.l(this.a, n7vVar.a) && jl40.l(this.b, n7vVar.b) && jl40.l(this.c, n7vVar.c) && jl40.l(this.d, n7vVar.d) && jl40.l(this.e, n7vVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ih21 ih21Var = this.e;
        return hashCode4 + (ih21Var != null ? ih21Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Image(url=", this.a, ", tag=", this.b, ", imageTag=");
        g8e.D(v, this.c, ", sizeHint=", this.d, ", urlParts=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public n7v() {
        this(null, 31);
    }

    public n7v(String str, int i) {
        str = (i & 2) != 0 ? null : str;
        this.a = null;
        this.b = str;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
