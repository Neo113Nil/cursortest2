package defpackage;

import com.yandex.messaging.telemost.domain.entities.PersonalMeetingResolution;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class e5b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PersonalMeetingResolution.values().length];
        try {
            iArr[PersonalMeetingResolution.Unknown.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PersonalMeetingResolution.Success.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PersonalMeetingResolution.CanceledByCaller.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PersonalMeetingResolution.Declined.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
