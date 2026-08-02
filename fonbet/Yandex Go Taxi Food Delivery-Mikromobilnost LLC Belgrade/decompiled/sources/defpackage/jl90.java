package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljl90;", "", "Companion", "a", "gl90", "fl90", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class jl90 {
    public static final gl90 Companion = new gl90();
    public static final jl90 e = new jl90(0);
    public final String a;
    public final String b;
    public final jq21 c;
    public final a d;

    public /* synthetic */ jl90(int i, String str, String str2, jq21 jq21Var, a aVar) {
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
            this.c = jq21Var;
        }
        if ((i & 8) == 0) {
            this.d = new a(0);
        } else {
            this.d = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl90)) {
            return false;
        }
        jl90 jl90Var = (jl90) obj;
        return jl40.l(this.a, jl90Var.a) && jl40.l(this.b, jl90Var.b) && jl40.l(this.c, jl90Var.c) && jl40.l(this.d, jl90Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jq21 jq21Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (jq21Var != null ? jq21Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PassengerProfile(firstName=", this.a, ", rating=", this.b, ", userPhoto=");
        v.append(this.c);
        v.append(", userProfileStatus=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljl90$a;", "", "Companion", "hl90", "il90", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final il90 Companion = new il90();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return unr0.p("UserProfileStatus(text=", this.a, ", status=", this.b, Extension.C_BRAKE);
        }

        public a(int i) {
            this.a = null;
            this.b = "";
        }

        public a() {
            this(0);
        }
    }

    public jl90() {
        this(0);
    }

    public jl90(int i) {
        a aVar = new a(0);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = aVar;
    }
}
