package defpackage;

import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class bj4 implements vi4 {
    public final StringBuilder a;
    public char b;
    public final Formatter c;
    public final Object[] d;

    public bj4() {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        this.d = new Object[1];
        Locale locale = Locale.getDefault();
        this.c = new Formatter(sb, locale);
        this.b = new DecimalFormatSymbols(locale).getZeroDigit();
    }
}
