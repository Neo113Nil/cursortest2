package yads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class az0 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final void a(ut1 ut1Var) {
        int i = 0;
        while (true) {
            tt1[] tt1VarArr = ut1Var.b;
            if (i >= tt1VarArr.length) {
                return;
            }
            tt1 tt1Var = tt1VarArr[i];
            if (tt1Var instanceof px) {
                px pxVar = (px) tt1Var;
                if ("iTunSMPB".equals(pxVar.d) && a(pxVar.e)) {
                    return;
                }
            } else if (tt1Var instanceof cd1) {
                cd1 cd1Var = (cd1) tt1Var;
                if ("com.apple.iTunes".equals(cd1Var.c) && "iTunSMPB".equals(cd1Var.d) && a(cd1Var.e)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = mc3.a;
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
