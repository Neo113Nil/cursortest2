package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class jts {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = tw21.a;
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

    public final void b(w820 w820Var) {
        int i = 0;
        while (true) {
            s820[] s820VarArr = w820Var.a;
            if (i >= s820VarArr.length) {
                return;
            }
            s820 s820Var = s820VarArr[i];
            if (s820Var instanceof gmc) {
                gmc gmcVar = (gmc) s820Var;
                if ("iTunSMPB".equals(gmcVar.c) && a(gmcVar.w)) {
                    return;
                }
            } else if (s820Var instanceof vrw) {
                vrw vrwVar = (vrw) s820Var;
                if ("com.apple.iTunes".equals(vrwVar.b) && "iTunSMPB".equals(vrwVar.c) && a(vrwVar.w)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
