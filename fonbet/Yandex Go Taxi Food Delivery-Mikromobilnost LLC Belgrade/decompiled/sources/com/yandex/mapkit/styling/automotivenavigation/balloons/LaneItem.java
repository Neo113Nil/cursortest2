package com.yandex.mapkit.styling.automotivenavigation.balloons;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R(\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\"\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneItem;", "", "<init>", "()V", "", "highlightedLaneImage", "Lzy11;", "setHighlightedLaneImage", "(I)V", "laneKindImage", "setLaneKindImage", "laneKindCropImage", "setLaneKindCropImage", "", "secondaryLanesImages", "Ljava/util/List;", "getSecondaryLanesImages", "()Ljava/util/List;", "value", "Ljava/lang/Integer;", "getHighlightedLaneImage", "()Ljava/lang/Integer;", "getLaneKindImage", "getLaneKindCropImage", "", "hasLeftOffset", "Z", "getHasLeftOffset", "()Z", "setHasLeftOffset", "(Z)V", "hasLargeOverlap", "getHasLargeOverlap", "setHasLargeOverlap", "hasRightOffset", "getHasRightOffset", "setHasRightOffset", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaneItem {
    private boolean hasLargeOverlap;
    private boolean hasLeftOffset;
    private boolean hasRightOffset;
    private Integer highlightedLaneImage;
    private Integer laneKindCropImage;
    private Integer laneKindImage;
    private final List<Integer> secondaryLanesImages = new ArrayList();

    public final boolean getHasLargeOverlap() {
        return this.hasLargeOverlap;
    }

    public final boolean getHasLeftOffset() {
        return this.hasLeftOffset;
    }

    public final boolean getHasRightOffset() {
        return this.hasRightOffset;
    }

    public final Integer getHighlightedLaneImage() {
        return this.highlightedLaneImage;
    }

    public final Integer getLaneKindCropImage() {
        return this.laneKindCropImage;
    }

    public final Integer getLaneKindImage() {
        return this.laneKindImage;
    }

    public final List<Integer> getSecondaryLanesImages() {
        return this.secondaryLanesImages;
    }

    public final void setHasLargeOverlap(boolean z) {
        this.hasLargeOverlap = z;
    }

    public final void setHasLeftOffset(boolean z) {
        this.hasLeftOffset = z;
    }

    public final void setHasRightOffset(boolean z) {
        this.hasRightOffset = z;
    }

    public final void setHighlightedLaneImage(int highlightedLaneImage) {
        this.highlightedLaneImage = Integer.valueOf(highlightedLaneImage);
    }

    public final void setLaneKindCropImage(int laneKindCropImage) {
        this.laneKindCropImage = Integer.valueOf(laneKindCropImage);
    }

    public final void setLaneKindImage(int laneKindImage) {
        this.laneKindImage = Integer.valueOf(laneKindImage);
    }
}
