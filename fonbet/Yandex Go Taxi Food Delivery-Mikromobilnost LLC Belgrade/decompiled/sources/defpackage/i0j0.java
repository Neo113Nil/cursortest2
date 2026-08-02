package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.Scroller$Direction;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i0j0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[LayoutDirection.values().length];
        try {
            iArr2[LayoutDirection.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[LayoutDirection.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[Scroller$Direction.values().length];
        try {
            iArr3[Scroller$Direction.FORWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[Scroller$Direction.BACKWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
