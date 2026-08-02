package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class id01 {
    public final List a;

    public id01() {
        this(EmptyList.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id01) && jl40.l(this.a, ((id01) obj).a) && jl40.l(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "TrainTariffUiState(title=null, items=" + this.a + ", footerButton=" + ((Object) null) + Extension.C_BRAKE;
    }

    public id01(List list, jsb1 jsb1Var) {
        this.a = list;
    }
}
