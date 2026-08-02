package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgjo;", "", "Companion", "ejo", "fjo", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class gjo {
    public static final fjo Companion = new fjo();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new cao(11)), null};
    public final z56 a;
    public final List b;
    public final xk50 c;

    public /* synthetic */ gjo(int i, z56 z56Var, List list, xk50 xk50Var) {
        this.a = (i & 1) == 0 ? null : z56Var;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = new xk50(0);
        } else {
            this.c = xk50Var;
        }
    }

    public gjo() {
        xk50 xk50Var = new xk50(0);
        this.a = null;
        this.b = EmptyList.a;
        this.c = xk50Var;
    }
}
