package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class n0j0 implements Comparable {
    public long b = -9223372036854775807L;
    public final ArrayList a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((n0j0) obj).b);
    }
}
