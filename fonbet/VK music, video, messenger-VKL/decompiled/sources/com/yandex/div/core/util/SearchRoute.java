package com.yandex.div.core.util;

/* compiled from: SearchUtil.kt */
/* loaded from: classes7.dex */
public final class SearchRoute<T> {
    private int enterLeaveBalance;
    private final T item;
    private int movedDistance;

    public SearchRoute(T t) {
        this.item = t;
    }

    public final int distance() {
        return this.movedDistance;
    }

    public final T getItem() {
        return this.item;
    }

    public final void onEnter() {
        this.enterLeaveBalance++;
        this.movedDistance++;
    }

    public final void onLeave() {
        int i = this.enterLeaveBalance;
        if (i <= 0) {
            this.movedDistance++;
        } else {
            this.enterLeaveBalance = i - 1;
            this.movedDistance--;
        }
    }
}
