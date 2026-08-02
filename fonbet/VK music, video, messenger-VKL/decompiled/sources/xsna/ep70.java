package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: OatStatEventBuilder.kt */
/* loaded from: classes11.dex */
public final class ep70 extends l5m {
    public final long h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;

    public ep70(int i, int i2, long j, long j2, boolean z) {
        super(null, null, 3);
        this.h = j;
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        return new qrk0(new SchemeStat$TypeDevNullItem(DevNullEventKey.OAT_FILE_STAT.h(), null, String.valueOf(this.h), Integer.valueOf(this.k), String.valueOf(this.i), Integer.valueOf(this.l ? 1 : 0), null, Integer.valueOf(this.j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -190, 3, null), false);
    }
}
