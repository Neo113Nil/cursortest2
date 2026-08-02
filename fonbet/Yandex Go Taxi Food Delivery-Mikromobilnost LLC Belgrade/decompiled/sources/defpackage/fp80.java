package defpackage;

import com.yandex.go.places.impl.ui.organizations.data.PageRequestState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class fp80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PageRequestState.values().length];
        try {
            iArr[PageRequestState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PageRequestState.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
