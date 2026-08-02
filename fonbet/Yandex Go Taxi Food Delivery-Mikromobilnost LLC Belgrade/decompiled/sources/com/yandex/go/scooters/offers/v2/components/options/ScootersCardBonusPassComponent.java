package com.yandex.go.scooters.offers.v2.components.options;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.dzg0;
import defpackage.gdc;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.o86;
import defpackage.qfh0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.x7n0;
import defpackage.xw31;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardBonusPassComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lo86;", "bonusPass", "Lzy11;", "setBonusPass", "(Lo86;)V", "Lcom/yandex/go/design/view/GoImageView;", "navigationIconImageView", "Lcom/yandex/go/design/view/GoImageView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "trailLinearLayout", "Lcom/yandex/go/design/view/GoLinearLayout;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardBonusPassComponent extends ListItemComponent {
    public static final int $stable = 8;
    private final GoImageView navigationIconImageView;
    private final GoLinearLayout trailLinearLayout;

    public ScootersCardBonusPassComponent(Context context) {
        super(context, null, 0, 6, null);
        int r = tje.r(mrg0.go_design_l_space, getContext());
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        goImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(r, r));
        goImageView.setImageResource(ListItemComponent.DEFAULT_NAVIGATION_ICON);
        goImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.navigationIconImageView = goImageView;
        GoLinearLayout goLinearLayout = new GoLinearLayout(context, null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(16);
        goLinearLayout.addView(goImageView);
        this.trailLinearLayout = goLinearLayout;
        setId(qfh0.scooters_component_option_bonus_pass);
        setTrailView(goLinearLayout);
        setVisibility(8);
        setBackgroundResource(x7n0.a);
    }

    public final void setBonusPass(o86 bonusPass) {
        int i = dzg0.ic_done_mark;
        gdc gdcVar = new gdc(mqg0.component_green_normal);
        int u = tje.u(16, getContext());
        this.navigationIconImageView.setImageResource(i);
        this.navigationIconImageView.setImageTintList(ColorStateList.valueOf(s8o.m(gdcVar, getContext())));
        xw31.J(this.trailLinearLayout, null, null, Integer.valueOf(u), null);
        setTitle(bonusPass.a);
        setSubtitle(bonusPass.b);
        setLeadImage(bonusPass.c);
        setVisibility(0);
    }
}
