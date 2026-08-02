package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimerFormat.values().length];
        try {
            iArr[TimerFormat.DAYS_HOURS_MINUTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimerFormat.HOURS_MINUTES_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TimerFormat.MINUTES_SECONDS_MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
