package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.domain.model.ContactPolicyType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class kbe {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContactPolicyType.values().length];
        try {
            iArr[ContactPolicyType.MINUTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContactPolicyType.HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContactPolicyType.DAYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
