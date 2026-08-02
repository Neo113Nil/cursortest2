package yads;

import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class xm3 {
    public static final Map a = pn00.k(new Pair(tc3.c, "No ad view"), new Pair(tc3.d, "No valid ads in ad unit"), new Pair(tc3.e, "Ad is not visible for percent"), new Pair(tc3.f, "Required asset %s is not visible in ad view"), new Pair(tc3.g, "Ad view is null"), new Pair(tc3.h, "Ad view is hidden"), new Pair(tc3.i, "Visible area of an ad view is too small"));

    public static String a(xc3 xc3Var) {
        if (!(xc3Var instanceof uc3)) {
            return "Unknown error, that shouldn't happen";
        }
        uc3 uc3Var = (uc3) xc3Var;
        String str = uc3Var.b;
        String str2 = (String) a.get(uc3Var.a);
        return str2 != null ? String.format(str2, Arrays.copyOf(new Object[]{str}, 1)) : "Visibility error";
    }
}
