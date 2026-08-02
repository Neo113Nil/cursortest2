package defpackage;

import com.yandex.go.preorder.navigation.ModalsVisibility;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class jal0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModalsVisibility.values().length];
        try {
            iArr[ModalsVisibility.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalsVisibility.HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
