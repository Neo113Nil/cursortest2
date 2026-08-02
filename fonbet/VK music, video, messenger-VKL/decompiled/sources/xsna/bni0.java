package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: SerializerCacheDbSizeEventBuilder.kt */
/* loaded from: classes11.dex */
public final class bni0 extends l5m {
    public final int h;

    public bni0(int i) {
        super(null, null, 3);
        this.h = i;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.SERIALIZER_CACHE_DB_SIZE.h(), null, null, Integer.valueOf(this.h), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
        return super.p();
    }
}
