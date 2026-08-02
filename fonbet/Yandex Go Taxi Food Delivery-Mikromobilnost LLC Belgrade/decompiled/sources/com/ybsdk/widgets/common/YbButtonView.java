package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.ui.core.CoreOutlineProvider;
import com.ybsdk.widgets.common.shimmer.ShimmerDrawable;
import defpackage.cma1;
import defpackage.cob1;
import defpackage.fch0;
import defpackage.gb61;
import defpackage.ibv;
import defpackage.jl40;
import defpackage.l1i0;
import defpackage.lwg0;
import defpackage.m810;
import defpackage.ntr0;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.poh0;
import defpackage.qk31;
import defpackage.rbv;
import defpackage.rje;
import defpackage.smw0;
import defpackage.tls;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.v4b1;
import defpackage.vng;
import defpackage.vvg0;
import defpackage.w3i0;
import defpackage.we6;
import defpackage.xrb1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J%\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010\"\u001a\u0004\u0018\u00010\f2\b\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010/J\u0015\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u0012J!\u00100\u001a\u00020\f2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f01¢\u0006\u0004\b0\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/ybsdk/widgets/common/YbButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "typedArray", "Lzy11;", "setViewParams", "(Landroid/content/res/TypedArray;)V", "Lcom/ybsdk/widgets/common/YbButtonView$a;", ClidProvider.STATE, "renderButtonContent", "(Lcom/ybsdk/widgets/common/YbButtonView$a;)V", "Lcom/ybsdk/core/utils/text/Text;", "title", "titleColor", "setTitle", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/Integer;)Lzy11;", "subtitle", "subtitleColor", "setSubtitle", "Lrbv;", "icon", "Lcom/ybsdk/core/utils/ColorModel;", "tint", "setIcon", "(Lrbv;Lcom/ybsdk/core/utils/ColorModel;)Lzy11;", "image", "setEndImage", "color", "setBackgroundColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "getText", "()Lcom/ybsdk/core/utils/text/Text;", "", "text", "setText", "(Ljava/lang/String;)V", "(Lcom/ybsdk/core/utils/text/Text;)V", "render", "Lkotlin/Function1;", "update", "(Ltls;)V", "Lgb61;", "binding", "Lgb61;", "Lcom/ybsdk/widgets/common/shimmer/ShimmerDrawable;", "shimmerDrawable", "Lcom/ybsdk/widgets/common/shimmer/ShimmerDrawable;", "Lntr0;", "shimmerArgs", "Lntr0;", "currentState", "Lcom/ybsdk/widgets/common/YbButtonView$a;", "a", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YbButtonView extends ConstraintLayout {
    private final gb61 binding;
    private a currentState;
    private ntr0 shimmerArgs;
    private final ShimmerDrawable shimmerDrawable;

    public YbButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_yb_button_layout, this);
        int i2 = fch0.endImage;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        Text.Constant constant = null;
        if (imageView != null) {
            i2 = fch0.icon;
            ImageView imageView2 = (ImageView) cma1.O(i2, this);
            if (imageView2 != null) {
                i2 = fch0.subtitle;
                TextView textView = (TextView) cma1.O(i2, this);
                if (textView != null) {
                    i2 = fch0.title;
                    TextView textView2 = (TextView) cma1.O(i2, this);
                    if (textView2 != null) {
                        this.binding = new gb61(this, imageView, imageView2, textView, textView2);
                        this.shimmerDrawable = new ShimmerDrawable(context);
                        this.shimmerArgs = new ntr0(context, 0.0f, 0, 0L, 0L, false, false, null, null, 4094);
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3i0.YbButtonView);
                        setEnabled(obtainStyledAttributes.getBoolean(w3i0.YbButtonView_android_state_enabled, true));
                        try {
                            int i3 = w3i0.YbButtonView_ybsdk_buttonIsProcessing;
                            Drawable foreground = getForeground();
                            ShimmerDrawable shimmerDrawable = foreground instanceof ShimmerDrawable ? (ShimmerDrawable) foreground : null;
                            boolean z = false;
                            if (shimmerDrawable != null && shimmerDrawable.isShimmerStarted()) {
                                z = true;
                            }
                            boolean z2 = obtainStyledAttributes.getBoolean(i3, z);
                            setViewParams(obtainStyledAttributes);
                            Drawable drawable = obtainStyledAttributes.getDrawable(w3i0.YbButtonView_ybsdk_buttonIcon);
                            ibv ibvVar = drawable != null ? new ibv(drawable) : null;
                            String string = obtainStyledAttributes.getString(w3i0.YbButtonView_ybsdk_buttonSubtitle);
                            if (string != null) {
                                Text.Companion.getClass();
                                constant = new Text.Constant(string);
                            }
                            Text.Constant constant2 = constant;
                            com.ybsdk.core.utils.text.b bVar = Text.Companion;
                            String string2 = obtainStyledAttributes.getString(w3i0.YbButtonView_ybsdk_buttonTitle);
                            string2 = string2 == null ? "" : string2;
                            bVar.getClass();
                            render(new a(new Text.Constant(string2), constant2, ibvVar, null, null, null, null, false, z2, null, 3064));
                            obtainStyledAttributes.recycle();
                            setClipToOutline(true);
                            return;
                        } catch (Throwable th) {
                            obtainStyledAttributes.recycle();
                            throw th;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void renderButtonContent(a state) {
        boolean z = state.i;
        Text text = state.a;
        if (z) {
            ShimmerDrawable shimmerDrawable = this.shimmerDrawable;
            shimmerDrawable.setShimmer(this.shimmerArgs);
            shimmerDrawable.startShimmer();
            setForeground(shimmerDrawable);
        } else {
            Drawable foreground = getForeground();
            ShimmerDrawable shimmerDrawable2 = foreground instanceof ShimmerDrawable ? (ShimmerDrawable) foreground : null;
            if (shimmerDrawable2 != null) {
                shimmerDrawable2.stopShimmer();
            }
        }
        setEnabled(state.h);
        ColorModel colorModel = state.e;
        setTitle(text, colorModel != null ? Integer.valueOf(colorModel.get(getContext())) : null);
        setContentDescription(text != null ? com.ybsdk.core.utils.text.d.a(getContext(), text) : null);
        Text text2 = state.b;
        ColorModel colorModel2 = state.f;
        setSubtitle(text2, colorModel2 != null ? Integer.valueOf(colorModel2.get(getContext())) : null);
        setIcon(state.c, state.g);
        setEndImage(null, null);
        ColorModel colorModel3 = state.d;
        if (colorModel3 != null) {
            setBackgroundColor(colorModel3);
        }
    }

    private final void setBackgroundColor(ColorModel color) {
        int i = 1;
        getBackground().setTintList(cob1.b(new we6(cob1.a(color.get(getContext()), 0.5f), new ViewState[]{ViewState.PRESSED}, i), new we6(color.get(getContext()), new ViewState[]{ViewState.UNPRESSED}, i), new we6(rje.a(getContext(), ung0.ybColor_button_primaryNormal), new ViewState[]{ViewState.ENABLED}, i), new we6(rje.a(getContext(), ung0.ybColor_button_disabled), new ViewState[]{ViewState.DISABLED}, i)));
    }

    private final zy11 setEndImage(rbv image, ColorModel tint) {
        ImageView imageView = this.binding.b;
        imageView.setVisibility(image != null ? 0 : 8);
        if (image == null || v4b1.k(image, imageView, null, null, 6) == null) {
            imageView.setImageResource(0);
        }
        if (tint == null) {
            return null;
        }
        imageView.setColorFilter(tint.get(imageView.getContext()));
        return zy11.a;
    }

    private final zy11 setIcon(rbv icon, ColorModel tint) {
        ImageView imageView = this.binding.c;
        imageView.setVisibility(icon != null ? 0 : 8);
        if (icon == null || v4b1.k(icon, imageView, null, null, 6) == null) {
            imageView.setImageResource(0);
        }
        if (tint == null) {
            return null;
        }
        imageView.setColorFilter(tint.get(imageView.getContext()), PorterDuff.Mode.SRC_IN);
        return zy11.a;
    }

    private final zy11 setSubtitle(Text subtitle, Integer subtitleColor) {
        CharSequence a2;
        TextView textView = this.binding.d;
        textView.setVisibility(subtitle != null ? 0 : 8);
        if (subtitle != null && (a2 = com.ybsdk.core.utils.text.d.a(textView.getContext(), subtitle)) != null) {
            textView.setText(a2);
        }
        if (subtitleColor == null) {
            return null;
        }
        textView.setTextColor(subtitleColor.intValue());
        return zy11.a;
    }

    public static /* synthetic */ zy11 setSubtitle$default(YbButtonView ybButtonView, Text text, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return ybButtonView.setSubtitle(text, num);
    }

    private final zy11 setTitle(Text title, Integer titleColor) {
        TextView textView = this.binding.e;
        textView.setVisibility(title != null ? 0 : 8);
        if (title == null) {
            title = Text.Empty.INSTANCE;
        }
        textView.setText(com.ybsdk.core.utils.text.d.a(textView.getContext(), title));
        if (titleColor == null) {
            return null;
        }
        textView.setTextColor(titleColor.intValue());
        return zy11.a;
    }

    public static /* synthetic */ zy11 setTitle$default(YbButtonView ybButtonView, Text text, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return ybButtonView.setTitle(text, num);
    }

    private final void setViewParams(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(w3i0.YbButtonView_android_background);
        if (drawable == null) {
            drawable = vng.t(nyg0.ybsdk_background_yb_button, getContext());
        }
        boolean z = drawable instanceof GradientDrawable;
        float v = z ? com.ybsdk.core.utils.ext.view.b.v(typedArray, w3i0.YbButtonView_android_radius, typedArray.getResources().getDimension(vvg0.ybsdk_cornerradius_button)) : 0.0f;
        CoreOutlineProvider.Companion.getClass();
        final float[] d = xrb1.d(v);
        setOutlineProvider(new CoreOutlineProvider(d) { // from class: com.ybsdk.core.utils.ui.core.CoreOutlineProvider$Companion$background$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Drawable background = view.getBackground();
                if (background != null) {
                    background.getOutline(outline);
                } else {
                    outline.setRect(0, 0, view.getWidth(), view.getHeight());
                    outline.setAlpha(0.0f);
                }
            }
        });
        if (z) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.mutate();
            gradientDrawable.setCornerRadius(v);
        }
        setBackground(drawable);
        setPadding(m810.b(com.ybsdk.core.utils.ext.view.b.v(typedArray, w3i0.YbButtonView_android_paddingStart, typedArray.getResources().getDimension(lwg0.ybsdk_button_padding_start_large))), m810.b(com.ybsdk.core.utils.ext.view.b.v(typedArray, w3i0.YbButtonView_android_paddingTop, typedArray.getResources().getDimension(lwg0.ybsdk_button_padding_top_large))), m810.b(com.ybsdk.core.utils.ext.view.b.v(typedArray, w3i0.YbButtonView_android_paddingEnd, typedArray.getResources().getDimension(lwg0.ybsdk_button_padding_end_large))), m810.b(com.ybsdk.core.utils.ext.view.b.v(typedArray, w3i0.YbButtonView_android_paddingBottom, typedArray.getResources().getDimension(lwg0.ybsdk_button_padding_bottom_large))));
        setMinHeight((int) com.ybsdk.core.utils.ext.view.b.v(typedArray, w3i0.YbButtonView_android_minHeight, typedArray.getResources().getDimension(lwg0.ybsdk_button_min_height_large)));
        this.shimmerArgs = ntr0.a(this.shimmerArgs, typedArray.getFloat(w3i0.YbButtonView_ybsdk_buttonShimmerHighlightAlpha, this.shimmerArgs.b), 0, 0L, 0L, false, null, new ColorModel.Raw(typedArray.getColor(w3i0.YbButtonView_ybsdk_buttonShimmerColor, this.shimmerArgs.j.get(getContext()))), 3069);
        gb61 gb61Var = this.binding;
        TextView textView = gb61Var.e;
        TextView textView2 = gb61Var.d;
        textView.setTextAppearance(typedArray.getResourceId(w3i0.YbButtonView_ybsdk_buttonTitleTextAppearance, l1i0.Widget_YB_Text_Title1));
        gb61Var.e.setTextColor(typedArray.getColorStateList(w3i0.YbButtonView_ybsdk_buttonTitleColor));
        textView2.setTextAppearance(typedArray.getResourceId(w3i0.YbButtonView_ybsdk_buttonSubtitleTextAppearance, l1i0.Widget_YB_Text_Caption1_Regular));
        textView2.setTextColor(typedArray.getColorStateList(w3i0.YbButtonView_ybsdk_buttonSubtitleColor));
        ImageView imageView = gb61Var.c;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int v2 = (int) com.ybsdk.core.utils.ext.view.b.v(typedArray, w3i0.YbButtonView_ybsdk_buttonProgressBarSize, typedArray.getResources().getDimension(lwg0.ybsdk_button_progress_indicator_size_l));
        layoutParams.width = v2;
        layoutParams.height = v2;
        imageView.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final Text getText() {
        a aVar = this.currentState;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.a;
    }

    public final void render(tls update) {
        a aVar = this.currentState;
        if (aVar == null) {
            aVar = null;
        }
        render((a) update.invoke(aVar));
    }

    public final void setText(String text) {
        setTitle$default(this, com.ybsdk.core.utils.text.d.e(text), null, 2, null);
    }

    public final void setText(Text text) {
        setTitle$default(this, text, null, 2, null);
    }

    public final void render(a state) {
        setClickable(!state.i);
        renderButtonContent(state);
        this.currentState = state;
    }

    public static final class a {
        public final Text a;
        public final Text b;
        public final rbv c;
        public final ColorModel d;
        public final ColorModel e;
        public final ColorModel f;
        public final ColorModel g;
        public final boolean h;
        public final boolean i;
        public final qk31 j;

        public /* synthetic */ a(Text text, Text text2, rbv rbvVar, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, boolean z, boolean z2, qk31 qk31Var, int i) {
            this((i & 1) != 0 ? null : text, (i & 2) != 0 ? null : text2, (i & 4) != 0 ? null : rbvVar, (i & 8) != 0 ? null : colorModel, (i & 16) != 0 ? null : colorModel2, (i & 32) != 0 ? null : colorModel3, (i & 128) != 0 ? null : colorModel4, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : qk31Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v6, types: [com.ybsdk.core.utils.ColorModel] */
        /* JADX WARN: Type inference failed for: r13v2, types: [com.ybsdk.core.utils.ColorModel] */
        public static a a(a aVar, ColorModel.Attr attr, ColorModel.Attr attr2, boolean z, boolean z2, int i) {
            Text text = aVar.a;
            Text text2 = aVar.b;
            rbv rbvVar = aVar.c;
            ColorModel.Attr attr3 = attr;
            if ((i & 8) != 0) {
                attr3 = aVar.d;
            }
            ColorModel.Attr attr4 = attr3;
            ColorModel.Attr attr5 = attr2;
            if ((i & 16) != 0) {
                attr5 = aVar.e;
            }
            ColorModel.Attr attr6 = attr5;
            ColorModel colorModel = aVar.f;
            aVar.getClass();
            ColorModel colorModel2 = aVar.g;
            aVar.getClass();
            if ((i & 512) != 0) {
                z = aVar.h;
            }
            boolean z3 = z;
            boolean z4 = (i & 1024) != 0 ? aVar.i : z2;
            qk31 qk31Var = aVar.j;
            aVar.getClass();
            return new a(text, text2, rbvVar, attr4, attr6, colorModel, colorModel2, z3, z4, qk31Var);
        }

        public final Text b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && this.h == aVar.h && this.i == aVar.i && jl40.l(this.j, aVar.j);
        }

        public final int hashCode() {
            Text text = this.a;
            int hashCode = (text == null ? 0 : text.hashCode()) * 31;
            Text text2 = this.b;
            int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
            rbv rbvVar = this.c;
            int hashCode3 = (hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
            ColorModel colorModel = this.d;
            int hashCode4 = (hashCode3 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
            ColorModel colorModel2 = this.e;
            int hashCode5 = (hashCode4 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
            ColorModel colorModel3 = this.f;
            int hashCode6 = (hashCode5 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 961;
            ColorModel colorModel4 = this.g;
            int e = unr0.e(unr0.e((hashCode6 + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 961, 31, this.h), 31, this.i);
            qk31 qk31Var = this.j;
            return e + (qk31Var != null ? qk31Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder p = defpackage.n.p("State(title=", this.a, ", subtitle=", this.b, ", icon=");
            p.append(this.c);
            p.append(", backgroundColor=");
            p.append(this.d);
            p.append(", titleColor=");
            smw0.z(p, this.e, ", subtitleColor=", this.f, ", endImage=null, iconTint=");
            p.append(this.g);
            p.append(", endImageTint=null, isEnabled=");
            p.append(this.h);
            p.append(", isProcessing=");
            p.append(this.i);
            p.append(", vibrationPattern=");
            p.append(this.j);
            p.append(Extension.C_BRAKE);
            return p.toString();
        }

        public a(Text text, Text text2, rbv rbvVar, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, boolean z, boolean z2, qk31 qk31Var) {
            this.a = text;
            this.b = text2;
            this.c = rbvVar;
            this.d = colorModel;
            this.e = colorModel2;
            this.f = colorModel3;
            this.g = colorModel4;
            this.h = z;
            this.i = z2;
            this.j = qk31Var;
        }

        public a() {
            this(null, null, null, null, null, null, null, false, false, null, 4095);
        }
    }

    public YbButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ YbButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public YbButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
