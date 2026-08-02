package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class hyu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HubOnboardingType.values().length];
        try {
            iArr[HubOnboardingType.ONLY_EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HubOnboardingType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HubOnboardingType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
