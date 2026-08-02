package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcyw0;", "Lxn11;", "Companion", "byw0", "ayw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class cyw0 implements xn11 {
    public static final byw0 Companion = new byw0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(11))};
    public static final cyw0 d = new cyw0(0);
    public final List b;

    public /* synthetic */ cyw0(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyw0) && jl40.l(this.b, ((cyw0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tse0.k("SwipeToDismissZoneExperiment(swipeToSwipeToDismissZoneHeightDtoList=", Extension.C_BRAKE, this.b);
    }

    public cyw0(int i) {
        this.b = EmptyList.a;
    }

    public cyw0() {
        this(0);
    }
}
