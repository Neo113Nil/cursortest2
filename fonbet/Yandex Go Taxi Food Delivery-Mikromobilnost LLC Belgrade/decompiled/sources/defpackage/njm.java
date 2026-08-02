package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation.RideCardDriverSectionTransition;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class njm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardDriverSectionTransition.values().length];
        try {
            iArr[RideCardDriverSectionTransition.PLAIN_CONTENT_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardDriverSectionTransition.SEARCHING_TO_WAITING_RESPONSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardDriverSectionTransition.SEARCHING_TO_REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RideCardDriverSectionTransition.SEARCHING_TO_ASSIGNED_DRIVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RideCardDriverSectionTransition.WAITING_RESPONSE_TO_REJECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RideCardDriverSectionTransition.WAITING_RESPONSE_TO_ASSIGNED_DRIVER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RideCardDriverSectionTransition.WAITING_RESPONSE_TO_SEARCHING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RideCardDriverSectionTransition.WAITING_RESPONSE_CANDIDATE_CHANGE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[RideCardDriverSectionTransition.REJECTED_TO_SEARCHING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[RideCardDriverSectionTransition.REJECTED_TO_WAITING_RESPONSE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[RideCardDriverSectionTransition.REJECTED_TO_ASSIGNED_DRIVER.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[RideCardDriverSectionTransition.REJECTED_CANDIDATE_CHANGE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[RideCardDriverSectionTransition.ASSIGNED_DRIVER_TO_SEARCHING.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[RideCardDriverSectionTransition.ASSIGNED_DRIVER_TO_WAITING_RESPONSE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[RideCardDriverSectionTransition.ASSIGNED_DRIVER_TO_REJECTED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[RideCardDriverSectionTransition.ASSIGNED_DRIVER_CONTENT_CHANGE.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        a = iArr;
    }
}
