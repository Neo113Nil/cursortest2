package com.yandex.go.taxi.order.bubble;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SimpleOrderBubbleViewHolder$State.values().length];
        try {
            iArr[SimpleOrderBubbleViewHolder$State.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SimpleOrderBubbleViewHolder$State.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
