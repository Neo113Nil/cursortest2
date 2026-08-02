package com.yandex.go.taxi.order.details.v2.ui.view.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import defpackage.a0y;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.hgk0;
import defpackage.jik0;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.ogk0;
import defpackage.p8h0;
import defpackage.tje;
import defpackage.usg0;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringImageView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/RideCardDriverSimpleSectionView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Logk0;", ClidProvider.STATE, "Lzy11;", "renderCarImageState", "(Logk0;)V", "Lhgk0;", "renderAvatarImageState", "(Lhgk0;)V", "Ljik0;", "uiState", "render", "(Ljik0;)V", "Landroid/view/View$OnClickListener;", "listener", "setDriverClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "La0y;", "binding", "La0y;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverSimpleSectionView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final a0y binding;

    public RideCardDriverSimpleSectionView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(zkh0.layout_details_card_driver_simple_section, this);
        int i = p8h0.avatar_background;
        GoView goView = (GoView) cma1.O(i, this);
        if (goView != null) {
            i = p8h0.avatar_image;
            ShimmeringImageView shimmeringImageView = (ShimmeringImageView) cma1.O(i, this);
            if (shimmeringImageView != null) {
                i = p8h0.car_image;
                GoImageView goImageView = (GoImageView) cma1.O(i, this);
                if (goImageView != null) {
                    i = p8h0.vertical_center_guide;
                    Guideline guideline = (Guideline) cma1.O(i, this);
                    if (guideline != null) {
                        this.binding = new a0y(this, goView, shimmeringImageView, goImageView, guideline);
                        goImageView.setScaleX(xw31.n(context) ? -1.0f : 1.0f);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void renderAvatarImageState(hgk0 state) {
        a0y a0yVar = this.binding;
        state.getClass();
        if (state == hgk0.c) {
            ShimmeringImageView shimmeringImageView = a0yVar.c;
            Guideline guideline = a0yVar.e;
            shimmeringImageView.setVisibility(4);
            a0yVar.b.setVisibility(4);
            GoImageView goImageView = a0yVar.d;
            ViewGroup.LayoutParams layoutParams = goImageView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToEnd = guideline.getId();
            layoutParams2.startToStart = guideline.getId();
            goImageView.setLayoutParams(layoutParams2);
            return;
        }
        ShimmeringImageView shimmeringImageView2 = a0yVar.c;
        GoView goView = a0yVar.b;
        shimmeringImageView2.setVisibility(0);
        shimmeringImageView2.setImageDrawable(state.b);
        shimmeringImageView2.setLoading(state.a);
        cvw.a0(tje.r(usg0.ride_card_driver_avatar_corners_radius, shimmeringImageView2.getContext()), shimmeringImageView2);
        GoImageView goImageView2 = a0yVar.d;
        ViewGroup.LayoutParams layoutParams3 = goImageView2.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.endToEnd = goView.getId();
        layoutParams4.startToStart = -1;
        goImageView2.setLayoutParams(layoutParams4);
        goView.setVisibility(0);
    }

    private final void renderCarImageState(ogk0 state) {
        a0y a0yVar = this.binding;
        a0yVar.d.setImageDrawable(state.a.getDrawable());
        a0yVar.d.setVisibility(state.a.getDrawable() != null ? 0 : 8);
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.b.setBackground(vng.t(n4h0.driver_simple_avatar_bg_rounded, getContext()));
        setBackgroundAttr(xng0.bgMain);
    }

    public final void render(jik0 uiState) {
        renderCarImageState(uiState.d);
        renderAvatarImageState(uiState.e);
        setContentDescription(uiState.c);
    }

    public final void setDriverClickListener(View.OnClickListener listener) {
        this.binding.c.setOnClickListener(listener);
    }
}
