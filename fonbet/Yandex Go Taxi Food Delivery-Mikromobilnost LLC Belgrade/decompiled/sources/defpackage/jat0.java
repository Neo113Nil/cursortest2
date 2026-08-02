package defpackage;

import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationButton;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jat0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressConfirmationButton.ButtonStyle.values().length];
        try {
            iArr[AddressConfirmationButton.ButtonStyle.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressConfirmationButton.ButtonStyle.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
