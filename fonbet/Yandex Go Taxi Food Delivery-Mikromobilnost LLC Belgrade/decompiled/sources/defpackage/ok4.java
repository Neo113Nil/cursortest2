package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lok4;", "", "Companion", "mk4", "nk4", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ok4 {
    public static final nk4 Companion = new nk4();
    public final String a;
    public final fn4 b;

    public /* synthetic */ ok4(int i, String str, fn4 fn4Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new fn4(0);
        } else {
            this.b = fn4Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final fn4 getB() {
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
        if (!(obj instanceof ok4)) {
            return false;
        }
        ok4 ok4Var = (ok4) obj;
        return jl40.l(this.a, ok4Var.a) && jl40.l(this.b, ok4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BadgeInfoDto(type=" + this.a + ", badgeView=" + this.b + Extension.C_BRAKE;
    }

    public ok4() {
        this(0);
    }

    public ok4(int i) {
        fn4 fn4Var = new fn4(0);
        this.a = "";
        this.b = fn4Var;
    }
}
