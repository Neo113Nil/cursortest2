package com.yandex.go.superapp.orders.card.circle_buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.am70;
import defpackage.c8h0;
import defpackage.cgb;
import defpackage.cma1;
import defpackage.dub;
import defpackage.mkh0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qje;
import defpackage.tls;
import defpackage.tse;
import defpackage.xng0;
import defpackage.xt;
import defpackage.xw;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.DividerWithColorView;
import ru.yandex.taxi.order.view.TopCircleButtonsView;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u000f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/go/superapp/orders/card/circle_buttons/CircleButtonsView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltse;", "coroutineScope", "Lpav;", "imageLoader", "Lzy11;", "init", "(Ltse;Lpav;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ldub;", ClidProvider.STATE, "setState", "(Ldub;)V", "Lkotlin/Function1;", "Lru/yandex/taxi/superapp/orders/models/ActionType;", "listener", "setClickListener", "(Ltls;)V", "Lam70;", "binding", "Lam70;", "Lru/yandex/taxi/design/DividerWithColorView;", "divider", "Lru/yandex/taxi/design/DividerWithColorView;", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "buttonsPanel", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "Lxt;", "clickListener", "Lxt;", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CircleButtonsView extends LinearLayoutCompat implements nwy0 {
    private final am70 binding;
    private final TopCircleButtonsView buttonsPanel;
    private xt clickListener;
    private final DividerWithColorView divider;

    public CircleButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(mkh0.order_card_circle_buttons, this);
        int i2 = c8h0.buttons_panel;
        TopCircleButtonsView topCircleButtonsView = (TopCircleButtonsView) cma1.O(i2, this);
        if (topCircleButtonsView != null) {
            i2 = c8h0.divider;
            DividerWithColorView dividerWithColorView = (DividerWithColorView) cma1.O(i2, this);
            if (dividerWithColorView != null) {
                this.binding = new am70(this, topCircleButtonsView, dividerWithColorView);
                this.divider = dividerWithColorView;
                this.buttonsPanel = topCircleButtonsView;
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.divider.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.line, getContext())));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void init(tse coroutineScope, pav imageLoader) {
        this.buttonsPanel.init(coroutineScope, imageLoader);
    }

    public final void setClickListener(tls listener) {
        this.clickListener = new cgb(1, listener);
    }

    public final void setState(dub state) {
        List<xw> list = state != null ? state.b : null;
        if (list == null) {
            list = EmptyList.a;
        }
        List<xw> list2 = list;
        setVisibility(!list2.isEmpty() ? 0 : 8);
        if (state == null || list2.isEmpty()) {
            return;
        }
        this.buttonsPanel.updateActions(state.a, list);
        this.buttonsPanel.setActionClickListener(this.clickListener);
    }

    public CircleButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircleButtonsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircleButtonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
