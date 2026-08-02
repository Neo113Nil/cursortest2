package com.yandex.div.core.util.mask;

import com.ironsource.X3;
import com.vk.dto.common.ImageSizeKey;
import com.yandex.div.core.util.mask.BaseInputMask;
import io.jsonwebtoken.JwtParser;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.e43;
import xsna.erm0;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CurrencyInputMask.kt */
/* loaded from: classes7.dex */
public final class CurrencyInputMask extends BaseInputMask {
    private NumberFormat currencyFormatter;
    private final char currencyKey;
    private final izs<Exception, s3q0> onError;
    private final List<Character> separators;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInputMask(Locale locale, izs<? super Exception, s3q0> izsVar) {
        super(new BaseInputMask.MaskData("", EmptyList.b, false));
        this.onError = izsVar;
        this.currencyKey = (char) 164;
        this.separators = e43.l(Character.valueOf(JwtParser.SEPARATOR_CHAR), ',');
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
    }

    private final NumberFormat clearFormatter(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            StringBuilder sb = new StringBuilder();
            int length = pattern.length();
            for (int i = 0; i < length; i++) {
                char charAt = pattern.charAt(i);
                if (charAt != this.currencyKey) {
                    sb.append(charAt);
                }
            }
            decimalFormat.applyPattern(drm0.p0(sb.toString()).toString());
        }
        return numberFormat;
    }

    private final String formatPattern(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append('#');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private final DecimalFormatSymbols getDecimalFormatSymbols() {
        return ((DecimalFormat) this.currencyFormatter).getDecimalFormatSymbols();
    }

    private final String getWithNbsp(String str) {
        return str.replace(' ', (char) 160);
    }

    private final boolean inDiff(TextDiff textDiff, int i) {
        if (textDiff.getStart() <= i) {
            return i < textDiff.getAdded() + textDiff.getStart();
        }
        return false;
    }

    private final void invalidateMaskDataForFormatted(Number number) {
        updateMaskData(new BaseInputMask.MaskData(formatPattern(this.currencyFormatter.format(number)), e43.l(new BaseInputMask.MaskKey('#', "\\d", ImageSizeKey.SIZE_KEY_UNDEFINED), new BaseInputMask.MaskKey(getDecimalFormatSymbols().getDecimalSeparator(), X3.j.d + getDecimalFormatSymbols().getDecimalSeparator() + ']', getDecimalFormatSymbols().getDecimalSeparator())), getMaskData().getAlwaysVisible()), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123 A[EDGE_INSN: B:85:0x0123->B:76:0x0123 BREAK  A[LOOP:3: B:70:0x010e->B:73:0x0120], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String toValidFormat(String str, TextDiff textDiff) {
        int i;
        int i2;
        int i3;
        int length;
        int length2;
        int i4;
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= str.length()) {
                i5 = -1;
                break;
            }
            if (str.charAt(i5) == decimalSeparator && !inDiff(textDiff, i5)) {
                break;
            }
            i5++;
        }
        if (textDiff.getAdded() == 1 && textDiff.getRemoved() == 0) {
            if (this.separators.contains(Character.valueOf(str.charAt(textDiff.getStart())))) {
                i2 = textDiff.getStart();
                int maximumFractionDigits = this.currencyFormatter.getMaximumFractionDigits();
                if (i5 == -1) {
                    i3 = maximumFractionDigits;
                    for (int i6 = i5; i6 < str.length(); i6++) {
                        if (Character.isDigit(str.charAt(i6)) && !inDiff(textDiff, i6)) {
                            i3--;
                        }
                    }
                } else {
                    i3 = maximumFractionDigits;
                    int i7 = 0;
                    int i8 = 0;
                    boolean z = false;
                    while (i7 < str.length()) {
                        char charAt = str.charAt(i7);
                        int i9 = i8 + 1;
                        boolean inDiff = inDiff(textDiff, i8);
                        if (charAt == decimalSeparator) {
                            z = true;
                        } else if (!inDiff && z && Character.isDigit(charAt)) {
                            i3--;
                        }
                        i7++;
                        i8 = i9;
                    }
                }
                boolean z2 = (drm0.E(str, decimalSeparator) && i2 == -1) ? false : true;
                StringBuilder sb = new StringBuilder();
                boolean z3 = false;
                for (length = str.length() - 1; length >= 0; length--) {
                    char charAt2 = str.charAt(length);
                    boolean z4 = sb.length() <= maximumFractionDigits;
                    if (Character.isDigit(charAt2)) {
                        if (!inDiff(textDiff, length) || z3 || !z2) {
                            sb.append(charAt2);
                        } else if (i3 > 0) {
                            sb.append(charAt2);
                            i3--;
                        }
                    } else if (z4 && i5 == -1 && length == i2) {
                        sb.append(decimalSeparator);
                        z3 = true;
                    } else if (z4 && charAt2 == decimalSeparator && (i5 == length || i5 == -1)) {
                        sb.append(decimalSeparator);
                        z3 = true;
                        i5 = length;
                    }
                }
                String obj = new StringBuilder((CharSequence) sb.toString()).reverse().toString();
                length2 = obj.length();
                i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    if (obj.charAt(i4) != getDecimalFormatSymbols().getZeroDigit()) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                return i > 0 ? obj : obj.charAt(i) == getDecimalFormatSymbols().getDecimalSeparator() ? erm0.v0(i - 1, obj) : erm0.v0(i, obj);
            }
        }
        i2 = -1;
        int maximumFractionDigits2 = this.currencyFormatter.getMaximumFractionDigits();
        if (i5 == -1) {
        }
        if (drm0.E(str, decimalSeparator)) {
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z32 = false;
        while (length >= 0) {
        }
        String obj2 = new StringBuilder((CharSequence) sb2.toString()).reverse().toString();
        length2 = obj2.length();
        i4 = 0;
        while (true) {
            if (i4 >= length2) {
            }
            i4++;
        }
        if (i > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    @Override // com.yandex.div.core.util.mask.BaseInputMask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyChangeFrom(String str, Integer num) {
        boolean z;
        String validFormat;
        String valueOf;
        Number parse;
        int abs;
        int length;
        TextDiff build = TextDiff.Companion.build(getValue(), getWithNbsp(str));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        String value = getValue();
        int length2 = value.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (value.charAt(length2) == decimalSeparator) {
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length2 = i;
                }
            }
        }
        length2 = -1;
        int length3 = str.length() - 1;
        if (length3 >= 0) {
            while (true) {
                int i2 = length3 - 1;
                if (str.charAt(length3) == decimalSeparator) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length3 = i2;
                }
            }
            z = length2 == length3 || (length2 == -1 && length3 == -1);
            validFormat = toValidFormat(str, build);
            NumberFormat numberFormat = this.currencyFormatter;
            if (drm0.d0(validFormat, decimalSeparator)) {
                valueOf = drm0.N(validFormat) ? String.valueOf(getDecimalFormatSymbols().getZeroDigit()) : validFormat;
            } else {
                valueOf = getDecimalFormatSymbols().getZeroDigit() + validFormat;
            }
            parse = numberFormat.parse(valueOf);
            if (parse == null) {
                parse = 0;
            }
            cleanup(build);
            if (z) {
                invalidateMaskDataForFormatted(parse);
            }
            BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
            if (getValue().length() > build.getStart() || getValue().charAt(build.getStart()) != getDecimalFormatSymbols().getGroupingSeparator()) {
                abs = Math.abs(getValue().length() - (str.length() - (num == null ? num.intValue() : getCursorPosition())));
            } else {
                abs = num != null ? num.intValue() : getCursorPosition();
            }
            length = getValue().length();
            if (abs > length) {
                abs = length;
            }
            setCursorPosition(abs);
        }
        length3 = -1;
        if (length2 == length3) {
        }
        validFormat = toValidFormat(str, build);
        NumberFormat numberFormat2 = this.currencyFormatter;
        if (drm0.d0(validFormat, decimalSeparator)) {
        }
        parse = numberFormat2.parse(valueOf);
        if (parse == null) {
        }
        cleanup(build);
        if (z) {
        }
        BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
        if (getValue().length() > build.getStart()) {
        }
        abs = Math.abs(getValue().length() - (str.length() - (num == null ? num.intValue() : getCursorPosition())));
        length = getValue().length();
        if (abs > length) {
        }
        setCursorPosition(abs);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(Exception exc) {
        this.onError.invoke(exc);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(String str) {
        Number parse = this.currencyFormatter.parse(str);
        if (parse == null) {
            parse = 0;
        }
        invalidateMaskDataForFormatted(parse);
        super.overrideRawValue(str);
    }

    public final void updateCurrencyParams(Locale locale) {
        String replace = getRawValue().replace(getDecimalFormatSymbols().getDecimalSeparator(), JwtParser.SEPARATOR_CHAR);
        this.currencyFormatter = clearFormatter(NumberFormat.getCurrencyInstance(locale));
        BaseInputMask.applyChangeFrom$default(this, replace.replace(JwtParser.SEPARATOR_CHAR, getDecimalFormatSymbols().getDecimalSeparator()), null, 2, null);
    }
}
