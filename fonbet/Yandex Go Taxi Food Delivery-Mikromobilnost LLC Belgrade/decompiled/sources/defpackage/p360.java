package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery.state.NeuroPostcardButton$Size;
import ru.yandex.taxi.logistics.sdk.delivery.state.NeuroPostcardButton$Style;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class p360 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[NeuroPostcardButton$Style.values().length];
        try {
            iArr[NeuroPostcardButton$Style.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NeuroPostcardButton$Style.FLOATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NeuroPostcardButton$Style.MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[NeuroPostcardButton$Size.values().length];
        try {
            iArr2[NeuroPostcardButton$Size.S.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NeuroPostcardButton$Size.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NeuroPostcardButton$Size.L.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
