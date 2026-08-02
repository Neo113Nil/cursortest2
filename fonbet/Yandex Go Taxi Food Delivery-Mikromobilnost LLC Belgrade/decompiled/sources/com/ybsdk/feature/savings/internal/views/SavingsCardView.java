package com.ybsdk.feature.savings.internal.views;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.design.spoiler.SpoilerFrameLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.savings.internal.entities.SavingProductType;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;
import com.ybsdk.widgets.common.YbSdkScalableTextView;
import defpackage.aam0;
import defpackage.ab61;
import defpackage.cma1;
import defpackage.doh0;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.iwg0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.job1;
import defpackage.jr;
import defpackage.kp50;
import defpackage.lia1;
import defpackage.ny61;
import defpackage.rje;
import defpackage.rr51;
import defpackage.sm91;
import defpackage.tai0;
import defpackage.tbh0;
import defpackage.v4b1;
import defpackage.vxj0;
import defpackage.w511;
import defpackage.y9m0;
import defpackage.z2m0;
import defpackage.z9m0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u0004\u0018\u00010&*\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010$J\u0015\u0010*\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R>\u00107\u001a\u001e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/ybsdk/feature/savings/internal/views/SavingsCardView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Laam0;", ClidProvider.STATE, "Lcom/ybsdk/feature/savings/internal/entities/SavingProductType;", "getSavingsProductType", "(Laam0;)Lcom/ybsdk/feature/savings/internal/entities/SavingProductType;", "Lzy11;", "setChildrenVisibility", "(Laam0;)V", "Ly9m0;", "renderBalanceState", "(Ly9m0;)V", "", "isSpoilerVisible", "updateAccessibility", "(Laam0;Z)V", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "backgroundImageUrl", "fallbackColor", "Lcom/ybsdk/widgets/common/ImageScaleTypeEntity;", "backgroundImageScaleType", "setBackgroundImage", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;ILcom/ybsdk/widgets/common/ImageScaleTypeEntity;)V", "setAccessibilityBalance", "(Ly9m0;Z)V", "Lz9m0;", "setAccessibilityImage", "(Lz9m0;)V", "Lcom/ybsdk/core/utils/text/Text;", "", "toAccessibilityText", "(Lcom/ybsdk/core/utils/text/Text;)Ljava/lang/String;", "renderImageState", "render", "getImportantForAccessibility", "()I", "Lz2m0;", "fetcher", "setBackgroundFetcher", "(Lz2m0;)V", "Lab61;", "binding", "Lab61;", "Lkotlin/Function3;", "Ljr;", "Lcom/ybsdk/feature/savings/internal/entities/CellType;", "clickListener", "Lzls;", "getClickListener", "()Lzls;", "setClickListener", "(Lzls;)V", "backgroundFetcher", "Lz2m0;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsCardView extends CardView {
    private z2m0 backgroundFetcher;
    private final ab61 binding;
    private zls clickListener;

    public SavingsCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(doh0.ybsdk_widget_savings_card_layout, this);
        int i2 = tbh0.balance;
        YbSdkScalableTextView ybSdkScalableTextView = (YbSdkScalableTextView) cma1.O(i2, this);
        if (ybSdkScalableTextView != null) {
            i2 = tbh0.balanceDescription;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = tbh0.divSubtitleView;
                YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
                if (ybDivView != null) {
                    i2 = tbh0.label;
                    TextView textView2 = (TextView) cma1.O(i2, this);
                    if (textView2 != null) {
                        i2 = tbh0.savingsCardImageBackground;
                        ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes = (ImageViewWithCustomScaleTypes) cma1.O(i2, this);
                        if (imageViewWithCustomScaleTypes != null) {
                            i2 = tbh0.savingsCellImage;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                            if (appCompatImageView != null) {
                                i2 = tbh0.savingsImageText;
                                TextView textView3 = (TextView) cma1.O(i2, this);
                                if (textView3 != null) {
                                    i2 = tbh0.savingsItemWidgetContainer;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i2, this);
                                    if (constraintLayout != null) {
                                        i2 = tbh0.spoilerBalance;
                                        SpoilerFrameLayout spoilerFrameLayout = (SpoilerFrameLayout) cma1.O(i2, this);
                                        if (spoilerFrameLayout != null) {
                                            i2 = tbh0.subtitle;
                                            TextView textView4 = (TextView) cma1.O(i2, this);
                                            if (textView4 != null) {
                                                i2 = tbh0.textBadgeBubble;
                                                SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
                                                if (spoilerTextView != null) {
                                                    this.binding = new ab61(this, ybSdkScalableTextView, textView, ybDivView, textView2, imageViewWithCustomScaleTypes, appCompatImageView, textView3, constraintLayout, spoilerFrameLayout, textView4, spoilerTextView);
                                                    setRadius(rje.d(iwg0.ybsdk_card_radius_account_cell, context));
                                                    setCardElevation(0.0f);
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

    private final SavingProductType getSavingsProductType(aam0 state) {
        y9m0 y9m0Var = state instanceof y9m0 ? (y9m0) state : null;
        Boolean valueOf = y9m0Var != null ? Boolean.valueOf(y9m0Var.r) : null;
        if (jl40.l(valueOf, Boolean.TRUE)) {
            return SavingProductType.DEPOSIT;
        }
        if (jl40.l(valueOf, Boolean.FALSE)) {
            return SavingProductType.SAVER;
        }
        if (valueOf == null) {
            return null;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1(aam0 aam0Var, SavingsCardView savingsCardView, View view) {
        zls zlsVar;
        String a = aam0Var.a();
        if (a == null || (zlsVar = savingsCardView.clickListener) == null) {
            return;
        }
        zlsVar.invoke(new jr(a), aam0Var.a, savingsCardView.getSavingsProductType(aam0Var));
    }

    private final void renderBalanceState(y9m0 state) {
        CharSequence string;
        ab61 ab61Var = this.binding;
        YbSdkScalableTextView ybSdkScalableTextView = ab61Var.b;
        Text text = state.b;
        MoneyEntity moneyEntity = state.g;
        ybSdkScalableTextView.setText(d.a(sm91.c(ab61Var), text));
        ab61Var.b.setTextColor(state.j.get(sm91.c(ab61Var)));
        SpoilerTextView spoilerTextView = ab61Var.l;
        spoilerTextView.setText(d.a(sm91.c(ab61Var), state.c));
        spoilerTextView.setTextColor(state.k.get(sm91.c(ab61Var)));
        spoilerTextView.getBackground().setTint(state.l.get(sm91.c(ab61Var)));
        TextView textView = ab61Var.e;
        textView.setText(d.a(sm91.c(ab61Var), state.d));
        textView.setTextColor(state.m.get(sm91.c(ab61Var)));
        TextView textView2 = ab61Var.k;
        textView2.setText(d.a(sm91.c(ab61Var), state.f));
        textView2.setTextColor(state.n.get(sm91.c(ab61Var)));
        TextView textView3 = ab61Var.c;
        Text text2 = state.h;
        if (text2 == null || (string = d.a(sm91.c(ab61Var), text2)) == null) {
            string = moneyEntity != null ? sm91.c(ab61Var).getString(dzh0.ybsdk_savings_target_balance_text_template, moneyEntity.getFormattedAmount()) : null;
            if (string == null) {
                string = "";
            }
        }
        textView3.setText(string);
        textView3.setTextColor(state.t.get(sm91.c(ab61Var)));
        setBackgroundImage(state.q, state.i.get(sm91.c(ab61Var)), state.s);
        this.binding.j.setSpoilerStateListener(new vxj0(27, this, state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderBalanceState$lambda$6$lambda$5(SavingsCardView savingsCardView, y9m0 y9m0Var, boolean z) {
        savingsCardView.binding.b.requestEnsureTextSizeRecalculation();
        savingsCardView.updateAccessibility(y9m0Var, z);
        return zy11.a;
    }

    private final void renderImageState(z9m0 state) {
        ab61 ab61Var = this.binding;
        ab61Var.e.setText(d.a(sm91.c(ab61Var), state.b));
        ab61Var.e.setTextColor(state.f.get(sm91.c(ab61Var)));
        v4b1.k(state.d, ab61Var.g, null, null, 6);
        SpoilerFrameLayout spoilerFrameLayout = ab61Var.j;
        SpoilerFrameLayout.updateSpoilerState$default(spoilerFrameLayout, null, false, 1, null);
        spoilerFrameLayout.setSpoilerStateListener(new vxj0(28, this, state));
        TextView textView = ab61Var.h;
        textView.setText(d.a(sm91.c(ab61Var), state.c));
        textView.setTextColor(state.h.get(sm91.c(ab61Var)));
        setBackgroundImage$default(this, state.k, state.e.get(sm91.c(ab61Var)), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderImageState$lambda$15$lambda$14$lambda$13(SavingsCardView savingsCardView, z9m0 z9m0Var, boolean z) {
        savingsCardView.updateAccessibility(z9m0Var, z);
        return zy11.a;
    }

    private final void setAccessibilityBalance(y9m0 state, boolean isSpoilerVisible) {
        String string = isSpoilerVisible ? getContext().getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : getContext().getString(dzh0.ybsdk_savings_dashboard_accessibility_account_balance, d.a(getContext(), state.b));
        Text text = state.h;
        MoneyEntity moneyEntity = state.g;
        String accessibilityText = toAccessibilityText(text);
        if (accessibilityText == null) {
            accessibilityText = moneyEntity != null ? getContext().getString(dzh0.ybsdk_savings_dashboard_accessibility_account_target, moneyEntity.getFormattedAmount()) : null;
        }
        String string2 = !isSpoilerVisible ? getContext().getString(dzh0.ybsdk_savings_dashboard_accessibility_interest, d.a(getContext(), state.c)) : null;
        ConstraintLayout constraintLayout = this.binding.i;
        String accessibilityText2 = toAccessibilityText(state.d);
        constraintLayout.setContentDescription(lia1.i(j73.A(new String[]{accessibilityText2 != null ? getContext().getString(dzh0.ybsdk_savings_dashboard_accessibility_account_name, accessibilityText2) : null, toAccessibilityText(state.f), string, accessibilityText, string2})));
    }

    private final void setAccessibilityImage(z9m0 state) {
        this.binding.i.setContentDescription(lia1.i(j73.A(new String[]{toAccessibilityText(state.b), toAccessibilityText(state.c)})));
    }

    private final void setBackgroundImage(ThemedImageUrlEntity backgroundImageUrl, int fallbackColor, ImageScaleTypeEntity backgroundImageScaleType) {
        String b = backgroundImageUrl != null ? job1.b(backgroundImageUrl, getContext()) : null;
        if (b == null || evu0.J(b)) {
            setCardBackgroundColor(fallbackColor);
            this.binding.f.setImageDrawable(null);
            return;
        }
        setCardBackgroundColor(0);
        this.binding.f.setImageDrawable(new ColorDrawable(fallbackColor));
        if (backgroundImageScaleType != null) {
            this.binding.f.render(backgroundImageScaleType);
        }
        z2m0 z2m0Var = this.backgroundFetcher;
        if (z2m0Var != null) {
            z2m0Var.a(b, fallbackColor, this.binding.f);
        }
    }

    public static /* synthetic */ void setBackgroundImage$default(SavingsCardView savingsCardView, ThemedImageUrlEntity themedImageUrlEntity, int i, ImageScaleTypeEntity imageScaleTypeEntity, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            imageScaleTypeEntity = null;
        }
        savingsCardView.setBackgroundImage(themedImageUrlEntity, i, imageScaleTypeEntity);
    }

    private final void setChildrenVisibility(aam0 state) {
        ab61 ab61Var = this.binding;
        boolean z = state instanceof y9m0;
        y9m0 y9m0Var = z ? (y9m0) state : null;
        rr51 rr51Var = y9m0Var != null ? y9m0Var.e : null;
        boolean z2 = state instanceof z9m0;
        TextView textView = ab61Var.e;
        YbDivView ybDivView = ab61Var.d;
        textView.setVisibility(0);
        ab61Var.k.setVisibility((z && rr51Var == null) ? 0 : 8);
        ybDivView.setVisibility(rr51Var != null ? 0 : 8);
        if (rr51Var != null) {
            YbDivView.setData$default(ybDivView, rr51Var, null, null, false, 14, null);
        }
        ab61Var.l.setVisibility(z ? 0 : 8);
        ab61Var.b.setVisibility(z ? 0 : 8);
        ab61Var.j.setVisibility(z ? 0 : 8);
        ab61Var.c.setVisibility(z ? 0 : 8);
        ab61Var.g.setVisibility(z2 ? 0 : 8);
        ab61Var.h.setVisibility(z2 ? 0 : 8);
    }

    private final String toAccessibilityText(Text text) {
        CharSequence a;
        String obj;
        if (text == null || text.equals(Text.Empty.INSTANCE)) {
            text = null;
        }
        if (text == null || (a = d.a(getContext(), text)) == null || (obj = a.toString()) == null || evu0.J(obj)) {
            return null;
        }
        return obj;
    }

    private final void updateAccessibility(aam0 state, boolean isSpoilerVisible) {
        if (state instanceof y9m0) {
            setAccessibilityBalance((y9m0) state, isSpoilerVisible);
        } else if (state instanceof z9m0) {
            setAccessibilityImage((z9m0) state);
        } else {
            w511.b();
        }
    }

    public final zls getClickListener() {
        return this.clickListener;
    }

    @Override // android.view.View
    public int getImportantForAccessibility() {
        return 2;
    }

    public final void render(aam0 state) {
        int r;
        setChildrenVisibility(state);
        boolean z = state instanceof y9m0;
        if (z) {
            renderBalanceState((y9m0) state);
        } else {
            if (!(state instanceof z9m0)) {
                w511.b();
                return;
            }
            renderImageState((z9m0) state);
        }
        if (z) {
            r = kp50.r(12);
        } else {
            if (!(state instanceof z9m0)) {
                w511.b();
                return;
            }
            r = kp50.r(24);
        }
        ConstraintLayout constraintLayout = this.binding.i;
        constraintLayout.setPadding(r, constraintLayout.getPaddingTop(), r, constraintLayout.getPaddingBottom());
        this.binding.i.setOnClickListener(new tai0(8, state, this));
    }

    public final void setBackgroundFetcher(z2m0 fetcher) {
        this.backgroundFetcher = fetcher;
    }

    public final void setClickListener(zls zlsVar) {
        this.clickListener = zlsVar;
    }

    public SavingsCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SavingsCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SavingsCardView(Context context) {
        this(context, null, 0, 6, null);
    }
}
