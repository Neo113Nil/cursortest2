package xsna;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.StencilLayout;
import com.vkontakte.android.R;
import java.io.File;

/* compiled from: AnimationPlaceholderController.kt */
/* loaded from: classes7.dex */
public final class bq2 {
    public final Object a;
    public final Object b;
    public final Object c;

    public bq2(Context context) {
        this.a = context;
        this.b = new bpn0(new ee4(8));
        this.c = new bpn0(new l63(9));
    }

    public bq2(kew kewVar, StencilLayout stencilLayout) {
        this.a = (FrameLayout) stencilLayout.findViewById(R.id.camera_placeholder);
        StencilLayout stencilLayout2 = (StencilLayout) stencilLayout.findViewById(R.id.camera_placeholder_anim);
        this.b = stencilLayout2;
        AppCompatImageView appCompatImageView = (AppCompatImageView) stencilLayout.findViewById(R.id.camera_placeholder_bg);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(stencilLayout2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.25f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.25f), PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Keyframe.ofFloat(0.222f, 0.35f), Keyframe.ofFloat(0.777f, 0.35f), Keyframe.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        ofPropertyValuesHolder.setDuration(1500L);
        ofPropertyValuesHolder.setRepeatCount(-1);
        this.c = ofPropertyValuesHolder;
        File a = kewVar != null ? kewVar.a() : null;
        if (a != null && a.exists()) {
            appCompatImageView.setImageBitmap(BitmapFactory.decodeFile(a.getPath()));
        } else {
            appCompatImageView.setBackgroundColor(Color.parseColor("#303030"));
        }
    }
}
