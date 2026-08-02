package com.ybsdk.feature.dashboard.internal.ui.dashboard3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.ybsdk.core.common.utils.theme.LateInitColorCallbackImpl;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.RadialGradientTextView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.byg0;
import defpackage.cma1;
import defpackage.dig;
import defpackage.dke;
import defpackage.dzh0;
import defpackage.enh0;
import defpackage.fig;
import defpackage.gig;
import defpackage.hig;
import defpackage.ic0;
import defpackage.ntr0;
import defpackage.ny61;
import defpackage.pha1;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.sls;
import defpackage.tls;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.vvg0;
import defpackage.wah0;
import defpackage.xty0;
import defpackage.z061;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J%\u0010\u000e\u001a\u00020\r*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u000e\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020\r2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u0002` ¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/view/DashboardCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/core/design/spoiler/SpoilerFrameLayout;", "Lgig;", ClidProvider.STATE, "Lzy11;", "setup", "(Lcom/ybsdk/core/design/spoiler/SpoilerFrameLayout;Lgig;)V", "Lcom/ybsdk/widgets/common/shimmer/ShimmerFrameLayout;", "Lfig;", ShimmerDivHandler.EXTENSION_ID, "(Lcom/ybsdk/widgets/common/shimmer/ShimmerFrameLayout;Lfig;)V", "Lcom/ybsdk/widgets/common/RadialGradientTextView;", "Landroid/widget/ImageView;", "balanceIcon", "Ldig;", "balanceState", "(Lcom/ybsdk/widgets/common/RadialGradientTextView;Landroid/widget/ImageView;Ldig;)V", "Lhig;", "setContentDescription", "(Lhig;)V", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "onDivAction", "(Ltls;)V", "Lkotlin/Function0;", "onCardStateChanged", "render", "(Lhig;Lsls;)V", "Lz061;", "binding", "Lz061;", "Lcom/ybsdk/core/utils/ColorModel;", "defaultShimmerColor", "Lcom/ybsdk/core/utils/ColorModel;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardCardView extends ConstraintLayout {
    private final z061 binding;
    private final ColorModel defaultShimmerColor;

    public DashboardCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(enh0.ybsdk_dashboard_card_view, this);
        int i2 = wah0.additionalBalanceIcon;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        if (imageView != null) {
            i2 = wah0.additionalBalanceText;
            RadialGradientTextView radialGradientTextView = (RadialGradientTextView) cma1.O(i2, this);
            if (radialGradientTextView != null) {
                i2 = wah0.background;
                ImageView imageView2 = (ImageView) cma1.O(i2, this);
                if (imageView2 != null) {
                    i2 = wah0.balanceIcon;
                    ImageView imageView3 = (ImageView) cma1.O(i2, this);
                    if (imageView3 != null) {
                        i2 = wah0.balanceShimmer;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i2, this);
                        if (shimmerFrameLayout != null) {
                            i2 = wah0.balanceSpoiler;
                            SpoilerFrameLayout spoilerFrameLayout = (SpoilerFrameLayout) cma1.O(i2, this);
                            if (spoilerFrameLayout != null) {
                                i2 = wah0.balanceText;
                                RadialGradientTextView radialGradientTextView2 = (RadialGradientTextView) cma1.O(i2, this);
                                if (radialGradientTextView2 != null) {
                                    i2 = wah0.divkitOverlay;
                                    YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
                                    if (ybDivView != null) {
                                        i2 = wah0.iconAfterTitle;
                                        ImageView imageView4 = (ImageView) cma1.O(i2, this);
                                        if (imageView4 != null) {
                                            i2 = wah0.title;
                                            TextView textView = (TextView) cma1.O(i2, this);
                                            if (textView != null) {
                                                i2 = wah0.titleIcon;
                                                ImageView imageView5 = (ImageView) cma1.O(i2, this);
                                                if (imageView5 != null) {
                                                    this.binding = new z061(this, imageView, radialGradientTextView, imageView2, imageView3, shimmerFrameLayout, spoilerFrameLayout, radialGradientTextView2, ybDivView, imageView4, textView, imageView5);
                                                    this.defaultShimmerColor = new ColorModel.LateInitColor(new LateInitColorCallbackImpl(ntr0.n, new ColorModel.Attr(ung0.ybColor_textIcon_primary)));
                                                    setBackgroundResource(byg0.ybsdk_dashboard_card_view_background);
                                                    setClipToOutline(true);
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
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$1$lambda$0(sls slsVar, boolean z) {
        slsVar.invoke();
        return zy11.a;
    }

    private final void setContentDescription(hig state) {
        this.binding.g.setSpoilerStateListener(new dke(13, state, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setContentDescription$lambda$2(hig higVar, DashboardCardView dashboardCardView, boolean z) {
        String str;
        CharSequence a = d.a(dashboardCardView.getContext(), higVar.b);
        if (z) {
            Context context = dashboardCardView.getContext();
            str = ((Object) a) + " " + (context != null ? context.getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : null);
        } else {
            str = ((Object) a) + " " + ((Object) d.a(dashboardCardView.getContext(), higVar.n.a));
        }
        dashboardCardView.setContentDescription(str);
        return zy11.a;
    }

    private final void setup(RadialGradientTextView radialGradientTextView, ImageView imageView, dig digVar) {
        radialGradientTextView.setVisibility(digVar != null ? 0 : 8);
        imageView.setVisibility((digVar != null ? digVar.c : null) != null ? 0 : 8);
        if (digVar == null) {
            return;
        }
        Text.Constant constant = digVar.a;
        xty0.d(radialGradientTextView, constant);
        xty0.e(radialGradientTextView, digVar.b);
        radialGradientTextView.setRadialGradient(digVar.d);
        radialGradientTextView.setVisibility(d.b(constant) ? 0 : 8);
        rbv rbvVar = digVar.c;
        if (rbvVar != null) {
            v4b1.k(rbvVar, imageView, null, null, 6);
        }
    }

    public final void onDivAction(tls handler) {
        this.binding.i.setActionHandler(handler);
    }

    public final void render(hig state, sls onCardStateChanged) {
        int i;
        rr51 rr51Var = state.m;
        pha1.b(this, state.l, state.k, byg0.ybsdk_dashboard_card_view_background, vvg0.ybsdk_product_card_corner_radius);
        z061 z061Var = this.binding;
        rbv rbvVar = state.j;
        ImageView imageView = z061Var.d;
        YbDivView ybDivView = z061Var.i;
        v4b1.k(rbvVar, imageView, new ic0(16, onCardStateChanged), null, 4);
        v4b1.k(state.d, z061Var.l, null, null, 6);
        TextView textView = z061Var.k;
        xty0.d(textView, state.b);
        xty0.e(textView, state.c);
        setup(z061Var.f, state.h);
        RadialGradientTextView radialGradientTextView = z061Var.h;
        ImageView imageView2 = z061Var.e;
        dig digVar = state.f;
        setup(radialGradientTextView, imageView2, digVar);
        RadialGradientTextView radialGradientTextView2 = z061Var.c;
        ImageView imageView3 = z061Var.b;
        dig digVar2 = state.g;
        setup(radialGradientTextView2, imageView3, digVar2);
        SpoilerFrameLayout spoilerFrameLayout = z061Var.g;
        setup(spoilerFrameLayout, state.i);
        spoilerFrameLayout.setVisibility((d.b(digVar.a) || (digVar2 != null && d.b(digVar2.a))) ? 0 : 8);
        ImageView imageView4 = z061Var.j;
        rbv rbvVar2 = state.e;
        if (rbvVar2 == null) {
            i = 8;
        } else {
            v4b1.k(rbvVar2, imageView4, null, null, 6);
            i = 0;
        }
        imageView4.setVisibility(i);
        ybDivView.setVisibility(rr51Var != null ? 0 : 8);
        if (rr51Var != null) {
            YbDivView.setData$default(ybDivView, rr51Var, null, null, false, 14, null);
        }
        setContentDescription(state);
    }

    private final void setup(ShimmerFrameLayout shimmerFrameLayout, fig figVar) {
        ColorModel colorModel = figVar.a;
        boolean z = figVar.b;
        if (colorModel == null) {
            colorModel = this.defaultShimmerColor;
        }
        shimmerFrameLayout.setColor(colorModel);
        shimmerFrameLayout.setHasTransientState(z);
        if (z) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
    }

    private final void setup(SpoilerFrameLayout spoilerFrameLayout, gig gigVar) {
        spoilerFrameLayout.setSpoilerHeight(gigVar.c);
        spoilerFrameLayout.setSpoilerWidth(gigVar.b);
        SpoilerFrameLayout.updateSpoilerState$default(spoilerFrameLayout, gigVar.a, false, 2, null);
    }

    public DashboardCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DashboardCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DashboardCardView(Context context) {
        this(context, null, 0, 6, null);
    }
}
