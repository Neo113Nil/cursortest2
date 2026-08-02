package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class k190 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapObjectComponentType.values().length];
        try {
            iArr[MapObjectComponentType.BODY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapObjectComponentType.LABEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapObjectComponentType.BUBBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MapObjectComponentType.OVERLAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MapObjectComponentType.IMAGE_OVERLAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
