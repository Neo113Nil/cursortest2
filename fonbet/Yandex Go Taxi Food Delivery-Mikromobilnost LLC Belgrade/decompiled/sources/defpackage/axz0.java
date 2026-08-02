package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class axz0 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public axz0(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !d.matcher(substring).matches()) {
            ny61.g(oyr.p("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = substring;
        this.b = str;
        this.c = g8e.p(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axz0)) {
            return false;
        }
        axz0 axz0Var = (axz0) obj;
        return this.a.equals(axz0Var.a) && this.b.equals(axz0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
