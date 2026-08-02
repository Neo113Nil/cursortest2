package xsna;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: DateInput.kt */
/* loaded from: classes11.dex */
public final class kxk {
    public final k9x a;
    public final eai0 b;
    public final bxk c;
    public final nyk d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public Long i;
    public Long j;

    public kxk(k9x k9xVar, eai0 eai0Var, bxk bxkVar, nyk nykVar, String str, String str2, String str3, String str4) {
        this.a = k9xVar;
        this.b = eai0Var;
        this.c = bxkVar;
        this.d = nykVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r2 <= (r6 != null ? r6.longValue() : Long.MAX_VALUE)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(rz8 rz8Var, int i, Locale locale) {
        if (rz8Var == null) {
            Object[] copyOf = Arrays.copyOf(new Object[]{this.c.a.toUpperCase(Locale.ROOT)}, 1);
            return String.format(this.e, Arrays.copyOf(copyOf, copyOf.length));
        }
        int i2 = rz8Var.b;
        long j = rz8Var.e;
        k9x k9xVar = this.a;
        if (!k9xVar.e(i2)) {
            Object[] copyOf2 = Arrays.copyOf(new Object[]{vz8.a(k9xVar.b, locale, 7), vz8.a(k9xVar.c, locale, 7)}, 2);
            return String.format(this.f, Arrays.copyOf(copyOf2, copyOf2.length));
        }
        eai0 eai0Var = this.b;
        eai0Var.getClass();
        if (!eai0Var.a(j)) {
            Object[] copyOf3 = Arrays.copyOf(new Object[]{this.d.b(Long.valueOf(j), locale, false)}, 1);
            return String.format(this.g, Arrays.copyOf(copyOf3, copyOf3.length));
        }
        if (i == 1) {
            Long l = this.j;
        }
        if (i != 2) {
            return "";
        }
        Long l2 = this.i;
        if (j >= (l2 != null ? l2.longValue() : Long.MIN_VALUE)) {
            return "";
        }
        return this.h;
    }
}
