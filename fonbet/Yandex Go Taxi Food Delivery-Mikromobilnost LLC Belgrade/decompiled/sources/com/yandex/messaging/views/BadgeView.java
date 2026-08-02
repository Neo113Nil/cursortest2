package com.yandex.messaging.views;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.e9h0;
import defpackage.jl40;
import defpackage.olh0;
import defpackage.tm4;
import defpackage.vm4;
import defpackage.w0i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006("}, d2 = {"Lcom/yandex/messaging/views/BadgeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "hideBadge", "()V", "showWithScaleAnimation", "hideWithScaleAnimation", "count", "setBadge", "(I)V", "drawableRes", "setBadgeIcon", "(Ljava/lang/Integer;)V", "setBadgeIconOrCount", "(Ljava/lang/Integer;I)V", "lastDrawableRes", "Ljava/lang/Integer;", "lastCount", CA20Status.STATUS_USER_I, "Landroid/widget/ImageView;", "badgeIcon", "Landroid/widget/ImageView;", "Lcom/yandex/messaging/views/CounterTextView;", "badgeTextSwitcher", "Lcom/yandex/messaging/views/CounterTextView;", "", "isAnimationHidePlaying", "Z", "isAnimationShowPlaying", "Companion", "vm4", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BadgeView extends LinearLayout {
    public static final int $stable = 8;
    private static final long ANIMATION_DURATION = 300;
    public static final vm4 Companion = new vm4();
    private final ImageView badgeIcon;
    private final CounterTextView badgeTextSwitcher;
    private boolean isAnimationHidePlaying;
    private boolean isAnimationShowPlaying;
    private int lastCount;
    private Integer lastDrawableRes;

    public BadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(olh0.msg_view_badge, (ViewGroup) this, true);
        this.badgeIcon = (ImageView) findViewById(e9h0.badge_icon);
        CounterTextView counterTextView = (CounterTextView) findViewById(e9h0.badge_text_switcher);
        this.badgeTextSwitcher = counterTextView;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        layoutTransition.enableTransitionType(4);
        counterTextView.setWillNotDraw(false);
        counterTextView.setLayoutTransition(layoutTransition);
        setLayoutTransition(layoutTransition);
    }

    private final void hideBadge() {
        if (this.lastCount > 0 || this.lastDrawableRes != null) {
            return;
        }
        hideWithScaleAnimation();
    }

    private final void hideWithScaleAnimation() {
        if (getVisibility() == 0 || this.isAnimationShowPlaying) {
            this.isAnimationHidePlaying = true;
            animate().cancel();
            animate().withEndAction(new tm4(this, 1)).scaleX(0.0f).scaleY(0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideWithScaleAnimation$lambda$2(BadgeView badgeView) {
        badgeView.setVisibility(8);
        badgeView.isAnimationHidePlaying = false;
    }

    private final void showWithScaleAnimation() {
        if (getVisibility() != 0 || this.isAnimationHidePlaying) {
            this.isAnimationShowPlaying = true;
            animate().cancel();
            if (getVisibility() != 0) {
                setScaleX(0.0f);
                setScaleY(0.0f);
                setVisibility(0);
            }
            animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).withEndAction(new tm4(this, 0)).start();
        }
    }

    public final void setBadge(int count) {
        if (this.lastCount == count) {
            return;
        }
        this.lastCount = count;
        if (count <= 0) {
            hideBadge();
        } else {
            showWithScaleAnimation();
            this.badgeTextSwitcher.setCount(count);
        }
    }

    public final void setBadgeIcon(Integer drawableRes) {
        if (jl40.l(this.lastDrawableRes, drawableRes)) {
            return;
        }
        this.lastDrawableRes = drawableRes;
        ImageView imageView = this.badgeIcon;
        if (drawableRes == null) {
            imageView.setVisibility(8);
            hideBadge();
        } else {
            imageView.setImageResource(drawableRes.intValue());
            this.badgeIcon.setVisibility(0);
            showWithScaleAnimation();
        }
    }

    public final void setBadgeIconOrCount(Integer drawableRes, int count) {
        if (jl40.l(this.lastDrawableRes, drawableRes) && this.lastCount == count) {
            return;
        }
        this.lastDrawableRes = drawableRes;
        this.lastCount = count;
        if (drawableRes != null) {
            this.badgeIcon.setImageResource(drawableRes.intValue());
            this.badgeTextSwitcher.setVisibility(8);
            this.badgeIcon.setVisibility(0);
            setVisibility(0);
            return;
        }
        if (count <= 0) {
            this.badgeTextSwitcher.setVisibility(8);
            this.badgeIcon.setVisibility(8);
            setVisibility(8);
        } else {
            this.badgeIcon.setVisibility(8);
            this.badgeTextSwitcher.setVisibility(0);
            this.badgeTextSwitcher.setCount(count);
            setVisibility(0);
        }
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ BadgeView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? w0i0.Messaging_BadgeView : i2);
    }

    public BadgeView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
