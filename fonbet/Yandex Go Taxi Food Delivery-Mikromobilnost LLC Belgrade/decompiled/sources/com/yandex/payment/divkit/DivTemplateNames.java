package com.yandex.payment.divkit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/payment/divkit/DivTemplateNames;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SELECT", "CVV", "BANK_SELECT", "EXIT", IDialogId.INTENT_EXTRA_OUT_RESULT, "SBP_LICENSE", "SBP_CHALLENGER", "CARD_INPUT_SCREEN", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DivTemplateNames {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DivTemplateNames[] $VALUES;
    public static final DivTemplateNames BANK_SELECT;
    public static final DivTemplateNames CARD_INPUT_SCREEN;
    public static final DivTemplateNames CVV;
    public static final DivTemplateNames EXIT;
    public static final DivTemplateNames RESULT;
    public static final DivTemplateNames SBP_CHALLENGER;
    public static final DivTemplateNames SBP_LICENSE;
    public static final DivTemplateNames SELECT;
    private final String value;

    static {
        DivTemplateNames divTemplateNames = new DivTemplateNames("SELECT", 0, "VerticalGalleryForSelectFragment");
        SELECT = divTemplateNames;
        DivTemplateNames divTemplateNames2 = new DivTemplateNames("CVV", 1, "CvvConfirmFragment");
        CVV = divTemplateNames2;
        DivTemplateNames divTemplateNames3 = new DivTemplateNames("BANK_SELECT", 2, "SelectBankScreen");
        BANK_SELECT = divTemplateNames3;
        DivTemplateNames divTemplateNames4 = new DivTemplateNames("EXIT", 3, "ExitScreen");
        EXIT = divTemplateNames4;
        DivTemplateNames divTemplateNames5 = new DivTemplateNames(IDialogId.INTENT_EXTRA_OUT_RESULT, 4, "ResultScreen");
        RESULT = divTemplateNames5;
        DivTemplateNames divTemplateNames6 = new DivTemplateNames("SBP_LICENSE", 5, "SbpLegalAgreementView");
        SBP_LICENSE = divTemplateNames6;
        DivTemplateNames divTemplateNames7 = new DivTemplateNames("SBP_CHALLENGER", 6, "ChallengerScreen");
        SBP_CHALLENGER = divTemplateNames7;
        DivTemplateNames divTemplateNames8 = new DivTemplateNames("CARD_INPUT_SCREEN", 7, "CardInputScreen");
        CARD_INPUT_SCREEN = divTemplateNames8;
        DivTemplateNames[] divTemplateNamesArr = {divTemplateNames, divTemplateNames2, divTemplateNames3, divTemplateNames4, divTemplateNames5, divTemplateNames6, divTemplateNames7, divTemplateNames8};
        $VALUES = divTemplateNamesArr;
        $ENTRIES = a.a(divTemplateNamesArr);
    }

    public DivTemplateNames(String str, int i, String str2) {
        this.value = str2;
    }

    public static DivTemplateNames valueOf(String str) {
        return (DivTemplateNames) Enum.valueOf(DivTemplateNames.class, str);
    }

    public static DivTemplateNames[] values() {
        return (DivTemplateNames[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
