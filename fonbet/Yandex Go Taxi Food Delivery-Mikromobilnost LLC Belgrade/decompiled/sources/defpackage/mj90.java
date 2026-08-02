package defpackage;

import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mj90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PartnerSelectionFeature$Companion$Entry.values().length];
        try {
            iArr[PartnerSelectionFeature$Companion$Entry.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartnerSelectionFeature$Companion$Entry.EXTERNAL_BANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
