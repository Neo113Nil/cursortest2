package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.cma1;
import defpackage.e261;
import defpackage.fch0;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.ory;
import defpackage.poh0;
import defpackage.t3i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 (2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010$\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/ybsdk/widgets/common/ListItemButton;", "Lcom/ybsdk/widgets/common/shimmer/ShimmerFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", BackendConfig.Restrictions.ENABLED, "Lzy11;", "setEnabled", "(Z)V", "Le261;", "binding", "Le261;", "", "value", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "startIcon", "Landroid/graphics/drawable/Drawable;", "getStartIcon", "()Landroid/graphics/drawable/Drawable;", "setStartIcon", "(Landroid/graphics/drawable/Drawable;)V", "endIcon", "getEndIcon", "setEndIcon", "endIconHorizontalMarginDp", CA20Status.STATUS_USER_I, "setEndIconHorizontalMarginDp", "(I)V", "Companion", "ory", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListItemButton extends ShimmerFrameLayout {
    public static final ory Companion = new ory();
    private static final int DEFAULT_ICON_END_HORIZONTAL_MARGIN_DP = 8;
    private final e261 binding;
    private Drawable endIcon;
    private int endIconHorizontalMarginDp;
    private Drawable startIcon;
    private String text;

    public ListItemButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_item_list_button, this);
        int i2 = fch0.buttonText;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = fch0.imageEnd;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = fch0.imageStart;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, this);
                if (appCompatImageView2 != null) {
                    this.binding = new e261(this, textView, appCompatImageView, appCompatImageView2);
                    String str = "";
                    this.text = "";
                    this.endIconHorizontalMarginDp = 8;
                    TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkListItemButton, i, i);
                    try {
                        String string = obtainStyledAttributes.getString(t3i0.YbSdkListItemButton_ybsdk_text);
                        if (string != null) {
                            str = string;
                        }
                        setText(str);
                        setStartIcon(obtainStyledAttributes.getDrawable(t3i0.YbSdkListItemButton_ybsdk_iconStart));
                        setEndIcon(obtainStyledAttributes.getDrawable(t3i0.YbSdkListItemButton_ybsdk_iconEnd));
                        setEndIconHorizontalMarginDp(obtainStyledAttributes.getInteger(t3i0.YbSdkListItemButton_ybsdk_iconEnd_horizontal_margin, 8));
                        obtainStyledAttributes.recycle();
                        setAddStatesFromChildren(true);
                        setAutoStart(false);
                        return;
                    } catch (Throwable th) {
                        obtainStyledAttributes.recycle();
                        throw th;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setEndIconHorizontalMarginDp(int i) {
        this.endIconHorizontalMarginDp = i;
        AppCompatImageView appCompatImageView = this.binding.c;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(kp50.r(i), marginLayoutParams.topMargin, kp50.r(i), marginLayoutParams.bottomMargin);
        appCompatImageView.setLayoutParams(marginLayoutParams);
    }

    public final Drawable getEndIcon() {
        return this.endIcon;
    }

    public final Drawable getStartIcon() {
        return this.startIcon;
    }

    public final String getText() {
        return this.text;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.b.setEnabled(enabled);
        this.binding.d.setEnabled(enabled);
        this.binding.c.setEnabled(enabled);
        setClickable(enabled);
        setFocusable(enabled);
    }

    public final void setEndIcon(Drawable drawable) {
        this.endIcon = drawable;
        e261 e261Var = this.binding;
        if (drawable == null) {
            e261Var.c.setVisibility(8);
        } else {
            e261Var.c.setVisibility(0);
            this.binding.c.setImageDrawable(drawable);
        }
    }

    public final void setStartIcon(Drawable drawable) {
        this.startIcon = drawable;
        e261 e261Var = this.binding;
        if (drawable == null) {
            e261Var.d.setVisibility(8);
        } else {
            e261Var.d.setVisibility(0);
            this.binding.d.setImageDrawable(drawable);
        }
    }

    public final void setText(String str) {
        this.text = str;
        this.binding.b.setText(str);
    }

    public ListItemButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ListItemButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ListItemButton(Context context) {
        this(context, null, 0, 6, null);
    }
}
