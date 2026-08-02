package com.yandex.go.superapp.orders.card.header.leads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.c8h0;
import defpackage.cma1;
import defpackage.lbm;
import defpackage.mkh0;
import defpackage.mm70;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pxy0;
import defpackage.qbv;
import defpackage.sls;
import defpackage.tje;
import defpackage.u301;
import defpackage.zgz0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RoundedCornersImageView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/leads/TrackingCardImageWithOverlayImageView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lkotlin/Function0;", "", "outlineColor", "<init>", "(Landroid/content/Context;Lpav;Lsls;)V", "Lzy11;", "applyOutline", "()V", "onAttachedToWindow", "Lmm70;", "uiState", "render", "(Lmm70;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpav;", "Lsls;", "Lu301;", "binding", "Lu301;", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardImageWithOverlayImageView extends GoFrameLayout {
    private final u301 binding;
    private final pav imageLoader;
    private final sls outlineColor;

    public TrackingCardImageWithOverlayImageView(Context context, pav pavVar, sls slsVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.outlineColor = slsVar;
        LayoutInflater.from(context).inflate(mkh0.tracking_card_image_with_overlay_image, this);
        int i = c8h0.overlay_image;
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i, this);
        if (roundedCornersImageView != null) {
            i = c8h0.overlay_image_container;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, this);
            if (goFrameLayout != null) {
                i = c8h0.primary_image;
                RoundedCornersImageView roundedCornersImageView2 = (RoundedCornersImageView) cma1.O(i, this);
                if (roundedCornersImageView2 != null) {
                    this.binding = new u301(this, roundedCornersImageView, goFrameLayout, roundedCornersImageView2);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void applyOutline() {
        float[] fArr;
        GoFrameLayout goFrameLayout = this.binding.c;
        int intValue = ((Number) this.outlineColor.invoke()).intValue();
        float w = tje.w(12, getContext());
        if (w == 0.0f || Float.isNaN(w) || Float.isInfinite(w)) {
            fArr = null;
        } else {
            fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = w;
            }
        }
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setColor(intValue);
        goFrameLayout.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$0(TrackingCardImageWithOverlayImageView trackingCardImageWithOverlayImageView, Drawable drawable) {
        trackingCardImageWithOverlayImageView.binding.c.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$1(TrackingCardImageWithOverlayImageView trackingCardImageWithOverlayImageView) {
        trackingCardImageWithOverlayImageView.binding.c.setVisibility(8);
        return zy11.a;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyOutline();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int u = tje.u(40, getContext());
        c.D(u, u, this);
        applyOutline();
    }

    public final void render(mm70 uiState) {
        lbm a;
        lbm a2;
        pav pavVar = this.imageLoader;
        if (pavVar != null && (a2 = pavVar.a(this.binding.d)) != null) {
            ((nac) a2).b(new qbv(uiState.a));
        }
        pav pavVar2 = this.imageLoader;
        if (pavVar2 == null || (a = pavVar2.a(this.binding.b)) == null) {
            return;
        }
        nac nacVar = (nac) a;
        nacVar.h = new pxy0(15, this);
        nacVar.i = new zgz0(14, this);
        nacVar.b(new qbv(uiState.b));
    }
}
