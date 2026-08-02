package defpackage;

import ru.yandex.taxi.persuggest.api.ActionButtonSize;
import ru.yandex.taxi.persuggest.api.AdditionalButtonStyle;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gl0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ActionButtonSize.values().length];
        try {
            iArr[ActionButtonSize.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionButtonSize.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionButtonSize.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActionButtonSize.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[AdditionalButtonStyle.values().length];
        try {
            iArr2[AdditionalButtonStyle.ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
