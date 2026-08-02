package com.yandex.div.internal.widget.indicator;

import xsna.vu5;
import xsna.xq;

/* compiled from: IndicatorParams.kt */
/* loaded from: classes7.dex */
public interface IndicatorParams$ItemPlacement {

    /* compiled from: IndicatorParams.kt */
    public static final class Default implements IndicatorParams$ItemPlacement {
        private final float spaceBetweenCenters;

        public Default(float f) {
            this.spaceBetweenCenters = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Default) && Float.compare(this.spaceBetweenCenters, ((Default) obj).spaceBetweenCenters) == 0;
        }

        public final float getSpaceBetweenCenters() {
            return this.spaceBetweenCenters;
        }

        public int hashCode() {
            return Float.hashCode(this.spaceBetweenCenters);
        }

        public String toString() {
            return xq.c(')', this.spaceBetweenCenters, new StringBuilder("Default(spaceBetweenCenters="));
        }
    }

    /* compiled from: IndicatorParams.kt */
    public static final class Stretch implements IndicatorParams$ItemPlacement {
        private final float itemSpacing;
        private final int maxVisibleItems;

        public Stretch(float f, int i) {
            this.itemSpacing = f;
            this.maxVisibleItems = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stretch)) {
                return false;
            }
            Stretch stretch = (Stretch) obj;
            return Float.compare(this.itemSpacing, stretch.itemSpacing) == 0 && this.maxVisibleItems == stretch.maxVisibleItems;
        }

        public final float getItemSpacing() {
            return this.itemSpacing;
        }

        public final int getMaxVisibleItems() {
            return this.maxVisibleItems;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxVisibleItems) + (Float.hashCode(this.itemSpacing) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Stretch(itemSpacing=");
            sb.append(this.itemSpacing);
            sb.append(", maxVisibleItems=");
            return vu5.b(sb, this.maxVisibleItems, ')');
        }
    }
}
