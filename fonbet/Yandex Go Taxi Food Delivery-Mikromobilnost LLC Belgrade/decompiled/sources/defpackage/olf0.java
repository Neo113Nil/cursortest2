package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptySet;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lolf0;", "Lxn11;", "Companion", "nlf0", "mlf0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class olf0 implements xn11 {
    public static final nlf0 Companion = new nlf0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(25))};
    public final Set b;

    public /* synthetic */ olf0(int i, Set set) {
        if ((i & 1) == 0) {
            this.b = EmptySet.a;
        } else {
            this.b = set;
        }
    }

    public olf0() {
        this.b = EmptySet.a;
    }
}
