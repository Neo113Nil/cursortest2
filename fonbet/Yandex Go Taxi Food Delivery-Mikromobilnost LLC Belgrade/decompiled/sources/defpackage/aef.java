package defpackage;

import com.yandex.div.core.util.mask.a;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public final class aef extends a {
    public final tls e;
    public final char f;
    public final List g;
    public NumberFormat h;

    public aef(Locale locale, tls tlsVar) {
        super(new x25("", EmptyList.a, false));
        this.e = tlsVar;
        this.f = (char) 164;
        this.g = scc.g('.', Character.valueOf(HexString.CHAR_COMMA));
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        o(currencyInstance);
        this.h = currencyInstance;
    }

    public static boolean q(uly0 uly0Var, int i) {
        int i2 = uly0Var.a;
        return i2 <= i && i < i2 + uly0Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182  */
    @Override // com.yandex.div.core.util.mask.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, Integer num) {
        int i;
        boolean z;
        int i2;
        int length;
        int length2;
        int i3;
        int i4;
        Number parse;
        int abs;
        int length3;
        int i5;
        String str2 = str;
        uly0 c = klb1.c(i(), str2.replace(HexString.CHAR_SPACE, (char) 160));
        int i6 = c.a;
        char decimalSeparator = p().getDecimalSeparator();
        String i7 = i();
        int i8 = -1;
        int length4 = i7.length() - 1;
        if (length4 >= 0) {
            while (true) {
                int i9 = length4 - 1;
                if (i7.charAt(length4) == decimalSeparator) {
                    break;
                } else if (i9 < 0) {
                    break;
                } else {
                    length4 = i9;
                }
            }
        }
        length4 = -1;
        int length5 = str2.length() - 1;
        if (length5 >= 0) {
            while (true) {
                int i10 = length5 - 1;
                if (str2.charAt(length5) == decimalSeparator) {
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length5 = i10;
                }
            }
        }
        length5 = -1;
        boolean z2 = length4 != length5 || (length4 == -1 && length5 == -1);
        char decimalSeparator2 = p().getDecimalSeparator();
        int i11 = 0;
        while (true) {
            if (i11 >= str2.length()) {
                i11 = -1;
                break;
            } else if (str2.charAt(i11) == decimalSeparator2 && !q(c, i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (c.b == 1 && c.c == 0) {
            if (this.g.contains(Character.valueOf(str2.charAt(i6)))) {
                i = i6;
                int maximumFractionDigits = this.h.getMaximumFractionDigits();
                if (i11 == -1) {
                    i2 = maximumFractionDigits;
                    for (int i12 = i11; i12 < str2.length(); i12++) {
                        if (Character.isDigit(str2.charAt(i12)) && !q(c, i12)) {
                            i2--;
                        }
                    }
                    z = true;
                } else {
                    z = true;
                    i2 = maximumFractionDigits;
                    int i13 = 0;
                    int i14 = 0;
                    boolean z3 = false;
                    while (i13 < str2.length()) {
                        char charAt = str2.charAt(i13);
                        int i15 = i14 + 1;
                        boolean q = q(c, i14);
                        if (charAt == decimalSeparator2) {
                            z3 = true;
                        } else if (!q && z3 && Character.isDigit(charAt)) {
                            i2--;
                        }
                        i13++;
                        i14 = i15;
                    }
                }
                boolean z4 = (evu0.z(str2, decimalSeparator2) && i == -1) ? false : z;
                StringBuilder sb = new StringBuilder();
                length = str2.length() - 1;
                boolean z5 = false;
                while (length >= 0) {
                    char charAt2 = str2.charAt(length);
                    boolean z6 = sb.length() <= maximumFractionDigits ? z : false;
                    if (Character.isDigit(charAt2)) {
                        if (!q(c, length) || z5 || !z4) {
                            sb.append(charAt2);
                        } else if (i2 > 0) {
                            sb.append(charAt2);
                            i2--;
                        }
                        i5 = -1;
                    } else {
                        i5 = -1;
                        if (z6 && i11 == -1 && length == i) {
                            sb.append(decimalSeparator2);
                        } else if (z6 && charAt2 == decimalSeparator2 && (i11 == length || i11 == -1)) {
                            sb.append(decimalSeparator2);
                            i11 = length;
                        }
                        z5 = z;
                    }
                    length--;
                    i8 = i5;
                    str2 = str;
                }
                int i16 = i8;
                String obj = gvu0.z0(sb.toString()).toString();
                length2 = obj.length();
                i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        i4 = i16;
                        break;
                    } else {
                        if (obj.charAt(i3) != p().getZeroDigit()) {
                            i4 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                if (i4 > 0) {
                    obj = obj.charAt(i4) == p().getDecimalSeparator() ? gvu0.r0(i4 - 1, obj) : gvu0.r0(i4, obj);
                }
                parse = this.h.parse(evu0.a0(obj, decimalSeparator) ? evu0.J(obj) ? String.valueOf(p().getZeroDigit()) : obj : p().getZeroDigit() + obj);
                if (parse == null) {
                    parse = 0;
                }
                c(c);
                if (z2) {
                    r(parse);
                }
                m(0, null, obj);
                abs = (i().length() > i6 || i().charAt(i6) != p().getGroupingSeparator()) ? Math.abs(i().length() - (str.length() - (num == null ? num.intValue() : this.d))) : num != null ? num.intValue() : this.d;
                length3 = i().length();
                if (abs > length3) {
                    abs = length3;
                }
                this.d = abs;
            }
        }
        i = -1;
        int maximumFractionDigits2 = this.h.getMaximumFractionDigits();
        if (i11 == -1) {
        }
        if (evu0.z(str2, decimalSeparator2)) {
        }
        StringBuilder sb2 = new StringBuilder();
        length = str2.length() - 1;
        boolean z52 = false;
        while (length >= 0) {
        }
        int i162 = i8;
        String obj2 = gvu0.z0(sb2.toString()).toString();
        length2 = obj2.length();
        i3 = 0;
        while (true) {
            if (i3 < length2) {
            }
            i3++;
        }
        if (i4 > 0) {
        }
        if (evu0.a0(obj2, decimalSeparator)) {
        }
        parse = this.h.parse(evu0.a0(obj2, decimalSeparator) ? evu0.J(obj2) ? String.valueOf(p().getZeroDigit()) : obj2 : p().getZeroDigit() + obj2);
        if (parse == null) {
        }
        c(c);
        if (z2) {
        }
        m(0, null, obj2);
        if (i().length() > i6) {
        }
        length3 = i().length();
        if (abs > length3) {
        }
        this.d = abs;
    }

    @Override // com.yandex.div.core.util.mask.a
    public final void j(PatternSyntaxException patternSyntaxException) {
        this.e.invoke(patternSyntaxException);
    }

    @Override // com.yandex.div.core.util.mask.a
    public final void k(String str) {
        Number parse = this.h.parse(str);
        if (parse == null) {
            parse = 0;
        }
        r(parse);
        super.k(str);
    }

    public final void o(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            StringBuilder sb = new StringBuilder();
            int length = pattern.length();
            for (int i = 0; i < length; i++) {
                char charAt = pattern.charAt(i);
                if (charAt != this.f) {
                    sb.append(charAt);
                }
            }
            decimalFormat.applyPattern(evu0.k0(sb.toString()).toString());
        }
    }

    public final DecimalFormatSymbols p() {
        return ((DecimalFormat) this.h).getDecimalFormatSymbols();
    }

    public final void r(Number number) {
        String format = this.h.format(number);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < format.length(); i++) {
            char charAt = format.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append('#');
            } else {
                sb.append(charAt);
            }
        }
        n(new x25(sb.toString(), scc.g(new y25('#', "\\d", MoneyInputEditView.DEFAULT_VALUE), new y25(p().getDecimalSeparator(), "[" + p().getDecimalSeparator() + ']', p().getDecimalSeparator())), this.a.c), false);
    }
}
