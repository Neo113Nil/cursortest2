package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljuq;", "", "Companion", "huq", "iuq", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class juq {
    public static final iuq Companion = new iuq();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(11)), null};
    public final boolean a;
    public final List b;
    public final tuq c;

    public /* synthetic */ juq(int i, boolean z, List list, tuq tuqVar) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = tuqVar;
        }
    }

    public juq() {
        this.a = false;
        this.b = EmptyList.a;
        this.c = null;
    }
}
