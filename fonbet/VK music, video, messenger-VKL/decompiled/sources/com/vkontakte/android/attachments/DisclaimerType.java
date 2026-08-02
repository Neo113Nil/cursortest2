package com.vkontakte.android.attachments;

import com.ironsource.X3;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisclaimerData.kt */
/* loaded from: classes7.dex */
public final class DisclaimerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DisclaimerType[] $VALUES;
    public static final DisclaimerType BANKRUPTCY;
    public static final DisclaimerType CREDITS;
    public static final DisclaimerType DRUG;
    public static final DisclaimerType ENERGETICS;
    public static final DisclaimerType SUPPLEMENT;
    private final String value;

    static {
        DisclaimerType disclaimerType = new DisclaimerType("DRUG", 0, "drug");
        DRUG = disclaimerType;
        DisclaimerType disclaimerType2 = new DisclaimerType("SUPPLEMENT", 1, "supplement");
        SUPPLEMENT = disclaimerType2;
        DisclaimerType disclaimerType3 = new DisclaimerType("CREDITS", 2, X3.i.k);
        CREDITS = disclaimerType3;
        DisclaimerType disclaimerType4 = new DisclaimerType("BANKRUPTCY", 3, "bankruptcy");
        BANKRUPTCY = disclaimerType4;
        DisclaimerType disclaimerType5 = new DisclaimerType("ENERGETICS", 4, "energetics");
        ENERGETICS = disclaimerType5;
        DisclaimerType[] disclaimerTypeArr = {disclaimerType, disclaimerType2, disclaimerType3, disclaimerType4, disclaimerType5};
        $VALUES = disclaimerTypeArr;
        $ENTRIES = new asp(disclaimerTypeArr);
    }

    public DisclaimerType(String str, int i, String str2) {
        this.value = str2;
    }

    public static DisclaimerType valueOf(String str) {
        return (DisclaimerType) Enum.valueOf(DisclaimerType.class, str);
    }

    public static DisclaimerType[] values() {
        return (DisclaimerType[]) $VALUES.clone();
    }
}
