package xsna;

import java.util.LinkedHashMap;

/* compiled from: ClipsOwnerSwipeMemoryStorage.kt */
/* loaded from: classes17.dex */
public final class uoe {
    public final LinkedHashMap a = new LinkedHashMap();

    public final gx6<dpe> a(String str) {
        LinkedHashMap linkedHashMap = this.a;
        gx6<dpe> gx6Var = (gx6) linkedHashMap.get(str);
        if (gx6Var != null) {
            return gx6Var;
        }
        gx6<dpe> gx6Var2 = new gx6<>(io.reactivex.rxjava3.subjects.d.N0());
        linkedHashMap.put(str, gx6Var2);
        return gx6Var2;
    }
}
