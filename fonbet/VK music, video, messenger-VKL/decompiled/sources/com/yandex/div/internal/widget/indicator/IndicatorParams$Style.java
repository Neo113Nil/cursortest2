package com.yandex.div.internal.widget.indicator;

import xsna.epx;

/* compiled from: IndicatorParams.kt */
/* loaded from: classes7.dex */
public final class IndicatorParams$Style {
    private final IndicatorParams$Shape activeShape;
    private final IndicatorParams$Animation animation;
    private final IndicatorParams$Shape inactiveShape;
    private final IndicatorParams$ItemPlacement itemsPlacement;
    private final IndicatorParams$Shape minimumShape;

    public IndicatorParams$Style(IndicatorParams$Animation indicatorParams$Animation, IndicatorParams$Shape indicatorParams$Shape, IndicatorParams$Shape indicatorParams$Shape2, IndicatorParams$Shape indicatorParams$Shape3, IndicatorParams$ItemPlacement indicatorParams$ItemPlacement) {
        this.animation = indicatorParams$Animation;
        this.activeShape = indicatorParams$Shape;
        this.inactiveShape = indicatorParams$Shape2;
        this.minimumShape = indicatorParams$Shape3;
        this.itemsPlacement = indicatorParams$ItemPlacement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorParams$Style)) {
            return false;
        }
        IndicatorParams$Style indicatorParams$Style = (IndicatorParams$Style) obj;
        return this.animation == indicatorParams$Style.animation && epx.f(this.activeShape, indicatorParams$Style.activeShape) && epx.f(this.inactiveShape, indicatorParams$Style.inactiveShape) && epx.f(this.minimumShape, indicatorParams$Style.minimumShape) && epx.f(this.itemsPlacement, indicatorParams$Style.itemsPlacement);
    }

    public final IndicatorParams$Shape getActiveShape() {
        return this.activeShape;
    }

    public final IndicatorParams$Animation getAnimation() {
        return this.animation;
    }

    public final IndicatorParams$Shape getInactiveShape() {
        return this.inactiveShape;
    }

    public final IndicatorParams$ItemPlacement getItemsPlacement() {
        return this.itemsPlacement;
    }

    public final IndicatorParams$Shape getMinimumShape() {
        return this.minimumShape;
    }

    public int hashCode() {
        return this.itemsPlacement.hashCode() + ((this.minimumShape.hashCode() + ((this.inactiveShape.hashCode() + ((this.activeShape.hashCode() + (this.animation.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Style(animation=" + this.animation + ", activeShape=" + this.activeShape + ", inactiveShape=" + this.inactiveShape + ", minimumShape=" + this.minimumShape + ", itemsPlacement=" + this.itemsPlacement + ')';
    }
}
