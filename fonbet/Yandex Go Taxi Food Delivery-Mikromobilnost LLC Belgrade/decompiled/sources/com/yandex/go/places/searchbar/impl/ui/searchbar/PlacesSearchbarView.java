package com.yandex.go.places.searchbar.impl.ui.searchbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aog0;
import defpackage.bfc0;
import defpackage.cma1;
import defpackage.dfc0;
import defpackage.dn60;
import defpackage.efc0;
import defpackage.ei;
import defpackage.h3h0;
import defpackage.k1y;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qje;
import defpackage.r6h0;
import defpackage.tls;
import defpackage.vng;
import defpackage.wuh0;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u000245B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/yandex/go/places/searchbar/impl/ui/searchbar/PlacesSearchbarView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ldfc0;", "dimens", "Lkotlin/Function1;", "Lfr;", "Lzy11;", "actionHandler", "<init>", "(Landroid/content/Context;Lpav;Ldfc0;Ltls;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpav;", "Ldfc0;", "Ltls;", "Lbfc0;", "colors", "Lbfc0;", "getColors$impl", "()Lbfc0;", "Lk1y;", "binding", "Lk1y;", "getBinding$impl", "()Lk1y;", "Lcom/yandex/go/places/searchbar/impl/ui/searchbar/PlacesSearchbarViewTouchDelegate;", "containerTouchDelegate", "Lcom/yandex/go/places/searchbar/impl/ui/searchbar/PlacesSearchbarViewTouchDelegate;", "getContainerTouchDelegate$impl", "()Lcom/yandex/go/places/searchbar/impl/ui/searchbar/PlacesSearchbarViewTouchDelegate;", "Lefc0;", "drawDelegate", "Lefc0;", "getDrawDelegate$impl", "()Lefc0;", "afc0", "zec0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesSearchbarView extends GoFrameLayout {
    private final tls actionHandler;
    private final k1y binding;
    private final bfc0 colors;
    private final PlacesSearchbarViewTouchDelegate containerTouchDelegate;
    private final dfc0 dimens;
    private final efc0 drawDelegate;
    private final pav imageLoader;

    public PlacesSearchbarView(Context context, pav pavVar, dfc0 dfc0Var, tls tlsVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.dimens = dfc0Var;
        this.actionHandler = tlsVar;
        this.colors = new bfc0(context);
        LayoutInflater.from(context).inflate(wuh0.layout_places_searchbar, this);
        int i = r6h0.collapsed_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = r6h0.expanded_content;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
            if (goLinearLayout != null) {
                i = r6h0.lead_button;
                GoImageView goImageView2 = (GoImageView) cma1.O(i, this);
                if (goImageView2 != null) {
                    i = r6h0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                    if (robotoTextView != null) {
                        k1y k1yVar = new k1y(this, goImageView, goLinearLayout, goImageView2, robotoTextView);
                        this.binding = k1yVar;
                        this.containerTouchDelegate = new PlacesSearchbarViewTouchDelegate(this, k1yVar, dfc0Var);
                        this.drawDelegate = new efc0(context);
                        setForeground(vng.t(h3h0.ripple_places_searchbar, getContext()));
                        setOutlineProvider(null);
                        setWillNotDraw(false);
                        b.p(this, new ei(14));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        bfc0 bfc0Var = this.colors;
        bfc0Var.b = new dn60(qje.t(aog0.placesSearchbarShadowExpandedColor, bfc0Var.a), 10, (byte) 0);
        efc0 efc0Var = this.drawDelegate;
        Paint paint = efc0Var.e;
        Context context = efc0Var.a;
        paint.setColor(qje.u(context.getTheme(), xng0.bgFloating));
        invalidate();
    }

    /* renamed from: getBinding$impl, reason: from getter */
    public final k1y getBinding() {
        return this.binding;
    }

    /* renamed from: getColors$impl, reason: from getter */
    public final bfc0 getColors() {
        return this.colors;
    }

    /* renamed from: getContainerTouchDelegate$impl, reason: from getter */
    public final PlacesSearchbarViewTouchDelegate getContainerTouchDelegate() {
        return this.containerTouchDelegate;
    }

    /* renamed from: getDrawDelegate$impl, reason: from getter */
    public final efc0 getDrawDelegate() {
        return this.drawDelegate;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        efc0 efc0Var = this.drawDelegate;
        RectF rectF = efc0Var.c;
        float f = efc0Var.b;
        canvas.drawRoundRect(rectF, f, f, efc0Var.e);
        canvas.clipPath(efc0Var.d);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.containerTouchDelegate.onSizeChanged();
    }
}
