package com.yandex.messaging.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.drb1;
import defpackage.jng0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/messaging/views/ShineView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShineView extends AppCompatImageView {
    public static final int $stable = 0;

    public ShineView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int d = drb1.d(context, jng0.messagingDiscoveryPlaceholderAnimationColor, jng0.messagingDiscoveryPlaceholderAnimationColorAlpha);
        int i3 = d & 16777215;
        int[] iArr = {i3, d, i3};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        int[] copyOf = Arrays.copyOf(iArr, 3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        if (copyOf.length == 1) {
            int i4 = 16777215 & copyOf[0];
            int length = copyOf.length;
            int[] copyOf2 = Arrays.copyOf(copyOf, length + 1);
            copyOf2[length] = i4;
            gradientDrawable.setColors(copyOf2);
        } else {
            gradientDrawable.setColors(copyOf);
        }
        setImageDrawable(gradientDrawable);
    }

    public ShineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ShineView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ ShineView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public ShineView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
