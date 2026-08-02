package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.v2.EditFieldEntity$Type;
import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class kv3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EditFieldEntity$Type.values().length];
        try {
            iArr[EditFieldEntity$Type.THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EditFieldEntity$Type.AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EditFieldEntity$Type.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[AutoTopupType.values().length];
        try {
            iArr2[AutoTopupType.THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AutoTopupType.AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
