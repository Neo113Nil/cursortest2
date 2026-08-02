package xsna;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Trace;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.EnhancedVectorDrawable;
import com.vk.utils.vectordrawable.VectorPath;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: ControlView.kt */
/* loaded from: classes3.dex */
public final class fqj extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final AppCompatImageView b;
    public final wq90 c;
    public final AppCompatImageView d;
    public com.vk.movika.sdk.base.model.e e;
    public boolean f;
    public p4f g;

    public fqj(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.b = appCompatImageView;
        wq90 wq90Var = new wq90(context);
        this.c = wq90Var;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        this.d = appCompatImageView2;
        this.f = true;
        e3m.a aVar = e3m.a;
        appCompatImageView.setImageDrawable(new rcc(context.getColor(R.color.vk_black_alpha60)));
        int a = iah0.a(36);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        addView(appCompatImageView, layoutParams);
        float f = 24;
        int a2 = iah0.a(f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, a2);
        layoutParams2.gravity = 17;
        addView(wq90Var, layoutParams2);
        int a3 = iah0.a(f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a3, a3);
        layoutParams3.gravity = 17;
        addView(appCompatImageView2, layoutParams3);
    }

    public final void a(boolean z, boolean z2) {
        AppCompatImageView appCompatImageView = this.b;
        if (z) {
            if (z2) {
                appCompatImageView.setVisibility(0);
                return;
            } else {
                d3m.c(appCompatImageView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
        }
        if (z2) {
            f4m.j(appCompatImageView);
        } else {
            d3m.e(appCompatImageView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        com.vk.movika.sdk.base.model.e eVar = this.e;
        if (eVar != null) {
            eVar.invoke();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        boolean z = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && getVisibility() == 0;
        if (this.f != z) {
            this.f = z;
            p4f p4fVar = this.g;
            if (p4fVar != null) {
                p4fVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.d;
        Trace.beginSection("ControlView.setBackgroundResource");
        try {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            drawable.setTint(context.getColor(R.color.vk_white));
            appCompatImageView.setImageDrawable(drawable);
            appCompatImageView.setBackgroundResource(R.drawable.video_control_shadow);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        fxc0.B().J().O();
        Trace.beginSection("ControlView.setBackgroundResource");
        try {
            Context context = getContext();
            Context context2 = getContext();
            e3m.a aVar = e3m.a;
            Drawable c = enj.c(i, context2.getColor(R.color.vk_white), context);
            this.d.setImageDrawable(c);
            if (c instanceof VectorDrawable) {
                wq90 wq90Var = this.c;
                wq90Var.getClass();
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(wq90Var.getContext(), i);
                String[] strArr = wq90.d;
                Path path = new Path();
                for (int i2 = 0; i2 < 2; i2++) {
                    VectorPath findPath = enhancedVectorDrawable.findPath(strArr[i2]);
                    if (findPath != null) {
                        path.addPath(findPath.getPath());
                    }
                }
                wq90Var.b = path;
                wq90Var.invalidate();
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && getVisibility() == 0;
        if (this.f != z) {
            this.f = z;
            p4f p4fVar = this.g;
            if (p4fVar != null) {
                p4fVar.invoke(Boolean.valueOf(z));
            }
        }
    }
}
