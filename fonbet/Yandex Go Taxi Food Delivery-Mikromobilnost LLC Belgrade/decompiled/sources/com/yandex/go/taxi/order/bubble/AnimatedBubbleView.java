package com.yandex.go.taxi.order.bubble;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.se2;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/taxi/order/bubble/AnimatedBubbleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "bitmap", "", "badgeNumber", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/Integer;)V", "Lse2;", "binding", "Lse2;", "Landroid/widget/ImageView;", "image", "Landroid/widget/ImageView;", "Lru/yandex/taxi/widget/RobotoTextView;", "badge", "Lru/yandex/taxi/widget/RobotoTextView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AnimatedBubbleView extends FrameLayout {
    public static final int $stable = 8;
    private final RobotoTextView badge;
    private final se2 binding;
    private final ImageView image;

    public AnimatedBubbleView(Context context, Bitmap bitmap, Integer num) {
        super(context);
        LayoutInflater.from(context).inflate(zkh0.animated_bubble_view, this);
        int i = p8h0.circle_number_badge;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
        if (robotoTextView != null) {
            i = p8h0.image;
            ImageView imageView = (ImageView) cma1.O(i, this);
            if (imageView != null) {
                this.binding = new se2(this, robotoTextView, imageView);
                this.image = imageView;
                this.badge = robotoTextView;
                imageView.setImageBitmap(bitmap);
                if (num != null) {
                    robotoTextView.setVisibility(0);
                    robotoTextView.setText(String.valueOf(num.intValue()));
                    return;
                }
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
