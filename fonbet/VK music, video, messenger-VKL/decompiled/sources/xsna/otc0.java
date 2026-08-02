package xsna;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.qhv0;

/* compiled from: PostprocessorRestrictionCoverAdapterFactory.kt */
/* loaded from: classes17.dex */
public final class otc0 implements vcg0 {
    public static final int g = (int) (iah0.f().widthPixels / 2.0f);
    public final Context a;
    public final FrameLayout b;
    public VkPicture c;
    public final Object d;
    public final Object e;
    public final Object f;

    public otc0(Context context) {
        this.a = context;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setVisibility(8);
        this.b = frameLayout;
        vv0 vv0Var = new vv0(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, vv0Var);
        this.e = msy.a(lazyThreadSafetyMode, new vex(this, 20));
        this.f = msy.a(lazyThreadSafetyMode, new gkc0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vcg0
    public final void a(SdkImages sdkImages, boolean z) {
        ImageUrl b;
        VkPicture vkPicture = this.c;
        AttributeSet attributeSet = null;
        if (vkPicture == null) {
            vkPicture = new VkPicture(this.a, attributeSet, 6, 0);
            vkPicture.setVkScaleType(qhv0.b.a);
            vkPicture.setPlaceholderImage(R.color.vk_gray_850);
            this.b.addView(vkPicture, new ViewGroup.LayoutParams(-1, -1));
            this.c = vkPicture;
        }
        if (z) {
            vkPicture.setVkPostprocessor((jtc0) this.d.getValue());
            vkPicture.setColorFilter((PorterDuffColorFilter) this.e.getValue());
        } else {
            vkPicture.setVkPostprocessor(null);
            vkPicture.setColorFilter((PorterDuffColorFilter) this.f.getValue());
        }
        vkPicture.o0((sdkImages == null || (b = sdkImages.b(g)) == null) ? null : b.b, null);
    }

    @Override // xsna.vcg0
    public final FrameLayout getView() {
        return this.b;
    }
}
