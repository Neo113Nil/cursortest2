package defpackage;

import com.yandex.messaging.internal.gaps.UserGapWorkflow;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class pe7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserGapWorkflow.values().length];
        try {
            iArr[UserGapWorkflow.Conference.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserGapWorkflow.ConferenceTrip.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserGapWorkflow.Trip.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
