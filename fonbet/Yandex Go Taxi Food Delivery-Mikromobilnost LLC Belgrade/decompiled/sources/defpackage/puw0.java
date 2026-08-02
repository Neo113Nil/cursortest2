package defpackage;

import ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto$ActionButtonStyle;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class puw0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.values().length];
        try {
            iArr[SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SurgeButtonActionDto$ActionButtonStyle.values().length];
        try {
            iArr2[SurgeButtonActionDto$ActionButtonStyle.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SurgeButtonActionDto$ActionButtonStyle.ACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
