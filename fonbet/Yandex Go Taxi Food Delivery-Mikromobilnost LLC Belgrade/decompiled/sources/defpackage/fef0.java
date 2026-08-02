package defpackage;

import com.yandex.go.profile.domain.data.Sources;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class fef0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Sources.values().length];
        try {
            iArr[Sources.FALLBACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Sources.CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Sources.NETWORK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
