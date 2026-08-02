package com.yandex.div.core.view2.spannable;

import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import xsna.xq;
import xsna.zcl;

/* compiled from: MaskData.kt */
/* loaded from: classes7.dex */
public abstract class MaskData {

    /* compiled from: MaskData.kt */
    public static final class Particles extends MaskData {
        private final int color;
        private final float density;
        private final boolean isAnimated;
        private final boolean isEnabled;
        private final float particleSize;

        public Particles(int i, float f, boolean z, boolean z2, float f2) {
            super(null);
            this.color = i;
            this.density = f;
            this.isAnimated = z;
            this.isEnabled = z2;
            this.particleSize = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Particles)) {
                return false;
            }
            Particles particles = (Particles) obj;
            return this.color == particles.color && Float.compare(this.density, particles.density) == 0 && this.isAnimated == particles.isAnimated && this.isEnabled == particles.isEnabled && Float.compare(this.particleSize, particles.particleSize) == 0;
        }

        public final int getColor() {
            return this.color;
        }

        public final float getDensity() {
            return this.density;
        }

        public final float getParticleSize() {
            return this.particleSize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int a = b.a(this.density, Integer.hashCode(this.color) * 31, 31);
            boolean z = this.isAnimated;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (a + i) * 31;
            boolean z2 = this.isEnabled;
            return Float.hashCode(this.particleSize) + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31);
        }

        public final boolean isAnimated() {
            return this.isAnimated;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Particles(color=");
            sb.append(this.color);
            sb.append(", density=");
            sb.append(this.density);
            sb.append(", isAnimated=");
            sb.append(this.isAnimated);
            sb.append(", isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", particleSize=");
            return xq.c(')', this.particleSize, sb);
        }
    }

    /* compiled from: MaskData.kt */
    public static final class Solid extends MaskData {
        private final int color;
        private final boolean isEnabled;

        public Solid(int i, boolean z) {
            super(null);
            this.color = i;
            this.isEnabled = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Solid)) {
                return false;
            }
            Solid solid = (Solid) obj;
            return this.color == solid.color && this.isEnabled == solid.isEnabled;
        }

        public final int getColor() {
            return this.color;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.color) * 31;
            boolean z = this.isEnabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Solid(color=");
            sb.append(this.color);
            sb.append(", isEnabled=");
            return q0.a(sb, this.isEnabled, ')');
        }
    }

    public /* synthetic */ MaskData(zcl zclVar) {
        this();
    }

    private MaskData() {
    }
}
