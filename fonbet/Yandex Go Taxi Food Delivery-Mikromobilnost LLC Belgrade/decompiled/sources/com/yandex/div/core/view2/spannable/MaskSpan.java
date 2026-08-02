package com.yandex.div.core.view2.spannable;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import defpackage.ey00;
import defpackage.fy00;
import defpackage.gy00;
import defpackage.ky00;
import defpackage.m810;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJW\u0010'\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020\bH\u0000¢\u0006\u0004\b+\u0010,J\u000f\u00100\u001a\u00020*H\u0000¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0013038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskSpan;", "Lcom/yandex/div/internal/spannable/PositionAwareReplacementSpan;", "Lgy00;", "mask", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "hostView", "<init>", "(Lgy00;Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;)V", "", "w", "h", "", "start", "end", "Ley00;", "particlesData", "Lzy11;", "initParticles", "(FFIILey00;)V", "Lky00;", "p", "cfg", "reinitParticle", "(Lky00;FFLey00;)V", "Landroid/graphics/Paint;", "paint", "", "text", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "adjustSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "textPaint", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "dt", "", "onFrame$div_release", "(F)Z", "onFrame", "isAlive$div_release", "()Z", "isAlive", "Lgy00;", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "", "particles", "Ljava/util/List;", "fillPaint", "Landroid/graphics/Paint;", "lastWidth", "F", "lastHeight", ClidProvider.APP_ACTIVE, "Z", "", "randomSeed", "J", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MaskSpan extends PositionAwareReplacementSpan {
    private boolean active;
    private final Paint fillPaint;
    private final DivLineHeightTextView hostView;
    private float lastHeight;
    private float lastWidth;
    private final gy00 mask;
    private final List<ky00> particles = new ArrayList();
    private long randomSeed;

    public MaskSpan(gy00 gy00Var, DivLineHeightTextView divLineHeightTextView) {
        this.mask = gy00Var;
        this.hostView = divLineHeightTextView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint = paint;
        this.lastWidth = -1.0f;
        this.lastHeight = -1.0f;
    }

    private final void initParticles(float w, float h, int start, int end, ey00 particlesData) {
        Resources resources;
        DisplayMetrics displayMetrics;
        MaskSpan maskSpan = this;
        float f = w;
        maskSpan.lastWidth = f;
        maskSpan.lastHeight = h;
        maskSpan.particles.clear();
        maskSpan.randomSeed = ((start * 73856093) ^ (end * 19349663)) ^ m810.b(particlesData.b * 1000.0f);
        Random random = new Random(maskSpan.randomSeed);
        float f2 = 1.0f;
        float max = Math.max(1.0f, particlesData.e);
        float f3 = 3.1415927f;
        float pow = ((float) Math.pow(max, 2.0d)) * 3.1415927f * ((((float) Math.pow(1.5d, 3.0d)) - ((float) Math.pow(0.699999988079071d, 3.0d))) / 2.4f);
        float f4 = 0.0f;
        float f5 = pow > 0.0f ? (f * h) / pow : 0.0f;
        float f6 = particlesData.b;
        if (f6 >= 1.0f) {
            f4 = 0.99f;
        } else if (f6 > 0.0f) {
            f4 = f6;
        }
        int d = y6i0.d(m810.b(f5 * f4), 1, 800);
        DivLineHeightTextView divLineHeightTextView = maskSpan.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f2 = displayMetrics.density;
        }
        float f7 = 2.0f * f2;
        float f8 = (f2 * 9.0f) - f7;
        int i = 0;
        while (i < d) {
            float nextFloat = ((random.nextFloat() * 0.8f) + 0.7f) * max;
            float nextFloat2 = (random.nextFloat() * f8) + f7;
            double nextFloat3 = ((float) (random.nextFloat() * 6.283185307179586d)) - f3;
            float cos = ((float) Math.cos(nextFloat3)) * nextFloat2;
            float sin = ((float) Math.sin(nextFloat3)) * nextFloat2;
            float nextFloat4 = (random.nextFloat() - 0.5f) * 0.5f;
            float nextFloat5 = (random.nextFloat() * 6000.0f) + 6000.0f;
            float nextFloat6 = random.nextFloat() * nextFloat5 * 0.5f;
            List<ky00> list = maskSpan.particles;
            float nextFloat7 = random.nextFloat() * f;
            float nextFloat8 = random.nextFloat() * h;
            ky00 ky00Var = new ky00();
            ky00Var.a = nextFloat7;
            ky00Var.b = nextFloat8;
            ky00Var.c = nextFloat;
            ky00Var.d = cos;
            ky00Var.e = sin;
            ky00Var.f = nextFloat4;
            ky00Var.g = nextFloat5;
            ky00Var.h = nextFloat6;
            list.add(ky00Var);
            i++;
            maskSpan = this;
            f = w;
            f3 = 3.1415927f;
        }
    }

    private final void reinitParticle(ky00 p, float w, float h, ey00 cfg) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Random random = new Random(this.randomSeed + p.hashCode());
        float f = 1.0f;
        p.c = ((random.nextFloat() * 0.8f) + 0.7f) * Math.max(1.0f, cfg.e);
        p.a = random.nextFloat() * w;
        p.b = random.nextFloat() * h;
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = displayMetrics.density;
        }
        float f2 = 2.0f * f;
        float nextFloat = (random.nextFloat() * ((f * 9.0f) - f2)) + f2;
        double nextFloat2 = ((float) (random.nextFloat() * 6.283185307179586d)) - 3.1415927f;
        p.d = ((float) Math.cos(nextFloat2)) * nextFloat;
        p.e = ((float) Math.sin(nextFloat2)) * nextFloat;
        p.f = (random.nextFloat() - 0.5f) * 0.5f;
        p.g = (random.nextFloat() * 6000.0f) + 6000.0f;
        p.h = 0.0f;
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        return (int) paint.measureText(text, start, end);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint textPaint) {
        float f;
        float f2;
        ParticlesTicker particlesTicker$div_release;
        ParticlesTicker particlesTicker$div_release2;
        float measureText = textPaint.measureText(text, start, end);
        float f3 = bottom - top;
        gy00 gy00Var = this.mask;
        if (gy00Var instanceof fy00) {
            this.fillPaint.setColor(((fy00) gy00Var).a);
            canvas.drawRect(x, top, x + measureText, bottom, this.fillPaint);
            this.active = false;
            return;
        }
        if (gy00Var instanceof ey00) {
            if (measureText == this.lastWidth && f3 == this.lastHeight && !this.particles.isEmpty()) {
                f = measureText;
                f2 = f3;
            } else {
                f = measureText;
                f2 = f3;
                initParticles(f, f2, start, end, (ey00) gy00Var);
            }
            ey00 ey00Var = (ey00) gy00Var;
            this.fillPaint.setColor(ey00Var.a);
            for (ky00 ky00Var : this.particles) {
                float f4 = ky00Var.a;
                float f5 = ky00Var.c;
                float c = y6i0.c(f4, f5, f - f5);
                float f6 = ky00Var.b;
                float f7 = ky00Var.c;
                canvas.drawCircle(x + c, top + y6i0.c(f6, f7, f2 - f7), ky00Var.c, this.fillPaint);
            }
            if (ey00Var.c) {
                this.active = true;
                DivLineHeightTextView divLineHeightTextView = this.hostView;
                if (divLineHeightTextView == null || (particlesTicker$div_release = divLineHeightTextView.getParticlesTicker$div_release()) == null) {
                    return;
                }
                particlesTicker$div_release.track(this);
                return;
            }
            this.active = false;
            DivLineHeightTextView divLineHeightTextView2 = this.hostView;
            if (divLineHeightTextView2 == null || (particlesTicker$div_release2 = divLineHeightTextView2.getParticlesTicker$div_release()) == null) {
                return;
            }
            particlesTicker$div_release2.untrack(this);
        }
    }

    public final boolean isAlive$div_release() {
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        CharSequence text = divLineHeightTextView != null ? divLineHeightTextView.getText() : null;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        return (spanned == null || spanned.getSpanStart(this) == -1) ? false : true;
    }

    public final boolean onFrame$div_release(float dt) {
        gy00 gy00Var = this.mask;
        ey00 ey00Var = gy00Var instanceof ey00 ? (ey00) gy00Var : null;
        if (ey00Var == null || !this.active || !ey00Var.d || !ey00Var.c) {
            return false;
        }
        if (dt <= 0.0f) {
            return true;
        }
        float f = this.lastWidth;
        float f2 = this.lastHeight;
        for (ky00 ky00Var : this.particles) {
            float f3 = ky00Var.f * dt;
            if (f3 != 0.0f) {
                double d = f3;
                float cos = (float) Math.cos(d);
                float sin = (float) Math.sin(d);
                float f4 = ky00Var.d;
                float f5 = ky00Var.e;
                ky00Var.d = (f4 * cos) - (f5 * sin);
                ky00Var.e = (f5 * cos) + (f4 * sin);
            }
            float f6 = (ky00Var.d * dt) + ky00Var.a;
            ky00Var.a = f6;
            float f7 = (ky00Var.e * dt) + ky00Var.b;
            ky00Var.b = f7;
            float f8 = ky00Var.c;
            float f9 = -f8;
            if (f6 < f9) {
                ky00Var.a = (f8 * 2.0f) + f + f6;
            }
            float f10 = ky00Var.a;
            if (f10 > f + f8) {
                ky00Var.a = f10 - ((f8 * 2.0f) + f);
            }
            if (f7 < f9) {
                ky00Var.b = (f8 * 2.0f) + f2 + f7;
            }
            float f11 = ky00Var.b;
            if (f11 > f2 + f8) {
                ky00Var.b = f11 - ((f8 * 2.0f) + f2);
            }
            float f12 = (1000.0f * dt) + ky00Var.h;
            ky00Var.h = f12;
            if (f12 >= ky00Var.g) {
                reinitParticle(ky00Var, f, f2, ey00Var);
            }
        }
        return true;
    }
}
