package defpackage;

import com.yandex.go.trusted_contacts.analytics.ContactType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class lg11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContactType.values().length];
        try {
            iArr[ContactType.TRUSTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContactType.TRUSTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
