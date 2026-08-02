package com.yandex.fintechsdk.core.ui.impl.api.cutout;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.j73;
import defpackage.jxi;
import defpackage.mnf;
import defpackage.nnf;
import defpackage.pnf;
import defpackage.qz4;
import defpackage.sls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002K\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ/\u0010!\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010\"J'\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0017¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J'\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0014¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00142\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u0002¢\u0006\u0004\b>\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/yandex/fintechsdk/core/ui/impl/api/cutout/CutoutBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lqz4;", "logger", "<init>", "(ILqz4;)V", "", "animationType", "resolveAnimationType", "(Ljava/lang/String;)Ljava/lang/String;", "", "durationMs", "Lnnf;", "entry", "", "targetProgress", "viewId", "Lkotlin/Function0;", "Lzy11;", "onEnd", "startAnimation", "(JLnnf;FLjava/lang/String;Lsls;)V", "Landroid/graphics/Canvas;", "canvas", "drawCutout", "(Landroid/graphics/Canvas;Lnnf;)V", "drawFadeCutout", "drawScaleCutout", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Landroid/graphics/RectF;", "rect", "drawShadowIfNeeded", "(Landroid/graphics/Canvas;FLnnf;Landroid/graphics/RectF;)V", "drawShadow", "animationProgress", "output", "targetRect", "interpolateRect", "(FLandroid/graphics/RectF;Landroid/graphics/RectF;)V", "draw", "(Landroid/graphics/Canvas;)V", "getOpacity", "()I", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "animationDurationMs", "hideCutout", "(JLjava/lang/String;Ljava/lang/String;)V", "release", "()V", "Lpnf;", ConfigConstants.CONFIG, "showCutout", "(Lpnf;)V", "color", "updateBackgroundColor", "Lqz4;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "clearPaint", "fadeClearPaint", "", "cutouts", "Ljava/util/Map;", "tempRect", "Landroid/graphics/RectF;", "Companion", "mnf", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CutoutBackgroundDrawable extends Drawable {
    private static final int MAX_ALPHA = 255;
    private final Paint backgroundPaint;
    private final Paint clearPaint;
    private final Map<String, nnf> cutouts;
    private final Paint fadeClearPaint;
    private final qz4 logger;
    private final RectF tempRect;
    private static final mnf Companion = new mnf();
    private static final String DEFAULT_ANIMATION_TYPE = "scale_from_center";
    private static final String ANIMATION_TYPE_FADE = "fade";
    private static final String ANIMATION_TYPE_NONE = "none";
    private static final Set<String> KNOWN_ANIMATION_TYPES = j73.f0(new String[]{DEFAULT_ANIMATION_TYPE, ANIMATION_TYPE_FADE, ANIMATION_TYPE_NONE});

    public CutoutBackgroundDrawable(int i, qz4 qz4Var) {
        this.logger = qz4Var;
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        Paint f = unr0.f(true);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        f.setXfermode(new PorterDuffXfermode(mode));
        this.clearPaint = f;
        Paint f2 = unr0.f(true);
        f2.setXfermode(new PorterDuffXfermode(mode));
        this.fadeClearPaint = f2;
        this.cutouts = new LinkedHashMap();
        this.tempRect = new RectF();
    }

    private final void drawCutout(Canvas canvas, nnf entry) {
        throw null;
    }

    private final void drawFadeCutout(Canvas canvas, nnf entry) {
        throw null;
    }

    private final void drawScaleCutout(Canvas canvas, nnf entry) {
        float f = entry.a;
        throw null;
    }

    private final void drawShadow(Canvas canvas, float cornerRadius, nnf entry, RectF rect) {
        throw null;
    }

    private final void drawShadowIfNeeded(Canvas canvas, float cornerRadius, nnf entry, RectF rect) {
        throw null;
    }

    private static final zy11 hideCutout$lambda$5(CutoutBackgroundDrawable cutoutBackgroundDrawable, String str) {
        cutoutBackgroundDrawable.cutouts.remove(str);
        return zy11.a;
    }

    private final void interpolateRect(float animationProgress, RectF output, RectF targetRect) {
        float centerX = targetRect.centerX();
        float centerY = targetRect.centerY();
        float width = (targetRect.width() / 2.0f) * animationProgress;
        float height = (targetRect.height() / 2.0f) * animationProgress;
        output.set(centerX - width, centerY - height, centerX + width, centerY + height);
    }

    private final String resolveAnimationType(String animationType) {
        if (animationType == null) {
            animationType = DEFAULT_ANIMATION_TYPE;
        }
        if (!KNOWN_ANIMATION_TYPES.contains(animationType)) {
            this.logger.getClass();
        }
        return animationType;
    }

    private final void startAnimation(long durationMs, nnf entry, float targetProgress, String viewId, sls onEnd) {
        throw null;
    }

    public static /* synthetic */ void startAnimation$default(CutoutBackgroundDrawable cutoutBackgroundDrawable, long j, nnf nnfVar, float f, String str, sls slsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            slsVar = null;
        }
        cutoutBackgroundDrawable.startAnimation(j, nnfVar, f, str, slsVar);
    }

    private static final void startAnimation$lambda$8$lambda$7(CutoutBackgroundDrawable cutoutBackgroundDrawable, String str, ValueAnimator valueAnimator) {
        cutoutBackgroundDrawable.cutouts.get(str);
        cutoutBackgroundDrawable.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float width = getBounds().width();
        float height = getBounds().height();
        if (this.cutouts.isEmpty()) {
            canvas.drawRect(getBounds(), this.backgroundPaint);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null);
        canvas.drawRect(getBounds(), this.backgroundPaint);
        Collection<nnf> values = this.cutouts.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!(((nnf) obj).a == 0.0f)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            drawCutout(canvas, (nnf) it.next());
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -3;
    }

    public final void hideCutout(long animationDurationMs, String animationType, String viewId) {
        b64.D(this.cutouts.get(viewId));
    }

    public final void release() {
        Iterator<T> it = this.cutouts.values().iterator();
        if (it.hasNext()) {
            b64.D(it.next());
            throw null;
        }
        this.cutouts.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.backgroundPaint.setColorFilter(colorFilter);
    }

    public final void showCutout(pnf config) {
        throw null;
    }

    public final void updateBackgroundColor(int color) {
        this.backgroundPaint.setColor(color);
        invalidateSelf();
    }

    public /* synthetic */ CutoutBackgroundDrawable(int i, qz4 qz4Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? qz4.a : qz4Var);
    }
}
