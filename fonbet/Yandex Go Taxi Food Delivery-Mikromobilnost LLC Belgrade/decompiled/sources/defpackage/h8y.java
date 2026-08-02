package defpackage;

import ru.yandex.taxi.location.dto.LbsResponse;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h8y {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LbsResponse.Type.values().length];
        try {
            iArr[LbsResponse.Type.WIFI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LbsResponse.Type.GSM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
