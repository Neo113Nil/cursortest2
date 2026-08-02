package defpackage;

import core.network.mapi.exception.IssueType;
import flex.health.ErrorTypes;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ey {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[IssueType.values().length];
        try {
            iArr[IssueType.COMMUNICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IssueType.PARSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ErrorTypes.values().length];
        try {
            iArr2[ErrorTypes.ACTION_SERVICE_REQUEST_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ErrorTypes.ACTION_SERVICE_PARSE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
