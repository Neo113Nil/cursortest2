package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: StorageSizeEventBuilder.kt */
/* loaded from: classes5.dex */
public final class phl0 extends l5m {
    public final String h;
    public final long i;

    public phl0(String str, long j) {
        super(null, null, 3);
        this.h = str;
        this.i = j;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.STORAGE_DIR_SIZE_STAT.h(), null, this.h, Integer.valueOf((int) (this.i / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -14, 3, null);
        return super.p();
    }
}
