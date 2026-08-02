package defpackage;

import com.ybsdk.common.entities.ApplicationTypeEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class nwv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ApplicationTypeEntity.values().length];
        try {
            iArr[ApplicationTypeEntity.CHANGE_PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationTypeEntity.REGISTRATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
