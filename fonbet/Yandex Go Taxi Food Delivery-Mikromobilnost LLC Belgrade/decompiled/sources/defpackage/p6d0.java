package defpackage;

import com.yandex.go.design.compose.plus.text.PlusNewSize;
import com.yandex.go.design.compose.plus.text.PlusNewType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class p6d0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusNewSize.values().length];
        try {
            iArr[PlusNewSize.Caption1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusNewSize.Caption1Bold.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusNewSize.Caption2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusNewType.values().length];
        try {
            iArr2[PlusNewType.Gradient.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlusNewType.Color.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlusNewType.GradientSign.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlusNewType.Disabled.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
