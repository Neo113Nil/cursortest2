package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_reasons;

import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_reasons.RideCardRatingReasonsSelectorView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardRatingReasonsSelectorView.Type.values().length];
        try {
            iArr[RideCardRatingReasonsSelectorView.Type.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardRatingReasonsSelectorView.Type.TAGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardRatingReasonsSelectorView.Type.ACHIEVEMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
