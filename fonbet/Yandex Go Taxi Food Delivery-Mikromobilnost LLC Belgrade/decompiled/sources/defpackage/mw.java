package defpackage;

import com.yandex.go.places.models.data.entities.network.ActionDto$WebAuthType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class mw {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionDto$WebAuthType.values().length];
        try {
            iArr[ActionDto$WebAuthType.COOKIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionDto$WebAuthType.OAUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionDto$WebAuthType.NO_AUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
