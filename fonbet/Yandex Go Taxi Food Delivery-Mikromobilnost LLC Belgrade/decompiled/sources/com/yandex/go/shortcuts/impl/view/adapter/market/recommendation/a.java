package com.yandex.go.shortcuts.impl.view.adapter.market.recommendation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.shortcuts.dto.response.Details;
import com.yandex.go.shortcuts.dto.response.InfoStackItem;
import com.yandex.go.shortcuts.dto.response.PriceStackItem;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.RatingStackItem;
import com.yandex.go.shortcuts.dto.response.RoundLabelThumbOverlay;
import com.yandex.go.shortcuts.dto.response.StickerThumbOverlay;
import com.yandex.go.shortcuts.dto.response.ThumbStackItem;
import com.yandex.go.shortcuts.dto.response.Title;
import com.yandex.go.shortcuts.dto.response.r2;
import com.yandex.go.shortcuts.dto.response.w2;
import com.yandex.go.shortcuts.impl.view.MarketRatingView;
import com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$ThumbStackView;
import defpackage.ays;
import defpackage.ba5;
import defpackage.e6g;
import defpackage.evu0;
import defpackage.ex00;
import defpackage.fx00;
import defpackage.hg;
import defpackage.i3y;
import defpackage.iog0;
import defpackage.ix00;
import defpackage.k200;
import defpackage.kdc;
import defpackage.kx31;
import defpackage.kz;
import defpackage.lhc;
import defpackage.lx00;
import defpackage.msy;
import defpackage.n190;
import defpackage.ooc;
import defpackage.qa0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r27;
import defpackage.rp31;
import defpackage.s5o;
import defpackage.s8o;
import defpackage.sls;
import defpackage.t4s0;
import defpackage.tls;
import defpackage.u7h0;
import defpackage.vbb;
import defpackage.vyt0;
import defpackage.x4e;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xw31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a extends kx31 {
    public static final List e0 = Collections.singletonList(new s5o(MarketRecommendationViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final c T;
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a U;
    public final ProductMode$Taxi.SectionType V;
    public final ays W;
    public final ConstraintLayout Z;
    public final LinearLayout a0;
    public final LinearLayout b0;
    public final vyt0 c0;
    public final n190 d0;

    public a(View view, t4s0 t4s0Var, lx00 lx00Var, e6g e6gVar, c cVar, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ProductMode$Taxi.SectionType sectionType, ays aysVar) {
        super(view, t4s0Var);
        this.T = cVar;
        this.U = aVar;
        this.V = sectionType;
        this.W = aysVar;
        int i = u7h0.background;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.Z = (ConstraintLayout) ((View) rp31.d(view, i));
        this.a0 = (LinearLayout) ((View) rp31.d(view, u7h0.top_stack));
        this.b0 = (LinearLayout) ((View) rp31.d(view, u7h0.bottom_stack));
        this.c0 = new vyt0(view.getContext(), lx00Var, e6gVar);
        this.d0 = new n190();
    }

    @Override // defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        g0(this.a0, this.b0);
    }

    @Override // defpackage.wys
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final void c(ex00 ex00Var) {
        c0(ex00Var);
        ProductMode$Taxi.SectionType sectionType = this.V;
        ProductMode$Taxi.SectionType sectionType2 = ProductMode$Taxi.SectionType.VERTICAL_STACK_SECTION;
        View view = this.a;
        if (sectionType == sectionType2) {
            x4e.y(-1, -1, view);
        }
        kdc kdcVar = ex00Var.h;
        if (kdcVar == null) {
            kdcVar = ba5.h;
        }
        int m = s8o.m(kdcVar, view.getContext());
        Drawable background = this.Z.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(m);
        }
        view.setOnClickListener(new fx00(0, this, ex00Var));
        hg.a(view);
        LinearLayout linearLayout = this.a0;
        LinearLayout linearLayout2 = linearLayout.getChildCount() != 0 ? linearLayout : null;
        if (linearLayout2 != null) {
            g0(linearLayout2);
        }
        LinearLayout linearLayout3 = this.b0;
        LinearLayout linearLayout4 = linearLayout3.getChildCount() != 0 ? linearLayout3 : null;
        if (linearLayout4 != null) {
            g0(linearLayout4);
        }
        ArrayList arrayList = ex00Var.i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View e02 = e0((r2) it.next());
            if (e02 != null) {
                arrayList2.add(e02);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            linearLayout.addView((View) it2.next());
        }
        ArrayList arrayList3 = ex00Var.j;
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            View e03 = e0((r2) it3.next());
            if (e03 != null) {
                arrayList4.add(e03);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            linearLayout3.addView((View) it4.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Type inference failed for: r0v55, types: [android.view.View, android.widget.TextView, com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$StickerLabel] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [android.widget.TextView, com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$RoundLabel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r8v13, types: [gx00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View e0(r2 r2Var) {
        int i;
        Iterator it;
        Iterator it2;
        StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView;
        i3y i3yVar;
        w2 w2Var;
        StackItemViewFactory$StickerLabel stackItemViewFactory$StickerLabel;
        StackItemViewFactory$StickerLabel stackItemViewFactory$StickerLabel2;
        ?? r2;
        boolean z = r2Var instanceof ThumbStackItem;
        View view = this.a;
        final vyt0 vyt0Var = this.c0;
        if (!z) {
            if (r2Var instanceof InfoStackItem) {
                InfoStackItem infoStackItem = (InfoStackItem) r2Var;
                View a = vyt0Var.b.a(qoi0.a(StackItemViewFactory$InfoTextView.class));
                if (!(a instanceof StackItemViewFactory$InfoTextView)) {
                    a = null;
                }
                RobotoTextView robotoTextView = (StackItemViewFactory$InfoTextView) a;
                if (robotoTextView == null) {
                    final Context context = vyt0Var.a;
                    robotoTextView = new RobotoTextView(context) { // from class: com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$InfoTextView
                    };
                    robotoTextView.setLayoutParams((ViewGroup.MarginLayoutParams) ((i3y) vyt0Var.c.r).getValue());
                }
                robotoTextView.setText((CharSequence) null);
                robotoTextView.setMaxLines(3);
                robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
                f0(infoStackItem.a, new msy(2, robotoTextView));
                return robotoTextView;
            }
            if (r2Var instanceof PriceStackItem) {
                PriceStackItem priceStackItem = (PriceStackItem) r2Var;
                View a2 = vyt0Var.b.a(qoi0.a(StackItemViewFactory$PriceTextView.class));
                if (!(a2 instanceof StackItemViewFactory$PriceTextView)) {
                    a2 = null;
                }
                RobotoTextView robotoTextView2 = (StackItemViewFactory$PriceTextView) a2;
                if (robotoTextView2 == null) {
                    final Context context2 = vyt0Var.a;
                    robotoTextView2 = new RobotoTextView(context2) { // from class: com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$PriceTextView
                    };
                    robotoTextView2.setLayoutParams((ViewGroup.MarginLayoutParams) ((i3y) vyt0Var.c.s).getValue());
                }
                robotoTextView2.setText((CharSequence) null);
                f0(priceStackItem.a, new msy(1, robotoTextView2));
                return robotoTextView2;
            }
            if (!(r2Var instanceof r27)) {
                if (!(r2Var instanceof RatingStackItem)) {
                    return null;
                }
                RatingStackItem ratingStackItem = (RatingStackItem) r2Var;
                View a3 = vyt0Var.b.a(qoi0.a(MarketRatingView.class));
                if (!(a3 instanceof MarketRatingView)) {
                    a3 = null;
                }
                final MarketRatingView marketRatingView = (MarketRatingView) a3;
                if (marketRatingView == null) {
                    marketRatingView = new MarketRatingView(vyt0Var.a);
                    marketRatingView.setLayoutParams((ViewGroup.MarginLayoutParams) ((i3y) vyt0Var.c.t).getValue());
                }
                final int i2 = 0;
                marketRatingView.setRating(0);
                marketRatingView.setMetaText(null);
                marketRatingView.setDetailsText(null);
                marketRatingView.setDetailsContentDescription(null);
                int i3 = ratingStackItem.b;
                Details details = ratingStackItem.c;
                marketRatingView.setRating(i3);
                f0(ratingStackItem.a, new tls() { // from class: hx00
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        zy11 zy11Var = zy11.a;
                        MarketRatingView marketRatingView2 = marketRatingView;
                        CharSequence charSequence = (CharSequence) obj;
                        switch (i4) {
                            case 0:
                                marketRatingView2.setMetaText(charSequence);
                                break;
                            default:
                                marketRatingView2.setDetailsText(charSequence);
                                break;
                        }
                        return zy11Var;
                    }
                });
                final int i4 = 1;
                f0(details.a, new tls() { // from class: hx00
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i42 = i4;
                        zy11 zy11Var = zy11.a;
                        MarketRatingView marketRatingView2 = marketRatingView;
                        CharSequence charSequence = (CharSequence) obj;
                        switch (i42) {
                            case 0:
                                marketRatingView2.setMetaText(charSequence);
                                break;
                            default:
                                marketRatingView2.setDetailsText(charSequence);
                                break;
                        }
                        return zy11Var;
                    }
                });
                marketRatingView.setDetailsContentDescription(details.b);
                return marketRatingView;
            }
            r27 r27Var = (r27) r2Var;
            e6g e6gVar = vyt0Var.c;
            View a4 = vyt0Var.b.a(qoi0.a(ButtonComponent.class));
            if (!(a4 instanceof ButtonComponent)) {
                a4 = null;
            }
            ButtonComponent buttonComponent = (ButtonComponent) a4;
            if (buttonComponent == null) {
                ButtonComponent buttonComponent2 = new ButtonComponent(vyt0Var.a, null, 0, 6, null);
                buttonComponent2.setRoundedCornersRadius(((Number) ((i3y) e6gVar.c).getValue()).intValue());
                buttonComponent2.setLayoutParams((ViewGroup.MarginLayoutParams) ((i3y) e6gVar.u).getValue());
                buttonComponent = buttonComponent2;
            }
            buttonComponent.setText((CharSequence) null);
            buttonComponent.setButtonBackground((kdc) null);
            f0(r27Var.f, new ix00(buttonComponent, 0));
            String str = r27Var.e;
            int c = ru.yandex.taxi.design.utils.c.c(xng0.controlMain, view);
            if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
                String upperCase = str.toUpperCase(Locale.US);
                if (upperCase.charAt(0) != '#') {
                    try {
                        c = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                try {
                    c = Color.parseColor(upperCase);
                } catch (IllegalArgumentException e) {
                    xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
                }
            }
            buttonComponent.setButtonBackground(c);
            buttonComponent.setOnClickListener(new fx00(1, this, r27Var));
            return buttonComponent;
        }
        ThumbStackItem thumbStackItem = (ThumbStackItem) r2Var;
        lx00 lx00Var = vyt0Var.b;
        e6g e6gVar2 = vyt0Var.c;
        i3y i3yVar2 = (i3y) e6gVar2.g;
        i3y i3yVar3 = (i3y) e6gVar2.h;
        i3y i3yVar4 = (i3y) e6gVar2.d;
        final Context context3 = vyt0Var.a;
        View a5 = lx00Var.a(qoi0.a(StackItemViewFactory$ThumbStackView.class));
        if (!(a5 instanceof StackItemViewFactory$ThumbStackView)) {
            a5 = null;
        }
        StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView2 = (StackItemViewFactory$ThumbStackView) a5;
        if (stackItemViewFactory$ThumbStackView2 == null) {
            stackItemViewFactory$ThumbStackView2 = new StackItemViewFactory$ThumbStackView(vyt0Var, context3);
        }
        final StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView3 = stackItemViewFactory$ThumbStackView2;
        stackItemViewFactory$ThumbStackView3.clear();
        String str2 = thumbStackItem.d;
        int c2 = ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, view);
        if (str2 != null && !evu0.J(str2)) {
            if (!str2.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
                i = c2;
                String upperCase2 = str2.toUpperCase(Locale.US);
                if (upperCase2.charAt(0) != '#') {
                    try {
                        c2 = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase2));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                try {
                    c2 = Color.parseColor(upperCase2);
                } catch (IllegalArgumentException e2) {
                    xby.d.k(e2, "Parsing color error, color = ".concat(upperCase2));
                }
            }
            stackItemViewFactory$ThumbStackView3.getImageView().setColorFilter(ooc.k(c2, BlendModeCompat.MODULATE));
            stackItemViewFactory$ThumbStackView3.getImageView().setRoundedBackgroundColor(c2);
            stackItemViewFactory$ThumbStackView3.getPlaceholderView().setShimmering(true);
            final int i5 = 0;
            stackItemViewFactory$ThumbStackView3.getPlaceholderView().setVisibility(0);
            final int i6 = 1;
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.U, stackItemViewFactory$ThumbStackView3.getImageView(), thumbStackItem.a, null, thumbStackItem.b, 0, null, new sls() { // from class: gx00
                @Override // defpackage.sls
                public final Object invoke() {
                    int i7 = i5;
                    zy11 zy11Var = zy11.a;
                    StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView4 = stackItemViewFactory$ThumbStackView3;
                    switch (i7) {
                        case 0:
                            stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                            stackItemViewFactory$ThumbStackView4.getPlaceholderView().setVisibility(8);
                            break;
                        default:
                            stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                            break;
                    }
                    return zy11Var;
                }
            }, new sls() { // from class: gx00
                @Override // defpackage.sls
                public final Object invoke() {
                    int i7 = i6;
                    zy11 zy11Var = zy11.a;
                    StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView4 = stackItemViewFactory$ThumbStackView3;
                    switch (i7) {
                        case 0:
                            stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                            stackItemViewFactory$ThumbStackView4.getPlaceholderView().setVisibility(8);
                            break;
                        default:
                            stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                            break;
                    }
                    return zy11Var;
                }
            }, 820));
            it = thumbStackItem.c.iterator();
            while (it.hasNext()) {
                w2 w2Var2 = (w2) it.next();
                if (w2Var2 instanceof RoundLabelThumbOverlay) {
                    RoundLabelThumbOverlay roundLabelThumbOverlay = (RoundLabelThumbOverlay) w2Var2;
                    View a6 = lx00Var.a(qoi0.a(StackItemViewFactory$RoundLabel.class));
                    it2 = it;
                    if (!(a6 instanceof StackItemViewFactory$RoundLabel)) {
                        a6 = null;
                    }
                    StackItemViewFactory$RoundLabel stackItemViewFactory$RoundLabel = (StackItemViewFactory$RoundLabel) a6;
                    if (stackItemViewFactory$RoundLabel == null) {
                        RobotoTextView robotoTextView3 = new RobotoTextView(context3) { // from class: com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$RoundLabel
                            public final void setRoundBackground(Integer color) {
                                if (color == null) {
                                    setBackground(null);
                                    return;
                                }
                                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                                shapeDrawable.getPaint().setColor(color.intValue());
                                setBackground(shapeDrawable);
                            }
                        };
                        robotoTextView3.setLayoutParams((ViewGroup.MarginLayoutParams) ((i3y) e6gVar2.v).getValue());
                        robotoTextView3.setWidth(((Number) i3yVar4.getValue()).intValue());
                        robotoTextView3.setHeight(((Number) i3yVar4.getValue()).intValue());
                        robotoTextView3.setGravity(17);
                        r2 = robotoTextView3;
                    } else {
                        r2 = stackItemViewFactory$RoundLabel;
                    }
                    r2.setText(null);
                    r2.setRoundBackground(null);
                    stackItemViewFactory$ThumbStackView = stackItemViewFactory$ThumbStackView3;
                    i3yVar = i3yVar2;
                    f0(roundLabelThumbOverlay.d, new k200(13, r2));
                    String str3 = roundLabelThumbOverlay.c;
                    int t = qje.t(iog0.colorAccent, view.getContext());
                    if (str3 != null && !evu0.J(str3) && !str3.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
                        String upperCase3 = str3.toUpperCase(Locale.US);
                        if (upperCase3.charAt(0) != '#') {
                            try {
                                t = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase3));
                            } catch (IllegalArgumentException unused3) {
                            }
                        }
                        try {
                            t = Color.parseColor(upperCase3);
                        } catch (IllegalArgumentException e3) {
                            xby.d.k(e3, "Parsing color error, color = ".concat(upperCase3));
                        }
                    }
                    r2.setRoundBackground(Integer.valueOf(t));
                    stackItemViewFactory$StickerLabel = r2;
                    w2Var = w2Var2;
                } else {
                    it2 = it;
                    stackItemViewFactory$ThumbStackView = stackItemViewFactory$ThumbStackView3;
                    i3yVar = i3yVar2;
                    if (w2Var2 instanceof StickerThumbOverlay) {
                        StickerThumbOverlay stickerThumbOverlay = (StickerThumbOverlay) w2Var2;
                        View a7 = lx00Var.a(qoi0.a(StackItemViewFactory$StickerLabel.class));
                        if (!(a7 instanceof StackItemViewFactory$StickerLabel)) {
                            a7 = null;
                        }
                        StackItemViewFactory$StickerLabel stackItemViewFactory$StickerLabel3 = (StackItemViewFactory$StickerLabel) a7;
                        if (stackItemViewFactory$StickerLabel3 == null) {
                            ?? r0 = new RobotoTextView(context3) { // from class: com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$StickerLabel
                                public final void setStickerColor(Integer color) {
                                    if (color == null) {
                                        setBackground(null);
                                        return;
                                    }
                                    int intValue = color.intValue();
                                    float floatValue = ((Number) ((i3y) vyt0.this.c.f).getValue()).floatValue();
                                    int argb = Color.argb((int) (Color.alpha(intValue) * 0.5f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
                                    vbb vbbVar = new vbb(intValue, floatValue);
                                    vbbVar.X(argb);
                                    vbbVar.Y(lhc.c(intValue) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0));
                                    setBackground((Drawable) vbbVar.b);
                                }
                            };
                            r0.setLayoutParams((ViewGroup.MarginLayoutParams) ((i3y) e6gVar2.w).getValue());
                            r0.setGravity(17);
                            w2Var = w2Var2;
                            r0.setPadding(((Number) i3yVar3.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar3.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
                            stackItemViewFactory$StickerLabel2 = r0;
                        } else {
                            w2Var = w2Var2;
                            stackItemViewFactory$StickerLabel2 = stackItemViewFactory$StickerLabel3;
                        }
                        StackItemViewFactory$StickerLabel stackItemViewFactory$StickerLabel4 = stackItemViewFactory$StickerLabel2;
                        stackItemViewFactory$StickerLabel4.setBackground(null);
                        stackItemViewFactory$StickerLabel4.setText((CharSequence) null);
                        String str4 = stickerThumbOverlay.c;
                        int t2 = qje.t(iog0.colorAccent, view.getContext());
                        if (str4 != null && !evu0.J(str4) && !str4.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
                            String upperCase4 = str4.toUpperCase(Locale.US);
                            if (upperCase4.charAt(0) != '#') {
                                try {
                                    t2 = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase4));
                                } catch (IllegalArgumentException unused4) {
                                }
                            }
                            try {
                                t2 = Color.parseColor(upperCase4);
                            } catch (IllegalArgumentException e4) {
                                xby.d.k(e4, "Parsing color error, color = ".concat(upperCase4));
                            }
                        }
                        stackItemViewFactory$StickerLabel4.setStickerColor(Integer.valueOf(t2));
                        f0(stickerThumbOverlay.d, new k200(14, stackItemViewFactory$StickerLabel4));
                        stackItemViewFactory$StickerLabel = stackItemViewFactory$StickerLabel4;
                    } else {
                        w2Var = w2Var2;
                        stackItemViewFactory$StickerLabel = null;
                    }
                }
                if (stackItemViewFactory$StickerLabel == null) {
                    return stackItemViewFactory$ThumbStackView;
                }
                n190 n190Var = this.d0;
                n190Var.getClass();
                stackItemViewFactory$ThumbStackView3 = stackItemViewFactory$ThumbStackView;
                OneShotPreDrawListener.add(stackItemViewFactory$ThumbStackView3, new kz(n190Var, stackItemViewFactory$ThumbStackView, stackItemViewFactory$StickerLabel, w2Var, 6));
                stackItemViewFactory$ThumbStackView3.addView(stackItemViewFactory$StickerLabel);
                it = it2;
                i3yVar2 = i3yVar;
            }
            return stackItemViewFactory$ThumbStackView3;
        }
        i = c2;
        c2 = i;
        stackItemViewFactory$ThumbStackView3.getImageView().setColorFilter(ooc.k(c2, BlendModeCompat.MODULATE));
        stackItemViewFactory$ThumbStackView3.getImageView().setRoundedBackgroundColor(c2);
        stackItemViewFactory$ThumbStackView3.getPlaceholderView().setShimmering(true);
        final int i52 = 0;
        stackItemViewFactory$ThumbStackView3.getPlaceholderView().setVisibility(0);
        final int i62 = 1;
        a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.U, stackItemViewFactory$ThumbStackView3.getImageView(), thumbStackItem.a, null, thumbStackItem.b, 0, null, new sls() { // from class: gx00
            @Override // defpackage.sls
            public final Object invoke() {
                int i7 = i52;
                zy11 zy11Var = zy11.a;
                StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView4 = stackItemViewFactory$ThumbStackView3;
                switch (i7) {
                    case 0:
                        stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                        stackItemViewFactory$ThumbStackView4.getPlaceholderView().setVisibility(8);
                        break;
                    default:
                        stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                        break;
                }
                return zy11Var;
            }
        }, new sls() { // from class: gx00
            @Override // defpackage.sls
            public final Object invoke() {
                int i7 = i62;
                zy11 zy11Var = zy11.a;
                StackItemViewFactory$ThumbStackView stackItemViewFactory$ThumbStackView4 = stackItemViewFactory$ThumbStackView3;
                switch (i7) {
                    case 0:
                        stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                        stackItemViewFactory$ThumbStackView4.getPlaceholderView().setVisibility(8);
                        break;
                    default:
                        stackItemViewFactory$ThumbStackView4.getPlaceholderView().setShimmering(false);
                        break;
                }
                return zy11Var;
            }
        }, 820));
        it = thumbStackItem.c.iterator();
        while (it.hasNext()) {
        }
        return stackItemViewFactory$ThumbStackView3;
    }

    public final void f0(Title title, tls tlsVar) {
        tlsVar.invoke(title.a);
        b0(new MarketRecommendationViewHolder$convertTitle$1(this, title, tlsVar, null));
    }

    public final void g0(ViewGroup... viewGroupArr) {
        for (ViewGroup viewGroup : viewGroupArr) {
            xw31.q(viewGroup, new qa0(10, this.c0));
            viewGroup.removeAllViewsInLayout();
        }
    }
}
