package defpackage;

import com.yandex.delivery.mapper.model.TimelineItemStatus;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fcz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimelineItemStatus.values().length];
        try {
            iArr[TimelineItemStatus.PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimelineItemStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TimelineItemStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
