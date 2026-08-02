package defpackage;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class ce70 {
    public static final s400 e = new s400();
    public final Object a;
    public final yd70 b;
    public final String c;
    public volatile byte[] d;

    public ce70(String str, Object obj, yd70 yd70Var) {
        if (TextUtils.isEmpty(str)) {
            ny61.g("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = obj;
        this.b = yd70Var;
    }

    public static ce70 a(Object obj, String str) {
        return new ce70(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ce70) {
            return this.c.equals(((ce70) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.t(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
