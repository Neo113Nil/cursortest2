package defpackage;

import ru.yandex.taxi.design.utils.RecyclerShadowController$Type;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class oji0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RecyclerShadowController$Type.values().length];
        try {
            iArr[RecyclerShadowController$Type.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RecyclerShadowController$Type.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RecyclerShadowController$Type.START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RecyclerShadowController$Type.END.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
