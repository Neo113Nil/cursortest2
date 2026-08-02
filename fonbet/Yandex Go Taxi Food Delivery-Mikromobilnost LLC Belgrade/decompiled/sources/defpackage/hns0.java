package defpackage;

import defpackage.rf90;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class hns0 extends rf90.a {
    public final ArrayList a = new ArrayList();

    public static void a(hns0 hns0Var, String str, String str2, Throwable th) {
        hns0Var.a.add(new lyg(str, str2, null, th));
    }

    public static void b(hns0 hns0Var, String str, String str2, String str3, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        hns0Var.a.add(new lyg(str, str2, str3, null));
    }
}
