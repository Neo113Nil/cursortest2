package defpackage;

import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class bvd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointSelectionSettingsInteractor$PointType.values().length];
        try {
            iArr[PointSelectionSettingsInteractor$PointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointSelectionSettingsInteractor$PointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
