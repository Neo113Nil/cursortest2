package com.yandex.go.navigator.maneuver;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.evu0;
import defpackage.j73;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.v2h0;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/navigator/maneuver/DrivingBubbleView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "padding", "Lzy11;", "setTextPadding", "(I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "title", "iconStartResId", "Lkotlin/Function0;", "onClick", "render", "(Ljava/lang/String;Ljava/lang/Integer;Lsls;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DrivingBubbleView extends GoFrameLayout {
    public static final int $stable = 8;
    private final RobotoTextView textView;

    public DrivingBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        RobotoTextView robotoTextView = new RobotoTextView(context, attributeSet, i);
        this.textView = robotoTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        addView(robotoTextView);
        xw31.N(tje.u(8, getContext()), robotoTextView);
        xw31.B(tje.u(12, getContext()), robotoTextView);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        robotoTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        robotoTextView.setMaxLines(1);
        robotoTextView.setTextSize(16.0f);
        robotoTextView.setTextAlignment(4);
        robotoTextView.setGravity(17);
        robotoTextView.setTextColorAttr(xng0.textMain);
        robotoTextView.setCompoundDrawablePadding(tje.u(4, robotoTextView.getContext()));
        setBackgroundResource(v2h0.bg_main_ripple_rounded_24);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        Drawable drawable = (Drawable) j73.C(this.textView.getCompoundDrawables());
        if (drawable != null) {
            drawable.setTint(qje.t(xng0.textMain, getContext()));
        }
    }

    public final void render(String title, Integer iconStartResId, sls onClick) {
        setVisibility(!evu0.J(title) ? 0 : 8);
        this.textView.setText(title);
        this.textView.setTextTypeface(3);
        this.textView.setCompoundDrawablesWithIntrinsicBounds(iconStartResId != null ? iconStartResId.intValue() : 0, 0, 0, 0);
        c.z(onClick, this);
        setEnabled(onClick != null);
        requestLayout();
    }

    public final void setTextPadding(int padding) {
        xw31.G(padding, this.textView);
    }

    public DrivingBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DrivingBubbleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DrivingBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
