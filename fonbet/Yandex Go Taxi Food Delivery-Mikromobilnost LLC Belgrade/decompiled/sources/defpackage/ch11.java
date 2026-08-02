package defpackage;

import com.yandex.go.trusted_contacts.ui.TrustedContactsButtonAction;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ch11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrustedContactsButtonAction.values().length];
        try {
            iArr[TrustedContactsButtonAction.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrustedContactsButtonAction.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
