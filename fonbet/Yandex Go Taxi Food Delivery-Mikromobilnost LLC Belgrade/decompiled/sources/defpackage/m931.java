package defpackage;

import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioSampleType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m931 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BioSampleType.values().length];
        try {
            iArr[BioSampleType.PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BioSampleType.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
