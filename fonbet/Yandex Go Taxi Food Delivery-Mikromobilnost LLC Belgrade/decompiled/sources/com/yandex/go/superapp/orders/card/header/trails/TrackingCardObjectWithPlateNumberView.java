package com.yandex.go.superapp.orders.card.header.trails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.an70;
import defpackage.c8h0;
import defpackage.cma1;
import defpackage.hic;
import defpackage.jl40;
import defpackage.lbm;
import defpackage.mkh0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.p61;
import defpackage.pav;
import defpackage.t301;
import defpackage.tje;
import defpackage.tm70;
import defpackage.um70;
import defpackage.vm70;
import defpackage.vng;
import defpackage.w511;
import defpackage.wm70;
import defpackage.xm70;
import defpackage.zm70;
import defpackage.zuc0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/trails/TrackingCardObjectWithPlateNumberView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Lpav;", "imageLoader", "Lhic;", "colorizedCarIconFactory", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Lpav;Lhic;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lxm70;", "objectImage", "sourceIndex", "Lzy11;", "renderObjectImage", "(Ljava/util/List;I)V", "Lan70;", "uiState", "render", "(Lan70;)V", "Lpav;", "Lhic;", "Lt301;", "binding", "Lt301;", "currentUiState", "Lan70;", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardObjectWithPlateNumberView extends GoFrameLayout {
    private final t301 binding;
    private final hic colorizedCarIconFactory;
    private an70 currentUiState;
    private final pav imageLoader;

    public TrackingCardObjectWithPlateNumberView(pav pavVar, hic hicVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.imageLoader = pavVar;
        this.colorizedCarIconFactory = hicVar;
        LayoutInflater.from(context).inflate(mkh0.tracking_card_header_trail_object_with_plate_number, this);
        int i2 = c8h0.object;
        GoImageView goImageView = (GoImageView) cma1.O(i2, this);
        if (goImageView != null) {
            i2 = c8h0.plate_number;
            TrackingCardPlateNumberView trackingCardPlateNumberView = (TrackingCardPlateNumberView) cma1.O(i2, this);
            if (trackingCardPlateNumberView != null) {
                this.binding = new t301(this, goImageView, trackingCardPlateNumberView);
                setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void renderObjectImage(List<? extends xm70> objectImage, int sourceIndex) {
        lbm a;
        xm70 xm70Var = (xm70) kotlin.collections.a.S(sourceIndex, objectImage);
        if (xm70Var instanceof tm70) {
            hic hicVar = this.colorizedCarIconFactory;
            if (hicVar != null) {
                ((ru.yandex.taxi.ui.orders.card.base.a) hicVar).a(this.binding.b, ((tm70) xm70Var).a);
                return;
            }
            return;
        }
        if (xm70Var instanceof um70) {
            this.binding.b.setImageDrawable(((um70) xm70Var).a);
            return;
        }
        if (xm70Var instanceof vm70) {
            this.binding.b.setImageDrawable(vng.t(((vm70) xm70Var).a, getContext()));
            return;
        }
        if (!(xm70Var instanceof wm70)) {
            if (xm70Var == null) {
                return;
            }
            w511.b();
            return;
        }
        pav pavVar = this.imageLoader;
        if (pavVar == null || (a = pavVar.a(this.binding.b)) == null) {
            return;
        }
        nac nacVar = (nac) a;
        nacVar.i = new p61(this, objectImage, sourceIndex, 10);
        nacVar.c(((wm70) xm70Var).a);
    }

    public static /* synthetic */ void renderObjectImage$default(TrackingCardObjectWithPlateNumberView trackingCardObjectWithPlateNumberView, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        trackingCardObjectWithPlateNumberView.renderObjectImage(list, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderObjectImage$lambda$0(TrackingCardObjectWithPlateNumberView trackingCardObjectWithPlateNumberView, List list, int i) {
        trackingCardObjectWithPlateNumberView.renderObjectImage(list, i + 1);
        return zy11.a;
    }

    public final void render(an70 uiState) {
        if (jl40.l(uiState, this.currentUiState)) {
            return;
        }
        this.currentUiState = uiState;
        List list = uiState.a;
        zuc0 zuc0Var = uiState.b;
        zm70 zm70Var = uiState.c;
        renderObjectImage$default(this, list, 0, 2, null);
        GoImageView goImageView = this.binding.b;
        int u = tje.u(zm70Var.a, goImageView.getContext());
        int u2 = tje.u(zm70Var.b, goImageView.getContext());
        if (goImageView.getWidth() != u || goImageView.getHeight() != u2) {
            c.D(u, u2, goImageView);
        }
        t301 t301Var = this.binding;
        if (zuc0Var == null) {
            ViewGroup.LayoutParams layoutParams = t301Var.b.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
            if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != 0) {
                GoImageView goImageView2 = this.binding.b;
                ViewGroup.LayoutParams layoutParams2 = goImageView2.getLayoutParams();
                if (layoutParams2 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, 0, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                    goImageView2.setLayoutParams(marginLayoutParams2);
                }
            }
            this.binding.c.setVisibility(8);
            return;
        }
        GoImageView goImageView3 = t301Var.b;
        int u3 = tje.u(zm70Var.c, goImageView3.getContext());
        ViewGroup.LayoutParams layoutParams3 = goImageView3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
        if ((marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0) != u3) {
            ViewGroup.LayoutParams layoutParams4 = goImageView3.getLayoutParams();
            if (layoutParams4 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, u3, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                goImageView3.setLayoutParams(marginLayoutParams4);
            }
        }
        TrackingCardPlateNumberView trackingCardPlateNumberView = this.binding.c;
        int u4 = tje.u(zm70Var.d, trackingCardPlateNumberView.getContext());
        ViewGroup.LayoutParams layoutParams5 = trackingCardPlateNumberView.getLayoutParams();
        if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd() : 0) != u4) {
            ViewGroup.LayoutParams layoutParams6 = trackingCardPlateNumberView.getLayoutParams();
            if (layoutParams6 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6;
            int marginStart = marginLayoutParams5.getMarginStart();
            int i = marginLayoutParams5.topMargin;
            int i2 = marginLayoutParams5.bottomMargin;
            marginLayoutParams5.setMarginStart(marginStart);
            marginLayoutParams5.topMargin = i;
            marginLayoutParams5.setMarginEnd(u4);
            marginLayoutParams5.bottomMargin = i2;
            trackingCardPlateNumberView.setLayoutParams(marginLayoutParams5);
        }
        trackingCardPlateNumberView.setVisibility(0);
        trackingCardPlateNumberView.render(zuc0Var);
    }

    public /* synthetic */ TrackingCardObjectWithPlateNumberView(pav pavVar, hic hicVar, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pavVar, hicVar, context, (i2 & 8) != 0 ? null : attributeSet, (i2 & 16) != 0 ? 0 : i);
    }
}
