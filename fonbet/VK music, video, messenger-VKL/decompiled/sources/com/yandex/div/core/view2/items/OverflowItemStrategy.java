package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import xsna.epx;
import xsna.zcl;

/* compiled from: OverflowItemStrategy.kt */
/* loaded from: classes7.dex */
public abstract class OverflowItemStrategy {
    public static final Companion Companion = new Companion(null);
    private final int itemCount;

    /* compiled from: OverflowItemStrategy.kt */
    public static final class Clamp extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        public Clamp(int i, int i2, int i3, int i4, DisplayMetrics displayMetrics) {
            super(i2, null);
            this.currentItem = i;
            this.itemCount = i2;
            this.scrollRange = i3;
            this.scrollOffset = i4;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int i) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.min(this.currentItem + i, this.itemCount - 1);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int i) {
            return Math.min(Math.max(0, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i), this.metrics) + this.scrollOffset), this.scrollRange);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int i) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.max(0, this.currentItem - i);
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final OverflowItemStrategy create$div_release(String str, int i, int i2, int i3, int i4, DisplayMetrics displayMetrics) {
            if (str == null ? true : str.equals("clamp")) {
                return new Clamp(i, i2, i3, i4, displayMetrics);
            }
            if (epx.f(str, "ring")) {
                return new Ring(i, i2, i3, i4, displayMetrics);
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported overflow " + str);
            }
            return new Clamp(i, i2, i3, i4, displayMetrics);
        }

        private Companion() {
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    public static final class Ring extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        public Ring(int i, int i2, int i3, int i4, DisplayMetrics displayMetrics) {
            super(i2, null);
            this.currentItem = i;
            this.itemCount = i2;
            this.scrollRange = i3;
            this.scrollOffset = i4;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int i) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return (this.currentItem + i) % this.itemCount;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int i) {
            int dpToPx = BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i), this.metrics) + this.scrollOffset;
            int i2 = this.scrollRange;
            int i3 = dpToPx % i2;
            return i3 < 0 ? i3 + i2 : i3;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int i) {
            if (super.itemCount <= 0) {
                return -1;
            }
            int i2 = this.currentItem - i;
            int i3 = this.itemCount;
            int i4 = i2 % i3;
            return i4 + (i3 & (((i4 ^ i3) & ((-i4) | i4)) >> 31));
        }
    }

    public /* synthetic */ OverflowItemStrategy(int i, zcl zclVar) {
        this(i);
    }

    public abstract int nextItem(int i);

    public abstract int positionAfterScrollBy(int i);

    public abstract int previousItem(int i);

    private OverflowItemStrategy(int i) {
        this.itemCount = i;
    }
}
