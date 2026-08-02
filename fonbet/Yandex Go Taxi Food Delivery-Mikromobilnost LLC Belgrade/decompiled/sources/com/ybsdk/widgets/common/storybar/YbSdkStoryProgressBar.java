package com.ybsdk.widgets.common.storybar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.kp50;
import defpackage.pw51;
import defpackage.qw51;
import defpackage.rw51;
import defpackage.ung0;
import defpackage.w3i0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u000eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/widgets/common/storybar/YbSdkStoryProgressBar;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setRootLayoutParams", "()V", "setMarginProgressIndicator", "Lrw51;", ClidProvider.STATE, "render", "(Lrw51;)V", "Landroid/widget/LinearLayout$LayoutParams;", "layoutParamsForProgressIndicator", "Landroid/widget/LinearLayout$LayoutParams;", "trackColor", CA20Status.STATUS_USER_I, "indicatorColor", "Companion", "pw51", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YbSdkStoryProgressBar extends LinearLayout {
    private static final pw51 Companion = new pw51();

    @Deprecated
    public static final int progressIndicatorHeightDp = 3;

    @Deprecated
    public static final float progressIndicatorWeightInLayout = 1.0f;

    @Deprecated
    public static final int progressTabMarginHorizontalDp = 2;
    private final int indicatorColor;
    private final LinearLayout.LayoutParams layoutParamsForProgressIndicator;
    private final int trackColor;

    public YbSdkStoryProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.layoutParamsForProgressIndicator = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3i0.YbSdkStoryProgressBar);
        this.trackColor = obtainStyledAttributes.getColor(w3i0.YbSdkStoryProgressBar_ybsdk_track_color, b.g(ung0.ybColor_fill_default_100, this));
        this.indicatorColor = obtainStyledAttributes.getColor(w3i0.YbSdkStoryProgressBar_ybsdk_indicator_color, b.g(ung0.ybColor_fill_default_300, this));
        obtainStyledAttributes.recycle();
        setRootLayoutParams();
        setMarginProgressIndicator();
    }

    private final void setMarginProgressIndicator() {
        this.layoutParamsForProgressIndicator.setMargins(kp50.r(2), 0, kp50.r(2), 0);
    }

    private final void setRootLayoutParams() {
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public final void render(rw51 state) {
        List list = state.a;
        int size = list.size();
        for (int childCount = getChildCount(); childCount < size; childCount++) {
            LinearProgressIndicator linearProgressIndicator = new LinearProgressIndicator(getContext());
            linearProgressIndicator.setMax(((qw51) list.get(childCount)).b);
            linearProgressIndicator.setTrackCornerRadius(kp50.r(3) / 2);
            ColorModel colorModel = state.b;
            linearProgressIndicator.setTrackColor(colorModel != null ? colorModel.get(getContext()) : this.trackColor);
            ColorModel colorModel2 = state.c;
            linearProgressIndicator.setIndicatorColor(colorModel2 != null ? colorModel2.get(getContext()) : this.indicatorColor);
            linearProgressIndicator.setTrackThickness(kp50.r(3));
            linearProgressIndicator.setImportantForAccessibility(2);
            addView(linearProgressIndicator, this.layoutParamsForProgressIndicator);
        }
        int childCount2 = getChildCount() - 1;
        int size2 = list.size();
        if (size2 <= childCount2) {
            while (true) {
                removeView(getChildAt(childCount2));
                if (childCount2 == size2) {
                    break;
                } else {
                    childCount2--;
                }
            }
        }
        int childCount3 = getChildCount();
        for (int i = 0; i < childCount3; i++) {
            View childAt = getChildAt(i);
            LinearProgressIndicator linearProgressIndicator2 = childAt instanceof LinearProgressIndicator ? (LinearProgressIndicator) childAt : null;
            if (linearProgressIndicator2 != null) {
                linearProgressIndicator2.setMax(((qw51) list.get(i)).b);
                qw51 qw51Var = (qw51) a.S(i, list);
                if (qw51Var != null) {
                    linearProgressIndicator2.setProgress(qw51Var.a);
                }
            }
        }
    }

    public YbSdkStoryProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ YbSdkStoryProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public YbSdkStoryProgressBar(Context context) {
        this(context, null, 0, 6, null);
    }
}
