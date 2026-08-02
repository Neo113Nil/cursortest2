package xsna;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StoryBoxImageSticker.kt */
/* loaded from: classes5.dex */
public final class vzl0 extends ad7 implements c0m0 {
    public final Object q;
    public final int r;
    public final float s;

    public vzl0(Bitmap bitmap, Object obj, int i) {
        super(bitmap, 0, null, "");
        this.q = obj;
        this.r = i;
        this.s = 10.0f;
        this.i.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // xsna.ad7, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new vzl0(this.j, this.q, this.r));
    }

    @Override // xsna.c0m0
    public final Object g() {
        return this.q;
    }

    @Override // xsna.kr9, xsna.nov
    public final float getMaxScaleLimit() {
        return this.s;
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerLayerType() {
        return this.r;
    }

    @Override // xsna.ad7
    public final boolean p() {
        return false;
    }

    @Override // xsna.ad7
    public final void q(int i) {
    }
}
