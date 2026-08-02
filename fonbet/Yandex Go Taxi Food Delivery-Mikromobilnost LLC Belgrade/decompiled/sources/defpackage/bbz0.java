package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline.TimelineItemStatusDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class bbz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimelineItemStatusDto.values().length];
        try {
            iArr[TimelineItemStatusDto.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimelineItemStatusDto.PASSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
