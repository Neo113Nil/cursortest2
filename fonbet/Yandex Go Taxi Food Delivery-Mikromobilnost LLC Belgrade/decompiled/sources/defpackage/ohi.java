package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lohi;", "Lxn11;", "Companion", "nhi", "mhi", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ohi implements xn11 {
    public static final nhi Companion = new nhi();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(26))};
    public static final ohi e = new ohi(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ ohi(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohi)) {
            return false;
        }
        ohi ohiVar = (ohi) obj;
        return this.b == ohiVar.b && jl40.l(this.c, ohiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "DeliveryParseCoordinatesExperiment(enabled=" + this.b + ", partsToRemove=" + this.c + Extension.C_BRAKE;
    }

    public ohi(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public ohi() {
        this(0);
    }
}
