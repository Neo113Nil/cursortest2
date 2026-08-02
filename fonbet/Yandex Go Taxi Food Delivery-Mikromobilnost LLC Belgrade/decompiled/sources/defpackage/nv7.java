package defpackage;

import com.yandex.delivery.mapper.model.CancelType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class nv7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CancelType.values().length];
        try {
            iArr[CancelType.FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CancelType.PAID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
