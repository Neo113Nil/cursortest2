package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class jo70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderChangesDto.Status.values().length];
        try {
            iArr[OrderChangesDto.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderChangesDto.Status.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderChangesDto.Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderChangesDto.Status.UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
