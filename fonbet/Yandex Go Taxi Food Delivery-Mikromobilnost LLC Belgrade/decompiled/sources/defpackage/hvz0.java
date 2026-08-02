package defpackage;

import ru.yandex.taxi.widget.TooltipPointerDrawer$Direction;
import ru.yandex.taxi.widget.TooltipPointerDrawer$PointerGravity;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class hvz0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TooltipPointerDrawer$Direction.values().length];
        try {
            iArr[TooltipPointerDrawer$Direction.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TooltipPointerDrawer$Direction.UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TooltipPointerDrawer$Direction.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TooltipPointerDrawer$Direction.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TooltipPointerDrawer$Direction.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[TooltipPointerDrawer$PointerGravity.values().length];
        try {
            iArr2[TooltipPointerDrawer$PointerGravity.END.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TooltipPointerDrawer$PointerGravity.START.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TooltipPointerDrawer$PointerGravity.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
