package com.yandex.mapkit.styling.automotivenavigation.balloons;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.g8e;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "", "sizeCornerLeg", "", "sizeCornerLegInnerPart", "widthCenterLeg", "heightCenterLeg", "legOffset", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "<init>", "(FFFFFF)V", "getSizeCornerLeg", "()F", "getSizeCornerLegInnerPart", "getWidthCenterLeg", "getHeightCenterLeg", "getLegOffset", "getCornerRadius", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BalloonParams {
    private final float cornerRadius;
    private final float heightCenterLeg;
    private final float legOffset;
    private final float sizeCornerLeg;
    private final float sizeCornerLegInnerPart;
    private final float widthCenterLeg;

    public BalloonParams(float f, float f2, float f3, float f4, float f5, float f6) {
        this.sizeCornerLeg = f;
        this.sizeCornerLegInnerPart = f2;
        this.widthCenterLeg = f3;
        this.heightCenterLeg = f4;
        this.legOffset = f5;
        this.cornerRadius = f6;
    }

    public static /* synthetic */ BalloonParams copy$default(BalloonParams balloonParams, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = balloonParams.sizeCornerLeg;
        }
        if ((i & 2) != 0) {
            f2 = balloonParams.sizeCornerLegInnerPart;
        }
        if ((i & 4) != 0) {
            f3 = balloonParams.widthCenterLeg;
        }
        if ((i & 8) != 0) {
            f4 = balloonParams.heightCenterLeg;
        }
        if ((i & 16) != 0) {
            f5 = balloonParams.legOffset;
        }
        if ((i & 32) != 0) {
            f6 = balloonParams.cornerRadius;
        }
        float f7 = f5;
        float f8 = f6;
        return balloonParams.copy(f, f2, f3, f4, f7, f8);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSizeCornerLeg() {
        return this.sizeCornerLeg;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSizeCornerLegInnerPart() {
        return this.sizeCornerLegInnerPart;
    }

    /* renamed from: component3, reason: from getter */
    public final float getWidthCenterLeg() {
        return this.widthCenterLeg;
    }

    /* renamed from: component4, reason: from getter */
    public final float getHeightCenterLeg() {
        return this.heightCenterLeg;
    }

    /* renamed from: component5, reason: from getter */
    public final float getLegOffset() {
        return this.legOffset;
    }

    /* renamed from: component6, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final BalloonParams copy(float sizeCornerLeg, float sizeCornerLegInnerPart, float widthCenterLeg, float heightCenterLeg, float legOffset, float cornerRadius) {
        return new BalloonParams(sizeCornerLeg, sizeCornerLegInnerPart, widthCenterLeg, heightCenterLeg, legOffset, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalloonParams)) {
            return false;
        }
        BalloonParams balloonParams = (BalloonParams) other;
        return Float.compare(this.sizeCornerLeg, balloonParams.sizeCornerLeg) == 0 && Float.compare(this.sizeCornerLegInnerPart, balloonParams.sizeCornerLegInnerPart) == 0 && Float.compare(this.widthCenterLeg, balloonParams.widthCenterLeg) == 0 && Float.compare(this.heightCenterLeg, balloonParams.heightCenterLeg) == 0 && Float.compare(this.legOffset, balloonParams.legOffset) == 0 && Float.compare(this.cornerRadius, balloonParams.cornerRadius) == 0;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getHeightCenterLeg() {
        return this.heightCenterLeg;
    }

    public final float getLegOffset() {
        return this.legOffset;
    }

    public final float getSizeCornerLeg() {
        return this.sizeCornerLeg;
    }

    public final float getSizeCornerLegInnerPart() {
        return this.sizeCornerLegInnerPart;
    }

    public final float getWidthCenterLeg() {
        return this.widthCenterLeg;
    }

    public int hashCode() {
        return Float.hashCode(this.cornerRadius) + g8e.c(this.legOffset, g8e.c(this.heightCenterLeg, g8e.c(this.widthCenterLeg, g8e.c(this.sizeCornerLegInnerPart, Float.hashCode(this.sizeCornerLeg) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        float f = this.sizeCornerLeg;
        float f2 = this.sizeCornerLegInnerPart;
        float f3 = this.widthCenterLeg;
        float f4 = this.heightCenterLeg;
        float f5 = this.legOffset;
        float f6 = this.cornerRadius;
        StringBuilder k = oo31.k("BalloonParams(sizeCornerLeg=", f, ", sizeCornerLegInnerPart=", f2, ", widthCenterLeg=");
        vfc.x(k, f3, ", heightCenterLeg=", f4, ", legOffset=");
        return ly3.q(k, f5, ", cornerRadius=", f6, Extension.C_BRAKE);
    }
}
