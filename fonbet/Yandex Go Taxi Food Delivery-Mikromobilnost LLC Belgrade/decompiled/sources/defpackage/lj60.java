package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Llj60;", "", "Companion", "jj60", "kj60", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class lj60 {
    public static final kj60 Companion = new kj60();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(3))};
    public final Map a;

    public /* synthetic */ lj60(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = b.f();
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj60) && jl40.l(this.a, ((lj60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("NotificationShowedInfo(orderToTimestampMap=", Extension.C_BRAKE, this.a);
    }

    public lj60() {
        this(0);
    }

    public lj60(Map map) {
        this.a = map;
    }

    public /* synthetic */ lj60(int i) {
        this(b.f());
    }
}
