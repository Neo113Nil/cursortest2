package defpackage;

import com.yandex.go.tariffcard.api.experiment.HeaderCollapseButtonType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ktz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HeaderCollapseButtonType.values().length];
        try {
            iArr[HeaderCollapseButtonType.CROSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HeaderCollapseButtonType.BACK_ARROW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
