package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import one.video.player.model.VideoContentType;

/* compiled from: ManifestValidationErrorEventBuilder.kt */
/* loaded from: classes3.dex */
public final class mj00 extends l5m {
    public final VideoContentType h;
    public final String i;
    public final String j;

    public mj00(VideoContentType videoContentType, String str, String str2) {
        super(null, null, 3);
        this.h = videoContentType;
        this.i = str;
        this.j = str2;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.MANIFEST_VALIDATION_ERROR_EVENT.h(), null, this.i, null, this.j, null, this.h.name(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -86, 3, null);
        return super.p();
    }
}
