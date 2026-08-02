package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcei0;", "", "Companion", "aei0", "bei0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class cei0 {
    public static final bei0 Companion = new bei0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(15))};
    public final String a;
    public final Map b;

    public /* synthetic */ cei0(int i, String str, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cei0)) {
            return false;
        }
        cei0 cei0Var = (cei0) obj;
        return jl40.l(this.a, cei0Var.a) && jl40.l(this.b, cei0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("RealtimeAnalytics(creativeId=", this.a, ", payload=", Extension.C_BRAKE, this.b);
    }

    public cei0() {
        Map f = b.f();
        this.a = "";
        this.b = f;
    }
}
