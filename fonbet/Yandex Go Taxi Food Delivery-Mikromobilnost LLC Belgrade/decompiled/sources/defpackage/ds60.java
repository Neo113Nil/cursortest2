package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lds60;", "", "Companion", "bs60", "cs60", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ds60 {
    public static final cs60 Companion = new cs60();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(18))};
    public final String a;
    public final List b;

    public /* synthetic */ ds60(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ds60() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
