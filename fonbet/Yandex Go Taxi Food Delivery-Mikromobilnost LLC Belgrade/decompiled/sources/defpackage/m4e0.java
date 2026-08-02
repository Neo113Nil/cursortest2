package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lm4e0;", "", "Companion", "k4e0", "l4e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m4e0 {
    public static final l4e0 Companion = new l4e0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(10))};
    public final List a;

    public /* synthetic */ m4e0(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public m4e0() {
        this.a = null;
    }
}
