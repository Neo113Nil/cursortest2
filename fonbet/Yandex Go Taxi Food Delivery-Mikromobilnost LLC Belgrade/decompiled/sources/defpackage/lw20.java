package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository.HubContentState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class lw20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HubContentState.values().length];
        try {
            iArr[HubContentState.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HubContentState.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HubContentState.CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
