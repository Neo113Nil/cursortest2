package defpackage;

import com.yandex.messaging.telemost.domain.entities.PersonalMeetingResolution;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class h5b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PersonalMeetingResolution.values().length];
        try {
            iArr[PersonalMeetingResolution.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PersonalMeetingResolution.Unknown.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PersonalMeetingResolution.Declined.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PersonalMeetingResolution.Missed.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PersonalMeetingResolution.CanceledByCaller.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
