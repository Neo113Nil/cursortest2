package com.yandex.mapkit.styling.transportnavigation;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "", "sizeCornerLeg", "", "sizeCornerLegInnerPart", "widthCenterLeg", "heightCenterLeg", "legOffset", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "legTipThickness", "<init>", "(FFFFFFF)V", "getSizeCornerLeg", "()F", "getSizeCornerLegInnerPart", "getWidthCenterLeg", "getHeightCenterLeg", "getLegOffset", "getCornerRadius", "getLegTipThickness", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BalloonParams {
    private final float cornerRadius;
    private final float heightCenterLeg;
    private final float legOffset;
    private final float legTipThickness;
    private final float sizeCornerLeg;
    private final float sizeCornerLegInnerPart;
    private final float widthCenterLeg;

    public BalloonParams(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.sizeCornerLeg = f;
        this.sizeCornerLegInnerPart = f2;
        this.widthCenterLeg = f3;
        this.heightCenterLeg = f4;
        this.legOffset = f5;
        this.cornerRadius = f6;
        this.legTipThickness = f7;
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

    public final float getLegTipThickness() {
        return this.legTipThickness;
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
}
