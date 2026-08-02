package ru.ok.android.webrtc.opengl;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.epx;

/* loaded from: classes9.dex */
public final class CallRendererFrameTransform {
    public final AtomicReference a = new AtomicReference(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static final class Modifiers {
        public final float a;
        public final float b;
        public final boolean c;
        public final boolean d;

        public Modifiers(float f, float f2, boolean z, boolean z2) {
            this.a = f;
            this.b = f2;
            this.c = z;
            this.d = z2;
        }

        public final void apply(Matrix matrix) {
            matrix.preScale(this.c ? -1.0f : 1.0f, this.d ? -1.0f : 1.0f);
            matrix.preScale(this.a, this.b);
        }

        public final boolean getMirrorHorizontally() {
            return this.c;
        }

        public final boolean getMirrorVertically() {
            return this.d;
        }

        public final float getScaleX() {
            return this.a;
        }

        public final float getScaleY() {
            return this.b;
        }
    }

    public final Modifiers getModifiers(float f) {
        float floatValue;
        Float f2 = (Float) this.a.get();
        if (epx.d(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            f2 = Float.valueOf(f);
        }
        float f3 = 1.0f;
        if (f > f2.floatValue()) {
            float floatValue2 = f2.floatValue() / f;
            floatValue = 1.0f;
            f3 = floatValue2;
        } else {
            floatValue = f / f2.floatValue();
        }
        return new Modifiers(f3, floatValue, this.b.get(), false);
    }

    public final void setLayoutAspectRatio(float f) {
        this.a.set(Float.valueOf(f));
    }

    public final void setMirror(boolean z) {
        this.b.set(z);
    }
}
