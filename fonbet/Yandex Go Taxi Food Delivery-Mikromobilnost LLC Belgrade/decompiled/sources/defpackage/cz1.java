package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class cz1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Alternatives.ConfirmationScreen.ActionType.values().length];
        try {
            iArr[Alternatives.ConfirmationScreen.ActionType.CONFIRM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Alternatives.ConfirmationScreen.ActionType.CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Alternatives.ConfirmationScreen.ActionType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[Orientation.values().length];
        try {
            iArr2[Orientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Orientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
