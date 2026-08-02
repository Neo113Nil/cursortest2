package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer;

import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.ColorModel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H ¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\bH ¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\bH ¢\u0006\u0004\b\u000e\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "color", "", "animationDuration", "Lzy11;", "setShimmer$impl_18_1_0_release", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;Ljava/lang/Long;)V", "setShimmer", "startShimmer$impl_18_1_0_release", "startShimmer", "stopShimmer$impl_18_1_0_release", "stopShimmer", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ShimmerDrawable extends Drawable {
    public abstract void setShimmer$impl_18_1_0_release(ColorModel color, Long animationDuration);

    public abstract void startShimmer$impl_18_1_0_release();

    public abstract void stopShimmer$impl_18_1_0_release();
}
