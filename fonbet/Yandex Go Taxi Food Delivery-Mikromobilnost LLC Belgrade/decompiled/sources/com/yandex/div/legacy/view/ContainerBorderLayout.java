package com.yandex.div.legacy.view;

import android.R;
import android.content.Context;
import android.widget.LinearLayout;
import defpackage.atg0;
import defpackage.kjs0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/legacy/view/ContainerBorderLayout;", "Lcom/yandex/div/legacy/view/RoundedCornersWithStrokeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "div-legacy_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContainerBorderLayout extends RoundedCornersWithStrokeLayout {
    public ContainerBorderLayout(Context context) {
        super(context);
        setLayoutParams(createLayoutParams());
        setOrientation(1);
        setGravity(16);
        setCornerRadius(getResources().getDimension(atg0.div_gallery_item_corners_radius));
        setStrokeColor(context.getColor(R.color.white));
        setStrokeWidth(kjs0.b(1));
    }

    private final LinearLayout.LayoutParams createLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }
}
