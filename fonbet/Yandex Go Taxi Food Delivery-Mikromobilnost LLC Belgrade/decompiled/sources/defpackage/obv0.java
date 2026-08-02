package defpackage;

import ru.yandex.taxi.persuggest.api.ActionType;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class obv0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EntryPoint.values().length];
        try {
            iArr[EntryPoint.LONG_TAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EntryPoint.DOTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ActionType.values().length];
        try {
            iArr2[ActionType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ActionType.SEARCH_IN_GOOGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
