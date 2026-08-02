package defpackage;

import com.yandex.plus.pay.api.model.SyncType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class q0x0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SyncType.values().length];
        try {
            iArr[SyncType.PASSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
