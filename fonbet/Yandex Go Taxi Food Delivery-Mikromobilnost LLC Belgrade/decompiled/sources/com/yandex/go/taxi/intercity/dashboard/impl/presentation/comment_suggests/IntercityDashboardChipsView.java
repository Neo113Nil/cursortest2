package com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bdc;
import defpackage.gdc;
import defpackage.i3y;
import defpackage.kdc;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tp11;
import defpackage.tzt;
import defpackage.w0d;
import defpackage.xng0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/comment_suggests/IntercityDashboardChipsView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkdc;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Landroid/graphics/drawable/Drawable;", "createBackground", "(Lkdc;)Landroid/graphics/drawable/Drawable;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "updateColors", "()V", "", "rippleColor$delegate", "Li3y;", "getRippleColor", "()I", "rippleColor", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "imageView", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "getImageView", "()Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardChipsView extends ListItemComponent {
    private final CircleButtonImageView imageView;

    /* renamed from: rippleColor$delegate, reason: from kotlin metadata */
    private final i3y rippleColor;

    public IntercityDashboardChipsView(Context context) {
        super(context, null, 0, 6, null);
        this.rippleColor = kotlin.a.b(LazyThreadSafetyMode.NONE, new tzt(20, this));
        CircleButtonImageView circleButtonImageView = new CircleButtonImageView(context, null, 0, 6, null);
        this.imageView = circleButtonImageView;
        setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(40, getContext())));
        circleButtonImageView.setLayoutParams(new ViewGroup.LayoutParams(tje.u(32, getContext()), tje.u(32, getContext())));
        circleButtonImageView.setPadding(tje.u(8, getContext()));
        setLeadView(circleButtonImageView);
        int u = tje.u(4, getContext());
        this.leadFrame.setPaddingRelative(u, u, tje.u(6, getContext()), u);
        Boolean bool = tp11.a;
        tp11.b(3, title());
    }

    private final Drawable createBackground(kdc backgroundColor) {
        w0d w0dVar = new w0d();
        w0dVar.h = tje.w(20, getContext());
        w0dVar.a = s8o.m(backgroundColor, getContext());
        w0dVar.g = true;
        w0dVar.e = Integer.valueOf(getRippleColor());
        return w0dVar.a();
    }

    private final int getRippleColor() {
        return ((Number) this.rippleColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rippleColor_delegate$lambda$0(IntercityDashboardChipsView intercityDashboardChipsView) {
        return c.c(xng0.controlPressed, intercityDashboardChipsView);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateColors();
    }

    public final CircleButtonImageView getImageView() {
        return this.imageView;
    }

    public final void updateColors() {
        boolean isSelected = isSelected();
        CircleButtonImageView circleButtonImageView = this.imageView;
        if (!isSelected) {
            circleButtonImageView.setBackground(createBackground(new bdc(xng0.bgMain)));
            this.imageView.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMinor, getContext())));
            setRoundedBackground(qje.t(xng0.bgMinor, getContext()), tje.w(20, getContext()));
            setTitleColorAttr(xng0.textMain);
            return;
        }
        circleButtonImageView.setBackground(createBackground(new gdc(mqg0.component_gray_450)));
        this.imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(mqg0.component_white)));
        setRoundedBackground(qje.t(xng0.bgInvert, getContext()), tje.w(20, getContext()));
        setTitleColorAttr(xng0.textInvert);
    }
}
