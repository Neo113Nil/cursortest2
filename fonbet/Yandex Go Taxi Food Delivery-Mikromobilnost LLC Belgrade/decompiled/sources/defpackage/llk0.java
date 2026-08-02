package defpackage;

import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$FailureReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class llk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardPerfAnalytics$FailureReason.values().length];
        try {
            iArr[RideCardPerfAnalytics$FailureReason.DETACH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.START_STATE_PROCESSING_TIMESTAMP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.COMPONENT_CREATION_TIMESTAMP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.COMPONENT_CREATION_TIME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.ATTACH_TIMESTAMP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.PRESENTATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.STATE_PROCESSING_RECORD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.FIRST_SUBMIT_RECORD_START.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.FIRST_SUBMIT_RECORD_END.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.STATE_READY_RECORD.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.LAST_SUBMIT_RECORD_START.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[RideCardPerfAnalytics$FailureReason.LAST_SUBMIT_RECORD_END.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
