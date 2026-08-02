package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes8.dex */
public final class ModelStyle implements Serializable {
    private RenderMode renderMode;
    private float scale;
    private UnitType unitType;
    private String variantName;

    /* loaded from: classes15.dex */
    public enum RenderMode {
        BUILDING,
        USER_MODEL
    }

    /* loaded from: classes15.dex */
    public enum UnitType {
        UNIT,
        NORMALIZED,
        METER
    }

    public ModelStyle(float f, UnitType unitType, RenderMode renderMode, String str) {
        this.scale = 1.0f;
        this.unitType = UnitType.UNIT;
        this.renderMode = RenderMode.USER_MODEL;
        this.variantName = null;
        if (unitType == null) {
            ny61.g("Required field \"unitType\" cannot be null");
            throw null;
        }
        if (renderMode == null) {
            ny61.g("Required field \"renderMode\" cannot be null");
            throw null;
        }
        this.scale = f;
        this.unitType = unitType;
        this.renderMode = renderMode;
        this.variantName = str;
    }

    public RenderMode getRenderMode() {
        return this.renderMode;
    }

    public float getScale() {
        return this.scale;
    }

    public UnitType getUnitType() {
        return this.unitType;
    }

    public String getVariantName() {
        return this.variantName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.scale = archive.add(this.scale);
        this.unitType = (UnitType) archive.add((Archive) this.unitType, false, (Class<Archive>) UnitType.class);
        this.renderMode = (RenderMode) archive.add((Archive) this.renderMode, false, (Class<Archive>) RenderMode.class);
        this.variantName = archive.add(this.variantName, true);
    }

    public ModelStyle setRenderMode(RenderMode renderMode) {
        if (renderMode != null) {
            this.renderMode = renderMode;
            return this;
        }
        ny61.g("Required field \"renderMode\" cannot be null");
        return null;
    }

    public ModelStyle setScale(float f) {
        this.scale = f;
        return this;
    }

    public ModelStyle setUnitType(UnitType unitType) {
        if (unitType != null) {
            this.unitType = unitType;
            return this;
        }
        ny61.g("Required field \"unitType\" cannot be null");
        return null;
    }

    public ModelStyle setVariantName(String str) {
        this.variantName = str;
        return this;
    }

    public ModelStyle() {
        this.scale = 1.0f;
        this.unitType = UnitType.UNIT;
        this.renderMode = RenderMode.USER_MODEL;
        this.variantName = null;
    }
}
