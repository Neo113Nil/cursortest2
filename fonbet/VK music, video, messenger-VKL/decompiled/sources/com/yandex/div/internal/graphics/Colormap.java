package com.yandex.div.internal.graphics;

import java.util.Arrays;
import xsna.zcl;

/* compiled from: Colormap.kt */
/* loaded from: classes7.dex */
public final class Colormap {
    public static final Companion Companion = new Companion(null);
    public static final Colormap EMPTY = new Colormap(new int[0], 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    private final int[] colors;
    private final float[] positions;

    /* compiled from: Colormap.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public Colormap(int[] iArr, float[] fArr) {
        this.colors = iArr;
        this.positions = fArr;
        if (iArr.length != (fArr != null ? fArr.length : iArr.length)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Colormap.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Colormap colormap = (Colormap) obj;
        return Arrays.equals(this.colors, colormap.colors) && Arrays.equals(this.positions, colormap.positions);
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.colors) * 31;
        float[] fArr = this.positions;
        return hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }

    public /* synthetic */ Colormap(int[] iArr, float[] fArr, int i, zcl zclVar) {
        this(iArr, (i & 2) != 0 ? null : fArr);
    }
}
