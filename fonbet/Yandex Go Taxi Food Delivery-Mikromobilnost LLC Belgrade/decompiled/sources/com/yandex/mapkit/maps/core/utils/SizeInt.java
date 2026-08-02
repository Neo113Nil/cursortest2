package com.yandex.mapkit.maps.core.utils;

import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/yandex/mapkit/maps/core/utils/SizeInt;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "times", "scale", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SizeInt {
    private final int height;
    private final int width;

    public SizeInt(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ SizeInt copy$default(SizeInt sizeInt, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sizeInt.width;
        }
        if ((i3 & 2) != 0) {
            i2 = sizeInt.height;
        }
        return sizeInt.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final SizeInt copy(int width, int height) {
        return new SizeInt(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeInt)) {
            return false;
        }
        SizeInt sizeInt = (SizeInt) other;
        return this.width == sizeInt.width && this.height == sizeInt.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    public final SizeInt times(float scale) {
        return new SizeInt((int) (this.width * scale), (int) (this.height * scale));
    }

    public String toString() {
        return b64.d(this.width, this.height, "SizeInt(width=", ", height=", Extension.C_BRAKE);
    }
}
