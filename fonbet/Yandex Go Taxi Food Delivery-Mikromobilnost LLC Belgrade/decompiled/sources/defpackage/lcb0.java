package defpackage;

import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class lcb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PfmResponse.FilterMode.values().length];
        try {
            iArr[PfmResponse.FilterMode.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PfmResponse.FilterMode.SELECTABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PfmResponse.FilterMode.SELECTABLE_AND_RESETTABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
