package com.yandex.div.internal.widget.indicator;

import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: IndicatorParams.kt */
/* loaded from: classes7.dex */
public abstract class IndicatorParams$Shape {

    /* compiled from: IndicatorParams.kt */
    public static final class Circle extends IndicatorParams$Shape {
        private final int color;
        private final IndicatorParams$ItemSize.Circle itemSize;

        public Circle(int i, IndicatorParams$ItemSize.Circle circle) {
            super(null);
            this.color = i;
            this.itemSize = circle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Circle)) {
                return false;
            }
            Circle circle = (Circle) obj;
            return this.color == circle.color && epx.f(this.itemSize, circle.itemSize);
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        public int hashCode() {
            return this.itemSize.hashCode() + (Integer.hashCode(this.color) * 31);
        }

        public String toString() {
            return "Circle(color=" + this.color + ", itemSize=" + this.itemSize + ')';
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public IndicatorParams$ItemSize.Circle getItemSize() {
            return this.itemSize;
        }
    }

    /* compiled from: IndicatorParams.kt */
    public static final class RoundedRect extends IndicatorParams$Shape {
        private final int color;
        private final IndicatorParams$ItemSize.RoundedRect itemSize;
        private final int strokeColor;
        private final float strokeWidth;

        public RoundedRect(int i, IndicatorParams$ItemSize.RoundedRect roundedRect, float f, int i2) {
            super(null);
            this.color = i;
            this.itemSize = roundedRect;
            this.strokeWidth = f;
            this.strokeColor = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) obj;
            return this.color == roundedRect.color && epx.f(this.itemSize, roundedRect.itemSize) && Float.compare(this.strokeWidth, roundedRect.strokeWidth) == 0 && this.strokeColor == roundedRect.strokeColor;
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        public final int getStrokeColor() {
            return this.strokeColor;
        }

        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.strokeColor) + b.a(this.strokeWidth, (this.itemSize.hashCode() + (Integer.hashCode(this.color) * 31)) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RoundedRect(color=");
            sb.append(this.color);
            sb.append(", itemSize=");
            sb.append(this.itemSize);
            sb.append(", strokeWidth=");
            sb.append(this.strokeWidth);
            sb.append(", strokeColor=");
            return vu5.b(sb, this.strokeColor, ')');
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public IndicatorParams$ItemSize.RoundedRect getItemSize() {
            return this.itemSize;
        }
    }

    public /* synthetic */ IndicatorParams$Shape(zcl zclVar) {
        this();
    }

    public final int getBorderColor() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getStrokeColor();
        }
        return 0;
    }

    public final float getBorderWidth() {
        return this instanceof RoundedRect ? ((RoundedRect) this).getStrokeWidth() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public abstract int getColor();

    public abstract IndicatorParams$ItemSize getItemSize();

    private IndicatorParams$Shape() {
    }
}
