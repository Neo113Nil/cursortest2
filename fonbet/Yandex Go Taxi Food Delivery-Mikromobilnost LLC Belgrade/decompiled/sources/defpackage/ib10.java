package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public abstract class ib10 extends nsb {
    public final long C;

    public ib10(kpg kpgVar, npg npgVar, a aVar, int i, Object obj, long j, long j2, long j3) {
        super(kpgVar, npgVar, 1, aVar, i, obj, j, j2);
        aVar.getClass();
        this.C = j3;
    }

    public long a() {
        long j = this.C;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
