package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class an20 {
    public static String a(String str) {
        int K = evu0.K(str, '_', 0, 6);
        if (K != -1) {
            String substring = str.substring(K + 1);
            for (int i = 0; i < substring.length(); i++) {
                if (Character.isDigit(substring.charAt(i))) {
                }
            }
            return str.substring(0, K);
        }
        return str;
    }

    public static List b(String str, ol20... ol20VarArr) {
        if (ol20VarArr.length != 0) {
            if (ol20VarArr.length != 1) {
                ArrayList arrayList = new ArrayList(ol20VarArr.length);
                for (ol20 ol20Var : ol20VarArr) {
                    zm20 B = vng.B(vng.b(str, ol20Var));
                    if (B != null) {
                        arrayList.add(B);
                    }
                }
                return arrayList;
            }
            zm20 B2 = vng.B(vng.b(str, ol20VarArr[0]));
            if (B2 != null) {
                return Collections.singletonList(B2);
            }
        }
        return EmptyList.a;
    }
}
