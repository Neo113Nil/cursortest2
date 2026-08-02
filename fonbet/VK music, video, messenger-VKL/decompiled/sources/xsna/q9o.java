package xsna;

import com.vk.dto.common.DownloadRestrictionReason;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: DownloadRestrictionReasonEventBuilder.kt */
/* loaded from: classes3.dex */
public final class q9o extends l5m {
    public final DownloadRestrictionReason h;

    public q9o(DownloadRestrictionReason downloadRestrictionReason) {
        super(null, null, 3);
        this.h = downloadRestrictionReason;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_PLAYBACK_ERROR.h(), null, null, null, "download_restriction_reason", null, this.h.name(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -82, 3, null);
        return super.p();
    }
}
