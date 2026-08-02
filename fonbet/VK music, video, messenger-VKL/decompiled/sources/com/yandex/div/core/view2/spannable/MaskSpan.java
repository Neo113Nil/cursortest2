package com.yandex.div.core.view2.spannable;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.MaskData;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import xsna.an10;
import xsna.swe0;
import xsna.xq;

/* compiled from: MaskSpan.kt */
/* loaded from: classes7.dex */
public final class MaskSpan extends PositionAwareReplacementSpan {
    private boolean active;
    private final Paint fillPaint;
    private final DivLineHeightTextView hostView;
    private float lastHeight;
    private float lastWidth;
    private final MaskData mask;
    private final List<Particle> particles = new ArrayList();
    private long randomSeed;

    /* compiled from: MaskSpan.kt */
    public static final class Particle {
        private float ageMs;
        private float angularVel;
        private float cx;
        private float cy;
        private float lifetimeMs;
        private float radius;
        private float vx;
        private float vy;

        public Particle(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.cx = f;
            this.cy = f2;
            this.radius = f3;
            this.vx = f4;
            this.vy = f5;
            this.angularVel = f6;
            this.lifetimeMs = f7;
            this.ageMs = f8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Particle)) {
                return false;
            }
            Particle particle = (Particle) obj;
            return Float.compare(this.cx, particle.cx) == 0 && Float.compare(this.cy, particle.cy) == 0 && Float.compare(this.radius, particle.radius) == 0 && Float.compare(this.vx, particle.vx) == 0 && Float.compare(this.vy, particle.vy) == 0 && Float.compare(this.angularVel, particle.angularVel) == 0 && Float.compare(this.lifetimeMs, particle.lifetimeMs) == 0 && Float.compare(this.ageMs, particle.ageMs) == 0;
        }

        public final float getAgeMs() {
            return this.ageMs;
        }

        public final float getAngularVel() {
            return this.angularVel;
        }

        public final float getCx() {
            return this.cx;
        }

        public final float getCy() {
            return this.cy;
        }

        public final float getLifetimeMs() {
            return this.lifetimeMs;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final float getVx() {
            return this.vx;
        }

        public final float getVy() {
            return this.vy;
        }

        public int hashCode() {
            return Float.hashCode(this.ageMs) + b.a(this.lifetimeMs, b.a(this.angularVel, b.a(this.vy, b.a(this.vx, b.a(this.radius, b.a(this.cy, Float.hashCode(this.cx) * 31, 31), 31), 31), 31), 31), 31);
        }

        public final void setAgeMs(float f) {
            this.ageMs = f;
        }

        public final void setAngularVel(float f) {
            this.angularVel = f;
        }

        public final void setCx(float f) {
            this.cx = f;
        }

        public final void setCy(float f) {
            this.cy = f;
        }

        public final void setLifetimeMs(float f) {
            this.lifetimeMs = f;
        }

        public final void setRadius(float f) {
            this.radius = f;
        }

        public final void setVx(float f) {
            this.vx = f;
        }

        public final void setVy(float f) {
            this.vy = f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Particle(cx=");
            sb.append(this.cx);
            sb.append(", cy=");
            sb.append(this.cy);
            sb.append(", radius=");
            sb.append(this.radius);
            sb.append(", vx=");
            sb.append(this.vx);
            sb.append(", vy=");
            sb.append(this.vy);
            sb.append(", angularVel=");
            sb.append(this.angularVel);
            sb.append(", lifetimeMs=");
            sb.append(this.lifetimeMs);
            sb.append(", ageMs=");
            return xq.c(')', this.ageMs, sb);
        }
    }

    public MaskSpan(MaskData maskData, DivLineHeightTextView divLineHeightTextView) {
        this.mask = maskData;
        this.hostView = divLineHeightTextView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint = paint;
        this.lastWidth = -1.0f;
        this.lastHeight = -1.0f;
    }

    private final void initParticles(float f, float f2, int i, int i2, MaskData.Particles particles) {
        Resources resources;
        DisplayMetrics displayMetrics;
        this.lastWidth = f;
        this.lastHeight = f2;
        this.particles.clear();
        this.randomSeed = ((i * 73856093) ^ (i2 * 19349663)) ^ an10.b(particles.getDensity() * 1000.0f);
        Random random = new Random(this.randomSeed);
        float f3 = 1.0f;
        float max = Math.max(1.0f, particles.getParticleSize());
        double d = 3;
        float f4 = 0.7f;
        float pow = ((float) Math.pow(max, 2)) * 3.1415927f * ((((float) Math.pow(1.5f, d)) - ((float) Math.pow(0.7f, d))) / 2.4f);
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = pow > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (f * f2) / pow : 0.0f;
        if (particles.getDensity() >= 1.0f) {
            f5 = 0.99f;
        } else if (particles.getDensity() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f5 = particles.getDensity();
        }
        int g = swe0.g(an10.b(f6 * f5), 1, 800);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f3 = displayMetrics.density;
        }
        float f7 = 2.0f * f3;
        float f8 = (f3 * 9.0f) - f7;
        int i3 = 0;
        while (i3 < g) {
            float nextFloat = ((random.nextFloat() * 0.8f) + f4) * max;
            float nextFloat2 = (random.nextFloat() * f8) + f7;
            double nextFloat3 = ((float) (random.nextFloat() * 6.283185307179586d)) - 3.1415927f;
            float cos = ((float) Math.cos(nextFloat3)) * nextFloat2;
            float sin = ((float) Math.sin(nextFloat3)) * nextFloat2;
            float nextFloat4 = (random.nextFloat() - 0.5f) * 0.5f;
            float nextFloat5 = (random.nextFloat() * 6000.0f) + 6000.0f;
            this.particles.add(new Particle(random.nextFloat() * f, random.nextFloat() * f2, nextFloat, cos, sin, nextFloat4, nextFloat5, random.nextFloat() * nextFloat5 * 0.5f));
            i3++;
            f7 = f7;
            f4 = 0.7f;
        }
    }

    private final void reinitParticle(Particle particle, float f, float f2, MaskData.Particles particles) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Random random = new Random(this.randomSeed + particle.hashCode());
        float f3 = 1.0f;
        particle.setRadius(((random.nextFloat() * 0.8f) + 0.7f) * Math.max(1.0f, particles.getParticleSize()));
        particle.setCx(random.nextFloat() * f);
        particle.setCy(random.nextFloat() * f2);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f3 = displayMetrics.density;
        }
        float f4 = 2.0f * f3;
        float nextFloat = (random.nextFloat() * ((f3 * 9.0f) - f4)) + f4;
        double nextFloat2 = ((float) (random.nextFloat() * 6.283185307179586d)) - 3.1415927f;
        particle.setVx(((float) Math.cos(nextFloat2)) * nextFloat);
        particle.setVy(((float) Math.sin(nextFloat2)) * nextFloat);
        particle.setAngularVel((random.nextFloat() - 0.5f) * 0.5f);
        particle.setLifetimeMs((random.nextFloat() * 6000.0f) + 6000.0f);
        particle.setAgeMs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i, i2);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        float f3;
        ParticlesTicker particlesTicker$div_release;
        ParticlesTicker particlesTicker$div_release2;
        float measureText = paint.measureText(charSequence, i, i2);
        float f4 = i5 - i3;
        MaskData maskData = this.mask;
        if (maskData instanceof MaskData.Solid) {
            this.fillPaint.setColor(((MaskData.Solid) maskData).getColor());
            canvas.drawRect(f, i3, f + measureText, i5, this.fillPaint);
            this.active = false;
            return;
        }
        if (maskData instanceof MaskData.Particles) {
            if (measureText == this.lastWidth && f4 == this.lastHeight && !this.particles.isEmpty()) {
                f2 = measureText;
                f3 = f4;
            } else {
                f2 = measureText;
                f3 = f4;
                initParticles(f2, f3, i, i2, (MaskData.Particles) maskData);
            }
            MaskData.Particles particles = (MaskData.Particles) maskData;
            this.fillPaint.setColor(particles.getColor());
            for (Particle particle : this.particles) {
                canvas.drawCircle(f + swe0.f(particle.getCx(), particle.getRadius(), f2 - particle.getRadius()), i3 + swe0.f(particle.getCy(), particle.getRadius(), f3 - particle.getRadius()), particle.getRadius(), this.fillPaint);
            }
            if (particles.isAnimated()) {
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

    public final boolean onFrame$div_release(float f) {
        MaskData maskData = this.mask;
        MaskData.Particles particles = maskData instanceof MaskData.Particles ? (MaskData.Particles) maskData : null;
        if (particles == null || !this.active || !particles.isEnabled() || !particles.isAnimated()) {
            return false;
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        float f2 = this.lastWidth;
        float f3 = this.lastHeight;
        for (Particle particle : this.particles) {
            float angularVel = particle.getAngularVel() * f;
            if (angularVel != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                double d = angularVel;
                float cos = (float) Math.cos(d);
                float sin = (float) Math.sin(d);
                float vx = (particle.getVx() * cos) - (particle.getVy() * sin);
                float vy = (particle.getVy() * cos) + (particle.getVx() * sin);
                particle.setVx(vx);
                particle.setVy(vy);
            }
            particle.setCx((particle.getVx() * f) + particle.getCx());
            particle.setCy((particle.getVy() * f) + particle.getCy());
            float radius = particle.getRadius();
            float f4 = -radius;
            if (particle.getCx() < f4) {
                particle.setCx((radius * 2.0f) + f2 + particle.getCx());
            }
            if (particle.getCx() > f2 + radius) {
                particle.setCx(particle.getCx() - ((radius * 2.0f) + f2));
            }
            if (particle.getCy() < f4) {
                particle.setCy((radius * 2.0f) + f3 + particle.getCy());
            }
            if (particle.getCy() > f3 + radius) {
                particle.setCy(particle.getCy() - ((radius * 2.0f) + f3));
            }
            particle.setAgeMs((1000.0f * f) + particle.getAgeMs());
            if (particle.getAgeMs() >= particle.getLifetimeMs()) {
                reinitParticle(particle, f2, f3, particles);
            }
        }
        return true;
    }
}
