package com.yandex.messaging.base.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jxi;
import defpackage.l3i0;
import defpackage.wuj0;
import defpackage.yma1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0083\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0018\u00010\rR\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\rR\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J/\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u001cH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u001eH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0019H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0019\u0010<\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010DH\u0017¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u0019H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0019H\u0017¢\u0006\u0004\bK\u0010\u001bJ\u000f\u0010L\u001a\u00020\u001eH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001eH\u0017¢\u0006\u0004\bN\u0010MJ\u0017\u0010Q\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0014¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u000fH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020\u0019H\u0014¢\u0006\u0004\bV\u0010JJ\u0017\u0010X\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u001cH\u0014¢\u0006\u0004\bX\u00101J\u000f\u0010Y\u001a\u00020\u0019H\u0016¢\u0006\u0004\bY\u0010\u001bJ\u000f\u0010Z\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010\u001bJ\u0017\u0010]\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J\u0011\u0010`\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u0001¢\u0006\u0004\bb\u0010cJ\u0019\u0010d\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020\u0001H\u0016¢\u0006\u0004\bg\u0010hJ'\u0010m\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020\u00012\u0006\u0010j\u001a\u00020i2\u0006\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020\u00012\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u001eH\u0016¢\u0006\u0004\bq\u0010MJ\u0019\u0010r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\br\u0010eJ\u001b\u0010s\u001a\u00020\u000f2\n\u0010\u0012\u001a\u00060\rR\u00020\u0007H\u0002¢\u0006\u0004\bs\u0010\u0014J\u0019\u0010u\u001a\u00020\u000f2\b\u0010t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bu\u0010hJ5\u0010y\u001a\u00020x2\u0006\u0010v\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0018\u00010\rR\u00020\u00072\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020OH\u0002¢\u0006\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010t\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010c¨\u0006\u0084\u0001"}, d2 = {"Lcom/yandex/messaging/base/view/DrawableWrapper;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;", "origState", "<init>", "(Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;)V", "Landroid/content/res/Resources;", "resources", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lzy11;", "inflate", "(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V", "t", "applyTheme", "(Landroid/content/res/Resources$Theme;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "getChangingConfigurations", "()I", "Landroid/graphics/Rect;", "padding", "", "getPadding", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Insets;", "getOpticalInsets", "()Landroid/graphics/Insets;", "", RemoteBioParameters.X, RemoteBioParameters.Y, "setHotspot", "(FF)V", "left", "top", "right", "bottom", "setHotspotBounds", "(IIII)V", "outRect", "getHotspotBounds", "(Landroid/graphics/Rect;)V", "visible", "restart", "setVisible", "(ZZ)Z", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "getAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getColorFilter", "()Landroid/graphics/ColorFilter;", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "layoutDirection", "onLayoutDirectionChanged", "(I)Z", "getOpacity", "isStateful", "()Z", "hasFocusStateSpecified", "", ClidProvider.STATE, "onStateChange", "([I)Z", "jumpToCurrentState", "()V", "level", "onLevelChange", "bounds", "onBoundsChange", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/Outline;", "outline", "getOutline", "(Landroid/graphics/Outline;)V", "Landroid/graphics/drawable/Drawable$ConstantState;", "getConstantState", "()Landroid/graphics/drawable/Drawable$ConstantState;", "mutate", "()Landroid/graphics/drawable/Drawable;", "createConstantState", "(Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;)Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Ljava/lang/Runnable;", "action", "", RemoteBioParameters.TIME, "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "canApplyTheme", "cloneOrCreateConstantState", "resolveThemeAttributes", "drawable", "applyDrawable", "res", "set", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "mutated", "Z", "Landroid/util/TypedValue;", "value", "Landroid/util/TypedValue;", "constantState", "Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;", "getDrawable", "DrawableWrapperState", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DrawableWrapper extends Drawable implements Drawable.Callback {
    private DrawableWrapperState constantState;
    private boolean mutated;
    private final TypedValue value;

    public DrawableWrapper(DrawableWrapperState drawableWrapperState) {
        this.value = new TypedValue();
        this.constantState = cloneOrCreateConstantState(drawableWrapperState);
    }

    private final void applyDrawable(Drawable drawable) {
        Drawable mutate;
        Drawable.ConstantState constantState;
        this.constantState.setDrawable$base_release((drawable == null || (mutate = drawable.mutate()) == null || (constantState = mutate.getConstantState()) == null) ? null : constantState.newDrawable());
    }

    private final DrawableWrapperState cloneOrCreateConstantState(DrawableWrapperState origState) {
        Drawable drawable;
        Drawable drawable2 = origState != null ? origState.getDrawable() : null;
        DrawableWrapperState createConstantState = createConstantState(origState);
        if (drawable2 != null && (drawable = createConstantState.getDrawable()) != null) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setLayoutDirection(drawable2.getLayoutDirection());
            drawable.setLevel(drawable2.getLevel());
        }
        return createConstantState;
    }

    private final Drawable getDrawable() {
        return this.constantState.getDrawable();
    }

    private final TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        return theme == null ? res.obtainAttributes(set, attrs) : theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    private final void resolveThemeAttributes(Resources.Theme t) {
        Integer drawableAttr = this.constantState.getDrawableAttr();
        if (drawableAttr == null || !t.resolveAttribute(drawableAttr.intValue(), this.value, false)) {
            return;
        }
        int i = this.value.type;
        if (i == 1) {
            Resources resources = t.getResources();
            int i2 = this.value.data;
            ThreadLocal threadLocal = wuj0.a;
            applyDrawable(yma1.b(resources, i2, t));
            return;
        }
        if (28 > i || i >= 32) {
            return;
        }
        applyDrawable(new ColorDrawable(this.value.data));
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme t) {
        resolveThemeAttributes(t);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.applyTheme(t);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return super.canApplyTheme() || this.constantState.canApplyTheme();
    }

    public DrawableWrapperState createConstantState(DrawableWrapperState origState) {
        return new DrawableWrapperState(this.constantState);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return 255;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable = getDrawable();
        return (drawable == null || (colorFilter = drawable.getColorFilter()) == null) ? super.getColorFilter() : colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.constantState;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect outRect) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.getHotspotBounds(outRect);
        } else {
            outRect.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public Insets getOpticalInsets() {
        Insets opticalInsets;
        Drawable drawable = getDrawable();
        return (drawable == null || (opticalInsets = drawable.getOpticalInsets()) == null) ? Insets.NONE : opticalInsets;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.getOutline(outline);
        } else {
            super.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean hasFocusStateSpecified() {
        boolean hasFocusStateSpecified;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return false;
        }
        hasFocusStateSpecified = drawable.hasFocusStateSpecified();
        return hasFocusStateSpecified;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        super.inflate(resources, parser, attrs, theme);
        TypedArray obtainAttributes = obtainAttributes(resources, theme, attrs, l3i0.DrawableWrapper);
        obtainAttributes.getValue(l3i0.DrawableWrapper_android_drawable, this.value);
        TypedValue typedValue = this.value;
        int i = typedValue.type;
        if (i != 0) {
            if (i != 2) {
                applyDrawable(obtainAttributes.getDrawable(l3i0.DrawableWrapper_android_drawable));
            } else {
                this.constantState.setDrawableAttr$base_release(Integer.valueOf(typedValue.data));
            }
        }
        if (theme != null) {
            resolveThemeAttributes(theme);
        }
        obtainAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.mutated) {
            this.constantState = cloneOrCreateConstantState(this.constantState);
            this.mutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.setLayoutDirection(layoutDirection);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        boolean z = false;
        if (isStateful()) {
            Drawable drawable = getDrawable();
            if (drawable != null && drawable.setState(state)) {
                z = true;
            }
            if (z) {
                onBoundsChange(getBounds());
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable action, long time) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, action, time);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float x, float y) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setHotspot(x, y);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setHotspotBounds(left, top, right, bottom);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setTintList(tint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        boolean visible2 = super.setVisible(visible, restart);
        Drawable drawable = getDrawable();
        boolean z = false;
        if (drawable != null && drawable.setVisible(visible, restart)) {
            z = true;
        }
        return visible2 | z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable action) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, action);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;", "Landroid/graphics/drawable/Drawable$ConstantState;", GlideBitmapDownloader.URL_SUFFIX_PLACEHOLDER, "<init>", "(Lcom/yandex/messaging/base/view/DrawableWrapper$DrawableWrapperState;)V", "drawableAttr", "", "getDrawableAttr$base_release", "()Ljava/lang/Integer;", "setDrawableAttr$base_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable$base_release", "()Landroid/graphics/drawable/Drawable;", "setDrawable$base_release", "(Landroid/graphics/drawable/Drawable;)V", "canApplyTheme", "", "newDrawable", "res", "Landroid/content/res/Resources;", "getChangingConfigurations", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class DrawableWrapperState extends Drawable.ConstantState {
        private Drawable drawable;
        private Integer drawableAttr;

        public DrawableWrapperState(DrawableWrapperState drawableWrapperState) {
            Drawable mutate;
            Drawable.ConstantState constantState;
            if (drawableWrapperState != null) {
                this.drawableAttr = drawableWrapperState.drawableAttr;
                Drawable drawable = drawableWrapperState.drawable;
                this.drawable = (drawable == null || (mutate = drawable.mutate()) == null || (constantState = mutate.getConstantState()) == null) ? null : constantState.newDrawable();
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            Drawable.ConstantState constantState;
            Drawable drawable = this.drawable;
            return ((drawable == null || (constantState = drawable.getConstantState()) == null || !constantState.canApplyTheme()) && this.drawableAttr == null && !super.canApplyTheme()) ? false : true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState;
            Drawable drawable = this.drawable;
            if (drawable == null || (constantState = drawable.getConstantState()) == null) {
                return 0;
            }
            return constantState.getChangingConfigurations();
        }

        /* renamed from: getDrawable$base_release, reason: from getter */
        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* renamed from: getDrawableAttr$base_release, reason: from getter */
        public final Integer getDrawableAttr() {
            return this.drawableAttr;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new DrawableWrapper(this);
        }

        public final void setDrawable$base_release(Drawable drawable) {
            this.drawable = drawable;
        }

        public final void setDrawableAttr$base_release(Integer num) {
            this.drawableAttr = num;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }
    }

    public /* synthetic */ DrawableWrapper(DrawableWrapperState drawableWrapperState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : drawableWrapperState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawableWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
