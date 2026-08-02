package defpackage;

import com.yandex.go.rida.dialog_modal.DialogModalUiAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class oej {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DialogModalUiAction.values().length];
        try {
            iArr[DialogModalUiAction.OnAccept.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DialogModalUiAction.OnCancel.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
