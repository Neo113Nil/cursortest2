package com.yandex.mapkit.maps.core.utils;

import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/mapkit/maps/core/utils/SizeFloat;", "", "width", "", "height", "<init>", "(FF)V", "getWidth", "()F", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SizeFloat {
    private final float height;
    private final float width;

    public SizeFloat(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public static /* synthetic */ SizeFloat copy$default(SizeFloat sizeFloat, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = sizeFloat.width;
        }
        if ((i & 2) != 0) {
            f2 = sizeFloat.height;
        }
        return sizeFloat.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final SizeFloat copy(float width, float height) {
        return new SizeFloat(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeFloat)) {
            return false;
        }
        SizeFloat sizeFloat = (SizeFloat) other;
        return Float.compare(this.width, sizeFloat.width) == 0 && Float.compare(this.height, sizeFloat.height) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.hashCode(this.height) + (Float.hashCode(this.width) * 31);
    }

    public String toString() {
        return x4e.e("SizeFloat(width=", this.width, ", height=", this.height, Extension.C_BRAKE);
    }
}
