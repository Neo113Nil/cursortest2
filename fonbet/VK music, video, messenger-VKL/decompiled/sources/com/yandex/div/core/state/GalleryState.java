package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import xsna.vu5;

/* compiled from: GalleryState.kt */
/* loaded from: classes7.dex */
public final class GalleryState implements DivViewState.BlockState {
    private final int scrollOffset;
    private final int visibleItemIndex;

    public GalleryState(int i, int i2) {
        this.visibleItemIndex = i;
        this.scrollOffset = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryState)) {
            return false;
        }
        GalleryState galleryState = (GalleryState) obj;
        return this.visibleItemIndex == galleryState.visibleItemIndex && this.scrollOffset == galleryState.scrollOffset;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getVisibleItemIndex() {
        return this.visibleItemIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.scrollOffset) + (Integer.hashCode(this.visibleItemIndex) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GalleryState(visibleItemIndex=");
        sb.append(this.visibleItemIndex);
        sb.append(", scrollOffset=");
        return vu5.b(sb, this.scrollOffset, ')');
    }
}
