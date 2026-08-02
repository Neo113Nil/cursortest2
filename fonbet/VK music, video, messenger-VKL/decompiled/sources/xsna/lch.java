package xsna;

import android.animation.ValueAnimator;
import android.provider.Settings;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.profile.community.impl.livecover.LiveCoverType;
import com.vk.profile.community.impl.ui.cover.redesign.delegate.b;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$LiveCoverEvent;

/* compiled from: CommunityPictureCoverViewController.kt */
/* loaded from: classes5.dex */
public final class lch implements y4i {
    public final b8h a;
    public pqs0 b;
    public r8h c;
    public c8h d;
    public final b.c e;
    public final b.d f;
    public final b9h g;
    public final String h;
    public ValueAnimator i;
    public final boolean j;
    public final kch k;

    public lch(b8h b8hVar, pqs0 pqs0Var, r8h r8hVar, c8h c8hVar, b.c cVar, b.d dVar) {
        this.a = b8hVar;
        this.b = pqs0Var;
        this.c = r8hVar;
        this.d = c8hVar;
        this.e = cVar;
        this.f = dVar;
        this.g = new b9h(LiveCoverType.VIDEO_PREVIEW, r8hVar.b);
        ImageSize Cb = this.b.a.b.e1().Cb(iah0.f().widthPixels, true, false);
        this.h = Cb != null ? Cb.d.d : null;
        this.j = !(Settings.Global.getFloat(b8hVar.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.k = new kch(this);
    }

    @Override // xsna.y4i
    public final void C(boolean z) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.pause();
            if (z) {
                valueAnimator.setCurrentFraction(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    @Override // xsna.y4i
    public final void a(Float f) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator == null || f == null) {
            return;
        }
        valueAnimator.setCurrentFraction(f.floatValue());
    }

    @Override // xsna.y4i
    public final void b(r8h r8hVar) {
        this.c = r8hVar;
    }

    @Override // xsna.y4i
    public final void d() {
        b8h b8hVar = this.a;
        VkImage foregroundImageView = b8hVar.getForegroundImageView();
        foregroundImageView.setVisibility(0);
        foregroundImageView.setOnLoadCallback(this.k);
        String str = this.h;
        foregroundImageView.o0(str, null);
        b8hVar.setOnRetry(new jch(this, b8hVar, str, 0));
    }

    @Override // xsna.y4i
    public final void e(pqs0 pqs0Var) {
        this.b = pqs0Var;
    }

    @Override // xsna.y4i
    public final void f(c8h c8hVar) {
        this.d = c8hVar;
    }

    @Override // xsna.y4i
    public final void g(boolean z) {
        this.a.getForegroundImageView().setOnLoadCallback(null);
        this.g.c = false;
        LiveCoverType liveCoverType = LiveCoverType.VIDEO_PREVIEW;
        Long valueOf = Long.valueOf(this.c.b.b);
        ValueAnimator valueAnimator = this.i;
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        k15.y(liveCoverType, valueOf, false, 6000L, f != null ? f.floatValue() : 0.0f);
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 != null) {
            valueAnimator2.pause();
            valueAnimator2.removeAllUpdateListeners();
            this.i = null;
        }
        if (z) {
            this.f.invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
    }

    @Override // xsna.y4i
    public final Float getCurrentProgress() {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            return Float.valueOf(valueAnimator.getAnimatedFraction());
        }
        return null;
    }

    @Override // xsna.y4i
    public final boolean isPlaying() {
        ValueAnimator valueAnimator = this.i;
        return (valueAnimator == null || !valueAnimator.isRunning() || valueAnimator.isPaused()) ? false : true;
    }

    @Override // xsna.y4i
    public final void play() {
        int i = 1;
        this.a.setTooltipVisibility(true);
        b9h b9hVar = this.g;
        if (!b9hVar.c) {
            siz.b(Long.valueOf(b9hVar.b.b), MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.START_PLAY, siz.a(b9hVar.a), null, null);
        }
        b9hVar.c = true;
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null && valueAnimator.isPaused()) {
            valueAnimator.resume();
            return;
        }
        if ((valueAnimator == null || valueAnimator.getAnimatedFraction() >= 0.99f) && this.j) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(6000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new sn2(this, i));
            ofFloat.addListener(new hl9(this, 1));
            ofFloat.start();
            this.i = ofFloat;
        }
    }

    @Override // xsna.y4i
    public final void c(y4i y4iVar) {
    }
}
