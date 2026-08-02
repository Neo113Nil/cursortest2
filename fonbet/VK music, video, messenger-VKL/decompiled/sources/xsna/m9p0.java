package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes.dex */
public final class m9p0 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public m9p0(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !d.matcher(substring).matches()) {
            throw new IllegalArgumentException(zr.a("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = substring;
        this.b = str;
        this.c = pzl.b(str, "!", str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof m9p0)) {
            return false;
        }
        m9p0 m9p0Var = (m9p0) obj;
        return this.a.equals(m9p0Var.a) && this.b.equals(m9p0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
