package xsna;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import xsna.m4g0;
import xsna.nov;

/* compiled from: ReplyImageViewSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class h4g0 extends nxt0 implements l4g0 {
    private final Bitmap getRenderingBitmap() {
        throw null;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        getContext();
        throw null;
    }

    @Override // xsna.nxt0, xsna.nov
    public final void F0(Canvas canvas, boolean z) {
        if (z) {
            throw null;
        }
        nov.a.a(this, canvas, z);
        if (z) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h4g0 ? (h4g0) obj : null) != null;
    }

    @Override // xsna.l4g0
    public final void f(Bitmap bitmap) {
        if (kd7.g(getContext(), bitmap) != null) {
            throw null;
        }
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 1.5f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMinScaleLimit() {
        return 0.25f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final m4g0 getOverlayDelegate() {
        return null;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 5;
    }

    public final int hashCode() {
        return Objects.hash(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m4g0.a.getClass();
        m4g0.a aVar = m4g0.a.a;
        m4g0.a aVar2 = m4g0.a.a;
        throw null;
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        throw null;
    }

    public final void setImageBitmap(Bitmap bitmap) {
        throw null;
    }

    @Override // xsna.l4g0
    public void setLoadingVisible(boolean z) {
        throw null;
    }
}
