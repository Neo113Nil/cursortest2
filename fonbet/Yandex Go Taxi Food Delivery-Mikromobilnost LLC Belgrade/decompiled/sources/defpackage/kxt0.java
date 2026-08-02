package defpackage;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class kxt0 {
    public static final boolean a;
    public static final jxt0 b;
    public static final jxt0 c;
    public static final List d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new jxt0(0, Date.class);
            c = new jxt0(1, Timestamp.class);
            d = Collections.unmodifiableList(Arrays.asList(gxt0.b, bxt0.b, ixt0.b));
        } else {
            b = null;
            c = null;
            d = Collections.EMPTY_LIST;
        }
    }
}
