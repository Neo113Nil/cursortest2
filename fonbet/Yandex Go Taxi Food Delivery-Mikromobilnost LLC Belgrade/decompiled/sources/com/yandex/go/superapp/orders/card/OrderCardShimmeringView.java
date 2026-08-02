package com.yandex.go.superapp.orders.card;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.nwy0;
import defpackage.wn70;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/superapp/orders/card/OrderCardShimmeringView;", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwn70;", "style", "Lzy11;", "init$card", "(Lwn70;)V", "init", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lwn70;", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class OrderCardShimmeringView extends ShimmeringFrameLayout implements nwy0 {
    private wn70 style;

    public /* synthetic */ OrderCardShimmeringView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean allowTraverse() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        wn70 wn70Var = this.style;
        if (wn70Var == null) {
            wn70Var = null;
        }
        if (wn70Var.H()) {
            return;
        }
        wn70 wn70Var2 = this.style;
        setBackgroundColor((wn70Var2 != null ? wn70Var2 : null).n(getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void init$card(wn70 style) {
        this.style = style;
        if (style.H()) {
            return;
        }
        setBackgroundColor(style.n(getContext()));
    }

    public OrderCardShimmeringView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderCardShimmeringView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OrderCardShimmeringView(Context context) {
        this(context, null, 0, 6, null);
    }
}
