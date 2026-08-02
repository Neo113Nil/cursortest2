package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class fnu extends a45 {
    public final List w;
    public final long x;

    public fnu(long j, List list) {
        super(0L, list.size() - 1);
        this.x = j;
        this.w = list;
    }

    @Override // defpackage.jb10
    public final long a() {
        b();
        snu snuVar = (snu) this.w.get((int) this.c);
        return this.x + snuVar.x + snuVar.c;
    }

    @Override // defpackage.jb10
    public final long c() {
        b();
        return this.x + ((snu) this.w.get((int) this.c)).x;
    }
}
