package defpackage;

import com.yandex.go.dto.response.Action$Payload;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class nq00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action$Payload.Mode.values().length];
        try {
            iArr[Action$Payload.Mode.ALL_OBJECT_TYPES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
