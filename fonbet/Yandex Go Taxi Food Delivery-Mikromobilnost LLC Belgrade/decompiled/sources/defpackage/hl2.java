package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class hl2 {
    public final pho a;

    public hl2(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, Pair... pairArr) {
        HashMap hashMap = new HashMap();
        for (Pair pair : pairArr) {
            String str2 = (String) pair.getFirst();
            Object second = pair.getSecond();
            if (second != null) {
                hashMap.put(str2, second);
            }
        }
        x4e.B(this.a, str, hashMap, 1);
    }
}
