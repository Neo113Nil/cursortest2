package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.h2i0;
import defpackage.jl40;
import defpackage.k3i0;
import defpackage.vng;
import defpackage.w0i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0016R.\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0017\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u0016R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/yandex/messaging/views/ActionButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "updateIcon", "()V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "resId", "setIconResource", "(I)V", "value", "iconPadding", CA20Status.STATUS_USER_I, "getIconPadding", "()I", "setIconPadding", "Landroid/content/res/ColorStateList;", "iconTint", "Landroid/content/res/ColorStateList;", "getIconTint", "()Landroid/content/res/ColorStateList;", "setIconTint", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/drawable/Drawable;", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "iconSize", "getIconSize", "setIconSize", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActionButton extends FrameLayout {
    public static final int $stable = 8;
    private Drawable icon;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private final TextView textView;

    public ActionButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.ActionButton, i, i2);
        TextView textView = new TextView(context, null, 0, obtainStyledAttributes.getResourceId(k3i0.ActionButton_android_textAppearance, h2i0.Widget_AppCompat_TextView));
        this.textView = textView;
        setIconPadding(obtainStyledAttributes.getDimensionPixelSize(k3i0.ActionButton_iconPadding, 0));
        setIconSize(obtainStyledAttributes.getDimensionPixelSize(k3i0.ActionButton_iconSize, 0));
        setIconTint(obtainStyledAttributes.getColorStateList(k3i0.ActionButton_iconTint));
        setIcon(obtainStyledAttributes.getDrawable(k3i0.ActionButton_icon));
        int i3 = obtainStyledAttributes.getInt(k3i0.ActionButton_android_gravity, 17);
        setText(obtainStyledAttributes.getString(k3i0.ActionButton_android_text));
        obtainStyledAttributes.recycle();
        textView.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i3;
        addView(textView, layoutParams);
    }

    private final void updateIcon() {
        Drawable drawable = this.icon;
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        if (mutate != null) {
            mutate.setTintList(this.iconTint);
            mutate.setTintMode(PorterDuff.Mode.SRC_IN);
            int i = this.iconSize;
            if (i == 0) {
                i = mutate.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = mutate.getIntrinsicHeight();
            }
            mutate.setBounds(0, 0, i, i2);
        }
        this.textView.setCompoundDrawablesRelative(mutate, null, null, null);
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final int getIconPadding() {
        return this.iconPadding;
    }

    public final int getIconSize() {
        return this.iconSize;
    }

    public final ColorStateList getIconTint() {
        return this.iconTint;
    }

    public final CharSequence getText() {
        return this.textView.getText();
    }

    public final void setIcon(Drawable drawable) {
        if (jl40.l(this.icon, drawable)) {
            return;
        }
        this.icon = drawable;
        updateIcon();
    }

    public final void setIconPadding(int i) {
        if (this.iconPadding != i) {
            this.iconPadding = i;
            this.textView.setCompoundDrawablePadding(i);
        }
    }

    public final void setIconResource(int resId) {
        setIcon(resId != 0 ? vng.t(resId, getContext()) : null);
    }

    public final void setIconSize(int i) {
        if (this.iconSize != i) {
            this.iconSize = i;
            updateIcon();
        }
    }

    public final void setIconTint(ColorStateList colorStateList) {
        if (jl40.l(this.iconTint, colorStateList)) {
            return;
        }
        this.iconTint = colorStateList;
        updateIcon();
    }

    public final void setText(CharSequence text) {
        this.textView.setText(text);
    }

    public ActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ActionButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ ActionButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? w0i0.Messaging_ActionButton : i2);
    }

    public ActionButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
