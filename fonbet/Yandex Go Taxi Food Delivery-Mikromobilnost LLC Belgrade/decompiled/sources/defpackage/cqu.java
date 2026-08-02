package defpackage;

import ru.yandex.taxi.logistics.sdk.dashboard.model.common.HorizontalAlignmentModel;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cqu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HorizontalAlignmentModel.values().length];
        try {
            iArr[HorizontalAlignmentModel.BEGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HorizontalAlignmentModel.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HorizontalAlignmentModel.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
