package com.yandex.go.places.organization.card.impl.ui.card.flex.v2.bottom_panel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonSize;
import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonType;
import defpackage.ae6;
import defpackage.evu0;
import defpackage.fug0;
import defpackage.g18;
import defpackage.g3h0;
import defpackage.gac;
import defpackage.l95;
import defpackage.nac;
import defpackage.ofv;
import defpackage.pav;
import defpackage.q6h0;
import defpackage.qje;
import defpackage.tje;
import defpackage.ud6;
import defpackage.vuh0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/BottomPanelButtonView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "Lud6;", "button", "Lzy11;", "applyButtonLayout", "(Lud6;)V", "applyButtonAppearance", "applyAccessibility", "Landroid/view/View$OnClickListener;", "onClickListener", "setButton", "(Lud6;Landroid/view/View$OnClickListener;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpav;", "Landroidx/appcompat/widget/AppCompatImageView;", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/FadeEdgeTextView;", "textView", "Lcom/yandex/go/places/organization/card/impl/ui/card/flex/v2/bottom_panel/FadeEdgeTextView;", "Lg18;", "iconLoadCancellable", "Lg18;", "currentButton", "Lud6;", "currentClickListener", "Landroid/view/View$OnClickListener;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BottomPanelButtonView extends GoLinearLayout {
    public static final int $stable = 8;
    private ud6 currentButton;
    private View.OnClickListener currentClickListener;
    private g18 iconLoadCancellable;
    private final AppCompatImageView iconView;
    private final pav imageLoader;
    private final FadeEdgeTextView textView;

    public BottomPanelButtonView(Context context, pav pavVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        setOrientation(0);
        setGravity(17);
        int r = tje.r(fug0.places_card_bottom_panel_button_padding_horizontal, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fug0.places_card_bottom_panel_button_padding_vertical);
        setPadding(r, dimensionPixelSize, r, dimensionPixelSize);
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context).inflate(vuh0.bottom_panel_button_view, (ViewGroup) this, true);
        this.iconView = (AppCompatImageView) findViewById(q6h0.button_icon);
        this.textView = (FadeEdgeTextView) findViewById(q6h0.button_text);
    }

    private final void applyAccessibility(ud6 button) {
        String str = button.c;
        if (evu0.J(str)) {
            String str2 = button.b;
            if (str2 == null) {
                str2 = "";
            }
            str = str2;
        }
        setContentDescription(str);
    }

    private final void applyButtonAppearance(ud6 button) {
        Pair pair;
        g18 g18Var = this.iconLoadCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        BottomPanelButtonType bottomPanelButtonType = button.d;
        String str = button.b;
        int i = bottomPanelButtonType == null ? -1 : ae6.b[bottomPanelButtonType.ordinal()];
        boolean z = true;
        if (i == -1) {
            pair = new Pair(Integer.valueOf(g3h0.bg_bottom_panel_button_minor), Integer.valueOf(xng0.everFront));
        } else if (i == 1) {
            pair = new Pair(Integer.valueOf(g3h0.bg_bottom_panel_button_main), Integer.valueOf(xng0.textOnControl));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            pair = new Pair(Integer.valueOf(g3h0.bg_bottom_panel_button_minor), Integer.valueOf(xng0.bgInvert));
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        setBackgroundResource(intValue);
        this.textView.setTextColor(qje.t(intValue2, getContext()));
        String str2 = button.a;
        boolean z2 = str2 == null || str2.length() == 0;
        AppCompatImageView appCompatImageView = this.iconView;
        if (z2) {
            appCompatImageView.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(0);
            int r = tje.r(fug0.places_card_bottom_panel_button_icon_size, getContext());
            nac nacVar = (nac) this.imageLoader.a(this.iconView);
            nacVar.f(r, r);
            nacVar.g(ofv.a);
            nacVar.i = new l95(25, this);
            nacVar.e = new gac(qje.t(intValue2, getContext()), r0);
            this.iconLoadCancellable = nacVar.c(str2);
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        FadeEdgeTextView fadeEdgeTextView = this.textView;
        if (z) {
            fadeEdgeTextView.setVisibility(8);
            return;
        }
        fadeEdgeTextView.setVisibility(0);
        this.textView.setText(str);
        ((LinearLayout.LayoutParams) this.textView.getLayoutParams()).setMarginStart(z2 ? 0 : tje.r(fug0.places_card_bottom_panel_button_text_icon_spacing, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 applyButtonAppearance$lambda$0(BottomPanelButtonView bottomPanelButtonView) {
        bottomPanelButtonView.iconView.setVisibility(8);
        return zy11.a;
    }

    private final void applyButtonLayout(ud6 button) {
        LinearLayout.LayoutParams layoutParams;
        BottomPanelButtonSize bottomPanelButtonSize = button.e;
        int i = bottomPanelButtonSize == null ? -1 : ae6.a[bottomPanelButtonSize.ordinal()];
        if (i != -1) {
            if (i == 1) {
                layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                setLayoutParams(layoutParams);
            } else if (i != 2) {
                w511.b();
                return;
            }
        }
        layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setLayoutParams(layoutParams);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ud6 ud6Var = this.currentButton;
        if (ud6Var != null) {
            applyButtonAppearance(ud6Var);
        }
    }

    public final void setButton(ud6 button, View.OnClickListener onClickListener) {
        this.currentButton = button;
        this.currentClickListener = onClickListener;
        applyButtonLayout(button);
        applyButtonAppearance(button);
        applyAccessibility(button);
        setOnClickListener(onClickListener);
    }
}
