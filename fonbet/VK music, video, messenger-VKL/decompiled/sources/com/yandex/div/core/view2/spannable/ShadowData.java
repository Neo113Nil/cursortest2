package com.yandex.div.core.view2.spannable;

import io.reactivex.rxjava3.subjects.b;
import xsna.vu5;

/* compiled from: ShadowData.kt */
/* loaded from: classes7.dex */
public final class ShadowData {
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowData(float f, float f2, float f3, int i) {
        this.offsetX = f;
        this.offsetY = f2;
        this.radius = f3;
        this.color = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowData)) {
            return false;
        }
        ShadowData shadowData = (ShadowData) obj;
        return Float.compare(this.offsetX, shadowData.offsetX) == 0 && Float.compare(this.offsetY, shadowData.offsetY) == 0 && Float.compare(this.radius, shadowData.radius) == 0 && this.color == shadowData.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return Integer.hashCode(this.color) + b.a(this.radius, b.a(this.offsetY, Float.hashCode(this.offsetX) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShadowData(offsetX=");
        sb.append(this.offsetX);
        sb.append(", offsetY=");
        sb.append(this.offsetY);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", color=");
        return vu5.b(sb, this.color, ')');
    }
}
