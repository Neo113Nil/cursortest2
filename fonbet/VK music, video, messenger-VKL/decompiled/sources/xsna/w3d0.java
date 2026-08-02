package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.design.view.posting.preview.image.crop.model.PreviewCropType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.lhk;

/* compiled from: PreviewCropView.kt */
/* loaded from: classes18.dex */
public final class w3d0 extends VkImage {
    public lhk l;
    public final jhk m;
    public boolean n;
    public gzs<s3q0> o;
    public final int p;
    public long q;
    public zzo r;
    public khk s;

    public w3d0(Context context) {
        super(context, null, 0);
        this.m = new jhk(this);
        this.p = ViewConfiguration.getLongPressTimeout();
        setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void setPhoto(e4d0 e4d0Var) {
        lhk lhkVar = this.l;
        if (lhkVar instanceof lhk.a) {
            e4d0Var.b = ((lhk.a) lhkVar).a;
        } else if (lhkVar instanceof lhk.b) {
            e4d0Var.a = ((lhk.b) lhkVar).a;
        } else if (lhkVar != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return this.n;
    }

    public final lhk getImageState() {
        return this.l;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gzs<s3q0> gzsVar = this.o;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        jhk jhkVar = this.m;
        jhkVar.g.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        jhkVar.c();
    }

    @Override // xsna.zjt, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        khk khkVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.q > 0 && System.currentTimeMillis() - this.q < this.p && (khkVar = this.s) != null) {
                    khkVar.b();
                }
                this.q = 0L;
                return true;
            }
            if (actionMasked == 2) {
                return true;
            }
            if (actionMasked == 3) {
                this.q = 0L;
                return false;
            }
            if (actionMasked != 5) {
                return false;
            }
        }
        if (motionEvent.getPointerCount() == 2) {
            this.q = 0L;
            return true;
        }
        if (motionEvent.getPointerCount() > 2) {
            this.q = 0L;
            return false;
        }
        this.q = System.currentTimeMillis();
        return true;
    }

    public final void setClickListener(khk khkVar) {
        this.s = khkVar;
    }

    public final void setCropType(PreviewCropType previewCropType) {
        jhk jhkVar = this.m;
        PreviewCropType previewCropType2 = jhkVar.f;
        jhkVar.f = previewCropType;
        if (previewCropType2 != previewCropType) {
            jhkVar.c();
        }
    }

    public final void setEditOnboardingListener(zzo zzoVar) {
        this.r = zzoVar;
    }

    public final void setImageState(lhk lhkVar) {
        this.l = lhkVar;
    }

    public final void setOnDetachListener(gzs<s3q0> gzsVar) {
        this.o = gzsVar;
    }
}
