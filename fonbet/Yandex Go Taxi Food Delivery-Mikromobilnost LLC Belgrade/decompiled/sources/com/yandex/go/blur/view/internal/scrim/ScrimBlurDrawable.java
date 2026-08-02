package com.yandex.go.blur.view.internal.scrim;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a76;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.md3;
import defpackage.rgp0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vng;
import defpackage.vp00;
import defpackage.w511;
import defpackage.y66;
import defpackage.y6i0;
import defpackage.z66;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001e\u001a\u00020\u001d2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u000b0\u001a2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010#\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010>\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u000b0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u000e0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010AR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010AR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/yandex/go/blur/view/internal/scrim/ScrimBlurDrawable;", "Landroid/graphics/drawable/Drawable;", "", "initialBaseUniformColor", "initialBaseGradientColor", "", "initialRadiusToAlphaMultiplier", "Lkotlin/Function1;", "dpToPx", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;FLtls;)V", "La76;", "effect", "previousEffect", "Lrgp0;", "previousParams", "Lkotlin/Function0;", "Lior;", "viewAbsoluteCoordinates", "createDrawParams", "(La76;La76;Lrgp0;Lsls;)Lrgp0;", "baseColor", "radius", "intensity", "color", "(Ljava/lang/Integer;IF)I", "", "", "effects", "Lzy11;", "setEffects", "(Ljava/util/Map;Lsls;)V", "uniformColor", "gradientColor", "radiusToAlphaMultiplier", "setColors", "(Ljava/lang/Integer;Ljava/lang/Integer;FLsls;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "getOpacity", "()I", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Ltls;", "", "rectRadii", "[F", "getRectRadii", "()[F", "Landroid/graphics/Path;", "rectPath", "Landroid/graphics/Path;", "getRectPath", "()Landroid/graphics/Path;", "", "blurEffects", "Ljava/util/Map;", "drawParams", "Ljava/lang/Integer;", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "view"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrimBlurDrawable extends Drawable {
    private final tls dpToPx;
    private Integer gradientColor;
    private final Paint paint;
    private float radiusToAlphaMultiplier;
    private Integer uniformColor;
    private final float[] rectRadii = new float[8];
    private final Path rectPath = new Path();
    private final Map<String, a76> blurEffects = new LinkedHashMap();
    private final Map<String, rgp0> drawParams = new LinkedHashMap();

    public ScrimBlurDrawable(Integer num, Integer num2, float f, tls tlsVar) {
        this.dpToPx = tlsVar;
        this.uniformColor = num != null ? Integer.valueOf(num.intValue() & 16777215) : null;
        this.gradientColor = num2 != null ? Integer.valueOf(num2.intValue() & 16777215) : null;
        this.radiusToAlphaMultiplier = f;
        this.paint = new Paint(1);
    }

    private final int color(Integer baseColor, int radius, float intensity) {
        if (baseColor == null) {
            return 0;
        }
        return intensity == 0.0f ? baseColor.intValue() : color$alphaValue(this, radius, intensity) | baseColor.intValue();
    }

    private static final float color$alpha(ScrimBlurDrawable scrimBlurDrawable, int i, float f) {
        return y6i0.c(i * scrimBlurDrawable.radiusToAlphaMultiplier * f, 0.0f, 1.0f);
    }

    private static final int color$alphaValue(ScrimBlurDrawable scrimBlurDrawable, int i, float f) {
        return ((int) (color$alpha(scrimBlurDrawable, i, f) * 255.0f)) << 24;
    }

    public static /* synthetic */ int color$default(ScrimBlurDrawable scrimBlurDrawable, Integer num, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        return scrimBlurDrawable.color(num, i, f);
    }

    private final rgp0 createDrawParams(a76 effect, a76 previousEffect, rgp0 previousParams, sls viewAbsoluteCoordinates) {
        if (effect instanceof z66) {
            z66 z66Var = (z66) effect;
            int color$default = color$default(this, this.uniformColor, z66Var.a(), 0.0f, 4, null);
            Set b = z66Var.b();
            ArrayList arrayList = new ArrayList(tcc.n(b, 10));
            Iterator it = b.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
            return new rgp0(color$default, arrayList, null, 24);
        }
        if (!(effect instanceof y66)) {
            w511.b();
            return null;
        }
        y66 y66Var = (y66) effect;
        float f = y66Var.f;
        float f2 = y66Var.d;
        int i = y66Var.a;
        RectF P = vng.P(y66Var, viewAbsoluteCoordinates);
        return new rgp0(ModalContentViewContainer.BASE_SHADOW_COLOR, null, new LinearGradient(P.left, P.top, P.right, P.bottom, color(this.gradientColor, i, f2), color(this.gradientColor, i, f), Shader.TileMode.CLAMP), 26);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEffects$lambda$1(Map map, Map.Entry entry) {
        return !map.containsKey((String) entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEffects$lambda$2(tls tlsVar, Object obj) {
        return ((Boolean) tlsVar.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEffects$lambda$3(Map map, Map.Entry entry) {
        return !map.containsKey((String) entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setEffects$lambda$4(tls tlsVar, Object obj) {
        return ((Boolean) tlsVar.invoke(obj)).booleanValue();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Iterator<Map.Entry<String, rgp0>> it = this.drawParams.entrySet().iterator();
        while (it.hasNext()) {
            rgp0 value = it.next().getValue();
            Paint paint = this.paint;
            int i = value.a;
            List list = value.b;
            paint.setColor(i);
            this.paint.setShader(value.c);
            if (list.isEmpty()) {
                canvas.drawRect(new RectF(getBounds()), this.paint);
            } else {
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    b64.D(pair.getSecond());
                    throw null;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -3;
    }

    public final Path getRectPath() {
        return this.rectPath;
    }

    public final float[] getRectRadii() {
        return this.rectRadii;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setColors(Integer uniformColor, Integer gradientColor, float radiusToAlphaMultiplier, sls viewAbsoluteCoordinates) {
        if (jl40.l(this.uniformColor, uniformColor) && jl40.l(this.gradientColor, gradientColor) && this.radiusToAlphaMultiplier == radiusToAlphaMultiplier) {
            return;
        }
        this.uniformColor = uniformColor != null ? Integer.valueOf(uniformColor.intValue() & 16777215) : null;
        this.gradientColor = gradientColor != null ? Integer.valueOf(gradientColor.intValue() & 16777215) : null;
        this.radiusToAlphaMultiplier = radiusToAlphaMultiplier;
        for (Map.Entry<String, a76> entry : this.blurEffects.entrySet()) {
            this.drawParams.put(entry.getKey(), createDrawParams(entry.getValue(), null, null, viewAbsoluteCoordinates));
        }
        invalidateSelf();
    }

    public final void setEffects(Map<String, ? extends a76> effects, sls viewAbsoluteCoordinates) {
        for (Map.Entry<String, ? extends a76> entry : effects.entrySet()) {
            String key = entry.getKey();
            a76 value = entry.getValue();
            a76 a76Var = this.blurEffects.get(key);
            if (!jl40.l(value, a76Var)) {
                this.blurEffects.put(key, value);
                Map<String, rgp0> map = this.drawParams;
                map.put(key, createDrawParams(value, a76Var, map.get(key), viewAbsoluteCoordinates));
                invalidateSelf();
            }
        }
        this.blurEffects.entrySet().removeIf(new md3(18, new vp00(effects, 1)));
        this.drawParams.entrySet().removeIf(new md3(19, new vp00(effects, 2)));
    }
}
