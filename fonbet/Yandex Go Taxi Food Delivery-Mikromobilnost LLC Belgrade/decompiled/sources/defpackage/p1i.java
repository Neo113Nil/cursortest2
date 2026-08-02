package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp1i;", "", "Companion", "n1i", "o1i", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class p1i {
    public static final o1i Companion = new o1i();
    public static final i3y[] f = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new n5h(12))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ p1i(int i, String str, String str2, String str3, String str4, List list) {
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
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1i)) {
            return false;
        }
        p1i p1iVar = (p1i) obj;
        return jl40.l(this.a, p1iVar.a) && jl40.l(this.b, p1iVar.b) && jl40.l(this.c, p1iVar.c) && jl40.l(this.d, p1iVar.d) && jl40.l(this.e, p1iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryContinueWithRequirementAlertDto(title=", this.a, ", description=", this.b, ", cancelButtonText=");
        g8e.D(v, this.c, ", continueButtonText=", this.d, ", conditions=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    public p1i(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = EmptyList.a;
    }

    public p1i() {
        this(0);
    }
}
