package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.v2.EditFieldEntity$Type;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class h14 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EditFieldEntity$Type.values().length];
        try {
            iArr[EditFieldEntity$Type.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EditFieldEntity$Type.THRESHOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EditFieldEntity$Type.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
