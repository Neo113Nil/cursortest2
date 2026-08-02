package defpackage;

import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferListItemData$PartnerWithAction$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class bi90 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransferListItemData$PartnerWithAction$Status.values().length];
        try {
            iArr[TransferListItemData$PartnerWithAction$Status.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferListItemData$PartnerWithAction$Status.CHECKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferListItemData$PartnerWithAction$Status.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferListItemData$PartnerWithAction$Status.FOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[PartnerWithAction$Status.values().length];
        try {
            iArr2[PartnerWithAction$Status.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PartnerWithAction$Status.CHECKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PartnerWithAction$Status.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PartnerWithAction$Status.FOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
