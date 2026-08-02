package defpackage;

import com.yandex.plus.core.graphql.type.INVITE_CANCELLATION_REASON;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class mww {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[INVITE_CANCELLATION_REASON.values().length];
        try {
            iArr[INVITE_CANCELLATION_REASON.MAX_FAMILY_MEMBERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[INVITE_CANCELLATION_REASON.USER_HAS_NO_FAMILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[INVITE_CANCELLATION_REASON.USER_IS_A_FAMILY_CHILD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[INVITE_CANCELLATION_REASON.USER_REGION_IS_NOT_SUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[INVITE_CANCELLATION_REASON.UNKNOWN_REASON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[INVITE_CANCELLATION_REASON.UNKNOWN__.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[INVITE_CANCELLATION_REASON.NO_REASONS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
