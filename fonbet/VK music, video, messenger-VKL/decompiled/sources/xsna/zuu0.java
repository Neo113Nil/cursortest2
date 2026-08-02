package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: VkFeedPhotoView.kt */
/* loaded from: classes18.dex */
public final class zuu0 extends FrameLayout {
    public final FixedSizeVKEnhancedImageView b;
    public final ProductsPhotoOverlayView c;
    public final View d;
    public final VkOverlayCircleButton e;
    public a f;
    public final Object g;

    /* compiled from: VkFeedPhotoView.kt */
    public interface a {
        void a();

        void b();

        boolean c();
    }

    public zuu0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.pds_single_photo_attach, (ViewGroup) this, true);
        BlurredImageWrapper blurredImageWrapper = (BlurredImageWrapper) findViewById(R.id.pds_photo_attach);
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = (FixedSizeVKEnhancedImageView) findViewById(R.id.pds_photo_image);
        this.b = fixedSizeVKEnhancedImageView;
        ProductsPhotoOverlayView productsPhotoOverlayView = (ProductsPhotoOverlayView) findViewById(R.id.pds_photo_tags_overlay);
        this.c = productsPhotoOverlayView;
        View findViewById = findViewById(R.id.pds_photo_indicator);
        this.d = findViewById;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.pds_photo_wrapper);
        VkOverlayCircleButton vkOverlayCircleButton = (VkOverlayCircleButton) findViewById(R.id.pds_photo_market_circle_button);
        this.e = vkOverlayCircleButton;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new wfu0(this, 1));
        blurredImageWrapper.setCornersPainter(new xso0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24));
        fixedSizeVKEnhancedImageView.setHeightMode(ImageViewMeasurer.HeightMode.MIN_RATIO);
        fixedSizeVKEnhancedImageView.setCollectLoadingMetrics(false);
        BlurredImageWrapper.a aVar = new BlurredImageWrapper.a(findViewById.getLayoutParams());
        aVar.a = 8388693;
        findViewById.setLayoutParams(aVar);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = blurredImageWrapper.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = blurredImageWrapper.getMeasuredHeight();
        f4m.a(blurredImageWrapper, new avu0(blurredImageWrapper, ref$IntRef, ref$IntRef2, this));
        int i = 15;
        ProductsPhotoOverlayView.a(productsPhotoOverlayView, new i6m0(this, i), new nid0(this, 27), null, 12);
        viewGroup.removeView(vkOverlayCircleButton);
        BlurredImageWrapper.a aVar2 = new BlurredImageWrapper.a(vkOverlayCircleButton.getLayoutParams());
        aVar2.a = 8388693;
        s3q0 s3q0Var = s3q0.a;
        blurredImageWrapper.addView(vkOverlayCircleButton, aVar2);
        vkOverlayCircleButton.setOnClickListener(new a06(this, i));
        setPadding(0, cn70.b(6), 0, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkOverlayCircleButton.b getShowTextAnimator() {
        return (VkOverlayCircleButton.b) this.g.getValue();
    }

    public final void setGoodsListener(a aVar) {
        this.f = aVar;
    }
}
