package com.ybsdk.feature.divkit.internal.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.ybsdk.core.design.animation.ticker.TickerView;
import defpackage.gvu0;
import defpackage.jl40;
import defpackage.k400;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/MainDashboardTickerView;", "Lcom/ybsdk/core/design/animation/ticker/TickerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "text", "Lzy11;", "setText", "(Ljava/lang/String;)V", "", "isAnimationEnabled", "Z", "()Z", "setAnimationEnabled", "(Z)V", "Companion", "k400", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainDashboardTickerView extends TickerView {
    public static final k400 Companion = new k400();
    private static final long DEFAULT_ANIMATION_DELAY_FLAG = -1;
    private boolean isAnimationEnabled;

    public MainDashboardTickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.isAnimationEnabled = true;
        setCharacterLists(gvu0.z0("0123456789").toString());
        setPreferredScrollingDirection(TickerView.ScrollingDirection.UP);
    }

    /* renamed from: isAnimationEnabled, reason: from getter */
    public final boolean getIsAnimationEnabled() {
        return this.isAnimationEnabled;
    }

    public final void setAnimationEnabled(boolean z) {
        this.isAnimationEnabled = z;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public void setText(String text) {
        if (jl40.l(text, getText())) {
            return;
        }
        if (this.isAnimationEnabled) {
            super.setText(text);
        } else {
            setText(text, false, -1L);
        }
    }

    public MainDashboardTickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public MainDashboardTickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ MainDashboardTickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public MainDashboardTickerView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
