package com.vungle.ads.fpd;

import xsna.k9x;
import xsna.zcl;

/* loaded from: classes7.dex */
public enum AgeRange {
    AGE_18_20(1, new k9x(18, 20, 1)),
    AGE_21_30(2, new k9x(21, 30, 1)),
    AGE_31_40(3, new k9x(31, 40, 1)),
    AGE_41_50(4, new k9x(41, 50, 1)),
    AGE_51_60(5, new k9x(51, 60, 1)),
    AGE_61_70(6, new k9x(61, 70, 1)),
    AGE_71_75(7, new k9x(71, 75, 1)),
    OTHERS(0, new k9x(Integer.MIN_VALUE, Integer.MAX_VALUE, 1));

    public static final Companion Companion = new Companion(null);
    public final int a;
    public final k9x b;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AgeRange fromAge$vungle_ads_release(int i) {
            AgeRange ageRange;
            AgeRange[] values = AgeRange.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    ageRange = null;
                    break;
                }
                ageRange = values[i2];
                k9x range = ageRange.getRange();
                int i3 = range.b;
                if (i <= range.c && i3 <= i) {
                    break;
                }
                i2++;
            }
            return ageRange == null ? AgeRange.OTHERS : ageRange;
        }

        public Companion() {
        }
    }

    AgeRange(int i, k9x k9xVar) {
        this.a = i;
        this.b = k9xVar;
    }

    public final int getId() {
        return this.a;
    }

    public final k9x getRange() {
        return this.b;
    }
}
