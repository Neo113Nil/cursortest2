package com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.igk0;
import defpackage.jgk0;
import defpackage.kgk0;
import defpackage.lgk0;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qje;
import defpackage.tje;
import defpackage.vng;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zkh0;
import defpackage.zzx;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/driver/title/RideCardDriverSectionBadgesView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkgk0;", C0553n3.g, "Lzy11;", "updateFirstBadgeBackground", "(Lkgk0;)V", "Llgk0;", "uiState", "render", "(Llgk0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lzzx;", "binding", "Lzzx;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverSectionBadgesView extends GoLinearLayout {
    public static final int $stable = 8;
    private final zzx binding;

    public RideCardDriverSectionBadgesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(zkh0.layout_details_card_driver_section_title_badges, this);
        int i2 = p8h0.first_badge_container;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i2, this);
        if (goFrameLayout != null) {
            i2 = p8h0.first_badge_text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView != null) {
                i2 = p8h0.hidden_badges_background;
                if (((GoFrameLayout) cma1.O(i2, this)) != null) {
                    i2 = p8h0.hidden_badges_container;
                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i2, this);
                    if (goFrameLayout2 != null) {
                        i2 = p8h0.hidden_badges_text;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                        if (robotoTextView2 != null) {
                            this.binding = new zzx(this, goFrameLayout, robotoTextView, goFrameLayout2, robotoTextView2);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void updateFirstBadgeBackground(kgk0 background) {
        zzx zzxVar = this.binding;
        if (background instanceof igk0) {
            zzxVar.b.setBackground(vng.t(n4h0.ride_card_driver_badge_bg, getContext()));
            zzxVar.b.setBackgroundTintList(ColorStateList.valueOf(((igk0) background).a));
        } else {
            if (!(background instanceof jgk0)) {
                w511.b();
                return;
            }
            jgk0 jgk0Var = (jgk0) background;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{jgk0Var.a, jgk0Var.b});
            gradientDrawable.setCornerRadius(tje.w(6, getContext()));
            zzxVar.b.setBackgroundDrawable(gradientDrawable);
            zzxVar.b.setBackgroundTintList(null);
        }
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.binding.d.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMain, getContext())));
    }

    public final void render(lgk0 uiState) {
        zzx zzxVar = this.binding;
        zzxVar.c.setText(uiState.a);
        GoFrameLayout goFrameLayout = zzxVar.d;
        CharSequence charSequence = uiState.c;
        goFrameLayout.setVisibility(charSequence != null ? 0 : 8);
        zzxVar.e.setText(charSequence);
        updateFirstBadgeBackground(uiState.b);
    }

    public RideCardDriverSectionBadgesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RideCardDriverSectionBadgesView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RideCardDriverSectionBadgesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
