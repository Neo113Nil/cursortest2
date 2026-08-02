package com.ybsdk.feature.banners.api.view;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.cma1;
import defpackage.g461;
import defpackage.i3y;
import defpackage.l1i0;
import defpackage.ny61;
import defpackage.qd00;
import defpackage.rah0;
import defpackage.rje;
import defpackage.t4f0;
import defpackage.u3i0;
import defpackage.u4f0;
import defpackage.ung0;
import defpackage.xvg0;
import defpackage.ymh0;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000  2\u00020\u0001:\u0002\u0011!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/banners/api/view/PrizeProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animation", "Lzy11;", "setStateAnimation", "(I)V", "size", "setProgressBarSize", "setIconSize", "Lu4f0;", ClidProvider.STATE, "render", "(Lu4f0;)V", "Lg461;", "binding", "Lg461;", "defaultFilledColor$delegate", "Li3y;", "getDefaultFilledColor", "()I", "defaultFilledColor", "defaultUnfilledColor$delegate", "getDefaultUnfilledColor", "defaultUnfilledColor", "Companion", "t4f0", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrizeProgressView extends FrameLayout {
    public static final t4f0 Companion = new t4f0();
    private static final int FILLED_PROGRESS_BAR_DRAWABLE_INDEX = 1;
    private static final int UNFILLED_PROGRESS_BAR_DRAWABLE_INDEX = 0;
    private final g461 binding;

    /* renamed from: defaultFilledColor$delegate, reason: from kotlin metadata */
    private final i3y defaultFilledColor;

    /* renamed from: defaultUnfilledColor$delegate, reason: from kotlin metadata */
    private final i3y defaultUnfilledColor;

    public PrizeProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ymh0.ybsdk_prize_progress_layout, this);
        int i2 = rah0.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = rah0.progressBar;
            ProgressBar progressBar = (ProgressBar) cma1.O(i2, this);
            if (progressBar != null) {
                i2 = rah0.progressText;
                TextView textView = (TextView) cma1.O(i2, this);
                if (textView != null) {
                    this.binding = new g461(this, appCompatImageView, progressBar, textView);
                    this.defaultFilledColor = a.a(new qd00(context, 25));
                    this.defaultUnfilledColor = a.a(new qd00(context, 26));
                    TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u3i0.YbSdkPrizeProgressView, i, 0);
                    try {
                        textView.setTextAppearance(obtainStyledAttributes.getResourceId(u3i0.YbSdkPrizeProgressView_ybsdk_progress_text_style, l1i0.Widget_YB_Text_Caption3_Bold));
                        setProgressBarSize(rje.d(obtainStyledAttributes.getResourceId(u3i0.YbSdkPrizeProgressView_ybsdk_progress_bar_size, xvg0.ybsdk_prize_progress_bar_size_small), context));
                        setIconSize(rje.d(obtainStyledAttributes.getResourceId(u3i0.YbSdkPrizeProgressView_ybsdk_prize_icon_size, xvg0.ybsdk_prize_progress_bar_size_small), context));
                        setStateAnimation(obtainStyledAttributes.getResourceId(u3i0.YbSdkPrizeProgressView_android_stateListAnimator, 0));
                        return;
                    } finally {
                        obtainStyledAttributes.recycle();
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultFilledColor_delegate$lambda$0(Context context) {
        return rje.a(context, ung0.ybColor_fill_color7_400);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultUnfilledColor_delegate$lambda$1(Context context) {
        return rje.a(context, ung0.ybColor_fill_color7_100);
    }

    private final int getDefaultFilledColor() {
        return ((Number) this.defaultFilledColor.getValue()).intValue();
    }

    private final int getDefaultUnfilledColor() {
        return ((Number) this.defaultUnfilledColor.getValue()).intValue();
    }

    private final void setIconSize(int size) {
        AppCompatImageView appCompatImageView = this.binding.b;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = size;
        layoutParams.height = size;
        appCompatImageView.setLayoutParams(layoutParams);
    }

    private final void setProgressBarSize(int size) {
        this.binding.c.setLayoutParams(new FrameLayout.LayoutParams(size, size));
    }

    private final void setStateAnimation(int animation) {
        if (animation != 0) {
            setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), animation));
        }
    }

    public final void render(u4f0 state) {
        throw null;
    }

    public PrizeProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PrizeProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PrizeProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
