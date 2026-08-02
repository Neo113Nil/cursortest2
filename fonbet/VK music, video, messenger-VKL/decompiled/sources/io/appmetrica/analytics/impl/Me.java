package io.appmetrica.analytics.impl;

import kotlin.text.Regex;
import xsna.erm0;
import xsna.up;

/* loaded from: classes8.dex */
public final class Me implements InterfaceC5259w2 {
    public final int a = 10;
    public final int b = 13;
    public final Regex c = new Regex("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC5259w2
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        Character y0 = erm0.y0(str);
        Character y02 = erm0.y0(sb2);
        if (length2 < this.a || length2 > this.b || ((y02 != null && y02.charValue() == '0') || !this.c.f(str))) {
            return null;
        }
        if (length2 == 10 && (y0 == null || y0.charValue() != '+')) {
            return com.ironsource.Gc.e.concat(sb2);
        }
        if (length2 == 11) {
            if (y0 != null && y0.charValue() == '+' && y02 != null && y02.charValue() == '8') {
                return null;
            }
            if (y02 != null && y02.charValue() == '8') {
                return up.b(1, sb2, new StringBuilder(com.ironsource.Gc.e));
            }
        }
        if (length2 < 12 || y0 == null || y0.charValue() != '+' || y02 == null || y02.charValue() != '7') {
            return sb2;
        }
        return null;
    }
}
