package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnmi;", "", "Companion", "lmi", "mmi", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class nmi {
    public static final mmi Companion = new mmi();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(18))};
    public final String a;
    public final List b;

    public /* synthetic */ nmi(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmi)) {
            return false;
        }
        nmi nmiVar = (nmi) obj;
        return jl40.l(this.a, nmiVar.a) && jl40.l(this.b, nmiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("DeliveryRequirement(requirementName=", this.a, ", availabilityConfigs=", Extension.C_BRAKE, this.b);
    }

    public nmi(int i) {
        this.a = "";
        this.b = EmptyList.a;
    }

    public nmi() {
        this(0);
    }
}
