package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class pst {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public final qst a() {
        if (this.a == null) {
            ny61.g("wrappedSdkName must not be empty");
            return null;
        }
        if (this.b == null) {
            ny61.g("sanitizedNamePrefix must not be empty");
            return null;
        }
        if (this.c == null) {
            this.c = "unnamed_event";
        }
        if (this.d == null) {
            this.d = "unnamed_param";
        }
        if (this.e == null) {
            this.e = "unnamed_user_property";
        }
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        return new qst(this.a, this.b, this.c, this.d);
    }
}
