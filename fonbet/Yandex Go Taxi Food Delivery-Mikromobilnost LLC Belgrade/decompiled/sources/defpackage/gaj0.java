package defpackage;

import ru.yandex.taxi.preorder.summary.altchoice.domain.RequiredOptionType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gaj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequiredOptionType.values().length];
        try {
            iArr[RequiredOptionType.ALT_CHOICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequiredOptionType.DELIVERY_INTERVALS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
