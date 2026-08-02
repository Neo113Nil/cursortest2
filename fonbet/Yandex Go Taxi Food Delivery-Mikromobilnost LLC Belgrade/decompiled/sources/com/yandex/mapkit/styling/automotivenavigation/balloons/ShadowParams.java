package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.graphics.PointF;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "", "color", "", "radius", "", "offset", "Landroid/graphics/PointF;", "<init>", "(IFLandroid/graphics/PointF;)V", "getColor", "()I", "getRadius", "()F", "getOffset", "()Landroid/graphics/PointF;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ShadowParams {
    private final int color;
    private final PointF offset;
    private final float radius;

    public ShadowParams(int i, float f, PointF pointF) {
        this.color = i;
        this.radius = f;
        this.offset = pointF;
    }

    public static /* synthetic */ ShadowParams copy$default(ShadowParams shadowParams, int i, float f, PointF pointF, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shadowParams.color;
        }
        if ((i2 & 2) != 0) {
            f = shadowParams.radius;
        }
        if ((i2 & 4) != 0) {
            pointF = shadowParams.offset;
        }
        return shadowParams.copy(i, f, pointF);
    }

    /* renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* renamed from: component3, reason: from getter */
    public final PointF getOffset() {
        return this.offset;
    }

    public final ShadowParams copy(int color, float radius, PointF offset) {
        return new ShadowParams(color, radius, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowParams)) {
            return false;
        }
        ShadowParams shadowParams = (ShadowParams) other;
        return this.color == shadowParams.color && Float.compare(this.radius, shadowParams.radius) == 0 && jl40.l(this.offset, shadowParams.offset);
    }

    public final int getColor() {
        return this.color;
    }

    public final PointF getOffset() {
        return this.offset;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return this.offset.hashCode() + g8e.c(this.radius, Integer.hashCode(this.color) * 31, 31);
    }

    public String toString() {
        return "ShadowParams(color=" + this.color + ", radius=" + this.radius + ", offset=" + this.offset + Extension.C_BRAKE;
    }
}
