package com.yandex.go.payments.cards.nfc.enums;

import defpackage.ddb1;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R*\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/enums/EmvCardScheme;", "", "", "", "aidsByte", "[[B", "a", "()[[B", "setAidsByte", "([[B)V", "MIR", "AMERICAN_EXPRESS", "UNIONPAY", "CIRRUS", "DANKORT", "DINERS_CLUB_INTERNATIONAL", "JCB", "MAESTRO", "RUPAY", "MASTER_CARD", "VISA", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmvCardScheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EmvCardScheme[] $VALUES;
    public static final EmvCardScheme AMERICAN_EXPRESS;
    public static final EmvCardScheme CIRRUS;
    public static final EmvCardScheme DANKORT;
    public static final EmvCardScheme DINERS_CLUB_INTERNATIONAL;
    public static final EmvCardScheme JCB;
    public static final EmvCardScheme MAESTRO;
    public static final EmvCardScheme MASTER_CARD;
    public static final EmvCardScheme MIR;
    public static final EmvCardScheme RUPAY;
    public static final EmvCardScheme UNIONPAY;
    public static final EmvCardScheme VISA;
    private byte[][] aidsByte;

    static {
        EmvCardScheme emvCardScheme = new EmvCardScheme("MIR", new String[]{"A0 00 00 06", "A0 00 00 06 58 20 10", "A0 00 00 06 58 20 10"}, 0);
        MIR = emvCardScheme;
        EmvCardScheme emvCardScheme2 = new EmvCardScheme("AMERICAN_EXPRESS", new String[]{"A0 00 00 00 25 00 00"}, 1);
        AMERICAN_EXPRESS = emvCardScheme2;
        EmvCardScheme emvCardScheme3 = new EmvCardScheme("UNIONPAY", new String[]{"A0 00 00 03 33 01 01 01", "A0 00 00 03 33 01 01 02"}, 2);
        UNIONPAY = emvCardScheme3;
        EmvCardScheme emvCardScheme4 = new EmvCardScheme("CIRRUS", new String[]{"A0 00 00 00 04 60 00"}, 3);
        CIRRUS = emvCardScheme4;
        EmvCardScheme emvCardScheme5 = new EmvCardScheme("DANKORT", new String[]{"A0 00 00 01 21 10 10"}, 4);
        DANKORT = emvCardScheme5;
        EmvCardScheme emvCardScheme6 = new EmvCardScheme("DINERS_CLUB_INTERNATIONAL", new String[]{"A0 00 00 01 52 30 10", "A0 00 00 01 52 40 10"}, 5);
        DINERS_CLUB_INTERNATIONAL = emvCardScheme6;
        EmvCardScheme emvCardScheme7 = new EmvCardScheme("JCB", new String[]{"A0 00 00 00 65 10", "A0 00 00 00 65 10 10"}, 6);
        JCB = emvCardScheme7;
        EmvCardScheme emvCardScheme8 = new EmvCardScheme("MAESTRO", new String[]{"A0 00 00 00 04 30 60", "A0 00 00 00 04 30 60 01"}, 7);
        MAESTRO = emvCardScheme8;
        EmvCardScheme emvCardScheme9 = new EmvCardScheme("RUPAY", new String[]{"A0 00 00 05 24 10 10"}, 8);
        RUPAY = emvCardScheme9;
        EmvCardScheme emvCardScheme10 = new EmvCardScheme("MASTER_CARD", new String[]{"A0 00 00 00 05", "A0 00 00 00 04", "A0 00 00 00 04 10 10", "A0 00 00 00 04 10 10 12 13", "A0 00 00 00 04 10 10 12 15"}, 9);
        MASTER_CARD = emvCardScheme10;
        EmvCardScheme emvCardScheme11 = new EmvCardScheme("VISA", new String[]{"A0 00 00 00 03", "A0 00 00 00 98", "A0 00 00 00 03 05 07 60 10", "A0 00 00 00 03 10 10", "A0 00 00 00 03 10 10 01", "A0 00 00 00 03 10 10 02", "A0 00 00 00 03 20 20"}, 10);
        VISA = emvCardScheme11;
        EmvCardScheme[] emvCardSchemeArr = {emvCardScheme, emvCardScheme2, emvCardScheme3, emvCardScheme4, emvCardScheme5, emvCardScheme6, emvCardScheme7, emvCardScheme8, emvCardScheme9, emvCardScheme10, emvCardScheme11};
        $VALUES = emvCardSchemeArr;
        $ENTRIES = a.a(emvCardSchemeArr);
    }

    public EmvCardScheme(String str, String[] strArr, int i) {
        this.aidsByte = new byte[strArr.length][];
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.aidsByte[i2] = ddb1.b(strArr[i2]);
        }
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static EmvCardScheme valueOf(String str) {
        return (EmvCardScheme) Enum.valueOf(EmvCardScheme.class, str);
    }

    public static EmvCardScheme[] values() {
        return (EmvCardScheme[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final byte[][] getAidsByte() {
        return this.aidsByte;
    }
}
