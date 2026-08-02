package defpackage;

import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class krz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LostItemsApiResponse.Modal.Header.Type.values().length];
        try {
            iArr[LostItemsApiResponse.Modal.Header.Type.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LostItemsApiResponse.Modal.Header.Type.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LostItemsApiResponse.Modal.Header.Type.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
