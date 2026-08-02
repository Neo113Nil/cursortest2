package com.yandex.go.flex.common.extensions.shortcut_shimmer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.e1s0;
import defpackage.f1s0;
import defpackage.g1s0;
import defpackage.jxi;
import defpackage.qje;
import defpackage.w511;
import defpackage.x1i0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u000bJ\u001d\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/yandex/go/flex/common/extensions/shortcut_shimmer/ShortcutShimmeringDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Landroid/content/Context;", "context", "Lf1s0;", ConfigConstants.CONFIG, "<init>", "(Landroid/content/Context;Lf1s0;)V", "Lzy11;", "setPaintByConfig", "(Lf1s0;Landroid/content/Context;)V", "applyDefaultThemeColors", "(Landroid/content/Context;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "getThemedContext", "(Landroid/content/Context;Lru/yandex/taxi/theme/ThemeType;)Landroid/content/Context;", "Landroid/graphics/Canvas;", "Le1s0;", "drawRoundRec", "(Landroid/graphics/Canvas;Le1s0;)V", "newConfig", "setConfig", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;Landroid/content/Context;)V", "start", "()V", "stop", "", "isRunning", "()Z", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "getOpacity", "()I", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Lf1s0;", "cornersRadius", "Le1s0;", "Z", "Lru/yandex/taxi/widget/ShimmeringPaint;", "paint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "getPaint", "()Lru/yandex/taxi/widget/ShimmeringPaint;", "", "pathRadii", "[F", "Landroid/graphics/Path;", "roundRectPath", "Landroid/graphics/Path;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShortcutShimmeringDrawable extends Drawable implements Animatable {
    private f1s0 config;
    private e1s0 cornersRadius;
    private boolean isRunning;
    private final ShimmeringPaint paint;
    private final float[] pathRadii;
    private final Path roundRectPath;

    public ShortcutShimmeringDrawable(Context context, f1s0 f1s0Var) {
        this.config = f1s0Var;
        this.isRunning = true;
        this.paint = new ShimmeringPaint(context);
        this.pathRadii = new float[8];
        this.roundRectPath = new Path();
        f1s0 f1s0Var2 = this.config;
        if (f1s0Var2 != null) {
            setConfig(f1s0Var2, context);
        }
    }

    private final void applyDefaultThemeColors(Context context) {
        this.paint.setColors(qje.t(xng0.shimmeringDefaultColor, context), 16777215);
    }

    private final void drawRoundRec(Canvas canvas, e1s0 e1s0Var) {
        Path path = this.roundRectPath;
        path.reset();
        float[] fArr = this.pathRadii;
        float f = e1s0Var.a;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = e1s0Var.b;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = e1s0Var.d;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = e1s0Var.c;
        fArr[6] = f4;
        fArr[7] = f4;
        path.addRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.pathRadii, Path.Direction.CW);
        canvas.drawPath(this.roundRectPath, this.paint);
    }

    private final Context getThemedContext(Context context, ThemeType themeType) {
        int i;
        int i2 = g1s0.a[themeType.ordinal()];
        if (i2 == 1) {
            i = x1i0.Component_Light;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            i = x1i0.Component_Dark;
        }
        return new ContextThemeWrapper(context, i);
    }

    private final void setPaintByConfig(f1s0 config, Context context) {
        int[] iArr = config.b;
        if (iArr.length >= 7) {
            this.paint.setColors(iArr[3], iArr[2], iArr[1], iArr[0]);
            return;
        }
        if (iArr.length >= 5) {
            this.paint.setColors(iArr[2], iArr[1], iArr[0]);
        } else if (iArr.length >= 2) {
            this.paint.setColors(iArr[1], iArr[0]);
        } else {
            applyDefaultThemeColors(context);
        }
    }

    public final void applyTheme(ThemeType themeType, Context context) {
        Context themedContext = getThemedContext(context, themeType);
        f1s0 f1s0Var = this.config;
        if (f1s0Var != null) {
            setConfig(f1s0Var, themedContext);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.paint.updateShimmering();
        e1s0 e1s0Var = this.cornersRadius;
        if (e1s0Var != null) {
            drawRoundRec(canvas, e1s0Var);
        } else {
            canvas.drawRect(getBounds(), this.paint);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -2;
    }

    public final ShimmeringPaint getPaint() {
        return this.paint;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setConfig(f1s0 newConfig, Context context) {
        this.config = newConfig;
        setPaintByConfig(newConfig, context);
        this.paint.setAngle((float) newConfig.c);
        this.paint.setDuration(newConfig.d);
        this.paint.setStartOffset(0);
        this.cornersRadius = newConfig.e;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.isRunning = true;
        this.paint.restartShimmering();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isRunning = false;
        this.paint.disableShimmering();
        invalidateSelf();
    }

    public /* synthetic */ ShortcutShimmeringDrawable(Context context, f1s0 f1s0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : f1s0Var);
    }
}
