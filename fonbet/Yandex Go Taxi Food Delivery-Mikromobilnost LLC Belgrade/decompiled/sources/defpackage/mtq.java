package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmtq;", "", "Companion", "ktq", "ltq", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class mtq {
    public static final ltq Companion = new ltq();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(2)), null};
    public final List a;
    public final tuq b;

    public /* synthetic */ mtq(int i, List list, tuq tuqVar) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = tuqVar;
        }
    }

    public mtq() {
        this.a = EmptyList.a;
        this.b = null;
    }
}
