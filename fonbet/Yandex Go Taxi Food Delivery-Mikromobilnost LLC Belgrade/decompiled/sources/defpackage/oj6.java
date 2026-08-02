package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class oj6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServiceLevel.Branding.Type.values().length];
        try {
            iArr[ServiceLevel.Branding.Type.START_PIN_APPERANCE_OVERRIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServiceLevel.Branding.Type.START_PIN_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServiceLevel.Branding.Type.DETAILED_START_PIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServiceLevel.Branding.Type.DETAILED_FINISH_PIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ServiceLevel.Branding.Type.COMBO_INNER_PIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
