package defpackage;

import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionOperationState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class cd8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardDeletionOperationState.values().length];
        try {
            iArr[CardDeletionOperationState.CONFIRMATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardDeletionOperationState.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardDeletionOperationState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardDeletionOperationState.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
