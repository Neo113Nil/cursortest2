package defpackage;

import ru.rt.ebs.cryptosdk.presentation.customView.TextWithBulletPointType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class jnf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextWithBulletPointType.values().length];
        try {
            iArr[TextWithBulletPointType.BIOMETRY_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextWithBulletPointType.FAILED_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
