package defpackage;

import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class k3b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OptionType.values().length];
        try {
            iArr[OptionType.REDIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionType.SELECT_PAYMENT_THEN_REDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OptionType.EDIT_COMMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OptionType.DELETE_COMMENT_AND_ORDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
