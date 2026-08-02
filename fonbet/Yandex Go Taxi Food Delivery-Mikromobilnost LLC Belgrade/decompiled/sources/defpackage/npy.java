package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnpy;", "", "Companion", "lpy", "mpy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class npy {
    public static final mpy Companion = new mpy();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new wky(7)), null};
    public final List a;
    public final boolean b;

    public /* synthetic */ npy(int i, boolean z, List list) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public npy() {
        this.a = EmptyList.a;
        this.b = false;
    }
}
