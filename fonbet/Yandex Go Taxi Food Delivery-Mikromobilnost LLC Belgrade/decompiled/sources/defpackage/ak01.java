package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferSkeletonType;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment$Companion$PagerScrollType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ak01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransferSkeletonType.values().length];
        try {
            iArr[TransferSkeletonType.ACTION_BUTTONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferSkeletonType.PILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferSkeletonType.SUGGESTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferSkeletonType.SCENARIO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferMainFragment$Companion$PagerScrollType.values().length];
        try {
            iArr2[TransferMainFragment$Companion$PagerScrollType.INSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TransferMainFragment$Companion$PagerScrollType.SMOOTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
