package defpackage;

import com.google.android.datatransport.Priority;
import defpackage.v111;

/* loaded from: classes.dex */
public final class a94 extends v111.a {
    public String a;
    public byte[] b;
    public Priority c;

    public final b94 a() {
        String str = this.a == null ? " backendName" : "";
        if (this.c == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new b94(this.a, this.b, this.c);
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }

    public final a94 b(Priority priority) {
        if (priority != null) {
            this.c = priority;
            return this;
        }
        ny61.t("Null priority");
        return null;
    }
}
