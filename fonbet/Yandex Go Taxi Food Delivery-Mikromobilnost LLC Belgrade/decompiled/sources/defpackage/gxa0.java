package defpackage;

import com.yandex.delivery.mapper.model.PinStrategy$PinType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gxa0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinStrategy$PinType.values().length];
        try {
            iArr[PinStrategy$PinType.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinStrategy$PinType.PEDESTRIAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
