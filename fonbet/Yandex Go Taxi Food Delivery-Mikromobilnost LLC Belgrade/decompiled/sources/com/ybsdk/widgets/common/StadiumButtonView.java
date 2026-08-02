package com.ybsdk.widgets.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.o;
import defpackage.cma1;
import defpackage.eaj0;
import defpackage.exa1;
import defpackage.fch0;
import defpackage.fzt0;
import defpackage.gas0;
import defpackage.gzt0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.scc;
import defpackage.sm91;
import defpackage.t451;
import defpackage.tja1;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.vo31;
import defpackage.wo31;
import defpackage.xty0;
import defpackage.y861;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ,2\u00020\u0001:\u0003\n-.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f*\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\f*\u00020\u000f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\f*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\f*\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b!\u0010\u001fJ!\u0010#\u001a\u00020\f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b#\u0010\u001fJ\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010\u000eR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R$\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lcom/ybsdk/widgets/common/StadiumButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgzt0;", "viewState", "Lzy11;", "setAccessibilityParameters", "(Lgzt0;)V", "Landroid/view/View;", "resId", "setNullableBackground", "(Landroid/view/View;Ljava/lang/Integer;)V", "padding", "setNullablePadding", "Landroid/view/ViewGroup;", "enableRightPartClick", "(Landroid/view/ViewGroup;)V", "enableClicks", "disableClicks", "(Landroid/view/View;)V", "Lkotlin/Function1;", "Lcom/ybsdk/widgets/common/StadiumButtonView$ClickedPart;", "listener", "onClick", "(Ltls;)V", "Lt451;", "widgetWithToggleSpanEndOnClick", "Lcom/ybsdk/widgets/common/o;", "widgetWithToggleSwitchOnClick", "render", "Ly861;", "binding", "Ly861;", "clickListener", "Ltls;", "widgetWithToggleSpanEndClickListener", "widgetWithToggleSwitchClickListener", "Companion", "fzt0", "ClickedPart", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StadiumButtonView extends FrameLayout {
    private static final fzt0 Companion = new fzt0();

    @Deprecated
    public static final float DISABLED_ALPHA = 0.5f;

    @Deprecated
    public static final float ENABLED_ALPHA = 1.0f;
    private final y861 binding;
    private tls clickListener;
    private tls widgetWithToggleSpanEndClickListener;
    private tls widgetWithToggleSwitchClickListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/StadiumButtonView$ClickedPart;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_BUTTON", "RIGHT_PART", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ClickedPart {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ClickedPart[] $VALUES;
        public static final ClickedPart FULL_BUTTON = new ClickedPart("FULL_BUTTON", 0);
        public static final ClickedPart RIGHT_PART = new ClickedPart("RIGHT_PART", 1);

        private static final /* synthetic */ ClickedPart[] $values() {
            return new ClickedPart[]{FULL_BUTTON, RIGHT_PART};
        }

        static {
            ClickedPart[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ClickedPart(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ClickedPart valueOf(String str) {
            return (ClickedPart) Enum.valueOf(ClickedPart.class, str);
        }

        public static ClickedPart[] values() {
            return (ClickedPart[]) $VALUES.clone();
        }
    }

    public StadiumButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(context, poh0.ybsdk_stadium_button, this);
        int i2 = fch0.button_validation_progress;
        ProgressBar progressBar = (ProgressBar) cma1.O(i2, inflate);
        if (progressBar != null) {
            i2 = fch0.stadiumButtonContent;
            if (((FrameLayout) cma1.O(i2, inflate)) != null) {
                i2 = fch0.stadium_button_left_part;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
                if (appCompatImageView != null) {
                    i2 = fch0.stadium_button_right_container;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
                    if (frameLayout != null) {
                        i2 = fch0.stadium_button_right_part;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, inflate);
                        if (appCompatImageView2 != null) {
                            i2 = fch0.stadium_button_text_primary;
                            TextView textView = (TextView) cma1.O(i2, inflate);
                            if (textView != null) {
                                i2 = fch0.stadium_button_text_secondary;
                                SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, inflate);
                                if (spoilerTextView != null) {
                                    i2 = fch0.widgetWithToggle;
                                    WidgetWithToggleView widgetWithToggleView = (WidgetWithToggleView) cma1.O(i2, inflate);
                                    if (widgetWithToggleView != null) {
                                        this.binding = new y861((FrameLayout) inflate, progressBar, appCompatImageView, frameLayout, appCompatImageView2, textView, spoilerTextView, widgetWithToggleView);
                                        frameLayout.setClipToOutline(true);
                                        tja1.b(appCompatImageView);
                                        tja1.b(frameLayout);
                                        xty0.b(textView);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void disableClicks(View view) {
        view.setOnClickListener(null);
        view.setClickable(false);
    }

    private final void enableClicks(ViewGroup viewGroup) {
        if (jl40.l(viewGroup, this.binding.d)) {
            enableRightPartClick(viewGroup);
        } else {
            exa1.e(viewGroup, new eaj0(25, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableClicks$lambda$11(StadiumButtonView stadiumButtonView, View view) {
        tls tlsVar = stadiumButtonView.clickListener;
        if (tlsVar != null) {
            tlsVar.invoke(ClickedPart.FULL_BUTTON);
        }
    }

    private final void enableRightPartClick(ViewGroup viewGroup) {
        exa1.d(viewGroup, scc.g(new wo31(viewGroup), new vo31(viewGroup)), new gas0(25, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 enableRightPartClick$lambda$10(StadiumButtonView stadiumButtonView) {
        tls tlsVar = stadiumButtonView.clickListener;
        if (tlsVar != null) {
            tlsVar.invoke(ClickedPart.RIGHT_PART);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$7$lambda$5(StadiumButtonView stadiumButtonView, t451 t451Var) {
        tls tlsVar = stadiumButtonView.widgetWithToggleSpanEndClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(t451Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$7$lambda$6(StadiumButtonView stadiumButtonView, o oVar) {
        tls tlsVar = stadiumButtonView.widgetWithToggleSwitchClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(oVar);
        }
        return zy11.a;
    }

    private final void setAccessibilityParameters(gzt0 viewState) {
        y861 y861Var = this.binding;
        viewState.getClass();
        setContentDescription(null);
        AppCompatImageView appCompatImageView = y861Var.c;
        SpoilerTextView spoilerTextView = y861Var.g;
        FrameLayout frameLayout = y861Var.d;
        Text text = viewState.k;
        appCompatImageView.setContentDescription(text != null ? com.ybsdk.core.utils.text.d.a(sm91.c(y861Var), text) : null);
        Text text2 = viewState.g;
        if (text2 == null) {
            frameLayout.setContentDescription(null);
            frameLayout.setImportantForAccessibility(2);
        } else {
            frameLayout.setContentDescription(com.ybsdk.core.utils.text.d.a(sm91.c(y861Var), text2));
            frameLayout.setImportantForAccessibility(1);
        }
        boolean z = viewState.l;
        TextView textView = y861Var.f;
        if (z) {
            textView.setImportantForAccessibility(1);
            spoilerTextView.setImportantForAccessibility(1);
        } else {
            textView.setImportantForAccessibility(2);
            spoilerTextView.setImportantForAccessibility(2);
        }
    }

    private final void setNullableBackground(View view, Integer num) {
        if (num == null) {
            view.setBackground(null);
        } else {
            view.setBackgroundResource(num.intValue());
        }
    }

    private final void setNullablePadding(View view, Integer num) {
        if (num == null) {
            view.setPadding(0, 0, 0, 0);
        } else {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(num.intValue());
            view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
    }

    public final void onClick(tls listener) {
        this.clickListener = listener;
    }

    public final void render(gzt0 viewState) {
        int i;
        t451 t451Var = viewState.t;
        boolean z = viewState.p;
        Text.Constant constant = viewState.m;
        int i2 = viewState.o;
        int i3 = viewState.i;
        y861 y861Var = this.binding;
        rbv rbvVar = viewState.a;
        AppCompatImageView appCompatImageView = y861Var.c;
        ProgressBar progressBar = y861Var.b;
        AppCompatImageView appCompatImageView2 = y861Var.e;
        SpoilerTextView spoilerTextView = y861Var.g;
        WidgetWithToggleView widgetWithToggleView = y861Var.h;
        TextView textView = y861Var.f;
        v4b1.k(rbvVar, appCompatImageView, null, null, 6);
        AppCompatImageView appCompatImageView3 = y861Var.c;
        setNullableBackground(appCompatImageView3, viewState.b);
        setNullablePadding(appCompatImageView3, viewState.d);
        appCompatImageView3.setScaleType(viewState.c);
        ViewGroup viewGroup = y861Var.d;
        Integer num = viewState.e;
        final int i4 = 0;
        viewGroup.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            appCompatImageView2.setImageResource(num.intValue());
        }
        appCompatImageView2.setVisibility(0);
        Integer num2 = viewState.f;
        if (num2 != null) {
            viewGroup.setBackgroundResource(num2.intValue());
        }
        if (progressBar.getVisibility() == 0) {
            i = 8;
            progressBar.setVisibility(8);
        } else {
            i = 8;
        }
        textView.setText(com.ybsdk.core.utils.text.d.a(sm91.c(y861Var), viewState.h));
        textView.setMaxLines(i3);
        final int i5 = 1;
        textView.setSingleLine(i3 == 1);
        textView.setEllipsize(i3 > 1 ? TextUtils.TruncateAt.END : null);
        textView.setGravity(i2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, viewState.j, 0);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = null;
        }
        if (layoutParams != null) {
            int i6 = -1;
            if (i3 <= 1 && i2 != 17) {
                i6 = -2;
            }
            layoutParams.width = i6;
            textView.setLayoutParams(layoutParams);
        }
        SpoilerTextView.updateSpoilerState$default(spoilerTextView, null, viewState.r, 1, null);
        spoilerTextView.setText(constant != null ? com.ybsdk.core.utils.text.d.a(sm91.c(y861Var), constant) : null);
        xty0.f(spoilerTextView, viewState.n);
        spoilerTextView.setGravity(i2);
        Integer num3 = constant == null ? null : 0;
        spoilerTextView.setVisibility(num3 != null ? num3.intValue() : i);
        setAlpha(z ? 1.0f : 0.5f);
        widgetWithToggleView.setVisibility(t451Var != null ? 0 : i);
        if (t451Var != null) {
            widgetWithToggleView.render(t451Var);
        }
        if (viewState.q) {
            enableClicks(viewGroup);
        } else {
            disableClicks(viewGroup);
        }
        if (z && viewState.s) {
            enableClicks(this);
            widgetWithToggleView.setTextOnClickListener(new tls(this) { // from class: ezt0
                public final /* synthetic */ StadiumButtonView b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 render$lambda$7$lambda$5;
                    zy11 render$lambda$7$lambda$6;
                    int i7 = i4;
                    StadiumButtonView stadiumButtonView = this.b;
                    switch (i7) {
                        case 0:
                            render$lambda$7$lambda$5 = StadiumButtonView.render$lambda$7$lambda$5(stadiumButtonView, (t451) obj);
                            return render$lambda$7$lambda$5;
                        default:
                            render$lambda$7$lambda$6 = StadiumButtonView.render$lambda$7$lambda$6(stadiumButtonView, (o) obj);
                            return render$lambda$7$lambda$6;
                    }
                }
            });
            widgetWithToggleView.setSwitchClickListener(new tls(this) { // from class: ezt0
                public final /* synthetic */ StadiumButtonView b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 render$lambda$7$lambda$5;
                    zy11 render$lambda$7$lambda$6;
                    int i7 = i5;
                    StadiumButtonView stadiumButtonView = this.b;
                    switch (i7) {
                        case 0:
                            render$lambda$7$lambda$5 = StadiumButtonView.render$lambda$7$lambda$5(stadiumButtonView, (t451) obj);
                            return render$lambda$7$lambda$5;
                        default:
                            render$lambda$7$lambda$6 = StadiumButtonView.render$lambda$7$lambda$6(stadiumButtonView, (o) obj);
                            return render$lambda$7$lambda$6;
                    }
                }
            });
        } else {
            disableClicks(this);
            disableClicks(viewGroup);
            widgetWithToggleView.setTextOnClickListener(null);
            widgetWithToggleView.setSwitchClickListener(null);
        }
        setAccessibilityParameters(viewState);
    }

    public final void widgetWithToggleSpanEndOnClick(tls listener) {
        this.widgetWithToggleSpanEndClickListener = listener;
    }

    public final void widgetWithToggleSwitchOnClick(tls listener) {
        this.widgetWithToggleSwitchClickListener = listener;
    }

    public StadiumButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StadiumButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public StadiumButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
