package androidx.compose.runtime.tooling;

import defpackage.bvu0;
import defpackage.evu0;
import defpackage.unr0;

/* loaded from: classes10.dex */
public final class a {
    public final String a;
    public int b;

    public a(String str) {
        this.a = str;
    }

    public final boolean a() {
        return this.b >= this.a.length();
    }

    public final void b() {
        if (c(')')) {
            return;
        }
        f("expected )");
        throw null;
    }

    public final boolean c(char c) {
        int i = this.b;
        String str = this.a;
        return i < str.length() && str.charAt(this.b) == c;
    }

    public final int d(String str) {
        Integer l = bvu0.l(10, e(str));
        if (l != null) {
            return l.intValue();
        }
        f("expected int");
        throw null;
    }

    public final String e(String str) {
        String str2;
        int i = this.b;
        while (true) {
            int i2 = this.b;
            str2 = this.a;
            if (i2 >= str2.length() || evu0.z(str, str2.charAt(this.b))) {
                break;
            }
            this.b++;
        }
        int i3 = this.b;
        return i3 > i ? str2.substring(i, i3) : "";
    }

    public final void f(String str) {
        int i = this.b;
        String str2 = this.a;
        int min = Math.min(i, str2.length());
        StringBuilder x = unr0.x("Error while parsing source information: ", str, " at ");
        x.append(str2.substring(0, min));
        x.append('|');
        x.append(str2.substring(min));
        throw new ParseException(x.toString());
    }
}
