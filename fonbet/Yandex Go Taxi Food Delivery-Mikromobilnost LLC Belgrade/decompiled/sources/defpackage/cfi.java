package defpackage;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = dfi.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcfi;", "", "Companion", "bfi", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class cfi {
    public static final bfi Companion = new bfi();
    public static final cfi b = new cfi(0);
    public final Map a;

    public /* synthetic */ cfi(int i) {
        this(b.f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfi) && jl40.l(this.a, ((cfi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("DeliveryOptionsHolder(values=", Extension.C_BRAKE, this.a);
    }

    public cfi(Map map) {
        this.a = map;
    }

    public cfi() {
        this(0);
    }
}
