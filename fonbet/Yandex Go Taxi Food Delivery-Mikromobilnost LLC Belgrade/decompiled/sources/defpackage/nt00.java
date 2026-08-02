package defpackage;

import java.util.HashMap;

/* loaded from: classes11.dex */
public class nt00 {
    public static void a(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            x4e.C(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                x4e.C(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
