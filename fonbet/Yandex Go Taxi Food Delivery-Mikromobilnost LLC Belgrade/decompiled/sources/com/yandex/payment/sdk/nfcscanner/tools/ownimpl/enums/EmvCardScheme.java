package com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums;

import defpackage.cdb1;
import defpackage.k4o;
import defpackage.qxn;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\b\u0080\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lcom/yandex/payment/sdk/nfcscanner/tools/ownimpl/enums/EmvCardScheme;", "", "", "", "aid", "[Ljava/lang/String;", "getAid", "()[Ljava/lang/String;", "", "aidByte", "[[B", "a", "()[[B", "Ljava/util/regex/Pattern;", "pattern", "Ljava/util/regex/Pattern;", "Companion", "qxn", "UNKNOWN", "VISA", "NAB_VISA", "MASTER_CARD", "AMERICAN_EXPRESS", "CB", "LINK", "JCB", "DANKORT", "COGEBAN", "DISCOVER", "BANRISUL", "SPAN", "INTERAC", "ZIP", "UNIONPAY", "EAPS", "VERVE", "TENN", "RUPAY", "ПРО100", "ZKA", "BANKAXEPT", "BRADESCO", "MIDLAND", "PBS", "ETRANZACT", "GOOGLE", "INTER_SWITCH", "MIR", "PROSTIR", "nfcscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmvCardScheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EmvCardScheme[] $VALUES;
    public static final EmvCardScheme AMERICAN_EXPRESS;
    public static final EmvCardScheme BANKAXEPT;
    public static final EmvCardScheme BANRISUL;
    public static final EmvCardScheme BRADESCO;
    public static final EmvCardScheme CB;
    public static final EmvCardScheme COGEBAN;
    public static final qxn Companion;
    public static final EmvCardScheme DANKORT;
    public static final EmvCardScheme DISCOVER;
    public static final EmvCardScheme EAPS;
    public static final EmvCardScheme ETRANZACT;
    public static final EmvCardScheme GOOGLE;
    public static final EmvCardScheme INTERAC;
    public static final EmvCardScheme INTER_SWITCH;
    public static final EmvCardScheme JCB;
    public static final EmvCardScheme LINK;
    public static final EmvCardScheme MASTER_CARD;
    public static final EmvCardScheme MIDLAND;
    public static final EmvCardScheme MIR;
    public static final EmvCardScheme NAB_VISA;
    public static final EmvCardScheme PBS;
    public static final EmvCardScheme PROSTIR;
    public static final EmvCardScheme RUPAY;
    public static final EmvCardScheme SPAN;
    public static final EmvCardScheme TENN;
    public static final EmvCardScheme UNIONPAY;
    public static final EmvCardScheme UNKNOWN;
    public static final EmvCardScheme VERVE;
    public static final EmvCardScheme VISA;
    public static final EmvCardScheme ZIP;
    public static final EmvCardScheme ZKA;

    /* renamed from: ПРО100, reason: contains not printable characters */
    public static final EmvCardScheme f19100;
    private final String[] aid;
    private final byte[][] aidByte;
    private Pattern pattern;

    static {
        EmvCardScheme emvCardScheme = new EmvCardScheme("UNKNOWN", 0, "", new String[0]);
        UNKNOWN = emvCardScheme;
        EmvCardScheme emvCardScheme2 = new EmvCardScheme("VISA", 1, "^4[0-9]{6,}$", "A0 00 00 00 03", "A0 00 00 00 03 10 10", "A0 00 00 00 98 08 48");
        VISA = emvCardScheme2;
        EmvCardScheme emvCardScheme3 = new EmvCardScheme("NAB_VISA", 2, "^4[0-9]{6,}$", "A0 00 00 00 03", "A0 00 00 03", "A0 00 00 00 03 10 10", "A0 00 00 00 98 08 48");
        NAB_VISA = emvCardScheme3;
        EmvCardScheme emvCardScheme4 = new EmvCardScheme("MASTER_CARD", 3, "^5[1-5][0-9]{5,}$", "A0 00 00 00 04", "A0 00 00 00 05");
        MASTER_CARD = emvCardScheme4;
        EmvCardScheme emvCardScheme5 = new EmvCardScheme("AMERICAN_EXPRESS", 4, "^3[47][0-9]{5,}$", "A0 00 00 00 25");
        AMERICAN_EXPRESS = emvCardScheme5;
        EmvCardScheme emvCardScheme6 = new EmvCardScheme("CB", 5, null, "A0 00 00 00 42");
        CB = emvCardScheme6;
        EmvCardScheme emvCardScheme7 = new EmvCardScheme("LINK", 6, null, "A0 00 00 00 29");
        LINK = emvCardScheme7;
        EmvCardScheme emvCardScheme8 = new EmvCardScheme("JCB", 7, "^(?:2131|1800|35[0-9]{3})[0-9]{3,}$", "A0 00 00 00 65");
        JCB = emvCardScheme8;
        EmvCardScheme emvCardScheme9 = new EmvCardScheme("DANKORT", 8, null, "A0 00 00 01 21 10 10");
        DANKORT = emvCardScheme9;
        EmvCardScheme emvCardScheme10 = new EmvCardScheme("COGEBAN", 9, null, "A0 00 00 01 41 00 01");
        COGEBAN = emvCardScheme10;
        EmvCardScheme emvCardScheme11 = new EmvCardScheme("DISCOVER", 10, "(6011|65|64[4-9]|622)[0-9]*", "A0 00 00 01 52 30 10");
        DISCOVER = emvCardScheme11;
        EmvCardScheme emvCardScheme12 = new EmvCardScheme("BANRISUL", 11, null, "A0 00 00 01 54");
        BANRISUL = emvCardScheme12;
        EmvCardScheme emvCardScheme13 = new EmvCardScheme("SPAN", 12, null, "A0 00 00 02 28");
        SPAN = emvCardScheme13;
        EmvCardScheme emvCardScheme14 = new EmvCardScheme("INTERAC", 13, null, "A0 00 00 02 77");
        INTERAC = emvCardScheme14;
        EmvCardScheme emvCardScheme15 = new EmvCardScheme("ZIP", 14, null, "A0 00 00 03 24");
        ZIP = emvCardScheme15;
        EmvCardScheme emvCardScheme16 = new EmvCardScheme("UNIONPAY", 15, "^62[0-9]{14,17}", "A0 00 00 03 33");
        UNIONPAY = emvCardScheme16;
        EmvCardScheme emvCardScheme17 = new EmvCardScheme("EAPS", 16, null, "A0 00 00 03 59");
        EAPS = emvCardScheme17;
        EmvCardScheme emvCardScheme18 = new EmvCardScheme("VERVE", 17, null, "A0 00 00 03 71");
        VERVE = emvCardScheme18;
        EmvCardScheme emvCardScheme19 = new EmvCardScheme("TENN", 18, null, "A0 00 00 04 39");
        TENN = emvCardScheme19;
        EmvCardScheme emvCardScheme20 = new EmvCardScheme("RUPAY", 19, null, "A0 00 00 05 24 10 10");
        RUPAY = emvCardScheme20;
        EmvCardScheme emvCardScheme21 = new EmvCardScheme("ПРО100", 20, null, "A0 00 00 04 32 00 01");
        f19100 = emvCardScheme21;
        EmvCardScheme emvCardScheme22 = new EmvCardScheme("ZKA", 21, null, "D2 76 00 00 25 45 50 01 00");
        ZKA = emvCardScheme22;
        EmvCardScheme emvCardScheme23 = new EmvCardScheme("BANKAXEPT", 22, null, "D5 78 00 00 02 10 10");
        BANKAXEPT = emvCardScheme23;
        EmvCardScheme emvCardScheme24 = new EmvCardScheme("BRADESCO", 23, null, "F0 00 00 00 03 00 01");
        BRADESCO = emvCardScheme24;
        EmvCardScheme emvCardScheme25 = new EmvCardScheme("MIDLAND", 24, null, "A0 00 00 00 24 01");
        MIDLAND = emvCardScheme25;
        EmvCardScheme emvCardScheme26 = new EmvCardScheme("PBS", 25, null, "A0 00 00 01 21 10 10");
        PBS = emvCardScheme26;
        EmvCardScheme emvCardScheme27 = new EmvCardScheme("ETRANZACT", 26, null, "A0 00 00 04 54");
        ETRANZACT = emvCardScheme27;
        EmvCardScheme emvCardScheme28 = new EmvCardScheme("GOOGLE", 27, null, "A0 00 00 04 76 6C");
        GOOGLE = emvCardScheme28;
        EmvCardScheme emvCardScheme29 = new EmvCardScheme("INTER_SWITCH", 28, null, "A0 00 00 03 71 00 01");
        INTER_SWITCH = emvCardScheme29;
        EmvCardScheme emvCardScheme30 = new EmvCardScheme("MIR", 29, null, "A0 00 00 06 58 20 10", "A0 00 00 06 58 10 10", "A0 00 00 06 58 10 11");
        MIR = emvCardScheme30;
        EmvCardScheme emvCardScheme31 = new EmvCardScheme("PROSTIR", 30, null, "D8 04 00 00 01 30 10");
        PROSTIR = emvCardScheme31;
        EmvCardScheme[] emvCardSchemeArr = {emvCardScheme, emvCardScheme2, emvCardScheme3, emvCardScheme4, emvCardScheme5, emvCardScheme6, emvCardScheme7, emvCardScheme8, emvCardScheme9, emvCardScheme10, emvCardScheme11, emvCardScheme12, emvCardScheme13, emvCardScheme14, emvCardScheme15, emvCardScheme16, emvCardScheme17, emvCardScheme18, emvCardScheme19, emvCardScheme20, emvCardScheme21, emvCardScheme22, emvCardScheme23, emvCardScheme24, emvCardScheme25, emvCardScheme26, emvCardScheme27, emvCardScheme28, emvCardScheme29, emvCardScheme30, emvCardScheme31};
        $VALUES = emvCardSchemeArr;
        $ENTRIES = a.a(emvCardSchemeArr);
        Companion = new qxn();
    }

    public EmvCardScheme(String str, int i, String str2, String... strArr) {
        String[] strArr2 = (String[]) Arrays.asList(strArr).toArray(new String[0]);
        this.aid = strArr2;
        this.aidByte = new byte[strArr.length][];
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.aidByte[i2] = cdb1.d(strArr[i2]);
        }
        this.pattern = (str2 == null || str2.length() <= 0) ? null : Pattern.compile(str2);
    }

    public static EmvCardScheme valueOf(String str) {
        return (EmvCardScheme) Enum.valueOf(EmvCardScheme.class, str);
    }

    public static EmvCardScheme[] values() {
        return (EmvCardScheme[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final byte[][] getAidByte() {
        return this.aidByte;
    }
}
