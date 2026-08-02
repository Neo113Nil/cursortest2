package com.yandex.div.legacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.alicekit.core.views.EllipsizingTextView;
import defpackage.atg0;
import defpackage.ogh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002¨\u0006\n"}, d2 = {"Lcom/yandex/div/legacy/view/GalleryTailLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "createImageLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "createLayoutParams", "div-legacy_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryTailLayout extends LinearLayout {
    public GalleryTailLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(createLayoutParams());
        setOrientation(1);
        setGravity(17);
        setMinimumWidth(getResources().getDimensionPixelSize(atg0.div_gallery_tail_width));
        ImageView imageView = new ImageView(context);
        imageView.setId(ogh0.div_gallery_tail_icon);
        imageView.setLayoutParams(createImageLayoutParams());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        EllipsizingTextView ellipsizingTextView = new EllipsizingTextView(context);
        ellipsizingTextView.setId(ogh0.div_gallery_tail_text);
        ellipsizingTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ellipsizingTextView.setMaxWidth(ellipsizingTextView.getResources().getDimensionPixelSize(atg0.div_gallery_tail_width));
        ellipsizingTextView.setGravity(17);
        addView(imageView);
        addView(ellipsizingTextView);
    }

    private final LinearLayout.LayoutParams createImageLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(atg0.div_gallery_tail_image_size), getResources().getDimensionPixelSize(atg0.div_gallery_tail_image_size));
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(atg0.div_gallery_tail_image_bottom_margin);
        return layoutParams;
    }

    private final LinearLayout.LayoutParams createLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(atg0.div_gallery_tail_width), -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryTailLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GalleryTailLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
