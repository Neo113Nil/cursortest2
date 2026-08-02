package com.yandex.go.beginners.presentation.services_info.views;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.l1h0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\t\u0012\b\b\n\u0012\u0004\b\u0003\u0010\u0000¨\u0006\b"}, d2 = {"Lcom/yandex/go/beginners/presentation/services_info/views/ContainerWithShadowEnd;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "content", "Landroid/view/View;", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContainerWithShadowEnd extends FrameLayout {
    public static final int $stable = 8;

    public ContainerWithShadowEnd(Context context, View view) {
        super(context);
        new FrameLayout.LayoutParams(-1, -2).gravity = 17;
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388629;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(l1h0.shadow_edge);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(view);
        addView(imageView);
    }
}
