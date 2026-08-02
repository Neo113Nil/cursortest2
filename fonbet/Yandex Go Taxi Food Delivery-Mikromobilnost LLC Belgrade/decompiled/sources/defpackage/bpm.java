package defpackage;

import com.yx360.design.compose.atoms.DsButtonClose$Type;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class bpm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DsButtonClose$Type.values().length];
        try {
            iArr[DsButtonClose$Type.Back.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsButtonClose$Type.Close.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
