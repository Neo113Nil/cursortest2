package com.ybsdk.feature.savings.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.ybsdk.core.design.animation.ticker.TickerView;
import defpackage.cg91;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.jl40;
import defpackage.ok31;
import defpackage.v7m0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 12\u00020\u0001:\u00012B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010 \u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010'\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010\u0011\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#\"\u0004\b0\u0010%¨\u00063"}, d2 = {"Lcom/ybsdk/feature/savings/internal/views/SavingsAccountTickerView;", "Lcom/ybsdk/core/design/animation/ticker/TickerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "text", "Lzy11;", "setText", "(Ljava/lang/String;)V", "replayAnimation", "()V", "", "getTextPaintExpandedTextSize", "()F", "", "animationDelay", "J", "getAnimationDelay", "()J", "setAnimationDelay", "(J)V", "animationDuration", "getAnimationDuration", "setAnimationDuration", "", "animateMeasurementChange", "Z", "getAnimateMeasurementChange", "()Z", "setAnimateMeasurementChange", "(Z)V", "Landroid/view/animation/Interpolator;", "animationInterpolator", "Landroid/view/animation/Interpolator;", "getAnimationInterpolator", "()Landroid/view/animation/Interpolator;", "setAnimationInterpolator", "(Landroid/view/animation/Interpolator;)V", "getAnimationInterpolator$annotations", "animationEnabled", "getAnimationEnabled", "setAnimationEnabled", "Companion", "v7m0", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavingsAccountTickerView extends TickerView {
    private static final float ALPHA_FULL = 1.0f;
    private static final float ALPHA_HIDE = 0.0f;
    private static final String ANIMATION_START_SYMBOL = "0";
    private static final long DEFAULT_ANIMATION_DELAY_FLAG = -1;
    private static final long DELAY_FOR_ANIMATION_BY_TAP = 0;
    private static final long DELAY_MS = 500;
    private static final long DURATION_MS = 750;
    private boolean animateMeasurementChange;
    private long animationDelay;
    private long animationDuration;
    private boolean animationEnabled;
    private Interpolator animationInterpolator;
    public static final v7m0 Companion = new v7m0();
    private static final Regex ANY_DIGIT_REGEX = new Regex("\\d");

    public SavingsAccountTickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.animationDelay = 500L;
        this.animationDuration = DURATION_MS;
        this.animateMeasurementChange = true;
        this.animationInterpolator = new PathInterpolator(0.25f, 1.0f, 0.65f, 1.0f);
        this.animationEnabled = true;
        setCharacterLists(gvu0.z0("0123456789").toString());
        setPreferredScrollingDirection(TickerView.ScrollingDirection.UP);
    }

    public static /* synthetic */ void getAnimationInterpolator$annotations() {
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public boolean getAnimateMeasurementChange() {
        return this.animateMeasurementChange;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public long getAnimationDelay() {
        return this.animationDelay;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public Interpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    public final float getTextPaintExpandedTextSize() {
        return getTextPaint().getTextSize();
    }

    public final void replayAnimation() {
        String text = getText();
        setText(ANY_DIGIT_REGEX.j(text == null ? "" : text, "0"), false, 0L);
        setText(text, true ^ (text == null || evu0.J(text)), 0L);
        setAlpha(1.0f);
        animate().alpha(1.0f).setDuration(DURATION_MS).setInterpolator(getAnimationInterpolator()).start();
        cg91.c(this, ok31.c);
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public void setAnimateMeasurementChange(boolean z) {
        this.animateMeasurementChange = z;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public void setAnimationDelay(long j) {
        this.animationDelay = j;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public void setAnimationDuration(long j) {
        this.animationDuration = j;
    }

    public final void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public void setAnimationInterpolator(Interpolator interpolator) {
        this.animationInterpolator = interpolator;
    }

    @Override // com.ybsdk.core.design.animation.ticker.TickerView
    public void setText(String text) {
        if (jl40.l(text, getText())) {
            return;
        }
        if (!this.animationEnabled) {
            setText(text, false, -1L);
            return;
        }
        setText(ANY_DIGIT_REGEX.j(text == null ? "" : text, "0"), false, -1L);
        super.setText(text);
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(DURATION_MS).setStartDelay(500L).setInterpolator(getAnimationInterpolator()).start();
    }

    public SavingsAccountTickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SavingsAccountTickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ SavingsAccountTickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public SavingsAccountTickerView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
