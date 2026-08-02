package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.ce0;
import defpackage.e9h0;
import defpackage.gvb1;
import defpackage.ipg0;
import defpackage.k3i0;
import defpackage.olh0;
import defpackage.wwg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/messaging/views/NavTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "showDotIndicator", "()V", "hideDotIndicator", "unreadCount", "", "hasMention", "setBadgeContent", "(IZ)V", "selected", "setSelected", "(Z)V", "Landroid/widget/ImageView;", "dotIndicator", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tabTextView", "Landroid/widget/TextView;", "Lcom/yandex/messaging/views/BadgeView;", "badge", "Lcom/yandex/messaging/views/BadgeView;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NavTabView extends ConstraintLayout {
    public static final int $stable = 8;
    private final BadgeView badge;
    private final ImageView dotIndicator;
    private final TextView tabTextView;

    public NavTabView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(olh0.msg_view_nav_tab, (ViewGroup) this, true);
        setForeground(context.getDrawable(wwg0.msg_tab_button_ripple));
        TextView textView = (TextView) findViewById(e9h0.tab_text_view);
        this.tabTextView = textView;
        this.badge = (BadgeView) findViewById(e9h0.tab_badge);
        this.dotIndicator = (ImageView) findViewById(e9h0.dot_indicator);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.NavTabView);
        String string = obtainStyledAttributes.getString(k3i0.NavTabView_ntvText);
        int i3 = k3i0.NavTabView_ntvDrawable;
        gvb1.a(obtainStyledAttributes, i3);
        int resourceId = obtainStyledAttributes.getResourceId(i3, 0);
        textView.setText(string);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, resourceId, 0, 0);
        textView.setCompoundDrawableTintList(context.getColorStateList(ipg0.msg_tab_bar_icon_color_selector));
        obtainStyledAttributes.recycle();
    }

    public final void hideDotIndicator() {
        ImageView imageView = this.dotIndicator;
        imageView.animate().cancel();
        if (imageView.getVisibility() != 0) {
            return;
        }
        imageView.animate().scaleX(0.0f).scaleY(0.0f).setInterpolator(new FastOutSlowInInterpolator()).withEndAction(new ce0(imageView, 25)).start();
    }

    public final void setBadgeContent(int unreadCount, boolean hasMention) {
        this.badge.setBadge(unreadCount);
        this.badge.setBadgeIcon(hasMention ? Integer.valueOf(wwg0.msg_ic_badge_mention) : null);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        this.tabTextView.setSelected(selected);
    }

    public final void showDotIndicator() {
        ImageView imageView = this.dotIndicator;
        imageView.animate().cancel();
        if (imageView.getVisibility() != 0) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(0.0f);
            imageView.setScaleY(0.0f);
            imageView.setVisibility(0);
        }
        imageView.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new FastOutSlowInInterpolator()).setListener(null).start();
    }

    public NavTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public NavTabView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ NavTabView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public NavTabView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
