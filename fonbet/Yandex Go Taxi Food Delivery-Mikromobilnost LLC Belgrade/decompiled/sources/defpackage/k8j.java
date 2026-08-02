package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lk8j;", "", "Companion", "i8j", "j8j", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class k8j {
    public static final j8j Companion = new j8j();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(1))};
    public final List a;

    public /* synthetic */ k8j(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8j) && jl40.l(this.a, ((k8j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DetailsFieldEffects(rules=", Extension.C_BRAKE, this.a);
    }

    public k8j(int i) {
        this.a = EmptyList.a;
    }

    public k8j() {
        this(0);
    }
}
