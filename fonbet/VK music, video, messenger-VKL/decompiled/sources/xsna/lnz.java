package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;

/* compiled from: LiveVideoFlyView.kt */
/* loaded from: classes2.dex */
public final class lnz extends avr implements uur {
    public tur k;

    public lnz(Context context) {
        super(context, null, 0);
        setMaxSizeViewPool(40);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // xsna.uur
    public final void D4(Bitmap bitmap) {
        if (this.d > 0 || !BuildInfo.h()) {
            a((0 * getOneSectionWidth()) + ((getOneSectionWidth() - this.b) / 2), this.b / 2, 80, new BitmapDrawable(getContext().getResources(), bitmap));
        } else {
            StringBuilder sb = new StringBuilder("You need section in range: [0, ");
            sb.append(this.d - 1);
            sb.append("], you section: 0");
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // xsna.avr
    public final void f(ImageView imageView) {
        super.f(imageView);
        tur turVar = this.k;
        if (turVar != null) {
            turVar.Y(getAnimationMap().size() < getMaxSizeViewPool());
        }
    }

    @Override // xsna.uur
    public int getImageSize() {
        return iah0.a(64.0f);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.avr
    public final void i() {
        tur turVar = this.k;
        if (turVar != null) {
            turVar.Y(getAnimationMap().size() < getMaxSizeViewPool());
        }
    }

    @Override // xsna.uur
    public final boolean isVisible() {
        return getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && isShown();
    }

    @Override // xsna.uur
    public final void j3(Drawable drawable) {
        if (this.d > 0 || !BuildInfo.h()) {
            a((0 * getOneSectionWidth()) + ((getOneSectionWidth() - this.b) / 2), this.b / 2, 80, drawable);
            return;
        }
        StringBuilder sb = new StringBuilder("You need section in range: [0, ");
        sb.append(this.d - 1);
        sb.append("], you section: 0");
        throw new RuntimeException(sb.toString());
    }

    @Override // xsna.rr6
    public final void pause() {
        tur turVar = this.k;
        if (turVar != null) {
            turVar.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        tur turVar = this.k;
        if (turVar != null) {
            turVar.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        tur turVar = this.k;
        if (turVar != null) {
            turVar.resume();
        }
    }

    @Override // xsna.rr6
    public tur getPresenter() {
        return this.k;
    }

    @Override // xsna.rr6
    public void setPresenter(tur turVar) {
        this.k = turVar;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
