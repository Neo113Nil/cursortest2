package defpackage;

import core.network.mapi.exception.IssueType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class iah {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IssueType.values().length];
        try {
            iArr[IssueType.PARSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IssueType.COMMUNICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
