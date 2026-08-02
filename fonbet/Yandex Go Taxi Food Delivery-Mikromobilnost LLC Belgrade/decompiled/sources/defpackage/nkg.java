package defpackage;

import com.ybsdk.feature.dashboard.internal.domain.entities.TopButtonTag;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class nkg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TopButtonTag.values().length];
        try {
            iArr[TopButtonTag.SUPPORT_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopButtonTag.PROFILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TopButtonTag.QR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TopButtonTag.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
