package defpackage;

import java.util.List;
import java.util.UUID;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class bn21 {
    public static boolean a(String str) {
        List W;
        String str2;
        try {
            UUID.fromString(str);
            W = evu0.W(str, new String[]{"-"}, (r2 & 4) != 0 ? 0 : 2);
            str2 = (String) a.S(2, W);
        } catch (IllegalArgumentException unused) {
        }
        return str2 != null ? cvu0.x(str2, "b", true) : false;
    }
}
