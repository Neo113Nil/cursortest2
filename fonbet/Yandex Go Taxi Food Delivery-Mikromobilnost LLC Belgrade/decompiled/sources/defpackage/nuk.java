package defpackage;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivInput$Autocapitalization;
import com.yandex.div2.DivInput$EnterKeyType;
import com.yandex.div2.DivInput$KeyboardType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class nuk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[DivAlignmentHorizontal.values().length];
        try {
            iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[DivInput$KeyboardType.values().length];
        try {
            iArr2[DivInput$KeyboardType.SINGLE_LINE_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DivInput$KeyboardType.MULTI_LINE_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DivInput$KeyboardType.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DivInput$KeyboardType.URI.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DivInput$KeyboardType.NUMBER.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DivInput$KeyboardType.PHONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[DivInput$KeyboardType.PASSWORD.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
        int[] iArr3 = new int[DivInput$EnterKeyType.values().length];
        try {
            iArr3[DivInput$EnterKeyType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[DivInput$EnterKeyType.SEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[DivInput$EnterKeyType.DONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[DivInput$EnterKeyType.SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[DivInput$EnterKeyType.GO.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr3;
        int[] iArr4 = new int[DivInput$Autocapitalization.values().length];
        try {
            iArr4[DivInput$Autocapitalization.SENTENCES.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[DivInput$Autocapitalization.WORDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[DivInput$Autocapitalization.ALL_CHARACTERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        d = iArr4;
    }
}
