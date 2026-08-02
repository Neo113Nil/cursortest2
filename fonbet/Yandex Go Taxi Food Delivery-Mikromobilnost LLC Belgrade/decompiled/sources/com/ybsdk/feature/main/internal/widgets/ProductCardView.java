package com.ybsdk.feature.main.internal.widgets;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.NfcCardBadgeView;
import com.ybsdk.widgets.common.RadialGradientTextView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.cg91;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.ebh0;
import defpackage.eyg0;
import defpackage.fx00;
import defpackage.i461;
import defpackage.i7f0;
import defpackage.j7f0;
import defpackage.jiu;
import defpackage.k7f0;
import defpackage.kp50;
import defpackage.l7f0;
import defpackage.li91;
import defpackage.m7f0;
import defpackage.mnh0;
import defpackage.n7f0;
import defpackage.ny61;
import defpackage.ok31;
import defpackage.pha1;
import defpackage.rbv;
import defpackage.rje;
import defpackage.rr51;
import defpackage.rs5;
import defpackage.rtu;
import defpackage.scc;
import defpackage.smg0;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.vvg0;
import defpackage.xty0;
import defpackage.y760;
import defpackage.z2v0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002\u00170B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J!\u0010\"\u001a\u00020\r2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0 ¢\u0006\u0004\b\"\u0010#J%\u0010(\u001a\u00020\r2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0 j\u0002`&¢\u0006\u0004\b(\u0010#J\u0015\u0010)\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b)\u0010\u0019R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/feature/main/internal/widgets/ProductCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lrbv;", "icons", "Lzy11;", "setupIcons", "(Ljava/util/List;)V", "Landroid/widget/ImageView;", "newIconView", "(Landroid/content/Context;)Landroid/widget/ImageView;", "Lm7f0;", ClidProvider.STATE, "setupShimmer", "(Lm7f0;)V", "Ln7f0;", "setupSpoiler", "(Ln7f0;)V", "Lcom/ybsdk/widgets/common/RadialGradientTextView;", "subtitle", "subtitleIcon", "setupSubtitle", "(Lcom/ybsdk/widgets/common/RadialGradientTextView;Landroid/widget/ImageView;Lm7f0;)V", "setAccessibilityState", "Lkotlin/Function1;", "listener", "setOnProductActionClickListener", "(Ltls;)V", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "actionHandler", "setActionHandler", "render", "Li461;", "binding", "Li461;", "currentState", "Ln7f0;", "Companion", "i7f0", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductCardView extends ConstraintLayout {
    private final i461 binding;
    private n7f0 currentState;
    private static final i7f0 Companion = new i7f0();
    private static final int CONTACTLESS_PAYMENT_STATUS = dzh0.ybsdk_settings_contactless_payment_status;

    public ProductCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(mnh0.ybsdk_product_card_view, this);
        int i2 = ebh0.backgroundImageNewStack;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = ebh0.caption;
            YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
            if (ybDivView != null) {
                i2 = ebh0.divRightPart;
                YbDivView ybDivView2 = (YbDivView) cma1.O(i2, this);
                if (ybDivView2 != null) {
                    i2 = ebh0.iconAfterTitle;
                    ImageView imageView2 = (ImageView) cma1.O(i2, this);
                    if (imageView2 != null) {
                        i2 = ebh0.iconsContainer;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
                        if (linearLayout != null) {
                            i2 = ebh0.nfcCardBadge;
                            NfcCardBadgeView nfcCardBadgeView = (NfcCardBadgeView) cma1.O(i2, this);
                            if (nfcCardBadgeView != null) {
                                i2 = ebh0.rightPart;
                                if (((LinearLayout) cma1.O(i2, this)) != null) {
                                    i2 = ebh0.subtitle;
                                    RadialGradientTextView radialGradientTextView = (RadialGradientTextView) cma1.O(i2, this);
                                    if (radialGradientTextView != null) {
                                        i2 = ebh0.subtitleIcon;
                                        ImageView imageView3 = (ImageView) cma1.O(i2, this);
                                        if (imageView3 != null) {
                                            i2 = ebh0.subtitleMini;
                                            RadialGradientTextView radialGradientTextView2 = (RadialGradientTextView) cma1.O(i2, this);
                                            if (radialGradientTextView2 != null) {
                                                i2 = ebh0.subtitleMiniIcon;
                                                ImageView imageView4 = (ImageView) cma1.O(i2, this);
                                                if (imageView4 != null) {
                                                    i2 = ebh0.subtitleShimmerLayout;
                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i2, this);
                                                    if (shimmerFrameLayout != null) {
                                                        i2 = ebh0.subtitleSpoiler;
                                                        SpoilerFrameLayout spoilerFrameLayout = (SpoilerFrameLayout) cma1.O(i2, this);
                                                        if (spoilerFrameLayout != null) {
                                                            i2 = ebh0.title;
                                                            TextView textView = (TextView) cma1.O(i2, this);
                                                            if (textView != null) {
                                                                this.binding = new i461(this, imageView, ybDivView, ybDivView2, imageView2, linearLayout, nfcCardBadgeView, radialGradientTextView, imageView3, radialGradientTextView2, imageView4, shimmerFrameLayout, spoilerFrameLayout, textView);
                                                                setBackgroundResource(eyg0.ybsdk_product_card_view_background);
                                                                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_transition_y_animator));
                                                                setClickable(true);
                                                                setFocusable(true);
                                                                setImportantForAccessibility(1);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final ImageView newIconView(Context context) {
        ImageView imageView = new ImageView(context);
        int d = rje.d(vvg0.ybsdk_product_card_icon_size, context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(d, d));
        imageView.setImportantForAccessibility(2);
        return imageView;
    }

    private final void setAccessibilityState(n7f0 state) {
        CharSequence charSequence;
        String string;
        Text text;
        CharSequence a;
        String obj;
        Text text2;
        i461 i461Var = this.binding;
        Context context = getContext();
        Spannable spannable = null;
        String string2 = context != null ? context.getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : null;
        j7f0 j7f0Var = state.o;
        m7f0 m7f0Var = state.q;
        m7f0 m7f0Var2 = state.p;
        CharSequence a2 = (j7f0Var == null || (text2 = j7f0Var.a) == null) ? null : d.a(getContext(), text2);
        CharSequence a3 = m7f0Var2 != null ? d.a(getContext(), m7f0Var2.a) : null;
        CharSequence a4 = m7f0Var != null ? d.a(getContext(), m7f0Var.a) : null;
        ProductCardView$State$SubtitleType productCardView$State$SubtitleType = m7f0Var2 != null ? m7f0Var2.h : null;
        ProductCardView$State$SubtitleType productCardView$State$SubtitleType2 = m7f0Var != null ? m7f0Var.h : null;
        ProductCardView$State$SubtitleType productCardView$State$SubtitleType3 = ProductCardView$State$SubtitleType.ULTRA;
        if (productCardView$State$SubtitleType == productCardView$State$SubtitleType3 && productCardView$State$SubtitleType2 == ProductCardView$State$SubtitleType.DEFAULT) {
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(dzh0.ybsdk_settings_product_card_amount_ultra_a11y, a4, a3);
                a3 = string;
            }
            a3 = null;
        } else if (productCardView$State$SubtitleType == ProductCardView$State$SubtitleType.DEFAULT && productCardView$State$SubtitleType2 == productCardView$State$SubtitleType3) {
            Context context3 = getContext();
            if (context3 != null) {
                string = context3.getString(dzh0.ybsdk_settings_product_card_amount_ultra_a11y, a3, a4);
                a3 = string;
            }
            a3 = null;
        } else if (a3 != null && a4 != null) {
            a3 = ((Object) a3) + " " + ((Object) a4);
        } else if (a3 == null) {
            charSequence = a4;
            text = state.f;
            if (text != null && (a = d.a(getContext(), text)) != null && (obj = a.toString()) != null) {
                spannable = rtu.a(new jiu(6), obj);
            }
            this.binding.m.setSpoilerStateListener(new rs5(i461Var, spannable, string2, a2, charSequence, state, this));
        }
        charSequence = a3;
        text = state.f;
        if (text != null) {
            spannable = rtu.a(new jiu(6), obj);
        }
        this.binding.m.setSpoilerStateListener(new rs5(i461Var, spannable, string2, a2, charSequence, state, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setAccessibilityState$lambda$14$lambda$13$lambda$12(i461 i461Var, Spanned spanned, String str, CharSequence charSequence, CharSequence charSequence2, n7f0 n7f0Var, ProductCardView productCardView, boolean z) {
        String str2;
        ProductCardView productCardView2 = i461Var.a;
        String str3 = "";
        if (z) {
            if (str == null) {
                str = "";
            }
            str2 = ((Object) spanned) + " " + str;
        } else {
            if (charSequence == null) {
                charSequence = charSequence2 == null ? "" : charSequence2;
            }
            str2 = ((Object) spanned) + " " + ((Object) charSequence);
        }
        y760 y760Var = n7f0Var.m;
        if ((y760Var != null ? y760Var.c : null) != null) {
            str3 = " " + productCardView.getResources().getString(CONTACTLESS_PAYMENT_STATUS) + " - " + ((Object) d.a(productCardView.getContext(), n7f0Var.m.c));
        }
        productCardView2.setContentDescription(str2.concat(str3));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnProductActionClickListener$lambda$0(ProductCardView productCardView, tls tlsVar, View view) {
        cg91.c(productCardView, ok31.c);
        n7f0 n7f0Var = productCardView.currentState;
        if (n7f0Var != null) {
            tlsVar.invoke(n7f0Var);
        }
    }

    private final void setupIcons(List<? extends rbv> icons) {
        LinearLayout linearLayout = this.binding.f;
        int i = 0;
        linearLayout.setVisibility(!icons.isEmpty() ? 0 : 8);
        if (icons.isEmpty()) {
            linearLayout.removeAllViews();
            return;
        }
        if (linearLayout.getChildCount() != icons.size()) {
            linearLayout.removeAllViews();
            for (rbv rbvVar : icons) {
                linearLayout.addView(newIconView(getContext()));
            }
        }
        for (Object obj : icons) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            rbv rbvVar2 = (rbv) obj;
            View childAt = linearLayout.getChildAt(i);
            ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
            if (imageView != null) {
                v4b1.k(rbvVar2, imageView, null, null, 6);
            }
            i = i2;
        }
    }

    private final void setupShimmer(m7f0 state) {
        ShimmerFrameLayout shimmerFrameLayout = this.binding.l;
        shimmerFrameLayout.setVisibility(state != null ? 0 : 8);
        if (state == null || !state.d) {
            return;
        }
        shimmerFrameLayout.setColor(state.e);
        shimmerFrameLayout.playShimmer(2);
    }

    private final void setupSpoiler(n7f0 state) {
        SpoilerFrameLayout spoilerFrameLayout = this.binding.m;
        m7f0 m7f0Var = state.p;
        k7f0 k7f0Var = state.l;
        spoilerFrameLayout.setVisibility(m7f0Var != null ? 0 : 8);
        if (state.p == null) {
            return;
        }
        Integer num = k7f0Var.c;
        Integer valueOf = num != null ? Integer.valueOf(kp50.r(num.intValue())) : null;
        Integer num2 = k7f0Var.b;
        Integer valueOf2 = num2 != null ? Integer.valueOf(kp50.r(num2.intValue())) : null;
        spoilerFrameLayout.setSpoilerHeight(valueOf2 != null ? valueOf2.intValue() : rje.d(vvg0.ybsdk_product_card_balance_spoiler_height, getContext()));
        spoilerFrameLayout.setSpoilerWidth(valueOf != null ? valueOf.intValue() : rje.d(vvg0.ybsdk_product_card_balance_spoiler_width, getContext()));
        SpoilerFrameLayout.updateSpoilerState$default(spoilerFrameLayout, k7f0Var.a, false, 2, null);
    }

    private final void setupSubtitle(RadialGradientTextView subtitle, ImageView subtitleIcon, m7f0 state) {
        subtitle.setVisibility(state == null ? 4 : 0);
        subtitleIcon.setVisibility((state != null ? state.f : null) != null ? 0 : 4);
        if (state == null) {
            return;
        }
        v4b1.k(state.f, subtitleIcon, null, null, 6);
        subtitle.setTextAppearance(state.c);
        xty0.c(subtitle, state.a, new z2v0(getContext(), 6), null, 24);
        xty0.e(subtitle, state.b);
        subtitle.setRadialGradient(state.g);
    }

    public final void render(n7f0 state) {
        int i;
        rr51 rr51Var = state.t;
        m7f0 m7f0Var = state.p;
        l7f0 l7f0Var = state.r;
        i461 i461Var = this.binding;
        String str = state.b;
        if (str != null) {
            li91.j(this, str);
        }
        pha1.b(this, state.j, state.h, eyg0.ybsdk_product_card_view_background, vvg0.ybsdk_product_card_corner_radius);
        rbv rbvVar = state.i;
        int i2 = 6;
        if (rbvVar != null) {
            ImageView imageView = i461Var.b;
            imageView.setClipToOutline(true);
            v4b1.k(rbvVar, imageView, null, null, 6);
            imageView.setVisibility(0);
        } else {
            i461Var.b.setVisibility(8);
        }
        setupIcons(state.g);
        TextView textView = i461Var.n;
        YbDivView ybDivView = i461Var.c;
        YbDivView ybDivView2 = i461Var.d;
        xty0.c(textView, state.d, new z2v0(getContext(), i2), null, 24);
        xty0.e(i461Var.n, state.e);
        ybDivView2.setVisibility(l7f0Var != null ? 0 : 8);
        setupShimmer(m7f0Var);
        setupSpoiler(state);
        setupSubtitle(i461Var.h, i461Var.i, m7f0Var);
        setupSubtitle(i461Var.j, i461Var.k, state.q);
        if (l7f0Var != null) {
            YbDivView.setData$default(ybDivView2, l7f0Var.a, null, null, false, 14, null);
            ybDivView2.updateLocalVariables(l7f0Var.b);
        }
        ImageView imageView2 = i461Var.e;
        rbv rbvVar2 = state.n;
        if (rbvVar2 == null) {
            i = 8;
        } else {
            v4b1.k(rbvVar2, imageView2, null, null, 6);
            i = 0;
        }
        imageView2.setVisibility(i);
        setAccessibilityState(state);
        i461Var.g.render(state.m);
        ybDivView.setVisibility(rr51Var != null ? 0 : 8);
        if (rr51Var != null) {
            YbDivView.setData$default(ybDivView, rr51Var, null, null, false, 14, null);
        }
        this.currentState = state;
    }

    public final void setActionHandler(tls actionHandler) {
        this.binding.d.setActionHandler(actionHandler);
        this.binding.c.setActionHandler(actionHandler);
    }

    public final void setOnProductActionClickListener(tls listener) {
        setOnClickListener(new fx00(26, this, listener));
    }

    public ProductCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ProductCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ProductCardView(Context context) {
        this(context, null, 0, 6, null);
    }
}
