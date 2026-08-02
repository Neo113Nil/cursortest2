package com.yandex.div.legacy.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import defpackage.atg0;
import defpackage.kjs0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lcom/yandex/div/legacy/view/ContainerShadowLayout;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "createLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "div-legacy_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContainerShadowLayout extends CardView {
    public ContainerShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(createLayoutParams());
        setRadius(getResources().getDimension(atg0.div_gallery_item_corners_radius));
        setCardElevation(kjs0.d(2));
        setMaxCardElevation(getCardElevation());
        setCardBackgroundColor(context.getColor(R.color.white));
    }

    private final LinearLayout.LayoutParams createLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContainerShadowLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ContainerShadowLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
