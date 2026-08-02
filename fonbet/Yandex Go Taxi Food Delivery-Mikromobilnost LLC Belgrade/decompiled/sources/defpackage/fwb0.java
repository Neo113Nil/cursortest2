package defpackage;

import com.yandex.go.pin.api.widget.PinTypeRepository$PinType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class fwb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinTypeRepository$PinType.values().length];
        try {
            iArr[PinTypeRepository$PinType.V1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinTypeRepository$PinType.V2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
