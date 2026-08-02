package defpackage;

import com.yandex.go.design.compose.check.CheckSize;
import com.yandex.go.design.compose.check.CheckState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class p8h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CheckState.values().length];
        try {
            iArr[CheckState.Checked.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckState.Unchecked.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckState.Mixed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[CheckSize.values().length];
        try {
            iArr2[CheckSize.M.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CheckSize.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
