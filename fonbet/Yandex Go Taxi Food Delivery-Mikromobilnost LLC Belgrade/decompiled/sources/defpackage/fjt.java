package defpackage;

import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.GlobalProcessingState;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class fjt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GlobalProcessingState.values().length];
        try {
            iArr[GlobalProcessingState.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GlobalProcessingState.ADDITIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
