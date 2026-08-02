package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnqt;", "Lxn11;", "Companion", "mqt", "lqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class nqt implements xn11 {
    public static final mqt Companion = new mqt();
    public static final nqt d = new nqt(0);
    public final boolean b;
    public final String c;

    public /* synthetic */ nqt(int i, String str, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public nqt(int i) {
        this.b = false;
        this.c = "";
    }

    public nqt() {
        this(0);
    }
}
