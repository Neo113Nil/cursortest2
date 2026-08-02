package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lm9r;", "Lb9r;", "Companion", "k9r", "l9r", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class m9r extends b9r {
    public static final l9r Companion = new l9r();
    public static final i3y[] d;
    public final List a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new n6r(8)), a.b(lazyThreadSafetyMode, new n6r(9)), a.b(lazyThreadSafetyMode, new n6r(10))};
    }

    public m9r(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9r)) {
            return false;
        }
        m9r m9rVar = (m9r) obj;
        return jl40.l(this.a, m9rVar.a) && jl40.l(this.b, m9rVar.b) && jl40.l(this.c, m9rVar.c);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return ly3.s(qv10.v("FingerprintMotion(acceleration=", this.a, ", rotationRate=", this.b, ", attitude="), this.c, Extension.C_BRAKE);
    }

    public m9r(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public m9r() {
        this(null, null, null);
    }
}
