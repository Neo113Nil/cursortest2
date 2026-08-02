package defpackage;

import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhp40;", "", "Companion", "bp40", "ep40", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class hp40 {
    public static final ep40 Companion = new ep40();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new d540(2))};
    public final Boolean a;
    public final Collection b;

    public /* synthetic */ hp40(int i, Boolean bool, Collection collection) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = collection;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp40)) {
            return false;
        }
        hp40 hp40Var = (hp40) obj;
        return jl40.l(this.a, hp40Var.a) && jl40.l(this.b, hp40Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Collection collection = this.b;
        return hashCode + (collection != null ? collection.hashCode() : 0);
    }

    public final String toString() {
        return "MulticlassOptions(selected=" + this.a + ", clazz=" + this.b + Extension.C_BRAKE;
    }

    public hp40(Boolean bool, Collection collection) {
        this.a = bool;
        this.b = collection;
    }

    public hp40() {
        this(null, null);
    }
}
