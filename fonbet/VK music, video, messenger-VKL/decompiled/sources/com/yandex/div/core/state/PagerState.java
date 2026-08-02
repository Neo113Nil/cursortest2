package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import xsna.vu5;

/* compiled from: PagerState.kt */
/* loaded from: classes7.dex */
public final class PagerState implements DivViewState.BlockState {
    private final int currentPageIndex;

    public PagerState(int i) {
        this.currentPageIndex = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagerState) && this.currentPageIndex == ((PagerState) obj).currentPageIndex;
    }

    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentPageIndex);
    }

    public String toString() {
        return vu5.b(new StringBuilder("PagerState(currentPageIndex="), this.currentPageIndex, ')');
    }
}
