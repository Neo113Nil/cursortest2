package defpackage;

import com.yandex.div.core.view2.items.Direction;
import com.yandex.div2.DivSizeUnit;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class bql {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Direction.values().length];
        try {
            iArr[Direction.PREVIOUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Direction.NEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DivSizeUnit.values().length];
        try {
            iArr2[DivSizeUnit.PX.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DivSizeUnit.SP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DivSizeUnit.DP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
