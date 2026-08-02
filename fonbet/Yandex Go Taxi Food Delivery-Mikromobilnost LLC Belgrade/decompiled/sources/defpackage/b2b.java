package defpackage;

import com.yandex.go.quark.api.router.QuarkDynamicFeatureRouter$Payload$DisplayMode;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class b2b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QuarkDynamicFeatureRouter$Payload$DisplayMode.values().length];
        try {
            iArr[QuarkDynamicFeatureRouter$Payload$DisplayMode.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QuarkDynamicFeatureRouter$Payload$DisplayMode.Headerless.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
