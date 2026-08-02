package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.ej11;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;", "", "", "offsetX", "offsetY", "<init>", "(FF)V", "Lej11;", "toEntity", "()Lej11;", "component1", "()F", "component2", "copy", "(FF)Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getOffsetX", "getOffsetY", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TsarButtonGradientV2OffsetPosition {

    @Json(name = "offset_x")
    private final float offsetX;

    @Json(name = "offset_y")
    private final float offsetY;

    public TsarButtonGradientV2OffsetPosition(float f, float f2) {
        this.offsetX = f;
        this.offsetY = f2;
    }

    public static /* synthetic */ TsarButtonGradientV2OffsetPosition copy$default(TsarButtonGradientV2OffsetPosition tsarButtonGradientV2OffsetPosition, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = tsarButtonGradientV2OffsetPosition.offsetX;
        }
        if ((i & 2) != 0) {
            f2 = tsarButtonGradientV2OffsetPosition.offsetY;
        }
        return tsarButtonGradientV2OffsetPosition.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* renamed from: component2, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    public final TsarButtonGradientV2OffsetPosition copy(float offsetX, float offsetY) {
        return new TsarButtonGradientV2OffsetPosition(offsetX, offsetY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TsarButtonGradientV2OffsetPosition)) {
            return false;
        }
        TsarButtonGradientV2OffsetPosition tsarButtonGradientV2OffsetPosition = (TsarButtonGradientV2OffsetPosition) other;
        return Float.compare(this.offsetX, tsarButtonGradientV2OffsetPosition.offsetX) == 0 && Float.compare(this.offsetY, tsarButtonGradientV2OffsetPosition.offsetY) == 0;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public int hashCode() {
        return Float.hashCode(this.offsetY) + (Float.hashCode(this.offsetX) * 31);
    }

    public final ej11 toEntity() {
        return new ej11(this.offsetX, this.offsetY);
    }

    public String toString() {
        return x4e.e("TsarButtonGradientV2OffsetPosition(offsetX=", this.offsetX, ", offsetY=", this.offsetY, Extension.C_BRAKE);
    }
}
