package com.yandex.messaging.base.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.messaging.base.view.DrawableWrapper;
import defpackage.l3i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001:B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\b2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0018\u00010\u0011R\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0018\u00010\u0011R\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\b2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0015J/\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b1\u00100J\u0019\u00103\u001a\u0002022\b\u0010\u0003\u001a\u0004\u0018\u000102H\u0014¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/yandex/messaging/base/view/DrawableTint;", "Lcom/yandex/messaging/base/view/DrawableWrapper;", "Lcom/yandex/messaging/base/view/DrawableTint$DrawableTintState;", "origState", "<init>", "(Lcom/yandex/messaging/base/view/DrawableTint$DrawableTintState;)V", "Landroid/content/res/ColorStateList;", "tint", "Lzy11;", "applyTint", "(Landroid/content/res/ColorStateList;)V", "", CaretView.ALPHA_PROPERTY, "applyAlpha", "(F)V", "padding", "applyScaledPadding", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "t", "resolveThemeAttributes", "(Landroid/content/res/Resources$Theme;)V", "res", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "resources", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "inflate", "(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V", "", "canApplyTheme", "()Z", "applyTheme", "", "left", "top", "right", "bottom", "setBounds", "(IIII)V", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;", "createConstantState", "(Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;)Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;", "Landroid/util/TypedValue;", "typedValue", "Landroid/util/TypedValue;", ClidProvider.STATE, "Lcom/yandex/messaging/base/view/DrawableTint$DrawableTintState;", "DrawableTintState", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DrawableTint extends DrawableWrapper {
    private final DrawableTintState state;
    private final TypedValue typedValue;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/yandex/messaging/base/view/DrawableTint$DrawableTintState;", "Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;", GlideBitmapDownloader.URL_SUFFIX_PLACEHOLDER, "<init>", "(Lcom/yandex/messaging/base/view/DrawableTint$DrawableTintState;)V", "tintAttr", "", "getTintAttr$base_release", "()Ljava/lang/Integer;", "setTintAttr$base_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "alphaAttr", "getAlphaAttr$base_release", "setAlphaAttr$base_release", "scaledPaddingAttr", "getScaledPaddingAttr$base_release", "setScaledPaddingAttr$base_release", "tint", "Landroid/content/res/ColorStateList;", "getTint$base_release", "()Landroid/content/res/ColorStateList;", "setTint$base_release", "(Landroid/content/res/ColorStateList;)V", CaretView.ALPHA_PROPERTY, "getAlpha$base_release", "setAlpha$base_release", "scaledPadding", "", "getScaledPadding$base_release", "()Ljava/lang/Float;", "setScaledPadding$base_release", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "canApplyTheme", "", "newDrawable", "Landroid/graphics/drawable/Drawable;", "res", "Landroid/content/res/Resources;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DrawableTintState extends DrawableWrapper.DrawableWrapperState {
        private Integer alpha;
        private Integer alphaAttr;
        private Float scaledPadding;
        private Integer scaledPaddingAttr;
        private ColorStateList tint;
        private Integer tintAttr;

        public DrawableTintState(DrawableTintState drawableTintState) {
            super(drawableTintState);
            if (drawableTintState != null) {
                this.tintAttr = drawableTintState.tintAttr;
                this.alphaAttr = drawableTintState.alphaAttr;
                this.scaledPaddingAttr = drawableTintState.scaledPaddingAttr;
                this.tint = drawableTintState.tint;
                this.alpha = drawableTintState.alpha;
                this.scaledPadding = drawableTintState.scaledPadding;
            }
        }

        @Override // com.yandex.messaging.base.view.DrawableWrapper.DrawableWrapperState, android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return (!super.canApplyTheme() && this.tintAttr == null && this.alphaAttr == null && this.scaledPaddingAttr == null) ? false : true;
        }

        /* renamed from: getAlpha$base_release, reason: from getter */
        public final Integer getAlpha() {
            return this.alpha;
        }

        /* renamed from: getAlphaAttr$base_release, reason: from getter */
        public final Integer getAlphaAttr() {
            return this.alphaAttr;
        }

        /* renamed from: getScaledPadding$base_release, reason: from getter */
        public final Float getScaledPadding() {
            return this.scaledPadding;
        }

        /* renamed from: getScaledPaddingAttr$base_release, reason: from getter */
        public final Integer getScaledPaddingAttr() {
            return this.scaledPaddingAttr;
        }

        /* renamed from: getTint$base_release, reason: from getter */
        public final ColorStateList getTint() {
            return this.tint;
        }

        /* renamed from: getTintAttr$base_release, reason: from getter */
        public final Integer getTintAttr() {
            return this.tintAttr;
        }

        @Override // com.yandex.messaging.base.view.DrawableWrapper.DrawableWrapperState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new DrawableTint(this);
        }

        public final void setAlpha$base_release(Integer num) {
            this.alpha = num;
        }

        public final void setAlphaAttr$base_release(Integer num) {
            this.alphaAttr = num;
        }

        public final void setScaledPadding$base_release(Float f) {
            this.scaledPadding = f;
        }

        public final void setScaledPaddingAttr$base_release(Integer num) {
            this.scaledPaddingAttr = num;
        }

        public final void setTint$base_release(ColorStateList colorStateList) {
            this.tint = colorStateList;
        }

        public final void setTintAttr$base_release(Integer num) {
            this.tintAttr = num;
        }
    }

    public DrawableTint(DrawableTintState drawableTintState) {
        super(drawableTintState);
        this.typedValue = new TypedValue();
        DrawableTintState drawableTintState2 = (DrawableTintState) getConstantState();
        this.state = drawableTintState2;
        Integer alpha = drawableTintState2.getAlpha();
        if (alpha != null) {
            setAlpha(alpha.intValue());
        }
        ColorStateList tint = drawableTintState2.getTint();
        if (tint != null) {
            setTintList(tint);
        }
    }

    private final void applyAlpha(float alpha) {
        int i = (int) (alpha * 255.0f);
        if (i > 255) {
            i = 255;
        }
        if (i < 0) {
            i = 0;
        }
        this.state.setAlpha$base_release(Integer.valueOf(i));
        setAlpha(i);
    }

    private final void applyScaledPadding(float padding) {
        DrawableTintState drawableTintState = this.state;
        Float valueOf = Float.valueOf(padding);
        if (valueOf.floatValue() == 0.0f) {
            valueOf = null;
        }
        drawableTintState.setScaledPadding$base_release(valueOf);
    }

    private final void applyTint(ColorStateList tint) {
        this.state.setTint$base_release(tint);
        setTintList(tint);
    }

    private final TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        return theme == null ? res.obtainAttributes(set, attrs) : theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    private final void resolveThemeAttributes(Resources.Theme t) {
        TypedValue typedValue;
        int i;
        Integer tintAttr = this.state.getTintAttr();
        if (tintAttr != null && t.resolveAttribute(tintAttr.intValue(), this.typedValue, true) && 28 <= (i = (typedValue = this.typedValue).type) && i < 32) {
            applyTint(ColorStateList.valueOf(typedValue.data));
        }
        Integer alphaAttr = this.state.getAlphaAttr();
        if (alphaAttr != null && t.resolveAttribute(alphaAttr.intValue(), this.typedValue, true)) {
            TypedValue typedValue2 = this.typedValue;
            if (typedValue2.type == 4) {
                applyAlpha(typedValue2.getFloat());
            }
        }
        Integer scaledPaddingAttr = this.state.getScaledPaddingAttr();
        if (scaledPaddingAttr == null || !t.resolveAttribute(scaledPaddingAttr.intValue(), this.typedValue, true)) {
            return;
        }
        TypedValue typedValue3 = this.typedValue;
        if (typedValue3.type == 5) {
            applyScaledPadding(typedValue3.getDimension(t.getResources().getDisplayMetrics()));
        }
    }

    @Override // com.yandex.messaging.base.view.DrawableWrapper, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme t) {
        super.applyTheme(t);
        resolveThemeAttributes(t);
    }

    @Override // com.yandex.messaging.base.view.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return super.canApplyTheme() || this.state.canApplyTheme();
    }

    @Override // com.yandex.messaging.base.view.DrawableWrapper
    public DrawableWrapper.DrawableWrapperState createConstantState(DrawableWrapper.DrawableWrapperState origState) {
        return new DrawableTintState(origState instanceof DrawableTintState ? (DrawableTintState) origState : null);
    }

    @Override // com.yandex.messaging.base.view.DrawableWrapper, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Float scaledPadding;
        int intrinsicHeight = super.getIntrinsicHeight();
        return (intrinsicHeight > 0 && (scaledPadding = this.state.getScaledPadding()) != null) ? (int) ((scaledPadding.floatValue() * 2.0f) + intrinsicHeight) : intrinsicHeight;
    }

    @Override // com.yandex.messaging.base.view.DrawableWrapper, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Float scaledPadding;
        int intrinsicWidth = super.getIntrinsicWidth();
        return (intrinsicWidth > 0 && (scaledPadding = this.state.getScaledPadding()) != null) ? (int) ((scaledPadding.floatValue() * 2.0f) + intrinsicWidth) : intrinsicWidth;
    }

    @Override // com.yandex.messaging.base.view.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        TypedValue typedValue;
        int i;
        TypedValue typedValue2;
        int i2;
        TypedValue typedValue3;
        int i3;
        super.inflate(resources, parser, attrs, theme);
        TypedArray obtainAttributes = obtainAttributes(resources, theme, attrs, l3i0.DrawableTint);
        if (obtainAttributes.getValue(l3i0.DrawableTint_android_tint, this.typedValue) && (i3 = (typedValue3 = this.typedValue).type) != 0) {
            if (i3 != 2) {
                applyTint(obtainAttributes.getColorStateList(l3i0.DrawableTint_android_tint));
            } else {
                this.state.setTintAttr$base_release(Integer.valueOf(typedValue3.data));
            }
        }
        if (obtainAttributes.getValue(l3i0.DrawableTint_android_alpha, this.typedValue) && (i2 = (typedValue2 = this.typedValue).type) != 0) {
            if (i2 != 2) {
                applyAlpha(obtainAttributes.getFloat(l3i0.DrawableTint_android_alpha, 1.0f));
            } else {
                this.state.setAlphaAttr$base_release(Integer.valueOf(typedValue2.data));
            }
        }
        if (obtainAttributes.getValue(l3i0.DrawableTint_scaledPadding, this.typedValue) && (i = (typedValue = this.typedValue).type) != 0) {
            if (i != 2) {
                applyScaledPadding(obtainAttributes.getDimension(l3i0.DrawableTint_scaledPadding, 0.0f));
            } else {
                this.state.setScaledPaddingAttr$base_release(Integer.valueOf(typedValue.data));
            }
        }
        obtainAttributes.recycle();
        if (theme != null) {
            resolveThemeAttributes(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        Float scaledPadding = this.state.getScaledPadding();
        int intrinsicWidth = getIntrinsicWidth();
        int i = right - left;
        if (scaledPadding == null || intrinsicWidth <= 0 || i <= 0) {
            super.setBounds(left, top, right, bottom);
            return;
        }
        int floatValue = (int) (scaledPadding.floatValue() * (i / intrinsicWidth));
        super.setBounds(left + floatValue, top + floatValue, right - floatValue, bottom - floatValue);
    }

    public /* synthetic */ DrawableTint(DrawableTintState drawableTintState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : drawableTintState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawableTint() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
