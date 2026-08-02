package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: ManifestLoadDurationEventBuilder.kt */
/* loaded from: classes3.dex */
public final class ej00 extends l5m {
    public final String h;
    public final int i;

    public ej00(String str, int i) {
        super(null, null, 3);
        this.h = str;
        this.i = i;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.MANIFEST_LOAD_DURATION_EVENT.h(), null, this.h, Integer.valueOf(this.i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -14, 3, null);
        return super.p();
    }
}
