package com.yandex.go.tariffcard.ui.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.go.tariffcard.ui.MultiTariffOption$LeadIconType;
import defpackage.bdc;
import defpackage.evu0;
import defpackage.g18;
import defpackage.hex0;
import defpackage.jgx0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.nco;
import defpackage.nwy0;
import defpackage.pav;
import defpackage.s8o;
import defpackage.tje;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u000b*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/go/tariffcard/ui/view/TariffLeadView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/go/tariffcard/ui/MultiTariffOption$LeadIconType;", "type", "Landroid/graphics/drawable/Drawable;", "drawable", "Lzy11;", "setIcon", "(Lcom/yandex/go/tariffcard/ui/MultiTariffOption$LeadIconType;Landroid/graphics/drawable/Drawable;)V", "clearIcon", "()V", "Lnco;", "etaUiState", "setEtaUiState", "(Lnco;)V", "setIconType", "(Lcom/yandex/go/tariffcard/ui/MultiTariffOption$LeadIconType;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "invalidateTextColor", "(Lru/yandex/taxi/widget/RobotoTextView;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpav;", "imageLoader", "", "iconUrl", "iconType", "Lg18;", "setup", "(Lpav;Lnco;Ljava/lang/String;Lcom/yandex/go/tariffcard/ui/MultiTariffOption$LeadIconType;)Lg18;", "Landroid/widget/ImageView;", "iconImageView", "Landroid/widget/ImageView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffLeadView extends FrameLayout implements nwy0 {
    private final ImageView iconImageView;
    private final RobotoTextView textView;

    public TariffLeadView(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(0, tje.u(4, imageView.getContext()), 0, tje.u(21, imageView.getContext()));
        this.iconImageView = imageView;
        final RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        layoutParams2.bottomMargin = tje.u(14, robotoTextView.getContext());
        robotoTextView.setLayoutParams(layoutParams2);
        robotoTextView.setPadding(tje.u(4, robotoTextView.getContext()), 0, tje.u(4, robotoTextView.getContext()), 0);
        robotoTextView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.go.tariffcard.ui.view.TariffLeadView$textView$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c.j(4, RobotoTextView.this));
            }
        });
        invalidateTextColor(robotoTextView);
        robotoTextView.setElevation(tje.w(1, robotoTextView.getContext()));
        robotoTextView.setClipToOutline(true);
        robotoTextView.setTextSize(11.0f);
        robotoTextView.setVisibility(8);
        this.textView = robotoTextView;
        addView(imageView);
        addView(robotoTextView);
        setClipToPadding(false);
        setClipChildren(false);
        xw31.J(this, Integer.valueOf(tje.r(mrg0.go_design_m_space, getContext())), null, null, null);
    }

    private final void clearIcon() {
        this.iconImageView.setImageDrawable(null);
        this.iconImageView.setVisibility(8);
    }

    private final void invalidateTextColor(RobotoTextView robotoTextView) {
        robotoTextView.setTextColor(new bdc(xng0.textMain));
        robotoTextView.setBackgroundColor(s8o.m(new bdc(xng0.bgMain), robotoTextView.getContext()));
    }

    private final void setEtaUiState(nco etaUiState) {
        if (etaUiState != null) {
            this.textView.setText(etaUiState.getText());
            this.textView.setTextColor(etaUiState.a());
            this.textView.setBackgroundColor(s8o.m(etaUiState.getBackgroundColor(), getContext()));
        }
        RobotoTextView robotoTextView = this.textView;
        CharSequence text = etaUiState != null ? etaUiState.getText() : null;
        robotoTextView.setVisibility((text == null || evu0.J(text)) ? 8 : 0);
    }

    private final void setIcon(MultiTariffOption$LeadIconType type, Drawable drawable) {
        setIconType(type);
        this.iconImageView.setImageDrawable(drawable);
        this.iconImageView.setVisibility(0);
    }

    private final void setIconType(MultiTariffOption$LeadIconType type) {
        int u;
        int u2;
        ViewGroup.LayoutParams layoutParams = this.iconImageView.getLayoutParams();
        int[] iArr = jgx0.a;
        int i = iArr[type.ordinal()];
        if (i == 1) {
            u = tje.u(56, getContext());
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            u = tje.u(72, getContext());
        }
        layoutParams.width = u;
        ImageView imageView = this.iconImageView;
        int i2 = iArr[type.ordinal()];
        if (i2 == 1) {
            u2 = tje.u(18, getContext());
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            u2 = tje.u(21, getContext());
        }
        xw31.y(u2, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setup$lambda$0(TariffLeadView tariffLeadView, MultiTariffOption$LeadIconType multiTariffOption$LeadIconType, ImageView imageView, Drawable drawable) {
        if (drawable != null) {
            tariffLeadView.setIcon(multiTariffOption$LeadIconType, drawable);
        } else {
            tariffLeadView.clearIcon();
        }
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        invalidateTextColor(this.textView);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final g18 setup(pav imageLoader, nco etaUiState, String iconUrl, MultiTariffOption$LeadIconType iconType) {
        setEtaUiState(etaUiState);
        if (iconUrl == null || evu0.J(iconUrl)) {
            clearIcon();
            return null;
        }
        this.iconImageView.setImageDrawable(null);
        return ((nac) imageLoader.f(new hex0(5, this, iconType), this.iconImageView)).c(iconUrl);
    }
}
