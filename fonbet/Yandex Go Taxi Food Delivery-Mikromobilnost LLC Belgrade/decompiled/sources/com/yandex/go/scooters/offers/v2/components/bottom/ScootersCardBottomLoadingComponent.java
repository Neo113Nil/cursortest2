package com.yandex.go.scooters.offers.v2.components.bottom;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.k1b1;
import defpackage.kyh0;
import defpackage.n4n0;
import defpackage.s3h0;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ê\u0001\f\b\u0007\u0012\b\b\b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/bottom/ScootersCardBottomLoadingComponent;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "preorder", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardBottomLoadingComponent extends GoConstraintLayout {
    public static final int $stable = 8;

    public ScootersCardBottomLoadingComponent(Context context) {
        super(context, null, 0, 0, 14, null);
        n4n0 o = n4n0.o(LayoutInflater.from(context), this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackground(tje.y(s3h0.scooters_top_rounded_floating_background, getContext()));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
        CashbackHorizontalView cashbackHorizontalView = o.d;
        cashbackHorizontalView.setBadgeStyle(CashbackBadgeStyle.LIGHT_GRADIENT);
        ButtonComponent buttonComponent = o.c;
        buttonComponent.setEnabled(false);
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.scooters_card_button_on_loading));
        buttonComponent.setDebounceClickListener(null);
        k1b1.f(buttonComponent);
        buttonComponent.startAnimation();
        o.g.d.setEnabled(false);
        o.f.setEnabled(false);
        cashbackHorizontalView.setVisibility(8);
    }
}
