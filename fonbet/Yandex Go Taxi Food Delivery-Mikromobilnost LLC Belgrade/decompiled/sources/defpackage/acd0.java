package defpackage;

import com.yandex.plus.pay.repository.api.model.family.InviteToFamilyWebUrlResult$Cancelled$Reason;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class acd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InviteToFamilyWebUrlResult$Cancelled$Reason.values().length];
        try {
            iArr[InviteToFamilyWebUrlResult$Cancelled$Reason.MAX_FAMILY_MEMBERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InviteToFamilyWebUrlResult$Cancelled$Reason.USER_HAS_NO_FAMILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InviteToFamilyWebUrlResult$Cancelled$Reason.USER_IS_A_FAMILY_CHILD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InviteToFamilyWebUrlResult$Cancelled$Reason.USER_REGION_IS_NOT_SUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InviteToFamilyWebUrlResult$Cancelled$Reason.UNKNOWN_REASON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
