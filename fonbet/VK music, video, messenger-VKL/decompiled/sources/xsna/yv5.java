package xsna;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.api.dto.story.WebStickerType;

/* compiled from: BackgroundBitmapSticker.kt */
/* loaded from: classes6.dex */
public final class yv5 extends ad7 {
    public yv5(Bitmap bitmap) {
        super(bitmap, 0, WebStickerType.STICKER, "");
    }

    @Override // xsna.ad7, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new yv5(this.j));
    }

    @Override // xsna.kr9, xsna.nov
    public final int getMovePointersCount() {
        return 2;
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerLayerType() {
        return 0;
    }

    @Override // xsna.ad7
    public final void q(int i) {
        this.i.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.j.getWidth(), this.j.getHeight());
    }
}
