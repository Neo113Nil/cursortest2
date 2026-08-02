package com.yandex.mapkit.map;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public final class TextStyle implements Serializable {
    private int color;
    private float offset;
    private boolean offsetFromIcon;
    private int outlineColor;
    private float outlineWidth;
    private Placement placement;
    private float size;
    private boolean textOptional;

    public enum Placement {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public TextStyle(float f, int i, float f2, int i2, Placement placement, float f3, boolean z, boolean z2) {
        this.size = 8.0f;
        this.color = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.outlineWidth = 1.0f;
        this.outlineColor = -1;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
        if (placement == null) {
            ny61.g("Required field \"placement\" cannot be null");
            throw null;
        }
        this.size = f;
        this.color = i;
        this.outlineWidth = f2;
        this.outlineColor = i2;
        this.placement = placement;
        this.offset = f3;
        this.offsetFromIcon = z;
        this.textOptional = z2;
    }

    public int getColor() {
        return this.color;
    }

    public float getOffset() {
        return this.offset;
    }

    public boolean getOffsetFromIcon() {
        return this.offsetFromIcon;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    public Placement getPlacement() {
        return this.placement;
    }

    public float getSize() {
        return this.size;
    }

    public boolean getTextOptional() {
        return this.textOptional;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.size = archive.add(this.size);
        this.color = archive.add(this.color);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.outlineColor = archive.add(this.outlineColor);
        this.placement = (Placement) archive.add((Archive) this.placement, false, (Class<Archive>) Placement.class);
        this.offset = archive.add(this.offset);
        this.offsetFromIcon = archive.add(this.offsetFromIcon);
        this.textOptional = archive.add(this.textOptional);
    }

    public TextStyle setColor(int i) {
        this.color = i;
        return this;
    }

    public TextStyle setOffset(float f) {
        this.offset = f;
        return this;
    }

    public TextStyle setOffsetFromIcon(boolean z) {
        this.offsetFromIcon = z;
        return this;
    }

    public TextStyle setOutlineColor(int i) {
        this.outlineColor = i;
        return this;
    }

    public TextStyle setOutlineWidth(float f) {
        this.outlineWidth = f;
        return this;
    }

    public TextStyle setPlacement(Placement placement) {
        if (placement != null) {
            this.placement = placement;
            return this;
        }
        ny61.g("Required field \"placement\" cannot be null");
        return null;
    }

    public TextStyle setSize(float f) {
        this.size = f;
        return this;
    }

    public TextStyle setTextOptional(boolean z) {
        this.textOptional = z;
        return this;
    }

    public TextStyle() {
        this.size = 8.0f;
        this.color = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.outlineWidth = 1.0f;
        this.outlineColor = -1;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
    }
}
