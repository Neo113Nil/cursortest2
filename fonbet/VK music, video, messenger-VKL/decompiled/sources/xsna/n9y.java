package xsna;

import xsna.j8y;

/* compiled from: Json.kt */
/* loaded from: classes8.dex */
public final class n9y {
    public static m9y a(izs izsVar) {
        j8y.a aVar = j8y.d;
        o8y o8yVar = new o8y();
        q8y q8yVar = aVar.a;
        o8yVar.a = q8yVar.a;
        o8yVar.b = q8yVar.f;
        o8yVar.c = q8yVar.b;
        o8yVar.d = q8yVar.c;
        o8yVar.e = q8yVar.e;
        String str = q8yVar.g;
        o8yVar.f = str;
        o8yVar.g = q8yVar.h;
        o8yVar.h = q8yVar.i;
        o8yVar.i = q8yVar.k;
        o8yVar.j = q8yVar.j;
        o8yVar.k = q8yVar.d;
        o8yVar.l = aVar.b;
        izsVar.invoke(o8yVar);
        if (o8yVar.e) {
            if (!epx.f(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!epx.f(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z = o8yVar.a;
        boolean z2 = o8yVar.c;
        boolean z3 = o8yVar.d;
        boolean z4 = o8yVar.k;
        boolean z5 = o8yVar.e;
        boolean z6 = o8yVar.b;
        String str2 = o8yVar.f;
        boolean z7 = o8yVar.g;
        String str3 = o8yVar.h;
        q8y q8yVar2 = new q8y(z, z2, z3, z4, z5, z6, str2, z7, str3, o8yVar.j, o8yVar.i);
        de deVar = o8yVar.l;
        m9y m9yVar = new m9y(q8yVar2, deVar);
        if (epx.f(deVar, ini0.a)) {
            return m9yVar;
        }
        deVar.U(new uub0(str3));
        return m9yVar;
    }
}
