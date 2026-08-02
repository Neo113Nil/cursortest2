package defpackage;

import com.yandex.go.multimodal_route.api.MultimodalRouteRootPayload$Source;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class mu40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MultimodalRouteRootPayload$Source.values().length];
        try {
            iArr[MultimodalRouteRootPayload$Source.Hub.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MultimodalRouteRootPayload$Source.Taxi.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MultimodalRouteRootPayload$Source.Transport.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
