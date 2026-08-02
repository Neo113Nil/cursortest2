package defpackage;

import com.yandex.go.places.api.navigation.OrganizationCardExternalOverridesConfig$ConfigOption;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ie80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrganizationCardExternalOverridesConfig$ConfigOption.values().length];
        try {
            iArr[OrganizationCardExternalOverridesConfig$ConfigOption.LOW_ANCHORED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrganizationCardExternalOverridesConfig$ConfigOption.WITHOUT_GALLERY_ON_ANCHORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrganizationCardExternalOverridesConfig$ConfigOption.USES_EXTERNAL_MAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrganizationCardExternalOverridesConfig$ConfigOption.WITHOUT_MAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
