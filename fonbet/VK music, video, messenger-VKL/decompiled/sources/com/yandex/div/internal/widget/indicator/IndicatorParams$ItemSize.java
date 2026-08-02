package com.yandex.div.internal.widget.indicator;

import io.reactivex.rxjava3.subjects.b;
import kotlin.NoWhenBranchMatchedException;
import xsna.xq;
import xsna.zcl;

/* compiled from: IndicatorParams.kt */
/* loaded from: classes7.dex */
public abstract class IndicatorParams$ItemSize {

    /* compiled from: IndicatorParams.kt */
    public static final class Circle extends IndicatorParams$ItemSize {
        private float radius;

        public Circle(float f) {
            super(null);
            this.radius = f;
        }

        public final Circle copy(float f) {
            return new Circle(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Circle) && Float.compare(this.radius, ((Circle) obj).radius) == 0;
        }

        public final float getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return Float.hashCode(this.radius);
        }

        public String toString() {
            return xq.c(')', this.radius, new StringBuilder("Circle(radius="));
        }
    }

    /* compiled from: IndicatorParams.kt */
    public static final class RoundedRect extends IndicatorParams$ItemSize {
        private float cornerRadius;
        private float itemHeight;
        private float itemWidth;

        public RoundedRect(float f, float f2, float f3) {
            super(null);
            this.itemWidth = f;
            this.itemHeight = f2;
            this.cornerRadius = f3;
        }

        public static /* synthetic */ RoundedRect copy$default(RoundedRect roundedRect, float f, float f2, float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = roundedRect.itemWidth;
            }
            if ((i & 2) != 0) {
                f2 = roundedRect.itemHeight;
            }
            if ((i & 4) != 0) {
                f3 = roundedRect.cornerRadius;
            }
            return roundedRect.copy(f, f2, f3);
        }

        public final RoundedRect copy(float f, float f2, float f3) {
            return new RoundedRect(f, f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) obj;
            return Float.compare(this.itemWidth, roundedRect.itemWidth) == 0 && Float.compare(this.itemHeight, roundedRect.itemHeight) == 0 && Float.compare(this.cornerRadius, roundedRect.cornerRadius) == 0;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final float getItemHeight() {
            return this.itemHeight;
        }

        public final float getItemWidth() {
            return this.itemWidth;
        }

        public int hashCode() {
            return Float.hashCode(this.cornerRadius) + b.a(this.itemHeight, Float.hashCode(this.itemWidth) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RoundedRect(itemWidth=");
            sb.append(this.itemWidth);
            sb.append(", itemHeight=");
            sb.append(this.itemHeight);
            sb.append(", cornerRadius=");
            return xq.c(')', this.cornerRadius, sb);
        }
    }

    public /* synthetic */ IndicatorParams$ItemSize(zcl zclVar) {
        this();
    }

    public final float getHeight() {
        double ceil;
        if (this instanceof RoundedRect) {
            ceil = Math.ceil(((RoundedRect) this).getItemHeight());
        } else {
            if (!(this instanceof Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            ceil = Math.ceil(((Circle) this).getRadius() * 2);
        }
        return (float) ceil;
    }

    public final float getWidth() {
        double ceil;
        if (this instanceof RoundedRect) {
            ceil = Math.ceil(((RoundedRect) this).getItemWidth());
        } else {
            if (!(this instanceof Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            ceil = Math.ceil(((Circle) this).getRadius() * 2);
        }
        return (float) ceil;
    }

    private IndicatorParams$ItemSize() {
    }
}
