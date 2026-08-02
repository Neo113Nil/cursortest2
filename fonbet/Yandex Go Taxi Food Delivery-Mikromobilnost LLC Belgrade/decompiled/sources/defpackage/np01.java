package defpackage;

import com.yandex.go.transfer_requirement.card_state.DoneButtonAction;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class np01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DoneButtonAction.values().length];
        try {
            iArr[DoneButtonAction.REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DoneButtonAction.RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
