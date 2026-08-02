package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfn4;", "", "Companion", "dn4", "en4", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class fn4 {
    public static final en4 Companion = new en4();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ fn4(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn4)) {
            return false;
        }
        fn4 fn4Var = (fn4) obj;
        return jl40.l(this.a, fn4Var.a) && jl40.l(this.b, fn4Var.b) && jl40.l(this.c, fn4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("BadgeViewDto(title=", this.a, ", bgColor=", this.b, ", textColor="), this.c, Extension.C_BRAKE);
    }

    public fn4(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
    }

    public fn4() {
        this(0);
    }
}
