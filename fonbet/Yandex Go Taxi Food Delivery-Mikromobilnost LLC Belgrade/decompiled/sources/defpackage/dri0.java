package defpackage;

import com.ybsdk.common.entities.ApplicationStatusEntity$Status;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class dri0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DataWithStatusResponse.Status.values().length];
        try {
            iArr[DataWithStatusResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataWithStatusResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataWithStatusResponse.Status.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ApplicationStatusEntity$Status.values().length];
        try {
            iArr2[ApplicationStatusEntity$Status.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ApplicationStatusEntity$Status.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ApplicationStatusEntity$Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ApplicationStatusEntity$Status.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
