package defpackage;

import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import ru.yandex.taxi.plus.api.dto.state.plaque.DisplayWidgetRules;
import ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class i0k {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ColorSettings.Type.values().length];
        try {
            iArr[ColorSettings.Type.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[ShapeSettings.CornerSettings.Type.values().length];
        try {
            iArr2[ShapeSettings.CornerSettings.Type.FIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ShapeSettings.CornerSettings.Type.HALF_HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[DisplayWidgetRules.Type.values().length];
        try {
            iArr3[DisplayWidgetRules.Type.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[DisplayWidgetRules.Type.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[DisplayWidgetRules.Type.FIX.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
