package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yads.bs1;
import yads.bx;
import yads.cs1;
import yads.ua1;

/* loaded from: classes7.dex */
public final class co71 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final void a(cs1 cs1Var) {
        int i = 0;
        while (true) {
            bs1[] bs1VarArr = cs1Var.b;
            if (i >= bs1VarArr.length) {
                return;
            }
            bs1 bs1Var = bs1VarArr[i];
            if (bs1Var instanceof bx) {
                bx bxVar = (bx) bs1Var;
                if ("iTunSMPB".equals(bxVar.d) && b(bxVar.e)) {
                    return;
                }
            } else if (bs1Var instanceof ua1) {
                ua1 ua1Var = (ua1) bs1Var;
                if ("com.apple.iTunes".equals(ua1Var.c) && "iTunSMPB".equals(ua1Var.d) && b(ua1Var.e)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    public final boolean b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = rf71.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
