package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp02;", "Lxn11;", "Companion", "o02", "n02", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p02 implements xn11 {
    public static final o02 Companion = new o02();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(8))};
    public static final p02 e = new p02(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ p02(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public p02(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public p02() {
        this(0);
    }
}
