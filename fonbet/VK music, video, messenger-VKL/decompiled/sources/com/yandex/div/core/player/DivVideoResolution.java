package com.yandex.div.core.player;

import xsna.vu5;

/* compiled from: DivVideoResolution.kt */
/* loaded from: classes7.dex */
public final class DivVideoResolution {
    private final int height;
    private final int width;

    public DivVideoResolution(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoResolution)) {
            return false;
        }
        DivVideoResolution divVideoResolution = (DivVideoResolution) obj;
        return this.width == divVideoResolution.width && this.height == divVideoResolution.height;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DivVideoResolution(width=");
        sb.append(this.width);
        sb.append(", height=");
        return vu5.b(sb, this.height, ')');
    }
}
