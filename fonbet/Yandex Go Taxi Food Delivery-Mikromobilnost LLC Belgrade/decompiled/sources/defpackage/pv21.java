package defpackage;

import com.yandex.go.requirements.api.domain.model.OptionViewStyle;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class pv21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OptionViewStyle.values().length];
        try {
            iArr[OptionViewStyle.SPINNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionViewStyle.CHECKBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OptionViewStyle.RADIO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
