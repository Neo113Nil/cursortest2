package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: HttpCacheStatisticsEventBuilder.kt */
/* loaded from: classes5.dex */
public final class siv extends l5m {
    public final String h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public siv(String str, int i, int i2, int i3, int i4) {
        super(null, null, 3);
        this.h = str;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.HTTP_CACHE_STAT.h(), null, this.h, Integer.valueOf(this.i), null, Integer.valueOf(this.j), null, Integer.valueOf(this.k), null, Integer.valueOf(this.l), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -686, 3, null);
        return super.p();
    }
}
