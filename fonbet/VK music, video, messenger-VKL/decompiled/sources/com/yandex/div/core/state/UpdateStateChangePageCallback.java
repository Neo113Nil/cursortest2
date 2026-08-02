package com.yandex.div.core.state;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: UpdateStateChangePageCallback.kt */
/* loaded from: classes7.dex */
public final class UpdateStateChangePageCallback extends ViewPager2.g {
    private final String mBlockId;
    private final DivViewState mDivViewState;

    public UpdateStateChangePageCallback(String str, DivViewState divViewState) {
        this.mBlockId = str;
        this.mDivViewState = divViewState;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageSelected(int i) {
        if (i != -1) {
            this.mDivViewState.putBlockState(this.mBlockId, new PagerState(i));
        }
    }
}
