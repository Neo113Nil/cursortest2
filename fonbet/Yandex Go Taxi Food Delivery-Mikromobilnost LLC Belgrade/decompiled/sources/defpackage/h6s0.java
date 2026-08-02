package defpackage;

import com.yandex.delivery.mapper.model.policies.ShowPolicy$LimitedCount$Lifetime;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class h6s0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShowPolicy$LimitedCount$Lifetime.values().length];
        try {
            iArr[ShowPolicy$LimitedCount$Lifetime.PERSISTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShowPolicy$LimitedCount$Lifetime.SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
