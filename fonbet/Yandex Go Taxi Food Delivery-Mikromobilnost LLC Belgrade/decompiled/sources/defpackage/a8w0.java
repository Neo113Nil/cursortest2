package defpackage;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a8w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdditionalAction.values().length];
        try {
            iArr[AdditionalAction.PREORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdditionalAction.ORDER_TO_ANOTHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
