package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: CacheContainerSizeEventBuilder.kt */
/* loaded from: classes5.dex */
public final class qv8 extends l5m {
    public final String h;
    public final long i;
    public final String j;

    public qv8(String str, long j, String str2) {
        super(null, null, 3);
        this.h = str;
        this.i = j;
        this.j = str2;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CACHE_CONTAINER_SIZE_STAT.h(), null, this.h, Integer.valueOf((int) (this.i / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)), this.j, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -30, 3, null);
        return super.p();
    }
}
