package defpackage;

import com.yandex.go.loyalty.api.data.model.common.ColorSettings;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class cwz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ColorSettings.Type.values().length];
        try {
            iArr[ColorSettings.Type.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ColorSettings.Type.RADIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ColorSettings.Type.TRANSPARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
