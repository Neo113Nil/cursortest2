package defpackage;

import com.yandex.go.trusted_contacts.domain.entities.DialogButton;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class plr0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ShareSettingsMode.values().length];
        try {
            iArr[ShareSettingsMode.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShareSettingsMode.EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DialogButton.values().length];
        try {
            iArr2[DialogButton.ADDITIONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DialogButton.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
