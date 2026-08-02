package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.evu0;
import defpackage.g18;
import defpackage.j8h0;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.oxe0;
import defpackage.pav;
import defpackage.pdc;
import defpackage.qje;
import defpackage.qlf0;
import defpackage.s8o;
import defpackage.tkh0;
import defpackage.tp11;
import defpackage.tug0;
import defpackage.ufu;
import defpackage.uhw;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardPromoBannerView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lpdc;", "colorConverter", "<init>", "(Landroid/content/Context;Lpav;Lk7x0;Lpdc;)V", "Lzy11;", "updateTextColor", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "", "title", "setTitle", "(Ljava/lang/String;)V", "subtitle", "setSubtitle", "hexColor", "setBackground", "iconTag", "setIcon", "Lpav;", "Lk7x0;", "Lpdc;", "Luhw;", "binding", "Luhw;", "Lqlf0;", "promoBannerViewLineCountHandler", "Lqlf0;", "Lg18;", "imageLoadCancellable", "Lg18;", "backgroundHexColor", "Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardPromoBannerView extends GoFrameLayout {
    private String backgroundHexColor;
    private final uhw binding;
    private final pdc colorConverter;
    private g18 imageLoadCancellable;
    private final pav imageLoader;
    private final qlf0 promoBannerViewLineCountHandler;
    private final k7x0 tagUrlFormatter;

    public IntercityDashboardPromoBannerView(Context context, pav pavVar, k7x0 k7x0Var, pdc pdcVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.colorConverter = pdcVar;
        LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_promo_banner_view, this);
        int i = j8h0.subtitle;
        TextView textView = (TextView) cma1.O(i, this);
        if (textView != null) {
            i = j8h0.text_container;
            if (((LinearLayout) cma1.O(i, this)) != null) {
                i = j8h0.title;
                TextView textView2 = (TextView) cma1.O(i, this);
                if (textView2 != null) {
                    i = j8h0.trail_icon;
                    ImageView imageView = (ImageView) cma1.O(i, this);
                    if (imageView != null) {
                        this.binding = new uhw(this, textView, textView2, imageView);
                        this.promoBannerViewLineCountHandler = new qlf0(textView2, textView);
                        this.imageLoadCancellable = g18.u1;
                        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        tp11.b(3, textView2);
                        tp11.b(0, textView);
                        cvw.a0(getResources().getDimensionPixelSize(tug0.promo_banner_corner_radius), this);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void updateTextColor() {
        int t = qje.t(xng0.textMain, getContext());
        this.binding.c.setTextColor(t);
        this.binding.b.setTextColor(t);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackground(this.backgroundHexColor);
        if (this.binding.d.getTag() != null) {
            Object tag = this.binding.d.getTag();
            if (tag == null) {
                ny61.g("Required value was null.");
                return;
            }
            setIcon((String) tag);
        }
        updateTextColor();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackground(this.backgroundHexColor);
        if (this.binding.d.getTag() != null) {
            Object tag = this.binding.d.getTag();
            if (tag == null) {
                ny61.g("Required value was null.");
                return;
            }
            setIcon((String) tag);
        }
        updateTextColor();
    }

    public final void setBackground(String hexColor) {
        this.backgroundHexColor = hexColor;
        kdc b = ((ufu) this.colorConverter).b(hexColor);
        setBackgroundColor(b != null ? s8o.m(b, getContext()) : qje.t(xng0.bgMinor, getContext()));
    }

    public final void setIcon(String iconTag) {
        ImageView imageView = this.binding.d;
        if (evu0.J(iconTag)) {
            imageView.setImageDrawable(null);
            imageView.setTag(null);
        } else {
            String a = ((m7x0) this.tagUrlFormatter).a(iconTag);
            this.imageLoadCancellable.cancel();
            this.imageLoadCancellable = ((nac) this.imageLoader.a(this.binding.d)).c(a);
            imageView.setTag(iconTag);
        }
    }

    public final void setSubtitle(String subtitle) {
        this.binding.b.setText(subtitle);
        this.binding.b.setVisibility(subtitle.length() > 0 ? 0 : 8);
    }

    public final void setTitle(String title) {
        this.binding.c.setText(title);
        qlf0 qlf0Var = this.promoBannerViewLineCountHandler;
        qlf0Var.a.post(new oxe0(8, qlf0Var));
    }
}
