package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public final class LineStyle implements Serializable {
    private float arcApproximationStep;
    private float colorSimplificationThreshold;
    private float dashLength;
    private float dashOffset;
    private float gapLength;
    private float gradientLength;
    private boolean innerOutlineEnabled;
    private int outlineColor;
    private float outlineWidth;
    private float strokeWidth;
    private float turnRadius;

    public LineStyle() {
        this.strokeWidth = 5.0f;
        this.gradientLength = 0.0f;
        this.outlineColor = 0;
        this.outlineWidth = 0.0f;
        this.innerOutlineEnabled = false;
        this.turnRadius = 10.0f;
        this.arcApproximationStep = 12.0f;
        this.dashLength = 0.0f;
        this.gapLength = 0.0f;
        this.dashOffset = 0.0f;
        this.colorSimplificationThreshold = 3.0f;
    }

    public float getArcApproximationStep() {
        return this.arcApproximationStep;
    }

    public float getColorSimplificationThreshold() {
        return this.colorSimplificationThreshold;
    }

    public float getDashLength() {
        return this.dashLength;
    }

    public float getDashOffset() {
        return this.dashOffset;
    }

    public float getGapLength() {
        return this.gapLength;
    }

    public float getGradientLength() {
        return this.gradientLength;
    }

    public boolean getInnerOutlineEnabled() {
        return this.innerOutlineEnabled;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getTurnRadius() {
        return this.turnRadius;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.strokeWidth = archive.add(this.strokeWidth);
        this.gradientLength = archive.add(this.gradientLength);
        this.outlineColor = archive.add(this.outlineColor);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.innerOutlineEnabled = archive.add(this.innerOutlineEnabled);
        this.turnRadius = archive.add(this.turnRadius);
        this.arcApproximationStep = archive.add(this.arcApproximationStep);
        this.dashLength = archive.add(this.dashLength);
        this.gapLength = archive.add(this.gapLength);
        this.dashOffset = archive.add(this.dashOffset);
        this.colorSimplificationThreshold = archive.add(this.colorSimplificationThreshold);
    }

    public LineStyle setArcApproximationStep(float f) {
        this.arcApproximationStep = f;
        return this;
    }

    public LineStyle setColorSimplificationThreshold(float f) {
        this.colorSimplificationThreshold = f;
        return this;
    }

    public LineStyle setDashLength(float f) {
        this.dashLength = f;
        return this;
    }

    public LineStyle setDashOffset(float f) {
        this.dashOffset = f;
        return this;
    }

    public LineStyle setGapLength(float f) {
        this.gapLength = f;
        return this;
    }

    public LineStyle setGradientLength(float f) {
        this.gradientLength = f;
        return this;
    }

    public LineStyle setInnerOutlineEnabled(boolean z) {
        this.innerOutlineEnabled = z;
        return this;
    }

    public LineStyle setOutlineColor(int i) {
        this.outlineColor = i;
        return this;
    }

    public LineStyle setOutlineWidth(float f) {
        this.outlineWidth = f;
        return this;
    }

    public LineStyle setStrokeWidth(float f) {
        this.strokeWidth = f;
        return this;
    }

    public LineStyle setTurnRadius(float f) {
        this.turnRadius = f;
        return this;
    }

    public LineStyle(float f, float f2, int i, float f3, boolean z, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.strokeWidth = f;
        this.gradientLength = f2;
        this.outlineColor = i;
        this.outlineWidth = f3;
        this.innerOutlineEnabled = z;
        this.turnRadius = f4;
        this.arcApproximationStep = f5;
        this.dashLength = f6;
        this.gapLength = f7;
        this.dashOffset = f8;
        this.colorSimplificationThreshold = f9;
    }

    public LineStyle(float f, float f2, int i, float f3, boolean z, float f4, float f5, float f6, float f7, float f8) {
        this.colorSimplificationThreshold = 3.0f;
        this.strokeWidth = f;
        this.gradientLength = f2;
        this.outlineColor = i;
        this.outlineWidth = f3;
        this.innerOutlineEnabled = z;
        this.turnRadius = f4;
        this.arcApproximationStep = f5;
        this.dashLength = f6;
        this.gapLength = f7;
        this.dashOffset = f8;
    }
}
