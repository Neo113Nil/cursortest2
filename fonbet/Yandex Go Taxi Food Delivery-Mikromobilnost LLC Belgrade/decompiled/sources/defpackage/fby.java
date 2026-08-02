package defpackage;

import com.yandex.plus.core.graphql.type.LEGAL_ITEM_TYPE;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class fby {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LEGAL_ITEM_TYPE.values().length];
        try {
            iArr[LEGAL_ITEM_TYPE.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LEGAL_ITEM_TYPE.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LEGAL_ITEM_TYPE.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
