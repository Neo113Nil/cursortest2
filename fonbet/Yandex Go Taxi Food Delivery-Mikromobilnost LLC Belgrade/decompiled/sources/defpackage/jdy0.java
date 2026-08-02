package defpackage;

import com.yandex.messaging.ui.settings.inviteLinkInfo.InviteLinkType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class jdy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InviteLinkType.values().length];
        try {
            iArr[InviteLinkType.PERMANENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InviteLinkType.TEMPORARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
