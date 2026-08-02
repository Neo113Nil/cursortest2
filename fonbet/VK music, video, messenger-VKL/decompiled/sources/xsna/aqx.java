package xsna;

import android.graphics.Canvas;
import com.unity3d.services.UnityAdsConstants;
import xsna.nov;

/* compiled from: StoryMarketItemSticker.kt */
/* loaded from: classes6.dex */
public final class aqx extends kr9 implements no6, u570 {
    public a6m0 h;

    @Override // xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        a6m0 a6m0Var = this.h;
        aqx aqxVar = new aqx();
        aqxVar.h = a6m0Var;
        nov.a.b(this, aqxVar);
        return aqxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqx) && epx.f(this.h, ((aqx) obj).h);
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int hashCode() {
        return this.h.hashCode() * 961;
    }

    @Override // xsna.v4l0
    public final Object m() {
        return this.h;
    }

    public final String toString() {
        return "InvisibleMarketItemSticker(info=" + this.h + ", good=null, snippet=null)";
    }

    @Override // xsna.v4l0
    public final void update(Object obj) {
        this.h = (a6m0) obj;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
    }
}
