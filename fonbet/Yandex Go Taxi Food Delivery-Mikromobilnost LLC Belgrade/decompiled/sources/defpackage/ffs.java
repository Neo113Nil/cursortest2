package defpackage;

import java.util.Set;

/* loaded from: classes6.dex */
public final class ffs {
    public final Set a;
    public final boolean b;
    public final long[] c;
    public final long[] d;
    public long e;

    public ffs(Set set) {
        this.a = set;
        this.b = set.contains(8) && set.contains(13);
        this.c = new long[14];
        this.d = new long[14];
    }
}
