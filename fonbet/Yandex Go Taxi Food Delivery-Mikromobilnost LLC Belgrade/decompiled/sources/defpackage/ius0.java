package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ius0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlotSize.values().length];
        try {
            iArr[SlotSize.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotSize.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
