package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbstractTrack.java */
/* loaded from: classes13.dex */
public abstract class ci implements uep0 {
    public final String b;
    public final ArrayList c = new ArrayList();
    public HashMap d = new HashMap();

    public ci(String str) {
        this.b = str;
    }

    @Override // xsna.uep0
    public final ArrayList L1() {
        return this.c;
    }

    @Override // xsna.uep0
    public final Map<vju, long[]> T2() {
        return this.d;
    }

    @Override // xsna.uep0
    public final long getDuration() {
        long j = 0;
        for (long j2 : Q3()) {
            j += j2;
        }
        return j;
    }

    @Override // xsna.uep0
    public String getName() {
        return this.b;
    }
}
