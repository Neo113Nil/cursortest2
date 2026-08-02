package defpackage;

import com.ybsdk.common.entities.SupportStateEntity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class bjg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SupportStateEntity.values().length];
        try {
            iArr[SupportStateEntity.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportStateEntity.HAS_UNREAD_MESSAGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
