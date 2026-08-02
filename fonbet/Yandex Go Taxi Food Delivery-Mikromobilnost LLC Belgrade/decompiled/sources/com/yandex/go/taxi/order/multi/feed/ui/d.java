package com.yandex.go.taxi.order.multi.feed.ui;

import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedScrollUpButton;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiOrderFeedScrollUpButton.ScrollState.values().length];
        try {
            iArr[TaxiOrderFeedScrollUpButton.ScrollState.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderFeedScrollUpButton.ScrollState.ANCHORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiOrderFeedScrollUpButton.ScrollState.ANCHORED_SCROLLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
