package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbqw0;", "", "Companion", "zpw0", "aqw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class bqw0 {
    public static final aqw0 Companion = new aqw0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(12))};
    public final List a;

    public /* synthetic */ bqw0(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public bqw0(int i) {
        this.a = EmptyList.a;
    }

    public bqw0() {
        this(0);
    }
}
