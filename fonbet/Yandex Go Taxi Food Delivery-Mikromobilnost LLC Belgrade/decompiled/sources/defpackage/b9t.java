package defpackage;

import com.yandex.messaging.telemost.domain.entities.PersonalMeetingResolution;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b9t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PersonalMeetingResolution.values().length];
        try {
            iArr[PersonalMeetingResolution.Missed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PersonalMeetingResolution.CanceledByCaller.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
